/**
 * Implements the TEMPLATE element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IArchitecture;
import grasp.lang.ISyntaxNode;
import grasp.lang.ITemplate;


class Template extends AbstractHasParameters implements ITemplate {
	//
	// Fields
	//
	private ISyntaxNode payload = null;

	//
	// Constructors
	//
	public Template(IArchitecture model) {
		super(ElementSpecifier.TEMPLATE, model);
	}

	public Template(IArchitecture model, String name) {
		super(ElementSpecifier.TEMPLATE, model, name);
	}

	//
	// ITemplate implementation
	//
	@Override
	public ISyntaxNode getPayload() {
		return this.payload;
	}

	@Override
	public void setPayload(ISyntaxNode payload) {
		this.payload = payload;
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		assert (this.payload != null);
		super.serialize(writer, parent);
		// Write payload
		Node node = writer.writeNode(parent, XmlSchema.PAYLOAD.tag());
		writer.writeNodeAttribute(node, XmlSchema.AT_ASTNODE.tag(), this.payload.getChildren().get(0).toString());
		return;
	}
}
