/**
 * Implements a rationale association context (i.e causal context)
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2013/05/09
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.ICausalContext;
import grasp.lang.IEvaluationContext;
import grasp.lang.IFirstClass;
import grasp.lang.IRationale;
import grasp.lang.ModelException;


class CausalContext extends AbstractElement implements ICausalContext {
	//
	// Constants
	//
	private static final String ERR_NOTARATIONALE = "Invalid rationale element in causal context";
	private static final String ERR_HASRATIONALE = "A rationale has already been associated with causal context";
	private static final String ERR_NORATIONALE = "A rationale must be assigned before specifying arguments in a causal context";
	private static final String ERR_ARGCOUNTMISMATCH = "Argument count differs from what is required by rationale '%s'";
	private static final String ERR_NULLARGMENT = "A null argument is not valid";

	//
	// Fields
	//
	private IRationale rationale;
	private List<IFirstClass> arguments;

	//
	// Constructors
	//
	public CausalContext() {
		super(ElementSpecifier.CAUSALCONTEXT);
	}

	public CausalContext(IRationale rationale) throws ModelException {
		super(ElementSpecifier.CAUSALCONTEXT);
		setRationale(rationale);
	}

	public CausalContext(IRationale rationale, List<IFirstClass> arguments) throws ModelException {
		super(ElementSpecifier.CAUSALCONTEXT);
		setRationale(rationale);
		setArguments(arguments);
	}
	
	//
	// ICausalContext implementation
	//
	@Override
	public IRationale getRationale() {
		return this.rationale;
	}

	@Override
	public void setRationale(IRationale rationale) throws ModelException {
		// Check validity of base template
		if (rationale.getElementSpecifier() != ElementSpecifier.RATIONALE) {
			throw makeError(ERR_NOTARATIONALE); 
		}
		// Check if the rationale exists in the model
		assert (rationale.getReferencingName() != null);
		ensureNameExists(rationale.getModel(), rationale.getReferencingName());
		// Check if we already have a rationale assigned
		if (this.rationale != null && this.rationale != rationale) {
			throw makeError(ERR_HASRATIONALE);
		}
		// Setup rationale and argument list
		if (this.rationale == null) {
			// Create matching argument list with null argument values
			assert (this.arguments == null);
			this.arguments = new ArrayList<IFirstClass>(rationale.getParameters().size());
			for (int ordinal = 0; ordinal < rationale.getParameters().size(); ++ordinal) {
				this.arguments.add(ordinal, null);
			}
			// Attach rationale
			this.rationale = rationale;
		}
	}

	//
	// IHasArguments implementation
	//
	@Override
	public List<IFirstClass> getArguments() {
		return this.arguments == null ? null : Collections.unmodifiableList(this.arguments);
	}

	@Override
	public void setArguments(List<IFirstClass> arguments) throws ModelException {
		// Prior to setting up arguments, a rationale must be specified
		// Check if rationale has been specified
		if (this.rationale == null) { 
			throw makeError(ERR_NORATIONALE);
		}
		// Check argument count matches parameter count of template
		if (arguments.size() != this.rationale.getParameters().size()) {
			throw makeError(ERR_ARGCOUNTMISMATCH, this.rationale.getName());
		}
		// Check if the list contains null arguments
		if (arguments.contains(null)) {
			throw makeError(ERR_NULLARGMENT);
		}
		// Update argument list
		this.arguments = arguments;
	}

	//
	// IElement implementation
	//
	@Override
	public void evaluate(IEvaluationContext context) throws ModelException {
		super.evaluate(context);
		// TODO: Evaluate cause using rationale using given arguments
	}
	
	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write rationale and parameters
		writer.writeNodeAttribute(parent, XmlSchema.RATIONALE_REF.tag(), this.rationale != null ?
				this.rationale.getName() : XmlSchema.AT_EMPTY);
		// TODO: Write arguments
	}
}