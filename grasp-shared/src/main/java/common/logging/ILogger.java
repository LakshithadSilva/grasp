/**
 * Interface for a logger component.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.logging;


public interface ILogger {
	enum Level {
		INFO, TRACE, WARN, ERROR, FATAL;
	}
	ILogger initialize(String name, Level level, boolean debug);
    // Filtered logging (i.e. depends on log level and debug mode)
    void info(String message, Object... args);
    void trace(String message, Object... args);
    void warn(String message, Object... args);
    void error(String message, Object...args);
    void error(String message, Exception ex);
    // Unfiltered logging
    void print_error(String message, Object... args);
    void print_warn(String message, Object... args);
    void print(String message, Object... args);
    void print();
    void shutdown();
}
