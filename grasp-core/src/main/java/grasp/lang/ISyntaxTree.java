/**
 * Interface for abstract syntax tree (AST) produced by the Grasp parser.
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


public interface ISyntaxTree {
	ISyntaxNode getRoot();
	ISource getSource();
	void dump(ILogger log);
}
