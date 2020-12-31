/**
 * Implementation for the Grasp BOOLEAN data type.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import grasp.lang.IBooleanType;
import grasp.lang.IType;


class BooleanType extends AbstractType<Boolean> implements IBooleanType {
	//
	// Constants
	//
	private static final String TYPE_NAME = "boolean";

	//
	// Fields
	//
	private final String declaration;

	//
	// Constructors
	//
	public BooleanType(Boolean value) {
		super(TYPE_NAME, value);
		this.declaration = valueText();
	}

	public BooleanType(String declaration) {
		super(TYPE_NAME, true);
		this.declaration = declaration;
	}

	//
	// IBooleanType implementation
	//
	@Override
	public String declaration() {
		return this.declaration;
	}

	//
	// IType implementation
	//
	@Override
	public BooleanType dis(IType<?> other) {
		assert (other instanceof BooleanType);
		return new BooleanType(this.value || ((BooleanType) other).value);
	}

	@Override
	public BooleanType con(IType<?> other) {
		assert (other instanceof BooleanType);
		return new BooleanType(this.value && ((BooleanType) other).value);
	}

	@Override
	public BooleanType not() {
		return new BooleanType(!this.value);
	}

	@Override
	public BooleanType or(IType<?> other) {
		assert (other instanceof IntegerType);
		return new BooleanType(this.value | ((BooleanType) other).value);
	}

	@Override
	public BooleanType xor(IType<?> other) {
		assert (other instanceof BooleanType);
		return new BooleanType(this.value ^ ((BooleanType) other).value);
	}

	@Override
	public BooleanType and(IType<?> other) {
		assert (other instanceof BooleanType);
		return new BooleanType(this.value & ((BooleanType) other).value);
	}

	@Override
	public BooleanType eq(IType<?> other) {
		assert (other instanceof BooleanType);
		return new BooleanType(this.value == ((BooleanType) other).value);
	}

	@Override
	public BooleanType noteq(IType<?> other) {
		assert (other instanceof BooleanType);
		return new BooleanType(this.value != ((BooleanType) other).value);
	}
}
