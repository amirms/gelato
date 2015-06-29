/**
 */
package org.servicifi.gelato.language.kernel.analyses.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.language.kernel.KernelPackage;

import org.servicifi.gelato.language.kernel.analyses.AnalysesFactory;
import org.servicifi.gelato.language.kernel.analyses.AnalysesPackage;
import org.servicifi.gelato.language.kernel.analyses.Analysis;
import org.servicifi.gelato.language.kernel.analyses.AnalysisDirection;
import org.servicifi.gelato.language.kernel.analyses.AnalysisResult;
import org.servicifi.gelato.language.kernel.analyses.AnalysisType;
import org.servicifi.gelato.language.kernel.analyses.ExitEntryPair;
import org.servicifi.gelato.language.kernel.analyses.IteratorElement;
import org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsAnalysis;
import org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsResult;

import org.servicifi.gelato.language.kernel.commons.CommonsPackage;

import org.servicifi.gelato.language.kernel.commons.impl.CommonsPackageImpl;

import org.servicifi.gelato.language.kernel.containers.ContainersPackage;

import org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl;

import org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage;
import org.servicifi.gelato.language.kernel.dataitems.impl.DataitemsPackageImpl;
import org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage;

import org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl;

import org.servicifi.gelato.language.kernel.flows.FlowsPackage;

import org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl;

import org.servicifi.gelato.language.kernel.impl.KernelPackageImpl;

import org.servicifi.gelato.language.kernel.members.MembersPackage;

import org.servicifi.gelato.language.kernel.members.impl.MembersPackageImpl;

import org.servicifi.gelato.language.kernel.parameters.ParametersPackage;

import org.servicifi.gelato.language.kernel.parameters.impl.ParametersPackageImpl;

import org.servicifi.gelato.language.kernel.procedures.ProceduresPackage;

import org.servicifi.gelato.language.kernel.procedures.impl.ProceduresPackageImpl;

import org.servicifi.gelato.language.kernel.references.ReferencesPackage;

import org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl;

import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

import org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysesPackageImpl extends EPackageImpl implements AnalysesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reachingDefinitionsAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reachingDefinitionsResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitEntryPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum analysisDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum analysisTypeEEnum = null;

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
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnalysesPackageImpl() {
		super(eNS_URI, AnalysesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnalysesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnalysesPackage init() {
		if (isInited) return (AnalysesPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysesPackage.eNS_URI);

		// Obtain or create and register package
		AnalysesPackageImpl theAnalysesPackage = (AnalysesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnalysesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnalysesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		ProceduresPackageImpl theProceduresPackage = (ProceduresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI) instanceof ProceduresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI) : ProceduresPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) : ContainersPackage.eINSTANCE);
		MembersPackageImpl theMembersPackage = (MembersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI) instanceof MembersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI) : MembersPackage.eINSTANCE);
		DataitemsPackageImpl theDataitemsPackage = (DataitemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI) instanceof DataitemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI) : DataitemsPackage.eINSTANCE);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) instanceof ParametersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) : ParametersPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		FlowsPackageImpl theFlowsPackage = (FlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FlowsPackage.eNS_URI) instanceof FlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FlowsPackage.eNS_URI) : FlowsPackage.eINSTANCE);

		// Create package meta-data objects
		theAnalysesPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theProceduresPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theMembersPackage.createPackageContents();
		theDataitemsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theFlowsPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysesPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theProceduresPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theMembersPackage.initializePackageContents();
		theDataitemsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theFlowsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnalysesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnalysesPackage.eNS_URI, theAnalysesPackage);
		return theAnalysesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysis() {
		return analysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_Direction() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Cfg() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_Result() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_ExitTable() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_EntryTable() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_AnalysisType() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReachingDefinitionsAnalysis() {
		return reachingDefinitionsAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReachingDefinitionsAnalysis_Assignments() {
		return (EAttribute)reachingDefinitionsAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisResult() {
		return analysisResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisResult_Label() {
		return (EAttribute)analysisResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReachingDefinitionsResult() {
		return reachingDefinitionsResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachingDefinitionsResult_Variable() {
		return (EReference)reachingDefinitionsResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitEntryPair() {
		return exitEntryPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExitEntryPair_Entry() {
		return (EReference)exitEntryPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExitEntryPair_Exit() {
		return (EReference)exitEntryPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparable() {
		return comparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorElement() {
		return iteratorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteratorElement_Iteration() {
		return (EAttribute)iteratorElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorElement_Element() {
		return (EReference)iteratorElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnalysisDirection() {
		return analysisDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnalysisType() {
		return analysisTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysesFactory getAnalysesFactory() {
		return (AnalysesFactory)getEFactoryInstance();
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
		analysisEClass = createEClass(ANALYSIS);
		createEAttribute(analysisEClass, ANALYSIS__DIRECTION);
		createEReference(analysisEClass, ANALYSIS__CFG);
		createEAttribute(analysisEClass, ANALYSIS__RESULT);
		createEAttribute(analysisEClass, ANALYSIS__EXIT_TABLE);
		createEAttribute(analysisEClass, ANALYSIS__ENTRY_TABLE);
		createEAttribute(analysisEClass, ANALYSIS__ANALYSIS_TYPE);

		reachingDefinitionsAnalysisEClass = createEClass(REACHING_DEFINITIONS_ANALYSIS);
		createEAttribute(reachingDefinitionsAnalysisEClass, REACHING_DEFINITIONS_ANALYSIS__ASSIGNMENTS);

		analysisResultEClass = createEClass(ANALYSIS_RESULT);
		createEAttribute(analysisResultEClass, ANALYSIS_RESULT__LABEL);

		reachingDefinitionsResultEClass = createEClass(REACHING_DEFINITIONS_RESULT);
		createEReference(reachingDefinitionsResultEClass, REACHING_DEFINITIONS_RESULT__VARIABLE);

		exitEntryPairEClass = createEClass(EXIT_ENTRY_PAIR);
		createEReference(exitEntryPairEClass, EXIT_ENTRY_PAIR__ENTRY);
		createEReference(exitEntryPairEClass, EXIT_ENTRY_PAIR__EXIT);

		comparableEClass = createEClass(COMPARABLE);

		iteratorElementEClass = createEClass(ITERATOR_ELEMENT);
		createEAttribute(iteratorElementEClass, ITERATOR_ELEMENT__ITERATION);
		createEReference(iteratorElementEClass, ITERATOR_ELEMENT__ELEMENT);

		// Create enums
		analysisDirectionEEnum = createEEnum(ANALYSIS_DIRECTION);
		analysisTypeEEnum = createEEnum(ANALYSIS_TYPE);
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
		FlowsPackage theFlowsPackage = (FlowsPackage)EPackage.Registry.INSTANCE.getEPackage(FlowsPackage.eNS_URI);
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		DataitemsPackage theDataitemsPackage = (DataitemsPackage)EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reachingDefinitionsAnalysisEClass.getESuperTypes().add(this.getAnalysis());
		analysisResultEClass.getESuperTypes().add(this.getComparable());
		reachingDefinitionsResultEClass.getESuperTypes().add(this.getAnalysisResult());

		// Initialize classes and features; add operations and parameters
		initEClass(analysisEClass, Analysis.class, "Analysis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysis_Direction(), this.getAnalysisDirection(), "direction", "FORWARDS", 1, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_Cfg(), theFlowsPackage.getFlow(), null, "cfg", null, 1, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getELongObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getExitEntryPair());
		g1.getETypeArguments().add(g2);
		initEAttribute(getAnalysis_Result(), g1, "result", null, 1, 1, Analysis.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(theCommonsPackage.getLabellableElement());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getAnalysisResult());
		g2.getETypeArguments().add(g3);
		initEAttribute(getAnalysis_ExitTable(), g1, "exitTable", null, 1, 1, Analysis.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(theCommonsPackage.getLabellableElement());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getAnalysisResult());
		g2.getETypeArguments().add(g3);
		initEAttribute(getAnalysis_EntryTable(), g1, "entryTable", null, 1, 1, Analysis.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_AnalysisType(), this.getAnalysisType(), "analysisType", "MUST", 1, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(analysisEClass, this.getAnalysisResult(), "kill", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(analysisEClass, this.getAnalysisResult(), "gen", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(analysisEClass, this.getAnalysisResult(), "entry", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(analysisEClass, this.getAnalysisResult(), "exit", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(analysisEClass, null, "performAnalysis", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getELongObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getExitEntryPair());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(analysisEClass, theCommonsPackage.getLabellableElement(), "getAllNodesWithDirection", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysisDirection(), "dir", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(analysisEClass, this.getAnalysisResult(), "meet", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getAnalysisResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "exits", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(reachingDefinitionsAnalysisEClass, ReachingDefinitionsAnalysis.class, "ReachingDefinitionsAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(theDataitemsPackage.getDataItem());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(ecorePackage.getELongObject());
		g2.getETypeArguments().add(g3);
		initEAttribute(getReachingDefinitionsAnalysis_Assignments(), g1, "assignments", null, 1, 1, ReachingDefinitionsAnalysis.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisResultEClass, AnalysisResult.class, "AnalysisResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisResult_Label(), ecorePackage.getELong(), "label", null, 1, 1, AnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reachingDefinitionsResultEClass, ReachingDefinitionsResult.class, "ReachingDefinitionsResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReachingDefinitionsResult_Variable(), theDataitemsPackage.getDataItem(), null, "variable", null, 1, 1, ReachingDefinitionsResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exitEntryPairEClass, ExitEntryPair.class, "ExitEntryPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExitEntryPair_Entry(), this.getAnalysisResult(), null, "entry", null, 0, -1, ExitEntryPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExitEntryPair_Exit(), this.getAnalysisResult(), null, "exit", null, 0, -1, ExitEntryPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparableEClass, Object.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iteratorElementEClass, IteratorElement.class, "IteratorElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIteratorElement_Iteration(), ecorePackage.getEInt(), "iteration", null, 1, 1, IteratorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteratorElement_Element(), theCommonsPackage.getLabellableElement(), null, "element", null, 1, 1, IteratorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(analysisDirectionEEnum, AnalysisDirection.class, "AnalysisDirection");
		addEEnumLiteral(analysisDirectionEEnum, AnalysisDirection.FORWARDS);
		addEEnumLiteral(analysisDirectionEEnum, AnalysisDirection.BACKWARDS);

		initEEnum(analysisTypeEEnum, AnalysisType.class, "AnalysisType");
		addEEnumLiteral(analysisTypeEEnum, AnalysisType.MUST);
		addEEnumLiteral(analysisTypeEEnum, AnalysisType.MAY);
	}

} //AnalysesPackageImpl
