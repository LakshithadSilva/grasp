/**
 * Implements the QUALITY_ATTRIBUTE element.
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
import grasp.lang.IRequirement;


class Requirement extends AbstractHasExpressionFirstClass implements IRequirement {
	//
	// Constructor
	//
	public Requirement(IArchitecture model) {
		super(ElementSpecifier.REQUIREMENT, model);
	}

	public Requirement(IArchitecture model, String name) {
		super(ElementSpecifier.REQUIREMENT, model, name);
	}
}
