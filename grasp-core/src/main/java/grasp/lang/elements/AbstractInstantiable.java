/**
 * Abstract class that provides base implementation for IInstantiable.
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
import java.util.Collections;
import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IArchitecture;
import grasp.lang.IFirstClass;
import grasp.lang.IInstantiable;
import grasp.lang.IInterface;
import grasp.lang.IProvides;
import grasp.lang.IRequires;
import grasp.lang.ITemplate;
import grasp.lang.ModelException;


abstract class AbstractInstantiable extends AbstractBecause implements IInstantiable {
	//
	// Constants
	//
	private static final String TYPE_CALLINOUT = "__stdcall__";

	private static final String ERR_NOTEMPLATE = "A template must be assigned before specifying arguments";
	private static final String ERR_NOTATEMPLATE = "Instantiation of '%s' does not refer to a template";
	private static final String ERR_HASTEMPLATE = "A template has already been associated with '%s'";
	private static final String ERR_ARGCOUNTMISMATCH = "Argument count differs from what is required by template '%s'";
	private static final String ERR_PARAMNAMEEXISTS = "Parameter name '%s' already exists";
	private static final String ERR_NOINTERFACETYPE = "Interface type property has not been set for element '%s'";
	private static final String ERR_HASREQUIRESTYPE = "A 'requires' interface of type '%s' already exists";
	private static final String ERR_HASPROVIDESTYPE = "A 'provides' interface of type '%s' already exists";
	private static final String ERR_NULLARGMENT = "A null argument is not valid";

	//
	// Fields
	//
	private final IProvides in = getModel().newProvides(TYPE_CALLINOUT, IInstantiable.CALL_INCOMING_INTERFACE);
	private final IRequires out = getModel().newRequires(TYPE_CALLINOUT, IInstantiable.CALL_OUTGOING_INTERFACE);
	private List<IFirstClass> arguments;
	private ITemplate template;

	//
	// Constructors
	//
	public AbstractInstantiable(ElementSpecifier elementSpecifier, IArchitecture model) {
		super(elementSpecifier, model);
		setupStdInterfaces();
	}

	public AbstractInstantiable(ElementSpecifier elementSpecifier, IArchitecture model, String name) {
		super(elementSpecifier, model, name);
		setupStdInterfaces();
	}

	public AbstractInstantiable(ElementSpecifier type, IArchitecture model,
			String name, ITemplate template) throws ModelException {
		this(type, model, name);
		setTemplate(template);
	}

	public AbstractInstantiable(ElementSpecifier type, IArchitecture model,
			String name, ITemplate template,
			List<IFirstClass> arguments) throws ModelException {
		this(type, model, name, template);
		setArguments(arguments);
	}

	//
	// IFirstClass implementation
	//
	@Override
	public void addChild(IFirstClass child) throws ModelException {
		// Perform special handling if child is an interface
		ElementSpecifier type = child.getElementSpecifier();
		if (type == ElementSpecifier.REQUIRES || type == ElementSpecifier.PROVIDES) {
			assert (child instanceof IInterface);
			IInterface intf = (IInterface) child;
			// Check to ensure that interface type is not null
			if (intf.getInterfaceType() == null) {
				throw makeError(ERR_NOINTERFACETYPE, child.getName());
			}
			// Check that same type of 'requires' interface does not already exist
			if (type == ElementSpecifier.REQUIRES && hasInterface(intf, ElementSpecifier.REQUIRES)) {
				throw makeError(ERR_HASREQUIRESTYPE, intf.getInterfaceType());
			}
			// Check that same type of 'provides' interface does not already exist
			if (type == ElementSpecifier.REQUIRES && hasInterface(intf, ElementSpecifier.REQUIRES)) {
				throw makeError(ERR_HASPROVIDESTYPE, intf.getInterfaceType());
			}
		}
		// Call superclass implementation to continue
		super.addChild(child);
	}
	
	//
	// IInstantiable implementation
	//
	@Override
	public ITemplate getTemplate() {
		return this.template;
	}

	@Override
	public IRequires getOut() {
		return this.out;
	}

	@Override
	public IProvides getIn() {
		return this.in;
	}

	@Override
	public void setTemplate(ITemplate template) throws ModelException {
		// Check validity of base template
		if (template.getElementSpecifier() != ElementSpecifier.TEMPLATE) {
			throw makeError(ERR_NOTATEMPLATE, getName());
		}
		// Check if the template exists in the model
		assert (template.getReferencingName() != null);
		ensureNameExists(getModel(), template.getReferencingName());
		// Check if we already have a template assigned
		if (this.template != null && this.template != template) {
			throw makeError(ERR_HASTEMPLATE, getName());
		}
		// Setup template and argument list
		if (this.template == null) {
			// Create matching argument list with null argument values and place
			// corresponding parameter names from the template in the symbol table
			assert (this.arguments == null);
			this.arguments = new ArrayList<IFirstClass>(template.getParameters().size());
			for (int ordinal = 0; ordinal < template.getParameters().size(); ++ordinal) {
				String param = template.getParameters().get(ordinal);
				if (symbolLookupName(param)) {
					throw makeError(ERR_PARAMNAMEEXISTS, param);
				}
				symbolPut(param, null);
				this.arguments.add(ordinal, null);
			}
			// Lastly, attach template
			this.template = template;
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
		// Prior to setting up arguments, the base template must be specified
		// Check if template has been specified
		if (this.template == null) {
			throw makeError(ERR_NOTEMPLATE);
		}
		// Check argument count matches parameter count of template
		if (arguments.size() != this.template.getParameters().size()) {
			throw makeError(ERR_ARGCOUNTMISMATCH, this.template.getName());
		}
		// Check if the list contains null arguments
		if (arguments.contains(null)) {
			throw makeError(ERR_NULLARGMENT);
		}
		// For each argument, update argument against corresponding parameter name in symbol table
		for (int ordinal = 0; ordinal <  arguments.size(); ++ordinal) {
			updateArgumentInSymbolTable(ordinal, arguments.get(ordinal));
		}
		// Update argument list
		this.arguments = arguments;
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write base
		Node basen = writer.writeNode(parent, XmlSchema.BASE.tag());
		writer.writeNodeAttribute(basen, XmlSchema.AT_REFERENCE.tag(), this.template.getQualifiedName());
		// Write argument list
		Node args = writer.writeNode(basen, XmlSchema.ARGUMENTS.tag());
		for (int i = 0; i < this.arguments.size(); ++i) {
			Node node = writer.writeNode(args, XmlSchema.ARGUMENT.tag());
			writer.writeNodeAttribute(node, XmlSchema.AT_ORDINAL.tag(), i + 1);
			writer.writeNodeAttribute(node, XmlSchema.AT_REFERENCE.tag(), this.arguments.get(i).getQualifiedName());
		}
	}
	
	//
	// Local implementation
	//
	private void setupStdInterfaces() {
		// Add standard 'in' and 'out' interfaces to body
		addChild(this.in);
		addChild(this.out);
	}
	
	private boolean hasInterface(IInterface intface, ElementSpecifier type) {
		for (IFirstClass fc : getBody(type)) {
			assert (fc.getElementSpecifier() == type);
			assert (fc instanceof IInterface);
			if (intface.getInterfaceType().equals(((IInterface) fc).getInterfaceType())) {
				return true;
			}
		}
		return false;
	}

	private void updateArgumentInSymbolTable(int ordinal, IFirstClass argument) {
		assert (symbolLookupName(this.template.getParameters().get(ordinal)));
		symbolPut(this.template.getParameters().get(ordinal), argument);		
	}
}
