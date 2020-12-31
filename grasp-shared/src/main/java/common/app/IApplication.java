/**
 * Interface for an application component.
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


public interface IApplication {
	// Properties
	IAppContext context();
	ILogger logger();
	// Actions
	void launch(String[] args, IAppContext context);
	boolean checkArguments(String[] args, ILogger log);
	void showCopyright(ILogger log);
	void showUsage(ILogger log);
	boolean startup(String[] args, ILogger log);
	boolean cleanup(ILogger log);
}
