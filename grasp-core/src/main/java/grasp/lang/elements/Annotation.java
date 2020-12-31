/**
 * Implements the ANNOTATION element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IAnnotation;
import grasp.lang.INamedValue;
import grasp.lang.IEvaluationContext;
import grasp.lang.ModelException;


class Annotation extends AbstractElement implements IAnnotation {
	//
	// Fields
	//
	private final List<INamedValue> values = new ArrayList<INamedValue>();
	private String handler;

	//
	// Constructors
	//
	public Annotation() {
		super(ElementSpecifier.ANNOTATION);
	}

	public Annotation(String handler) {
		super(ElementSpecifier.ANNOTATION);
		this.handler = handler;
	}

	//
	// IAnnotation implementation
	//
	@Override
	public String getHandler() {
		return this.handler;
	}

	@Override
	public Collection<INamedValue> getNamedValues() {
		return Collections.unmodifiableCollection(this.values);
	}

	@Override
	public void setHandler(String handler) {
		this.handler = handler;
	}
	
	@Override
	public void addNamedValue(INamedValue nv) {
		this.values.add(nv);
	}

	//
	// IElement implementation
	//
	@Override
	public void evaluate(IEvaluationContext context) throws ModelException {
		super.evaluate(context);
		// Evaluate all associated name-value pairs. These name-value pairs
		// are given the evaluation context received by the annotation
		for (INamedValue nv : this.values) {
			nv.evaluate(context);
		}
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write the contents of the annotation here
		writer.writeNodeAttribute(parent, XmlSchema.AT_HANDLER.tag(), this.handler != null ? this.handler : XmlSchema.AT_EMPTY.tag());
		for (INamedValue nv : this.values) {
			Node node = writer.writeNode(parent, nv.getElementSpecifier().name());
			nv.serialize(writer, node);
		}
	}
}
