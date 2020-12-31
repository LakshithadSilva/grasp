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

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.RecognitionException;

import common.error.IErrorReport;
import common.io.ISource;
import common.logging.ILogger;


import grasp.lang.grammar.GraspLexer;


public class Lexer extends GraspLexer implements ILexer {
	//
	// Fields
	//
	private final ISource source;
	private final IErrorReport errors;
	private final ILogger log;

	//
	// Constructors
	//
	public Lexer(ISource source, IErrorReport errors, ILogger log) throws IOException {
		super(new ANTLRReaderStream(source.getReader()));
		this.errors = errors;
		this.source = source;
		this.log = log;
	}

	//
	// Superclass overriding implementation
	//
	@Override
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		this.log.trace("Lexer error: " + e.getMessage());
		int line = e.token.getLine();
		int column = e.token.getCharPositionInLine();
		int columnEnd = e.token.getText() == null ? 0 : e.token.getText().length() + column - 1;
		this.errors.add(new SyntaxError(this.source, line, column, columnEnd, getErrorMessage(e, tokenNames)));
	}

	//
	// ILexer implementation
	//
	@Override
	public Object readToken() {
		return nextToken();
	}

	@Override
	public IErrorReport errors() {
		return this.errors;
	}
}
