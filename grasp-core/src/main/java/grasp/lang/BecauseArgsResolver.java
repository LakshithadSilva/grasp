/**
 * Implements resolver for rationale arguments in the BECAUSE clause.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.ArrayList;
import java.util.List;


public class BecauseArgsResolver extends AbstractResolver {
	//
	// Fields
	//
	private final ICausalContext causal;
	private final List<IFirstClass> arguments = new ArrayList<IFirstClass>();

	//
	// Constructors
	//
	public BecauseArgsResolver(ISyntaxNode base, IFirstClass parent, IFirstClass element, ICausalContext causal) {
		super(base, parent, element);
		this.causal = causal;
	}

	//
	// AbstractResolver implementation
	//
	@Override
	protected void validate(IElement resolved, int ordinal) throws ModelException {
		assert (resolved instanceof IFirstClass);
		this.arguments.add((IFirstClass) resolved);
	}

	@Override
	protected void complete(int count) throws ModelException {
		assert (this.referrer instanceof IBecause);
		assert (this.arguments.size() == count);
		assert (this.causal != null);
		// Set arguments in the given causal context
		this.causal.setArguments(this.arguments);
	}
}
