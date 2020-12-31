/**
 * Implementation of the semantic analyzer component
 * of the Grasp compiler.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.ListIterator;
import java.util.regex.Pattern;

import common.error.ErrorReport;
import common.error.IErrorReport;
import common.logging.ILogger;

import grasp.lang.elements.ModelFactory;


public class Semantor implements ISemantor {
	//
	// Constants
	//
	private static final String ERR_UNKNOWN = "Unknown semantor error: ";

	//
	// Fields
	//
	private final IErrorReport errors = new ErrorReport();
	private ISyntaxTree ast;
	private ILogger log;

	//
	// ISemantor implementation
	//
	@Override
	public IArchitecture analyse(ISyntaxTree ast, ILogger log) {
		this.ast = ast;
		this.log = log;
		this.errors.clear();
		this.log.trace("Analysing semantics and generating architecture graph...");
        return doAnalyse(this.ast.getRoot());
	}

	@Override
	public IErrorReport errors() {
		return this.errors;
	}

	//
	// Local implementation
	//
	private IArchitecture doAnalyse(ISyntaxNode root) {
		assert (root.getTokenId() == Parser.ARCHITECTURE);
		return this.<IArchitecture>buildElement(root, null, ModelFactory.instance().newModel());
	}

	//
	// Build an architecture element by walking through the AST
	// nodes that represent its internal structure
	//
	private <T extends IFirstClass> T buildElement(ISyntaxNode node, IFirstClass parent, T element) {
		// A native iterator is used here so that sub-nodes within a BASE node
		// can be correctly copied to the current node
		for (ListIterator<ISyntaxNode> iterator = node.getChildren().listIterator(); iterator.hasNext();) {
			ISyntaxNode synn = iterator.next();
			try {
				switch (synn.getTokenId()) {
				case Parser.NAME:
					handleToken_NAME(synn, parent, element);
					break;

				case Parser.PARMS:
					handleToken_PARMS(synn, element);
					break;

				case Parser.EXTENDS:
					handleToken_EXTENDS(synn, element);
					break;

				case Parser.BASE:
					handleToken_BASE(synn, element, iterator);
					break;

				case Parser.ARGS:
					handleToken_ARGS(synn, parent, element);
					break;

				case Parser.OVER:
					handleToken_OVER(synn, parent, element);
					break;

				case Parser.BECAUSE:
					handleToken_BECAUSE(synn, parent, element);
					break;

				case Parser.SUPPORTS:
					handleToken_SUPPORTS(synn, element);
					break;

				case Parser.INHIBITS:
					handleToken_INHIBITS(synn, element);
					break;

				case Parser.IFTYPE:
					handleToken_IFTYPE(synn, element);
					break;

				case Parser.MAXDEG:
					handleToken_MAXDEG(synn, element);
					break;

				case Parser.CONSUMER:
					handleToken_CONSUMER(synn, parent, element);
					break;

				case Parser.PROVIDERS:
					handleToken_PROVIDERS(synn, parent, element);
					break;

				case Parser.EXPR:
					handleToken_EXPR(synn, element);
					break;

				case Parser.ANNOTATION:
					handleToken_ANNOTATION(synn, element);
					break;

				case Parser.BODY:
					handleToken_BODY(synn, element);
					break;

				case Parser.PAYLOAD:
					handleToken_PAYLOAD(synn, element);
					break;

				default:
					assert (false);
				}
			} catch (ModelException e) {
				this.errors.add(new SemantorError(this.ast.getSource(), synn, e.message()));
			} catch (SemantorException e) {
				this.errors.add(new SemantorError(this.ast.getSource(), e.node(), e.message()));
			} catch (SemantorMultiException e) {
				for (SemantorException ie : e.innerExceptions()) {
					this.errors.add(new SemantorError(this.ast.getSource(), ie.node(), ie.message()));
				}
			} catch (Exception e) {
				this.errors.add(new SemantorError(this.ast.getSource(), synn, ERR_UNKNOWN + e.getMessage()));
			}
		}
		return element;
	}

	//
	// Token handler: NAME
	//
	private void handleToken_NAME(ISyntaxNode node, IFirstClass parent, IFirstClass element) {
		assert (node.getChildren().size() == 1);
		new NameDeclarator(node, parent, element).declare();
	}

	//
	// Token handler: PARMS
	//
	private void handleToken_PARMS(ISyntaxNode node, IFirstClass element) {
		assert (node.getChildren().size() > 0);
		new ParamDeclarator(node, element, element).declare();
	}

	//
	// Token handler: EXTENDS
	//
	private void handleToken_EXTENDS(ISyntaxNode node, IFirstClass element) {
		assert (node.getChildren().size() == 1);
		new ExtendsResolver(node, element).resolve();
	}

	//
	// Token handler: BASE
	//
	private void handleToken_BASE(ISyntaxNode node, IFirstClass element, ListIterator<ISyntaxNode> iterator) {
		assert (node.getChildren().size() == 1);
		new TemplateResolver(node, element, iterator).resolve();
	}

	//
	// Token handler: ARGS
	//
	private void handleToken_ARGS(ISyntaxNode node, IFirstClass parent, IFirstClass element) {
		assert (node.getChildren().size() != 0);
		new ArgumentsResolver(node, parent, element).resolve();
	}

	//
	// Token handler: OVER
	//
	private void handleToken_OVER(ISyntaxNode node, IFirstClass parent, IFirstClass element) {
		assert (node.getChildren().size() != 0);
		new LayeringResolver(node, parent, element).resolve();
	}

	//
	// Token handler: SUPPORTS
	//
	private void handleToken_SUPPORTS(ISyntaxNode node, IFirstClass element) {
		assert (element instanceof IHasSupports);
		assert (node.getChildren().size() != 0);
		// TODO: Process SUPPORTS
	}

	//
	// Token handler: INHIBITS
	//
	private void handleToken_INHIBITS(ISyntaxNode node, IFirstClass element) {
		assert (element instanceof IHasInhibits);
		assert (node.getChildren().size() != 0);
		// TODO: Process INHIBITS
	}

	//
	// Token handler: IFTYPE
	//
	private void handleToken_IFTYPE(ISyntaxNode node, IFirstClass element) {
		assert (element instanceof IInterface);
		assert (node.getChildren().size() == 1);
		((IInterface) element).setInterfaceType(node.getChildren().get(0).getTokenText());
	}

	//
	// Token handler: MAXDEG
	//
	private void handleToken_MAXDEG(ISyntaxNode node, IFirstClass element) {
		assert (element instanceof IProvides);
		assert (node.getChildren().size() == 1);
		assert (Pattern.matches("[0-9]+", node.getChildren().get(0).getTokenText()));
		((IProvides) element).setMaxdeg(Integer.parseInt(node.getChildren().get(0).getTokenText()));
	}

	//
	// Token handler: CONSUMER (this is a 'requires' interface)
	//
	private void handleToken_CONSUMER(ISyntaxNode node, IFirstClass parent, IFirstClass element) {
		assert (element instanceof ILink);
		assert (node.getChildren().size() == 1);
		new LinkConsumerResolver(node, parent, element).resolve();
	}

	//
	// Token handler: PROVIDERS (these are 'provides' interfaces)
	//
	private void handleToken_PROVIDERS(ISyntaxNode node, IFirstClass parent, IFirstClass element) {
		assert (element instanceof ILink);
		assert (node.getChildren().size() != 0);
		new LinkProviderResolver(node, parent, element).resolve();
	}

	//
	// Token handler: EXPR
	//
	private void handleToken_EXPR(ISyntaxNode node, IElement element) {
		assert (element instanceof IHasExpression);
		assert (node.getChildren().size() != 0);
		((IHasExpression) element).setExpression(ModelFactory.instance().newExpression(node));
	}

	//
	// Token handler: ANNOTATION
	//
	private void handleToken_ANNOTATION(ISyntaxNode node, IFirstClass element) {
		assert (node.getChildren().size() != 0);
		IAnnotation annotation = ModelFactory.instance().newAnnotation();
		for (ISyntaxNode synn : node.getChildren()) {
			switch (synn.getTokenId()) {
			case Parser.HANDLER:
				handleToken_HANDLER(synn, annotation);
				break;

			case Parser.NAMEDVALUE:
				handleToken_NAMEDVALUE(synn, annotation);
				break;

			default:
				assert (false);
			}
		}
		// Attach annotation to element
		element.addAnnotation(annotation);
	}

	//
	// Token handler: BECAUSE
	//
	private void handleToken_BECAUSE(ISyntaxNode node, IFirstClass parent, IFirstClass element) {
		assert (element instanceof IBecause);
		assert (node.getChildren().size() > 0);
		ICausalContext causal = ModelFactory.instance().newCausalContext();
		for (ISyntaxNode synn : node.getChildren()) {
			switch (synn.getTokenId()) {
			case Parser.BASIS:
				handleToken_BECAUSE_BASIS(synn, element, causal);
				break;

			case Parser.BARGS:
				handleToken_BECAUSE_BARGS(synn, parent, element, causal);
				break;

			default:
				assert (false);
			}
		}
		// Add causal context to element
		assert (causal.getRationale() != null);
		assert (causal.getArguments() != null);
		((IBecause) element).addCausalContext(causal);
	}

	//
	// Token handler: BECAUSE_BASIS
	//
	private void handleToken_BECAUSE_BASIS(ISyntaxNode node, IFirstClass element, ICausalContext causal) {
		assert (node.getChildren().size() == 1);
		assert (causal.getRationale() == null);
		new BecauseBasisResolver(node, element, causal).resolve();
	}

	//
	// Token handler: BECAUSE_BARGS
	//
	private void handleToken_BECAUSE_BARGS(ISyntaxNode node, IFirstClass parent, IFirstClass element, ICausalContext causal) {
		assert (node.getChildren().size() != 0);
		assert (causal.getRationale() != null);
		new BecauseArgsResolver(node, parent, element, causal).resolve();
	}

	//
	// Token handler: BODY
	// Recursively build the subtree beneath the given architecture element
	//
	private void handleToken_BODY(ISyntaxNode node, IFirstClass parent) {
		assert (parent != null);
		for (ISyntaxNode synn : node.getChildren()) {
			IArchitecture model = parent.getModel();
			IFirstClass child = null;
			switch (synn.getTokenId()) {
			case Parser.REQUIREMENT:
				child = this.<IRequirement>buildElement(synn, parent, model.newRequirement());
				break;

			case Parser.QATTRIBUTE:
				child = this.<IQualityAttribute>buildElement(synn, parent, model.newQualityAttribute());
				break;

			case Parser.PROPERTY:
				child = this.<IProperty>buildElement(synn, parent, model.newProperty());
				break;

			case Parser.RATIONALE:
				child = this.<IRationale>buildElement(synn, parent, model.newRationale());
				break;

			case Parser.REASON:
				child = this.<IReason>buildElement(synn, parent, model.newReason());
				break;

			case Parser.TEMPLATE:
				child = this.<ITemplate>buildElement(synn, parent, model.newTemplate());
				break;

			case Parser.SYSTEM:
				child = this.<ISystem>buildElement(synn, parent, model.newSystem());
				break;

			case Parser.LAYER:
				child = this.<ILayer>buildElement(synn, parent, model.newLayer());
				break;

			case Parser.COMPONENT:
				child = this.<IComponent>buildElement(synn, parent, model.newComponent());
				break;

			case Parser.CONNECTOR:
				child = this.<IConnector>buildElement(synn, parent, model.newConnector());
				break;

			case Parser.PROVIDES:
				child = this.<IProvides>buildElement(synn, parent, model.newProvides());
				break;

			case Parser.REQUIRES:
				child = this.<IRequires>buildElement(synn, parent, model.newRequires());
				break;

			case Parser.CHECK:
				child = this.<ICheck>buildElement(synn, parent, model.newCheck());
				break;

			case Parser.LINK:
				child = this.<ILink>buildElement(synn, parent, model.newLink());
				break;

			default:
				assert (false);
			}
			// Add child to parent. The referencing name of the child will be
			// inserted into parent's symbol table.
			assert (child != null);
			parent.addChild(child);
		}
	}

	//
	// Token handler: PAYLOAD
	//
	private void handleToken_PAYLOAD(ISyntaxNode node, IFirstClass parent) {
		assert (parent instanceof ITemplate);
		((ITemplate) parent).setPayload(node);
	}

	//
	// Token handler: HANDLER
	//
	private void handleToken_HANDLER(ISyntaxNode node, IAnnotation annotation) {
		assert (node.getChildren().size() == 1);
		annotation.setHandler(node.getChildren().get(0).getTokenText());
	}

	//
	// Token handler: NAMEDVALUE
	//
	private void handleToken_NAMEDVALUE(ISyntaxNode node, IAnnotation annotation) {
		assert (node.getChildren().size() == 2);
		INamedValue nv = ModelFactory.instance().newNamedValue();
		for (ISyntaxNode synn : node.getChildren()) {
			switch (synn.getTokenId()) {
			case Parser.NAME:
				handleToken_NV_NAME(synn, nv);
				break;

			case Parser.EXPR:
				handleToken_NV_EXPR(synn, nv);
				break;

			default:
				assert (false);
			}
		}
		annotation.addNamedValue(nv);
	}
	
	//
	// Token handler: NVNAME
	//
	private void handleToken_NV_NAME(ISyntaxNode node, INamedValue nv) {
		assert (node.getChildren().size() == 1);
		nv.setName(node.getChildren().get(0).getTokenText());
	}

	//
	// Token handler: NVEXPR
	//
	private void handleToken_NV_EXPR(ISyntaxNode node, INamedValue nv) {
		assert (node.getChildren().size() != 0);
		nv.setExpression(ModelFactory.instance().newExpression(node));
	}
}
