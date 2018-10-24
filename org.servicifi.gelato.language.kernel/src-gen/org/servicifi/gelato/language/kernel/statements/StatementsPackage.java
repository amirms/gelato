/**
 */
package org.servicifi.gelato.language.kernel.statements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.kernel.commons.CommonsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.kernel.statements.StatementsFactory
 * @generated
 */
public interface StatementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/kernel/statements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementsPackage eINSTANCE = org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__LABEL = CommonsPackage.LABELLABLE_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.StatementListContainerImpl <em>Statement List Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementListContainerImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getStatementListContainer()
	 * @generated
	 */
	int STATEMENT_LIST_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_CONTAINER__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Statement List Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.StatementContainerImpl <em>Statement Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementContainerImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getStatementContainer()
	 * @generated
	 */
	int STATEMENT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CONTAINER__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Statement Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.ConditionImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LABEL = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSE_STATEMENT = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.WhileLoopImpl <em>While Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.WhileLoopImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getWhileLoop()
	 * @generated
	 */
	int WHILE_LOOP = 4;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__CONDITION = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__LABEL = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.BlockImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = STATEMENT_LIST_CONTAINER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__LABEL = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.AssignmentStatementImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getAssignmentStatement()
	 * @generated
	 */
	int ASSIGNMENT_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.JumpImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.GotoImpl <em>Goto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.GotoImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getGoto()
	 * @generated
	 */
	int GOTO = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__LABEL = JUMP__LABEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__TARGET = JUMP__TARGET;

	/**
	 * The number of structural features of the '<em>Goto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO_FEATURE_COUNT = JUMP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.NonDeterministicBlockImpl <em>Non Deterministic Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.NonDeterministicBlockImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getNonDeterministicBlock()
	 * @generated
	 */
	int NON_DETERMINISTIC_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_DETERMINISTIC_BLOCK__STATEMENTS = STATEMENT_LIST_CONTAINER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_DETERMINISTIC_BLOCK__LABEL = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Deterministic Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_DETERMINISTIC_BLOCK_FEATURE_COUNT = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ParallelBlockImpl <em>Parallel Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.ParallelBlockImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getParallelBlock()
	 * @generated
	 */
	int PARALLEL_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_BLOCK__STATEMENTS = STATEMENT_LIST_CONTAINER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_BLOCK__LABEL = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_BLOCK__ORDER = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parallel Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_BLOCK_FEATURE_COUNT = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.AbortImpl <em>Abort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.AbortImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getAbort()
	 * @generated
	 */
	int ABORT = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT__LABEL = STATEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Abort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ExceptionHandlerStatementImpl <em>Exception Handler Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.ExceptionHandlerStatementImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getExceptionHandlerStatement()
	 * @generated
	 */
	int EXCEPTION_HANDLER_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_STATEMENT__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_STATEMENT__LABEL = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exception Handler Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_STATEMENT_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.StatementWithExceptionImpl <em>Statement With Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementWithExceptionImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getStatementWithException()
	 * @generated
	 */
	int STATEMENT_WITH_EXCEPTION = 13;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WITH_EXCEPTION__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WITH_EXCEPTION__LABEL = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement With Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WITH_EXCEPTION_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.ConditionalImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 14;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.ProcedureCallImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getProcedureCall()
	 * @generated
	 */
	int PROCEDURE_CALL = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__RETURN_SITE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Procedure Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.ExpressionStatementImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.SkipImpl <em>Skip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.SkipImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getSkip()
	 * @generated
	 */
	int SKIP = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP__LABEL = STATEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Skip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ReturnSiteImpl <em>Return Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.ReturnSiteImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getReturnSite()
	 * @generated
	 */
	int RETURN_SITE = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE__LABEL = CommonsPackage.LABELLABLE_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Return Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE_FEATURE_COUNT = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.impl.ReturnImpl
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 19;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RETURN_VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.statements.ExecutionOrder <em>Execution Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.statements.ExecutionOrder
	 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getExecutionOrder()
	 * @generated
	 */
	int EXECUTION_ORDER = 20;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.StatementListContainer <em>Statement List Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement List Container</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.StatementListContainer
	 * @generated
	 */
	EClass getStatementListContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.kernel.statements.StatementListContainer#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.StatementListContainer#getStatements()
	 * @see #getStatementListContainer()
	 * @generated
	 */
	EReference getStatementListContainer_Statements();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.StatementContainer <em>Statement Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Container</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.StatementContainer
	 * @generated
	 */
	EClass getStatementContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.statements.StatementContainer#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.StatementContainer#getStatement()
	 * @see #getStatementContainer()
	 * @generated
	 */
	EReference getStatementContainer_Statement();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.statements.Condition#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Statement</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Condition#getElseStatement()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ElseStatement();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Loop</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.WhileLoop
	 * @generated
	 */
	EClass getWhileLoop();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Statement</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.AssignmentStatement
	 * @generated
	 */
	EClass getAssignmentStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.statements.AssignmentStatement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.AssignmentStatement#getValue()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
	EReference getAssignmentStatement_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Jump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.kernel.statements.Jump#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Jump#getTarget()
	 * @see #getJump()
	 * @generated
	 */
	EReference getJump_Target();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.Goto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goto</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Goto
	 * @generated
	 */
	EClass getGoto();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock <em>Non Deterministic Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Deterministic Block</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock
	 * @generated
	 */
	EClass getNonDeterministicBlock();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.ParallelBlock <em>Parallel Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Block</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ParallelBlock
	 * @generated
	 */
	EClass getParallelBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.statements.ParallelBlock#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ParallelBlock#getOrder()
	 * @see #getParallelBlock()
	 * @generated
	 */
	EAttribute getParallelBlock_Order();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.Abort <em>Abort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abort</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Abort
	 * @generated
	 */
	EClass getAbort();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement <em>Exception Handler Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Handler Statement</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement
	 * @generated
	 */
	EClass getExceptionHandlerStatement();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.StatementWithException <em>Statement With Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement With Exception</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.StatementWithException
	 * @generated
	 */
	EClass getStatementWithException();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.kernel.statements.StatementWithException#getExceptionStatements <em>Exception Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Statements</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.StatementWithException#getExceptionStatements()
	 * @see #getStatementWithException()
	 * @generated
	 */
	EReference getStatementWithException_ExceptionStatements();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.statements.Conditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Conditional#getCondition()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Condition();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.ProcedureCall <em>Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Call</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ProcedureCall
	 * @generated
	 */
	EClass getProcedureCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.kernel.statements.ProcedureCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ProcedureCall#getArguments()
	 * @see #getProcedureCall()
	 * @generated
	 */
	EReference getProcedureCall_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.statements.ProcedureCall#getReturnSite <em>Return Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Site</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ProcedureCall#getReturnSite()
	 * @see #getProcedureCall()
	 * @generated
	 */
	EReference getProcedureCall_ReturnSite();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.statements.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.Skip <em>Skip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skip</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Skip
	 * @generated
	 */
	EClass getSkip();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.ReturnSite <em>Return Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Site</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ReturnSite
	 * @generated
	 */
	EClass getReturnSite();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.statements.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.statements.Return#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.Return#getReturnValue()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_ReturnValue();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.kernel.statements.ExecutionOrder <em>Execution Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Order</em>'.
	 * @see org.servicifi.gelato.language.kernel.statements.ExecutionOrder
	 * @generated
	 */
	EEnum getExecutionOrder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatementsFactory getStatementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.StatementListContainerImpl <em>Statement List Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementListContainerImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getStatementListContainer()
		 * @generated
		 */
		EClass STATEMENT_LIST_CONTAINER = eINSTANCE.getStatementListContainer();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_LIST_CONTAINER__STATEMENTS = eINSTANCE.getStatementListContainer_Statements();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.StatementContainerImpl <em>Statement Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementContainerImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getStatementContainer()
		 * @generated
		 */
		EClass STATEMENT_CONTAINER = eINSTANCE.getStatementContainer();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CONTAINER__STATEMENT = eINSTANCE.getStatementContainer_Statement();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.ConditionImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSE_STATEMENT = eINSTANCE.getCondition_ElseStatement();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.WhileLoopImpl <em>While Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.WhileLoopImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getWhileLoop()
		 * @generated
		 */
		EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.BlockImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.AssignmentStatementImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getAssignmentStatement()
		 * @generated
		 */
		EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_STATEMENT__VALUE = eINSTANCE.getAssignmentStatement_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.JumpImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getJump()
		 * @generated
		 */
		EClass JUMP = eINSTANCE.getJump();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP__TARGET = eINSTANCE.getJump_Target();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.GotoImpl <em>Goto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.GotoImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getGoto()
		 * @generated
		 */
		EClass GOTO = eINSTANCE.getGoto();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.NonDeterministicBlockImpl <em>Non Deterministic Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.NonDeterministicBlockImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getNonDeterministicBlock()
		 * @generated
		 */
		EClass NON_DETERMINISTIC_BLOCK = eINSTANCE.getNonDeterministicBlock();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ParallelBlockImpl <em>Parallel Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.ParallelBlockImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getParallelBlock()
		 * @generated
		 */
		EClass PARALLEL_BLOCK = eINSTANCE.getParallelBlock();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL_BLOCK__ORDER = eINSTANCE.getParallelBlock_Order();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.AbortImpl <em>Abort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.AbortImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getAbort()
		 * @generated
		 */
		EClass ABORT = eINSTANCE.getAbort();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ExceptionHandlerStatementImpl <em>Exception Handler Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.ExceptionHandlerStatementImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getExceptionHandlerStatement()
		 * @generated
		 */
		EClass EXCEPTION_HANDLER_STATEMENT = eINSTANCE.getExceptionHandlerStatement();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.StatementWithExceptionImpl <em>Statement With Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementWithExceptionImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getStatementWithException()
		 * @generated
		 */
		EClass STATEMENT_WITH_EXCEPTION = eINSTANCE.getStatementWithException();

		/**
		 * The meta object literal for the '<em><b>Exception Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS = eINSTANCE.getStatementWithException_ExceptionStatements();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.ConditionalImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.ProcedureCallImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getProcedureCall()
		 * @generated
		 */
		EClass PROCEDURE_CALL = eINSTANCE.getProcedureCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_CALL__ARGUMENTS = eINSTANCE.getProcedureCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Return Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_CALL__RETURN_SITE = eINSTANCE.getProcedureCall_ReturnSite();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.ExpressionStatementImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getExpressionStatement()
		 * @generated
		 */
		EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.SkipImpl <em>Skip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.SkipImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getSkip()
		 * @generated
		 */
		EClass SKIP = eINSTANCE.getSkip();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ReturnSiteImpl <em>Return Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.ReturnSiteImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getReturnSite()
		 * @generated
		 */
		EClass RETURN_SITE = eINSTANCE.getReturnSite();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.impl.ReturnImpl
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__RETURN_VALUE = eINSTANCE.getReturn_ReturnValue();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.statements.ExecutionOrder <em>Execution Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.statements.ExecutionOrder
		 * @see org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl#getExecutionOrder()
		 * @generated
		 */
		EEnum EXECUTION_ORDER = eINSTANCE.getExecutionOrder();

	}

} //StatementsPackage
