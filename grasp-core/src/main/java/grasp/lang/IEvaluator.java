/**
 * Interface for the evaluator component of the Grasp compiler.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import common.error.IErrorReport;
import common.logging.ILogger;


public interface IEvaluator {
	IErrorReport errors();
	void evaluate(IArchitecture graph, ILogger log);
}
