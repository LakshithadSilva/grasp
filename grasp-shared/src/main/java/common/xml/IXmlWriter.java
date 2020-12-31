/**
 * Interface for a simplified Xml writer.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.xml;

import org.w3c.dom.Node;
import java.io.Writer;
import javax.xml.transform.TransformerException;


public interface IXmlWriter {
	Node writeRoot(String name);
	Node writeNode(Node parent, String name);
	Node writeNode(Node parent, String name, Object text);
	void writeNodeText(Node node, Object value);
	void writeNodeAttribute(Node node, String name, Object value);
	void serialize(Writer output) throws TransformerException;
}
