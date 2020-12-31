/**
 * Implements the PROVIDES element.
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
import grasp.lang.IProvides;


class Provides extends AbstractInterface implements IProvides {
	//
	// Constructors
	//
	public Provides(IArchitecture model) {
		super(ElementSpecifier.PROVIDES, model);
	}

	public Provides(IArchitecture model, String interfaceType) {
		super(ElementSpecifier.PROVIDES, model, interfaceType);
	}

	public Provides(IArchitecture model, String interfaceType, String name) {
		super(ElementSpecifier.PROVIDES, model, interfaceType, name);
	}
}
