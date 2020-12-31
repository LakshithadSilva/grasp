/**
 * Interface for the parser component of the Grasp compiler.
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
import common.io.ISource;
import common.logging.ILogger;


public interface IParser {
	IErrorReport errors();
	ISyntaxTree parse(ISource source, ILogger logger);
}
