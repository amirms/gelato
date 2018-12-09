/**
 */
package org.servicifi.gelato.analysis.framework.graphs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;

import org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl;

import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;

import org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl;

import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;
import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;
import org.servicifi.gelato.analysis.framework.graphs.Node;
import org.servicifi.gelato.analysis.framework.graphs.ProcedureFlow;
import org.servicifi.gelato.analysis.framework.graphs.RegularFlow;
import org.servicifi.gelato.analysis.framework.graphs.SummaryFlow;
import org.servicifi.gelato.analysis.framework.procedures.ProceduresPackage;
import org.servicifi.gelato.analysis.framework.procedures.impl.ProceduresPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphsPackageImpl extends EPackageImpl implements GraphsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass summaryFlowEClass = null;

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
	 * @see org.servicifi.gelato.analysis.framework.graphs.GraphsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphsPackageImpl() {
		super(eNS_URI, GraphsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GraphsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphsPackage init() {
		if (isInited) return (GraphsPackage)EPackage.Registry.INSTANCE.getEPackage(GraphsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGraphsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GraphsPackageImpl theGraphsPackage = registeredGraphsPackage instanceof GraphsPackageImpl ? (GraphsPackageImpl)registeredGraphsPackage : new GraphsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnalysesPackage.eNS_URI);
		AnalysesPackageImpl theAnalysesPackage = (AnalysesPackageImpl)(registeredPackage instanceof AnalysesPackageImpl ? registeredPackage : AnalysesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI);
		ProceduresPackageImpl theProceduresPackage = (ProceduresPackageImpl)(registeredPackage instanceof ProceduresPackageImpl ? registeredPackage : ProceduresPackage.eINSTANCE);

		// Create package meta-data objects
		theGraphsPackage.createPackageContents();
		theAnalysesPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theProceduresPackage.createPackageContents();

		// Initialize created meta-data
		theGraphsPackage.initializePackageContents();
		theAnalysesPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theProceduresPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphsPackage.eNS_URI, theGraphsPackage);
		return theGraphsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_To() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_From() {
		return (EReference)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlow__Reverse() {
		return flowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularFlow() {
		return regularFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureFlow() {
		return procedureFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Predecessors() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Successors() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSummaryFlow() {
		return summaryFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphsFactory getGraphsFactory() {
		return (GraphsFactory)getEFactoryInstance();
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
		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__TO);
		createEReference(flowEClass, FLOW__FROM);
		createEOperation(flowEClass, FLOW___REVERSE);

		regularFlowEClass = createEClass(REGULAR_FLOW);

		procedureFlowEClass = createEClass(PROCEDURE_FLOW);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__PREDECESSORS);
		createEReference(nodeEClass, NODE__SUCCESSORS);

		summaryFlowEClass = createEClass(SUMMARY_FLOW);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		regularFlowEClass.getESuperTypes().add(this.getFlow());
		procedureFlowEClass.getESuperTypes().add(this.getFlow());
		summaryFlowEClass.getESuperTypes().add(this.getFlow());

		// Initialize classes, features, and operations; add parameters
		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_To(), this.getNode(), null, "to", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_From(), this.getNode(), null, "from", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFlow__Reverse(), this.getFlow(), "reverse", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(regularFlowEClass, RegularFlow.class, "RegularFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(procedureFlowEClass, ProcedureFlow.class, "ProcedureFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Predecessors(), this.getNode(), null, "predecessors", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Successors(), this.getNode(), null, "successors", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(summaryFlowEClass, SummaryFlow.class, "SummaryFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphsPackageImpl
