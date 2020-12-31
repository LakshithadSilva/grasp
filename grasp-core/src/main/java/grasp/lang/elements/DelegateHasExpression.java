/**
 * This class implements the IHasExpression interface. This class is not
 * a base class but instead used as target for delegating the IHasInterface
 * functionality of other classes implementing IHasInterface. Hence core
 * logic of this interface is implemented here.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2014/11/01
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IEvaluationContext;
import grasp.lang.IExpression;
import grasp.lang.IHasExpression;
import grasp.lang.ModelException;
import grasp.lang.elements.AbstractSerializable.XmlSchema;


class DelegateHasExpression implements IHasExpression {
	//
	// Fields
	//
	private IExpression expression = null;

	//
	// IHasExpression implementation
	//
	@Override
	public boolean isInitialized() {
		return this.expression != null;
	}

	@Override
	public Object getValue() {
		return isInitialized() ? this.expression.getValue() : null;
	}

	@Override
	public IExpression getExpression() {
		return this.expression;
	}

	@Override
	public void setExpression(IExpression expression) {
		this.expression = expression;
	}
	
	//
	// Evaluate and serialize methods
	//
	public void evaluate(IEvaluationContext context) throws ModelException {
		// Evaluate expression
		// Expression object is null for statements where an expression is optional
		if (isInitialized()) {
			assert (expression != null);
			this.expression.evaluate(context);
		}
	}

	public void serialize(IXmlWriter writer, Node parent) {
		// Serialize expression
		// Expression object is null for statements where an expression is optional
		if (isInitialized()) {
			assert (expression != null);
			Node node = writer.writeNode(parent, XmlSchema.EXPRESSION.name());
			this.expression.serialize(writer, node);
		}
	}
}
