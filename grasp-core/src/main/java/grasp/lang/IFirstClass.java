/**
 * Interface that identifies a first-class element in a Grasp model.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collection;


public interface IFirstClass extends IElement {
	IArchitecture getModel();
	IFirstClass getParent();
	String getName();
	String getReferencingName();
	String getQualifiedName();
	Collection<IAnnotation> getAnnotations();
	Collection<IFunction> getFunctions();
	Collection<IFirstClass> getBody();
	Collection<IFirstClass> getBody(ElementSpecifier type);
	void setName(String name) throws ModelException;
	// Child operations
	void addChild(IFirstClass child) throws ModelException;
//	IFirstClass getChild(String name) throws ModelException;
//	IFirstClass deleteChild(String name) throws ModelException;
//	boolean lookupChild(String name);
	boolean isContainable(IElement element);
	// Annotation operations
	void addAnnotation(IAnnotation annotation) throws ModelException;
	
	// 
	// Java annotation for tagging Grasp methods
	//
	@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
	@Target(java.lang.annotation.ElementType.METHOD)
	@interface GraspMethod {}
}
