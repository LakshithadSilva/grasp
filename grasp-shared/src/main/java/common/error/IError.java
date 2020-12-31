/**
 * Interface for an individual error object within error reports.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.error;

import common.logging.ILogger;


public interface IError {
	String getMessage();
	String toString();
	void report(ILogger log);
}
