/**
 * Implements IError for evaluation errors by extending AbstractCompilerError.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class EvaluatorError extends AbstractCompilerError {
	//
	// Constructors
	//
	public EvaluatorError(String message, Object... args) {
		super(null, 0, 0, 0, 0, message, args);
	}

	//
	// IError implementation
	//
	@Override
	public String toString() {
		return String.format("%s.", this.message);
	}
}
