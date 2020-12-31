/**
 * Implementation for the Grasp INTEGER data type.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import grasp.lang.IIntegerType;
import grasp.lang.IType;
import grasp.lang.elements.AbstractType;
import grasp.lang.elements.BooleanType;


class IntegerType extends AbstractType<Integer> implements IIntegerType {
	//
	// Constants
	//
	private static final String TYPE_NAME = "integer";

	//
	// Constructors
	//
	public IntegerType(Integer value) {
		super(TYPE_NAME, value);
	}

	//
	// IType implementation
	//
	@Override
	public IntegerType or(IType<?> other) {
		assert (other instanceof IntegerType);
		return new IntegerType(this.value | ((IntegerType) other).value);
	}

	@Override
	public IntegerType xor(IType<?> other) {
		assert (other instanceof IntegerType);
		return new IntegerType(this.value ^ ((IntegerType) other).value);
	}

	@Override
	public IntegerType and(IType<?> other) {
		assert (other instanceof IntegerType);
		return new IntegerType(this.value & ((IntegerType) other).value);
	}

	@Override
	public IntegerType cmp() {
		return new IntegerType(~this.value);
	}

	@Override
	public BooleanType eq(IType<?> other) {
		assert (other instanceof IntegerType);
		return new BooleanType(this.value == ((IntegerType) other).value);
	}

	@Override
	public BooleanType noteq(IType<?> other) {
		assert (other instanceof IntegerType);
		return new BooleanType(this.value != ((IntegerType) other).value);
	}

	@Override
	public BooleanType gt(IType<?> other) {
		assert (other instanceof IntegerType);
		return new BooleanType(this.value > ((IntegerType) other).value);
	}

	@Override
	public BooleanType gteq(IType<?> other) {
		assert (other instanceof IntegerType);
		return new BooleanType(this.value >= ((IntegerType) other).value);
	}

	@Override
	public BooleanType lt(IType<?> other) {
		assert (other instanceof IntegerType);
		return new BooleanType(this.value < ((IntegerType) other).value);
	}

	@Override
	public BooleanType lteq(IType<?> other) {
		assert (other instanceof IntegerType);
		return new BooleanType(this.value >= ((IntegerType) other).value);
	}

	@Override
	public IntegerType add(IType<?> other) {
		assert (other instanceof IntegerType);
		return new IntegerType(this.value + ((IntegerType) other).value);
	}

	@Override
	public IntegerType sub(IType<?> other) {
		assert (other instanceof IntegerType);
		return new IntegerType(this.value - ((IntegerType) other).value);
	}

	@Override
	public IntegerType mul(IType<?> other) {
		assert (other instanceof IntegerType);
		return new IntegerType(this.value * ((IntegerType) other).value);
	}

	@Override
	public IntegerType div(IType<?> other) {
		assert (other instanceof IntegerType);
		return new IntegerType(this.value / ((IntegerType) other).value);
	}

	@Override
	public IntegerType mod(IType<?> other) {
		assert (other instanceof IntegerType);
		return new IntegerType(this.value % ((IntegerType) other).value);
	}

	@Override
	public IntegerType plus() {
		return this;
	}

	@Override
	public IntegerType minus() {
		return new IntegerType(-this.value);
	}
}
