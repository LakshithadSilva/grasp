/**
 * Root class for all compiler error objects.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import common.error.AbstractSourceError;
import common.io.ISource;



public abstract class AbstractCompilerError extends AbstractSourceError {
	//
	// Constructors
	//
	public AbstractCompilerError(ISource source, int startRow, int startCol, int endRow, int endCol, String message, Object... args) {
		super(source, startRow, startCol, endRow, endCol, message, args);
	}
}
