/**
 * Implements resolver for OVER clause in LAYER elements.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class LayeringResolver extends AbstractResolver implements IResolver {
	//
	// Constructors
	//
	public LayeringResolver(ISyntaxNode base, IFirstClass parent, IFirstClass element) {
		super(base, parent, element);
	}

	//
	// AbstractResolver implementation
	//
	@Override
	protected void validate(IElement resolved, int ordinal) throws ModelException {
		assert (this.referrer instanceof ILayer);
		assert (resolved instanceof ILayer);
		((ILayer) this.referrer).addOver((ILayer) resolved);
	}

	@Override
	protected void complete(int count) throws ModelException {
		assert (count >= 1);
	}
}
