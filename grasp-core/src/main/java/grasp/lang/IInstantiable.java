/**
 * This interface needs to be implemented by elements that
 * are instantiated from templates.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public interface IInstantiable extends IHasArguments {
	// Fields
	String CALL_OUTGOING_INTERFACE = "out";
	String CALL_INCOMING_INTERFACE = "in";

	ITemplate getTemplate();
	IRequires getOut();
	IProvides getIn();
	void setTemplate(ITemplate base) throws ModelException;
}
