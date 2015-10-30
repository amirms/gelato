/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.kernel.statements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementsFactoryImpl extends EFactoryImpl implements StatementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatementsFactory init() {
		try {
			StatementsFactory theStatementsFactory = (StatementsFactory)EPackage.Registry.INSTANCE.getEFactory(StatementsPackage.eNS_URI);
			if (theStatementsFactory != null) {
				return theStatementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatementsPackage.CONDITION: return createCondition();
			case StatementsPackage.WHILE_LOOP: return createWhileLoop();
			case StatementsPackage.BLOCK: return createBlock();
			case StatementsPackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
			case StatementsPackage.GOTO: return createGoto();
			case StatementsPackage.NON_DETERMINISTIC_BLOCK: return createNonDeterministicBlock();
			case StatementsPackage.PARALLEL_BLOCK: return createParallelBlock();
			case StatementsPackage.ABORT: return createAbort();
			case StatementsPackage.EXCEPTION_HANDLER_STATEMENT: return createExceptionHandlerStatement();
			case StatementsPackage.STATEMENT_WITH_EXCEPTION: return createStatementWithException();
			case StatementsPackage.PROCEDURE_CALL: return createProcedureCall();
			case StatementsPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
			case StatementsPackage.SKIP: return createSkip();
			case StatementsPackage.RETURN_SITE: return createReturnSite();
			case StatementsPackage.RETURN: return createReturn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StatementsPackage.EXECUTION_ORDER:
				return createExecutionOrderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StatementsPackage.EXECUTION_ORDER:
				return convertExecutionOrderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentStatement createAssignmentStatement() {
		AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
		return assignmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goto createGoto() {
		GotoImpl goto_ = new GotoImpl();
		return goto_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDeterministicBlock createNonDeterministicBlock() {
		NonDeterministicBlockImpl nonDeterministicBlock = new NonDeterministicBlockImpl();
		return nonDeterministicBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelBlock createParallelBlock() {
		ParallelBlockImpl parallelBlock = new ParallelBlockImpl();
		return parallelBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abort createAbort() {
		AbortImpl abort = new AbortImpl();
		return abort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandlerStatement createExceptionHandlerStatement() {
		ExceptionHandlerStatementImpl exceptionHandlerStatement = new ExceptionHandlerStatementImpl();
		return exceptionHandlerStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementWithException createStatementWithException() {
		StatementWithExceptionImpl statementWithException = new StatementWithExceptionImpl();
		return statementWithException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCall createProcedureCall() {
		ProcedureCallImpl procedureCall = new ProcedureCallImpl();
		return procedureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skip createSkip() {
		SkipImpl skip = new SkipImpl();
		return skip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnSite createReturnSite() {
		ReturnSiteImpl returnSite = new ReturnSiteImpl();
		return returnSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOrder createExecutionOrderFromString(EDataType eDataType, String initialValue) {
		ExecutionOrder result = ExecutionOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsPackage getStatementsPackage() {
		return (StatementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatementsPackage getPackage() {
		return StatementsPackage.eINSTANCE;
	}

} //StatementsFactoryImpl
