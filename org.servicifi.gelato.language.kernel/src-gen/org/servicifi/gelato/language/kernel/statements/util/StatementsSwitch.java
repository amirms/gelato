/**
 */
package org.servicifi.gelato.language.kernel.statements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.kernel.commons.LabellableElement;

import org.servicifi.gelato.language.kernel.members.Member;

import org.servicifi.gelato.language.kernel.references.ElementReference;

import org.servicifi.gelato.language.kernel.statements.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage
 * @generated
 */
public class StatementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsSwitch() {
		if (modelPackage == null) {
			modelPackage = StatementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StatementsPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseLabellableElement(statement);
				if (result == null) result = caseMember(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.STATEMENT_LIST_CONTAINER: {
				StatementListContainer statementListContainer = (StatementListContainer)theEObject;
				T result = caseStatementListContainer(statementListContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.STATEMENT_CONTAINER: {
				StatementContainer statementContainer = (StatementContainer)theEObject;
				T result = caseStatementContainer(statementContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseStatementContainer(condition);
				if (result == null) result = caseConditional(condition);
				if (result == null) result = caseStatement(condition);
				if (result == null) result = caseLabellableElement(condition);
				if (result == null) result = caseMember(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.WHILE_LOOP: {
				WhileLoop whileLoop = (WhileLoop)theEObject;
				T result = caseWhileLoop(whileLoop);
				if (result == null) result = caseStatementContainer(whileLoop);
				if (result == null) result = caseConditional(whileLoop);
				if (result == null) result = caseStatement(whileLoop);
				if (result == null) result = caseLabellableElement(whileLoop);
				if (result == null) result = caseMember(whileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseStatementListContainer(block);
				if (result == null) result = caseStatement(block);
				if (result == null) result = caseLabellableElement(block);
				if (result == null) result = caseMember(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ASSIGNMENT_STATEMENT: {
				AssignmentStatement assignmentStatement = (AssignmentStatement)theEObject;
				T result = caseAssignmentStatement(assignmentStatement);
				if (result == null) result = caseStatement(assignmentStatement);
				if (result == null) result = caseElementReference(assignmentStatement);
				if (result == null) result = caseLabellableElement(assignmentStatement);
				if (result == null) result = caseMember(assignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.JUMP: {
				Jump jump = (Jump)theEObject;
				T result = caseJump(jump);
				if (result == null) result = caseStatement(jump);
				if (result == null) result = caseLabellableElement(jump);
				if (result == null) result = caseMember(jump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.GOTO: {
				Goto goto_ = (Goto)theEObject;
				T result = caseGoto(goto_);
				if (result == null) result = caseJump(goto_);
				if (result == null) result = caseStatement(goto_);
				if (result == null) result = caseLabellableElement(goto_);
				if (result == null) result = caseMember(goto_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.NON_DETERMINISTIC_BLOCK: {
				NonDeterministicBlock nonDeterministicBlock = (NonDeterministicBlock)theEObject;
				T result = caseNonDeterministicBlock(nonDeterministicBlock);
				if (result == null) result = caseStatementListContainer(nonDeterministicBlock);
				if (result == null) result = caseStatement(nonDeterministicBlock);
				if (result == null) result = caseLabellableElement(nonDeterministicBlock);
				if (result == null) result = caseMember(nonDeterministicBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PARALLEL_BLOCK: {
				ParallelBlock parallelBlock = (ParallelBlock)theEObject;
				T result = caseParallelBlock(parallelBlock);
				if (result == null) result = caseStatementListContainer(parallelBlock);
				if (result == null) result = caseStatement(parallelBlock);
				if (result == null) result = caseLabellableElement(parallelBlock);
				if (result == null) result = caseMember(parallelBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ABORT: {
				Abort abort = (Abort)theEObject;
				T result = caseAbort(abort);
				if (result == null) result = caseStatement(abort);
				if (result == null) result = caseLabellableElement(abort);
				if (result == null) result = caseMember(abort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.EXCEPTION_HANDLER_STATEMENT: {
				ExceptionHandlerStatement exceptionHandlerStatement = (ExceptionHandlerStatement)theEObject;
				T result = caseExceptionHandlerStatement(exceptionHandlerStatement);
				if (result == null) result = caseStatementContainer(exceptionHandlerStatement);
				if (result == null) result = caseLabellableElement(exceptionHandlerStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.STATEMENT_WITH_EXCEPTION: {
				StatementWithException statementWithException = (StatementWithException)theEObject;
				T result = caseStatementWithException(statementWithException);
				if (result == null) result = caseStatementContainer(statementWithException);
				if (result == null) result = caseStatement(statementWithException);
				if (result == null) result = caseLabellableElement(statementWithException);
				if (result == null) result = caseMember(statementWithException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PROCEDURE_CALL: {
				ProcedureCall procedureCall = (ProcedureCall)theEObject;
				T result = caseProcedureCall(procedureCall);
				if (result == null) result = caseStatement(procedureCall);
				if (result == null) result = caseElementReference(procedureCall);
				if (result == null) result = caseLabellableElement(procedureCall);
				if (result == null) result = caseMember(procedureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.EXPRESSION_STATEMENT: {
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = caseLabellableElement(expressionStatement);
				if (result == null) result = caseMember(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SKIP: {
				Skip skip = (Skip)theEObject;
				T result = caseSkip(skip);
				if (result == null) result = caseStatement(skip);
				if (result == null) result = caseLabellableElement(skip);
				if (result == null) result = caseMember(skip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.RETURN_SITE: {
				ReturnSite returnSite = (ReturnSite)theEObject;
				T result = caseReturnSite(returnSite);
				if (result == null) result = caseLabellableElement(returnSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseStatement(return_);
				if (result == null) result = caseLabellableElement(return_);
				if (result == null) result = caseMember(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementListContainer(StatementListContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementContainer(StatementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileLoop(WhileLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentStatement(AssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJump(Jump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoto(Goto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Deterministic Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Deterministic Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonDeterministicBlock(NonDeterministicBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelBlock(ParallelBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbort(Abort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handler Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handler Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandlerStatement(ExceptionHandlerStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement With Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement With Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementWithException(StatementWithException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureCall(ProcedureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkip(Skip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnSite(ReturnSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labellable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labellable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabellableElement(LabellableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementReference(ElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StatementsSwitch
