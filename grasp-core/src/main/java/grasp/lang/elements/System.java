/**
 * Implements the SYSTEM element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import grasp.lang.IArchitecture;
import grasp.lang.ISystem;


class System extends AbstractBecause implements ISystem {
	//
	// Constructors
	//
	public System(IArchitecture model) {
		super(ElementSpecifier.SYSTEM, model);
	}

	public System(IArchitecture model, String name) {
		super(ElementSpecifier.SYSTEM, model, name);
	}
}
