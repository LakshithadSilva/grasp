/**
 * Implements the REASON element.
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
import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IArchitecture;
import grasp.lang.IFirstClass;
import grasp.lang.IReason;
import grasp.lang.IEvaluationContext;
import grasp.lang.ModelException;


class Reason extends AbstractHasExpressionFirstClass implements IReason {
	//
	// Fields
	//
	private final List<IFirstClass> supports = new ArrayList<IFirstClass>();
	private final List<IFirstClass> inhibits = new ArrayList<IFirstClass>();
	
	//
	// Constructors
	//
	public Reason(IArchitecture model) {
		super(ElementSpecifier.REASON, model);
	}

	public Reason(IArchitecture model, String name) {
		super(ElementSpecifier.REASON, model, name);
	}

	//
	// IReason
	//
	@Override
	public List<IFirstClass> getInhibits() {
		return this.inhibits;
	}

	//
	// ISupports implementation
	//
	@Override
	public List<IFirstClass> getSupports() {
		return this.supports;
	}

	//
	// IElement implementation
	//
	@Override
	public void evaluate(IEvaluationContext context) throws ModelException {
		super.evaluate(context);
		// TODO: evaluate supports
		// TODO: evaluate inhibits
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// TODO: Write supports
		// TODO: Write inhibits
	}
}
