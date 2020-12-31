/**
 * Implementation for the Grasp STRING data type.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import grasp.lang.IStringType;
import grasp.lang.IType;


class StringType extends AbstractType<String> implements IStringType {
	//
	// Constants
	//
	private static final String TYPE_NAME = "string";

	//
	// Constructors
	//
	public StringType(String value) {
		super(TYPE_NAME, value);
	}

	//
	// IType implementation
	//
	// Note that we are not checking if the 'other' argument is a StringType
	// because we use the valueText() method to obtain a string representation
	// of the other object irrespective of its type. Hence, if required, the
	// compiler may support implicit conversion of other types to StringType
	// when evaluating expressions.
	//
	@Override
	public BooleanType eq(IType<?> other) {
		return new BooleanType(this.value.equals(other.valueText()));
	}

	@Override
	public BooleanType noteq(IType<?> other) {
		return new BooleanType(!this.value.equals(other.valueText()));
	}

	@Override
	public StringType add(IType<?> other) {
		return new StringType(this.value + other.valueText());
	}
}
