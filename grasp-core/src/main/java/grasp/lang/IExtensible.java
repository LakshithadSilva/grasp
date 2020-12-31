/**
 * This interface is implemented by elements that can extend
 * other elements of the same type.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public interface IExtensible {
	void setExtendee(IFirstClass extendee) throws ModelException;
	IFirstClass getExtendee();
}
