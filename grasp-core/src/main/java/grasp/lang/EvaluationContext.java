/**
 * Implementation for a runtime context in which a Grasp element is evaluated.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class EvaluationContext implements IEvaluationContext {
	//
	// Fields
	//
	private IElement caller;
	private IEvaluationContext innerContext;

	//
	// Constructors
	//
	public EvaluationContext(IElement caller, IEvaluationContext innerContext) {
		this.caller = caller;
		this.innerContext = innerContext;
	}

	public EvaluationContext(IElement caller) {
		this(caller, null);
	}

	//
	// IEvaluationContext implementation
	//
	@Override
	public IElement caller() {
		return this.caller;
	}

	@Override
	public IEvaluationContext innerContext() {
		return this.innerContext;
	}
}
