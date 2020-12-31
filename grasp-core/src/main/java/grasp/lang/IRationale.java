/**
 * Interface for a RATIONALE element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.List;


public interface IRationale extends IFirstClass, IExtensible, IHasParameters {
	List<IReason> getReasons();
}
