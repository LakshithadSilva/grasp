/**
 * Implements the exception that describes a warning when performing mutable
 * operations on a Grasp model (i.e.an architecture graph). Although an
 * exception of this type is thrown to indicate a warning state, the thrower
 * must still ensure the operation can be successfully completed. Otherwise
 * an error exception must be thrown.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2013/03/23
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class ModelWarningException extends ModelException {
	//
	// Fields
	//
	private static final long serialVersionUID = 0L;
	
	//
	// Constructors
	//
	public ModelWarningException(String message, Object... args) {
		super(message, args);
	}
}
