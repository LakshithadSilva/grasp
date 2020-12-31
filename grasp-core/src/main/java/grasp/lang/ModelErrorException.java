/**
 * Implements the exception that describes an error when performing mutable
 * operations on a Grasp model (i.e.an architecture graph). An error
 * implies that the operation cannot be successfully completed. Otherwise
 * a warning exception should be thrown instead.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2013/03/23
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class ModelErrorException extends ModelException {
	//
	// Fields
	//
	private static final long serialVersionUID = 0L;
	
	//
	// Constructors
	//
	public ModelErrorException(String message, Object... args) {
		super(message, args);
	}
}
