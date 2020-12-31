/**
 * Implements the REQUIRES element.
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
import grasp.lang.IRequires;


class Requires extends AbstractInterface implements IRequires {
	//
	// Constructors
	//
	public Requires(IArchitecture model) {
		super(ElementSpecifier.REQUIRES, model);
	}

	public Requires(IArchitecture model, String interfaceType) {
		super(ElementSpecifier.REQUIRES, model, interfaceType);
	}

	public Requires(IArchitecture model, String interfaceType, String name) {
		super(ElementSpecifier.REQUIRES, model, interfaceType, name);
	}
}
