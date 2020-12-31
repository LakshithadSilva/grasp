/**
 * A simple console based logger that implements ILogger.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.logging;

import java.io.PrintStream;


public final class ConsoleLogger implements ILogger {
	//
	// Fields
	//
	private String name;
	private Level level;
	private boolean debug;

	//
	// Constructors
	//
	public ConsoleLogger() {
	}

	//
	// Implementation of ILogger
	//
	@Override
	public ILogger initialize(String name, Level level, boolean debug) {
		this.name = name;
		this.level = level;
		this.debug = debug;
		return this;
	}

	@Override
	public void info(String message, Object... args) {
		if (this.debug) {
			if (Level.INFO.ordinal() >= this.level.ordinal()) {
				printLog(System.out, Level.INFO, message, args);
			}
		}
	}

	@Override
	public void trace(String message, Object... args) {
		if (this.debug) {
			if (Level.TRACE.ordinal() >= this.level.ordinal()) {
				printLog(System.out, Level.TRACE, message, args);
			}
		}
	}

	@Override
	public void warn(String message, Object... args) {
		if (this.debug) {
			if (Level.WARN.ordinal() >= this.level.ordinal()) {
				printLog(System.out, Level.WARN, message, args);
			}
		}
	}

	@Override
	public void error(String message, Object... args) {
		if (Level.ERROR.ordinal() >= this.level.ordinal()) {
			printLog(System.err, Level.ERROR, message, args);
		}
    }

	@Override
	public void error(String message, Exception e) {
		if (Level.ERROR.ordinal() >= this.level.ordinal()) {
			printLog(System.err, Level.ERROR, message);
			printLog(System.err, Level.ERROR, e.getMessage());
		}
    }

	@Override
    public void print_error(String message, Object... args) {
		System.err.printf(message, args);
		System.err.println();
		System.err.flush();
    }
    
	@Override
    public void print_warn(String message, Object... args) {
		System.err.printf(message, args);
		System.err.println();
		System.err.flush();
    }

	@Override
	public void print(String message, Object... args) {
		System.out.printf(message, args);
		System.out.println();
	}

	@Override
	public void print() {
		System.out.println();
	}

	@Override
	public void shutdown() {
		this.name = null;
	}
	
	//
	// Local implementation
	//
	private void printLog(PrintStream ps, Level level, String message, Object... args) {
		StringBuffer output = new StringBuffer();
		output.append("[").append(level.toString()).append("] ");
		output.append(this.name).append(": ");
		output.append(message);
		ps.printf(output.toString(), args);
		ps.println();
	}
}
