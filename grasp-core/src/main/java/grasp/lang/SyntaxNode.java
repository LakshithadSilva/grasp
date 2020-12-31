/**
 * Implementation a node in the AST produced by the Grasp parser.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;


public class SyntaxNode extends CommonTree implements ISyntaxNode {
	//
	// Fields
	//
	private static final List<ISyntaxNode> emptyList = new ArrayList<ISyntaxNode>();

	//
	// Constructors
	//
	public SyntaxNode(Token token) {
		super(token);
	}

	//
	// ISyntaxNode implementation
	//
	@Override
	public String getTokenText() {
		return super.getText();
	}

	@Override
	public int getTokenId() {
		return super.getType();
	}

	@Override
	public int getLine() {
		return super.getLine();
	}
	
	@Override
	public int getColumn() {
		return super.getCharPositionInLine() + 1;
	}

	@Override
	public int getStartPosition() {
		return getColumn();
	}

	@Override
	public int getEndPosition() {
		return getColumn() + super.getText().length() - 1;
	}

	@Override
	public ISyntaxNode getOwner() {
		return (ISyntaxNode) super.getParent();
	}

	@SuppressWarnings("unchecked")
	public List<ISyntaxNode> getChildren() {
		List<? extends Object> children = super.getChildren();
		return  (List<ISyntaxNode>) (children == null ? emptyList : children);
	}

	//
	// Object implementation
	//
	@Override
	public String toString() {
		return getTokenText() + "[" + getTokenId() + ", " + getLine() + ", " + getColumn() + "]";
	}
}
