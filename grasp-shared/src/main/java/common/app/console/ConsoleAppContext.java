/**
 * Holds runtime information related to an application.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.app.console;

import common.app.IAppContext;
import common.logging.ILogger;


public class ConsoleAppContext implements IAppContext {
	//
	// Fields
	//
	private final String name;
	private final boolean debugging;
	private final ILogger.Level loglevel;
	
	//
	// Constructors
	//
	public ConsoleAppContext(String name, ILogger.Level logging, boolean debugging) {
		this.name = name;
		this.loglevel = logging;		
		this.debugging = debugging;
	}
	
	//
	// IAppContext implementation
	//
	public String name() {
		return this.name;
	}
	
	public ILogger.Level logging() {
		return this.loglevel;
	}
	
	public boolean isDebugging() {
		return this.debugging;
	}
}
