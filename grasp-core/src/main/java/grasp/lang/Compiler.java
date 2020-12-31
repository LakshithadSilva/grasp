/**
 * Front end implementation of the Grasp compiler.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import grasp.Main;
import common.app.IAppContext;
import common.error.IErrorReport;
import common.io.ISource;
import common.logging.ILogger;


public class Compiler implements ICompiler {
	//
	// Fields
	//
	private IErrorReport errors;

	//
	// ICompiler implementation
	//
	@Override
	public IArchitecture compile(ISource source, ILogger log) {
		// Start compilation pipeline
		log.print("Compiling %s...", source.getFullName());

		// Parse
		IParser parser = new Parser();
		ISyntaxTree tree = parser.parse(source, log);
		if ((this.errors = parser.errors()).isAny()) {
			this.errors.report(log);
			return null;
		}
		
		// Dump tree in debug mode
		IAppContext appcon = Main.instance().context();
		if (appcon != null && appcon.isDebugging()) {
			tree.dump(log);
		}

		// Analyse
		ISemantor semantor = new Semantor();
		IArchitecture graph = semantor.analyse(tree, log);
		if ((this.errors = semantor.errors()).isAny()) {
			this.errors.report(log);
			return null;
		}

		// Evaluate
		IEvaluator evaluator = new Evaluator();
		evaluator.evaluate(graph, log);
		if ((this.errors = evaluator.errors()).isAny()) {
			this.errors.report(log);
			return null;
		}

		// Done
		log.print("Compilation successful.");
		return graph;
	}

	@Override
	public IErrorReport errors() {
		return this.errors;
	}
}
