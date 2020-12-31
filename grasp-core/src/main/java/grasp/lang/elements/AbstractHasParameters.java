/**
 * Abstract class that provides base implementation for IHasParameters.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IArchitecture;
import grasp.lang.IHasParameters;


abstract class AbstractHasParameters extends AbstractExtensible implements IHasParameters {
	//
	// Fields
	//
	private final List<String> params = new ArrayList<String>();

	//
	// Constructors
	//
	public AbstractHasParameters(ElementSpecifier elementSpecifier, IArchitecture model) {
		super(elementSpecifier, model);
	}

	public AbstractHasParameters(ElementSpecifier elementSpecifier, IArchitecture model, String name) {
		super(elementSpecifier, model, name);
	}

	//
	// IHasParameters implementation
	//
	@Override
	public List<String> getParameters() {
		return this.params;
	}
	
	@Override
	public void addParameter(String param) {
		symbolPut(param, null);
		this.params.add(param);
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write list of parameters
		Node args = writer.writeNode(parent, XmlSchema.PARAMETERS.tag());
		for (int i = 0; i < this.params.size(); ++i) {
			Node node = writer.writeNode(args, XmlSchema.PARAM.tag());
			writer.writeNodeAttribute(node, XmlSchema.AT_ORDINAL.tag(), i+1);
			writer.writeNodeAttribute(node, XmlSchema.AT_NAME.tag(), this.params.get(i));
		}
	}
}
