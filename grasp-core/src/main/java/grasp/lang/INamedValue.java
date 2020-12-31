/**

 * Interface for a name-value pair object (i.e. in Annotations).
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public interface INamedValue extends IElement, IHasExpression {
	String getName();
	void setName(String name);
}
