/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractKernelInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.IKernelInterpreterListener> listeners = new java.util.ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.servicifi.gelato.language.kernel.commons.LabellableElement) {
			result = interprete_org_servicifi_gelato_language_kernel_commons_LabellableElement((org.servicifi.gelato.language.kernel.commons.LabellableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.dataitems.DataItem) {
			result = interprete_org_servicifi_gelato_language_kernel_dataitems_DataItem((org.servicifi.gelato.language.kernel.dataitems.DataItem) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.commons.NamedElement) {
			result = interprete_org_servicifi_gelato_language_kernel_commons_NamedElement((org.servicifi.gelato.language.kernel.commons.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.Condition) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_Condition((org.servicifi.gelato.language.kernel.statements.Condition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.Block) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_Block((org.servicifi.gelato.language.kernel.statements.Block) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.Goto) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_Goto((org.servicifi.gelato.language.kernel.statements.Goto) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.Jump) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_Jump((org.servicifi.gelato.language.kernel.statements.Jump) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.Abort) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_Abort((org.servicifi.gelato.language.kernel.statements.Abort) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.StatementWithException) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_StatementWithException((org.servicifi.gelato.language.kernel.statements.StatementWithException) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.ProcedureCall) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_ProcedureCall((org.servicifi.gelato.language.kernel.statements.ProcedureCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.Skip) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_Skip((org.servicifi.gelato.language.kernel.statements.Skip) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.Statement) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_Statement((org.servicifi.gelato.language.kernel.statements.Statement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.StatementListContainer) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_StatementListContainer((org.servicifi.gelato.language.kernel.statements.StatementListContainer) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.WhileLoop) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_WhileLoop((org.servicifi.gelato.language.kernel.statements.WhileLoop) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement((org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.StatementContainer) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_StatementContainer((org.servicifi.gelato.language.kernel.statements.StatementContainer) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.AssignmentStatement) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_AssignmentStatement((org.servicifi.gelato.language.kernel.statements.AssignmentStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock((org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.ParallelBlock) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_ParallelBlock((org.servicifi.gelato.language.kernel.statements.ParallelBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.Conditional) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_Conditional((org.servicifi.gelato.language.kernel.statements.Conditional) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.ExpressionStatement) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_ExpressionStatement((org.servicifi.gelato.language.kernel.statements.ExpressionStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.ReturnSite) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_ReturnSite((org.servicifi.gelato.language.kernel.statements.ReturnSite) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.statements.Return) {
			result = interprete_org_servicifi_gelato_language_kernel_statements_Return((org.servicifi.gelato.language.kernel.statements.Return) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.Expression) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_Expression((org.servicifi.gelato.language.kernel.expressions.Expression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.Defines) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_Defines((org.servicifi.gelato.language.kernel.expressions.Defines) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.PostDefines) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_PostDefines((org.servicifi.gelato.language.kernel.expressions.PostDefines) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.Affects) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_Affects((org.servicifi.gelato.language.kernel.expressions.Affects) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.PostAffects) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_PostAffects((org.servicifi.gelato.language.kernel.expressions.PostAffects) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.Uses) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_Uses((org.servicifi.gelato.language.kernel.expressions.Uses) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.PreUses) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_PreUses((org.servicifi.gelato.language.kernel.expressions.PreUses) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.Definition) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_Definition((org.servicifi.gelato.language.kernel.expressions.Definition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.Usage) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_Usage((org.servicifi.gelato.language.kernel.expressions.Usage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.expressions.SubExpression) {
			result = interprete_org_servicifi_gelato_language_kernel_expressions_SubExpression((org.servicifi.gelato.language.kernel.expressions.SubExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.procedures.Procedure) {
			result = interprete_org_servicifi_gelato_language_kernel_procedures_Procedure((org.servicifi.gelato.language.kernel.procedures.Procedure) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.procedures.MainProcedure) {
			result = interprete_org_servicifi_gelato_language_kernel_procedures_MainProcedure((org.servicifi.gelato.language.kernel.procedures.MainProcedure) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.parameters.Parameter) {
			result = interprete_org_servicifi_gelato_language_kernel_parameters_Parameter((org.servicifi.gelato.language.kernel.parameters.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.containers.CompilationUnit) {
			result = interprete_org_servicifi_gelato_language_kernel_containers_CompilationUnit((org.servicifi.gelato.language.kernel.containers.CompilationUnit) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.containers.KernelRoot) {
			result = interprete_org_servicifi_gelato_language_kernel_containers_KernelRoot((org.servicifi.gelato.language.kernel.containers.KernelRoot) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.containers.Start) {
			result = interprete_org_servicifi_gelato_language_kernel_containers_Start((org.servicifi.gelato.language.kernel.containers.Start) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.containers.End) {
			result = interprete_org_servicifi_gelato_language_kernel_containers_End((org.servicifi.gelato.language.kernel.containers.End) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.references.ElementReference) {
			result = interprete_org_servicifi_gelato_language_kernel_references_ElementReference((org.servicifi.gelato.language.kernel.references.ElementReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.references.ReferenceableElement) {
			result = interprete_org_servicifi_gelato_language_kernel_references_ReferenceableElement((org.servicifi.gelato.language.kernel.references.ReferenceableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.references.Reference) {
			result = interprete_org_servicifi_gelato_language_kernel_references_Reference((org.servicifi.gelato.language.kernel.references.Reference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.kernel.references.Argument) {
			result = interprete_org_servicifi_gelato_language_kernel_references_Argument((org.servicifi.gelato.language.kernel.references.Argument) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_commons_LabellableElement(org.servicifi.gelato.language.kernel.commons.LabellableElement labellableElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_commons_NamedElement(org.servicifi.gelato.language.kernel.commons.NamedElement namedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_dataitems_DataItem(org.servicifi.gelato.language.kernel.dataitems.DataItem dataItem, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Statement(org.servicifi.gelato.language.kernel.statements.Statement statement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_StatementListContainer(org.servicifi.gelato.language.kernel.statements.StatementListContainer statementListContainer, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_StatementContainer(org.servicifi.gelato.language.kernel.statements.StatementContainer statementContainer, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Condition(org.servicifi.gelato.language.kernel.statements.Condition condition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_WhileLoop(org.servicifi.gelato.language.kernel.statements.WhileLoop whileLoop, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Block(org.servicifi.gelato.language.kernel.statements.Block block, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_AssignmentStatement(org.servicifi.gelato.language.kernel.statements.AssignmentStatement assignmentStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Jump(org.servicifi.gelato.language.kernel.statements.Jump jump, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Goto(org.servicifi.gelato.language.kernel.statements.Goto _goto, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock(org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock nonDeterministicBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ParallelBlock(org.servicifi.gelato.language.kernel.statements.ParallelBlock parallelBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Abort(org.servicifi.gelato.language.kernel.statements.Abort abort, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement(org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement exceptionHandlerStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_StatementWithException(org.servicifi.gelato.language.kernel.statements.StatementWithException statementWithException, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Conditional(org.servicifi.gelato.language.kernel.statements.Conditional conditional, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ProcedureCall(org.servicifi.gelato.language.kernel.statements.ProcedureCall procedureCall, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ExpressionStatement(org.servicifi.gelato.language.kernel.statements.ExpressionStatement expressionStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Skip(org.servicifi.gelato.language.kernel.statements.Skip skip, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ReturnSite(org.servicifi.gelato.language.kernel.statements.ReturnSite returnSite, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Return(org.servicifi.gelato.language.kernel.statements.Return _return, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Expression(org.servicifi.gelato.language.kernel.expressions.Expression expression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_SubExpression(org.servicifi.gelato.language.kernel.expressions.SubExpression subExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Defines(org.servicifi.gelato.language.kernel.expressions.Defines defines, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_PostDefines(org.servicifi.gelato.language.kernel.expressions.PostDefines postDefines, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Affects(org.servicifi.gelato.language.kernel.expressions.Affects affects, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_PostAffects(org.servicifi.gelato.language.kernel.expressions.PostAffects postAffects, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Uses(org.servicifi.gelato.language.kernel.expressions.Uses uses, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_PreUses(org.servicifi.gelato.language.kernel.expressions.PreUses preUses, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Definition(org.servicifi.gelato.language.kernel.expressions.Definition definition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Usage(org.servicifi.gelato.language.kernel.expressions.Usage usage, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_procedures_Procedure(org.servicifi.gelato.language.kernel.procedures.Procedure procedure, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_procedures_MainProcedure(org.servicifi.gelato.language.kernel.procedures.MainProcedure mainProcedure, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_parameters_Parameter(org.servicifi.gelato.language.kernel.parameters.Parameter parameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_containers_KernelRoot(org.servicifi.gelato.language.kernel.containers.KernelRoot kernelRoot, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_containers_CompilationUnit(org.servicifi.gelato.language.kernel.containers.CompilationUnit compilationUnit, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_containers_Start(org.servicifi.gelato.language.kernel.containers.Start start, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_containers_End(org.servicifi.gelato.language.kernel.containers.End end, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_references_ElementReference(org.servicifi.gelato.language.kernel.references.ElementReference elementReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_references_ReferenceableElement(org.servicifi.gelato.language.kernel.references.ReferenceableElement referenceableElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_references_Reference(org.servicifi.gelato.language.kernel.references.Reference reference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_references_Argument(org.servicifi.gelato.language.kernel.references.Argument argument, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.servicifi.gelato.language.kernel.resource.kernel.IKernelInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.servicifi.gelato.language.kernel.resource.kernel.IKernelInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.servicifi.gelato.language.kernel.resource.kernel.IKernelInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
