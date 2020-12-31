/**
 * Interface for an error object with an associated source (i.e. file)
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2012/06/18
 *  	
 * @since		1.00
 * 
 */

package common.error;

import common.io.ISource;


public interface ISourceError extends IError {
	ISource getSource();
	//ISourceLocation getLocation();
	int getStartRow();
	int getStartCol();
	int getEndRow();
	int getEndCol();
}
