/**
 * A class for carrying out the common functionality of a console
 * application. The class that extends this class should ideally
 * be implemented as a singleton.
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
import common.app.IApplication;
import common.logging.ConsoleLogger;
import common.logging.ILogger;


public abstract class ConsoleApp implements IApplication {
	//
	// Constants
	//
	protected static final int RET_OK		=  0;
	protected static final int RET_ERROR	= -1;
	protected static final int RET_HELP		= -2;

	//
	// Fields
	//
	private IAppContext context;
	private ILogger logger;

	//
	// IApplication implementation
	//
	@Override
	public IAppContext context() {
		return this.context;
	}

	@Override
	public ILogger logger() {
		return this.logger;
	}

	@Override
	public void launch(String[] args, IAppContext context) {
		// Create runtime context and a logger
		this.context = context;
		this.logger = new ConsoleLogger().initialize(context.name(), context.logging(), context.isDebugging());

		// Show copyright messages
		showCopyright(logger);

		// Show help screen if command line is incorrect
		if (!checkArguments(args, logger)) {
			showUsage(logger);
			System.exit(RET_HELP);
		}

		// Startup application
		if (!startup(args, logger)) {
			System.exit(RET_ERROR);
		}

		// Perform cleanup
		if (!cleanup(logger)) {
			System.exit(RET_ERROR);		
		}

		// All OK
		System.exit(RET_OK);
	}
}
