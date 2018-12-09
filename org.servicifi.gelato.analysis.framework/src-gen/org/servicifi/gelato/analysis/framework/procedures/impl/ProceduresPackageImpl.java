/**
 */
package org.servicifi.gelato.analysis.framework.procedures.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;

import org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl;

import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;

import org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl;

import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;

import org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl;

import org.servicifi.gelato.analysis.framework.procedures.ProceduresFactory;
import org.servicifi.gelato.analysis.framework.procedures.ProceduresPackage;
import org.servicifi.gelato.analysis.framework.procedures.ReturnSite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProceduresPackageImpl extends EPackageImpl implements ProceduresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnSiteEClass = null;

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
	 * @see org.servicifi.gelato.analysis.framework.procedures.ProceduresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProceduresPackageImpl() {
		super(eNS_URI, ProceduresFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProceduresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProceduresPackage init() {
		if (isInited) return (ProceduresPackage)EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProceduresPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProceduresPackageImpl theProceduresPackage = registeredProceduresPackage instanceof ProceduresPackageImpl ? (ProceduresPackageImpl)registeredProceduresPackage : new ProceduresPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphsPackage.eNS_URI);
		GraphsPackageImpl theGraphsPackage = (GraphsPackageImpl)(registeredPackage instanceof GraphsPackageImpl ? registeredPackage : GraphsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnalysesPackage.eNS_URI);
		AnalysesPackageImpl theAnalysesPackage = (AnalysesPackageImpl)(registeredPackage instanceof AnalysesPackageImpl ? registeredPackage : AnalysesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : CommonsPackage.eINSTANCE);

		// Create package meta-data objects
		theProceduresPackage.createPackageContents();
		theGraphsPackage.createPackageContents();
		theAnalysesPackage.createPackageContents();
		theCommonsPackage.createPackageContents();

		// Initialize created meta-data
		theProceduresPackage.initializePackageContents();
		theGraphsPackage.initializePackageContents();
		theAnalysesPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProceduresPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProceduresPackage.eNS_URI, theProceduresPackage);
		return theProceduresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnSite() {
		return returnSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresFactory getProceduresFactory() {
		return (ProceduresFactory)getEFactoryInstance();
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
		returnSiteEClass = createEClass(RETURN_SITE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		returnSiteEClass.getESuperTypes().add(theCommonsPackage.getLabellableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(returnSiteEClass, ReturnSite.class, "ReturnSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProceduresPackageImpl
