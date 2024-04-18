package edu.illinois.cs.analysis;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.NullLiteralExpr;
import com.github.javaparser.ast.expr.AssignExpr.Operator;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class CodeModifier extends VoidVisitorAdapter
{

	/**
	 * This visit function will be automatically applied to all binary
	 * expressions in the given Java file
	 */
	@Override
	public void visit(BinaryExpr n, Object arg) {
		super.visit(n, arg);
		// TODO: complete this visit function to automatically switch the two
		// operands for all null checks specified in the homework assignment
		//System.out.println("N: " + n.toString());
		//System.out.println("Left: " + n.getLeft().toString());
		//System.out.println("Right: " + n.getRight().toString());

		if (n.getLeft().toString().equals("null")|| n.getRight().toString().equals("null"))
			if (n.getOperator() == BinaryExpr.Operator.NOT_EQUALS || n.getOperator() == BinaryExpr.Operator.EQUALS)
			{
				Expression temp = n.getLeft();
				n.setLeft(n.getRight());
				n.setRight(temp);
			}

		
	}

	// The following three visit functions are used to remove all comments to
	// facilicate the comparison with the expected version; please do not change
	@Override
	public void visit(LineComment n, Object arg) {
		n.remove();
	}

	@Override
	public void visit(BlockComment n, Object arg) {
		n.remove();
	}

	@Override
	public void visit(JavadocComment n, Object arg) {
		n.remove();
	}

}
