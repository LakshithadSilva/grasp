/**
 * Interface for a runtime context in which a Grasp element is evaluated.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public interface IEvaluationContext {
	IElement caller();
	IEvaluationContext innerContext();
}
