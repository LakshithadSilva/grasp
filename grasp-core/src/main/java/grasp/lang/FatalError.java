/**
 * Implements IError for fatal errors by extending AbstractError.
 * These are usually exceptions during compilation.
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


public class FatalError extends AbstractCompilerError {
	//
	// Fields
	//
	private final Exception exception;
	
	//
	// Constructors
	//
	public FatalError(ISource source, String message, Exception exception) {
		super(source, 0, 0, 0, 0, message);
		this.exception = exception;
	}

	//
	// IError implementation
	//
	@Override
    public String toString() {
    	return String.format("%s : %s [%s].", this.source.getName(), this.message, this.exception.getMessage());
	}
}
