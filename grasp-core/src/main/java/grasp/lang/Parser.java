/**
 * Implementation for the parser component of the Grasp compiler.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.io.IOException;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import common.error.ErrorReport;
import common.error.IErrorReport;
import common.io.ISource;
import common.logging.ILogger;
import grasp.lang.grammar.GraspParser;


public class Parser extends GraspParser implements IParser {
	//
	// Constants
	//
	private static final String ERR_SYNTAX = "Syntax error(s) encountered";
	private static final String ERR_BADSOURCE = "Unable to read source";
	private static final String ERR_UNKNOWN = "Unknown parser error";

	//
	// Fields
	//
	private final IErrorReport errors = new ErrorReport();
	private ISource source = null;
	private ILogger log = null;
	
	//
	// Constructors
	//
	public Parser() {
		this(new CommonTokenStream());
	}
	public Parser(TokenStream input) {
		super(input);
	}

	//
	// IParser implementation
	//
	@Override
	public ISyntaxTree parse(ISource source, ILogger log) {
		this.source = source;
		this.log = log;
		this.errors.clear();
		this.log.trace("Parsing source...");
		return doParse();
	}

	@Override
	public IErrorReport errors() {
		return this.errors;
	}

	//
	// Override superclass implementation
	//
	@Override
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		this.log.trace("Parser error: " + e.getMessage());
		int line = e.token.getLine();
		int column = e.token.getCharPositionInLine() + 1;
		int columnEnd = e.token.getText() == null ? column : e.token.getText().length() + column - 1;
		this.errors.add(new SyntaxError(this.source, line, column, columnEnd, getErrorMessage(e, tokenNames)));
	}

	//
	// Local implementation
	//
	private ISyntaxTree doParse() {
		// Setup an adaptor for creating ISyntaxNode type nodes for the tree
		TreeAdaptor adaptor = new CommonTreeAdaptor() {
			public Object create(Token payload) {
				return new SyntaxNode(payload);
			}
		};
		// Start parsing the source
		try {
			Lexer lexer = new Lexer(this.source, this.errors, this.log);
			setTokenStream(new CommonTokenStream(lexer));
			this.setTreeAdaptor(adaptor);
			start_return ret = start();
			return this.errors.isAny() ? null : new SyntaxTree((ISyntaxNode) ret.getTree(), this.source);
		} catch (RecognitionException e) {
			this.errors.add(new FatalError(this.source, ERR_SYNTAX, e));
		} catch (IOException e) {
			this.errors.add(new FatalError(this.source, ERR_BADSOURCE, e));
		} catch (Exception e) {
			this.errors.add(new FatalError(this.source, ERR_UNKNOWN, e));		
		}
		return null;
	}
}
