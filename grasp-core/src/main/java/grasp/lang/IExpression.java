/**
 * Interface for a Grasp expression.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;



public interface IExpression extends IElement {
	String getText();
	IType<?> getValue();
}
