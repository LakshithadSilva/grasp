/**
 * Implementation for the Grasp REAL data type.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import grasp.lang.IRealType;
import grasp.lang.IType;


class RealType extends AbstractType<Double> implements IRealType {
	//
	// Constants
	//
	private static final String TYPE_NAME = "real";

	//
	// Constructors
	//
	public RealType(Double value) {
		super(TYPE_NAME, value);
	}

	//
	// IType implementation
	//
	@Override
	public BooleanType eq(IType<?> other) {
		assert (other instanceof IRealType);
		return new BooleanType(this.value == ((RealType) other).value);
	}

	@Override
	public BooleanType noteq(IType<?> other) {
		assert (other instanceof IRealType);
		return new BooleanType(this.value != ((RealType) other).value);
	}

	@Override
	public BooleanType gt(IType<?> other) {
		assert (other instanceof IRealType);
		return new BooleanType(this.value > ((RealType) other).value);
	}

	@Override
	public BooleanType gteq(IType<?> other) {
		assert (other instanceof IRealType);
		return new BooleanType(this.value >= ((RealType) other).value);
	}

	@Override
	public BooleanType lt(IType<?> other) {
		assert (other instanceof IRealType);
		return new BooleanType(this.value < ((RealType) other).value);
	}

	@Override
	public BooleanType lteq(IType<?> other) {
		assert (other instanceof IRealType);
		return new BooleanType(this.value >= ((RealType) other).value);
	}

	@Override
	public RealType add(IType<?> other) {
		assert (other instanceof IRealType);
		return new RealType(this.value + ((RealType) other).value);
	}

	@Override
	public RealType sub(IType<?> other) {
		assert (other instanceof IRealType);
		return new RealType(this.value - ((RealType) other).value);
	}

	@Override
	public RealType mul(IType<?> other) {
		assert (other instanceof IRealType);
		return new RealType(this.value * ((RealType) other).value);
	}

	@Override
	public RealType div(IType<?> other) {
		assert (other instanceof IRealType);
		return new RealType(this.value / ((RealType) other).value);
	}

	@Override
	public RealType mod(IType<?> other) {
		assert (other instanceof IRealType);
		return new RealType(this.value % ((RealType) other).value);
	}

	@Override
	public RealType plus() {
		return this;
	}

	@Override
	public RealType minus() {
		return new RealType(-this.value);
	}
}
