/**
 * Implements IExpression for Grasp expressions.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.lang.elements;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.w3c.dom.Node;

import common.xml.IXmlWriter;
import grasp.lang.IEvaluationContext;
import grasp.lang.IExpression;
import grasp.lang.ISyntaxNode;
import grasp.lang.IType;
import grasp.lang.ModelException;
import grasp.lang.Parser;


// TODO: Expression should be made independent of the AST
// or have a mechanism to cleanly separate AST logic
// from the model aspects of the Expression class
//
class Expression extends AbstractElement implements IExpression {
	//
	// Constants
	//
	private static final String ERR_TYPEMISMATCH = "Type mismatch";
	private static final String ERR_NUMBERFORMAT = "Invalid numeric format";
	private static final String ERR_BADEXPRESSION = "Malformed expression tree";

	//
	// Fields
	//
	private final ISyntaxNode root;
	private final String text;
	private IType<?> result;

	//
	// Constructors
	//
	public Expression(ISyntaxNode node) {
		super(ElementSpecifier.EXPRESSION);
		assert (node.getChildren().size() == 2);
		this.text = node.getChildren().get(0).getTokenText();
		this.root = node.getChildren().get(1);
	}

	//
	// IExpression implementation
	//
	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public IType<?> getValue() {
		return this.result;
	}

	@Override
	public void evaluate(IEvaluationContext context) throws ModelException {
		super.evaluate(context);
		// Use passed-in context for evaluating the expression
		if (this.result == null) {
			this.result = eval(this.root, context);
		}
	}

	//
	// ISerializable implementation
	//
	@Override
	public void serialize(IXmlWriter writer, Node parent) {
		super.serialize(writer, parent);
		// Write expression properties
		writer.writeNodeAttribute(parent, XmlSchema.AT_RESULT.tag(), this.result != null ? this.result.value() : XmlSchema.AT_EMPTY.tag());
		writer.writeNodeAttribute(parent, XmlSchema.AT_TYPE.tag(), this.result != null ? this.result.name() : XmlSchema.AT_EMPTY.tag());
		writer.writeNodeAttribute(parent, XmlSchema.AT_TEXT.tag(), this.text != null ? this.text : XmlSchema.AT_EMPTY.tag());
	}

	//
	// Local implementation
	//
	private IType<?> eval(ISyntaxNode node, IEvaluationContext context) throws ModelException {
		assert (node.getChildren().size() > 0);
		assert (context != null);
		List<ISyntaxNode> args = node.getChildren();
		// First handle operators with variable arguments
		// and then proceed to fixed argument operators
		switch (node.getTokenId()) {
		// Member-selection
		case Parser.MEMB:
			assert (args.size() >= 1);
			IType<?> type = context.caller().getEnclosingType();
			for (ISyntaxNode mnode : args) {
				switch (mnode.getTokenId()) {
				case Parser.FIELD:
					assert (mnode.getChildren().size() == 1);
					type = type.memb(mnode.getChildren().get(0).getTokenText());
					break;

				case Parser.FUNCTION:
					assert (mnode.getChildren().size() == 2);
					assert (mnode.getChildren().get(1).getTokenId() == Parser.ARGS);
					// Build function argument list
					List<IType<?>> fnargs = new ArrayList<IType<?>>();
					for (ISyntaxNode argnode : mnode.getChildren().get(1).getChildren()) {
						assert (argnode.getTokenId() == Parser.EXPR);
						assert (argnode.getChildren().size() == 2);
						fnargs.add(eval(argnode.getChildren().get(1), context));
					}
					type = type.memb(mnode.getChildren().get(0).getTokenText(), fnargs);
					break;

				default:
					// TODO: Should throw an Error instead of an exception
					// Malformed expression tree
					throw makeError(ERR_BADEXPRESSION);
				}
			}
			return type;
		}

		// Single argument operators
		if (args.size() == 1) {
			switch (node.getTokenId()) {
			// Literals
			case Parser.BOOLEAN:
				// TODO: handle declarative sentences
				return new BooleanType(Boolean.parseBoolean(args.get(0).getTokenText()));

			case Parser.INTEGER:
				try {
					return new IntegerType(Integer.parseInt(args.get(0).getTokenText()));
				} catch (NumberFormatException e) {
					throw makeError(ERR_NUMBERFORMAT);
				}

			case Parser.REAL:
				try {
					return new RealType(Double.parseDouble(args.get(0).getTokenText()));
				} catch (NumberFormatException e) {
					throw makeError(ERR_NUMBERFORMAT);
				}

			case Parser.STRING:
				return new StringType(args.get(0).getTokenText());

			case Parser.SET:
				// TODO: parse SetType data correctly
				return new SetType(new LinkedHashSet<IType<?>>());

			// Logical
			case Parser.NOT:
				return eval(args.get(0), context).not();

			// Bitwise
			case Parser.CMP:
				return eval(args.get(0), context).cmp();

			// Arithmetic
			case Parser.POS:
				return eval(args.get(0), context).plus();

			case Parser.NEG:
				return eval(args.get(0), context).minus();
			}
		}
		// Operators with two arguments
		if (args.size() == 2) {
			IType<?> lvalue = eval(args.get(0), context);
			IType<?> rvalue = eval(args.get(1), context);
			if (!lvalue.value().getClass().equals(rvalue.value().getClass())) {
				throw makeError(ERR_TYPEMISMATCH);
			}
			switch (node.getTokenId()) {
			// Logical operators
			case Parser.SUBSETOF:
				return lvalue.subsetof(rvalue);

			case Parser.DIS:
				return lvalue.dis(rvalue);

			case Parser.CON:
				return lvalue.con(rvalue);

			// Bitwise operators
			case Parser.IOR:
				return lvalue.or(rvalue);

			case Parser.XOR:
				return lvalue.xor(rvalue);

			case Parser.AND:
				return lvalue.and(rvalue);

			// Comparison operators
			case Parser.EQL:
				return lvalue.eq(rvalue);

			case Parser.NEQ:
				return lvalue.noteq(rvalue);

			case Parser.GTN:
				return lvalue.gt(rvalue);

			case Parser.GTE:
				return lvalue.gteq(rvalue);

			case Parser.LTN:
				return lvalue.lt(rvalue);

			case Parser.LTE:
				return lvalue.lteq(rvalue);

			// Arithmetic operators
			case Parser.ADD:
				return lvalue.add(rvalue);

			case Parser.SUB:
				return lvalue.sub(rvalue);

			case Parser.MUL:
				return lvalue.mul(rvalue);

			case Parser.DIV:
				return lvalue.div(rvalue);

			case Parser.MOD:
				return lvalue.mod(rvalue);
			}
		}
		// All possible expression tokens should be processed
		// by now. So if control reaches this point, then the
		// expression tree is malformed
		// TODO: Should throw an Error instead of an exception
		throw makeError(ERR_BADEXPRESSION);
	}
}
