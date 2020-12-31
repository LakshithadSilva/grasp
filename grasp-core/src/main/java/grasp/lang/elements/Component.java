/**
 * Implements the COMPONENT element.
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
import grasp.lang.IComponent;
import grasp.lang.ITemplate;


class Component extends AbstractInstantiable implements IComponent {
	//
	// Constructors
	//
	public Component(IArchitecture model) {
		super(ElementSpecifier.COMPONENT, model);
	}

	public Component(IArchitecture model, String name) {
		super(ElementSpecifier.COMPONENT, model, name);
	}

	public Component(IArchitecture model, String name, ITemplate template) {
		super(ElementSpecifier.COMPONENT, model, name, template);
	}
}
