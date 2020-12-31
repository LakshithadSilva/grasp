/**
 * This interface needs to be implemented by elements that have expressions.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public interface IHasExpression {
	boolean isInitialized();
	Object getValue();
	IExpression getExpression();
	void setExpression(IExpression expression);
}
