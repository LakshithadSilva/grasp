package grasp.lang;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;


/**
 * Root interface for all serializable nodes of an architecture graph.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */
public interface ISerializable {
	/**
	 * Serialize the Grasp graph into XML using the node used for invoking this
	 * method as the root element in the resulting XML data. This methods invokes
	 * the {@link #serialize(IXmlWriter, Node)} method.
	 * 
	 * @param writer
	 * An IXmlWriter instance into which the graph is serialized.
	 */
	void toXml(IXmlWriter writer);

	/**
	 * Serialize the Grasp graph into XML using {@code parent} as the root node.
	 * 
	 * @param writer
	 * An IXmlWriter instance into which the object is serialized.
	 * 
	 * @param parent
	 * Root node of XML document.
	 */
	void serialize(IXmlWriter writer, Node parent);
}
