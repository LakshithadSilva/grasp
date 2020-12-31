/**
 * Abstract class that provides base implementation of IFirstClass.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;
import grasp.lang.EvaluationContext;
import grasp.lang.IAnnotation;
import grasp.lang.IArchitecture;
import grasp.lang.IElement;
import grasp.lang.IFirstClass;
import grasp.lang.IEvaluationContext;
import grasp.lang.IFunction;
import grasp.lang.ModelException;
import grasp.util.misc.HashMultimap;
import grasp.util.misc.Multimap;


 class AbstractFirstClass extends AbstractElement implements IFirstClass {
	//
	// Constants
	//
	private static final String ERR_HASPARENT = "Element '%s' already has an assigned parent element";
	private static final String ERR_HASSYMBOL = "An element with name '%s' already exists in parent context";
	private static final String ERR_NOTCONTAINABLE = "Element '%s' is not a containable type within element '%s'";
	private static final Collection<IFirstClass> emptyBody = new ArrayList<IFirstClass>();

	//
	// Fields
	//
	protected static final Map<String, IFunction> fntable = new HashMap<String, IFunction>();
	private final Collection<IAnnotation> annotations = new ArrayList<IAnnotation>();
	private final Multimap<ElementSpecifier, IFirstClass> body = new HashMultimap<ElementSpecifier, IFirstClass>();
	private IArchitecture model;
	private IFirstClass parent;
	private String name;

	//
	// Static initializers
	//
	static {
		// Initialize Grasp function table
		initfntab(AbstractFirstClass.class);
	}
	
	//
	// Static methods
	//
	protected static void initfntab(Class<? extends AbstractFirstClass> clazz) {
		for (Method m : clazz.getDeclaredMethods()) {
			if (m.isAnnotationPresent(GraspMethod.class)) {
				assert (Modifier.isPrivate(m.getModifiers()));
				IFunction fn = new Function(m);
				fntable.put(fn.name(), fn);
			}
		}		
	}
	
	//
	// Constructors
	//
	public AbstractFirstClass(ElementSpecifier elementSpecfier, IArchitecture model) {
		super(elementSpecfier);
		this.model = model;
	}

	public AbstractFirstClass(ElementSpecifier elementSpecfier, IArchitecture model, String name) {
		super(elementSpecfier);
		this.model = model;
		this.name = name;
	}

	//
	// IFirstClass implementation
	//
	@Override
	public IArchitecture getModel() {
		return this.model;
	}

	@Override
	public IFirstClass getParent() {
		return this.parent;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getReferencingName() {
		return generateReferencingName(this.name);
	}

	@Override
	public String getQualifiedName() {
		return makeQualifiedName(this, new StringBuffer()).toString();
	}

	@Override
	public Collection<IAnnotation> getAnnotations() {
		return Collections.unmodifiableCollection(this.annotations);
	}

	@Override
	public Collection<IFunction> getFunctions() {
		return fntable.values();
	}

	@Override
	public Collection<IFirstClass> getBody() {
		return Collections.unmodifiableCollection(this.body.values());
	}

	@Override
	public Collection<IFirstClass> getBody(ElementSpecifier type) {
		Collection<IFirstClass> body = this.body.get(type);
		return Collections.unmodifiableCollection(body != null ? body : emptyBody);
	}

	@Override
	public void setName(String name) throws ModelException {
		// Do nothing if name is not new
		if (name.equals(this.name)) { return; }
		// If attached to a parent, check if new referencing name is unique in parent context
		if (this.parent != null) {
			String referencingName = generateReferencingName(name);
			if (this.parent.symbolLookupName(referencingName)) {
				throw makeError(ERR_HASSYMBOL, referencingName);
			}				
		}
		this.name = name;
	}

	@Override
	public void addChild(IFirstClass child) throws ModelException {
		assert (child.getReferencingName() != null);
		String referencingName = child.getReferencingName();
		// Check that child does not have a parent already
		if (child.getParent() != null) {
			throw makeError(ERR_HASPARENT, referencingName);
		}
		// Check if child's referencing name is unique
		if (symbolLookupName(referencingName)) {
			throw makeError(ERR_HASSYMBOL, referencingName);
		}
		assert (!symbolLookupElement(child));
		assert (!this.body.containsValue(child));
		// Check if child is a containable type within this element
		if (!isContainable(child)) {
			throw makeError(ERR_NOTCONTAINABLE, child.getName(), getName());
		}
		// Add child to both the symbol table and the body
		symbolPut(referencingName, child);
		this.body.put(child.getElementSpecifier(), child);
		// Set child parent to this element
		assert (child instanceof AbstractFirstClass);
		((AbstractFirstClass) child).parent = AbstractFirstClass.this;
	}

	@Override
	public boolean isContainable(IElement element) {
		// TODO: Temporary fix. Needs to implemented bye every individual element type
		return true;
	}

	@Override
	public void addAnnotation(IAnnotation annotation) throws ModelException {
		this.annotations.add(annotation);
	}

	//
	// IElement implementation
	//
	@Override
	public void evaluate(IEvaluationContext context) throws ModelException {
		super.evaluate(context);
		// Create a new evaluation context with this element
		IEvaluationContext thisContext = new EvaluationContext(this, context);
		// Validate annotations
		for (IAnnotation an : this.annotations) {
			an.evaluate(thisContext);
		}
		// Validate body elements
		for (IFirstClass fc : this.body.values()) {
			fc.evaluate(thisContext);
		}
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write basic properties
		writer.writeNodeAttribute(parent, XmlSchema.AT_NAME.tag(), this.name);
		writer.writeNodeAttribute(parent, XmlSchema.AT_RNAME.tag(), getReferencingName());
		// Annotations
		Node container = writer.writeNode(parent, XmlSchema.ANNOTATIONS.tag());
		for (IAnnotation an : this.annotations) {
			Node node = writer.writeNode(container, an.getElementSpecifier().name());
			an.serialize(writer, node);
		}
		// Body
		Node body = writer.writeNode(parent, XmlSchema.BODY.tag());
		for (IFirstClass fc : this.body.values()) {
			Node node = writer.writeNode(body, fc.getElementSpecifier().name());
			fc.serialize(writer, node);
		}
	}

	//
	// Protected implementation
	//
	protected void setModelToSelf() {
		assert (this instanceof IArchitecture);
		this.model = (IArchitecture) this;
	}

	//
	// Local implementation
	//
	private String generateReferencingName(String name) {
		return name != null ? name : generateUniqueName();
	}

	private String generateUniqueName() {
		return getElementSpecifier().name() + "@" + getInstanceId();
	}

	private StringBuffer makeQualifiedName(IFirstClass fc, StringBuffer sb) {
		if (fc.getParent() != null) {
			makeQualifiedName(fc.getParent(), sb).append(".");
		}
		return sb.append(fc.getReferencingName());
	}

	//
	// Grasp functions
	//
	@GraspMethod
	private StringType name() {
		return new StringType(this.name);
	}

	@GraspMethod
	private ElementType parent() {
		return (ElementType) this.parent.getEnclosingType();
	}
}