/**
 * Implements resolver for consumer part in a LINK element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class LinkConsumerResolver extends AbstractResolver {
	//
	// Constructors
	//
	public LinkConsumerResolver(ISyntaxNode base, IFirstClass parent, IFirstClass element) {
		super(base, parent, element);
	}

	//
	// AbstractResolver implementation
	//
	@Override
	protected void validate(IElement resolved, int ordinal) throws ModelException {
		assert (this.referrer instanceof ILink);
		assert (resolved instanceof IFirstClass);
		((ILink) this.referrer).attachConsumer((IFirstClass) resolved);
	}

	@Override
	protected void complete(int count) throws ModelException {
		assert (count == 1);
	}
}
