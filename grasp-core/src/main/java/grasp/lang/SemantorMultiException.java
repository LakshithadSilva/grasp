/**
 * This exception class is a container for a collection of
 * semantor exceptions objects.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2013/03/23
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.List;


public class SemantorMultiException extends RuntimeException {
	//
	// Fields
	//
	private static final long serialVersionUID = 0L;
	private final List<SemantorException> exs;

	//
	// Constructors
	//
	public SemantorMultiException(List<SemantorException> exs) {
		this.exs = exs;
	}

	//
	// Public implementation
	//
	public List<SemantorException> innerExceptions() {
		return this.exs;
	}
}
