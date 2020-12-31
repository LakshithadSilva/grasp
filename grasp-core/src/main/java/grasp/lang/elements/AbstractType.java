/**
 * Abstract base class for all Grasp data types. A deriving data type
 * class should override operator functions applicable only to that
 * data type so that unsupported operations will correctly generate
 * exceptions coded in this class.
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
import grasp.lang.IElement;
import grasp.lang.IType;


abstract class AbstractType<T> extends AbstractSerializable implements IType<T> {
	//
	// Fields
	//
	private final String name;
	protected final T value;

	//
	// Constructors
	//
	public AbstractType(String name, T value) {
		super(name.toUpperCase());
		this.name = name;
		this.value = value;
	}

	//
	// IType implementation: properties
	//
	@Override
	public String name() {
		return this.name;
	}

	@Override
	public T value() {
		return this.value;
	}

	@Override
	public String valueText() {
		return this.value.toString();
	}

	//
	// IType implementation: operators
	//
	@Override
	public IType<Boolean> subsetof(IType<?> other) {		// subsetof
		throw makeError(composeMessage("subsetof"));
	}

	@Override
	public IType<Boolean> dis(IType<?> other) {				// ||
		throw makeError(composeMessage("||"));
	}

	@Override
	public IType<Boolean> con(IType<?> other) {				// &&
		throw makeError(composeMessage("&&"));
	}

	@Override
	public IType<Boolean> not() {							// !
		throw makeError(composeMessage("!"));
	}

	@Override
	public IType<T> or(IType<?> other) {					// |
		throw makeError(composeMessage("|"));
	}

	@Override
	public IType<T> xor(IType<?> other) {					// ^
		throw makeError(composeMessage("^"));
	}

	@Override
	public IType<T> and(IType<?> other) {					// &
		throw makeError(composeMessage("&"));
	}

	@Override
	public IType<T> cmp() {									// ~
		throw makeError(composeMessage("~"));
	}

	@Override
	public IType<Boolean> eq(IType<?> other) {				// ==
		throw makeError(composeMessage("=="));
	}

	@Override
	public IType<Boolean> noteq(IType<?> other) {			// !=
		throw makeError(composeMessage("!="));
	}

	@Override
	public IType<Boolean> gt(IType<?> other) {				// >
		throw makeError(composeMessage(">"));
	}

	@Override
	public IType<Boolean> gteq(IType<?> other) {			// >=
		throw makeError(composeMessage(">="));
	}

	@Override
	public IType<Boolean> lt(IType<?> other) {				// <
		throw makeError(composeMessage("<"));
	}

	@Override
	public IType<Boolean> lteq(IType<?> other) {			// <=
		throw makeError(composeMessage("<="));
	}

	@Override
	public IType<T> add(IType<?> other) {					// +
		throw makeError(composeMessage("+"));
	}

	@Override
	public IType<T> sub(IType<?> other) {					// -
		throw makeError(composeMessage("-"));
	}

	@Override
	public IType<T> mul(IType<?> other) {					// *
		throw makeError(composeMessage("*"));
	}

	@Override
	public IType<T> div(IType<?> other) {					// /
		throw makeError(composeMessage("/"));
	}

	@Override
	public IType<T> mod(IType<?> other) {					// %
		throw makeError(composeMessage("%"));
	}

	@Override
	public IType<T> plus() {								// +
		throw makeError(composeMessage("+"));
	}

	@Override
	public IType<T> minus() {								// -
		throw makeError(composeMessage("-"));
	}

	@Override
	public IType<IElement> memb(String name) {				// .<member>
		throw makeError(composeMessage(".<field>"));		
	}

	@Override
	public IType<?> memb(String name, List<IType<?>> args) {// .<function>
		throw makeError(composeMessage(".<function>"));		
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		// Serialize value of type instance
		writer.writeNodeAttribute(parent, XmlSchema.AT_VALUE.tag(), valueText());
	}

	//
	// Local implementation
	//
	private String composeMessage(String op) {
		return String.format("Operator '%s' is not defined for type '%s'", op, this.name);
	}
}
