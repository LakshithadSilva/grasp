/**
 * Represents exceptions thrown by various elements in the
 * semantor component. 
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2013/03/23
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class SemantorException extends RuntimeException {
	//
	// Fields
	//
	private static final long serialVersionUID = 0L;
	private final ISyntaxNode node;

	//
	// Constructors
	//
	public SemantorException(ISyntaxNode node, String message, Object... args) {
		super(String.format(message, args));
		this.node = node;
	}

	public SemantorException(ISyntaxNode node, ModelException me) {
		super(me.getMessage());
		this.node = node;
	}

	//
	// Public implementation
	//
	public ISyntaxNode node() {
		return this.node;
	}
	
	public String message() {
		return this.getMessage();
	}
}
