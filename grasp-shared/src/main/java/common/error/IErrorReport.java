/**
 * Interface for a error report consisting of a list of error objects.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.error;

import java.util.List;

import common.logging.ILogger;


public interface IErrorReport {
	List<IError> getErrors();
	boolean isAny();
	void add(IError error);
	void clear();
	void report(ILogger log);
	String toString();
}
