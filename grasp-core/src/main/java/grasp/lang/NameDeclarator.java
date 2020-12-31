/**
 * Implements a declarator for the NAME property of an element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class NameDeclarator extends AbstractDeclarator {
	//
	// Constructors
	//
	public NameDeclarator(ISyntaxNode base, IFirstClass context, IFirstClass owner) {
		super(base, context, owner);
	}

	//
	// AbstractDeclarator implementation
	//
	@Override
	protected void validate(String symbol) throws ModelException {
		assert (this.owner.getName() == null);
		this.owner.setName(symbol);
	}
}
