/**
 * Interface for the rationale invoker component
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/07/07
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.List;


public interface IRationaleInvoker {
	IRationale getRationale();
	List<IFirstClass> getArguments();
}
