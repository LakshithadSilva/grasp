/**
 * Implements the LINK element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IArchitecture;
import grasp.lang.IFirstClass;
import grasp.lang.ILink;
import grasp.lang.IProvides;
import grasp.lang.IRequires;
import grasp.lang.ModelException;


class Link extends AbstractBecause implements ILink {
	//
	// Constants
	//
	private static final String ERR_NOMATCHINGINTERFACE = "Specified element '%s' has no matching 'provides' interface to use as link endpoint";
	private static final String ERR_NOTAREQUIRES = "Specified link consumer endpoint '%s' is not a 'requires' interface";
	private static final String ERR_NOTAPROVIDES = "Specified link provider endpoint '%s' is not a 'provides' interface";
	private static final String ERR_INCOMPATIBLE = "Specified link provider endpoint '%s' is not compatible with consumper interface";
	private static final String ERR_HASCONSUMER = "Link attached to a another counsumer";
	private static final String ERR_HASPROVIDER = "Link already attached to provider";
	private static final String ERR_NOCONSUMER = "No attached interface at the consumer endpoint of link element";
	private static final String ERR_DUPLICATEPAIR = "Duplicate link connection";

	//
	// Static fields
	//
	private static final Set<Long> pairs = new HashSet<Long>();

	//
	// Fields
	//
	private IRequires consumer;
	private List<IProvides> providers = new ArrayList<IProvides>();

	//
	// Constructors
	//
	public Link(IArchitecture model) {
		super(ElementSpecifier.LINK, model);
	}

	public Link(IArchitecture model, String name) {
		super(ElementSpecifier.LINK, model, name);
	}

	//
	// ILink implementation
	//
	@Override
	public IRequires getConsumer() {
		return this.consumer;
	}

	@Override
	public List<IProvides> getProviders() {
		return this.providers;
	}

	@Override
	public void attachConsumer(IFirstClass consumer) throws ModelException {
		// Check validity of given consumer interface
		if (consumer.getElementSpecifier() != ElementSpecifier.REQUIRES) { 
			throw makeError(ERR_NOTAREQUIRES, consumer.getReferencingName());
		}
		// Check if we have a different consumer already attached
		if (this.consumer != null && this.consumer != consumer) {
			throw makeError(ERR_HASCONSUMER);
		}
		// Bind interface as consumer
		if (this.consumer == null) {
			assert (consumer instanceof IRequires);
			assert (consumer instanceof AbstractInterface);
			((AbstractInterface) consumer).bind(this);
			this.consumer = (IRequires) consumer;
		}
	}

	@Override
	public void attachProvider(IFirstClass provider) throws ModelException {
		// Check if we have a consumer specified
		if (this.consumer == null) {
			throw makeError(ERR_NOCONSUMER);
		}
		// If the given element is a component or connector, then search
		// for a compatible 'provides' interface within this element
		if ((provider.getElementSpecifier() == ElementSpecifier.COMPONENT) || (provider.getElementSpecifier() == ElementSpecifier.CONNECTOR)) {
			IProvides match = findProvidesInterface(provider);
			if (match == null) {
				throw makeError(ERR_NOMATCHINGINTERFACE, provider.getName());
			}
			provider = match;
		}
		// Check validity of given provider interface
		if (provider.getElementSpecifier() != ElementSpecifier.PROVIDES) {
			throw makeError(ERR_NOTAPROVIDES, provider.getReferencingName());
		}
		// Check if provider is compatible with consumer
		assert (provider instanceof IProvides);
		assert (provider instanceof AbstractInterface);
		if (!((IProvides) provider).isCompatible(this.consumer)) {
			throw makeError(ERR_INCOMPATIBLE, provider.getReferencingName());
		}
		// Check if we have same provider already attached
		if (this.providers.contains(provider)) {
			throw makeError(ERR_HASPROVIDER);
		}
		// Check if the consumer-provider pair is unique
		if (Link.pairs.contains(makeConnectionPair(provider))) {
			throw makeError(ERR_DUPLICATEPAIR);
		}
		// Bind interface as a provider
		((AbstractInterface) provider).bind(this);
		this.providers.add((IProvides) provider);
		// Add this consumer-provider pair to the unique pairs list
		Link.pairs.add(makeConnectionPair(provider));
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		assert (this.consumer != null);
		assert (this.providers.size() != 0);
		super.serialize(writer, parent);
		// Consumer
		Node node;
		node = writer.writeNode(parent, XmlSchema.CONSUMER.tag());
		writer.writeNodeAttribute(node, XmlSchema.AT_REFERENCE.tag(), this.consumer.getQualifiedName());
		// Providers
		Node group = writer.writeNode(parent, XmlSchema.PROVIDERS.tag());
		for (IProvides provider : this.providers) {
			node = writer.writeNode(group, XmlSchema.PROVIDER.tag());
			writer.writeNodeAttribute(node, XmlSchema.AT_REFERENCE.tag(), provider.getQualifiedName());
		}
		return;
	}
	
	//
	// Local implementation
	//
	private IProvides findProvidesInterface(IFirstClass parent) {
		for (IFirstClass provider : parent.getBody(ElementSpecifier.PROVIDES)) {
			assert (provider instanceof IProvides);
			if (this.consumer.isCompatible((IProvides) provider)) {
				return (IProvides) provider;
			}
		}
		return null;
	}
	
	private Long makeConnectionPair(IFirstClass provider) {
		return ((long) this.consumer.getInstanceId()) << Integer.SIZE | ((long) provider.getInstanceId());
	}
}

