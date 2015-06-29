/**
 */
package org.servicifi.gelato.language.jcl.procedures.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.language.jcl.commons.CommonsPackage;

import org.servicifi.gelato.language.jcl.commons.impl.CommonsPackageImpl;

import org.servicifi.gelato.language.jcl.containers.ContainersPackage;

import org.servicifi.gelato.language.jcl.containers.impl.ContainersPackageImpl;

import org.servicifi.gelato.language.jcl.parameters.ParametersPackage;

import org.servicifi.gelato.language.jcl.parameters.impl.ParametersPackageImpl;

import org.servicifi.gelato.language.jcl.procedures.Procedure;
import org.servicifi.gelato.language.jcl.procedures.ProceduresFactory;
import org.servicifi.gelato.language.jcl.procedures.ProceduresPackage;

import org.servicifi.gelato.language.jcl.statements.StatementsPackage;

import org.servicifi.gelato.language.jcl.statements.impl.StatementsPackageImpl;

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
	private EClass procedureEClass = null;

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
	 * @see org.servicifi.gelato.language.jcl.procedures.ProceduresPackage#eNS_URI
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
		ProceduresPackageImpl theProceduresPackage = (ProceduresPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProceduresPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProceduresPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) instanceof ParametersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) : ParametersPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) : ContainersPackage.eINSTANCE);

		// Create package meta-data objects
		theProceduresPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theContainersPackage.createPackageContents();

		// Initialize created meta-data
		theProceduresPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();

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
	public EClass getProcedure() {
		return procedureEClass;
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
		procedureEClass = createEClass(PROCEDURE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProceduresPackageImpl
