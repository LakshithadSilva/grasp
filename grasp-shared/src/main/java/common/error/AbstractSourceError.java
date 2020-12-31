/* Abstract implementation of an source-based error object.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.error;

import common.io.ISource;


public class AbstractSourceError extends AbstractError implements ISourceError {
	//
	// Fields
	//
	protected final ISource source;
	protected final int startRow;
	protected final int startCol;
	protected final int endRow;
	protected final int endCol;

	//
	// Constructors
	//
	public AbstractSourceError(ISource source, int startRow, int startCol, int endRow, int endCol, String message, Object... args) {
		super(message, args);
		this.source = source;
		this.startRow = startRow;
		this.startCol = startCol;
		this.endRow = endRow;
		this.endCol = endCol;
	}

	//
	// ISourceError implementation
	//
	@Override
	public ISource getSource() {
		return this.source;
	}

	@Override
	public int getStartRow() {
		return this.startRow;
	}

	@Override
	public int getStartCol() {
		return this.startCol;
	}

	@Override
	public int getEndRow() {
		return this.endRow;
	}

	@Override
	public int getEndCol() {
		return this.endCol;
	}
}
