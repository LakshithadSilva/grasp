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

import java.util.ListIterator;


public class TemplateResolver extends AbstractResolver implements IResolver {
	//
	// Fields
	//
	private final ListIterator<ISyntaxNode> iterator;

	//
	// Constructors
	//
	public TemplateResolver(ISyntaxNode base, IFirstClass element, ListIterator<ISyntaxNode> iterator) {
		super(base, element.getModel(), element);
		this.iterator = iterator;
	}

	//
	// AbstractResolver implementation
	//
	@Override
	protected void validate(IElement resolved, int ordinal) throws ModelException {
		// TODO: Templates to be made more robust
		// Current implementation of template instantiation is tightly
		// coupled with the AST of the compiler. Therefore, proper
		// templates instantiations cannot be performed using the API.
		//
		assert (this.referrer instanceof IInstantiable);
		assert (((IInstantiable) this.referrer).getTemplate() == null);
		assert (resolved instanceof ITemplate);
		ITemplate template = (ITemplate) resolved;
		// Set base in referrer
		((IInstantiable) this.referrer).setTemplate(template);
		// Attach payload elements from the template hierarchy to body of referring node
		for (ITemplate temp = template; temp != null; temp = (ITemplate) temp.getExtendee()) {
			assert (temp.getPayload().getChildren().size() == 1);
			this.iterator.add(temp.getPayload().getChildren().get(0));
			this.iterator.previous();
		}
	}

	@Override
	protected void complete(int count) throws ModelException {
		assert (count == 1);
	}
}
