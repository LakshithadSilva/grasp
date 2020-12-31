/**
 * Implements the ARCHITECTURE (i.e. root) element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import grasp.lang.IArchitecture;
import grasp.lang.ICheck;
import grasp.lang.IComponent;
import grasp.lang.IConnector;
import grasp.lang.ILayer;
import grasp.lang.ILink;
import grasp.lang.IProperty;
import grasp.lang.IProvides;
import grasp.lang.IQualityAttribute;
import grasp.lang.IRationale;
import grasp.lang.IReason;
import grasp.lang.IRequirement;
import grasp.lang.IRequires;
import grasp.lang.ISystem;
import grasp.lang.ITemplate;


class Architecture extends AbstractFirstClass implements IArchitecture {
	//
	// Constructors
	//
	public Architecture() {
		super(ElementSpecifier.ARCHITECTURE, null);
		setModelToSelf();
	}

	public Architecture(String name) {
		super(ElementSpecifier.ARCHITECTURE, null, name);
		setModelToSelf();
	}

	@Override
	public IQualityAttribute newQualityAttribute() {
		return new QualityAttribute(this);
	}

	@Override
	public IQualityAttribute newQualityAttribute(String name) {
		return new QualityAttribute(this, name);
	}

	@Override
	public IRequirement newRequirement() {
		return new Requirement(this);
	}

	@Override
	public IRequirement newRequirement(String name) {
		return new Requirement(this, name);
	}

	@Override
	public IRationale newRationale() {
		return new Rationale(this);
	}

	@Override
	public IRationale newRationale(String name) {
		return new Rationale(this, name);
	}

	@Override
	public IReason newReason() {
		return new Reason(this);
	}

	@Override
	public IReason newReason(String name) {
		return new Reason(this, name);
	}

	@Override
	public ITemplate newTemplate() {
		return new Template(this);
	}

	@Override
	public ITemplate newTemplate(String name) {
		return new Template(this, name);
	}

	@Override
	public IProvides newProvides() {
		return new Provides(this);
	}

	@Override
	public IProvides newProvides(String interfaceType) {
		return new Provides(this, interfaceType);
	}

	@Override
	public IProvides newProvides(String interfaceType, String name) {
		return new Provides(this, interfaceType, name);
	}

	@Override
	public IRequires newRequires() {
		return new Requires(this);
	}

	@Override
	public IRequires newRequires(String interfaceType) {
		return new Requires(this, interfaceType);
	}

	@Override
	public IRequires newRequires(String interfaceType, String name) {
		return new Requires(this, interfaceType, name);
	}

	@Override
	public IProperty newProperty() {
		return new Property(this);
	}

	@Override
	public IProperty newProperty(String name) {
		return new Property(this, name);
	}

	@Override
	public ISystem newSystem() {
		return new System(this);
	}

	@Override
	public ISystem newSystem(String name) {
		return new System(this, name);
	}

	@Override
	public ILayer newLayer() {
		return new Layer(this);
	}

	@Override
	public ILayer newLayer(String name) {
		return new Layer(this, name);
	}

	@Override
	public IComponent newComponent() {
		return new Component(this);
	}

	@Override
	public IComponent newComponent(String name) {
		return new Component(this, name);
	}

	@Override
	public IConnector newConnector() {
		return new Connector(this);
	}

	@Override
	public IConnector newConnector(String name) {
		return new Connector(this, name);
	}

	@Override
	public ILink newLink() {
		return new Link(this);
	}

	@Override
	public ILink newLink(String name) {
		return new Link(this, name);
	}

	@Override
	public ICheck newCheck() {
		return new Check(this);
	}

	@Override
	public ICheck newCheck(String name) {
		return new Check(this, name);
	}
}
