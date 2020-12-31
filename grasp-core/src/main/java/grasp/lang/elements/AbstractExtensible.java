/**
 * Abstract class that provides base implementation for IExtensible.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IArchitecture;
import grasp.lang.IExtensible;
import grasp.lang.IFirstClass;
import grasp.lang.IHasParameters;
import grasp.lang.ModelException;


abstract class AbstractExtensible extends AbstractFirstClass implements IExtensible {
	//
	// Constants
	//
	private static final String ERR_TYPEMISMATCH = "Extending type doest not match super type";
	private static final String ERR_PARAMCOUNTMISMATCH = "Type '%s' must have the same number of parameters or more as that of super type '%s'";
	private static final String ERR_PARAMNAMESMISMATCH = "Parameters of '%s' does not match that of super type '%s'";

	//
	// Fields
	//
	private IFirstClass extendee = null;

	//
	// Constructors
	//
	public AbstractExtensible(ElementSpecifier elementSpecifier, IArchitecture model) {
		super(elementSpecifier, model);
	}
	
	public AbstractExtensible(ElementSpecifier elementSpecifier, IArchitecture model, String name) {
		super(elementSpecifier, model, name);
	}

	//
	// IExtensible implementation
	//
	@Override
	public void setExtendee(IFirstClass extendee) throws ModelException {
		assert (extendee instanceof IExtensible);
		// Check if extender and extendee are of the same type
		if (getElementSpecifier() != extendee.getElementSpecifier()) {
			throw makeError(ERR_TYPEMISMATCH);
		}
		// Check if extender's parameter count is equal or more than that of extendee
		assert (extendee instanceof IHasParameters);
		assert (this instanceof IHasParameters);
		if (mismatchedParamCount(extendee)) {
			throw makeError(ERR_PARAMCOUNTMISMATCH, getName(), extendee.getName());
		}
		// Check if extender's parameter names match those of extendee
		if (mismatchedParamNames(extendee)) {
			throw makeError(ERR_PARAMNAMESMISMATCH, getName(), extendee.getName());
		}
		// Set extendee
		this.extendee = extendee;
	}

	@Override
	public IFirstClass getExtendee() {
		return this.extendee;
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write extendee details
		Node node = writer.writeNode(parent, XmlSchema.EXTENDS.tag());
		if (this.extendee != null) {
			writer.writeNodeAttribute(node, XmlSchema.AT_REFERENCE.tag(), this.extendee.getQualifiedName());
		}
	}
	
	//
	// Local implementation
	//
	private boolean mismatchedParamCount(IFirstClass extendee) {
		IHasParameters extender = (IHasParameters) this;
		return ((IHasParameters) extendee).getParameters().size() > extender.getParameters().size();
	}
	
	private boolean mismatchedParamNames(IFirstClass extendee) {
		List<String> extendeeParams = ((IHasParameters) extendee).getParameters();
		List<String> extenderParams = ((IHasParameters) this).getParameters();
		for (int i = 0; i < extendeeParams.size(); ++i) {
			if (extendeeParams.get(i).equals(extenderParams.get(i)) == false) {
				return true;			
			}
		}
		return false;
	}
}
