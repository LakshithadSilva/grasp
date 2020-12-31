// $ANTLR 3.5.2 Grasp.g 2015-01-03 18:40:23

	package grasp.lang.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings("all")
public class GraspParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCEPTS", "ADD", "ALPHANUMERIC_CHAR", 
		"ALPHA_CHAR", "AND", "ANNOTATION", "ARCHITECTURE", "ARGS", "AUG", "BARGS", 
		"BASE", "BASIS", "BECAUSE", "BLOCK_COMMENT", "BODY", "BOOLEAN", "BOOLEAN_LITERAL", 
		"CHECK", "CMP", "COMPONENT", "CON", "CONNECTOR", "CONSUMER", "DECIMAL_DIGIT", 
		"DECL", "DIS", "DIV", "DOUBLE_QUOTE_TEXT", "EQL", "ESC_SEQUENCE", "EXPR", 
		"EXTENDS", "FALSE", "FIELD", "FUNCTION", "GTE", "GTN", "HANDLER", "HEX_DIGIT", 
		"ICALLIN", "ICALLOUT", "IDENTIFIER", "IFTYPE", "INHIBITS", "INLINE_COMMENT", 
		"INTEGER", "INTEGER_LITERAL", "IOR", "LAYER", "LINK", "LTE", "LTN", "MAXDEG", 
		"MEMB", "MOD", "MUL", "NAG", "NAME", "NAMEDVALUE", "NEG", "NEQ", "NEWLINE_CHAR", 
		"NOT", "OVER", "PAIR", "PARMS", "PAYLOAD", "POS", "PROPERTY", "PROVIDERS", 
		"PROVIDES", "QATTRIBUTE", "RATIONALE", "REAL", "REAL_LITERAL", "REASON", 
		"REQUIREMENT", "REQUIRES", "SET", "SINGLE_QUOTE_TEXT", "STRING", "STRING_LITERAL", 
		"SUB", "SUBSETOF", "SUPPORTS", "SYSTEM", "TEMPLATE", "TEXT", "TRUE", "WHITESPACE", 
		"WHITESPACE_CHAR", "XOR", "'('", "')'", "','", "'.'", "':'", "';'", "'='", 
		"'@'", "'['", "']'", "'architecture'", "'because'", "'check'", "'component'", 
		"'connector'", "'extends'", "'in'", "'inhibits'", "'layer'", "'link'", 
		"'out'", "'over'", "'property'", "'provides'", "'quality_attribute'", 
		"'rationale'", "'reason'", "'requirement'", "'requires'", "'supports'", 
		"'system'", "'template'", "'to'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int ACCEPTS=4;
	public static final int ADD=5;
	public static final int ALPHANUMERIC_CHAR=6;
	public static final int ALPHA_CHAR=7;
	public static final int AND=8;
	public static final int ANNOTATION=9;
	public static final int ARCHITECTURE=10;
	public static final int ARGS=11;
	public static final int AUG=12;
	public static final int BARGS=13;
	public static final int BASE=14;
	public static final int BASIS=15;
	public static final int BECAUSE=16;
	public static final int BLOCK_COMMENT=17;
	public static final int BODY=18;
	public static final int BOOLEAN=19;
	public static final int BOOLEAN_LITERAL=20;
	public static final int CHECK=21;
	public static final int CMP=22;
	public static final int COMPONENT=23;
	public static final int CON=24;
	public static final int CONNECTOR=25;
	public static final int CONSUMER=26;
	public static final int DECIMAL_DIGIT=27;
	public static final int DECL=28;
	public static final int DIS=29;
	public static final int DIV=30;
	public static final int DOUBLE_QUOTE_TEXT=31;
	public static final int EQL=32;
	public static final int ESC_SEQUENCE=33;
	public static final int EXPR=34;
	public static final int EXTENDS=35;
	public static final int FALSE=36;
	public static final int FIELD=37;
	public static final int FUNCTION=38;
	public static final int GTE=39;
	public static final int GTN=40;
	public static final int HANDLER=41;
	public static final int HEX_DIGIT=42;
	public static final int ICALLIN=43;
	public static final int ICALLOUT=44;
	public static final int IDENTIFIER=45;
	public static final int IFTYPE=46;
	public static final int INHIBITS=47;
	public static final int INLINE_COMMENT=48;
	public static final int INTEGER=49;
	public static final int INTEGER_LITERAL=50;
	public static final int IOR=51;
	public static final int LAYER=52;
	public static final int LINK=53;
	public static final int LTE=54;
	public static final int LTN=55;
	public static final int MAXDEG=56;
	public static final int MEMB=57;
	public static final int MOD=58;
	public static final int MUL=59;
	public static final int NAG=60;
	public static final int NAME=61;
	public static final int NAMEDVALUE=62;
	public static final int NEG=63;
	public static final int NEQ=64;
	public static final int NEWLINE_CHAR=65;
	public static final int NOT=66;
	public static final int OVER=67;
	public static final int PAIR=68;
	public static final int PARMS=69;
	public static final int PAYLOAD=70;
	public static final int POS=71;
	public static final int PROPERTY=72;
	public static final int PROVIDERS=73;
	public static final int PROVIDES=74;
	public static final int QATTRIBUTE=75;
	public static final int RATIONALE=76;
	public static final int REAL=77;
	public static final int REAL_LITERAL=78;
	public static final int REASON=79;
	public static final int REQUIREMENT=80;
	public static final int REQUIRES=81;
	public static final int SET=82;
	public static final int SINGLE_QUOTE_TEXT=83;
	public static final int STRING=84;
	public static final int STRING_LITERAL=85;
	public static final int SUB=86;
	public static final int SUBSETOF=87;
	public static final int SUPPORTS=88;
	public static final int SYSTEM=89;
	public static final int TEMPLATE=90;
	public static final int TEXT=91;
	public static final int TRUE=92;
	public static final int WHITESPACE=93;
	public static final int WHITESPACE_CHAR=94;
	public static final int XOR=95;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GraspParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GraspParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GraspParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Grasp.g"; }


	public static class start_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "start"
	// Grasp.g:127:1: start : architecture_statement ;
	public final GraspParser.start_return start() throws RecognitionException {
		GraspParser.start_return retval = new GraspParser.start_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope architecture_statement1 =null;


		try {
			// Grasp.g:128:2: ( architecture_statement )
			// Grasp.g:128:4: architecture_statement
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_architecture_statement_in_start498);
			architecture_statement1=architecture_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, architecture_statement1.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start"


	public static class architecture_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "architecture_statement"
	// Grasp.g:134:1: architecture_statement : ( annotation )* kw= 'architecture' name= IDENTIFIER '{' ( declarational_statement )* system_statement ( declarational_statement )* '}' -> ^( ARCHITECTURE[$kw] ( annotation )* ^( NAME $name) ^( BODY ( declarational_statement )* system_statement ) ) ;
	public final GraspParser.architecture_statement_return architecture_statement() throws RecognitionException {
		GraspParser.architecture_statement_return retval = new GraspParser.architecture_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token char_literal3=null;
		Token char_literal7=null;
		ParserRuleReturnScope annotation2 =null;
		ParserRuleReturnScope declarational_statement4 =null;
		ParserRuleReturnScope system_statement5 =null;
		ParserRuleReturnScope declarational_statement6 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree char_literal3_tree=null;
		CommonTree char_literal7_tree=null;
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_declarational_statement=new RewriteRuleSubtreeStream(adaptor,"rule declarational_statement");
		RewriteRuleSubtreeStream stream_system_statement=new RewriteRuleSubtreeStream(adaptor,"rule system_statement");

		try {
			// Grasp.g:135:2: ( ( annotation )* kw= 'architecture' name= IDENTIFIER '{' ( declarational_statement )* system_statement ( declarational_statement )* '}' -> ^( ARCHITECTURE[$kw] ( annotation )* ^( NAME $name) ^( BODY ( declarational_statement )* system_statement ) ) )
			// Grasp.g:135:4: ( annotation )* kw= 'architecture' name= IDENTIFIER '{' ( declarational_statement )* system_statement ( declarational_statement )* '}'
			{
			// Grasp.g:135:4: ( annotation )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==103) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Grasp.g:135:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_architecture_statement512);
					annotation2=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation2.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			kw=(Token)match(input,106,FOLLOW_106_in_architecture_statement517); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_106.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_architecture_statement521); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			char_literal3=(Token)match(input,129,FOLLOW_129_in_architecture_statement523); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_129.add(char_literal3);

			// Grasp.g:135:54: ( declarational_statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==103) ) {
					int LA2_1 = input.LA(2);
					if ( (synpred2_Grasp()) ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= 120 && LA2_0 <= 121)||LA2_0==123||LA2_0==127) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Grasp.g:135:54: declarational_statement
					{
					pushFollow(FOLLOW_declarational_statement_in_architecture_statement525);
					declarational_statement4=declarational_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declarational_statement.add(declarational_statement4.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_system_statement_in_architecture_statement528);
			system_statement5=system_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_system_statement.add(system_statement5.getTree());
			// Grasp.g:135:96: ( declarational_statement )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==103||(LA3_0 >= 120 && LA3_0 <= 121)||LA3_0==123||LA3_0==127) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Grasp.g:135:96: declarational_statement
					{
					pushFollow(FOLLOW_declarational_statement_in_architecture_statement530);
					declarational_statement6=declarational_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declarational_statement.add(declarational_statement6.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			char_literal7=(Token)match(input,130,FOLLOW_130_in_architecture_statement533); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_130.add(char_literal7);

			// AST REWRITE
			// elements: annotation, declarational_statement, system_statement, name
			// token labels: name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 136:4: -> ^( ARCHITECTURE[$kw] ( annotation )* ^( NAME $name) ^( BODY ( declarational_statement )* system_statement ) )
			{
				// Grasp.g:136:7: ^( ARCHITECTURE[$kw] ( annotation )* ^( NAME $name) ^( BODY ( declarational_statement )* system_statement ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARCHITECTURE, kw), root_1);
				// Grasp.g:136:27: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:136:39: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:136:53: ^( BODY ( declarational_statement )* system_statement )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				// Grasp.g:136:60: ( declarational_statement )*
				while ( stream_declarational_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_declarational_statement.nextTree());
				}
				stream_declarational_statement.reset();

				adaptor.addChild(root_2, stream_system_statement.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "architecture_statement"


	public static class declarational_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarational_statement"
	// Grasp.g:138:1: declarational_statement : ( requirement_statement | qattribute_statement | template_statement | rationale_statement );
	public final GraspParser.declarational_statement_return declarational_statement() throws RecognitionException {
		GraspParser.declarational_statement_return retval = new GraspParser.declarational_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope requirement_statement8 =null;
		ParserRuleReturnScope qattribute_statement9 =null;
		ParserRuleReturnScope template_statement10 =null;
		ParserRuleReturnScope rationale_statement11 =null;


		try {
			// Grasp.g:139:2: ( requirement_statement | qattribute_statement | template_statement | rationale_statement )
			int alt4=4;
			switch ( input.LA(1) ) {
			case 103:
				{
				int LA4_1 = input.LA(2);
				if ( (synpred4_Grasp()) ) {
					alt4=1;
				}
				else if ( (synpred5_Grasp()) ) {
					alt4=2;
				}
				else if ( (synpred6_Grasp()) ) {
					alt4=3;
				}
				else if ( (true) ) {
					alt4=4;
				}

				}
				break;
			case 123:
				{
				alt4=1;
				}
				break;
			case 120:
				{
				alt4=2;
				}
				break;
			case 127:
				{
				alt4=3;
				}
				break;
			case 121:
				{
				alt4=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Grasp.g:139:4: requirement_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_requirement_statement_in_declarational_statement572);
					requirement_statement8=requirement_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, requirement_statement8.getTree());

					}
					break;
				case 2 :
					// Grasp.g:140:4: qattribute_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qattribute_statement_in_declarational_statement577);
					qattribute_statement9=qattribute_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qattribute_statement9.getTree());

					}
					break;
				case 3 :
					// Grasp.g:141:4: template_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_template_statement_in_declarational_statement582);
					template_statement10=template_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, template_statement10.getTree());

					}
					break;
				case 4 :
					// Grasp.g:142:4: rationale_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rationale_statement_in_declarational_statement587);
					rationale_statement11=rationale_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rationale_statement11.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarational_statement"


	public static class requirement_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "requirement_statement"
	// Grasp.g:148:1: requirement_statement : ( annotation )* kw= 'requirement' name= IDENTIFIER ( '=' atom= STRING_LITERAL )? ';' -> ^( REQUIREMENT[$kw] ( annotation )* ^( NAME $name) ( ^( EXPR ^( TEXT[$atom.text] ) ^( STRING $atom) ) )? ^( BODY ) ) ;
	public final GraspParser.requirement_statement_return requirement_statement() throws RecognitionException {
		GraspParser.requirement_statement_return retval = new GraspParser.requirement_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token atom=null;
		Token char_literal13=null;
		Token char_literal14=null;
		ParserRuleReturnScope annotation12 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree atom_tree=null;
		CommonTree char_literal13_tree=null;
		CommonTree char_literal14_tree=null;
		RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");

		try {
			// Grasp.g:149:2: ( ( annotation )* kw= 'requirement' name= IDENTIFIER ( '=' atom= STRING_LITERAL )? ';' -> ^( REQUIREMENT[$kw] ( annotation )* ^( NAME $name) ( ^( EXPR ^( TEXT[$atom.text] ) ^( STRING $atom) ) )? ^( BODY ) ) )
			// Grasp.g:149:4: ( annotation )* kw= 'requirement' name= IDENTIFIER ( '=' atom= STRING_LITERAL )? ';'
			{
			// Grasp.g:149:4: ( annotation )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==103) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Grasp.g:149:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_requirement_statement601);
					annotation12=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation12.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			kw=(Token)match(input,123,FOLLOW_123_in_requirement_statement606); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_123.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_requirement_statement610); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			// Grasp.g:149:49: ( '=' atom= STRING_LITERAL )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==102) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Grasp.g:149:50: '=' atom= STRING_LITERAL
					{
					char_literal13=(Token)match(input,102,FOLLOW_102_in_requirement_statement613); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_102.add(char_literal13);

					atom=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_requirement_statement617); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING_LITERAL.add(atom);

					}
					break;

			}

			char_literal14=(Token)match(input,101,FOLLOW_101_in_requirement_statement621); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_101.add(char_literal14);

			// AST REWRITE
			// elements: name, atom, annotation
			// token labels: name, atom
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_atom=new RewriteRuleTokenStream(adaptor,"token atom",atom);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 150:4: -> ^( REQUIREMENT[$kw] ( annotation )* ^( NAME $name) ( ^( EXPR ^( TEXT[$atom.text] ) ^( STRING $atom) ) )? ^( BODY ) )
			{
				// Grasp.g:150:7: ^( REQUIREMENT[$kw] ( annotation )* ^( NAME $name) ( ^( EXPR ^( TEXT[$atom.text] ) ^( STRING $atom) ) )? ^( BODY ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REQUIREMENT, kw), root_1);
				// Grasp.g:150:26: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:150:38: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:150:52: ( ^( EXPR ^( TEXT[$atom.text] ) ^( STRING $atom) ) )?
				if ( stream_atom.hasNext() ) {
					// Grasp.g:150:52: ^( EXPR ^( TEXT[$atom.text] ) ^( STRING $atom) )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);
					// Grasp.g:150:59: ^( TEXT[$atom.text] )
					{
					CommonTree root_3 = (CommonTree)adaptor.nil();
					root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEXT, (atom!=null?atom.getText():null)), root_3);
					adaptor.addChild(root_2, root_3);
					}

					// Grasp.g:150:79: ^( STRING $atom)
					{
					CommonTree root_3 = (CommonTree)adaptor.nil();
					root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_3);
					adaptor.addChild(root_3, stream_atom.nextNode());
					adaptor.addChild(root_2, root_3);
					}

					adaptor.addChild(root_1, root_2);
					}

				}
				stream_atom.reset();

				// Grasp.g:150:97: ^( BODY )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "requirement_statement"


	public static class qattribute_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qattribute_statement"
	// Grasp.g:156:1: qattribute_statement : ( annotation )* kw= 'quality_attribute' name= IDENTIFIER ( '=' expression )? ( supports_opt )? ';' -> ^( QATTRIBUTE[$kw] ( annotation )* ^( NAME $name) ( expression )? ^( BODY ) ( supports_opt )? ) ;
	public final GraspParser.qattribute_statement_return qattribute_statement() throws RecognitionException {
		GraspParser.qattribute_statement_return retval = new GraspParser.qattribute_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token char_literal16=null;
		Token char_literal19=null;
		ParserRuleReturnScope annotation15 =null;
		ParserRuleReturnScope expression17 =null;
		ParserRuleReturnScope supports_opt18 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree char_literal16_tree=null;
		CommonTree char_literal19_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_supports_opt=new RewriteRuleSubtreeStream(adaptor,"rule supports_opt");

		try {
			// Grasp.g:157:2: ( ( annotation )* kw= 'quality_attribute' name= IDENTIFIER ( '=' expression )? ( supports_opt )? ';' -> ^( QATTRIBUTE[$kw] ( annotation )* ^( NAME $name) ( expression )? ^( BODY ) ( supports_opt )? ) )
			// Grasp.g:157:4: ( annotation )* kw= 'quality_attribute' name= IDENTIFIER ( '=' expression )? ( supports_opt )? ';'
			{
			// Grasp.g:157:4: ( annotation )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==103) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Grasp.g:157:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_qattribute_statement676);
					annotation15=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation15.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			kw=(Token)match(input,120,FOLLOW_120_in_qattribute_statement681); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_120.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qattribute_statement685); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			// Grasp.g:157:55: ( '=' expression )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==102) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Grasp.g:157:56: '=' expression
					{
					char_literal16=(Token)match(input,102,FOLLOW_102_in_qattribute_statement688); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_102.add(char_literal16);

					pushFollow(FOLLOW_expression_in_qattribute_statement690);
					expression17=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression17.getTree());
					}
					break;

			}

			// Grasp.g:157:73: ( supports_opt )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==125) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Grasp.g:157:73: supports_opt
					{
					pushFollow(FOLLOW_supports_opt_in_qattribute_statement694);
					supports_opt18=supports_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_supports_opt.add(supports_opt18.getTree());
					}
					break;

			}

			char_literal19=(Token)match(input,101,FOLLOW_101_in_qattribute_statement697); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_101.add(char_literal19);

			// AST REWRITE
			// elements: name, annotation, supports_opt, expression
			// token labels: name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 158:4: -> ^( QATTRIBUTE[$kw] ( annotation )* ^( NAME $name) ( expression )? ^( BODY ) ( supports_opt )? )
			{
				// Grasp.g:158:7: ^( QATTRIBUTE[$kw] ( annotation )* ^( NAME $name) ( expression )? ^( BODY ) ( supports_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QATTRIBUTE, kw), root_1);
				// Grasp.g:158:25: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:158:37: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:158:51: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				// Grasp.g:158:63: ^( BODY )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:158:71: ( supports_opt )?
				if ( stream_supports_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_supports_opt.nextTree());
				}
				stream_supports_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qattribute_statement"


	public static class rationale_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rationale_statement"
	// Grasp.g:164:1: rationale_statement : ( annotation )* kw= 'rationale' name= IDENTIFIER '(' ( parameters )? ')' ( extends_opt )? '{' ( reason_statement )* '}' -> ^( RATIONALE[$kw] ( annotation )* ^( NAME $name) ( parameters )? ^( BODY ( reason_statement )* ) ( extends_opt )? ) ;
	public final GraspParser.rationale_statement_return rationale_statement() throws RecognitionException {
		GraspParser.rationale_statement_return retval = new GraspParser.rationale_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token char_literal21=null;
		Token char_literal23=null;
		Token char_literal25=null;
		Token char_literal27=null;
		ParserRuleReturnScope annotation20 =null;
		ParserRuleReturnScope parameters22 =null;
		ParserRuleReturnScope extends_opt24 =null;
		ParserRuleReturnScope reason_statement26 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree char_literal21_tree=null;
		CommonTree char_literal23_tree=null;
		CommonTree char_literal25_tree=null;
		CommonTree char_literal27_tree=null;
		RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_extends_opt=new RewriteRuleSubtreeStream(adaptor,"rule extends_opt");
		RewriteRuleSubtreeStream stream_reason_statement=new RewriteRuleSubtreeStream(adaptor,"rule reason_statement");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");

		try {
			// Grasp.g:165:2: ( ( annotation )* kw= 'rationale' name= IDENTIFIER '(' ( parameters )? ')' ( extends_opt )? '{' ( reason_statement )* '}' -> ^( RATIONALE[$kw] ( annotation )* ^( NAME $name) ( parameters )? ^( BODY ( reason_statement )* ) ( extends_opt )? ) )
			// Grasp.g:165:4: ( annotation )* kw= 'rationale' name= IDENTIFIER '(' ( parameters )? ')' ( extends_opt )? '{' ( reason_statement )* '}'
			{
			// Grasp.g:165:4: ( annotation )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==103) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Grasp.g:165:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_rationale_statement741);
					annotation20=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation20.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			kw=(Token)match(input,121,FOLLOW_121_in_rationale_statement746); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_121.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rationale_statement750); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			char_literal21=(Token)match(input,96,FOLLOW_96_in_rationale_statement752); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(char_literal21);

			// Grasp.g:165:51: ( parameters )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==IDENTIFIER) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Grasp.g:165:51: parameters
					{
					pushFollow(FOLLOW_parameters_in_rationale_statement754);
					parameters22=parameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameters.add(parameters22.getTree());
					}
					break;

			}

			char_literal23=(Token)match(input,97,FOLLOW_97_in_rationale_statement757); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_97.add(char_literal23);

			// Grasp.g:165:67: ( extends_opt )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==111) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Grasp.g:165:67: extends_opt
					{
					pushFollow(FOLLOW_extends_opt_in_rationale_statement759);
					extends_opt24=extends_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_extends_opt.add(extends_opt24.getTree());
					}
					break;

			}

			char_literal25=(Token)match(input,129,FOLLOW_129_in_rationale_statement762); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_129.add(char_literal25);

			// Grasp.g:165:84: ( reason_statement )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==103||LA13_0==122) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Grasp.g:165:84: reason_statement
					{
					pushFollow(FOLLOW_reason_statement_in_rationale_statement764);
					reason_statement26=reason_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_reason_statement.add(reason_statement26.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			char_literal27=(Token)match(input,130,FOLLOW_130_in_rationale_statement767); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_130.add(char_literal27);

			// AST REWRITE
			// elements: reason_statement, annotation, name, parameters, extends_opt
			// token labels: name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 166:4: -> ^( RATIONALE[$kw] ( annotation )* ^( NAME $name) ( parameters )? ^( BODY ( reason_statement )* ) ( extends_opt )? )
			{
				// Grasp.g:166:7: ^( RATIONALE[$kw] ( annotation )* ^( NAME $name) ( parameters )? ^( BODY ( reason_statement )* ) ( extends_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RATIONALE, kw), root_1);
				// Grasp.g:166:24: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:166:36: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:166:50: ( parameters )?
				if ( stream_parameters.hasNext() ) {
					adaptor.addChild(root_1, stream_parameters.nextTree());
				}
				stream_parameters.reset();

				// Grasp.g:166:62: ^( BODY ( reason_statement )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				// Grasp.g:166:69: ( reason_statement )*
				while ( stream_reason_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_reason_statement.nextTree());
				}
				stream_reason_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:166:88: ( extends_opt )?
				if ( stream_extends_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_extends_opt.nextTree());
				}
				stream_extends_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rationale_statement"


	public static class reason_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "reason_statement"
	// Grasp.g:172:1: reason_statement : ( annotation )* kw= 'reason' ( expression | supports_opt ) ( inhibits_opt )? ';' -> ^( REASON[$kw] ( annotation )* ( expression )? ( supports_opt )? ( inhibits_opt )? ^( BODY ) ) ;
	public final GraspParser.reason_statement_return reason_statement() throws RecognitionException {
		GraspParser.reason_statement_return retval = new GraspParser.reason_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token char_literal32=null;
		ParserRuleReturnScope annotation28 =null;
		ParserRuleReturnScope expression29 =null;
		ParserRuleReturnScope supports_opt30 =null;
		ParserRuleReturnScope inhibits_opt31 =null;

		CommonTree kw_tree=null;
		CommonTree char_literal32_tree=null;
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_supports_opt=new RewriteRuleSubtreeStream(adaptor,"rule supports_opt");
		RewriteRuleSubtreeStream stream_inhibits_opt=new RewriteRuleSubtreeStream(adaptor,"rule inhibits_opt");

		try {
			// Grasp.g:173:2: ( ( annotation )* kw= 'reason' ( expression | supports_opt ) ( inhibits_opt )? ';' -> ^( REASON[$kw] ( annotation )* ( expression )? ( supports_opt )? ( inhibits_opt )? ^( BODY ) ) )
			// Grasp.g:173:4: ( annotation )* kw= 'reason' ( expression | supports_opt ) ( inhibits_opt )? ';'
			{
			// Grasp.g:173:4: ( annotation )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==103) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Grasp.g:173:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_reason_statement814);
					annotation28=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation28.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			kw=(Token)match(input,122,FOLLOW_122_in_reason_statement819); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_122.add(kw);

			// Grasp.g:173:28: ( expression | supports_opt )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ADD||LA15_0==BOOLEAN_LITERAL||LA15_0==CMP||LA15_0==IDENTIFIER||LA15_0==INTEGER_LITERAL||LA15_0==NOT||LA15_0==REAL_LITERAL||(LA15_0 >= STRING_LITERAL && LA15_0 <= SUB)||LA15_0==96||LA15_0==104||LA15_0==112||LA15_0==116) ) {
				alt15=1;
			}
			else if ( (LA15_0==125) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// Grasp.g:173:29: expression
					{
					pushFollow(FOLLOW_expression_in_reason_statement822);
					expression29=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression29.getTree());
					}
					break;
				case 2 :
					// Grasp.g:173:42: supports_opt
					{
					pushFollow(FOLLOW_supports_opt_in_reason_statement826);
					supports_opt30=supports_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_supports_opt.add(supports_opt30.getTree());
					}
					break;

			}

			// Grasp.g:173:56: ( inhibits_opt )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==113) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Grasp.g:173:56: inhibits_opt
					{
					pushFollow(FOLLOW_inhibits_opt_in_reason_statement829);
					inhibits_opt31=inhibits_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_inhibits_opt.add(inhibits_opt31.getTree());
					}
					break;

			}

			char_literal32=(Token)match(input,101,FOLLOW_101_in_reason_statement833); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_101.add(char_literal32);

			// AST REWRITE
			// elements: annotation, supports_opt, expression, inhibits_opt
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 174:4: -> ^( REASON[$kw] ( annotation )* ( expression )? ( supports_opt )? ( inhibits_opt )? ^( BODY ) )
			{
				// Grasp.g:174:7: ^( REASON[$kw] ( annotation )* ( expression )? ( supports_opt )? ( inhibits_opt )? ^( BODY ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REASON, kw), root_1);
				// Grasp.g:174:21: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:174:33: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				// Grasp.g:174:45: ( supports_opt )?
				if ( stream_supports_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_supports_opt.nextTree());
				}
				stream_supports_opt.reset();

				// Grasp.g:174:59: ( inhibits_opt )?
				if ( stream_inhibits_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_inhibits_opt.nextTree());
				}
				stream_inhibits_opt.reset();

				// Grasp.g:174:73: ^( BODY )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reason_statement"


	public static class template_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "template_statement"
	// Grasp.g:180:1: template_statement : ( annotation )* kw= 'template' name= IDENTIFIER ( ':' maxinst= INTEGER_LITERAL )? '(' ( parameters )? ')' ( extends_opt )? '{' ( template_constituent )* '}' -> ^( TEMPLATE[$kw] ( annotation )* ^( NAME $name) ( parameters )? ^( PAYLOAD ^( BODY ( template_constituent )* ) ) ( extends_opt )? ) ;
	public final GraspParser.template_statement_return template_statement() throws RecognitionException {
		GraspParser.template_statement_return retval = new GraspParser.template_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token maxinst=null;
		Token char_literal34=null;
		Token char_literal35=null;
		Token char_literal37=null;
		Token char_literal39=null;
		Token char_literal41=null;
		ParserRuleReturnScope annotation33 =null;
		ParserRuleReturnScope parameters36 =null;
		ParserRuleReturnScope extends_opt38 =null;
		ParserRuleReturnScope template_constituent40 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree maxinst_tree=null;
		CommonTree char_literal34_tree=null;
		CommonTree char_literal35_tree=null;
		CommonTree char_literal37_tree=null;
		CommonTree char_literal39_tree=null;
		CommonTree char_literal41_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token INTEGER_LITERAL");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_template_constituent=new RewriteRuleSubtreeStream(adaptor,"rule template_constituent");
		RewriteRuleSubtreeStream stream_extends_opt=new RewriteRuleSubtreeStream(adaptor,"rule extends_opt");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");

		try {
			// Grasp.g:181:2: ( ( annotation )* kw= 'template' name= IDENTIFIER ( ':' maxinst= INTEGER_LITERAL )? '(' ( parameters )? ')' ( extends_opt )? '{' ( template_constituent )* '}' -> ^( TEMPLATE[$kw] ( annotation )* ^( NAME $name) ( parameters )? ^( PAYLOAD ^( BODY ( template_constituent )* ) ) ( extends_opt )? ) )
			// Grasp.g:181:4: ( annotation )* kw= 'template' name= IDENTIFIER ( ':' maxinst= INTEGER_LITERAL )? '(' ( parameters )? ')' ( extends_opt )? '{' ( template_constituent )* '}'
			{
			// Grasp.g:181:4: ( annotation )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==103) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// Grasp.g:181:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_template_statement873);
					annotation33=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation33.getTree());
					}
					break;

				default :
					break loop17;
				}
			}

			kw=(Token)match(input,127,FOLLOW_127_in_template_statement878); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_127.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_template_statement882); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			// Grasp.g:181:46: ( ':' maxinst= INTEGER_LITERAL )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==100) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Grasp.g:181:47: ':' maxinst= INTEGER_LITERAL
					{
					char_literal34=(Token)match(input,100,FOLLOW_100_in_template_statement885); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_100.add(char_literal34);

					maxinst=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_template_statement889); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTEGER_LITERAL.add(maxinst);

					}
					break;

			}

			char_literal35=(Token)match(input,96,FOLLOW_96_in_template_statement893); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(char_literal35);

			// Grasp.g:181:81: ( parameters )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==IDENTIFIER) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Grasp.g:181:81: parameters
					{
					pushFollow(FOLLOW_parameters_in_template_statement895);
					parameters36=parameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameters.add(parameters36.getTree());
					}
					break;

			}

			char_literal37=(Token)match(input,97,FOLLOW_97_in_template_statement898); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_97.add(char_literal37);

			// Grasp.g:181:97: ( extends_opt )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==111) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Grasp.g:181:97: extends_opt
					{
					pushFollow(FOLLOW_extends_opt_in_template_statement900);
					extends_opt38=extends_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_extends_opt.add(extends_opt38.getTree());
					}
					break;

			}

			char_literal39=(Token)match(input,129,FOLLOW_129_in_template_statement903); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_129.add(char_literal39);

			// Grasp.g:181:114: ( template_constituent )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==103||LA21_0==108||(LA21_0 >= 118 && LA21_0 <= 119)||LA21_0==124||LA21_0==127) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Grasp.g:181:114: template_constituent
					{
					pushFollow(FOLLOW_template_constituent_in_template_statement905);
					template_constituent40=template_constituent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_template_constituent.add(template_constituent40.getTree());
					}
					break;

				default :
					break loop21;
				}
			}

			char_literal41=(Token)match(input,130,FOLLOW_130_in_template_statement908); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_130.add(char_literal41);

			// AST REWRITE
			// elements: extends_opt, template_constituent, name, parameters, annotation
			// token labels: name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 182:4: -> ^( TEMPLATE[$kw] ( annotation )* ^( NAME $name) ( parameters )? ^( PAYLOAD ^( BODY ( template_constituent )* ) ) ( extends_opt )? )
			{
				// Grasp.g:182:7: ^( TEMPLATE[$kw] ( annotation )* ^( NAME $name) ( parameters )? ^( PAYLOAD ^( BODY ( template_constituent )* ) ) ( extends_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, kw), root_1);
				// Grasp.g:182:23: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:182:35: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:182:49: ( parameters )?
				if ( stream_parameters.hasNext() ) {
					adaptor.addChild(root_1, stream_parameters.nextTree());
				}
				stream_parameters.reset();

				// Grasp.g:182:61: ^( PAYLOAD ^( BODY ( template_constituent )* ) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAYLOAD, "PAYLOAD"), root_2);
				// Grasp.g:182:71: ^( BODY ( template_constituent )* )
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_3);
				// Grasp.g:182:78: ( template_constituent )*
				while ( stream_template_constituent.hasNext() ) {
					adaptor.addChild(root_3, stream_template_constituent.nextTree());
				}
				stream_template_constituent.reset();

				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:182:102: ( extends_opt )?
				if ( stream_extends_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_extends_opt.nextTree());
				}
				stream_extends_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "template_statement"


	public static class template_constituent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "template_constituent"
	// Grasp.g:184:1: template_constituent : ( template_statement | provides_statement | requires_statement | property_statement | check_statement );
	public final GraspParser.template_constituent_return template_constituent() throws RecognitionException {
		GraspParser.template_constituent_return retval = new GraspParser.template_constituent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope template_statement42 =null;
		ParserRuleReturnScope provides_statement43 =null;
		ParserRuleReturnScope requires_statement44 =null;
		ParserRuleReturnScope property_statement45 =null;
		ParserRuleReturnScope check_statement46 =null;


		try {
			// Grasp.g:185:2: ( template_statement | provides_statement | requires_statement | property_statement | check_statement )
			int alt22=5;
			switch ( input.LA(1) ) {
			case 103:
				{
				int LA22_1 = input.LA(2);
				if ( (synpred24_Grasp()) ) {
					alt22=1;
				}
				else if ( (synpred25_Grasp()) ) {
					alt22=2;
				}
				else if ( (synpred26_Grasp()) ) {
					alt22=3;
				}
				else if ( (synpred27_Grasp()) ) {
					alt22=4;
				}
				else if ( (true) ) {
					alt22=5;
				}

				}
				break;
			case 127:
				{
				alt22=1;
				}
				break;
			case 119:
				{
				alt22=2;
				}
				break;
			case 124:
				{
				alt22=3;
				}
				break;
			case 118:
				{
				alt22=4;
				}
				break;
			case 108:
				{
				alt22=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// Grasp.g:185:4: template_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_template_statement_in_template_constituent955);
					template_statement42=template_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, template_statement42.getTree());

					}
					break;
				case 2 :
					// Grasp.g:186:4: provides_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_provides_statement_in_template_constituent960);
					provides_statement43=provides_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, provides_statement43.getTree());

					}
					break;
				case 3 :
					// Grasp.g:187:4: requires_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_requires_statement_in_template_constituent965);
					requires_statement44=requires_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, requires_statement44.getTree());

					}
					break;
				case 4 :
					// Grasp.g:188:4: property_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_property_statement_in_template_constituent970);
					property_statement45=property_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, property_statement45.getTree());

					}
					break;
				case 5 :
					// Grasp.g:189:4: check_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_check_statement_in_template_constituent975);
					check_statement46=check_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, check_statement46.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "template_constituent"


	public static class provides_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "provides_statement"
	// Grasp.g:195:1: provides_statement : ( annotation )* kw= 'provides' type= IDENTIFIER ( ':' maxdeg= INTEGER_LITERAL )? (name= IDENTIFIER )? ( because_opt )? ( '{' ( provides_constituent )* '}' | ';' ) -> ^( PROVIDES[$kw] ( annotation )* ^( IFTYPE $type) ( ^( NAME $name) )? ( ^( MAXDEG $maxdeg) )? ^( BODY ( provides_constituent )* ) ( because_opt )? ) ;
	public final GraspParser.provides_statement_return provides_statement() throws RecognitionException {
		GraspParser.provides_statement_return retval = new GraspParser.provides_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token type=null;
		Token maxdeg=null;
		Token name=null;
		Token char_literal48=null;
		Token char_literal50=null;
		Token char_literal52=null;
		Token char_literal53=null;
		ParserRuleReturnScope annotation47 =null;
		ParserRuleReturnScope because_opt49 =null;
		ParserRuleReturnScope provides_constituent51 =null;

		CommonTree kw_tree=null;
		CommonTree type_tree=null;
		CommonTree maxdeg_tree=null;
		CommonTree name_tree=null;
		CommonTree char_literal48_tree=null;
		CommonTree char_literal50_tree=null;
		CommonTree char_literal52_tree=null;
		CommonTree char_literal53_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
		RewriteRuleTokenStream stream_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token INTEGER_LITERAL");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_provides_constituent=new RewriteRuleSubtreeStream(adaptor,"rule provides_constituent");
		RewriteRuleSubtreeStream stream_because_opt=new RewriteRuleSubtreeStream(adaptor,"rule because_opt");

		try {
			// Grasp.g:196:2: ( ( annotation )* kw= 'provides' type= IDENTIFIER ( ':' maxdeg= INTEGER_LITERAL )? (name= IDENTIFIER )? ( because_opt )? ( '{' ( provides_constituent )* '}' | ';' ) -> ^( PROVIDES[$kw] ( annotation )* ^( IFTYPE $type) ( ^( NAME $name) )? ( ^( MAXDEG $maxdeg) )? ^( BODY ( provides_constituent )* ) ( because_opt )? ) )
			// Grasp.g:196:4: ( annotation )* kw= 'provides' type= IDENTIFIER ( ':' maxdeg= INTEGER_LITERAL )? (name= IDENTIFIER )? ( because_opt )? ( '{' ( provides_constituent )* '}' | ';' )
			{
			// Grasp.g:196:4: ( annotation )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==103) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// Grasp.g:196:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_provides_statement989);
					annotation47=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation47.getTree());
					}
					break;

				default :
					break loop23;
				}
			}

			kw=(Token)match(input,119,FOLLOW_119_in_provides_statement994); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_119.add(kw);

			type=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_provides_statement998); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(type);

			// Grasp.g:196:46: ( ':' maxdeg= INTEGER_LITERAL )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==100) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Grasp.g:196:47: ':' maxdeg= INTEGER_LITERAL
					{
					char_literal48=(Token)match(input,100,FOLLOW_100_in_provides_statement1001); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_100.add(char_literal48);

					maxdeg=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_provides_statement1005); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTEGER_LITERAL.add(maxdeg);

					}
					break;

			}

			// Grasp.g:196:80: (name= IDENTIFIER )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==IDENTIFIER) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Grasp.g:196:80: name= IDENTIFIER
					{
					name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_provides_statement1011); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

					}
					break;

			}

			// Grasp.g:196:93: ( because_opt )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==107) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Grasp.g:196:93: because_opt
					{
					pushFollow(FOLLOW_because_opt_in_provides_statement1014);
					because_opt49=because_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_opt.add(because_opt49.getTree());
					}
					break;

			}

			// Grasp.g:196:106: ( '{' ( provides_constituent )* '}' | ';' )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==129) ) {
				alt28=1;
			}
			else if ( (LA28_0==101) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// Grasp.g:196:107: '{' ( provides_constituent )* '}'
					{
					char_literal50=(Token)match(input,129,FOLLOW_129_in_provides_statement1018); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_129.add(char_literal50);

					// Grasp.g:196:111: ( provides_constituent )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==103||LA27_0==108) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// Grasp.g:196:111: provides_constituent
							{
							pushFollow(FOLLOW_provides_constituent_in_provides_statement1020);
							provides_constituent51=provides_constituent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_provides_constituent.add(provides_constituent51.getTree());
							}
							break;

						default :
							break loop27;
						}
					}

					char_literal52=(Token)match(input,130,FOLLOW_130_in_provides_statement1023); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_130.add(char_literal52);

					}
					break;
				case 2 :
					// Grasp.g:196:139: ';'
					{
					char_literal53=(Token)match(input,101,FOLLOW_101_in_provides_statement1027); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_101.add(char_literal53);

					}
					break;

			}

			// AST REWRITE
			// elements: name, maxdeg, provides_constituent, annotation, type, because_opt
			// token labels: name, type, maxdeg
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
			RewriteRuleTokenStream stream_maxdeg=new RewriteRuleTokenStream(adaptor,"token maxdeg",maxdeg);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 197:4: -> ^( PROVIDES[$kw] ( annotation )* ^( IFTYPE $type) ( ^( NAME $name) )? ( ^( MAXDEG $maxdeg) )? ^( BODY ( provides_constituent )* ) ( because_opt )? )
			{
				// Grasp.g:197:7: ^( PROVIDES[$kw] ( annotation )* ^( IFTYPE $type) ( ^( NAME $name) )? ( ^( MAXDEG $maxdeg) )? ^( BODY ( provides_constituent )* ) ( because_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROVIDES, kw), root_1);
				// Grasp.g:197:23: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:197:35: ^( IFTYPE $type)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFTYPE, "IFTYPE"), root_2);
				adaptor.addChild(root_2, stream_type.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:197:51: ( ^( NAME $name) )?
				if ( stream_name.hasNext() ) {
					// Grasp.g:197:51: ^( NAME $name)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
					adaptor.addChild(root_2, stream_name.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_name.reset();

				// Grasp.g:197:66: ( ^( MAXDEG $maxdeg) )?
				if ( stream_maxdeg.hasNext() ) {
					// Grasp.g:197:66: ^( MAXDEG $maxdeg)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAXDEG, "MAXDEG"), root_2);
					adaptor.addChild(root_2, stream_maxdeg.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_maxdeg.reset();

				// Grasp.g:197:85: ^( BODY ( provides_constituent )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				// Grasp.g:197:92: ( provides_constituent )*
				while ( stream_provides_constituent.hasNext() ) {
					adaptor.addChild(root_2, stream_provides_constituent.nextTree());
				}
				stream_provides_constituent.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:197:115: ( because_opt )?
				if ( stream_because_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_because_opt.nextTree());
				}
				stream_because_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "provides_statement"


	public static class provides_constituent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "provides_constituent"
	// Grasp.g:199:1: provides_constituent : check_statement ;
	public final GraspParser.provides_constituent_return provides_constituent() throws RecognitionException {
		GraspParser.provides_constituent_return retval = new GraspParser.provides_constituent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope check_statement54 =null;


		try {
			// Grasp.g:200:2: ( check_statement )
			// Grasp.g:200:4: check_statement
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_check_statement_in_provides_constituent1084);
			check_statement54=check_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, check_statement54.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "provides_constituent"


	public static class requires_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "requires_statement"
	// Grasp.g:206:1: requires_statement : ( annotation )* kw= 'requires' type= IDENTIFIER (name= IDENTIFIER )? ( because_opt )? ( '{' ( requires_constituent )* '}' | ';' ) -> ^( REQUIRES[$kw] ( annotation )* ^( IFTYPE $type) ( ^( NAME $name) )? ^( BODY ( requires_constituent )* ) ( because_opt )? ) ;
	public final GraspParser.requires_statement_return requires_statement() throws RecognitionException {
		GraspParser.requires_statement_return retval = new GraspParser.requires_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token type=null;
		Token name=null;
		Token char_literal57=null;
		Token char_literal59=null;
		Token char_literal60=null;
		ParserRuleReturnScope annotation55 =null;
		ParserRuleReturnScope because_opt56 =null;
		ParserRuleReturnScope requires_constituent58 =null;

		CommonTree kw_tree=null;
		CommonTree type_tree=null;
		CommonTree name_tree=null;
		CommonTree char_literal57_tree=null;
		CommonTree char_literal59_tree=null;
		CommonTree char_literal60_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_requires_constituent=new RewriteRuleSubtreeStream(adaptor,"rule requires_constituent");
		RewriteRuleSubtreeStream stream_because_opt=new RewriteRuleSubtreeStream(adaptor,"rule because_opt");

		try {
			// Grasp.g:207:2: ( ( annotation )* kw= 'requires' type= IDENTIFIER (name= IDENTIFIER )? ( because_opt )? ( '{' ( requires_constituent )* '}' | ';' ) -> ^( REQUIRES[$kw] ( annotation )* ^( IFTYPE $type) ( ^( NAME $name) )? ^( BODY ( requires_constituent )* ) ( because_opt )? ) )
			// Grasp.g:207:4: ( annotation )* kw= 'requires' type= IDENTIFIER (name= IDENTIFIER )? ( because_opt )? ( '{' ( requires_constituent )* '}' | ';' )
			{
			// Grasp.g:207:4: ( annotation )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==103) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// Grasp.g:207:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_requires_statement1098);
					annotation55=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation55.getTree());
					}
					break;

				default :
					break loop29;
				}
			}

			kw=(Token)match(input,124,FOLLOW_124_in_requires_statement1103); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_124.add(kw);

			type=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_requires_statement1107); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(type);

			// Grasp.g:207:50: (name= IDENTIFIER )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==IDENTIFIER) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// Grasp.g:207:50: name= IDENTIFIER
					{
					name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_requires_statement1111); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

					}
					break;

			}

			// Grasp.g:207:63: ( because_opt )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==107) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Grasp.g:207:63: because_opt
					{
					pushFollow(FOLLOW_because_opt_in_requires_statement1114);
					because_opt56=because_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_opt.add(because_opt56.getTree());
					}
					break;

			}

			// Grasp.g:207:76: ( '{' ( requires_constituent )* '}' | ';' )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==129) ) {
				alt33=1;
			}
			else if ( (LA33_0==101) ) {
				alt33=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// Grasp.g:207:77: '{' ( requires_constituent )* '}'
					{
					char_literal57=(Token)match(input,129,FOLLOW_129_in_requires_statement1118); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_129.add(char_literal57);

					// Grasp.g:207:81: ( requires_constituent )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==103||LA32_0==108) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// Grasp.g:207:81: requires_constituent
							{
							pushFollow(FOLLOW_requires_constituent_in_requires_statement1120);
							requires_constituent58=requires_constituent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_requires_constituent.add(requires_constituent58.getTree());
							}
							break;

						default :
							break loop32;
						}
					}

					char_literal59=(Token)match(input,130,FOLLOW_130_in_requires_statement1123); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_130.add(char_literal59);

					}
					break;
				case 2 :
					// Grasp.g:207:109: ';'
					{
					char_literal60=(Token)match(input,101,FOLLOW_101_in_requires_statement1127); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_101.add(char_literal60);

					}
					break;

			}

			// AST REWRITE
			// elements: requires_constituent, annotation, name, because_opt, type
			// token labels: name, type
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 208:4: -> ^( REQUIRES[$kw] ( annotation )* ^( IFTYPE $type) ( ^( NAME $name) )? ^( BODY ( requires_constituent )* ) ( because_opt )? )
			{
				// Grasp.g:208:7: ^( REQUIRES[$kw] ( annotation )* ^( IFTYPE $type) ( ^( NAME $name) )? ^( BODY ( requires_constituent )* ) ( because_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REQUIRES, kw), root_1);
				// Grasp.g:208:23: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:208:35: ^( IFTYPE $type)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFTYPE, "IFTYPE"), root_2);
				adaptor.addChild(root_2, stream_type.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:208:51: ( ^( NAME $name) )?
				if ( stream_name.hasNext() ) {
					// Grasp.g:208:51: ^( NAME $name)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
					adaptor.addChild(root_2, stream_name.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_name.reset();

				// Grasp.g:208:66: ^( BODY ( requires_constituent )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				// Grasp.g:208:73: ( requires_constituent )*
				while ( stream_requires_constituent.hasNext() ) {
					adaptor.addChild(root_2, stream_requires_constituent.nextTree());
				}
				stream_requires_constituent.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:208:96: ( because_opt )?
				if ( stream_because_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_because_opt.nextTree());
				}
				stream_because_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "requires_statement"


	public static class requires_constituent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "requires_constituent"
	// Grasp.g:211:1: requires_constituent : check_statement ;
	public final GraspParser.requires_constituent_return requires_constituent() throws RecognitionException {
		GraspParser.requires_constituent_return retval = new GraspParser.requires_constituent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope check_statement61 =null;


		try {
			// Grasp.g:212:2: ( check_statement )
			// Grasp.g:212:4: check_statement
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_check_statement_in_requires_constituent1177);
			check_statement61=check_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, check_statement61.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "requires_constituent"


	public static class property_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "property_statement"
	// Grasp.g:218:1: property_statement : ( annotation )* kw= 'property' name= IDENTIFIER ( '=' expression )? ( because_opt )? ';' -> ^( PROPERTY[$kw] ( annotation )* ^( NAME $name) ( expression )? ^( BODY ) ( because_opt )? ) ;
	public final GraspParser.property_statement_return property_statement() throws RecognitionException {
		GraspParser.property_statement_return retval = new GraspParser.property_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token char_literal63=null;
		Token char_literal66=null;
		ParserRuleReturnScope annotation62 =null;
		ParserRuleReturnScope expression64 =null;
		ParserRuleReturnScope because_opt65 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree char_literal63_tree=null;
		CommonTree char_literal66_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_because_opt=new RewriteRuleSubtreeStream(adaptor,"rule because_opt");

		try {
			// Grasp.g:219:2: ( ( annotation )* kw= 'property' name= IDENTIFIER ( '=' expression )? ( because_opt )? ';' -> ^( PROPERTY[$kw] ( annotation )* ^( NAME $name) ( expression )? ^( BODY ) ( because_opt )? ) )
			// Grasp.g:219:4: ( annotation )* kw= 'property' name= IDENTIFIER ( '=' expression )? ( because_opt )? ';'
			{
			// Grasp.g:219:4: ( annotation )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==103) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// Grasp.g:219:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_property_statement1191);
					annotation62=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation62.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			kw=(Token)match(input,118,FOLLOW_118_in_property_statement1196); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_118.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_property_statement1200); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			// Grasp.g:219:46: ( '=' expression )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==102) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// Grasp.g:219:47: '=' expression
					{
					char_literal63=(Token)match(input,102,FOLLOW_102_in_property_statement1203); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_102.add(char_literal63);

					pushFollow(FOLLOW_expression_in_property_statement1205);
					expression64=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression64.getTree());
					}
					break;

			}

			// Grasp.g:219:64: ( because_opt )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==107) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Grasp.g:219:64: because_opt
					{
					pushFollow(FOLLOW_because_opt_in_property_statement1209);
					because_opt65=because_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_opt.add(because_opt65.getTree());
					}
					break;

			}

			char_literal66=(Token)match(input,101,FOLLOW_101_in_property_statement1212); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_101.add(char_literal66);

			// AST REWRITE
			// elements: because_opt, expression, annotation, name
			// token labels: name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 220:4: -> ^( PROPERTY[$kw] ( annotation )* ^( NAME $name) ( expression )? ^( BODY ) ( because_opt )? )
			{
				// Grasp.g:220:7: ^( PROPERTY[$kw] ( annotation )* ^( NAME $name) ( expression )? ^( BODY ) ( because_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROPERTY, kw), root_1);
				// Grasp.g:220:23: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:220:35: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:220:49: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				// Grasp.g:220:61: ^( BODY )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:220:69: ( because_opt )?
				if ( stream_because_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_because_opt.nextTree());
				}
				stream_because_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "property_statement"


	public static class check_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "check_statement"
	// Grasp.g:226:1: check_statement : ( annotation )* kw= 'check' expression ( because_opt )? ';' -> ^( CHECK[$kw] ( annotation )* expression ^( BODY ) ( because_opt )? ) ;
	public final GraspParser.check_statement_return check_statement() throws RecognitionException {
		GraspParser.check_statement_return retval = new GraspParser.check_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token char_literal70=null;
		ParserRuleReturnScope annotation67 =null;
		ParserRuleReturnScope expression68 =null;
		ParserRuleReturnScope because_opt69 =null;

		CommonTree kw_tree=null;
		CommonTree char_literal70_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_because_opt=new RewriteRuleSubtreeStream(adaptor,"rule because_opt");

		try {
			// Grasp.g:227:2: ( ( annotation )* kw= 'check' expression ( because_opt )? ';' -> ^( CHECK[$kw] ( annotation )* expression ^( BODY ) ( because_opt )? ) )
			// Grasp.g:227:4: ( annotation )* kw= 'check' expression ( because_opt )? ';'
			{
			// Grasp.g:227:4: ( annotation )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==103) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// Grasp.g:227:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_check_statement1256);
					annotation67=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation67.getTree());
					}
					break;

				default :
					break loop37;
				}
			}

			kw=(Token)match(input,108,FOLLOW_108_in_check_statement1261); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_108.add(kw);

			pushFollow(FOLLOW_expression_in_check_statement1263);
			expression68=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression68.getTree());
			// Grasp.g:227:38: ( because_opt )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==107) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// Grasp.g:227:38: because_opt
					{
					pushFollow(FOLLOW_because_opt_in_check_statement1265);
					because_opt69=because_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_opt.add(because_opt69.getTree());
					}
					break;

			}

			char_literal70=(Token)match(input,101,FOLLOW_101_in_check_statement1268); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_101.add(char_literal70);

			// AST REWRITE
			// elements: annotation, because_opt, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 228:4: -> ^( CHECK[$kw] ( annotation )* expression ^( BODY ) ( because_opt )? )
			{
				// Grasp.g:228:7: ^( CHECK[$kw] ( annotation )* expression ^( BODY ) ( because_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHECK, kw), root_1);
				// Grasp.g:228:20: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				adaptor.addChild(root_1, stream_expression.nextTree());
				// Grasp.g:228:43: ^( BODY )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:228:51: ( because_opt )?
				if ( stream_because_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_because_opt.nextTree());
				}
				stream_because_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "check_statement"


	public static class system_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "system_statement"
	// Grasp.g:234:1: system_statement : ( annotation )* kw= 'system' name= IDENTIFIER ( because_opt )? '{' ( system_constituent )* '}' -> ^( SYSTEM[$kw] ( annotation )* ^( NAME $name) ^( BODY ( system_constituent )* ) ( because_opt )? ) ;
	public final GraspParser.system_statement_return system_statement() throws RecognitionException {
		GraspParser.system_statement_return retval = new GraspParser.system_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token char_literal73=null;
		Token char_literal75=null;
		ParserRuleReturnScope annotation71 =null;
		ParserRuleReturnScope because_opt72 =null;
		ParserRuleReturnScope system_constituent74 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree char_literal73_tree=null;
		CommonTree char_literal75_tree=null;
		RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_system_constituent=new RewriteRuleSubtreeStream(adaptor,"rule system_constituent");
		RewriteRuleSubtreeStream stream_because_opt=new RewriteRuleSubtreeStream(adaptor,"rule because_opt");

		try {
			// Grasp.g:235:2: ( ( annotation )* kw= 'system' name= IDENTIFIER ( because_opt )? '{' ( system_constituent )* '}' -> ^( SYSTEM[$kw] ( annotation )* ^( NAME $name) ^( BODY ( system_constituent )* ) ( because_opt )? ) )
			// Grasp.g:235:4: ( annotation )* kw= 'system' name= IDENTIFIER ( because_opt )? '{' ( system_constituent )* '}'
			{
			// Grasp.g:235:4: ( annotation )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==103) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// Grasp.g:235:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_system_statement1304);
					annotation71=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation71.getTree());
					}
					break;

				default :
					break loop39;
				}
			}

			kw=(Token)match(input,126,FOLLOW_126_in_system_statement1309); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_126.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_system_statement1313); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			// Grasp.g:235:44: ( because_opt )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==107) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// Grasp.g:235:44: because_opt
					{
					pushFollow(FOLLOW_because_opt_in_system_statement1315);
					because_opt72=because_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_opt.add(because_opt72.getTree());
					}
					break;

			}

			char_literal73=(Token)match(input,129,FOLLOW_129_in_system_statement1318); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_129.add(char_literal73);

			// Grasp.g:235:61: ( system_constituent )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==103||(LA41_0 >= 108 && LA41_0 <= 110)||(LA41_0 >= 114 && LA41_0 <= 115)) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// Grasp.g:235:61: system_constituent
					{
					pushFollow(FOLLOW_system_constituent_in_system_statement1320);
					system_constituent74=system_constituent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_system_constituent.add(system_constituent74.getTree());
					}
					break;

				default :
					break loop41;
				}
			}

			char_literal75=(Token)match(input,130,FOLLOW_130_in_system_statement1323); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_130.add(char_literal75);

			// AST REWRITE
			// elements: system_constituent, name, annotation, because_opt
			// token labels: name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 236:4: -> ^( SYSTEM[$kw] ( annotation )* ^( NAME $name) ^( BODY ( system_constituent )* ) ( because_opt )? )
			{
				// Grasp.g:236:7: ^( SYSTEM[$kw] ( annotation )* ^( NAME $name) ^( BODY ( system_constituent )* ) ( because_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYSTEM, kw), root_1);
				// Grasp.g:236:21: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:236:33: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:236:47: ^( BODY ( system_constituent )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				// Grasp.g:236:54: ( system_constituent )*
				while ( stream_system_constituent.hasNext() ) {
					adaptor.addChild(root_2, stream_system_constituent.nextTree());
				}
				stream_system_constituent.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:236:75: ( because_opt )?
				if ( stream_because_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_because_opt.nextTree());
				}
				stream_because_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "system_statement"


	public static class system_constituent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "system_constituent"
	// Grasp.g:238:1: system_constituent : ( compositional_statement | check_statement );
	public final GraspParser.system_constituent_return system_constituent() throws RecognitionException {
		GraspParser.system_constituent_return retval = new GraspParser.system_constituent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope compositional_statement76 =null;
		ParserRuleReturnScope check_statement77 =null;


		try {
			// Grasp.g:239:2: ( compositional_statement | check_statement )
			int alt42=2;
			switch ( input.LA(1) ) {
			case 103:
				{
				int LA42_1 = input.LA(2);
				if ( (synpred47_Grasp()) ) {
					alt42=1;
				}
				else if ( (true) ) {
					alt42=2;
				}

				}
				break;
			case 109:
			case 110:
			case 114:
			case 115:
				{
				alt42=1;
				}
				break;
			case 108:
				{
				alt42=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// Grasp.g:239:4: compositional_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_compositional_statement_in_system_constituent1363);
					compositional_statement76=compositional_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compositional_statement76.getTree());

					}
					break;
				case 2 :
					// Grasp.g:240:4: check_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_check_statement_in_system_constituent1368);
					check_statement77=check_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, check_statement77.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "system_constituent"


	public static class compositional_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compositional_statement"
	// Grasp.g:246:1: compositional_statement : ( layer_statement | component_statement | connector_statement | link_statement );
	public final GraspParser.compositional_statement_return compositional_statement() throws RecognitionException {
		GraspParser.compositional_statement_return retval = new GraspParser.compositional_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope layer_statement78 =null;
		ParserRuleReturnScope component_statement79 =null;
		ParserRuleReturnScope connector_statement80 =null;
		ParserRuleReturnScope link_statement81 =null;


		try {
			// Grasp.g:247:2: ( layer_statement | component_statement | connector_statement | link_statement )
			int alt43=4;
			switch ( input.LA(1) ) {
			case 103:
				{
				int LA43_1 = input.LA(2);
				if ( (synpred48_Grasp()) ) {
					alt43=1;
				}
				else if ( (synpred49_Grasp()) ) {
					alt43=2;
				}
				else if ( (synpred50_Grasp()) ) {
					alt43=3;
				}
				else if ( (true) ) {
					alt43=4;
				}

				}
				break;
			case 114:
				{
				alt43=1;
				}
				break;
			case 109:
				{
				alt43=2;
				}
				break;
			case 110:
				{
				alt43=3;
				}
				break;
			case 115:
				{
				alt43=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// Grasp.g:247:4: layer_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_layer_statement_in_compositional_statement1382);
					layer_statement78=layer_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, layer_statement78.getTree());

					}
					break;
				case 2 :
					// Grasp.g:248:4: component_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_component_statement_in_compositional_statement1387);
					component_statement79=component_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, component_statement79.getTree());

					}
					break;
				case 3 :
					// Grasp.g:249:4: connector_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_connector_statement_in_compositional_statement1392);
					connector_statement80=connector_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, connector_statement80.getTree());

					}
					break;
				case 4 :
					// Grasp.g:250:4: link_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_link_statement_in_compositional_statement1397);
					link_statement81=link_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, link_statement81.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compositional_statement"


	public static class layer_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "layer_statement"
	// Grasp.g:256:1: layer_statement : ( annotation )* kw= 'layer' name= IDENTIFIER ( layer_over_opt )? ( because_opt )? '{' ( layer_constituent )* '}' -> ^( LAYER[$kw] ( annotation )* ^( NAME $name) ^( BODY ( layer_constituent )* ) ( layer_over_opt )? ( because_opt )? ) ;
	public final GraspParser.layer_statement_return layer_statement() throws RecognitionException {
		GraspParser.layer_statement_return retval = new GraspParser.layer_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token char_literal85=null;
		Token char_literal87=null;
		ParserRuleReturnScope annotation82 =null;
		ParserRuleReturnScope layer_over_opt83 =null;
		ParserRuleReturnScope because_opt84 =null;
		ParserRuleReturnScope layer_constituent86 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree char_literal85_tree=null;
		CommonTree char_literal87_tree=null;
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_layer_over_opt=new RewriteRuleSubtreeStream(adaptor,"rule layer_over_opt");
		RewriteRuleSubtreeStream stream_because_opt=new RewriteRuleSubtreeStream(adaptor,"rule because_opt");
		RewriteRuleSubtreeStream stream_layer_constituent=new RewriteRuleSubtreeStream(adaptor,"rule layer_constituent");

		try {
			// Grasp.g:257:2: ( ( annotation )* kw= 'layer' name= IDENTIFIER ( layer_over_opt )? ( because_opt )? '{' ( layer_constituent )* '}' -> ^( LAYER[$kw] ( annotation )* ^( NAME $name) ^( BODY ( layer_constituent )* ) ( layer_over_opt )? ( because_opt )? ) )
			// Grasp.g:257:4: ( annotation )* kw= 'layer' name= IDENTIFIER ( layer_over_opt )? ( because_opt )? '{' ( layer_constituent )* '}'
			{
			// Grasp.g:257:4: ( annotation )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==103) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// Grasp.g:257:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_layer_statement1411);
					annotation82=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation82.getTree());
					}
					break;

				default :
					break loop44;
				}
			}

			kw=(Token)match(input,114,FOLLOW_114_in_layer_statement1416); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_114.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_layer_statement1420); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			// Grasp.g:257:43: ( layer_over_opt )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==117) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Grasp.g:257:43: layer_over_opt
					{
					pushFollow(FOLLOW_layer_over_opt_in_layer_statement1422);
					layer_over_opt83=layer_over_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_layer_over_opt.add(layer_over_opt83.getTree());
					}
					break;

			}

			// Grasp.g:257:59: ( because_opt )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==107) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Grasp.g:257:59: because_opt
					{
					pushFollow(FOLLOW_because_opt_in_layer_statement1425);
					because_opt84=because_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_opt.add(because_opt84.getTree());
					}
					break;

			}

			char_literal85=(Token)match(input,129,FOLLOW_129_in_layer_statement1428); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_129.add(char_literal85);

			// Grasp.g:257:76: ( layer_constituent )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==103||(LA47_0 >= 108 && LA47_0 <= 110)||(LA47_0 >= 114 && LA47_0 <= 115)) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// Grasp.g:257:76: layer_constituent
					{
					pushFollow(FOLLOW_layer_constituent_in_layer_statement1430);
					layer_constituent86=layer_constituent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_layer_constituent.add(layer_constituent86.getTree());
					}
					break;

				default :
					break loop47;
				}
			}

			char_literal87=(Token)match(input,130,FOLLOW_130_in_layer_statement1433); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_130.add(char_literal87);

			// AST REWRITE
			// elements: layer_constituent, annotation, because_opt, name, layer_over_opt
			// token labels: name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 258:4: -> ^( LAYER[$kw] ( annotation )* ^( NAME $name) ^( BODY ( layer_constituent )* ) ( layer_over_opt )? ( because_opt )? )
			{
				// Grasp.g:258:7: ^( LAYER[$kw] ( annotation )* ^( NAME $name) ^( BODY ( layer_constituent )* ) ( layer_over_opt )? ( because_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LAYER, kw), root_1);
				// Grasp.g:258:20: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:258:32: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:258:46: ^( BODY ( layer_constituent )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				// Grasp.g:258:53: ( layer_constituent )*
				while ( stream_layer_constituent.hasNext() ) {
					adaptor.addChild(root_2, stream_layer_constituent.nextTree());
				}
				stream_layer_constituent.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:258:73: ( layer_over_opt )?
				if ( stream_layer_over_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_layer_over_opt.nextTree());
				}
				stream_layer_over_opt.reset();

				// Grasp.g:258:89: ( because_opt )?
				if ( stream_because_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_because_opt.nextTree());
				}
				stream_because_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "layer_statement"


	public static class layer_over_opt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "layer_over_opt"
	// Grasp.g:260:1: layer_over_opt : kw= 'over' layers+= IDENTIFIER ( ',' layers+= IDENTIFIER )* -> ^( OVER[$kw] ( ^( MEMB ^( NAME $layers) ) )+ ) ;
	public final GraspParser.layer_over_opt_return layer_over_opt() throws RecognitionException {
		GraspParser.layer_over_opt_return retval = new GraspParser.layer_over_opt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token char_literal88=null;
		Token layers=null;
		List<Object> list_layers=null;

		CommonTree kw_tree=null;
		CommonTree char_literal88_tree=null;
		CommonTree layers_tree=null;
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");

		try {
			// Grasp.g:261:2: (kw= 'over' layers+= IDENTIFIER ( ',' layers+= IDENTIFIER )* -> ^( OVER[$kw] ( ^( MEMB ^( NAME $layers) ) )+ ) )
			// Grasp.g:261:4: kw= 'over' layers+= IDENTIFIER ( ',' layers+= IDENTIFIER )*
			{
			kw=(Token)match(input,117,FOLLOW_117_in_layer_over_opt1478); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_117.add(kw);

			layers=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_layer_over_opt1482); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(layers);

			if (list_layers==null) list_layers=new ArrayList<Object>();
			list_layers.add(layers);
			// Grasp.g:261:33: ( ',' layers+= IDENTIFIER )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==98) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// Grasp.g:261:34: ',' layers+= IDENTIFIER
					{
					char_literal88=(Token)match(input,98,FOLLOW_98_in_layer_over_opt1485); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal88);

					layers=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_layer_over_opt1489); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(layers);

					if (list_layers==null) list_layers=new ArrayList<Object>();
					list_layers.add(layers);
					}
					break;

				default :
					break loop48;
				}
			}

			// AST REWRITE
			// elements: layers
			// token labels: 
			// rule labels: retval
			// token list labels: layers
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_layers=new RewriteRuleTokenStream(adaptor,"token layers", list_layers);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 262:4: -> ^( OVER[$kw] ( ^( MEMB ^( NAME $layers) ) )+ )
			{
				// Grasp.g:262:7: ^( OVER[$kw] ( ^( MEMB ^( NAME $layers) ) )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OVER, kw), root_1);
				if ( !(stream_layers.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_layers.hasNext() ) {
					// Grasp.g:262:19: ^( MEMB ^( NAME $layers) )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMB, "MEMB"), root_2);
					// Grasp.g:262:26: ^( NAME $layers)
					{
					CommonTree root_3 = (CommonTree)adaptor.nil();
					root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_3);
					adaptor.addChild(root_3, stream_layers.nextNode());
					adaptor.addChild(root_2, root_3);
					}

					adaptor.addChild(root_1, root_2);
					}

				}
				stream_layers.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "layer_over_opt"


	public static class layer_constituent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "layer_constituent"
	// Grasp.g:264:1: layer_constituent : ( compositional_statement | check_statement );
	public final GraspParser.layer_constituent_return layer_constituent() throws RecognitionException {
		GraspParser.layer_constituent_return retval = new GraspParser.layer_constituent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope compositional_statement89 =null;
		ParserRuleReturnScope check_statement90 =null;


		try {
			// Grasp.g:265:2: ( compositional_statement | check_statement )
			int alt49=2;
			switch ( input.LA(1) ) {
			case 103:
				{
				int LA49_1 = input.LA(2);
				if ( (synpred56_Grasp()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case 109:
			case 110:
			case 114:
			case 115:
				{
				alt49=1;
				}
				break;
			case 108:
				{
				alt49=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// Grasp.g:265:4: compositional_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_compositional_statement_in_layer_constituent1523);
					compositional_statement89=compositional_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compositional_statement89.getTree());

					}
					break;
				case 2 :
					// Grasp.g:266:4: check_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_check_statement_in_layer_constituent1528);
					check_statement90=check_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, check_statement90.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "layer_constituent"


	public static class component_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "component_statement"
	// Grasp.g:272:1: component_statement : ( annotation )* kw= 'component' name= IDENTIFIER '=' base= IDENTIFIER '(' ( arguments )? ')' ( because_opt )? ( '{' ( instantiable_constituent )* '}' | ';' ) -> ^( COMPONENT[$kw] ( annotation )* ^( NAME $name) ( arguments )? ^( BASE ^( MEMB ^( NAME $base) ) ) ^( BODY ( instantiable_constituent )* ) ( because_opt )? ) ;
	public final GraspParser.component_statement_return component_statement() throws RecognitionException {
		GraspParser.component_statement_return retval = new GraspParser.component_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token base=null;
		Token char_literal92=null;
		Token char_literal93=null;
		Token char_literal95=null;
		Token char_literal97=null;
		Token char_literal99=null;
		Token char_literal100=null;
		ParserRuleReturnScope annotation91 =null;
		ParserRuleReturnScope arguments94 =null;
		ParserRuleReturnScope because_opt96 =null;
		ParserRuleReturnScope instantiable_constituent98 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree base_tree=null;
		CommonTree char_literal92_tree=null;
		CommonTree char_literal93_tree=null;
		CommonTree char_literal95_tree=null;
		CommonTree char_literal97_tree=null;
		CommonTree char_literal99_tree=null;
		CommonTree char_literal100_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_because_opt=new RewriteRuleSubtreeStream(adaptor,"rule because_opt");
		RewriteRuleSubtreeStream stream_instantiable_constituent=new RewriteRuleSubtreeStream(adaptor,"rule instantiable_constituent");

		try {
			// Grasp.g:273:2: ( ( annotation )* kw= 'component' name= IDENTIFIER '=' base= IDENTIFIER '(' ( arguments )? ')' ( because_opt )? ( '{' ( instantiable_constituent )* '}' | ';' ) -> ^( COMPONENT[$kw] ( annotation )* ^( NAME $name) ( arguments )? ^( BASE ^( MEMB ^( NAME $base) ) ) ^( BODY ( instantiable_constituent )* ) ( because_opt )? ) )
			// Grasp.g:273:4: ( annotation )* kw= 'component' name= IDENTIFIER '=' base= IDENTIFIER '(' ( arguments )? ')' ( because_opt )? ( '{' ( instantiable_constituent )* '}' | ';' )
			{
			// Grasp.g:273:4: ( annotation )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==103) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// Grasp.g:273:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_component_statement1542);
					annotation91=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation91.getTree());
					}
					break;

				default :
					break loop50;
				}
			}

			kw=(Token)match(input,109,FOLLOW_109_in_component_statement1547); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_109.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_component_statement1551); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			char_literal92=(Token)match(input,102,FOLLOW_102_in_component_statement1553); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_102.add(char_literal92);

			base=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_component_statement1557); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(base);

			char_literal93=(Token)match(input,96,FOLLOW_96_in_component_statement1559); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(char_literal93);

			// Grasp.g:273:71: ( arguments )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==IDENTIFIER||LA51_0==112||LA51_0==116) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Grasp.g:273:71: arguments
					{
					pushFollow(FOLLOW_arguments_in_component_statement1561);
					arguments94=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arguments.add(arguments94.getTree());
					}
					break;

			}

			char_literal95=(Token)match(input,97,FOLLOW_97_in_component_statement1564); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_97.add(char_literal95);

			// Grasp.g:273:86: ( because_opt )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==107) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// Grasp.g:273:86: because_opt
					{
					pushFollow(FOLLOW_because_opt_in_component_statement1566);
					because_opt96=because_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_opt.add(because_opt96.getTree());
					}
					break;

			}

			// Grasp.g:273:99: ( '{' ( instantiable_constituent )* '}' | ';' )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==129) ) {
				alt54=1;
			}
			else if ( (LA54_0==101) ) {
				alt54=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// Grasp.g:273:100: '{' ( instantiable_constituent )* '}'
					{
					char_literal97=(Token)match(input,129,FOLLOW_129_in_component_statement1570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_129.add(char_literal97);

					// Grasp.g:273:104: ( instantiable_constituent )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==103||(LA53_0 >= 108 && LA53_0 <= 110)||(LA53_0 >= 114 && LA53_0 <= 115)) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// Grasp.g:273:104: instantiable_constituent
							{
							pushFollow(FOLLOW_instantiable_constituent_in_component_statement1572);
							instantiable_constituent98=instantiable_constituent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instantiable_constituent.add(instantiable_constituent98.getTree());
							}
							break;

						default :
							break loop53;
						}
					}

					char_literal99=(Token)match(input,130,FOLLOW_130_in_component_statement1575); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_130.add(char_literal99);

					}
					break;
				case 2 :
					// Grasp.g:273:136: ';'
					{
					char_literal100=(Token)match(input,101,FOLLOW_101_in_component_statement1579); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_101.add(char_literal100);

					}
					break;

			}

			// AST REWRITE
			// elements: name, arguments, instantiable_constituent, base, annotation, because_opt
			// token labels: name, base
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_base=new RewriteRuleTokenStream(adaptor,"token base",base);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 274:4: -> ^( COMPONENT[$kw] ( annotation )* ^( NAME $name) ( arguments )? ^( BASE ^( MEMB ^( NAME $base) ) ) ^( BODY ( instantiable_constituent )* ) ( because_opt )? )
			{
				// Grasp.g:274:7: ^( COMPONENT[$kw] ( annotation )* ^( NAME $name) ( arguments )? ^( BASE ^( MEMB ^( NAME $base) ) ) ^( BODY ( instantiable_constituent )* ) ( because_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPONENT, kw), root_1);
				// Grasp.g:274:24: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:274:36: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:274:50: ( arguments )?
				if ( stream_arguments.hasNext() ) {
					adaptor.addChild(root_1, stream_arguments.nextTree());
				}
				stream_arguments.reset();

				// Grasp.g:274:61: ^( BASE ^( MEMB ^( NAME $base) ) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BASE, "BASE"), root_2);
				// Grasp.g:274:68: ^( MEMB ^( NAME $base) )
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMB, "MEMB"), root_3);
				// Grasp.g:274:75: ^( NAME $base)
				{
				CommonTree root_4 = (CommonTree)adaptor.nil();
				root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_4);
				adaptor.addChild(root_4, stream_base.nextNode());
				adaptor.addChild(root_3, root_4);
				}

				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:274:91: ^( BODY ( instantiable_constituent )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				// Grasp.g:274:98: ( instantiable_constituent )*
				while ( stream_instantiable_constituent.hasNext() ) {
					adaptor.addChild(root_2, stream_instantiable_constituent.nextTree());
				}
				stream_instantiable_constituent.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:274:125: ( because_opt )?
				if ( stream_because_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_because_opt.nextTree());
				}
				stream_because_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "component_statement"


	public static class connector_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "connector_statement"
	// Grasp.g:280:1: connector_statement : ( annotation )* kw= 'connector' name= IDENTIFIER '=' base= IDENTIFIER '(' ( arguments )? ')' ( because_opt )? ( '{' ( instantiable_constituent )* '}' | ';' ) -> ^( CONNECTOR[$kw] ( annotation )* ^( NAME $name) ( arguments )? ^( BASE ^( MEMB ^( NAME $base) ) ) ^( BODY ( instantiable_constituent )* ) ( because_opt )? ) ;
	public final GraspParser.connector_statement_return connector_statement() throws RecognitionException {
		GraspParser.connector_statement_return retval = new GraspParser.connector_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token base=null;
		Token char_literal102=null;
		Token char_literal103=null;
		Token char_literal105=null;
		Token char_literal107=null;
		Token char_literal109=null;
		Token char_literal110=null;
		ParserRuleReturnScope annotation101 =null;
		ParserRuleReturnScope arguments104 =null;
		ParserRuleReturnScope because_opt106 =null;
		ParserRuleReturnScope instantiable_constituent108 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree base_tree=null;
		CommonTree char_literal102_tree=null;
		CommonTree char_literal103_tree=null;
		CommonTree char_literal105_tree=null;
		CommonTree char_literal107_tree=null;
		CommonTree char_literal109_tree=null;
		CommonTree char_literal110_tree=null;
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_because_opt=new RewriteRuleSubtreeStream(adaptor,"rule because_opt");
		RewriteRuleSubtreeStream stream_instantiable_constituent=new RewriteRuleSubtreeStream(adaptor,"rule instantiable_constituent");

		try {
			// Grasp.g:281:2: ( ( annotation )* kw= 'connector' name= IDENTIFIER '=' base= IDENTIFIER '(' ( arguments )? ')' ( because_opt )? ( '{' ( instantiable_constituent )* '}' | ';' ) -> ^( CONNECTOR[$kw] ( annotation )* ^( NAME $name) ( arguments )? ^( BASE ^( MEMB ^( NAME $base) ) ) ^( BODY ( instantiable_constituent )* ) ( because_opt )? ) )
			// Grasp.g:281:4: ( annotation )* kw= 'connector' name= IDENTIFIER '=' base= IDENTIFIER '(' ( arguments )? ')' ( because_opt )? ( '{' ( instantiable_constituent )* '}' | ';' )
			{
			// Grasp.g:281:4: ( annotation )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==103) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// Grasp.g:281:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_connector_statement1642);
					annotation101=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation101.getTree());
					}
					break;

				default :
					break loop55;
				}
			}

			kw=(Token)match(input,110,FOLLOW_110_in_connector_statement1647); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_110.add(kw);

			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_connector_statement1651); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			char_literal102=(Token)match(input,102,FOLLOW_102_in_connector_statement1653); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_102.add(char_literal102);

			base=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_connector_statement1657); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(base);

			char_literal103=(Token)match(input,96,FOLLOW_96_in_connector_statement1659); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(char_literal103);

			// Grasp.g:281:71: ( arguments )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==IDENTIFIER||LA56_0==112||LA56_0==116) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Grasp.g:281:71: arguments
					{
					pushFollow(FOLLOW_arguments_in_connector_statement1661);
					arguments104=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arguments.add(arguments104.getTree());
					}
					break;

			}

			char_literal105=(Token)match(input,97,FOLLOW_97_in_connector_statement1664); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_97.add(char_literal105);

			// Grasp.g:281:86: ( because_opt )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==107) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// Grasp.g:281:86: because_opt
					{
					pushFollow(FOLLOW_because_opt_in_connector_statement1666);
					because_opt106=because_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_opt.add(because_opt106.getTree());
					}
					break;

			}

			// Grasp.g:281:99: ( '{' ( instantiable_constituent )* '}' | ';' )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==129) ) {
				alt59=1;
			}
			else if ( (LA59_0==101) ) {
				alt59=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// Grasp.g:281:100: '{' ( instantiable_constituent )* '}'
					{
					char_literal107=(Token)match(input,129,FOLLOW_129_in_connector_statement1670); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_129.add(char_literal107);

					// Grasp.g:281:104: ( instantiable_constituent )*
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==103||(LA58_0 >= 108 && LA58_0 <= 110)||(LA58_0 >= 114 && LA58_0 <= 115)) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// Grasp.g:281:104: instantiable_constituent
							{
							pushFollow(FOLLOW_instantiable_constituent_in_connector_statement1672);
							instantiable_constituent108=instantiable_constituent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instantiable_constituent.add(instantiable_constituent108.getTree());
							}
							break;

						default :
							break loop58;
						}
					}

					char_literal109=(Token)match(input,130,FOLLOW_130_in_connector_statement1675); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_130.add(char_literal109);

					}
					break;
				case 2 :
					// Grasp.g:281:136: ';'
					{
					char_literal110=(Token)match(input,101,FOLLOW_101_in_connector_statement1679); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_101.add(char_literal110);

					}
					break;

			}

			// AST REWRITE
			// elements: annotation, base, name, instantiable_constituent, because_opt, arguments
			// token labels: name, base
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_base=new RewriteRuleTokenStream(adaptor,"token base",base);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 282:4: -> ^( CONNECTOR[$kw] ( annotation )* ^( NAME $name) ( arguments )? ^( BASE ^( MEMB ^( NAME $base) ) ) ^( BODY ( instantiable_constituent )* ) ( because_opt )? )
			{
				// Grasp.g:282:7: ^( CONNECTOR[$kw] ( annotation )* ^( NAME $name) ( arguments )? ^( BASE ^( MEMB ^( NAME $base) ) ) ^( BODY ( instantiable_constituent )* ) ( because_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONNECTOR, kw), root_1);
				// Grasp.g:282:24: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:282:36: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:282:50: ( arguments )?
				if ( stream_arguments.hasNext() ) {
					adaptor.addChild(root_1, stream_arguments.nextTree());
				}
				stream_arguments.reset();

				// Grasp.g:282:61: ^( BASE ^( MEMB ^( NAME $base) ) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BASE, "BASE"), root_2);
				// Grasp.g:282:68: ^( MEMB ^( NAME $base) )
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMB, "MEMB"), root_3);
				// Grasp.g:282:75: ^( NAME $base)
				{
				CommonTree root_4 = (CommonTree)adaptor.nil();
				root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_4);
				adaptor.addChild(root_4, stream_base.nextNode());
				adaptor.addChild(root_3, root_4);
				}

				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:282:91: ^( BODY ( instantiable_constituent )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				// Grasp.g:282:98: ( instantiable_constituent )*
				while ( stream_instantiable_constituent.hasNext() ) {
					adaptor.addChild(root_2, stream_instantiable_constituent.nextTree());
				}
				stream_instantiable_constituent.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:282:125: ( because_opt )?
				if ( stream_because_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_because_opt.nextTree());
				}
				stream_because_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "connector_statement"


	public static class instantiable_constituent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instantiable_constituent"
	// Grasp.g:284:1: instantiable_constituent : ( compositional_statement | check_statement );
	public final GraspParser.instantiable_constituent_return instantiable_constituent() throws RecognitionException {
		GraspParser.instantiable_constituent_return retval = new GraspParser.instantiable_constituent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope compositional_statement111 =null;
		ParserRuleReturnScope check_statement112 =null;


		try {
			// Grasp.g:285:2: ( compositional_statement | check_statement )
			int alt60=2;
			switch ( input.LA(1) ) {
			case 103:
				{
				int LA60_1 = input.LA(2);
				if ( (synpred67_Grasp()) ) {
					alt60=1;
				}
				else if ( (true) ) {
					alt60=2;
				}

				}
				break;
			case 109:
			case 110:
			case 114:
			case 115:
				{
				alt60=1;
				}
				break;
			case 108:
				{
				alt60=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// Grasp.g:285:4: compositional_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_compositional_statement_in_instantiable_constituent1738);
					compositional_statement111=compositional_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compositional_statement111.getTree());

					}
					break;
				case 2 :
					// Grasp.g:286:4: check_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_check_statement_in_instantiable_constituent1743);
					check_statement112=check_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, check_statement112.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instantiable_constituent"


	public static class link_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "link_statement"
	// Grasp.g:292:1: link_statement : ( annotation )* kw= 'link' (name= IDENTIFIER )? link_consumer 'to' link_providers ( because_opt )? ( '{' ( link_constituent )* '}' | ';' ) -> ^( LINK[$kw] ( annotation )* ( ^( NAME $name) )? ^( CONSUMER link_consumer ) ^( PROVIDERS link_providers ) ^( BODY ( link_constituent )* ) ( because_opt )? ) ;
	public final GraspParser.link_statement_return link_statement() throws RecognitionException {
		GraspParser.link_statement_return retval = new GraspParser.link_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token name=null;
		Token string_literal115=null;
		Token char_literal118=null;
		Token char_literal120=null;
		Token char_literal121=null;
		ParserRuleReturnScope annotation113 =null;
		ParserRuleReturnScope link_consumer114 =null;
		ParserRuleReturnScope link_providers116 =null;
		ParserRuleReturnScope because_opt117 =null;
		ParserRuleReturnScope link_constituent119 =null;

		CommonTree kw_tree=null;
		CommonTree name_tree=null;
		CommonTree string_literal115_tree=null;
		CommonTree char_literal118_tree=null;
		CommonTree char_literal120_tree=null;
		CommonTree char_literal121_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_link_consumer=new RewriteRuleSubtreeStream(adaptor,"rule link_consumer");
		RewriteRuleSubtreeStream stream_link_providers=new RewriteRuleSubtreeStream(adaptor,"rule link_providers");
		RewriteRuleSubtreeStream stream_link_constituent=new RewriteRuleSubtreeStream(adaptor,"rule link_constituent");
		RewriteRuleSubtreeStream stream_because_opt=new RewriteRuleSubtreeStream(adaptor,"rule because_opt");

		try {
			// Grasp.g:293:2: ( ( annotation )* kw= 'link' (name= IDENTIFIER )? link_consumer 'to' link_providers ( because_opt )? ( '{' ( link_constituent )* '}' | ';' ) -> ^( LINK[$kw] ( annotation )* ( ^( NAME $name) )? ^( CONSUMER link_consumer ) ^( PROVIDERS link_providers ) ^( BODY ( link_constituent )* ) ( because_opt )? ) )
			// Grasp.g:293:4: ( annotation )* kw= 'link' (name= IDENTIFIER )? link_consumer 'to' link_providers ( because_opt )? ( '{' ( link_constituent )* '}' | ';' )
			{
			// Grasp.g:293:4: ( annotation )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==103) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// Grasp.g:293:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_link_statement1757);
					annotation113=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation113.getTree());
					}
					break;

				default :
					break loop61;
				}
			}

			kw=(Token)match(input,115,FOLLOW_115_in_link_statement1762); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_115.add(kw);

			// Grasp.g:293:30: (name= IDENTIFIER )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==IDENTIFIER) ) {
				int LA62_1 = input.LA(2);
				if ( (LA62_1==IDENTIFIER||LA62_1==112||LA62_1==116) ) {
					alt62=1;
				}
			}
			switch (alt62) {
				case 1 :
					// Grasp.g:293:30: name= IDENTIFIER
					{
					name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_link_statement1766); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

					}
					break;

			}

			pushFollow(FOLLOW_link_consumer_in_link_statement1769);
			link_consumer114=link_consumer();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_link_consumer.add(link_consumer114.getTree());
			string_literal115=(Token)match(input,128,FOLLOW_128_in_link_statement1771); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_128.add(string_literal115);

			pushFollow(FOLLOW_link_providers_in_link_statement1773);
			link_providers116=link_providers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_link_providers.add(link_providers116.getTree());
			// Grasp.g:293:77: ( because_opt )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==107) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// Grasp.g:293:77: because_opt
					{
					pushFollow(FOLLOW_because_opt_in_link_statement1775);
					because_opt117=because_opt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_opt.add(because_opt117.getTree());
					}
					break;

			}

			// Grasp.g:293:90: ( '{' ( link_constituent )* '}' | ';' )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==129) ) {
				alt65=1;
			}
			else if ( (LA65_0==101) ) {
				alt65=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// Grasp.g:293:91: '{' ( link_constituent )* '}'
					{
					char_literal118=(Token)match(input,129,FOLLOW_129_in_link_statement1779); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_129.add(char_literal118);

					// Grasp.g:293:95: ( link_constituent )*
					loop64:
					while (true) {
						int alt64=2;
						int LA64_0 = input.LA(1);
						if ( (LA64_0==103||LA64_0==108) ) {
							alt64=1;
						}

						switch (alt64) {
						case 1 :
							// Grasp.g:293:95: link_constituent
							{
							pushFollow(FOLLOW_link_constituent_in_link_statement1781);
							link_constituent119=link_constituent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_link_constituent.add(link_constituent119.getTree());
							}
							break;

						default :
							break loop64;
						}
					}

					char_literal120=(Token)match(input,130,FOLLOW_130_in_link_statement1784); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_130.add(char_literal120);

					}
					break;
				case 2 :
					// Grasp.g:293:119: ';'
					{
					char_literal121=(Token)match(input,101,FOLLOW_101_in_link_statement1788); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_101.add(char_literal121);

					}
					break;

			}

			// AST REWRITE
			// elements: link_providers, name, annotation, link_consumer, because_opt, link_constituent
			// token labels: name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 294:4: -> ^( LINK[$kw] ( annotation )* ( ^( NAME $name) )? ^( CONSUMER link_consumer ) ^( PROVIDERS link_providers ) ^( BODY ( link_constituent )* ) ( because_opt )? )
			{
				// Grasp.g:294:7: ^( LINK[$kw] ( annotation )* ( ^( NAME $name) )? ^( CONSUMER link_consumer ) ^( PROVIDERS link_providers ) ^( BODY ( link_constituent )* ) ( because_opt )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LINK, kw), root_1);
				// Grasp.g:294:19: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				// Grasp.g:294:31: ( ^( NAME $name) )?
				if ( stream_name.hasNext() ) {
					// Grasp.g:294:31: ^( NAME $name)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
					adaptor.addChild(root_2, stream_name.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_name.reset();

				// Grasp.g:294:46: ^( CONSUMER link_consumer )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSUMER, "CONSUMER"), root_2);
				adaptor.addChild(root_2, stream_link_consumer.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:294:72: ^( PROVIDERS link_providers )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROVIDERS, "PROVIDERS"), root_2);
				adaptor.addChild(root_2, stream_link_providers.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:294:100: ^( BODY ( link_constituent )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);
				// Grasp.g:294:107: ( link_constituent )*
				while ( stream_link_constituent.hasNext() ) {
					adaptor.addChild(root_2, stream_link_constituent.nextTree());
				}
				stream_link_constituent.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Grasp.g:294:126: ( because_opt )?
				if ( stream_because_opt.hasNext() ) {
					adaptor.addChild(root_1, stream_because_opt.nextTree());
				}
				stream_because_opt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "link_statement"


	public static class link_consumer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "link_consumer"
	// Grasp.g:296:1: link_consumer : member_expression ;
	public final GraspParser.link_consumer_return link_consumer() throws RecognitionException {
		GraspParser.link_consumer_return retval = new GraspParser.link_consumer_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope member_expression122 =null;


		try {
			// Grasp.g:297:2: ( member_expression )
			// Grasp.g:297:4: member_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_member_expression_in_link_consumer1842);
			member_expression122=member_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, member_expression122.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "link_consumer"


	public static class link_providers_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "link_providers"
	// Grasp.g:299:1: link_providers : member_expression ( ',' ! member_expression )* ;
	public final GraspParser.link_providers_return link_providers() throws RecognitionException {
		GraspParser.link_providers_return retval = new GraspParser.link_providers_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal124=null;
		ParserRuleReturnScope member_expression123 =null;
		ParserRuleReturnScope member_expression125 =null;

		CommonTree char_literal124_tree=null;

		try {
			// Grasp.g:300:2: ( member_expression ( ',' ! member_expression )* )
			// Grasp.g:300:4: member_expression ( ',' ! member_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_member_expression_in_link_providers1852);
			member_expression123=member_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, member_expression123.getTree());

			// Grasp.g:300:23: ( ',' ! member_expression )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==98) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// Grasp.g:300:24: ',' ! member_expression
					{
					char_literal124=(Token)match(input,98,FOLLOW_98_in_link_providers1856); if (state.failed) return retval;
					pushFollow(FOLLOW_member_expression_in_link_providers1859);
					member_expression125=member_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, member_expression125.getTree());

					}
					break;

				default :
					break loop66;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "link_providers"


	public static class link_constituent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "link_constituent"
	// Grasp.g:302:1: link_constituent : check_statement ;
	public final GraspParser.link_constituent_return link_constituent() throws RecognitionException {
		GraspParser.link_constituent_return retval = new GraspParser.link_constituent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope check_statement126 =null;


		try {
			// Grasp.g:303:2: ( check_statement )
			// Grasp.g:303:4: check_statement
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_check_statement_in_link_constituent1871);
			check_statement126=check_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, check_statement126.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "link_constituent"


	public static class annotation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotation"
	// Grasp.g:309:1: annotation : kw= '@' (handler= IDENTIFIER )? '(' namevalue ( ',' namevalue )* ')' -> ^( ANNOTATION[$kw] ( ^( HANDLER $handler) )? ( namevalue )+ ) ;
	public final GraspParser.annotation_return annotation() throws RecognitionException {
		GraspParser.annotation_return retval = new GraspParser.annotation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token handler=null;
		Token char_literal127=null;
		Token char_literal129=null;
		Token char_literal131=null;
		ParserRuleReturnScope namevalue128 =null;
		ParserRuleReturnScope namevalue130 =null;

		CommonTree kw_tree=null;
		CommonTree handler_tree=null;
		CommonTree char_literal127_tree=null;
		CommonTree char_literal129_tree=null;
		CommonTree char_literal131_tree=null;
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_namevalue=new RewriteRuleSubtreeStream(adaptor,"rule namevalue");

		try {
			// Grasp.g:310:2: (kw= '@' (handler= IDENTIFIER )? '(' namevalue ( ',' namevalue )* ')' -> ^( ANNOTATION[$kw] ( ^( HANDLER $handler) )? ( namevalue )+ ) )
			// Grasp.g:310:4: kw= '@' (handler= IDENTIFIER )? '(' namevalue ( ',' namevalue )* ')'
			{
			kw=(Token)match(input,103,FOLLOW_103_in_annotation1887); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_103.add(kw);

			// Grasp.g:310:18: (handler= IDENTIFIER )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==IDENTIFIER) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// Grasp.g:310:18: handler= IDENTIFIER
					{
					handler=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotation1891); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(handler);

					}
					break;

			}

			char_literal127=(Token)match(input,96,FOLLOW_96_in_annotation1894); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(char_literal127);

			pushFollow(FOLLOW_namevalue_in_annotation1896);
			namevalue128=namevalue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namevalue.add(namevalue128.getTree());
			// Grasp.g:310:45: ( ',' namevalue )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==98) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// Grasp.g:310:46: ',' namevalue
					{
					char_literal129=(Token)match(input,98,FOLLOW_98_in_annotation1899); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal129);

					pushFollow(FOLLOW_namevalue_in_annotation1901);
					namevalue130=namevalue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_namevalue.add(namevalue130.getTree());
					}
					break;

				default :
					break loop68;
				}
			}

			char_literal131=(Token)match(input,97,FOLLOW_97_in_annotation1905); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_97.add(char_literal131);

			// AST REWRITE
			// elements: handler, namevalue
			// token labels: handler
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_handler=new RewriteRuleTokenStream(adaptor,"token handler",handler);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 311:4: -> ^( ANNOTATION[$kw] ( ^( HANDLER $handler) )? ( namevalue )+ )
			{
				// Grasp.g:311:7: ^( ANNOTATION[$kw] ( ^( HANDLER $handler) )? ( namevalue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION, kw), root_1);
				// Grasp.g:311:25: ( ^( HANDLER $handler) )?
				if ( stream_handler.hasNext() ) {
					// Grasp.g:311:25: ^( HANDLER $handler)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HANDLER, "HANDLER"), root_2);
					adaptor.addChild(root_2, stream_handler.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_handler.reset();

				if ( !(stream_namevalue.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_namevalue.hasNext() ) {
					adaptor.addChild(root_1, stream_namevalue.nextTree());
				}
				stream_namevalue.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotation"


	public static class supports_opt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "supports_opt"
	// Grasp.g:317:1: supports_opt : kw= 'supports' suportee+= IDENTIFIER ( ',' suportee+= IDENTIFIER )* -> ^( SUPPORTS[$kw] ( $suportee)+ ) ;
	public final GraspParser.supports_opt_return supports_opt() throws RecognitionException {
		GraspParser.supports_opt_return retval = new GraspParser.supports_opt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token char_literal132=null;
		Token suportee=null;
		List<Object> list_suportee=null;

		CommonTree kw_tree=null;
		CommonTree char_literal132_tree=null;
		CommonTree suportee_tree=null;
		RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");

		try {
			// Grasp.g:318:2: (kw= 'supports' suportee+= IDENTIFIER ( ',' suportee+= IDENTIFIER )* -> ^( SUPPORTS[$kw] ( $suportee)+ ) )
			// Grasp.g:318:4: kw= 'supports' suportee+= IDENTIFIER ( ',' suportee+= IDENTIFIER )*
			{
			kw=(Token)match(input,125,FOLLOW_125_in_supports_opt1942); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_125.add(kw);

			suportee=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_supports_opt1946); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(suportee);

			if (list_suportee==null) list_suportee=new ArrayList<Object>();
			list_suportee.add(suportee);
			// Grasp.g:318:39: ( ',' suportee+= IDENTIFIER )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==98) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// Grasp.g:318:40: ',' suportee+= IDENTIFIER
					{
					char_literal132=(Token)match(input,98,FOLLOW_98_in_supports_opt1949); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal132);

					suportee=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_supports_opt1953); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(suportee);

					if (list_suportee==null) list_suportee=new ArrayList<Object>();
					list_suportee.add(suportee);
					}
					break;

				default :
					break loop69;
				}
			}

			// AST REWRITE
			// elements: suportee
			// token labels: 
			// rule labels: retval
			// token list labels: suportee
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_suportee=new RewriteRuleTokenStream(adaptor,"token suportee", list_suportee);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 319:4: -> ^( SUPPORTS[$kw] ( $suportee)+ )
			{
				// Grasp.g:319:7: ^( SUPPORTS[$kw] ( $suportee)+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPPORTS, kw), root_1);
				if ( !(stream_suportee.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_suportee.hasNext() ) {
					adaptor.addChild(root_1, stream_suportee.nextNode());
				}
				stream_suportee.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "supports_opt"


	public static class inhibits_opt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "inhibits_opt"
	// Grasp.g:325:1: inhibits_opt : kw= 'inhibits' inhibitee+= IDENTIFIER ( ',' inhibitee+= IDENTIFIER )* -> ^( INHIBITS[$kw] ( $inhibitee)+ ) ;
	public final GraspParser.inhibits_opt_return inhibits_opt() throws RecognitionException {
		GraspParser.inhibits_opt_return retval = new GraspParser.inhibits_opt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token char_literal133=null;
		Token inhibitee=null;
		List<Object> list_inhibitee=null;

		CommonTree kw_tree=null;
		CommonTree char_literal133_tree=null;
		CommonTree inhibitee_tree=null;
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");

		try {
			// Grasp.g:326:2: (kw= 'inhibits' inhibitee+= IDENTIFIER ( ',' inhibitee+= IDENTIFIER )* -> ^( INHIBITS[$kw] ( $inhibitee)+ ) )
			// Grasp.g:326:4: kw= 'inhibits' inhibitee+= IDENTIFIER ( ',' inhibitee+= IDENTIFIER )*
			{
			kw=(Token)match(input,113,FOLLOW_113_in_inhibits_opt1985); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(kw);

			inhibitee=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_inhibits_opt1989); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(inhibitee);

			if (list_inhibitee==null) list_inhibitee=new ArrayList<Object>();
			list_inhibitee.add(inhibitee);
			// Grasp.g:326:40: ( ',' inhibitee+= IDENTIFIER )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==98) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// Grasp.g:326:41: ',' inhibitee+= IDENTIFIER
					{
					char_literal133=(Token)match(input,98,FOLLOW_98_in_inhibits_opt1992); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal133);

					inhibitee=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_inhibits_opt1996); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(inhibitee);

					if (list_inhibitee==null) list_inhibitee=new ArrayList<Object>();
					list_inhibitee.add(inhibitee);
					}
					break;

				default :
					break loop70;
				}
			}

			// AST REWRITE
			// elements: inhibitee
			// token labels: 
			// rule labels: retval
			// token list labels: inhibitee
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_inhibitee=new RewriteRuleTokenStream(adaptor,"token inhibitee", list_inhibitee);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 327:4: -> ^( INHIBITS[$kw] ( $inhibitee)+ )
			{
				// Grasp.g:327:7: ^( INHIBITS[$kw] ( $inhibitee)+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INHIBITS, kw), root_1);
				if ( !(stream_inhibitee.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_inhibitee.hasNext() ) {
					adaptor.addChild(root_1, stream_inhibitee.nextNode());
				}
				stream_inhibitee.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inhibits_opt"


	public static class extends_opt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "extends_opt"
	// Grasp.g:333:1: extends_opt : kw= 'extends' extendee= IDENTIFIER -> ^( EXTENDS[$kw] ^( MEMB ^( NAME $extendee) ) ) ;
	public final GraspParser.extends_opt_return extends_opt() throws RecognitionException {
		GraspParser.extends_opt_return retval = new GraspParser.extends_opt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token extendee=null;

		CommonTree kw_tree=null;
		CommonTree extendee_tree=null;
		RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

		try {
			// Grasp.g:334:2: (kw= 'extends' extendee= IDENTIFIER -> ^( EXTENDS[$kw] ^( MEMB ^( NAME $extendee) ) ) )
			// Grasp.g:334:4: kw= 'extends' extendee= IDENTIFIER
			{
			kw=(Token)match(input,111,FOLLOW_111_in_extends_opt2028); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_111.add(kw);

			extendee=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_extends_opt2032); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(extendee);

			// AST REWRITE
			// elements: extendee
			// token labels: extendee
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_extendee=new RewriteRuleTokenStream(adaptor,"token extendee",extendee);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 335:4: -> ^( EXTENDS[$kw] ^( MEMB ^( NAME $extendee) ) )
			{
				// Grasp.g:335:7: ^( EXTENDS[$kw] ^( MEMB ^( NAME $extendee) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENDS, kw), root_1);
				// Grasp.g:335:22: ^( MEMB ^( NAME $extendee) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMB, "MEMB"), root_2);
				// Grasp.g:335:29: ^( NAME $extendee)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_3);
				adaptor.addChild(root_3, stream_extendee.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extends_opt"


	public static class because_opt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "because_opt"
	// Grasp.g:341:1: because_opt : kw= 'because' because_rationale ( ',' because_rationale )* -> ( ^( BECAUSE[$kw] because_rationale ) )+ ;
	public final GraspParser.because_opt_return because_opt() throws RecognitionException {
		GraspParser.because_opt_return retval = new GraspParser.because_opt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token kw=null;
		Token char_literal135=null;
		ParserRuleReturnScope because_rationale134 =null;
		ParserRuleReturnScope because_rationale136 =null;

		CommonTree kw_tree=null;
		CommonTree char_literal135_tree=null;
		RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_because_rationale=new RewriteRuleSubtreeStream(adaptor,"rule because_rationale");

		try {
			// Grasp.g:342:2: (kw= 'because' because_rationale ( ',' because_rationale )* -> ( ^( BECAUSE[$kw] because_rationale ) )+ )
			// Grasp.g:342:4: kw= 'because' because_rationale ( ',' because_rationale )*
			{
			kw=(Token)match(input,107,FOLLOW_107_in_because_opt2069); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_107.add(kw);

			pushFollow(FOLLOW_because_rationale_in_because_opt2071);
			because_rationale134=because_rationale();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_because_rationale.add(because_rationale134.getTree());
			// Grasp.g:342:35: ( ',' because_rationale )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==98) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// Grasp.g:342:36: ',' because_rationale
					{
					char_literal135=(Token)match(input,98,FOLLOW_98_in_because_opt2074); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal135);

					pushFollow(FOLLOW_because_rationale_in_because_opt2076);
					because_rationale136=because_rationale();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_rationale.add(because_rationale136.getTree());
					}
					break;

				default :
					break loop71;
				}
			}

			// AST REWRITE
			// elements: because_rationale
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 343:4: -> ( ^( BECAUSE[$kw] because_rationale ) )+
			{
				if ( !(stream_because_rationale.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_because_rationale.hasNext() ) {
					// Grasp.g:343:7: ^( BECAUSE[$kw] because_rationale )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BECAUSE, kw), root_1);
					adaptor.addChild(root_1, stream_because_rationale.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_because_rationale.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "because_opt"


	public static class because_rationale_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "because_rationale"
	// Grasp.g:345:1: because_rationale : basis= IDENTIFIER '(' ( because_arguments )? ')' -> ^( BASIS ^( MEMB ^( NAME $basis) ) ) ( because_arguments )? ;
	public final GraspParser.because_rationale_return because_rationale() throws RecognitionException {
		GraspParser.because_rationale_return retval = new GraspParser.because_rationale_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token basis=null;
		Token char_literal137=null;
		Token char_literal139=null;
		ParserRuleReturnScope because_arguments138 =null;

		CommonTree basis_tree=null;
		CommonTree char_literal137_tree=null;
		CommonTree char_literal139_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_because_arguments=new RewriteRuleSubtreeStream(adaptor,"rule because_arguments");

		try {
			// Grasp.g:346:2: (basis= IDENTIFIER '(' ( because_arguments )? ')' -> ^( BASIS ^( MEMB ^( NAME $basis) ) ) ( because_arguments )? )
			// Grasp.g:346:4: basis= IDENTIFIER '(' ( because_arguments )? ')'
			{
			basis=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_because_rationale2103); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(basis);

			char_literal137=(Token)match(input,96,FOLLOW_96_in_because_rationale2105); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(char_literal137);

			// Grasp.g:346:25: ( because_arguments )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==IDENTIFIER||LA72_0==112||LA72_0==116) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// Grasp.g:346:25: because_arguments
					{
					pushFollow(FOLLOW_because_arguments_in_because_rationale2107);
					because_arguments138=because_arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_because_arguments.add(because_arguments138.getTree());
					}
					break;

			}

			char_literal139=(Token)match(input,97,FOLLOW_97_in_because_rationale2110); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_97.add(char_literal139);

			// AST REWRITE
			// elements: basis, because_arguments
			// token labels: basis
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_basis=new RewriteRuleTokenStream(adaptor,"token basis",basis);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 347:4: -> ^( BASIS ^( MEMB ^( NAME $basis) ) ) ( because_arguments )?
			{
				// Grasp.g:347:7: ^( BASIS ^( MEMB ^( NAME $basis) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BASIS, "BASIS"), root_1);
				// Grasp.g:347:15: ^( MEMB ^( NAME $basis) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMB, "MEMB"), root_2);
				// Grasp.g:347:22: ^( NAME $basis)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_3);
				adaptor.addChild(root_3, stream_basis.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

				// Grasp.g:347:39: ( because_arguments )?
				if ( stream_because_arguments.hasNext() ) {
					adaptor.addChild(root_0, stream_because_arguments.nextTree());
				}
				stream_because_arguments.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "because_rationale"


	public static class because_arguments_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "because_arguments"
	// Grasp.g:349:1: because_arguments :args+= member_expression ( ',' args+= member_expression )* -> ^( BARGS ( $args)+ ) ;
	public final GraspParser.because_arguments_return because_arguments() throws RecognitionException {
		GraspParser.because_arguments_return retval = new GraspParser.because_arguments_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal140=null;
		List<Object> list_args=null;
		RuleReturnScope args = null;
		CommonTree char_literal140_tree=null;
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_member_expression=new RewriteRuleSubtreeStream(adaptor,"rule member_expression");

		try {
			// Grasp.g:350:2: (args+= member_expression ( ',' args+= member_expression )* -> ^( BARGS ( $args)+ ) )
			// Grasp.g:350:4: args+= member_expression ( ',' args+= member_expression )*
			{
			pushFollow(FOLLOW_member_expression_in_because_arguments2145);
			args=member_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_member_expression.add(args.getTree());
			if (list_args==null) list_args=new ArrayList<Object>();
			list_args.add(args.getTree());
			// Grasp.g:350:28: ( ',' args+= member_expression )*
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==98) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// Grasp.g:350:29: ',' args+= member_expression
					{
					char_literal140=(Token)match(input,98,FOLLOW_98_in_because_arguments2148); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal140);

					pushFollow(FOLLOW_member_expression_in_because_arguments2152);
					args=member_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_member_expression.add(args.getTree());
					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args.getTree());
					}
					break;

				default :
					break loop73;
				}
			}

			// AST REWRITE
			// elements: args
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: args
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
			root_0 = (CommonTree)adaptor.nil();
			// 351:4: -> ^( BARGS ( $args)+ )
			{
				// Grasp.g:351:7: ^( BARGS ( $args)+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BARGS, "BARGS"), root_1);
				if ( !(stream_args.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_args.hasNext() ) {
					adaptor.addChild(root_1, stream_args.nextTree());
				}
				stream_args.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "because_arguments"


	public static class parameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameters"
	// Grasp.g:357:1: parameters :parms+= IDENTIFIER ( ',' parms+= IDENTIFIER )* -> ^( PARMS ( $parms)+ ) ;
	public final GraspParser.parameters_return parameters() throws RecognitionException {
		GraspParser.parameters_return retval = new GraspParser.parameters_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal141=null;
		Token parms=null;
		List<Object> list_parms=null;

		CommonTree char_literal141_tree=null;
		CommonTree parms_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");

		try {
			// Grasp.g:358:2: (parms+= IDENTIFIER ( ',' parms+= IDENTIFIER )* -> ^( PARMS ( $parms)+ ) )
			// Grasp.g:358:4: parms+= IDENTIFIER ( ',' parms+= IDENTIFIER )*
			{
			parms=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameters2183); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(parms);

			if (list_parms==null) list_parms=new ArrayList<Object>();
			list_parms.add(parms);
			// Grasp.g:358:22: ( ',' parms+= IDENTIFIER )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==98) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// Grasp.g:358:23: ',' parms+= IDENTIFIER
					{
					char_literal141=(Token)match(input,98,FOLLOW_98_in_parameters2186); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal141);

					parms=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameters2190); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(parms);

					if (list_parms==null) list_parms=new ArrayList<Object>();
					list_parms.add(parms);
					}
					break;

				default :
					break loop74;
				}
			}

			// AST REWRITE
			// elements: parms
			// token labels: 
			// rule labels: retval
			// token list labels: parms
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_parms=new RewriteRuleTokenStream(adaptor,"token parms", list_parms);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 359:4: -> ^( PARMS ( $parms)+ )
			{
				// Grasp.g:359:7: ^( PARMS ( $parms)+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARMS, "PARMS"), root_1);
				if ( !(stream_parms.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_parms.hasNext() ) {
					adaptor.addChild(root_1, stream_parms.nextNode());
				}
				stream_parms.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameters"


	public static class arguments_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arguments"
	// Grasp.g:365:1: arguments :args+= member_expression ( ',' args+= member_expression )* -> ^( ARGS ( $args)+ ) ;
	public final GraspParser.arguments_return arguments() throws RecognitionException {
		GraspParser.arguments_return retval = new GraspParser.arguments_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal142=null;
		List<Object> list_args=null;
		RuleReturnScope args = null;
		CommonTree char_literal142_tree=null;
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_member_expression=new RewriteRuleSubtreeStream(adaptor,"rule member_expression");

		try {
			// Grasp.g:366:2: (args+= member_expression ( ',' args+= member_expression )* -> ^( ARGS ( $args)+ ) )
			// Grasp.g:366:4: args+= member_expression ( ',' args+= member_expression )*
			{
			pushFollow(FOLLOW_member_expression_in_arguments2221);
			args=member_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_member_expression.add(args.getTree());
			if (list_args==null) list_args=new ArrayList<Object>();
			list_args.add(args.getTree());
			// Grasp.g:366:28: ( ',' args+= member_expression )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==98) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// Grasp.g:366:29: ',' args+= member_expression
					{
					char_literal142=(Token)match(input,98,FOLLOW_98_in_arguments2224); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal142);

					pushFollow(FOLLOW_member_expression_in_arguments2228);
					args=member_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_member_expression.add(args.getTree());
					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args.getTree());
					}
					break;

				default :
					break loop75;
				}
			}

			// AST REWRITE
			// elements: args
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: args
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
			root_0 = (CommonTree)adaptor.nil();
			// 367:4: -> ^( ARGS ( $args)+ )
			{
				// Grasp.g:367:7: ^( ARGS ( $args)+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);
				if ( !(stream_args.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_args.hasNext() ) {
					adaptor.addChild(root_1, stream_args.nextTree());
				}
				stream_args.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arguments"


	public static class namevalue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "namevalue"
	// Grasp.g:373:1: namevalue : name= IDENTIFIER '=' expression -> ^( NAMEDVALUE ^( NAME $name) expression ) ;
	public final GraspParser.namevalue_return namevalue() throws RecognitionException {
		GraspParser.namevalue_return retval = new GraspParser.namevalue_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token name=null;
		Token char_literal143=null;
		ParserRuleReturnScope expression144 =null;

		CommonTree name_tree=null;
		CommonTree char_literal143_tree=null;
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Grasp.g:374:2: (name= IDENTIFIER '=' expression -> ^( NAMEDVALUE ^( NAME $name) expression ) )
			// Grasp.g:374:4: name= IDENTIFIER '=' expression
			{
			name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namevalue2259); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			char_literal143=(Token)match(input,102,FOLLOW_102_in_namevalue2261); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_102.add(char_literal143);

			pushFollow(FOLLOW_expression_in_namevalue2263);
			expression144=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression144.getTree());
			// AST REWRITE
			// elements: name, expression
			// token labels: name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 375:4: -> ^( NAMEDVALUE ^( NAME $name) expression )
			{
				// Grasp.g:375:7: ^( NAMEDVALUE ^( NAME $name) expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMEDVALUE, "NAMEDVALUE"), root_1);
				// Grasp.g:375:20: ^( NAME $name)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);
				adaptor.addChild(root_2, stream_name.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namevalue"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// Grasp.g:381:1: expression : expr= inner_expression -> ^( EXPR ^( TEXT[$expr.text] ) $expr) ;
	public final GraspParser.expression_return expression() throws RecognitionException {
		GraspParser.expression_return retval = new GraspParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expr =null;

		RewriteRuleSubtreeStream stream_inner_expression=new RewriteRuleSubtreeStream(adaptor,"rule inner_expression");

		try {
			// Grasp.g:382:2: (expr= inner_expression -> ^( EXPR ^( TEXT[$expr.text] ) $expr) )
			// Grasp.g:382:4: expr= inner_expression
			{
			pushFollow(FOLLOW_inner_expression_in_expression2297);
			expr=inner_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_inner_expression.add(expr.getTree());
			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: expr, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 383:4: -> ^( EXPR ^( TEXT[$expr.text] ) $expr)
			{
				// Grasp.g:383:7: ^( EXPR ^( TEXT[$expr.text] ) $expr)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);
				// Grasp.g:383:14: ^( TEXT[$expr.text] )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEXT, (expr!=null?input.toString(expr.start,expr.stop):null)), root_2);
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class inner_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "inner_expression"
	// Grasp.g:385:1: inner_expression : subsetof_expression ;
	public final GraspParser.inner_expression_return inner_expression() throws RecognitionException {
		GraspParser.inner_expression_return retval = new GraspParser.inner_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope subsetof_expression145 =null;


		try {
			// Grasp.g:386:2: ( subsetof_expression )
			// Grasp.g:386:4: subsetof_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_subsetof_expression_in_inner_expression2324);
			subsetof_expression145=subsetof_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subsetof_expression145.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inner_expression"


	public static class subsetof_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "subsetof_expression"
	// Grasp.g:388:1: subsetof_expression : logicalOr_expression ( SUBSETOF ^ logicalOr_expression )* ;
	public final GraspParser.subsetof_expression_return subsetof_expression() throws RecognitionException {
		GraspParser.subsetof_expression_return retval = new GraspParser.subsetof_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUBSETOF147=null;
		ParserRuleReturnScope logicalOr_expression146 =null;
		ParserRuleReturnScope logicalOr_expression148 =null;

		CommonTree SUBSETOF147_tree=null;

		try {
			// Grasp.g:389:2: ( logicalOr_expression ( SUBSETOF ^ logicalOr_expression )* )
			// Grasp.g:389:4: logicalOr_expression ( SUBSETOF ^ logicalOr_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalOr_expression_in_subsetof_expression2334);
			logicalOr_expression146=logicalOr_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOr_expression146.getTree());

			// Grasp.g:389:25: ( SUBSETOF ^ logicalOr_expression )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==SUBSETOF) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// Grasp.g:389:26: SUBSETOF ^ logicalOr_expression
					{
					SUBSETOF147=(Token)match(input,SUBSETOF,FOLLOW_SUBSETOF_in_subsetof_expression2337); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SUBSETOF147_tree = (CommonTree)adaptor.create(SUBSETOF147);
					root_0 = (CommonTree)adaptor.becomeRoot(SUBSETOF147_tree, root_0);
					}

					pushFollow(FOLLOW_logicalOr_expression_in_subsetof_expression2340);
					logicalOr_expression148=logicalOr_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOr_expression148.getTree());

					}
					break;

				default :
					break loop76;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subsetof_expression"


	public static class logicalOr_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalOr_expression"
	// Grasp.g:391:1: logicalOr_expression : logicalAnd_expression ( DIS ^ logicalAnd_expression )* ;
	public final GraspParser.logicalOr_expression_return logicalOr_expression() throws RecognitionException {
		GraspParser.logicalOr_expression_return retval = new GraspParser.logicalOr_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DIS150=null;
		ParserRuleReturnScope logicalAnd_expression149 =null;
		ParserRuleReturnScope logicalAnd_expression151 =null;

		CommonTree DIS150_tree=null;

		try {
			// Grasp.g:392:2: ( logicalAnd_expression ( DIS ^ logicalAnd_expression )* )
			// Grasp.g:392:4: logicalAnd_expression ( DIS ^ logicalAnd_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalAnd_expression_in_logicalOr_expression2352);
			logicalAnd_expression149=logicalAnd_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd_expression149.getTree());

			// Grasp.g:392:26: ( DIS ^ logicalAnd_expression )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==DIS) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// Grasp.g:392:27: DIS ^ logicalAnd_expression
					{
					DIS150=(Token)match(input,DIS,FOLLOW_DIS_in_logicalOr_expression2355); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DIS150_tree = (CommonTree)adaptor.create(DIS150);
					root_0 = (CommonTree)adaptor.becomeRoot(DIS150_tree, root_0);
					}

					pushFollow(FOLLOW_logicalAnd_expression_in_logicalOr_expression2358);
					logicalAnd_expression151=logicalAnd_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd_expression151.getTree());

					}
					break;

				default :
					break loop77;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalOr_expression"


	public static class logicalAnd_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalAnd_expression"
	// Grasp.g:394:1: logicalAnd_expression : bitwiseOr_expression ( CON ^ bitwiseOr_expression )* ;
	public final GraspParser.logicalAnd_expression_return logicalAnd_expression() throws RecognitionException {
		GraspParser.logicalAnd_expression_return retval = new GraspParser.logicalAnd_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CON153=null;
		ParserRuleReturnScope bitwiseOr_expression152 =null;
		ParserRuleReturnScope bitwiseOr_expression154 =null;

		CommonTree CON153_tree=null;

		try {
			// Grasp.g:395:2: ( bitwiseOr_expression ( CON ^ bitwiseOr_expression )* )
			// Grasp.g:395:4: bitwiseOr_expression ( CON ^ bitwiseOr_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_expression_in_logicalAnd_expression2370);
			bitwiseOr_expression152=bitwiseOr_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr_expression152.getTree());

			// Grasp.g:395:25: ( CON ^ bitwiseOr_expression )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==CON) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// Grasp.g:395:26: CON ^ bitwiseOr_expression
					{
					CON153=(Token)match(input,CON,FOLLOW_CON_in_logicalAnd_expression2373); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CON153_tree = (CommonTree)adaptor.create(CON153);
					root_0 = (CommonTree)adaptor.becomeRoot(CON153_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_expression_in_logicalAnd_expression2376);
					bitwiseOr_expression154=bitwiseOr_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr_expression154.getTree());

					}
					break;

				default :
					break loop78;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalAnd_expression"


	public static class bitwiseOr_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOr_expression"
	// Grasp.g:397:1: bitwiseOr_expression : bitwiseXor_expression ( IOR ^ bitwiseXor_expression )* ;
	public final GraspParser.bitwiseOr_expression_return bitwiseOr_expression() throws RecognitionException {
		GraspParser.bitwiseOr_expression_return retval = new GraspParser.bitwiseOr_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IOR156=null;
		ParserRuleReturnScope bitwiseXor_expression155 =null;
		ParserRuleReturnScope bitwiseXor_expression157 =null;

		CommonTree IOR156_tree=null;

		try {
			// Grasp.g:398:2: ( bitwiseXor_expression ( IOR ^ bitwiseXor_expression )* )
			// Grasp.g:398:4: bitwiseXor_expression ( IOR ^ bitwiseXor_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_expression_in_bitwiseOr_expression2388);
			bitwiseXor_expression155=bitwiseXor_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor_expression155.getTree());

			// Grasp.g:398:26: ( IOR ^ bitwiseXor_expression )*
			loop79:
			while (true) {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==IOR) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// Grasp.g:398:27: IOR ^ bitwiseXor_expression
					{
					IOR156=(Token)match(input,IOR,FOLLOW_IOR_in_bitwiseOr_expression2391); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IOR156_tree = (CommonTree)adaptor.create(IOR156);
					root_0 = (CommonTree)adaptor.becomeRoot(IOR156_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_expression_in_bitwiseOr_expression2394);
					bitwiseXor_expression157=bitwiseXor_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor_expression157.getTree());

					}
					break;

				default :
					break loop79;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwiseOr_expression"


	public static class bitwiseXor_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bitwiseXor_expression"
	// Grasp.g:400:1: bitwiseXor_expression : bitwiseAnd_expression ( XOR ^ bitwiseAnd_expression )* ;
	public final GraspParser.bitwiseXor_expression_return bitwiseXor_expression() throws RecognitionException {
		GraspParser.bitwiseXor_expression_return retval = new GraspParser.bitwiseXor_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token XOR159=null;
		ParserRuleReturnScope bitwiseAnd_expression158 =null;
		ParserRuleReturnScope bitwiseAnd_expression160 =null;

		CommonTree XOR159_tree=null;

		try {
			// Grasp.g:401:2: ( bitwiseAnd_expression ( XOR ^ bitwiseAnd_expression )* )
			// Grasp.g:401:4: bitwiseAnd_expression ( XOR ^ bitwiseAnd_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_expression_in_bitwiseXor_expression2406);
			bitwiseAnd_expression158=bitwiseAnd_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd_expression158.getTree());

			// Grasp.g:401:26: ( XOR ^ bitwiseAnd_expression )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==XOR) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// Grasp.g:401:27: XOR ^ bitwiseAnd_expression
					{
					XOR159=(Token)match(input,XOR,FOLLOW_XOR_in_bitwiseXor_expression2409); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					XOR159_tree = (CommonTree)adaptor.create(XOR159);
					root_0 = (CommonTree)adaptor.becomeRoot(XOR159_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_expression_in_bitwiseXor_expression2412);
					bitwiseAnd_expression160=bitwiseAnd_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd_expression160.getTree());

					}
					break;

				default :
					break loop80;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwiseXor_expression"


	public static class bitwiseAnd_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bitwiseAnd_expression"
	// Grasp.g:403:1: bitwiseAnd_expression : equality_expresion ( AND ^ equality_expresion )* ;
	public final GraspParser.bitwiseAnd_expression_return bitwiseAnd_expression() throws RecognitionException {
		GraspParser.bitwiseAnd_expression_return retval = new GraspParser.bitwiseAnd_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND162=null;
		ParserRuleReturnScope equality_expresion161 =null;
		ParserRuleReturnScope equality_expresion163 =null;

		CommonTree AND162_tree=null;

		try {
			// Grasp.g:404:2: ( equality_expresion ( AND ^ equality_expresion )* )
			// Grasp.g:404:4: equality_expresion ( AND ^ equality_expresion )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_expresion_in_bitwiseAnd_expression2424);
			equality_expresion161=equality_expresion();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expresion161.getTree());

			// Grasp.g:404:23: ( AND ^ equality_expresion )*
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==AND) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// Grasp.g:404:24: AND ^ equality_expresion
					{
					AND162=(Token)match(input,AND,FOLLOW_AND_in_bitwiseAnd_expression2427); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND162_tree = (CommonTree)adaptor.create(AND162);
					root_0 = (CommonTree)adaptor.becomeRoot(AND162_tree, root_0);
					}

					pushFollow(FOLLOW_equality_expresion_in_bitwiseAnd_expression2430);
					equality_expresion163=equality_expresion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expresion163.getTree());

					}
					break;

				default :
					break loop81;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwiseAnd_expression"


	public static class equality_expresion_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equality_expresion"
	// Grasp.g:406:1: equality_expresion : relational_expresion ( ( EQL | NEQ ) ^ relational_expresion )* ;
	public final GraspParser.equality_expresion_return equality_expresion() throws RecognitionException {
		GraspParser.equality_expresion_return retval = new GraspParser.equality_expresion_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set165=null;
		ParserRuleReturnScope relational_expresion164 =null;
		ParserRuleReturnScope relational_expresion166 =null;

		CommonTree set165_tree=null;

		try {
			// Grasp.g:407:2: ( relational_expresion ( ( EQL | NEQ ) ^ relational_expresion )* )
			// Grasp.g:407:4: relational_expresion ( ( EQL | NEQ ) ^ relational_expresion )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relational_expresion_in_equality_expresion2442);
			relational_expresion164=relational_expresion();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expresion164.getTree());

			// Grasp.g:407:25: ( ( EQL | NEQ ) ^ relational_expresion )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==EQL||LA82_0==NEQ) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// Grasp.g:407:26: ( EQL | NEQ ) ^ relational_expresion
					{
					set165=input.LT(1);
					set165=input.LT(1);
					if ( input.LA(1)==EQL||input.LA(1)==NEQ ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set165), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relational_expresion_in_equality_expresion2454);
					relational_expresion166=relational_expresion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expresion166.getTree());

					}
					break;

				default :
					break loop82;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality_expresion"


	public static class relational_expresion_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relational_expresion"
	// Grasp.g:409:1: relational_expresion : additive_expression ( ( GTN | GTE | LTN | LTE ) ^ additive_expression )* ;
	public final GraspParser.relational_expresion_return relational_expresion() throws RecognitionException {
		GraspParser.relational_expresion_return retval = new GraspParser.relational_expresion_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set168=null;
		ParserRuleReturnScope additive_expression167 =null;
		ParserRuleReturnScope additive_expression169 =null;

		CommonTree set168_tree=null;

		try {
			// Grasp.g:410:2: ( additive_expression ( ( GTN | GTE | LTN | LTE ) ^ additive_expression )* )
			// Grasp.g:410:4: additive_expression ( ( GTN | GTE | LTN | LTE ) ^ additive_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additive_expression_in_relational_expresion2466);
			additive_expression167=additive_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression167.getTree());

			// Grasp.g:410:24: ( ( GTN | GTE | LTN | LTE ) ^ additive_expression )*
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( ((LA83_0 >= GTE && LA83_0 <= GTN)||(LA83_0 >= LTE && LA83_0 <= LTN)) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// Grasp.g:410:25: ( GTN | GTE | LTN | LTE ) ^ additive_expression
					{
					set168=input.LT(1);
					set168=input.LT(1);
					if ( (input.LA(1) >= GTE && input.LA(1) <= GTN)||(input.LA(1) >= LTE && input.LA(1) <= LTN) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set168), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additive_expression_in_relational_expresion2486);
					additive_expression169=additive_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression169.getTree());

					}
					break;

				default :
					break loop83;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational_expresion"


	public static class additive_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additive_expression"
	// Grasp.g:418:1: additive_expression : multiplicative_expression ( ( ADD | SUB ) ^ multiplicative_expression )* ;
	public final GraspParser.additive_expression_return additive_expression() throws RecognitionException {
		GraspParser.additive_expression_return retval = new GraspParser.additive_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set171=null;
		ParserRuleReturnScope multiplicative_expression170 =null;
		ParserRuleReturnScope multiplicative_expression172 =null;

		CommonTree set171_tree=null;

		try {
			// Grasp.g:419:2: ( multiplicative_expression ( ( ADD | SUB ) ^ multiplicative_expression )* )
			// Grasp.g:419:4: multiplicative_expression ( ( ADD | SUB ) ^ multiplicative_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2504);
			multiplicative_expression170=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression170.getTree());

			// Grasp.g:419:30: ( ( ADD | SUB ) ^ multiplicative_expression )*
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==ADD||LA84_0==SUB) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// Grasp.g:419:31: ( ADD | SUB ) ^ multiplicative_expression
					{
					set171=input.LT(1);
					set171=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set171), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2516);
					multiplicative_expression172=multiplicative_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression172.getTree());

					}
					break;

				default :
					break loop84;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_expression"


	public static class multiplicative_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_expression"
	// Grasp.g:421:1: multiplicative_expression : unary_expresion ( ( MUL | DIV | MOD ) ^ unary_expresion )* ;
	public final GraspParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		GraspParser.multiplicative_expression_return retval = new GraspParser.multiplicative_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set174=null;
		ParserRuleReturnScope unary_expresion173 =null;
		ParserRuleReturnScope unary_expresion175 =null;

		CommonTree set174_tree=null;

		try {
			// Grasp.g:422:2: ( unary_expresion ( ( MUL | DIV | MOD ) ^ unary_expresion )* )
			// Grasp.g:422:4: unary_expresion ( ( MUL | DIV | MOD ) ^ unary_expresion )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_expresion_in_multiplicative_expression2529);
			unary_expresion173=unary_expresion();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expresion173.getTree());

			// Grasp.g:422:20: ( ( MUL | DIV | MOD ) ^ unary_expresion )*
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( (LA85_0==DIV||(LA85_0 >= MOD && LA85_0 <= MUL)) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// Grasp.g:422:21: ( MUL | DIV | MOD ) ^ unary_expresion
					{
					set174=input.LT(1);
					set174=input.LT(1);
					if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set174), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unary_expresion_in_multiplicative_expression2545);
					unary_expresion175=unary_expresion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expresion175.getTree());

					}
					break;

				default :
					break loop85;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative_expression"


	public static class unary_expresion_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary_expresion"
	// Grasp.g:424:1: unary_expresion : ( ( CMP | NOT ) ^ unary_expresion | '+' expr= unary_expresion -> ^( POS $expr) | '-' expr= unary_expresion -> ^( NEG $expr) | primary_expression );
	public final GraspParser.unary_expresion_return unary_expresion() throws RecognitionException {
		GraspParser.unary_expresion_return retval = new GraspParser.unary_expresion_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set176=null;
		Token char_literal178=null;
		Token char_literal179=null;
		ParserRuleReturnScope expr =null;
		ParserRuleReturnScope unary_expresion177 =null;
		ParserRuleReturnScope primary_expression180 =null;

		CommonTree set176_tree=null;
		CommonTree char_literal178_tree=null;
		CommonTree char_literal179_tree=null;
		RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
		RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
		RewriteRuleSubtreeStream stream_unary_expresion=new RewriteRuleSubtreeStream(adaptor,"rule unary_expresion");

		try {
			// Grasp.g:425:2: ( ( CMP | NOT ) ^ unary_expresion | '+' expr= unary_expresion -> ^( POS $expr) | '-' expr= unary_expresion -> ^( NEG $expr) | primary_expression )
			int alt86=4;
			switch ( input.LA(1) ) {
			case CMP:
			case NOT:
				{
				alt86=1;
				}
				break;
			case ADD:
				{
				alt86=2;
				}
				break;
			case SUB:
				{
				alt86=3;
				}
				break;
			case BOOLEAN_LITERAL:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case STRING_LITERAL:
			case 96:
			case 104:
			case 112:
			case 116:
				{
				alt86=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// Grasp.g:425:4: ( CMP | NOT ) ^ unary_expresion
					{
					root_0 = (CommonTree)adaptor.nil();


					set176=input.LT(1);
					set176=input.LT(1);
					if ( input.LA(1)==CMP||input.LA(1)==NOT ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set176), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unary_expresion_in_unary_expresion2566);
					unary_expresion177=unary_expresion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expresion177.getTree());

					}
					break;
				case 2 :
					// Grasp.g:426:4: '+' expr= unary_expresion
					{
					char_literal178=(Token)match(input,ADD,FOLLOW_ADD_in_unary_expresion2571); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ADD.add(char_literal178);

					pushFollow(FOLLOW_unary_expresion_in_unary_expresion2575);
					expr=unary_expresion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expresion.add(expr.getTree());
					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: expr, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 426:33: -> ^( POS $expr)
					{
						// Grasp.g:426:36: ^( POS $expr)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POS, "POS"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Grasp.g:427:4: '-' expr= unary_expresion
					{
					char_literal179=(Token)match(input,SUB,FOLLOW_SUB_in_unary_expresion2593); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SUB.add(char_literal179);

					pushFollow(FOLLOW_unary_expresion_in_unary_expresion2597);
					expr=unary_expresion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expresion.add(expr.getTree());
					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: expr, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 427:33: -> ^( NEG $expr)
					{
						// Grasp.g:427:36: ^( NEG $expr)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEG, "NEG"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Grasp.g:428:4: primary_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_expression_in_unary_expresion2615);
					primary_expression180=primary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression180.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_expresion"


	public static class primary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary_expression"
	// Grasp.g:430:1: primary_expression : ( '(' ! inner_expression ')' !| member_expression | literal );
	public final GraspParser.primary_expression_return primary_expression() throws RecognitionException {
		GraspParser.primary_expression_return retval = new GraspParser.primary_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal181=null;
		Token char_literal183=null;
		ParserRuleReturnScope inner_expression182 =null;
		ParserRuleReturnScope member_expression184 =null;
		ParserRuleReturnScope literal185 =null;

		CommonTree char_literal181_tree=null;
		CommonTree char_literal183_tree=null;

		try {
			// Grasp.g:431:2: ( '(' ! inner_expression ')' !| member_expression | literal )
			int alt87=3;
			switch ( input.LA(1) ) {
			case 96:
				{
				alt87=1;
				}
				break;
			case IDENTIFIER:
			case 112:
			case 116:
				{
				alt87=2;
				}
				break;
			case BOOLEAN_LITERAL:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case STRING_LITERAL:
			case 104:
				{
				alt87=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// Grasp.g:431:4: '(' ! inner_expression ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal181=(Token)match(input,96,FOLLOW_96_in_primary_expression2625); if (state.failed) return retval;
					pushFollow(FOLLOW_inner_expression_in_primary_expression2628);
					inner_expression182=inner_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inner_expression182.getTree());

					char_literal183=(Token)match(input,97,FOLLOW_97_in_primary_expression2630); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Grasp.g:432:4: member_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_member_expression_in_primary_expression2636);
					member_expression184=member_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, member_expression184.getTree());

					}
					break;
				case 3 :
					// Grasp.g:433:4: literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_literal_in_primary_expression2641);
					literal185=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal185.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary_expression"


	public static class member_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "member_expression"
	// Grasp.g:435:1: member_expression : member_part ( '.' member_part )* -> ^( MEMB ( member_part )+ ) ;
	public final GraspParser.member_expression_return member_expression() throws RecognitionException {
		GraspParser.member_expression_return retval = new GraspParser.member_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal187=null;
		ParserRuleReturnScope member_part186 =null;
		ParserRuleReturnScope member_part188 =null;

		CommonTree char_literal187_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleSubtreeStream stream_member_part=new RewriteRuleSubtreeStream(adaptor,"rule member_part");

		try {
			// Grasp.g:436:2: ( member_part ( '.' member_part )* -> ^( MEMB ( member_part )+ ) )
			// Grasp.g:436:4: member_part ( '.' member_part )*
			{
			pushFollow(FOLLOW_member_part_in_member_expression2651);
			member_part186=member_part();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_member_part.add(member_part186.getTree());
			// Grasp.g:436:16: ( '.' member_part )*
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==99) ) {
					alt88=1;
				}

				switch (alt88) {
				case 1 :
					// Grasp.g:436:17: '.' member_part
					{
					char_literal187=(Token)match(input,99,FOLLOW_99_in_member_expression2654); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_99.add(char_literal187);

					pushFollow(FOLLOW_member_part_in_member_expression2656);
					member_part188=member_part();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_member_part.add(member_part188.getTree());
					}
					break;

				default :
					break loop88;
				}
			}

			// AST REWRITE
			// elements: member_part
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 436:37: -> ^( MEMB ( member_part )+ )
			{
				// Grasp.g:436:40: ^( MEMB ( member_part )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMB, "MEMB"), root_1);
				if ( !(stream_member_part.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_member_part.hasNext() ) {
					adaptor.addChild(root_1, stream_member_part.nextTree());
				}
				stream_member_part.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "member_expression"


	public static class member_part_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "member_part"
	// Grasp.g:438:1: member_part : (name= IDENTIFIER '(' ( member_args )? ')' -> ^( FUNCTION $name ^( ARGS ( member_args )? ) ) |name= IDENTIFIER -> ^( FIELD $name) |kw= 'out' -> ^( ICALLOUT[$kw] ) |kw= 'in' -> ^( ICALLIN[$kw] ) );
	public final GraspParser.member_part_return member_part() throws RecognitionException {
		GraspParser.member_part_return retval = new GraspParser.member_part_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token name=null;
		Token kw=null;
		Token char_literal189=null;
		Token char_literal191=null;
		ParserRuleReturnScope member_args190 =null;

		CommonTree name_tree=null;
		CommonTree kw_tree=null;
		CommonTree char_literal189_tree=null;
		CommonTree char_literal191_tree=null;
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_member_args=new RewriteRuleSubtreeStream(adaptor,"rule member_args");

		try {
			// Grasp.g:439:2: (name= IDENTIFIER '(' ( member_args )? ')' -> ^( FUNCTION $name ^( ARGS ( member_args )? ) ) |name= IDENTIFIER -> ^( FIELD $name) |kw= 'out' -> ^( ICALLOUT[$kw] ) |kw= 'in' -> ^( ICALLIN[$kw] ) )
			int alt90=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA90_1 = input.LA(2);
				if ( (LA90_1==96) ) {
					alt90=1;
				}
				else if ( (LA90_1==EOF||LA90_1==ADD||LA90_1==AND||LA90_1==CON||(LA90_1 >= DIS && LA90_1 <= DIV)||LA90_1==EQL||(LA90_1 >= GTE && LA90_1 <= GTN)||LA90_1==IOR||(LA90_1 >= LTE && LA90_1 <= LTN)||(LA90_1 >= MOD && LA90_1 <= MUL)||LA90_1==NEQ||(LA90_1 >= SUB && LA90_1 <= SUBSETOF)||LA90_1==XOR||(LA90_1 >= 97 && LA90_1 <= 99)||LA90_1==101||LA90_1==107||LA90_1==113||LA90_1==125||(LA90_1 >= 128 && LA90_1 <= 129)) ) {
					alt90=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 116:
				{
				alt90=3;
				}
				break;
			case 112:
				{
				alt90=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// Grasp.g:439:4: name= IDENTIFIER '(' ( member_args )? ')'
					{
					name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_member_part2681); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

					char_literal189=(Token)match(input,96,FOLLOW_96_in_member_part2683); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_96.add(char_literal189);

					// Grasp.g:439:24: ( member_args )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==ADD||LA89_0==BOOLEAN_LITERAL||LA89_0==CMP||LA89_0==IDENTIFIER||LA89_0==INTEGER_LITERAL||LA89_0==NOT||LA89_0==REAL_LITERAL||(LA89_0 >= STRING_LITERAL && LA89_0 <= SUB)||LA89_0==96||LA89_0==104||LA89_0==112||LA89_0==116) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// Grasp.g:439:24: member_args
							{
							pushFollow(FOLLOW_member_args_in_member_part2685);
							member_args190=member_args();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_member_args.add(member_args190.getTree());
							}
							break;

					}

					char_literal191=(Token)match(input,97,FOLLOW_97_in_member_part2688); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_97.add(char_literal191);

					// AST REWRITE
					// elements: name, member_args
					// token labels: name
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 439:42: -> ^( FUNCTION $name ^( ARGS ( member_args )? ) )
					{
						// Grasp.g:439:45: ^( FUNCTION $name ^( ARGS ( member_args )? ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "FUNCTION"), root_1);
						adaptor.addChild(root_1, stream_name.nextNode());
						// Grasp.g:439:62: ^( ARGS ( member_args )? )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);
						// Grasp.g:439:69: ( member_args )?
						if ( stream_member_args.hasNext() ) {
							adaptor.addChild(root_2, stream_member_args.nextTree());
						}
						stream_member_args.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Grasp.g:440:4: name= IDENTIFIER
					{
					name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_member_part2712); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

					// AST REWRITE
					// elements: name
					// token labels: name
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 440:26: -> ^( FIELD $name)
					{
						// Grasp.g:440:29: ^( FIELD $name)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD, "FIELD"), root_1);
						adaptor.addChild(root_1, stream_name.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Grasp.g:441:4: kw= 'out'
					{
					kw=(Token)match(input,116,FOLLOW_116_in_member_part2734); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_116.add(kw);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 441:21: -> ^( ICALLOUT[$kw] )
					{
						// Grasp.g:441:24: ^( ICALLOUT[$kw] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ICALLOUT, kw), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Grasp.g:442:4: kw= 'in'
					{
					kw=(Token)match(input,112,FOLLOW_112_in_member_part2756); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(kw);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 442:20: -> ^( ICALLIN[$kw] )
					{
						// Grasp.g:442:23: ^( ICALLIN[$kw] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ICALLIN, kw), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "member_part"


	public static class member_args_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "member_args"
	// Grasp.g:444:1: member_args : expression ( ',' ! expression )* ;
	public final GraspParser.member_args_return member_args() throws RecognitionException {
		GraspParser.member_args_return retval = new GraspParser.member_args_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal193=null;
		ParserRuleReturnScope expression192 =null;
		ParserRuleReturnScope expression194 =null;

		CommonTree char_literal193_tree=null;

		try {
			// Grasp.g:445:2: ( expression ( ',' ! expression )* )
			// Grasp.g:445:4: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_member_args2781);
			expression192=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression192.getTree());

			// Grasp.g:445:15: ( ',' ! expression )*
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==98) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// Grasp.g:445:16: ',' ! expression
					{
					char_literal193=(Token)match(input,98,FOLLOW_98_in_member_args2784); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_member_args2787);
					expression194=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression194.getTree());

					}
					break;

				default :
					break loop91;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "member_args"


	public static class literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// Grasp.g:447:1: literal : ( '[' (set= literal_set )? ']' -> ^( SET ( $set)? ) |atom= INTEGER_LITERAL -> ^( INTEGER $atom) |atom= REAL_LITERAL -> ^( REAL $atom) |atom= BOOLEAN_LITERAL -> ^( BOOLEAN $atom) |atom= STRING_LITERAL -> ^( STRING $atom) );
	public final GraspParser.literal_return literal() throws RecognitionException {
		GraspParser.literal_return retval = new GraspParser.literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token atom=null;
		Token char_literal195=null;
		Token char_literal196=null;
		ParserRuleReturnScope set =null;

		CommonTree atom_tree=null;
		CommonTree char_literal195_tree=null;
		CommonTree char_literal196_tree=null;
		RewriteRuleTokenStream stream_REAL_LITERAL=new RewriteRuleTokenStream(adaptor,"token REAL_LITERAL");
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_BOOLEAN_LITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEAN_LITERAL");
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token INTEGER_LITERAL");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleSubtreeStream stream_literal_set=new RewriteRuleSubtreeStream(adaptor,"rule literal_set");

		try {
			// Grasp.g:448:2: ( '[' (set= literal_set )? ']' -> ^( SET ( $set)? ) |atom= INTEGER_LITERAL -> ^( INTEGER $atom) |atom= REAL_LITERAL -> ^( REAL $atom) |atom= BOOLEAN_LITERAL -> ^( BOOLEAN $atom) |atom= STRING_LITERAL -> ^( STRING $atom) )
			int alt93=5;
			switch ( input.LA(1) ) {
			case 104:
				{
				alt93=1;
				}
				break;
			case INTEGER_LITERAL:
				{
				alt93=2;
				}
				break;
			case REAL_LITERAL:
				{
				alt93=3;
				}
				break;
			case BOOLEAN_LITERAL:
				{
				alt93=4;
				}
				break;
			case STRING_LITERAL:
				{
				alt93=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}
			switch (alt93) {
				case 1 :
					// Grasp.g:448:4: '[' (set= literal_set )? ']'
					{
					char_literal195=(Token)match(input,104,FOLLOW_104_in_literal2799); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_104.add(char_literal195);

					// Grasp.g:448:11: (set= literal_set )?
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==BOOLEAN_LITERAL||LA92_0==INTEGER_LITERAL||LA92_0==REAL_LITERAL||LA92_0==STRING_LITERAL||LA92_0==104) ) {
						alt92=1;
					}
					switch (alt92) {
						case 1 :
							// Grasp.g:448:11: set= literal_set
							{
							pushFollow(FOLLOW_literal_set_in_literal2803);
							set=literal_set();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_literal_set.add(set.getTree());
							}
							break;

					}

					char_literal196=(Token)match(input,105,FOLLOW_105_in_literal2806); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_105.add(char_literal196);

					// AST REWRITE
					// elements: set
					// token labels: 
					// rule labels: set, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set",set!=null?set.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 448:34: -> ^( SET ( $set)? )
					{
						// Grasp.g:448:37: ^( SET ( $set)? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET, "SET"), root_1);
						// Grasp.g:448:44: ( $set)?
						if ( stream_set.hasNext() ) {
							adaptor.addChild(root_1, stream_set.nextTree());
						}
						stream_set.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Grasp.g:449:4: atom= INTEGER_LITERAL
					{
					atom=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_literal2828); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTEGER_LITERAL.add(atom);

					// AST REWRITE
					// elements: atom
					// token labels: atom
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_atom=new RewriteRuleTokenStream(adaptor,"token atom",atom);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 449:30: -> ^( INTEGER $atom)
					{
						// Grasp.g:449:33: ^( INTEGER $atom)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTEGER, "INTEGER"), root_1);
						adaptor.addChild(root_1, stream_atom.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Grasp.g:450:4: atom= REAL_LITERAL
					{
					atom=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_literal2849); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REAL_LITERAL.add(atom);

					// AST REWRITE
					// elements: atom
					// token labels: atom
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_atom=new RewriteRuleTokenStream(adaptor,"token atom",atom);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 450:28: -> ^( REAL $atom)
					{
						// Grasp.g:450:31: ^( REAL $atom)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REAL, "REAL"), root_1);
						adaptor.addChild(root_1, stream_atom.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Grasp.g:451:4: atom= BOOLEAN_LITERAL
					{
					atom=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_literal2871); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BOOLEAN_LITERAL.add(atom);

					// AST REWRITE
					// elements: atom
					// token labels: atom
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_atom=new RewriteRuleTokenStream(adaptor,"token atom",atom);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 451:30: -> ^( BOOLEAN $atom)
					{
						// Grasp.g:451:33: ^( BOOLEAN $atom)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BOOLEAN, "BOOLEAN"), root_1);
						adaptor.addChild(root_1, stream_atom.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Grasp.g:452:4: atom= STRING_LITERAL
					{
					atom=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal2892); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING_LITERAL.add(atom);

					// AST REWRITE
					// elements: atom
					// token labels: atom
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_atom=new RewriteRuleTokenStream(adaptor,"token atom",atom);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 452:29: -> ^( STRING $atom)
					{
						// Grasp.g:452:32: ^( STRING $atom)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);
						adaptor.addChild(root_1, stream_atom.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class literal_set_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "literal_set"
	// Grasp.g:454:1: literal_set : literal ( ',' ! literal )* ;
	public final GraspParser.literal_set_return literal_set() throws RecognitionException {
		GraspParser.literal_set_return retval = new GraspParser.literal_set_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal198=null;
		ParserRuleReturnScope literal197 =null;
		ParserRuleReturnScope literal199 =null;

		CommonTree char_literal198_tree=null;

		try {
			// Grasp.g:455:2: ( literal ( ',' ! literal )* )
			// Grasp.g:455:4: literal ( ',' ! literal )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_literal_in_literal_set2916);
			literal197=literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, literal197.getTree());

			// Grasp.g:455:12: ( ',' ! literal )*
			loop94:
			while (true) {
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==98) ) {
					alt94=1;
				}

				switch (alt94) {
				case 1 :
					// Grasp.g:455:13: ',' ! literal
					{
					char_literal198=(Token)match(input,98,FOLLOW_98_in_literal_set2919); if (state.failed) return retval;
					pushFollow(FOLLOW_literal_in_literal_set2922);
					literal199=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal199.getTree());

					}
					break;

				default :
					break loop94;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal_set"

	// $ANTLR start synpred2_Grasp
	public final void synpred2_Grasp_fragment() throws RecognitionException {
		// Grasp.g:135:54: ( declarational_statement )
		// Grasp.g:135:54: declarational_statement
		{
		pushFollow(FOLLOW_declarational_statement_in_synpred2_Grasp525);
		declarational_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Grasp

	// $ANTLR start synpred4_Grasp
	public final void synpred4_Grasp_fragment() throws RecognitionException {
		// Grasp.g:139:4: ( requirement_statement )
		// Grasp.g:139:4: requirement_statement
		{
		pushFollow(FOLLOW_requirement_statement_in_synpred4_Grasp572);
		requirement_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_Grasp

	// $ANTLR start synpred5_Grasp
	public final void synpred5_Grasp_fragment() throws RecognitionException {
		// Grasp.g:140:4: ( qattribute_statement )
		// Grasp.g:140:4: qattribute_statement
		{
		pushFollow(FOLLOW_qattribute_statement_in_synpred5_Grasp577);
		qattribute_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_Grasp

	// $ANTLR start synpred6_Grasp
	public final void synpred6_Grasp_fragment() throws RecognitionException {
		// Grasp.g:141:4: ( template_statement )
		// Grasp.g:141:4: template_statement
		{
		pushFollow(FOLLOW_template_statement_in_synpred6_Grasp582);
		template_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_Grasp

	// $ANTLR start synpred24_Grasp
	public final void synpred24_Grasp_fragment() throws RecognitionException {
		// Grasp.g:185:4: ( template_statement )
		// Grasp.g:185:4: template_statement
		{
		pushFollow(FOLLOW_template_statement_in_synpred24_Grasp955);
		template_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred24_Grasp

	// $ANTLR start synpred25_Grasp
	public final void synpred25_Grasp_fragment() throws RecognitionException {
		// Grasp.g:186:4: ( provides_statement )
		// Grasp.g:186:4: provides_statement
		{
		pushFollow(FOLLOW_provides_statement_in_synpred25_Grasp960);
		provides_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred25_Grasp

	// $ANTLR start synpred26_Grasp
	public final void synpred26_Grasp_fragment() throws RecognitionException {
		// Grasp.g:187:4: ( requires_statement )
		// Grasp.g:187:4: requires_statement
		{
		pushFollow(FOLLOW_requires_statement_in_synpred26_Grasp965);
		requires_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred26_Grasp

	// $ANTLR start synpred27_Grasp
	public final void synpred27_Grasp_fragment() throws RecognitionException {
		// Grasp.g:188:4: ( property_statement )
		// Grasp.g:188:4: property_statement
		{
		pushFollow(FOLLOW_property_statement_in_synpred27_Grasp970);
		property_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred27_Grasp

	// $ANTLR start synpred47_Grasp
	public final void synpred47_Grasp_fragment() throws RecognitionException {
		// Grasp.g:239:4: ( compositional_statement )
		// Grasp.g:239:4: compositional_statement
		{
		pushFollow(FOLLOW_compositional_statement_in_synpred47_Grasp1363);
		compositional_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred47_Grasp

	// $ANTLR start synpred48_Grasp
	public final void synpred48_Grasp_fragment() throws RecognitionException {
		// Grasp.g:247:4: ( layer_statement )
		// Grasp.g:247:4: layer_statement
		{
		pushFollow(FOLLOW_layer_statement_in_synpred48_Grasp1382);
		layer_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred48_Grasp

	// $ANTLR start synpred49_Grasp
	public final void synpred49_Grasp_fragment() throws RecognitionException {
		// Grasp.g:248:4: ( component_statement )
		// Grasp.g:248:4: component_statement
		{
		pushFollow(FOLLOW_component_statement_in_synpred49_Grasp1387);
		component_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred49_Grasp

	// $ANTLR start synpred50_Grasp
	public final void synpred50_Grasp_fragment() throws RecognitionException {
		// Grasp.g:249:4: ( connector_statement )
		// Grasp.g:249:4: connector_statement
		{
		pushFollow(FOLLOW_connector_statement_in_synpred50_Grasp1392);
		connector_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred50_Grasp

	// $ANTLR start synpred56_Grasp
	public final void synpred56_Grasp_fragment() throws RecognitionException {
		// Grasp.g:265:4: ( compositional_statement )
		// Grasp.g:265:4: compositional_statement
		{
		pushFollow(FOLLOW_compositional_statement_in_synpred56_Grasp1523);
		compositional_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred56_Grasp

	// $ANTLR start synpred67_Grasp
	public final void synpred67_Grasp_fragment() throws RecognitionException {
		// Grasp.g:285:4: ( compositional_statement )
		// Grasp.g:285:4: compositional_statement
		{
		pushFollow(FOLLOW_compositional_statement_in_synpred67_Grasp1738);
		compositional_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred67_Grasp

	// Delegated rules

	public final boolean synpred27_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred48_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred48_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred49_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred49_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_Grasp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_Grasp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_architecture_statement_in_start498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_architecture_statement512 = new BitSet(new long[]{0x0000000000000000L,0x0000048000000000L});
	public static final BitSet FOLLOW_106_in_architecture_statement517 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_architecture_statement521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_architecture_statement523 = new BitSet(new long[]{0x0000000000000000L,0xCB00008000000000L});
	public static final BitSet FOLLOW_declarational_statement_in_architecture_statement525 = new BitSet(new long[]{0x0000000000000000L,0xCB00008000000000L});
	public static final BitSet FOLLOW_system_statement_in_architecture_statement528 = new BitSet(new long[]{0x0000000000000000L,0x8B00008000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_declarational_statement_in_architecture_statement530 = new BitSet(new long[]{0x0000000000000000L,0x8B00008000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_architecture_statement533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_requirement_statement_in_declarational_statement572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qattribute_statement_in_declarational_statement577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_template_statement_in_declarational_statement582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rationale_statement_in_declarational_statement587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_requirement_statement601 = new BitSet(new long[]{0x0000000000000000L,0x0800008000000000L});
	public static final BitSet FOLLOW_123_in_requirement_statement606 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_requirement_statement610 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
	public static final BitSet FOLLOW_102_in_requirement_statement613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_requirement_statement617 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_requirement_statement621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_qattribute_statement676 = new BitSet(new long[]{0x0000000000000000L,0x0100008000000000L});
	public static final BitSet FOLLOW_120_in_qattribute_statement681 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_qattribute_statement685 = new BitSet(new long[]{0x0000000000000000L,0x2000006000000000L});
	public static final BitSet FOLLOW_102_in_qattribute_statement688 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_expression_in_qattribute_statement690 = new BitSet(new long[]{0x0000000000000000L,0x2000002000000000L});
	public static final BitSet FOLLOW_supports_opt_in_qattribute_statement694 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_qattribute_statement697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_rationale_statement741 = new BitSet(new long[]{0x0000000000000000L,0x0200008000000000L});
	public static final BitSet FOLLOW_121_in_rationale_statement746 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_rationale_statement750 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_rationale_statement752 = new BitSet(new long[]{0x0000200000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_parameters_in_rationale_statement754 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_rationale_statement757 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_extends_opt_in_rationale_statement759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_rationale_statement762 = new BitSet(new long[]{0x0000000000000000L,0x0400008000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_reason_statement_in_rationale_statement764 = new BitSet(new long[]{0x0000000000000000L,0x0400008000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_rationale_statement767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_reason_statement814 = new BitSet(new long[]{0x0000000000000000L,0x0400008000000000L});
	public static final BitSet FOLLOW_122_in_reason_statement819 = new BitSet(new long[]{0x0004200000500020L,0x2011010100604004L});
	public static final BitSet FOLLOW_expression_in_reason_statement822 = new BitSet(new long[]{0x0000000000000000L,0x0002002000000000L});
	public static final BitSet FOLLOW_supports_opt_in_reason_statement826 = new BitSet(new long[]{0x0000000000000000L,0x0002002000000000L});
	public static final BitSet FOLLOW_inhibits_opt_in_reason_statement829 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_reason_statement833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_template_statement873 = new BitSet(new long[]{0x0000000000000000L,0x8000008000000000L});
	public static final BitSet FOLLOW_127_in_template_statement878 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_template_statement882 = new BitSet(new long[]{0x0000000000000000L,0x0000001100000000L});
	public static final BitSet FOLLOW_100_in_template_statement885 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_INTEGER_LITERAL_in_template_statement889 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_template_statement893 = new BitSet(new long[]{0x0000200000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_parameters_in_template_statement895 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_template_statement898 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_extends_opt_in_template_statement900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_template_statement903 = new BitSet(new long[]{0x0000000000000000L,0x90C0108000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_template_constituent_in_template_statement905 = new BitSet(new long[]{0x0000000000000000L,0x90C0108000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_template_statement908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_template_statement_in_template_constituent955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_provides_statement_in_template_constituent960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_requires_statement_in_template_constituent965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_statement_in_template_constituent970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_check_statement_in_template_constituent975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_provides_statement989 = new BitSet(new long[]{0x0000000000000000L,0x0080008000000000L});
	public static final BitSet FOLLOW_119_in_provides_statement994 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_provides_statement998 = new BitSet(new long[]{0x0000200000000000L,0x0000083000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_provides_statement1001 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_INTEGER_LITERAL_in_provides_statement1005 = new BitSet(new long[]{0x0000200000000000L,0x0000082000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_provides_statement1011 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_because_opt_in_provides_statement1014 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_provides_statement1018 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_provides_constituent_in_provides_statement1020 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_provides_statement1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_provides_statement1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_check_statement_in_provides_constituent1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_requires_statement1098 = new BitSet(new long[]{0x0000000000000000L,0x1000008000000000L});
	public static final BitSet FOLLOW_124_in_requires_statement1103 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_requires_statement1107 = new BitSet(new long[]{0x0000200000000000L,0x0000082000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_requires_statement1111 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_because_opt_in_requires_statement1114 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_requires_statement1118 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_requires_constituent_in_requires_statement1120 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_requires_statement1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_requires_statement1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_check_statement_in_requires_constituent1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_property_statement1191 = new BitSet(new long[]{0x0000000000000000L,0x0040008000000000L});
	public static final BitSet FOLLOW_118_in_property_statement1196 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_property_statement1200 = new BitSet(new long[]{0x0000000000000000L,0x0000086000000000L});
	public static final BitSet FOLLOW_102_in_property_statement1203 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_expression_in_property_statement1205 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L});
	public static final BitSet FOLLOW_because_opt_in_property_statement1209 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_property_statement1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_check_statement1256 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L});
	public static final BitSet FOLLOW_108_in_check_statement1261 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_expression_in_check_statement1263 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L});
	public static final BitSet FOLLOW_because_opt_in_check_statement1265 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_check_statement1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_system_statement1304 = new BitSet(new long[]{0x0000000000000000L,0x4000008000000000L});
	public static final BitSet FOLLOW_126_in_system_statement1309 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_system_statement1313 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_because_opt_in_system_statement1315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_system_statement1318 = new BitSet(new long[]{0x0000000000000000L,0x000C708000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_system_constituent_in_system_statement1320 = new BitSet(new long[]{0x0000000000000000L,0x000C708000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_system_statement1323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compositional_statement_in_system_constituent1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_check_statement_in_system_constituent1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_layer_statement_in_compositional_statement1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_component_statement_in_compositional_statement1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_connector_statement_in_compositional_statement1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_link_statement_in_compositional_statement1397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_layer_statement1411 = new BitSet(new long[]{0x0000000000000000L,0x0004008000000000L});
	public static final BitSet FOLLOW_114_in_layer_statement1416 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_layer_statement1420 = new BitSet(new long[]{0x0000000000000000L,0x0020080000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_layer_over_opt_in_layer_statement1422 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_because_opt_in_layer_statement1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_layer_statement1428 = new BitSet(new long[]{0x0000000000000000L,0x000C708000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_layer_constituent_in_layer_statement1430 = new BitSet(new long[]{0x0000000000000000L,0x000C708000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_layer_statement1433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_layer_over_opt1478 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_layer_over_opt1482 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_layer_over_opt1485 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_layer_over_opt1489 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_compositional_statement_in_layer_constituent1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_check_statement_in_layer_constituent1528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_component_statement1542 = new BitSet(new long[]{0x0000000000000000L,0x0000208000000000L});
	public static final BitSet FOLLOW_109_in_component_statement1547 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_component_statement1551 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_component_statement1553 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_component_statement1557 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_component_statement1559 = new BitSet(new long[]{0x0000200000000000L,0x0011000200000000L});
	public static final BitSet FOLLOW_arguments_in_component_statement1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_component_statement1564 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_because_opt_in_component_statement1566 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_component_statement1570 = new BitSet(new long[]{0x0000000000000000L,0x000C708000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_instantiable_constituent_in_component_statement1572 = new BitSet(new long[]{0x0000000000000000L,0x000C708000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_component_statement1575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_component_statement1579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_connector_statement1642 = new BitSet(new long[]{0x0000000000000000L,0x0000408000000000L});
	public static final BitSet FOLLOW_110_in_connector_statement1647 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_connector_statement1651 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_connector_statement1653 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_connector_statement1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_connector_statement1659 = new BitSet(new long[]{0x0000200000000000L,0x0011000200000000L});
	public static final BitSet FOLLOW_arguments_in_connector_statement1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_connector_statement1664 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_because_opt_in_connector_statement1666 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_connector_statement1670 = new BitSet(new long[]{0x0000000000000000L,0x000C708000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_instantiable_constituent_in_connector_statement1672 = new BitSet(new long[]{0x0000000000000000L,0x000C708000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_connector_statement1675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_connector_statement1679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compositional_statement_in_instantiable_constituent1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_check_statement_in_instantiable_constituent1743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_link_statement1757 = new BitSet(new long[]{0x0000000000000000L,0x0008008000000000L});
	public static final BitSet FOLLOW_115_in_link_statement1762 = new BitSet(new long[]{0x0000200000000000L,0x0011000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_link_statement1766 = new BitSet(new long[]{0x0000200000000000L,0x0011000000000000L});
	public static final BitSet FOLLOW_link_consumer_in_link_statement1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_128_in_link_statement1771 = new BitSet(new long[]{0x0000200000000000L,0x0011000000000000L});
	public static final BitSet FOLLOW_link_providers_in_link_statement1773 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_because_opt_in_link_statement1775 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_link_statement1779 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_link_constituent_in_link_statement1781 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_link_statement1784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_link_statement1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_member_expression_in_link_consumer1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_member_expression_in_link_providers1852 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_link_providers1856 = new BitSet(new long[]{0x0000200000000000L,0x0011000000000000L});
	public static final BitSet FOLLOW_member_expression_in_link_providers1859 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_check_statement_in_link_constituent1871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_annotation1887 = new BitSet(new long[]{0x0000200000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_annotation1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_annotation1894 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_namevalue_in_annotation1896 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
	public static final BitSet FOLLOW_98_in_annotation1899 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_namevalue_in_annotation1901 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
	public static final BitSet FOLLOW_97_in_annotation1905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_supports_opt1942 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_supports_opt1946 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_supports_opt1949 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_supports_opt1953 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_113_in_inhibits_opt1985 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_inhibits_opt1989 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_inhibits_opt1992 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_inhibits_opt1996 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_111_in_extends_opt2028 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_extends_opt2032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_because_opt2069 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_because_rationale_in_because_opt2071 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_because_opt2074 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_because_rationale_in_because_opt2076 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_because_rationale2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_because_rationale2105 = new BitSet(new long[]{0x0000200000000000L,0x0011000200000000L});
	public static final BitSet FOLLOW_because_arguments_in_because_rationale2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_because_rationale2110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_member_expression_in_because_arguments2145 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_because_arguments2148 = new BitSet(new long[]{0x0000200000000000L,0x0011000000000000L});
	public static final BitSet FOLLOW_member_expression_in_because_arguments2152 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_parameters2183 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_parameters2186 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_parameters2190 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_member_expression_in_arguments2221 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_arguments2224 = new BitSet(new long[]{0x0000200000000000L,0x0011000000000000L});
	public static final BitSet FOLLOW_member_expression_in_arguments2228 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namevalue2259 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_namevalue2261 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_expression_in_namevalue2263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_expression_in_expression2297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subsetof_expression_in_inner_expression2324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOr_expression_in_subsetof_expression2334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_SUBSETOF_in_subsetof_expression2337 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_logicalOr_expression_in_subsetof_expression2340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_logicalAnd_expression_in_logicalOr_expression2352 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_DIS_in_logicalOr_expression2355 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_logicalAnd_expression_in_logicalOr_expression2358 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_bitwiseOr_expression_in_logicalAnd_expression2370 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_CON_in_logicalAnd_expression2373 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_bitwiseOr_expression_in_logicalAnd_expression2376 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_bitwiseXor_expression_in_bitwiseOr_expression2388 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_IOR_in_bitwiseOr_expression2391 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_bitwiseXor_expression_in_bitwiseOr_expression2394 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_bitwiseAnd_expression_in_bitwiseXor_expression2406 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_XOR_in_bitwiseXor_expression2409 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_bitwiseAnd_expression_in_bitwiseXor_expression2412 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_equality_expresion_in_bitwiseAnd_expression2424 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_AND_in_bitwiseAnd_expression2427 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_equality_expresion_in_bitwiseAnd_expression2430 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_relational_expresion_in_equality_expresion2442 = new BitSet(new long[]{0x0000000100000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_set_in_equality_expresion2445 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_relational_expresion_in_equality_expresion2454 = new BitSet(new long[]{0x0000000100000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_additive_expression_in_relational_expresion2466 = new BitSet(new long[]{0x00C0018000000002L});
	public static final BitSet FOLLOW_set_in_relational_expresion2469 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_additive_expression_in_relational_expresion2486 = new BitSet(new long[]{0x00C0018000000002L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2504 = new BitSet(new long[]{0x0000000000000022L,0x0000000000400000L});
	public static final BitSet FOLLOW_set_in_additive_expression2507 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2516 = new BitSet(new long[]{0x0000000000000022L,0x0000000000400000L});
	public static final BitSet FOLLOW_unary_expresion_in_multiplicative_expression2529 = new BitSet(new long[]{0x0C00000040000002L});
	public static final BitSet FOLLOW_set_in_multiplicative_expression2532 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_unary_expresion_in_multiplicative_expression2545 = new BitSet(new long[]{0x0C00000040000002L});
	public static final BitSet FOLLOW_set_in_unary_expresion2557 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_unary_expresion_in_unary_expresion2566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_unary_expresion2571 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_unary_expresion_in_unary_expresion2575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_unary_expresion2593 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_unary_expresion_in_unary_expresion2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_unary_expresion2615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_primary_expression2625 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_inner_expression_in_primary_expression2628 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_primary_expression2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_member_expression_in_primary_expression2636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary_expression2641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_member_part_in_member_expression2651 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_member_expression2654 = new BitSet(new long[]{0x0000200000000000L,0x0011000000000000L});
	public static final BitSet FOLLOW_member_part_in_member_expression2656 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_member_part2681 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_member_part2683 = new BitSet(new long[]{0x0004200000500020L,0x0011010300604004L});
	public static final BitSet FOLLOW_member_args_in_member_part2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_member_part2688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_member_part2712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_116_in_member_part2734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_member_part2756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_member_args2781 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_member_args2784 = new BitSet(new long[]{0x0004200000500020L,0x0011010100604004L});
	public static final BitSet FOLLOW_expression_in_member_args2787 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_104_in_literal2799 = new BitSet(new long[]{0x0004000000100000L,0x0000030000204000L});
	public static final BitSet FOLLOW_literal_set_in_literal2803 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_literal2806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_LITERAL_in_literal2828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_LITERAL_in_literal2849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_literal2871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_literal2892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_literal_set2916 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_literal_set2919 = new BitSet(new long[]{0x0004000000100000L,0x0000010000204000L});
	public static final BitSet FOLLOW_literal_in_literal_set2922 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_declarational_statement_in_synpred2_Grasp525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_requirement_statement_in_synpred4_Grasp572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qattribute_statement_in_synpred5_Grasp577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_template_statement_in_synpred6_Grasp582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_template_statement_in_synpred24_Grasp955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_provides_statement_in_synpred25_Grasp960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_requires_statement_in_synpred26_Grasp965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_statement_in_synpred27_Grasp970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compositional_statement_in_synpred47_Grasp1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_layer_statement_in_synpred48_Grasp1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_component_statement_in_synpred49_Grasp1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_connector_statement_in_synpred50_Grasp1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compositional_statement_in_synpred56_Grasp1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compositional_statement_in_synpred67_Grasp1738 = new BitSet(new long[]{0x0000000000000002L});
}
