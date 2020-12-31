/**
 * Interface for components handling different name declarations.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public interface IDeclarator {
	void declare() throws SemantorException, ModelException;
}
