/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.Analysis;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisType;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.InterproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.IntraproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult;
import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;
import org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl;
import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;
import org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl;
import org.servicifi.gelato.analysis.framework.procedures.ProceduresPackage;
import org.servicifi.gelato.analysis.framework.procedures.impl.ProceduresPackageImpl;

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
	private EClass analysisResultEClass = null;

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
	private EClass analysisConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intraproceduralAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interproceduralAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reachingDefinitionsAnalysisConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reachingDefinitionsAnalysisResultEClass = null;

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
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#eNS_URI
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
		Object registeredAnalysesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AnalysesPackageImpl theAnalysesPackage = registeredAnalysesPackage instanceof AnalysesPackageImpl ? (AnalysesPackageImpl)registeredAnalysesPackage : new AnalysesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphsPackage.eNS_URI);
		GraphsPackageImpl theGraphsPackage = (GraphsPackageImpl)(registeredPackage instanceof GraphsPackageImpl ? registeredPackage : GraphsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI);
		ProceduresPackageImpl theProceduresPackage = (ProceduresPackageImpl)(registeredPackage instanceof ProceduresPackageImpl ? registeredPackage : ProceduresPackage.eINSTANCE);

		// Create package meta-data objects
		theAnalysesPackage.createPackageContents();
		theGraphsPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theProceduresPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysesPackage.initializePackageContents();
		theGraphsPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theProceduresPackage.initializePackageContents();

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
	public EReference getAnalysis_Configuration() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__Entry__LabellableElement() {
		return analysisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__Exit__LabellableElement() {
		return analysisEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__PerformAnalysis() {
		return analysisEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__GetAllNodesWithDirection__LabellableElement_AnalysisDirection_Class() {
		return analysisEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__Meet__EList() {
		return analysisEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__GetAllEdgesWithDirection__LabellableElement_AnalysisDirection_Class() {
		return analysisEClass.getEOperations().get(5);
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
	public EClass getAnalysisConfiguration() {
		return analysisConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisConfiguration_Direction() {
		return (EAttribute)analysisConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisConfiguration_AnalysisType() {
		return (EAttribute)analysisConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntraproceduralAnalysis() {
		return intraproceduralAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntraproceduralAnalysis__Entry__LabellableElement() {
		return intraproceduralAnalysisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntraproceduralAnalysis__Exit__LabellableElement() {
		return intraproceduralAnalysisEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterproceduralAnalysis() {
		return interproceduralAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReachingDefinitionsAnalysisConfiguration() {
		return reachingDefinitionsAnalysisConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReachingDefinitionsAnalysisConfiguration_Assignments() {
		return (EAttribute)reachingDefinitionsAnalysisConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReachingDefinitionsAnalysisResult() {
		return reachingDefinitionsAnalysisResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachingDefinitionsAnalysisResult_Variable() {
		return (EReference)reachingDefinitionsAnalysisResultEClass.getEStructuralFeatures().get(0);
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
		createEReference(analysisEClass, ANALYSIS__CONFIGURATION);
		createEOperation(analysisEClass, ANALYSIS___ENTRY__LABELLABLEELEMENT);
		createEOperation(analysisEClass, ANALYSIS___EXIT__LABELLABLEELEMENT);
		createEOperation(analysisEClass, ANALYSIS___PERFORM_ANALYSIS);
		createEOperation(analysisEClass, ANALYSIS___GET_ALL_NODES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION_CLASS);
		createEOperation(analysisEClass, ANALYSIS___MEET__ELIST);
		createEOperation(analysisEClass, ANALYSIS___GET_ALL_EDGES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION_CLASS);

		analysisResultEClass = createEClass(ANALYSIS_RESULT);
		createEAttribute(analysisResultEClass, ANALYSIS_RESULT__LABEL);

		exitEntryPairEClass = createEClass(EXIT_ENTRY_PAIR);
		createEReference(exitEntryPairEClass, EXIT_ENTRY_PAIR__ENTRY);
		createEReference(exitEntryPairEClass, EXIT_ENTRY_PAIR__EXIT);

		comparableEClass = createEClass(COMPARABLE);

		analysisConfigurationEClass = createEClass(ANALYSIS_CONFIGURATION);
		createEAttribute(analysisConfigurationEClass, ANALYSIS_CONFIGURATION__DIRECTION);
		createEAttribute(analysisConfigurationEClass, ANALYSIS_CONFIGURATION__ANALYSIS_TYPE);

		intraproceduralAnalysisEClass = createEClass(INTRAPROCEDURAL_ANALYSIS);
		createEOperation(intraproceduralAnalysisEClass, INTRAPROCEDURAL_ANALYSIS___ENTRY__LABELLABLEELEMENT);
		createEOperation(intraproceduralAnalysisEClass, INTRAPROCEDURAL_ANALYSIS___EXIT__LABELLABLEELEMENT);

		interproceduralAnalysisEClass = createEClass(INTERPROCEDURAL_ANALYSIS);

		reachingDefinitionsAnalysisConfigurationEClass = createEClass(REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION);
		createEAttribute(reachingDefinitionsAnalysisConfigurationEClass, REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__ASSIGNMENTS);

		reachingDefinitionsAnalysisResultEClass = createEClass(REACHING_DEFINITIONS_ANALYSIS_RESULT);
		createEReference(reachingDefinitionsAnalysisResultEClass, REACHING_DEFINITIONS_ANALYSIS_RESULT__VARIABLE);

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
		GraphsPackage theGraphsPackage = (GraphsPackage)EPackage.Registry.INSTANCE.getEPackage(GraphsPackage.eNS_URI);
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		analysisResultEClass.getESuperTypes().add(this.getComparable());
		intraproceduralAnalysisEClass.getESuperTypes().add(this.getAnalysis());
		interproceduralAnalysisEClass.getESuperTypes().add(this.getAnalysis());
		reachingDefinitionsAnalysisConfigurationEClass.getESuperTypes().add(this.getAnalysisConfiguration());
		reachingDefinitionsAnalysisResultEClass.getESuperTypes().add(this.getAnalysisResult());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisEClass, Analysis.class, "Analysis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysis_Direction(), this.getAnalysisDirection(), "direction", "FORWARDS", 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_Cfg(), theGraphsPackage.getFlow(), null, "cfg", null, 1, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getAnalysis_Configuration(), this.getAnalysisConfiguration(), null, "configuration", null, 1, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAnalysis__Entry__LabellableElement(), this.getAnalysisResult(), "entry", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__Exit__LabellableElement(), this.getAnalysisResult(), "exit", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__PerformAnalysis(), null, "performAnalysis", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getELongObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getExitEntryPair());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAnalysis__GetAllNodesWithDirection__LabellableElement_AnalysisDirection_Class(), theCommonsPackage.getLabellableElement(), "getAllNodesWithDirection", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysisDirection(), "dir", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theGraphsPackage.getFlow());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "flowType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__Meet__EList(), this.getAnalysisResult(), "meet", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getAnalysisResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "exits", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__GetAllEdgesWithDirection__LabellableElement_AnalysisDirection_Class(), theGraphsPackage.getFlow(), "getAllEdgesWithDirection", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysisDirection(), "dir", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theGraphsPackage.getFlow());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "flowType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analysisResultEClass, AnalysisResult.class, "AnalysisResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisResult_Label(), ecorePackage.getELong(), "label", null, 1, 1, AnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exitEntryPairEClass, ExitEntryPair.class, "ExitEntryPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExitEntryPair_Entry(), this.getAnalysisResult(), null, "entry", null, 0, -1, ExitEntryPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExitEntryPair_Exit(), this.getAnalysisResult(), null, "exit", null, 0, -1, ExitEntryPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparableEClass, Object.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(analysisConfigurationEClass, AnalysisConfiguration.class, "AnalysisConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisConfiguration_Direction(), this.getAnalysisDirection(), "direction", null, 1, 1, AnalysisConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisConfiguration_AnalysisType(), this.getAnalysisType(), "analysisType", "MUST", 1, 1, AnalysisConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intraproceduralAnalysisEClass, IntraproceduralAnalysis.class, "IntraproceduralAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIntraproceduralAnalysis__Entry__LabellableElement(), this.getAnalysisResult(), "entry", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIntraproceduralAnalysis__Exit__LabellableElement(), this.getAnalysisResult(), "exit", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonsPackage.getLabellableElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interproceduralAnalysisEClass, InterproceduralAnalysis.class, "InterproceduralAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reachingDefinitionsAnalysisConfigurationEClass, ReachingDefinitionsAnalysisConfiguration.class, "ReachingDefinitionsAnalysisConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(theCommonsPackage.getVariable());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(ecorePackage.getELongObject());
		g2.getETypeArguments().add(g3);
		initEAttribute(getReachingDefinitionsAnalysisConfiguration_Assignments(), g1, "assignments", null, 1, 1, ReachingDefinitionsAnalysisConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reachingDefinitionsAnalysisResultEClass, ReachingDefinitionsAnalysisResult.class, "ReachingDefinitionsAnalysisResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReachingDefinitionsAnalysisResult_Variable(), theCommonsPackage.getVariable(), null, "variable", null, 0, 1, ReachingDefinitionsAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(analysisDirectionEEnum, AnalysisDirection.class, "AnalysisDirection");
		addEEnumLiteral(analysisDirectionEEnum, AnalysisDirection.FORWARDS);
		addEEnumLiteral(analysisDirectionEEnum, AnalysisDirection.BACKWARDS);

		initEEnum(analysisTypeEEnum, AnalysisType.class, "AnalysisType");
		addEEnumLiteral(analysisTypeEEnum, AnalysisType.MUST);
		addEEnumLiteral(analysisTypeEEnum, AnalysisType.MAY);

		// Create resource
		createResource(eNS_URI);
	}

} //AnalysesPackageImpl
