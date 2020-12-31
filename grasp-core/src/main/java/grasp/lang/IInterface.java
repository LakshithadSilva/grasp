/**
 * Base interface for Grasp interface elements.
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


public interface IInterface extends IFirstClass {
	List<ILink> getLinks();
	int getMaxdeg();
	String getInterfaceType();
	boolean hasLinks();
	boolean hasCapacity();
	boolean isCompatible(IInterface other);
	void setMaxdeg(int maxdeg);
	void setInterfaceType(String interfaceType);
}
