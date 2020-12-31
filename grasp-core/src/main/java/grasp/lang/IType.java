/**
 * Base interface for all Grasp data types.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.List;



public interface IType<T> extends ISerializable {	
	// Properties
	String name();
	T value();
	String valueText();

	// Operators - logical
	IType<Boolean> subsetof(IType<?> other);
	IType<Boolean> dis(IType<?> other);
	IType<Boolean> con(IType<?> other);
	IType<Boolean> not();
	
	// Operators - bitwise
	IType<T> or(IType<?> other);
	IType<T> xor(IType<?> other);
	IType<T> and(IType<?> other);
	IType<T> cmp();

	// Operators - comparison
	IType<Boolean> eq(IType<?> other);
	IType<Boolean> noteq(IType<?> other);
	IType<Boolean> gt(IType<?> other);
	IType<Boolean> gteq(IType<?> other);
	IType<Boolean> lt(IType<?> other);
	IType<Boolean> lteq(IType<?> other);

	// Operators - arithmetic
	IType<T> add(IType<?> other);
	IType<T> sub(IType<?> other);
	IType<T> mul(IType<?> other);
	IType<T> div(IType<?> other);
	IType<T> mod(IType<?> other);
	IType<T> plus();
	IType<T> minus();
	
	// Member access
	IType<IElement> memb(String name);
	IType<?> memb(String name, List<IType<?>> args);
}
