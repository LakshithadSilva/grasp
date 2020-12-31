/**
 * Interface for a LINK element.
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


public interface ILink extends IFirstClass, IBecause {
	IRequires getConsumer();
	List<IProvides> getProviders();
	void attachConsumer(IFirstClass consumer) throws ModelException;
	void attachProvider(IFirstClass provider) throws ModelException;
}
