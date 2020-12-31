/**
 * Abstract class that provides base implementation for IResolver.
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


public abstract class AbstractResolver implements IResolver {
	//
	// Constants
	//
	private static final String ERR_SYMBOLNOTFOUND = "Symbol '%s' does not exist";

	//
	// Fields
	//
	protected final ISyntaxNode base;
	protected final IFirstClass context;
	protected final IFirstClass referrer;

	//
	// Abstract methods
	//
	protected abstract void validate(IElement resolved, int ordinal) throws ModelException;
	protected abstract void complete(int count) throws ModelException;

	//
	// Constructors
	//
	public AbstractResolver(ISyntaxNode base, IFirstClass context, IFirstClass referrer) {
		this.base = base;
		this.context = context;
		this.referrer = referrer;
	}

	//
	// IResolver implementation
	//
	@Override
	public void resolve() throws SemantorMultiException {
		assert (this.base.getChildren().size() > 0);
		List<SemantorException> errors = new ArrayList<SemantorException>();
		// Resolve member expressions in each MEMB child node
		for (int ordinal = 0; ordinal < this.base.getChildren().size(); ++ordinal) {
			ISyntaxNode child = this.base.getChildren().get(ordinal);
			try {
				IElement resolved = resolveMember(child);
				// Validate after resolution
				assert (resolved != null);
				validate(resolved, ordinal);
			} catch (SemantorException e) {
				errors.add(e);
			} catch (ModelException e) {
				errors.add(new SemantorException(child, e));
			}
		}
		// Check if we have any exceptions
		if (!errors.isEmpty()) { throw new SemantorMultiException(errors); }
		// Notify completion
		complete(this.base.getChildren().size());
	}

	//
	// Local implementation
	//
	private IElement resolveMember(ISyntaxNode node) throws SemantorException {
		assert (node.getTokenId() == Parser.MEMB);
		assert (node.getChildren().size() > 0);
		// Resolve
		IElement ctext = this.context;	
		for (ISyntaxNode child : node.getChildren()) {
			assert (ctext != null);
			switch (child.getTokenId()) {
			// TODO: Need to remove NAME token after grammar has been fixed
			case Parser.FIELD:
			case Parser.NAME:
				assert (child.getChildren().size() == 1);
				ISyntaxNode nmnode = child.getChildren().get(0);
				String symbol = nmnode.getTokenText();
				if (!ctext.symbolLookupName(symbol)) {
					throw new SemantorException(nmnode, ERR_SYMBOLNOTFOUND, symbol);
				}
				ctext = ctext.symbolGet(symbol);
				break;

			case Parser.ICALLIN:
				assert (child.getChildren().size() == 0);
				assert (ctext.symbolLookupName(IInstantiable.CALL_INCOMING_INTERFACE));
				ctext = ctext.symbolGet(IInstantiable.CALL_INCOMING_INTERFACE);
				break;

			case Parser.ICALLOUT:
				assert (child.getChildren().size() == 0);
				assert (ctext.symbolLookupName(IInstantiable.CALL_OUTGOING_INTERFACE));
				ctext = ctext.symbolGet(IInstantiable.CALL_OUTGOING_INTERFACE);
				break;

			case Parser.FUNCTION:
				// TODO: Implement function calls
				assert (false);
				break;

			default:
				java.lang.System.out.println("Invalid tocken: " + child.getTokenText());
				assert (false);
			}
		}
		return ctext;
	}
}
