/**
 * Implementation for the Grasp ELEMENT data type.
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

import grasp.lang.IElement;
import grasp.lang.IElementType;
import grasp.lang.IFirstClass;
import grasp.lang.IType;
import grasp.lang.elements.AbstractType;
import grasp.lang.elements.BooleanType;


class ElementType extends AbstractType<IElement> implements IElementType {
	//
	// Constants
	//
	private static final String TYPE_NAME = "element";
	private static final String ERR_BADFIELD = "Symbol '%s' does not resolve to a member field";

	//
	// Constructors
	//
	public ElementType(IElement value) {
		super(TYPE_NAME, value);
	}

	//
	// IType implementation
	//
	@Override
	public BooleanType eq(IType<?> other) {
		assert (other instanceof ElementType);
		return new BooleanType(this.value.getInstanceId() == ((ElementType) other).value.getInstanceId());
	}

	@Override
	public BooleanType noteq(IType<?> other) {
		assert (other instanceof ElementType);
		return new BooleanType(this.value.getInstanceId() != ((ElementType) other).value.getInstanceId());
	}

	@Override
	public IType<IElement> memb(String name) {
		if (!this.value.symbolLookupName(name)) {
			throw makeError(ERR_BADFIELD, name);
		}
		assert (this.value.symbolGet(name) != null);
		return this.value.symbolGet(name).getEnclosingType();
	}
	
	@Override
	public IType<?> memb(String name, List<IType<?>> args) {
//		if (!this.value.symbolLookupName(name)) {
//			throw makeError(ERR_BADMEMBER, name);
//		}
//		assert (this.value.symbolGet(name) != null);
//		return this.value.symbolGet(name).getEnclosingType();
		// TODO: test code only, needs implementation
		return new StringType(((IFirstClass) this.value).getName());
	}
}
