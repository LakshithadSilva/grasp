/**
 * Interface for a ANNOTATION element.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import java.util.Collection;


public interface IAnnotation extends IElement {
    String getHandler();
    Collection<INamedValue> getNamedValues();
    void setHandler(String handler);
    void addNamedValue(INamedValue nv);
}
