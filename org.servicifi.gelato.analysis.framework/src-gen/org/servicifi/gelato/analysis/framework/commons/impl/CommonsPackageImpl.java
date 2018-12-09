/**
 */
package org.servicifi.gelato.analysis.framework.commons.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;

import org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl;

import org.servicifi.gelato.analysis.framework.commons.CommonsFactory;
import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;
import org.servicifi.gelato.analysis.framework.commons.End;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Start;
import org.servicifi.gelato.analysis.framework.commons.Variable;

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
public class CommonsPackageImpl extends EPackageImpl implements CommonsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labellableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

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
	 * @see org.servicifi.gelato.analysis.framework.commons.CommonsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonsPackageImpl() {
		super(eNS_URI, CommonsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonsPackage init() {
		if (isInited) return (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommonsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommonsPackageImpl theCommonsPackage = registeredCommonsPackage instanceof CommonsPackageImpl ? (CommonsPackageImpl)registeredCommonsPackage : new CommonsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphsPackage.eNS_URI);
		GraphsPackageImpl theGraphsPackage = (GraphsPackageImpl)(registeredPackage instanceof GraphsPackageImpl ? registeredPackage : GraphsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnalysesPackage.eNS_URI);
		AnalysesPackageImpl theAnalysesPackage = (AnalysesPackageImpl)(registeredPackage instanceof AnalysesPackageImpl ? registeredPackage : AnalysesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI);
		ProceduresPackageImpl theProceduresPackage = (ProceduresPackageImpl)(registeredPackage instanceof ProceduresPackageImpl ? registeredPackage : ProceduresPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonsPackage.createPackageContents();
		theGraphsPackage.createPackageContents();
		theAnalysesPackage.createPackageContents();
		theProceduresPackage.createPackageContents();

		// Initialize created meta-data
		theCommonsPackage.initializePackageContents();
		theGraphsPackage.initializePackageContents();
		theAnalysesPackage.initializePackageContents();
		theProceduresPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonsPackage.eNS_URI, theCommonsPackage);
		return theCommonsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabellableElement() {
		return labellableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabellableElement_Label() {
		return (EAttribute)labellableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabellableElement__First() {
		return labellableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabellableElement__Last() {
		return labellableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabellableElement__InternalFlow() {
		return labellableElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabellableElement__Gen__AnalysisConfiguration() {
		return labellableElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabellableElement__Kill__AnalysisConfiguration() {
		return labellableElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonsFactory getCommonsFactory() {
		return (CommonsFactory)getEFactoryInstance();
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
		labellableElementEClass = createEClass(LABELLABLE_ELEMENT);
		createEAttribute(labellableElementEClass, LABELLABLE_ELEMENT__LABEL);
		createEOperation(labellableElementEClass, LABELLABLE_ELEMENT___FIRST);
		createEOperation(labellableElementEClass, LABELLABLE_ELEMENT___LAST);
		createEOperation(labellableElementEClass, LABELLABLE_ELEMENT___INTERNAL_FLOW);
		createEOperation(labellableElementEClass, LABELLABLE_ELEMENT___GEN__ANALYSISCONFIGURATION);
		createEOperation(labellableElementEClass, LABELLABLE_ELEMENT___KILL__ANALYSISCONFIGURATION);

		variableEClass = createEClass(VARIABLE);

		startEClass = createEClass(START);

		endEClass = createEClass(END);
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
		AnalysesPackage theAnalysesPackage = (AnalysesPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		labellableElementEClass.getESuperTypes().add(theGraphsPackage.getNode());
		startEClass.getESuperTypes().add(this.getLabellableElement());
		endEClass.getESuperTypes().add(this.getLabellableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(labellableElementEClass, LabellableElement.class, "LabellableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabellableElement_Label(), ecorePackage.getELong(), "label", null, 1, 1, LabellableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLabellableElement__First(), this.getLabellableElement(), "first", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLabellableElement__Last(), this.getLabellableElement(), "last", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLabellableElement__InternalFlow(), theGraphsPackage.getFlow(), "internalFlow", 1, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getLabellableElement__Gen__AnalysisConfiguration(), theAnalysesPackage.getAnalysisResult(), "gen", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAnalysesPackage.getAnalysisConfiguration(), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLabellableElement__Kill__AnalysisConfiguration(), theAnalysesPackage.getAnalysisResult(), "kill", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAnalysesPackage.getAnalysisConfiguration(), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonsPackageImpl
