/**
 * Implements resolver for templates from which components/connectors are instantiated.
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


public class ArgumentsResolver extends AbstractResolver {
	//
	// Fields
	//
	private final List<IFirstClass> arguments = new ArrayList<IFirstClass>();

	//
	// Constructor
	//
	public ArgumentsResolver(ISyntaxNode base, IFirstClass parent, IFirstClass element) {
		super(base, parent, element);
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
		assert (this.referrer instanceof IHasArguments);
		assert (this.arguments.size() == count);
		// Set arguments in the element
		((IHasArguments) this.referrer).setArguments(this.arguments);
	}
}
