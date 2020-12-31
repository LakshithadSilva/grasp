/**
 * Implementation of the abstract syntax tree (AST) component.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import common.io.ISource;
import common.logging.ILogger;


public class SyntaxTree implements ISyntaxTree {
	//
	// Fields
	//
	private final ISyntaxNode root;
	private final ISource source;

	//
	// Constructors
	//
	public SyntaxTree(ISyntaxNode root, ISource source) {
		this.root = root;
		this.source = source;
	}

	//
	// ISyntaxTree implementation
	//
	@Override
	public ISyntaxNode getRoot() {
		return this.root;
	}

	@Override
	public ISource getSource() {
		return this.source;
	}

	@Override
	public void dump(ILogger log) {
		if (this.getRoot() != null) {
			dumpTree(this.getRoot(), 0, log);
		}
		return;
	}
	
	//
	// Local implementation
	//
	private void dumpTree(ISyntaxNode node, int indent, ILogger log) {
		StringBuffer sb = new StringBuffer(indent);
		for (int i = 0; i < indent; i++) {
			sb = sb.append("  ");
		}
		log.print(sb.toString() + node.getTokenText());
		for (ISyntaxNode child : node.getChildren()) {
			dumpTree(child, indent + 1, log);
		}
	}
}
