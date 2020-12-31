/**
 * Implementation of the Grasp model factory. The factory is responsible
 * for creating the root IArchitecture element of the model. This class
 * is implemented as a singleton.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2013/05/05
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.List;
import java.util.Set;

import grasp.lang.IAnnotation;
import grasp.lang.IArchitecture;
import grasp.lang.IBooleanType;
import grasp.lang.ICausalContext;
import grasp.lang.IExpression;
import grasp.lang.IFirstClass;
import grasp.lang.IIntegerType;
import grasp.lang.IModelFactory;
import grasp.lang.INamedValue;
import grasp.lang.IRationale;
import grasp.lang.IRealType;
import grasp.lang.ISetType;
import grasp.lang.IStringType;
import grasp.lang.ISyntaxNode;
import grasp.lang.IType;


public class ModelFactory implements IModelFactory {
	//
	// Fields
	//
	private static final IModelFactory instance = new ModelFactory();

	//
	// Singleton pattern implementation
	// Constructor is made private and an explicit static method
	// provides access to only instance of this class
	//
	private ModelFactory() {}

	public static IModelFactory instance() {
		return ModelFactory.instance;
	}
	
	//
	// IModelFactory implementation
	//
	@Override
	public IArchitecture newModel() {
		return new Architecture();
	}

	@Override
	public IArchitecture newModel(String name) {
		return new Architecture(name);
	}

	@Override
	public IAnnotation newAnnotation() {
		return new Annotation();
	}

	@Override
	public IAnnotation newAnnotation(String handler) {
		return new Annotation(handler);
	}

	@Override
	public INamedValue newNamedValue() {
		return new NamedValue();
	}

	@Override
	public INamedValue newNamedValue(String name, IExpression value) {
		return new NamedValue(name, value);
	}

	@Override
	public ICausalContext newCausalContext() {
		return new CausalContext();
	}

	@Override
	public ICausalContext newCausalContext(IRationale rationale) {
		return new CausalContext(rationale);
	}

	@Override
	public ICausalContext newCausalContext(IRationale rationale, List<IFirstClass> arguments) {
		return new CausalContext(rationale, arguments);
	}

	@Override
	public IExpression newExpression(ISyntaxNode node) {
		return new Expression(node);
	}

	@Override
	public IBooleanType newBooleanType(Boolean value) {
		return new BooleanType(value);
	}

	@Override
	public IIntegerType newIntegerType(Integer value) {
		return new IntegerType(value);
	}

	@Override
	public IRealType newRealType(Double value) {
		return newRealType(value);
	}

	@Override
	public IStringType newStringType(String value) {
		return new StringType(value);
	}

	@Override
	public ISetType newSetType(Set<? extends IType<?>> value) {
		return new SetType(value);
	}
}

