/**
 * Abstract class that provides base implementation for IDeclarator.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public abstract class AbstractDeclarator implements IDeclarator {
	//
	// Constants
	//
	private static final String ERR_SYMBOLEXISTS = "Symbol '%s' has already been declared";

	//
	// Fields
	//
	protected final ISyntaxNode base;
	protected final IFirstClass context;
	protected final IFirstClass owner;

	//
	// Abstract methods
	//
	protected abstract void validate(String symbol) throws ModelException;

	//
	// Constructors
	//
	public AbstractDeclarator(ISyntaxNode base, IFirstClass context, IFirstClass owner) {
		this.base = base;
		this.context = context;
		this.owner = owner;
	}

	//
	// IDeclarator implementation
	//
	@Override
	public void declare() throws SemantorException, ModelException {
		assert (this.base.getChildren().size() > 0);
		for (ISyntaxNode node : this.base.getChildren()) {
			String declared = declareSymbol(node);
			assert (declared != null);
			validate(declared);
		}
	}
	
	//
	// Local implementation
	//
	private String declareSymbol(ISyntaxNode node) throws SemantorException {
		String symbol = node.getTokenText();
		if ((this.context != null) && context.symbolLookupName(symbol)) {
			throw new SemantorException(node, ERR_SYMBOLEXISTS, symbol);
		}
		return symbol;
	}
}
