/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.commons.NamedElement;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.containers.End;
import org.servicifi.gelato.language.kernel.containers.KernelRoot;
import org.servicifi.gelato.language.kernel.containers.Start;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.expressions.Affects;
import org.servicifi.gelato.language.kernel.expressions.Defines;
import org.servicifi.gelato.language.kernel.expressions.Definition;
import org.servicifi.gelato.language.kernel.expressions.Expression;
import org.servicifi.gelato.language.kernel.expressions.PostAffects;
import org.servicifi.gelato.language.kernel.expressions.PostDefines;
import org.servicifi.gelato.language.kernel.expressions.PreUses;
import org.servicifi.gelato.language.kernel.expressions.SubExpression;
import org.servicifi.gelato.language.kernel.expressions.Usage;
import org.servicifi.gelato.language.kernel.expressions.Uses;
import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.ElementReference;
import org.servicifi.gelato.language.kernel.references.Reference;
import org.servicifi.gelato.language.kernel.references.ReferenceableElement;
import org.servicifi.gelato.language.kernel.statements.Abort;
import org.servicifi.gelato.language.kernel.statements.AssignmentStatement;
import org.servicifi.gelato.language.kernel.statements.Block;
import org.servicifi.gelato.language.kernel.statements.Condition;
import org.servicifi.gelato.language.kernel.statements.Conditional;
import org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;
import org.servicifi.gelato.language.kernel.statements.Goto;
import org.servicifi.gelato.language.kernel.statements.Jump;
import org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock;
import org.servicifi.gelato.language.kernel.statements.ParallelBlock;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.language.kernel.statements.Return;
import org.servicifi.gelato.language.kernel.statements.ReturnSite;
import org.servicifi.gelato.language.kernel.statements.Skip;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.StatementContainer;
import org.servicifi.gelato.language.kernel.statements.StatementListContainer;
import org.servicifi.gelato.language.kernel.statements.StatementWithException;
import org.servicifi.gelato.language.kernel.statements.WhileLoop;

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
	
	private Stack<EObject> interpretationStack = new Stack<EObject>();
	private List<org.servicifi.gelato.language.kernel.resource.kernel.IKernelInterpreterListener> listeners = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelInterpreterListener>();
	private EObject nextObjectToInterprete;
	private ContextType currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (EmptyStackException ese) {
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
	
	public ResultType interprete(EObject object, ContextType context) {
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
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_commons_LabellableElement(LabellableElement labellableElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_commons_NamedElement(NamedElement namedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_dataitems_DataItem(DataItem dataItem, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Statement(Statement statement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_StatementListContainer(StatementListContainer statementListContainer, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_StatementContainer(StatementContainer statementContainer, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Condition(Condition condition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_WhileLoop(WhileLoop whileLoop, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Block(Block block, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_AssignmentStatement(AssignmentStatement assignmentStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Jump(Jump jump, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Goto(Goto _goto, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock(NonDeterministicBlock nonDeterministicBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ParallelBlock(ParallelBlock parallelBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Abort(Abort abort, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement(ExceptionHandlerStatement exceptionHandlerStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_StatementWithException(StatementWithException statementWithException, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Conditional(Conditional conditional, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ProcedureCall(ProcedureCall procedureCall, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ExpressionStatement(ExpressionStatement expressionStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Skip(Skip skip, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_ReturnSite(ReturnSite returnSite, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_statements_Return(Return _return, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Expression(Expression expression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_SubExpression(SubExpression subExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Defines(Defines defines, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_PostDefines(PostDefines postDefines, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Affects(Affects affects, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_PostAffects(PostAffects postAffects, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Uses(Uses uses, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_PreUses(PreUses preUses, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Definition(Definition definition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_expressions_Usage(Usage usage, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_procedures_Procedure(Procedure procedure, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_procedures_MainProcedure(MainProcedure mainProcedure, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_parameters_Parameter(Parameter parameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_containers_KernelRoot(KernelRoot kernelRoot, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_containers_CompilationUnit(CompilationUnit compilationUnit, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_containers_Start(Start start, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_containers_End(End end, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_references_ElementReference(ElementReference elementReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_references_ReferenceableElement(ReferenceableElement referenceableElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_references_Reference(Reference reference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_kernel_references_Argument(Argument argument, ContextType context) {
		return null;
	}
	
	private void notifyListeners(EObject element) {
		for (org.servicifi.gelato.language.kernel.resource.kernel.IKernelInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(Collection<? extends EObject> objects) {
		for (EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(Collection<? extends EObject> objects) {
		List<EObject> reverse = new ArrayList<EObject>(objects.size());
		reverse.addAll(objects);
		Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(EObject root) {
		List<EObject> objects = new ArrayList<EObject>();
		objects.add(root);
		Iterator<EObject> it = root.eAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
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
	
	public EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public Stack<EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public ContextType getCurrentContext() {
		return currentContext;
	}
	
}
