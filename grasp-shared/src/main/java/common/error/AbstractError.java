/**
 * Abstract implementation of a plain error object.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.error;

import common.logging.ILogger;


public abstract class AbstractError implements IError {
	//
	// Fields
	//
	protected final String message;

	//
	// Constructors
	//
	public AbstractError(String message, Object... args) {
		this.message = String.format(message, args);
	}

	//
	// IError implementation
	//
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void report(ILogger log) {
		log.print_error(this.toString());
	}
}
