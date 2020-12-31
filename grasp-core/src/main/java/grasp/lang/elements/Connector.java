/**
 * Implements the CONNECTOR element.
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
import grasp.lang.IConnector;
import grasp.lang.ITemplate;


class Connector extends AbstractInstantiable implements IConnector {
	//
	// Constructors
	//
	public Connector(IArchitecture model) {
		super(ElementSpecifier.CONNECTOR, model);
	}

	public Connector(IArchitecture model, String name) {
		super(ElementSpecifier.CONNECTOR, model, name);
	}

	public Connector(IArchitecture model, String name, ITemplate template) {
		super(ElementSpecifier.CONNECTOR, model, name, template);
	}
}
