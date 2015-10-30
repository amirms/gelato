/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import org.eclipse.emf.ecore.EClass;

public class KernelSyntaxCoverageInformationProvider {
	
	public EClass[] getClassesWithSyntax() {
		return new EClass[] {
			org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(),
			org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.eINSTANCE.getDataItem(),
			org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(),
			org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getGoto(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAssignmentStatement(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExpressionStatement(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAbort(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getSkip(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getReturn(),
			org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(),
			org.servicifi.gelato.language.kernel.parameters.ParametersPackage.eINSTANCE.getParameter(),
			org.servicifi.gelato.language.kernel.references.ReferencesPackage.eINSTANCE.getArgument(),
			org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(),
			org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getDefines(),
			org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getUses(),
			org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getAffects(),
			org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getPostDefines(),
			org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getPreUses(),
			org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getPostAffects(),
		};
	}
	
	public EClass[] getStartSymbols() {
		return new EClass[] {
			org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(),
		};
	}
	
}
