/**
 */
package org.servicifi.gelato.language.kernel.expressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.language.kernel.KernelPackage;

import org.servicifi.gelato.language.kernel.analyses.AnalysesPackage;
import org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl;
import org.servicifi.gelato.language.kernel.commons.CommonsPackage;

import org.servicifi.gelato.language.kernel.commons.impl.CommonsPackageImpl;

import org.servicifi.gelato.language.kernel.containers.ContainersPackage;

import org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl;

import org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage;
import org.servicifi.gelato.language.kernel.dataitems.impl.DataitemsPackageImpl;
import org.servicifi.gelato.language.kernel.expressions.Affects;
import org.servicifi.gelato.language.kernel.expressions.Defines;
import org.servicifi.gelato.language.kernel.expressions.Definition;
import org.servicifi.gelato.language.kernel.expressions.Expression;
import org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory;
import org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage;
import org.servicifi.gelato.language.kernel.expressions.PostAffects;
import org.servicifi.gelato.language.kernel.expressions.PostDefines;
import org.servicifi.gelato.language.kernel.expressions.PreUses;
import org.servicifi.gelato.language.kernel.expressions.SubExpression;
import org.servicifi.gelato.language.kernel.expressions.Usage;
import org.servicifi.gelato.language.kernel.expressions.Uses;

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
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postDefinesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postAffectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preUsesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

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
	 * @see org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionsPackageImpl() {
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionsPackage init() {
		if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		ProceduresPackageImpl theProceduresPackage = (ProceduresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI) instanceof ProceduresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProceduresPackage.eNS_URI) : ProceduresPackage.eINSTANCE);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) : ContainersPackage.eINSTANCE);
		MembersPackageImpl theMembersPackage = (MembersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI) instanceof MembersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI) : MembersPackage.eINSTANCE);
		DataitemsPackageImpl theDataitemsPackage = (DataitemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI) instanceof DataitemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI) : DataitemsPackage.eINSTANCE);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) instanceof ParametersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) : ParametersPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		FlowsPackageImpl theFlowsPackage = (FlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FlowsPackage.eNS_URI) instanceof FlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FlowsPackage.eNS_URI) : FlowsPackage.eINSTANCE);
		AnalysesPackageImpl theAnalysesPackage = (AnalysesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnalysesPackage.eNS_URI) instanceof AnalysesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnalysesPackage.eNS_URI) : AnalysesPackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theProceduresPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theMembersPackage.createPackageContents();
		theDataitemsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theFlowsPackage.createPackageContents();
		theAnalysesPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theProceduresPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theMembersPackage.initializePackageContents();
		theDataitemsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theFlowsPackage.initializePackageContents();
		theAnalysesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Children() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubExpression() {
		return subExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefines() {
		return definesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostDefines() {
		return postDefinesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffects() {
		return affectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostAffects() {
		return postAffectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUses() {
		return usesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreUses() {
		return preUsesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Reaches() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsage() {
		return usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactory getExpressionsFactory() {
		return (ExpressionsFactory)getEFactoryInstance();
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
		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__CHILDREN);

		subExpressionEClass = createEClass(SUB_EXPRESSION);

		definesEClass = createEClass(DEFINES);

		postDefinesEClass = createEClass(POST_DEFINES);

		affectsEClass = createEClass(AFFECTS);

		postAffectsEClass = createEClass(POST_AFFECTS);

		usesEClass = createEClass(USES);

		preUsesEClass = createEClass(PRE_USES);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__REACHES);

		usageEClass = createEClass(USAGE);
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
		DataitemsPackage theDataitemsPackage = (DataitemsPackage)EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionEClass.getESuperTypes().add(theCommonsPackage.getLabellableElement());
		subExpressionEClass.getESuperTypes().add(theReferencesPackage.getElementReference());
		definesEClass.getESuperTypes().add(this.getDefinition());
		postDefinesEClass.getESuperTypes().add(this.getDefinition());
		affectsEClass.getESuperTypes().add(this.getDefinition());
		postAffectsEClass.getESuperTypes().add(this.getDefinition());
		usesEClass.getESuperTypes().add(this.getUsage());
		preUsesEClass.getESuperTypes().add(this.getUsage());
		definitionEClass.getESuperTypes().add(this.getSubExpression());
		usageEClass.getESuperTypes().add(this.getSubExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Children(), this.getSubExpression(), null, "children", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(expressionEClass, theDataitemsPackage.getDataItem(), "getDefinedVariables", 1, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(expressionEClass, theDataitemsPackage.getDataItem(), "getUsedVariables", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(subExpressionEClass, SubExpression.class, "SubExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definesEClass, Defines.class, "Defines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postDefinesEClass, PostDefines.class, "PostDefines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(affectsEClass, Affects.class, "Affects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postAffectsEClass, PostAffects.class, "PostAffects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usesEClass, Uses.class, "Uses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preUsesEClass, PreUses.class, "PreUses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definitionEClass, Definition.class, "Definition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinition_Reaches(), this.getUsage(), null, "reaches", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageEClass, Usage.class, "Usage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ExpressionsPackageImpl
