/**
 * Describes a location within a source file. Used primarily for
 * specifying the location of an error within a source.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2012/06/18
 *  	
 * @since		1.00
 * 
 */

package common.error;

public interface ISourceLocation {
	int getStartRow();
	int getStartCol();
	int getEndRow();
	int getEndCol();
}
