/**
 * Implements the RATIONALE element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.ArrayList;
import java.util.List;

import grasp.lang.IArchitecture;
import grasp.lang.IRationale;
import grasp.lang.IReason;


class Rationale extends AbstractHasParameters implements IRationale {
	//
	// Fields
	//
	private final List<IReason> reasons = new ArrayList<IReason>();

	//
	// Constructors
	//
	public Rationale(IArchitecture model) {
		super(ElementSpecifier.RATIONALE, model);
	}

	public Rationale(IArchitecture model, String name) {
		super(ElementSpecifier.RATIONALE, model, name);
	}

	//
	// IRationale implementation
	//
	@Override
	public List<IReason> getReasons() {
		return this.reasons;
	}
}
