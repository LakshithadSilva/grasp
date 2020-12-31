/**
 * Provides a file source implementation of ISource
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package common.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;


public class FileSource implements ISource {
	//
	// Fields
	//
	private final String name;
	private final String fullName;
	
	//
	// Constructors
	//
	public FileSource(String fileName) {
		File file = new File(fileName);
		this.name = file.getName();
		this.fullName = file.getAbsolutePath();
	}
	
	//
	// Implementation of ISource
	//
	@Override
	public Reader getReader() throws IOException {
		return new BufferedReader(new FileReader(this.fullName));
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getFullName() {
		return this.fullName;
	}
}
