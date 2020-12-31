/**
 * Implementation for the evaluator component of the Grasp compiler.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import common.error.ErrorReport;
import common.error.IErrorReport;
import common.logging.ILogger;


public class Evaluator implements IEvaluator {
	//
	// Constants
	//
	private static final String ERR_UNKNOWN = "Unknown evaluation error: ";
	
	//
	// Fields
	//
	private final IErrorReport errors = new ErrorReport();
	private ILogger log;
	
	//
	// IEvaluator implementation
	//
	@Override
	public void evaluate(IArchitecture graph, ILogger log) {
		this.log = log;
		this.errors.clear();
		this.log.trace("Evaluating consistency of the architecture model...");
		doEvaluate(graph);
	}

	@Override
	public IErrorReport errors() {
		return this.errors;
	}
	
	//
	// Local implementation
	//
	private void doEvaluate(IArchitecture graph) {
		try {
			// Start the evaluation process using the architecture
			// element as the starting context
			graph.evaluate(new EvaluationContext(graph));
		} catch (ModelException e) {
			this.errors.add(new EvaluatorError(e.message()));			
		} catch (Exception e) {
			this.errors.add(new EvaluatorError(ERR_UNKNOWN + e.getMessage()));
		}
	}
}
