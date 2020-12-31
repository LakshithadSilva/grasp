/**

 * Implements the LAYER element.
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
import java.util.Collections;
import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;

import grasp.lang.IArchitecture;
import grasp.lang.ILayer;
import grasp.lang.ModelException;


class Layer extends AbstractBecause implements ILayer {
	//
	// Constants
	//
	private static final String ERR_NOTALAYER = "Layer stacking order specifier '%s' does not refer to a layer";
	private static final String ERR_HASOVERLAYER = "Stacking order for layer '%s' already contains '%s'";
	private static final String ERR_CYCLICSTACKING = "Cyclic reference within stacking order";

	//
	// Fields
	//
	private final List<ILayer> over = new ArrayList<ILayer>();

	//
	// Constructors
	//
	public Layer(IArchitecture model) {
		super(ElementSpecifier.LAYER, model);
	}

	public Layer(IArchitecture model, String name) {
		super(ElementSpecifier.LAYER, model, name);
	}

	//
	// ILayer implementation
	//
	@Override
	public List<ILayer> getOver() {
		return Collections.unmodifiableList(this.over);
	}

	@Override
	public void addOver(ILayer over) throws ModelException {
		// Check validity of layer object
		if (over.getElementSpecifier() != ElementSpecifier.LAYER) {
			throw makeError(ERR_NOTALAYER, getName());
		}
		// Check if given layer is already included in stacking order
		if (this.over.contains(over)) {
			throw makeError(ERR_HASOVERLAYER, getName(), over.getName());
		}
		// Check if given over-layer causes cyclic stacking
		if (cyclicStacking(over)) {
			throw makeError(ERR_CYCLICSTACKING);
		}
		// Add layer to over list
		this.over.add(over);
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write layering
		Node layers = writer.writeNode(parent, XmlSchema.OVER.tag());
		for (ILayer layer : this.over) {
			Node node = writer.writeNode(layers, XmlSchema.LAYER_REF.tag());
			writer.writeNodeAttribute(node, XmlSchema.AT_REFERENCE.tag(), layer.getQualifiedName());
		}
	}

	//
	// Local implementation
	//
	private boolean cyclicStacking(ILayer layer) {
		for (ILayer l : layer.getOver()) {
			if (l == this || cyclicStacking(l))
				return true;
		}
		return false;
	}
}
