/**
 * Interface for a data input source.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.io;

import java.io.Reader;
import java.io.IOException;


public interface ISource {
	Reader getReader() throws IOException; 
	String getName();
	String getFullName();
}
