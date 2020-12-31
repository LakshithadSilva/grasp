/**
 * Interface for a node in the AST produced by the Grasp parser.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.List;



public interface ISyntaxNode {
	String getTokenText();
	int getTokenId();
	int getLine();
	int getColumn();
	int getStartPosition();
	int getEndPosition();
	ISyntaxNode getOwner();
	List<ISyntaxNode> getChildren();
}
