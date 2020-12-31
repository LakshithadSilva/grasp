/**
 * Interface for an object that describes a Grasp function.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.List;


public interface IFunction extends IElement {
    String name();
    List<Class<IType<?>>> parameters();
    Class<IType<?>> type();
    IType<?> invoke(IElement context, List<IType<?>> args);
}
