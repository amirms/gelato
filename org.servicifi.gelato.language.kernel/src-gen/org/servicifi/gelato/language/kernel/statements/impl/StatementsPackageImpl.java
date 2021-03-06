/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;

import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;

import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;

import org.servicifi.gelato.analysis.framework.procedures.ProceduresPackage;

import org.servicifi.gelato.language.kernel.KernelPackage;

import org.servicifi.gelato.language.kernel.commons.impl.CommonsPackageImpl;

import org.servicifi.gelato.language.kernel.containers.ContainersPackage;

import org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl;

import org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage;

import org.servicifi.gelato.language.kernel.dataitems.impl.DataitemsPackageImpl;

import org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage;

import org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl;

import org.servicifi.gelato.language.kernel.impl.KernelPackageImpl;

import org.servicifi.gelato.language.kernel.members.MembersPackage;

import org.servicifi.gelato.language.kernel.members.impl.MembersPackageImpl;

import org.servicifi.gelato.language.kernel.parameters.ParametersPackage;

import org.servicifi.gelato.language.kernel.parameters.impl.ParametersPackageImpl;

import org.servicifi.gelato.language.kernel.procedures.impl.ProceduresPackageImpl;

import org.servicifi.gelato.language.kernel.references.ReferencesPackage;

import org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl;

import org.servicifi.gelato.language.kernel.statements.Abort;
import org.servicifi.gelato.language.kernel.statements.Block;
import org.servicifi.gelato.language.kernel.statements.Condition;
import org.servicifi.gelato.language.kernel.statements.Conditional;
import org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement;
import org.servicifi.gelato.language.kernel.statements.ExecutionOrder;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;
import org.servicifi.gelato.language.kernel.statements.Goto;
import org.servicifi.gelato.language.kernel.statements.Jump;
import org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock;
import org.servicifi.gelato.language.kernel.statements.ParallelBlock;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.language.kernel.statements.Return;
import org.servicifi.gelato.language.kernel.statements.Skip;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.StatementContainer;
import org.servicifi.gelato.language.kernel.statements.StatementListContainer;
import org.servicifi.gelato.language.kernel.statements.StatementWithException;
import org.servicifi.gelato.language.kernel.statements.StatementsFactory;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;
import org.servicifi.gelato.language.kernel.statements.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementsPackageImpl extends EPackageImpl implements StatementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementListContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gotoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonDeterministicBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementWithExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionOrderEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatementsPackageImpl() {
		super(eNS_URI, StatementsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StatementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatementsPackage init() {
		if (isInited) return (StatementsPackage)EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatementsPackageImpl theStatementsPackage = registeredStatementsPackage instanceof StatementsPackageImpl ? (StatementsPackageImpl)registeredStatementsPackage : new StatementsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphsPackage.eINSTANCE.eClass();
		AnalysesPackage.eINSTANCE.eClass();
		CommonsPackage.eINSTANCE.eClass();
		ProceduresPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(registeredPackage instanceof KernelPackageImpl ? registeredPackage : KernelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.servicifi.gelato.language.kernel.commons.CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage_1 = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : org.servicifi.gelato.language.kernel.commons.CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eNS_URI);
		ProceduresPackageImpl theProceduresPackage_1 = (ProceduresPackageImpl)(registeredPackage instanceof ProceduresPackageImpl ? registeredPackage : org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(registeredPackage instanceof ExpressionsPackageImpl ? registeredPackage : ExpressionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(registeredPackage instanceof ContainersPackageImpl ? registeredPackage : ContainersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);
		MembersPackageImpl theMembersPackage = (MembersPackageImpl)(registeredPackage instanceof MembersPackageImpl ? registeredPackage : MembersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI);
		DataitemsPackageImpl theDataitemsPackage = (DataitemsPackageImpl)(registeredPackage instanceof DataitemsPackageImpl ? registeredPackage : DataitemsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(registeredPackage instanceof ReferencesPackageImpl ? registeredPackage : ReferencesPackage.eINSTANCE);

		// Create package meta-data objects
		theStatementsPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theCommonsPackage_1.createPackageContents();
		theProceduresPackage_1.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theMembersPackage.createPackageContents();
		theDataitemsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theReferencesPackage.createPackageContents();

		// Initialize created meta-data
		theStatementsPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theCommonsPackage_1.initializePackageContents();
		theProceduresPackage_1.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theMembersPackage.initializePackageContents();
		theDataitemsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatementsPackage.eNS_URI, theStatementsPackage);
		return theStatementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementListContainer() {
		return statementListContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementListContainer_Statements() {
		return (EReference)statementListContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementContainer() {
		return statementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementContainer_Statement() {
		return (EReference)statementContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ElseStatement() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileLoop() {
		return whileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJump() {
		return jumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJump_Target() {
		return (EReference)jumpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoto() {
		return gotoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonDeterministicBlock() {
		return nonDeterministicBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelBlock() {
		return parallelBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParallelBlock_Order() {
		return (EAttribute)parallelBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbort() {
		return abortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandlerStatement() {
		return exceptionHandlerStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementWithException() {
		return statementWithExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementWithException_ExceptionStatements() {
		return (EReference)statementWithExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_Condition() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureCall() {
		return procedureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureCall_Arguments() {
		return (EReference)procedureCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureCall_ReturnSite() {
		return (EReference)procedureCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionStatement() {
		return expressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionStatement_Expression() {
		return (EReference)expressionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkip() {
		return skipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionOrder() {
		return executionOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsFactory getStatementsFactory() {
		return (StatementsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		statementEClass = createEClass(STATEMENT);

		statementListContainerEClass = createEClass(STATEMENT_LIST_CONTAINER);
		createEReference(statementListContainerEClass, STATEMENT_LIST_CONTAINER__STATEMENTS);

		statementContainerEClass = createEClass(STATEMENT_CONTAINER);
		createEReference(statementContainerEClass, STATEMENT_CONTAINER__STATEMENT);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__ELSE_STATEMENT);

		whileLoopEClass = createEClass(WHILE_LOOP);

		blockEClass = createEClass(BLOCK);

		jumpEClass = createEClass(JUMP);
		createEReference(jumpEClass, JUMP__TARGET);

		gotoEClass = createEClass(GOTO);

		nonDeterministicBlockEClass = createEClass(NON_DETERMINISTIC_BLOCK);

		parallelBlockEClass = createEClass(PARALLEL_BLOCK);
		createEAttribute(parallelBlockEClass, PARALLEL_BLOCK__ORDER);

		abortEClass = createEClass(ABORT);

		exceptionHandlerStatementEClass = createEClass(EXCEPTION_HANDLER_STATEMENT);

		statementWithExceptionEClass = createEClass(STATEMENT_WITH_EXCEPTION);
		createEReference(statementWithExceptionEClass, STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS);

		conditionalEClass = createEClass(CONDITIONAL);
		createEReference(conditionalEClass, CONDITIONAL__CONDITION);

		procedureCallEClass = createEClass(PROCEDURE_CALL);
		createEReference(procedureCallEClass, PROCEDURE_CALL__ARGUMENTS);
		createEReference(procedureCallEClass, PROCEDURE_CALL__RETURN_SITE);

		expressionStatementEClass = createEClass(EXPRESSION_STATEMENT);
		createEReference(expressionStatementEClass, EXPRESSION_STATEMENT__EXPRESSION);

		skipEClass = createEClass(SKIP);

		returnEClass = createEClass(RETURN);

		// Create enums
		executionOrderEEnum = createEEnum(EXECUTION_ORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		MembersPackage theMembersPackage = (MembersPackage)EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ProceduresPackage theProceduresPackage = (ProceduresPackage)EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		statementEClass.getESuperTypes().add(theCommonsPackage.getLabellableElement());
		statementEClass.getESuperTypes().add(theMembersPackage.getMember());
		conditionEClass.getESuperTypes().add(this.getStatement());
		conditionEClass.getESuperTypes().add(this.getStatementContainer());
		conditionEClass.getESuperTypes().add(this.getConditional());
		whileLoopEClass.getESuperTypes().add(this.getStatement());
		whileLoopEClass.getESuperTypes().add(this.getStatementContainer());
		whileLoopEClass.getESuperTypes().add(this.getConditional());
		blockEClass.getESuperTypes().add(this.getStatement());
		blockEClass.getESuperTypes().add(this.getStatementListContainer());
		jumpEClass.getESuperTypes().add(this.getStatement());
		gotoEClass.getESuperTypes().add(this.getJump());
		nonDeterministicBlockEClass.getESuperTypes().add(this.getStatement());
		nonDeterministicBlockEClass.getESuperTypes().add(this.getStatementListContainer());
		parallelBlockEClass.getESuperTypes().add(this.getStatement());
		parallelBlockEClass.getESuperTypes().add(this.getStatementListContainer());
		abortEClass.getESuperTypes().add(this.getStatement());
		exceptionHandlerStatementEClass.getESuperTypes().add(theCommonsPackage.getLabellableElement());
		exceptionHandlerStatementEClass.getESuperTypes().add(this.getStatementContainer());
		statementWithExceptionEClass.getESuperTypes().add(this.getStatement());
		statementWithExceptionEClass.getESuperTypes().add(this.getStatementContainer());
		procedureCallEClass.getESuperTypes().add(this.getStatement());
		procedureCallEClass.getESuperTypes().add(theProceduresPackage.getProcedureCall());
		procedureCallEClass.getESuperTypes().add(theReferencesPackage.getElementReference());
		expressionStatementEClass.getESuperTypes().add(this.getStatement());
		skipEClass.getESuperTypes().add(this.getStatement());
		returnEClass.getESuperTypes().add(this.getStatement());

		// Initialize classes and features; add operations and parameters
		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementListContainerEClass, StatementListContainer.class, "StatementListContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementListContainer_Statements(), this.getStatement(), null, "statements", null, 0, -1, StatementListContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementContainerEClass, StatementContainer.class, "StatementContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementContainer_Statement(), this.getStatement(), null, "statement", null, 1, 1, StatementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_ElseStatement(), this.getStatement(), null, "elseStatement", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileLoopEClass, WhileLoop.class, "WhileLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jumpEClass, Jump.class, "Jump", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJump_Target(), theCommonsPackage.getLabellableElement(), null, "target", null, 1, 1, Jump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gotoEClass, Goto.class, "Goto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonDeterministicBlockEClass, NonDeterministicBlock.class, "NonDeterministicBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelBlockEClass, ParallelBlock.class, "ParallelBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParallelBlock_Order(), this.getExecutionOrder(), "order", null, 1, 1, ParallelBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abortEClass, Abort.class, "Abort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionHandlerStatementEClass, ExceptionHandlerStatement.class, "ExceptionHandlerStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementWithExceptionEClass, StatementWithException.class, "StatementWithException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementWithException_ExceptionStatements(), this.getExceptionHandlerStatement(), null, "exceptionStatements", null, 1, -1, StatementWithException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditional_Condition(), theExpressionsPackage.getExpression(), null, "condition", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureCallEClass, ProcedureCall.class, "ProcedureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcedureCall_Arguments(), theReferencesPackage.getArgument(), null, "arguments", null, 0, -1, ProcedureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedureCall_ReturnSite(), theProceduresPackage.getReturnSite(), null, "returnSite", null, 1, 1, ProcedureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionStatementEClass, ExpressionStatement.class, "ExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionStatement_Expression(), theExpressionsPackage.getExpression(), null, "expression", null, 1, 1, ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skipEClass, Skip.class, "Skip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(executionOrderEEnum, ExecutionOrder.class, "ExecutionOrder");
		addEEnumLiteral(executionOrderEEnum, ExecutionOrder.L2R);
		addEEnumLiteral(executionOrderEEnum, ExecutionOrder.R2L);
		addEEnumLiteral(executionOrderEEnum, ExecutionOrder.INTERLEAVED);
	}

} //StatementsPackageImpl
