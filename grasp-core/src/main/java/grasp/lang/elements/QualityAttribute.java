/**
 * Implements the QUALITY_ATTRIBUTE element.
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
import java.util.List;

import grasp.lang.IArchitecture;
import grasp.lang.IFirstClass;
import grasp.lang.IQualityAttribute;


class QualityAttribute extends AbstractHasExpressionFirstClass implements IQualityAttribute {
	//
	//
	//
	private final List<IFirstClass> supports = new ArrayList<IFirstClass>();

	//
	// Constructors
	//
	public QualityAttribute(IArchitecture model) {
		super(ElementSpecifier.QUALITY_ATTRIBUTE, model);
	}

	public QualityAttribute(IArchitecture model, String name) {
		super(ElementSpecifier.QUALITY_ATTRIBUTE, model, name);
	}

	//
	// ISupports implementation
	//
	@Override
	public List<IFirstClass> getSupports() {
		return this.supports;
	}
}
