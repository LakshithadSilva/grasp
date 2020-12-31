/**
 * Base class for implementing exceptions thrown when performing
 * mutable operations on a Grasp model (i.e. architecture graph). 
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2013/03/23
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class ModelException extends RuntimeException {
	//
	// Fields
	//
	private static final long serialVersionUID = 0L;
	
	//
	// Constructors
	//
	public ModelException(String message, Object... args) {
		super(String.format(message, args));
	}
	
	//
	// Public implementation
	//
	public String message() {
		return this.getMessage();
	}
}
