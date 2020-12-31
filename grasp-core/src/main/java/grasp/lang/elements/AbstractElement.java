/**
 * Abstract class that provides base implementation for IElement.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;
import grasp.lang.IElement;
import grasp.lang.IElementType;
import grasp.lang.IEvaluationContext;
import grasp.lang.ModelErrorException;
import grasp.lang.ModelException;


abstract class AbstractElement extends AbstractSerializable implements IElement {
	//
	// Constants
	//
	private static final String ERR_NAMENOTFOUND = "Name '%' does not exist in the specified context";

	//
	// Fields
	//
	private final ElementSpecifier elementSpecfier;
	private final IElementType enclosingType;
	private final Map<String, IElement> symbols = new HashMap<String, IElement>();

	//
	// Constructors
	//
	public AbstractElement(ElementSpecifier elementSpecfier) {
		super(elementSpecfier.name());
		this.elementSpecfier = elementSpecfier;
		this.enclosingType = new ElementType(this);
	}

	//
	// IElement implementation
	//
	@Override
	public int getInstanceId() {
		return super.hashCode();
	}

	@Override
	public ElementSpecifier getElementSpecifier() {
		return this.elementSpecfier;
	}

	@Override
	public IElementType getEnclosingType() {
		return enclosingType;
	}

	@Override
	public void evaluate(IEvaluationContext context) throws ModelException {
		// Does nothing for now
		// However, may include implementation in future
		assert (context != null);
	}

	@Override
	public void symbolPut(String name, IElement element) {
		assert (!this.symbols.containsKey(name));
		this.symbols.put(name, element);
	}

	@Override
	public IElement symbolGet(String name) {
		assert (this.symbols.containsKey(name));
		return this.symbols.get(name);
	}

	@Override
	public IElement symbolZap(String name) {
		assert (this.symbols.containsKey(name));
		return this.symbols.remove(name);
	}

	@Override
	public boolean symbolLookupName(String name) {
		return this.symbols.containsKey(name);
	}

	@Override
	public boolean symbolLookupElement(IElement element) {
		return this.symbols.containsValue(element);
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		// Write the basic stuff here
		// TODO: IElement serialization info
	}

	//
	// Protected implementation
	//
	protected void ensureNameExists(IElement context, String name) throws ModelErrorException {
		assert (context != null);
		if (!context.symbolLookupName(name)) {
			throw makeError(ERR_NAMENOTFOUND, name);
		}
	}
}
