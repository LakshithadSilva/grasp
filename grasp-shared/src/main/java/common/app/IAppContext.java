/**
 * Interface for an application context component.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2014/09/16
 *  	
 * @since		1.00
 * 
 */

package common.app;

import common.logging.ILogger;


public interface IAppContext {
	String name();
	ILogger.Level logging();
	boolean isDebugging();
}
