/**
 * Interface for a ARCHITECTURE (i.e. root) element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;


public interface IArchitecture extends IFirstClass {
	// Factory methods
	IQualityAttribute newQualityAttribute();
	IQualityAttribute newQualityAttribute(String name);
	IRequirement newRequirement();
	IRequirement newRequirement(String name);
	IRationale newRationale();
	IRationale newRationale(String name);
	IReason newReason();
	IReason newReason(String name);
	ITemplate newTemplate();
	ITemplate newTemplate(String name);
	IProvides newProvides();
	IProvides newProvides(String interfaceType);
	IProvides newProvides(String interfaceType, String name);
	IRequires newRequires();
	IRequires newRequires(String interfaceType);
	IRequires newRequires(String interfaceType, String name);
	IProperty newProperty();
	IProperty newProperty(String name);
	ISystem newSystem();
	ISystem newSystem(String name);
	ILayer newLayer();
	ILayer newLayer(String name);
	IComponent newComponent();
	IComponent newComponent(String name);
	IConnector newConnector();
	IConnector newConnector(String name);
	ILink newLink();
	ILink newLink(String name);
	ICheck newCheck();
	ICheck newCheck(String name);
}
