/**
 * Implements resolver for rationales in the BECAUSE clause.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public class BecauseBasisResolver extends AbstractResolver {
	//
	// Fields
	//
	private final ICausalContext causal;

	//
	// Constructors
	//
	public BecauseBasisResolver(ISyntaxNode base, IFirstClass element, ICausalContext causal) {
		super(base, element.getModel(), element);
		this.causal = causal;
	}

	//
	// AbstractResolver implementation
	//
	@Override
	protected void validate(IElement resolved, int ordinal) throws ModelException {
		assert (this.referrer instanceof IBecause);
		assert (resolved instanceof IRationale);
		assert (this.causal != null);
		// Set rationale in the given causal context
		this.causal.setRationale((IRationale) resolved);
	}

	@Override
	protected void complete(int count) throws ModelException {
		assert (count == 1);
	}
}
