/**
 * Abstract class that provides base implementation for IBecause.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IArchitecture;
import grasp.lang.IBecause;
import grasp.lang.ICausalContext;
import grasp.lang.IFirstClass;
import grasp.lang.IRationale;
import grasp.lang.ModelException;


abstract class AbstractBecause extends AbstractFirstClass implements IBecause {
	//
	// Constants
	//
	private static final String ERR_HASRATIONALE = "Rationale '%s' has already been used in a causal context";

	//
	// Fields
	//
	private final Map<String, ICausalContext> causals = new HashMap<String, ICausalContext>();

	//
	// Constructors
	//
	public AbstractBecause(ElementSpecifier elementSpecfier, IArchitecture model) {
		super(elementSpecfier, model);
	}

	public AbstractBecause(ElementSpecifier elementSpecfier, IArchitecture model, String name) {
		super(elementSpecfier, model, name);
	}

	//
	// IBecause implementation
	//
	@Override
	public Collection<ICausalContext> getCausalContexts() {
		return Collections.unmodifiableCollection(this.causals.values());
	}

	@Override
	public void addCausalContext(ICausalContext causal) throws ModelException {
		// Check if rationale has not already been specified
		assert (causal.getRationale() != null);
		String rationaleName = causal.getRationale().getReferencingName();
		if (this.causals.containsKey(rationaleName)) {
			throw makeError(ERR_HASRATIONALE, rationaleName);
		}
		// Add causal context to list
		this.causals.put(rationaleName, causal);
	}

	@Override
	public void addCausalContext(IRationale rationale, List<IFirstClass> arguments) throws ModelException {
		// Create a new causal context and add to list
		addCausalContext(new CausalContext(rationale, arguments));
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write list of causal contexts
		Node because = writer.writeNode(parent, XmlSchema.BECAUSE.tag());
		for (ICausalContext causal : this.causals.values()) {
			Node node = writer.writeNode(because, causal.getElementSpecifier().name());
			causal.serialize(writer, node);
		}
	}
}
