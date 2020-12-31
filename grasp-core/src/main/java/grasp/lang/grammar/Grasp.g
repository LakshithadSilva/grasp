/**
 * Grasp grammar in ANTLR notation. This contains the BNF-like parser grammar as well
 * as tree rewriting grammar for generating an easy to traverse AST.
 * Note: This grammar is written in ANTLR 3.4 notation.
 *
 * @author		Lakshitha de Silva
 * 
 * @version		1.3, 2013/02/13
 * 
 */


grammar Grasp;

options {
	language = Java;
	backtrack = true;
	output = AST;
	ASTLabelType = CommonTree;
}

tokens {
	//
	// Elements
	//
	ARCHITECTURE;
	REQUIREMENT;
	QATTRIBUTE;
	RATIONALE;
	REASON;
	TEMPLATE;
	PROVIDES;
	REQUIRES;
	PROPERTY;
	CHECK;
	SYSTEM;
	LAYER;
	COMPONENT;
	CONNECTOR;
	LINK;
	ICALLIN;
	ICALLOUT;
	ANNOTATION;
	NAMEDVALUE;
	//
	// Element properties
	//
	NAME;
	BASE;
	BODY;
	PAYLOAD;
	OVER;
	PARMS;
	ARGS;
	BARGS;
	BECAUSE;
	BASIS;
	EXTENDS;
	SUPPORTS;
	INHIBITS;
	HANDLER;
	CONSUMER;
	PROVIDERS;
	IFTYPE;
	MAXDEG;
	//
	// Expressions
	//
	EXPR;
	MEMB;
	FIELD;
	FUNCTION;
	TRUE;
	FALSE;
	TEXT;
	//
	// Operators
	//
	SUBSETOF = 'subsetof';
	ACCEPTS	 = 'accepts';
	DIS = '||';
	CON = '&&';
	IOR = '|';
	XOR = '^';
	AND = '&';
	EQL = '==';
	NEQ = '!=';
	GTN = '>';
	GTE = '>=';
	LTN = '<';
	LTE = '<=';
	AUG = '+=';
	NAG = '-=';
	ADD = '+';
	SUB = '-';
	MUL = '*';
	DIV = '/';
	MOD = '%';
	CMP = '~';
	NOT = '!';
	POS;
	NEG;
	//
	// Types
	//
	SET;
	PAIR;
	INTEGER;
	REAL;
	BOOLEAN;
	STRING;
	DECL;
}

@lexer::header {
	package grasp.lang.grammar;
}

@parser::header {
	package grasp.lang.grammar;
}


//
// Entry point
//
start
	: architecture_statement
	;

//
// <architecture> statement
//
architecture_statement
	: annotation* kw='architecture' name=IDENTIFIER '{' declarational_statement* system_statement declarational_statement* '}'
			-> ^(ARCHITECTURE[$kw] annotation* ^(NAME $name) ^(BODY declarational_statement* system_statement))
	;
declarational_statement
	: requirement_statement
	| qattribute_statement
	| template_statement
	| rationale_statement
	;

//
// <requirement> statement
//
requirement_statement
	: annotation* kw='requirement' name=IDENTIFIER ('=' atom=STRING_LITERAL)? ';'
			-> ^(REQUIREMENT[$kw] annotation* ^(NAME $name) ^(EXPR ^(TEXT[$atom.text]) ^(STRING $atom))? ^(BODY))
	;

//
// <quality_attribute> statement
//
qattribute_statement
	: annotation* kw='quality_attribute' name=IDENTIFIER ('=' expression)? supports_opt? ';'
			-> ^(QATTRIBUTE[$kw] annotation* ^(NAME $name) expression? ^(BODY) supports_opt?)
	;

//
// <rationale> statement
//
rationale_statement
	: annotation* kw='rationale' name=IDENTIFIER '(' parameters? ')' extends_opt? '{' reason_statement* '}'
			-> ^(RATIONALE[$kw] annotation* ^(NAME $name) parameters? ^(BODY reason_statement*) extends_opt?)
	;

//
// <reason> statement
//
reason_statement
	: annotation* kw='reason' (expression | supports_opt) inhibits_opt?  ';'
			-> ^(REASON[$kw] annotation* expression? supports_opt? inhibits_opt? ^(BODY))
	;

//
// <template> statement
//
template_statement
	: annotation* kw='template' name=IDENTIFIER (':' maxinst=INTEGER_LITERAL)? '(' parameters? ')' extends_opt? '{' template_constituent* '}'
			-> ^(TEMPLATE[$kw] annotation* ^(NAME $name) parameters? ^(PAYLOAD ^(BODY template_constituent*)) extends_opt?)
	;
template_constituent
	: template_statement
	| provides_statement
	| requires_statement
	| property_statement
	| check_statement
	;

//
// <provides> statement
//
provides_statement
	: annotation* kw='provides' type=IDENTIFIER (':' maxdeg=INTEGER_LITERAL)? name=IDENTIFIER? because_opt? ('{' provides_constituent* '}' | ';')
			-> ^(PROVIDES[$kw] annotation* ^(IFTYPE $type) ^(NAME $name)? ^(MAXDEG $maxdeg)? ^(BODY provides_constituent*) because_opt?)
	;
provides_constituent
	: check_statement
	;

//
// <requires> statement
//
requires_statement
	: annotation* kw='requires' type=IDENTIFIER name=IDENTIFIER? because_opt? ('{' requires_constituent* '}' | ';')
			-> ^(REQUIRES[$kw] annotation* ^(IFTYPE $type) ^(NAME $name)? ^(BODY requires_constituent*) because_opt?)
	;

requires_constituent
	: check_statement
	;

//
// <property> statement
//
property_statement
	: annotation* kw='property' name=IDENTIFIER ('=' expression)? because_opt? ';'
			-> ^(PROPERTY[$kw] annotation* ^(NAME $name) expression? ^(BODY) because_opt?)
	;

//
// <check> statement
//
check_statement
	: annotation* kw='check' expression because_opt? ';'
			-> ^(CHECK[$kw] annotation* expression ^(BODY) because_opt?)
	;

//
// <system> statement
//
system_statement
	: annotation* kw='system' name=IDENTIFIER because_opt? '{' system_constituent* '}'
			-> ^(SYSTEM[$kw] annotation* ^(NAME $name) ^(BODY system_constituent*) because_opt?)
	;
system_constituent
	: compositional_statement
	| check_statement
	;

//
// Compositional statement
//
compositional_statement
	: layer_statement
	| component_statement
	| connector_statement
	| link_statement
	;

//
// <layer> statement
//
layer_statement
	: annotation* kw='layer' name=IDENTIFIER layer_over_opt? because_opt? '{' layer_constituent* '}'
			-> ^(LAYER[$kw] annotation* ^(NAME $name) ^(BODY layer_constituent*) layer_over_opt? because_opt?)
	;
layer_over_opt
	: kw='over' layers+=IDENTIFIER (',' layers+=IDENTIFIER)*
			-> ^(OVER[$kw] ^(MEMB ^(NAME $layers))+)
	;
layer_constituent
	: compositional_statement
	| check_statement
	;

//
// <component> statement
//
component_statement
	: annotation* kw='component' name=IDENTIFIER '=' base=IDENTIFIER '(' arguments? ')' because_opt? ('{' instantiable_constituent* '}' | ';')
			-> ^(COMPONENT[$kw] annotation* ^(NAME $name) arguments? ^(BASE ^(MEMB ^(NAME $base))) ^(BODY instantiable_constituent*) because_opt?)
	;

//
// <connector> statement
//
connector_statement
	: annotation* kw='connector' name=IDENTIFIER '=' base=IDENTIFIER '(' arguments? ')' because_opt? ('{' instantiable_constituent* '}' | ';')
			-> ^(CONNECTOR[$kw] annotation* ^(NAME $name) arguments? ^(BASE ^(MEMB ^(NAME $base))) ^(BODY instantiable_constituent*) because_opt?)
	;
instantiable_constituent
	: compositional_statement
	| check_statement
	;

//
// <link> statement
//
link_statement
	: annotation* kw='link' name=IDENTIFIER? link_consumer 'to' link_providers because_opt? ('{' link_constituent* '}' | ';')
			-> ^(LINK[$kw] annotation* ^(NAME $name)? ^(CONSUMER link_consumer) ^(PROVIDERS link_providers) ^(BODY link_constituent*) because_opt?)
	;
link_consumer
	: member_expression
	;
link_providers
	: member_expression  (','! member_expression)*
	;
link_constituent
	: check_statement
	;

//
// <@> annotation
//
annotation
	: kw='@' handler=IDENTIFIER? '(' namevalue (',' namevalue)* ')'
			-> ^(ANNOTATION[$kw] ^(HANDLER $handler)? namevalue+)
	;

//
// <supports> option
//
supports_opt
	: kw='supports' suportee+=IDENTIFIER (',' suportee+=IDENTIFIER)*
			-> ^(SUPPORTS[$kw] $suportee+)
	;

//
// <inhibits> option
//
inhibits_opt
	: kw='inhibits' inhibitee+=IDENTIFIER (',' inhibitee+=IDENTIFIER)*
			-> ^(INHIBITS[$kw] $inhibitee+)
	;

//
// <extends> option
//
extends_opt
	: kw='extends' extendee=IDENTIFIER
			-> ^(EXTENDS[$kw] ^(MEMB ^(NAME $extendee)))
	;

//
// <because> option
//
because_opt
	: kw='because' because_rationale (',' because_rationale)*
			-> ^(BECAUSE[$kw] because_rationale)+
	;
because_rationale
	: basis=IDENTIFIER '(' because_arguments? ')'
			-> ^(BASIS ^(MEMB ^(NAME $basis))) because_arguments?
	;
because_arguments
	: args+=member_expression (',' args+=member_expression)*
			-> ^(BARGS $args+)
	;

//
// Formal parameter list
//
parameters
	: parms+=IDENTIFIER (',' parms+=IDENTIFIER)*
			-> ^(PARMS $parms+)
	;

//
// Argument list
//
arguments
	: args+=member_expression (',' args+=member_expression)*
			-> ^(ARGS $args+)
	;

//
// Name-value pair
//
namevalue
	: name=IDENTIFIER '=' expression
			-> ^(NAMEDVALUE ^(NAME $name) expression)
	;

//
// Expressions
//
expression
	: expr=inner_expression
			-> ^(EXPR ^(TEXT[$expr.text]) $expr)
	;
inner_expression
	: subsetof_expression
	;
subsetof_expression
	: logicalOr_expression (SUBSETOF^ logicalOr_expression)*
	;
logicalOr_expression
	: logicalAnd_expression (DIS^ logicalAnd_expression)*
	;
logicalAnd_expression
	: bitwiseOr_expression (CON^ bitwiseOr_expression)*
	;
bitwiseOr_expression
	: bitwiseXor_expression (IOR^ bitwiseXor_expression)*
	;
bitwiseXor_expression
	: bitwiseAnd_expression (XOR^ bitwiseAnd_expression)*
	;
bitwiseAnd_expression
	: equality_expresion (AND^ equality_expresion)*
	;
equality_expresion
	: relational_expresion ((EQL | NEQ)^ relational_expresion)*
	;
relational_expresion
	: additive_expression ((GTN | GTE | LTN | LTE)^ additive_expression)*
	;
//acceptence_expression
//	: augmentation_expression (ACCEPTS^ augmentation_expression)*
//	;
//augmentation_expression
//	: additive_expression ((AUG | NAG)^ additive_expression)*
//	;
additive_expression
	: multiplicative_expression ((ADD | SUB)^ multiplicative_expression)*
	;
multiplicative_expression 
	: unary_expresion ((MUL | DIV | MOD)^ unary_expresion)*
	;
unary_expresion
	: (CMP | NOT)^ unary_expresion
	| '+' expr=unary_expresion					-> ^(POS $expr)
	| '-' expr=unary_expresion					-> ^(NEG $expr)
	| primary_expression
	;
primary_expression
	: '('! inner_expression ')'!
	| member_expression
	| literal
	;
member_expression
	: member_part ('.' member_part)*			-> ^(MEMB member_part+)
	;
member_part
	: name=IDENTIFIER '(' member_args? ')'		-> ^(FUNCTION $name ^(ARGS member_args?))
	| name=IDENTIFIER							-> ^(FIELD $name)
	| kw='out'									-> ^(ICALLOUT[$kw])
	| kw='in'									-> ^(ICALLIN[$kw])
	;
member_args
	: expression (','! expression)*
	;
literal
	: '[' set=literal_set? ']' 					-> ^(SET $set?)
	| atom=INTEGER_LITERAL						-> ^(INTEGER $atom)
	| atom=REAL_LITERAL							-> ^(REAL $atom)
	| atom=BOOLEAN_LITERAL						-> ^(BOOLEAN $atom)
	| atom=STRING_LITERAL						-> ^(STRING $atom)
	;
literal_set
	: literal (','! literal)*
	;

//
// Literals
//
INTEGER_LITERAL
	: DECIMAL_DIGIT+
	| '0' ('x' | 'X') HEX_DIGIT+
	;

REAL_LITERAL
	: DECIMAL_DIGIT* '.' DECIMAL_DIGIT+
	;

BOOLEAN_LITERAL
	: 'true'
	| 'false'
	| '#\'' cs=SINGLE_QUOTE_TEXT '\''		{ setText(cs.getText()); }
	| '#\"' cs=DOUBLE_QUOTE_TEXT '\"'		{ setText(cs.getText()); }
	;

STRING_LITERAL
	: '\'' cs=SINGLE_QUOTE_TEXT '\''		{ setText(cs.getText()); }
	| '\"' cs=DOUBLE_QUOTE_TEXT '\"'		{ setText(cs.getText()); }
	;

fragment
SINGLE_QUOTE_TEXT
	: (~('\'' | '\\' | NEWLINE_CHAR) | ESC_SEQUENCE)*
	;
fragment
DOUBLE_QUOTE_TEXT
	: (~('\"' | '\\' | NEWLINE_CHAR) | ESC_SEQUENCE)*
	;

//
// Identifiers
//
IDENTIFIER
	: (ALPHA_CHAR | '_') (ALPHANUMERIC_CHAR | '_')*
	;

//
// Whitespace & comments
//
WHITESPACE
	: (WHITESPACE_CHAR | NEWLINE_CHAR)+		{ $channel = HIDDEN; }
	;
INLINE_COMMENT
	: '//' (~(NEWLINE_CHAR))*				{ $channel = HIDDEN; }
	;
BLOCK_COMMENT
	: '/*' .* '*/'							{ $channel = HIDDEN; }
	;

//
// Base tokens
//
fragment
ESC_SEQUENCE
	: '\\' ('t'|'b'|'n'|'r'|'f'|'\''|'\"'|'\\')
	| '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
	;
fragment
ALPHANUMERIC_CHAR
	: ALPHA_CHAR | DECIMAL_DIGIT
	;
fragment
ALPHA_CHAR
	: 'a'..'z' | 'A'..'Z'
	;
fragment
DECIMAL_DIGIT
	: '0'..'9'
	;
fragment
HEX_DIGIT
	: '0'..'9' | 'a'..'f' | 'A'..'F'
	;
fragment
NEWLINE_CHAR
	: '\u000A'				// LF
	| '\u000D'				// CR		
	| '\u0085'				// Next line
	| '\u2028'				// Line separator
	| '\u2029'				// Paragraph separator
	;
fragment
WHITESPACE_CHAR
	: '\u0009'				// Tab
	| '\u000B'				// Vertical tab
	| '\u000C'				// Form feed
	| '\u0020'				// Space
	;
