/**
 * Interface for a TEMPLATE element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public interface ITemplate extends IFirstClass, IExtensible, IHasParameters {
	ISyntaxNode getPayload();
	void setPayload(ISyntaxNode payload);
}
