package grasp.lang.elements;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IArchitecture;
import grasp.lang.IInterface;
import grasp.lang.ILink;
import grasp.lang.ModelException;


abstract class AbstractInterface extends AbstractBecause implements IInterface {
	//
	// Constants
	//
	private static final int NOMAX = -1;
	private static final String ERR_NOCAPACITY = "Interface not accepting further link connections (maxdeg = %d)";
	private static final String ERR_LINKFOUND = "Interface already bound to link";
	private static final String ERR_LINKNOTFOUND = "Interface not bound to link";

	//
	// Fields
	//
	private final List<ILink> links = new ArrayList<ILink>();
	private int maxdeg	= AbstractInterface.NOMAX;
	private String interfaceType;

	//
	// Constructors
	//
	public AbstractInterface(ElementSpecifier elementSpecifier, IArchitecture model) {
		super(elementSpecifier, model);
	}

	public AbstractInterface(ElementSpecifier elementSpecifier, IArchitecture model, String interfaceType) {
		super(elementSpecifier, model);
		this.interfaceType = interfaceType;
	}

	public AbstractInterface(ElementSpecifier elementSpecifier, IArchitecture model, String interfaceType, String name) {
		super(elementSpecifier, model, name);
		this.interfaceType = interfaceType;
	}

	//
	// IFirstClass implementation
	//
	@Override
	public String getReferencingName() {
		String name = getName();
		return name != null ? name : this.interfaceType;
	}

	//
	// IInterface implementation
	//
	@Override
	public List<ILink> getLinks() {
		return this.links;
	}

	@Override
	public int getMaxdeg() {
		return this.maxdeg;
	}

	@Override
	public String getInterfaceType() {
		return this.interfaceType;
	}

	@Override
	public boolean hasLinks() {
		return !this.links.isEmpty();
	}

	@Override
	public boolean hasCapacity() {
		// Maxdeg == -1 means no connection limit imposed
		return this.maxdeg < 0 ? true : this.maxdeg > getLinks().size();
	}

	@Override
	public boolean isCompatible(IInterface other) {
		return  this.interfaceType != null &&
				this.interfaceType.equals(other.getInterfaceType()) &&
				((this.getElementSpecifier() == ElementSpecifier.PROVIDES && other.getElementSpecifier() == ElementSpecifier.REQUIRES) ||
						(this.getElementSpecifier() == ElementSpecifier.REQUIRES && other.getElementSpecifier() == ElementSpecifier.PROVIDES));
	}

	@Override
	public void setMaxdeg(int maxdeg) {
		this.maxdeg = maxdeg < 0 ? AbstractInterface.NOMAX : Math.max(maxdeg, this.links.size());
	}

	@Override
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write interface-type and maxdeg
		writer.writeNodeAttribute(parent, XmlSchema.AT_IFTYPE.tag(), this.interfaceType);
		writer.writeNodeAttribute(parent, XmlSchema.AT_MAXDEG.tag(), this.maxdeg);
		// Write list of connections
		Node group = writer.writeNode(parent, XmlSchema.LINKS.tag());
		for (ILink link : this.links) {
			Node node = writer.writeNode(group, XmlSchema.LINK_REF.tag());
			writer.writeNodeAttribute(node, XmlSchema.AT_REFERENCE.tag(), link.getQualifiedName());
		}
	}

	//
	// Local implementation
	// These methods are visible only at package level, specifically
	// to be used by the Link class
	//
	void bind(ILink link)  throws ModelException {
		// Check if we have capacity
		if (!hasCapacity()) {
			throw makeError(ERR_NOCAPACITY);
		}
		// Check if we are already bound to given link
		if (this.links.contains(link)) {
			throw makeError(ERR_LINKFOUND);
		}
		// Bind to link
		this.links.add(link);
	}
	
	void free(ILink link)  throws ModelException {
		// Check if we are bound to given link
		if (!this.links.contains(link))  {
			throw makeError(ERR_LINKNOTFOUND);
		}
		// Free binding
		this.links.remove(link);
	}
}
