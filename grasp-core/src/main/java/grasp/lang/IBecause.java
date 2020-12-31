/**
 * This interface is implemented by elements that can be tied to one or more
 * rationales. Basically any element that has the 'because' clause.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.Collection;
import java.util.List;


public interface IBecause {
	Collection<ICausalContext> getCausalContexts();
	void addCausalContext(ICausalContext causal) throws ModelException;
	void addCausalContext(IRationale rationale, List<IFirstClass> arguments) throws ModelException;
}
