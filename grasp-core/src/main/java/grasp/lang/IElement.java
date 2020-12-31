package grasp.lang;


/**
 * Base interface for all elements in a Grasp architecture model.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */
public interface IElement extends ISerializable {
	/**
	 * Grasp element type specifiers.
	 *
	 * @version		1.00, 2011/02/22
	 *  	
	 * @since		1.00
	 * 
	 */
	enum ElementSpecifier {
		// First-class elements
		ARCHITECTURE,
		REQUIREMENT,
		QUALITY_ATTRIBUTE,
		PROPERTY,
		RATIONALE,
		REASON,
		TEMPLATE,
		SYSTEM,
		LAYER,
		COMPONENT,
		CONNECTOR,
		PROVIDES,
		REQUIRES,
		CHECK,
		LINK,
		// Non first-class elements
		ANNOTATION,
		FUNCTION,
		EXPRESSION,
		NAMEDVALUE,
		CAUSALCONTEXT
	};

	//
	// Basic element operations
	//

	/**
	 * Returns an identifier unique to an instance of a Grasp element.
	 * 
	 * @return a unique integer identifier.
	 */
	int getInstanceId();

	/**
	 * Returns the {@link ElementSpecifier} property of a Grasp element.
	 * 
	 * @return the element specifier type.
	 */
	ElementSpecifier getElementSpecifier();
	
	/**
	 * Returns the {@link IElementType} reference to a Grasp type object that
	 * encloses this Grasp element. For performance reasons, this method 
	 * returns a reference to the same type object which is created at the
	 * time the element is constructed.
	 * 
	 * @return the enclosing Grasp type of this element.
	 */
	IElementType getEnclosingType();

	/**
	 * Evaluates an element. In the event evaluation fails, the method throws a
	 * {@link ModelException} exception with an appropriate error message.
	 * 
	 * @param context
	 * Context to use for performing evaluation.
	 * 
	 * @throws ModelException
	 * If evaluation fails.
	 */
	void evaluate(IEvaluationContext context) throws ModelException;

	/**
	 * Adds a symbol and the given reference to an element's symbol table. If the
	 * specified symbol already exists, its associated reference is replaced by
	 * the provided {@code element} reference.<p>
	 * Every Grasp element has its own symbol table having names and references of all
	 * contained objects. These include arguments, parameters, and nested elements in
	 * the body of a first-class element.
	 * 
	 * @param name
	 * Name of symbol.
	 * 
	 * @param element
	 * The reference (i.e. the Grasp element) that is associated with the symbol.
	 */
	void symbolPut(String name, IElement element);

	/**
	 * Returns the reference associated with the given symbol.
	 * 
	 * @param name
	 * Name of symbol.
	 * 
	 * @return the reference associated with the given symbol or {@ null} if
	 * the symbol was not found in the symbol table.
	 */
	IElement symbolGet(String name);

	/**
	 * Removes the given symbol from the symbol table, if present.
	 * 
	 * @param name
	 * Name of symbol.
	 * 
	 * @return the reference that was associated with the removed symbol or
	 * {@ null} if the symbol was not found in the symbol table.
	 */
	IElement symbolZap(String name);

	/**
	 * Checks whether the given symbol exists in the symbol table.
	 * 
	 * @param name
	 * Name of symbol.
	 * 
	 * @return {@code True} if the symbol is found or otherwise {@code False}.
	 */
	boolean symbolLookupName(String name);

	/**
	 * Checks whether the given reference (i.e. Grasp element) exists in the
	 * symbol table.
	 * 
	 * @param element
	 * Element reference.
	 * 
	 * @return {@code True} if the reference is found or otherwise {@code False}.
	 */
	boolean symbolLookupElement(IElement element);
}
