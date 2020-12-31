/**
 * Implements the ARCHITECTURE (i.e. root) element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import grasp.lang.IArchitecture;
import grasp.lang.ICheck;
import grasp.lang.IEvaluationContext;
import grasp.lang.ModelException;


class Check extends AbstractHasExpressionBecause implements ICheck {
	//
	// Constructors
	//
	public Check(IArchitecture model) {
		super(ElementSpecifier.CHECK, model);
	}

	public Check(IArchitecture model, String name) {
		super(ElementSpecifier.CHECK, model, name);
	}

	//
	// IElement implementation
	//
	@Override
	public void evaluate(IEvaluationContext context) throws ModelException {
		super.evaluate(context);
		assert (isInitialized() == true);
		assert (getValue() != null);
		// TODO: HACK
		// TODO: Should first check type and then value
//		if (((Boolean) getValue()) == false) {
//			java.lang.System.out.println("Check clause failed.");
//		}
	}	
}
