/**
 * Implementation for the rationale invoker component
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/07/07
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.ArrayList;
import java.util.List;


public class RationaleInvoker implements IRationaleInvoker {
	//
	// Fields
	//
	private final IRationale rationale = null;
	private final List<IFirstClass> arguments = new ArrayList<IFirstClass>();

	//
	// Constructors
	//
	public RationaleInvoker() {
	}
	
	//
	// IRationaleInvoker implementation
	//
	@Override
	public IRationale getRationale() {
		return this.rationale;
	}

	@Override
	public List<IFirstClass> getArguments() {
		return this.arguments;
	}
}
