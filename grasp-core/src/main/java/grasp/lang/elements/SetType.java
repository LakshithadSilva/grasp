/**
 * Implementation for the Grasp SET data type.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import grasp.lang.ISetType;
import grasp.lang.IType;

import java.util.Set;


class SetType extends AbstractType<Set<? extends IType<?>>> implements ISetType {
	//
	// Constants
	//
	private static final String TYPE_NAME = "set";

	//
	// Constructors
	//
	public SetType(Set<? extends IType<?>> value) {
		super(TYPE_NAME, value);
	}
}