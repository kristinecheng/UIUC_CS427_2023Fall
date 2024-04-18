package edu.illinois.cs.analysis;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import javassist.compiler.ast.Keyword;

public class CodeParser extends VoidVisitorAdapter
{
	int methNum = 0;

	/**
	 * Following the visitor pattern design, this visit function will be
	 * automatically applied to all method declarations within the given
	 * compilation unit (i.e., Java files).
	 */
	@Override
	public void visit(MethodDeclaration n, Object arg) {
		super.visit(n, arg);

		// TODO: add your implementation here so that it counts the methods
		// satisfying the listed constriants rather than all possible methods


		if (n.getBody().isPresent()) // Has actual body declaration 
			if (n.getParameters().size() > 0) // has at least one input parameter
				if (n.getModifiers().toString().contains("public")) // is public method
					if (!n.getModifiers().toString().contains("static")) // is not a static method
						if (!n.getType().toString().equals("void")) // has a return type (non-void)	
							methNum++;

		//System.out.print("Method Name: " + n.getName().toString());
		//System.out.println("\nMethod Modifier: " + n.getModifiers().toString());
	}
}
