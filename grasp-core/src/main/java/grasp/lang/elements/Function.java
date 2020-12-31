/**
 * Class that describes a Grasp FUNCTION.
 * This class is immutable.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;
import grasp.lang.IElement;
import grasp.lang.IFirstClass;
import grasp.lang.IFunction;
import grasp.lang.IEvaluationContext;
import grasp.lang.IType;
import grasp.lang.ModelException;


final class Function extends AbstractElement implements IFunction {
	//
	// Constants
	//
	private static final String ERR_ARGCOUNT = "Incorrect number of function arguments";
	private static final String ERR_ARGINVALID = "Function argument is not a Grasp type";
	private static final String ERR_ARGMISMATCH = "Mismatched function argument";
	private static final String ERR_INVOKE = "Failed to invoke Grasp function '%s' [%s]";

	//
	// Fields
	//
	private final Method method;
	private final String name;
	private final List<Class<IType<?>>> parameters;
	private final Class<IType<?>> type;

	//
	// Constructors
	//
	@SuppressWarnings("unchecked")
	public Function(Method method) {
		super(ElementSpecifier.FUNCTION);
		assert (IFirstClass.class.isAssignableFrom(method.getDeclaringClass()));
		assert (method.getAnnotation(IFirstClass.GraspMethod.class) != null);

		this.method = method;
		this.name = method.getName();
		// Get parameter types. Copy parameter types to the local list
		// so they can be checked for the correct type here
		this.parameters = new ArrayList<Class<IType<?>>>(method.getParameterTypes().length);
		for (Class<?> clazz : method.getParameterTypes()) {
			assert (IType.class.getClass().isAssignableFrom(clazz));
			this.parameters.add((Class<IType<?>>) clazz);
		}
		// Get return type
		assert (IType.class.isAssignableFrom(method.getReturnType()));
		this.type = (Class<IType<?>>) method.getReturnType();
	}

	//
	// IFunction implementation
	//
	@Override
	public String name() {
		return this.name;
	}

	@Override
	public List<Class<IType<?>>> parameters() {
		return this.parameters;
	}

	@Override
	public Class<IType<?>> type() {
		return this.type;
	}

	@Override
	public IType<?> invoke(IElement context, List<IType<?>> args) {
		// Validate function arguments
		if (args.size() != this.parameters.size()) {
			throw makeError(ERR_ARGCOUNT);
		}
		// As an optimization we copy the arguments to an Object array
		// since we are anyway scanning the argument list and this list
		// needs to be converted to an array when invoking the method
		Object[] arguments = new Object[args.size()];
		for (int i = 0; i < args.size(); ++i) {
			if (!(args.get(i) instanceof IType)) {
				throw makeError(ERR_ARGINVALID);
			}
			if (!this.parameters.get(i).isInstance(args.get(i))) {
				throw makeError(ERR_ARGMISMATCH);
			}
			arguments[i] = args.get(i);
		}
		// Invoke the method and re-throw any exceptions as a Grasp exception
		// The return value also should not be null
		try {
			Object result = this.method.invoke(context, arguments);
			assert (result !=null && result instanceof IType);
			return (IType<?>) result;
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw makeError(ERR_INVOKE, this.name, e.getMessage());
		}
	}

	//
	// IElement implementation
	//
	@Override
	public void evaluate(IEvaluationContext context) throws ModelException {
		super.evaluate(context);
		// Do nothing! Functions are not evaluated, and they are
		// invoked only when evaluating an expression
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Not need to serialize functions 
	}
}
