/**
 * This interface is implemented by elements that accept parameters.
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


public interface IHasParameters {
	List<String> getParameters();
	void addParameter(String param);
}
