/**
 * Main application class of the Grasp compiler. This class 
 * is implemented as a singleton.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

import common.app.IApplication;
import common.app.console.ConsoleAppContext;
import common.app.console.ConsoleApp;
import common.io.FileSource;
import common.io.ISource;
import common.logging.ILogger;
import common.xml.DomXmlWriter;
import common.xml.IXmlWriter;
import grasp.app.ApplicationInfo;
import grasp.app.RuntimeContext;
import grasp.lang.Compiler;
import grasp.lang.IArchitecture;
import grasp.lang.ICompiler;


public final class Main extends ConsoleApp {
	//
	// Fields
	//
	private static final Main instance = new Main();

	//
	// Singleton implementation
	// Block explicit construction and provide a static method
	// for returning a reference to the one and only instance
	//
	private Main() {}

	public static IApplication instance() {
		return Main.instance;
	}

	//
	// Application entry point
	//
	public static void main(String[] args) {
		Main.instance().launch(args,
				new ConsoleAppContext(ApplicationInfo.APP_NAME,
						RuntimeContext.LOGGING,
						RuntimeContext.DEBUG));
	}

	//
	// IApplication implementation
	//
	@Override
	public void showCopyright(ILogger log) {
		log.print();
		log.print(ApplicationInfo.APP_COPYRIGHT1,
				ApplicationInfo.APP_VERSION_MAJOR,
				ApplicationInfo.APP_VERSION_MINOR,
				ApplicationInfo.APP_VERSION_BUILD,
				ApplicationInfo.ANTLR_VERSION_MAJOR,
				ApplicationInfo.ANTLR_VERSION_MINOR);
		log.print(ApplicationInfo.APP_COPYRIGHT2, ApplicationInfo.APP_VERSION_YEAR);
		log.print(ApplicationInfo.APP_COPYRIGHT3);
	}

	@Override
	public boolean checkArguments(String[] args, ILogger log) {
		if (args.length != 1 && args.length != 2) {
			return false;
		}
		return true;
	}

	@Override
	public void showUsage(ILogger log) {
		log.print();
		log.print("Usage: graspc <input> [<output>]");
		log.print("    <input>     - Grasp architecture specification (.grasp)");
		log.print("    <output>    - File to which the XML architecture graph is written (.xml)");
		log.print();
	}

	@Override
	public boolean startup(String[] args, ILogger log) {
		boolean hasOutFile = args.length == 2;
		// Invoke compiler and check for errors
		log.print("Running compiler...");
		ISource source = new FileSource(args[0]);
		ICompiler compiler = new Compiler();
		IArchitecture graph = compiler.compile(source, log);
		if (compiler.errors().isAny() || graph == null) {
			log.print("Failed.");
			return false;
		}

		// Write graph to output as xml
		log.print("Writing architecture to output...");
		try {
			BufferedWriter out = new BufferedWriter(hasOutFile ?
					new FileWriter(args[1]) :
					new OutputStreamWriter(System.out));
			IXmlWriter writer = new DomXmlWriter();
			graph.toXml(writer);
			writer.serialize(out);
			if (hasOutFile) {
				out.close();
			}
		} catch (Exception e) {
			log.error("Unable to write to output.", e);
			return false;
		}

		// Done
		log.print("Output written to %s.", hasOutFile ? args[1] : "console");
		return true;
	}

	@Override
	public boolean cleanup(ILogger log) {
		log.print("Done.");
		log.print();
		return true;
	}
}
