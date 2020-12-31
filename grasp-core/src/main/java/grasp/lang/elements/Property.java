/**
 * Implements the PROPERTY element.
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
import grasp.lang.IProperty;


class Property extends AbstractHasExpressionBecause implements IProperty {
	//
	// Constructors
	//
	public Property(IArchitecture model) {
		super(ElementSpecifier.PROPERTY, model);
	}

	public Property(IArchitecture model, String name) {
		super(ElementSpecifier.PROPERTY, model, name);
	}
}
