/**
 * Interface for a LAYER element.
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


public interface ILayer extends IFirstClass, IBecause {
	List<ILayer> getOver();
	void addOver(ILayer over) throws ModelException;
}
