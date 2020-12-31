/**
 * Implements IError for syntax errors by extending AbstractError.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import common.io.ISource;


public class SyntaxError extends AbstractCompilerError {
	//
	// Constructors
	//
	public SyntaxError(ISource source, int startRow, int startCol, int endCol, String message, Object... args) {
		super(source, startRow, startCol, startRow, endCol, message, args);
	}
	
	//
	// IError implementation
	//
	@Override
	public String toString() {
		return String.format("%s [%d, %d:%d]: %s.", this.source.getName(),
				this.startRow, this.startCol, this.endCol, this.message);
	}
}
