package grasp.lang;


public class ParamDeclarator extends AbstractDeclarator {
	//
	// Constructors
	//
	public ParamDeclarator(ISyntaxNode base, IFirstClass context, IFirstClass owner) {
		super(base, context, owner);
	}

	//
	// AbstractDeclarator implementation
	//
	@Override
	protected void validate(String symbol) throws ModelException {
		assert (this.owner instanceof IHasParameters);
		((IHasParameters) this.owner).addParameter(symbol);
	}
}
