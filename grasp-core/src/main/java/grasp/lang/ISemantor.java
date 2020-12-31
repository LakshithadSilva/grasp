/**
 * Interface for the semantic analyzer component of the Grasp compiler.
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


public interface ISemantor {
	IErrorReport errors();
	IArchitecture analyse(ISyntaxTree ast, ILogger log);
}
