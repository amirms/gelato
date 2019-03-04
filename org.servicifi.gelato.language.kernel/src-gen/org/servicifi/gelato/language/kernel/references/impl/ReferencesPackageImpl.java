/**
 */
package org.servicifi.gelato.language.kernel.references.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;

import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;

import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;

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

import org.servicifi.gelato.language.kernel.procedures.ProceduresPackage;

import org.servicifi.gelato.language.kernel.procedures.impl.ProceduresPackageImpl;

import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.ElementReference;
import org.servicifi.gelato.language.kernel.references.Reference;
import org.servicifi.gelato.language.kernel.references.ReferenceableElement;
import org.servicifi.gelato.language.kernel.references.ReferencesFactory;
import org.servicifi.gelato.language.kernel.references.ReferencesPackage;

import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

import org.servicifi.gelato.language.kernel.statements.impl.StatementsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesPackageImpl extends EPackageImpl implements ReferencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

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
	 * @see org.servicifi.gelato.language.kernel.references.ReferencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReferencesPackageImpl() {
		super(eNS_URI, ReferencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReferencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReferencesPackage init() {
		if (isInited) return (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReferencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReferencesPackageImpl theReferencesPackage = registeredReferencesPackage instanceof ReferencesPackageImpl ? (ReferencesPackageImpl)registeredReferencesPackage : new ReferencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphsPackage.eINSTANCE.eClass();
		AnalysesPackage.eINSTANCE.eClass();
		CommonsPackage.eINSTANCE.eClass();
		org.servicifi.gelato.analysis.framework.procedures.ProceduresPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(registeredPackage instanceof KernelPackageImpl ? registeredPackage : KernelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.servicifi.gelato.language.kernel.commons.CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage_1 = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : org.servicifi.gelato.language.kernel.commons.CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(registeredPackage instanceof StatementsPackageImpl ? registeredPackage : StatementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI);
		ProceduresPackageImpl theProceduresPackage_1 = (ProceduresPackageImpl)(registeredPackage instanceof ProceduresPackageImpl ? registeredPackage : ProceduresPackage.eINSTANCE);
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

		// Create package meta-data objects
		theReferencesPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theCommonsPackage_1.createPackageContents();
		theStatementsPackage.createPackageContents();
		theProceduresPackage_1.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theMembersPackage.createPackageContents();
		theDataitemsPackage.createPackageContents();
		theParametersPackage.createPackageContents();

		// Initialize created meta-data
		theReferencesPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theCommonsPackage_1.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theProceduresPackage_1.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theMembersPackage.initializePackageContents();
		theDataitemsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReferencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReferencesPackage.eNS_URI, theReferencesPackage);
		return theReferencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementReference() {
		return elementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementReference_Target() {
		return (EReference)elementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceableElement() {
		return referenceableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesFactory getReferencesFactory() {
		return (ReferencesFactory)getEFactoryInstance();
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
		elementReferenceEClass = createEClass(ELEMENT_REFERENCE);
		createEReference(elementReferenceEClass, ELEMENT_REFERENCE__TARGET);

		referenceableElementEClass = createEClass(REFERENCEABLE_ELEMENT);

		referenceEClass = createEClass(REFERENCE);

		argumentEClass = createEClass(ARGUMENT);
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
		org.servicifi.gelato.language.kernel.commons.CommonsPackage theCommonsPackage_1 = (org.servicifi.gelato.language.kernel.commons.CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(org.servicifi.gelato.language.kernel.commons.CommonsPackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		referenceableElementEClass.getESuperTypes().add(theCommonsPackage_1.getNamedElement());
		argumentEClass.getESuperTypes().add(this.getElementReference());

		// Initialize classes and features; add operations and parameters
		initEClass(elementReferenceEClass, ElementReference.class, "ElementReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementReference_Target(), this.getReferenceableElement(), null, "target", null, 1, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceableElementEClass, ReferenceableElement.class, "ReferenceableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(argumentEClass, theParametersPackage.getParameter(), "getCorrespondingParameter", 1, 1, IS_UNIQUE, IS_ORDERED);
	}

} //ReferencesPackageImpl
