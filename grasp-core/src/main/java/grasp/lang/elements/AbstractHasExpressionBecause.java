/**
 * One of the abstract classes that provide base implementation for
 * IHasExpression. This class inherits from AbstractBecause, therefore
 * provides base functionality for first-class elements that have the
 * the 'because' clause along with an expression.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;
import grasp.lang.IArchitecture;
import grasp.lang.IHasExpression;
import grasp.lang.IExpression;
import grasp.lang.IEvaluationContext;
import grasp.lang.ModelException;


abstract class AbstractHasExpressionBecause extends AbstractBecause implements IHasExpression {
	//
	// Fields
	//
	private DelegateHasExpression delegate = new DelegateHasExpression();

	//
	// Constructor
	//
	public AbstractHasExpressionBecause(ElementSpecifier elementSpecifier, IArchitecture model) {
		super(elementSpecifier, model);
	}
	
	public AbstractHasExpressionBecause(ElementSpecifier elementSpecifier, IArchitecture model, String name) {
		super(elementSpecifier, model, name);
	}

	//
	// IHasExpression implementation
	//
	@Override
	public boolean isInitialized() {
		return this.delegate.isInitialized();
	}

	@Override
	public Object getValue() {
		return this.delegate.getValue();
	}

	@Override
	public IExpression getExpression() {
		return this.delegate.getExpression();
	}

	@Override
	public void setExpression(IExpression expression) {
		this.delegate.setExpression(expression);
	}

	//
	// IElement implementation
	//
	@Override
	public void evaluate(IEvaluationContext context) throws ModelException {
		super.evaluate(context);
		// Pass on the incoming context to the delegate as expressions
		// are evaluated in the context of element that contains the
		// owning element of the expression
		this.delegate.evaluate(context);
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		this.delegate.serialize(writer, parent);
	}
}
