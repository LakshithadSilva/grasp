/**
 * Implements a name-value object.
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

import grasp.lang.IExpression;
import grasp.lang.INamedValue;


class NamedValue extends AbstractHasExpressionElement implements INamedValue {
	//
	// Fields
	//
	private String name;

	//
	// Constructors
	//
	public NamedValue() {
		super(ElementSpecifier.NAMEDVALUE);
	}

	public NamedValue(String name, IExpression expression) {
		super(ElementSpecifier.NAMEDVALUE);
		this.name = name;
		setExpression(expression);
	}

	//
	// INamedValue implementation
	//
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write the name
		assert (this.name != null);
		writer.writeNodeAttribute(parent, XmlSchema.AT_NAME.tag(), this.name);
	}
}
