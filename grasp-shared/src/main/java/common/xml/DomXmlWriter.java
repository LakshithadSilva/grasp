/**
 * Provides a simple IXmlWriter implementation using the Java XML DOM API.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.xml;

import java.io.Writer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.Document;


public class DomXmlWriter implements IXmlWriter {
	//
	// Fields
	//
	private final Document document;
	
	//
	// Constructors
	//
	public DomXmlWriter() throws ParserConfigurationException {
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		this.document = builder.newDocument();
	}

	//
	// Implementation for IXmlWriter
	//
	@Override
	public Node writeRoot(String name) {
		assert this.document != null;
		Node node = this.document.createElement(name);
		this.document.appendChild(node);
		return node;
	}

	@Override
	public Node writeNode(Node parent, String name) {
		assert this.document != null;
		Node node = this.document.createElement(name);
		parent.appendChild(node);
		return node;
	}

	@Override
	public Node writeNode(Node parent, String name, Object text) {
		assert this.document != null;
		Node node = writeNode(parent, name);
		writeNodeText(node, text);
		return node;
	}

	@Override
	public void writeNodeText(Node node, Object value) {
		assert this.document != null;
		if (value != null) {
			node.appendChild(this.document.createTextNode(value.toString()));
		}
	}

	@Override
	public void writeNodeAttribute(Node node, String name, Object value) {
		assert this.document != null;
		((Element) node).setAttribute(name, value == null ? "" : value.toString());
	}
	
	@Override
	public void serialize(Writer output) throws TransformerException {
		assert this.document != null;
		// Write xml data to output stream
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
		transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");	
		transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
		transformer.transform(new DOMSource(this.document), new StreamResult(output));
	}
}
