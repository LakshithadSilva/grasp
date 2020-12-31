/**
 * Interface for a rationale association context (i.e causal context)
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2013/05/09
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public interface ICausalContext extends IHasArguments, IElement {
	IRationale getRationale();
	void setRationale(IRationale rationale) throws ModelException;
}
