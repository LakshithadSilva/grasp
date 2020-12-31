/**
 * Implements resolver for EXTENDS clause.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class ExtendsResolver extends AbstractResolver implements IResolver {
	//
	// Constructors
	//
	public ExtendsResolver(ISyntaxNode base, IFirstClass element) {
		super(base, element.getModel(), element);
	}

	//
	// AbstractResolver implementation
	//
	@Override
	protected void validate(IElement resolved, int ordinal) throws ModelException {
		assert (this.referrer instanceof IExtensible);
		assert (((IExtensible) this.referrer).getExtendee() == null);
		assert (resolved instanceof IFirstClass);
		// Set resolved in referrer
		((IExtensible) this.referrer).setExtendee((IFirstClass) resolved);
	}

	@Override
	protected void complete(int count) throws ModelException {
		assert (count == 1);
	}
}
