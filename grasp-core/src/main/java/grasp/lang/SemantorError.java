/**
 * Implements IError for semantic errors by extending AbstractCompilerError.
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


public class SemantorError extends AbstractCompilerError {
	//
	// Constructors
	//
	public SemantorError(ISource source, ISyntaxNode node, String message, Object... args) {
		super(source, node.getLine(), node.getStartPosition(), node.getLine(), node.getEndPosition(), message, args);
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
