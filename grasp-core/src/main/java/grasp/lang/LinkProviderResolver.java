/**
 * Implements resolver for the supplier part of a LINK element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class LinkProviderResolver extends AbstractResolver  {
	//
	// Constructors
	//
	public LinkProviderResolver(ISyntaxNode base, IFirstClass parent, IFirstClass element) {
		super(base, parent, element);
	}

	//
	// AbstractResolver implementation
	//
	@Override
	protected void validate(IElement resolved, int ordinal) throws ModelException {
		assert (this.referrer instanceof ILink);
		assert (resolved instanceof IFirstClass);
		// Attach provider to link
		((ILink) this.referrer).attachProvider((IFirstClass) resolved);
	}

	@Override
	protected void complete(int count) throws ModelException {
		assert (count >= 1);
	}
}
