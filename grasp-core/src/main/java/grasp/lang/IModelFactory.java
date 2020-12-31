/**
 * Interface for the Grasp model factory. The factory is responsible
 * for creating the root IArchitecture element of the model
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2013/05/05
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.List;
import java.util.Set;


public interface IModelFactory {
	// Architecture root element
	IArchitecture newModel();
	IArchitecture newModel(String name);
	// Non first class elements
	IAnnotation newAnnotation();
	IAnnotation newAnnotation(String handler);
	INamedValue newNamedValue();
	INamedValue newNamedValue(String name, IExpression value);
	ICausalContext newCausalContext();
	ICausalContext newCausalContext(IRationale rationale);
	ICausalContext newCausalContext(IRationale rationale, List<IFirstClass> arguments);
	IExpression newExpression(ISyntaxNode node);
	// Types
	IBooleanType newBooleanType(Boolean value);
	IIntegerType newIntegerType(Integer value);
	IRealType newRealType(Double value);
	IStringType newStringType(String value);
	ISetType newSetType(Set<? extends IType<?>> value);
}
