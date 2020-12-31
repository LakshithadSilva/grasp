/**
 * Implements IErrorReport to manage a collection of IError objects.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.error;


import java.util.List;
import java.util.ArrayList;

import common.logging.ILogger;


public class ErrorReport implements IErrorReport {
	//
	// Fields
	//
	private final List<IError> errors = new ArrayList<IError>();
	private static final String NL = System.getProperty("line.separator");
	private static final int BUFSZ = 4096;

	//
	// IErrorReport implementation
	//
	@Override
	public List<IError> getErrors() {
		return this.errors;
	}

	@Override
	public boolean isAny() {
		return !this.errors.isEmpty();
	}

	@Override
	public void add(IError error) {
		this.errors.add(error);
	}

	@Override
	public void clear() {
		this.errors.clear();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(BUFSZ);
		for (IError e : this.errors) {
			builder.append(e.toString());
			builder.append(NL);
		}
		return builder.toString();
	}

	@Override
	public void report(ILogger log) {
		for (IError e: this.errors) {
			e.report(log);
		}
	}
}
