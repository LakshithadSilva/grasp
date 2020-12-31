/**
 * Abstract implementation of the ISerializable interface.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import grasp.lang.ISerializable;
import grasp.lang.ModelErrorException;
import grasp.lang.ModelWarningException;

import common.xml.IXmlWriter;



abstract class AbstractSerializable implements ISerializable {
	//
	// Names of element and attribute used for serializing an architecture
	// graph into XML. These are used in addition to Grasp element names.
	//
	protected enum XmlSchema {
		// XML elements
		ANNOTATIONS			("ANNOTATIONS"),
		PARAMETERS			("PARAMETERS"),
		ARGUMENTS			("ARGUMENTS"),
		LINKS				("LINKS"),
		OVER				("OVER"),
		BODY				("BODY"),
		PAYLOAD				("PAYLOAD"),
		NAME				("NAME"),
		EXPRESSION			("EXPRESSION"),
		BECAUSE				("BECAUSE"),
		EXTENDS				("EXTENDS"),
		BASE				("BASE"),
		PARAM				("PARAM"),
		ARGUMENT			("ARGUMENT"),
		CONSUMER			("CONSUMER"),
		PROVIDER			("PROVIDER"),
		PROVIDERS			("PROVIDERS"),	
		LINK_REF			("LINK_REF"),
		LAYER_REF			("LAYER_REF"),
		RATIONALE_REF		("RATIONALE_REF"),
		// XML attributes
		AT_HANDLER			("handler"),
		AT_NAME				("name"),
		AT_ALIAS			("alias"),
		AT_QNAME			("qualifiedName"),
		AT_RNAME			("referencedAs"),
		AT_VALUE			("value"),
		AT_RESULT			("result"),
		AT_TYPE				("type"),
		AT_TEXT				("text"),
		AT_ORDINAL			("ordinal"),
		AT_REFERENCE		("reference"),
		AT_ISINITIALISED	("initialized"),
		AT_ASTNODE			("syntaxNode"),
		AT_MAXDEG			("maxdeg"),
		AT_IFTYPE			("interfaceType"),
		AT_EMPTY			(""),
		// End
		VOID("VOID");

		// Constructor and getter
		private String tag = null;	
		XmlSchema(String tag) {
			this.tag = tag;
		}
		public String tag() {
			return this.tag;
		}
	};

	//
	// Fields
	//
	private final String rootElement;
	
	//
	// Constructors
	//
	public AbstractSerializable(String rootElement) {
		this.rootElement = rootElement;
	}

	//
	// ISerializable implementation
	//
	@Override
	public void toXml(IXmlWriter writer) {
		serialize(writer, writer.writeRoot(this.rootElement));
	}

	//
	// Protected implementation
	//
	protected ModelErrorException makeError(String message, Object... args)  {
		return new ModelErrorException(message, args);
	}

	protected ModelWarningException makeWarning(String message, Object... args) {
		return new ModelWarningException(message, args);
	}
}
