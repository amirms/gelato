/**
 */
package org.servicifi.gelato.language.cobol.containers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.language.cobol.CobolPackage;

import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage;

import org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl;

import org.servicifi.gelato.language.cobol.commons.CommonsPackage;

import org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl;

import org.servicifi.gelato.language.cobol.conditions.ConditionsPackage;

import org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl;

import org.servicifi.gelato.language.cobol.containers.CobolRoot;
import org.servicifi.gelato.language.cobol.containers.CompilationGroup;
import org.servicifi.gelato.language.cobol.containers.CompilationUnit;
import org.servicifi.gelato.language.cobol.containers.ContainersFactory;
import org.servicifi.gelato.language.cobol.containers.ContainersPackage;
import org.servicifi.gelato.language.cobol.containers.EmptyModel;

import org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage;

import org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl;

import org.servicifi.gelato.language.cobol.declaratives.DeclarativesPackage;

import org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesPackageImpl;

import org.servicifi.gelato.language.cobol.divisions.DivisionsPackage;

import org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl;

import org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage;

import org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl;

import org.servicifi.gelato.language.cobol.files.FilesPackage;

import org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl;

import org.servicifi.gelato.language.cobol.functions.FunctionsPackage;

import org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl;

import org.servicifi.gelato.language.cobol.handlers.HandlersPackage;

import org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl;

import org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage;

import org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl;

import org.servicifi.gelato.language.cobol.impl.CobolPackageImpl;

import org.servicifi.gelato.language.cobol.ios.IosPackage;

import org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl;

import org.servicifi.gelato.language.cobol.labels.LabelsPackage;

import org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl;

import org.servicifi.gelato.language.cobol.literals.LiteralsPackage;

import org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl;

import org.servicifi.gelato.language.cobol.operands.OperandsPackage;

import org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl;

import org.servicifi.gelato.language.cobol.operators.OperatorsPackage;

import org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl;

import org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage;

import org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl;

import org.servicifi.gelato.language.cobol.parameters.ParametersPackage;

import org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl;

import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

import org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl;

import org.servicifi.gelato.language.cobol.registers.RegistersPackage;

import org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl;

import org.servicifi.gelato.language.cobol.sections.SectionsPackage;

import org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl;

import org.servicifi.gelato.language.cobol.sentences.SentencesPackage;

import org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl;

import org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage;

import org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl;

import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

import org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl;

import org.servicifi.gelato.language.cobol.strings.StringsPackage;

import org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl;

import org.servicifi.gelato.language.cobol.tables.TablesPackage;

import org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl;

import org.servicifi.gelato.language.cobol.verbs.VerbsPackage;

import org.servicifi.gelato.language.cobol.verbs.impl.VerbsPackageImpl;

import org.servicifi.gelato.language.cobol.water.WaterPackage;

import org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainersPackageImpl extends EPackageImpl implements ContainersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyModelEClass = null;

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
	 * @see org.servicifi.gelato.language.cobol.containers.ContainersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContainersPackageImpl() {
		super(eNS_URI, ContainersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContainersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContainersPackage init() {
		if (isInited) return (ContainersPackage)EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);

		// Obtain or create and register package
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContainersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CobolPackageImpl theCobolPackage = (CobolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CobolPackage.eNS_URI) instanceof CobolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CobolPackage.eNS_URI) : CobolPackage.eINSTANCE);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		ConditionsPackageImpl theConditionsPackage = (ConditionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionsPackage.eNS_URI) instanceof ConditionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionsPackage.eNS_URI) : ConditionsPackage.eINSTANCE);
		ArithmeticsPackageImpl theArithmeticsPackage = (ArithmeticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArithmeticsPackage.eNS_URI) instanceof ArithmeticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArithmeticsPackage.eNS_URI) : ArithmeticsPackage.eINSTANCE);
		DivisionsPackageImpl theDivisionsPackage = (DivisionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DivisionsPackage.eNS_URI) instanceof DivisionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DivisionsPackage.eNS_URI) : DivisionsPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI) instanceof OperatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI) : OperatorsPackage.eINSTANCE);
		ParagraphsPackageImpl theParagraphsPackage = (ParagraphsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParagraphsPackage.eNS_URI) instanceof ParagraphsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParagraphsPackage.eNS_URI) : ParagraphsPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		SectionsPackageImpl theSectionsPackage = (SectionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SectionsPackage.eNS_URI) instanceof SectionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SectionsPackage.eNS_URI) : SectionsPackage.eINSTANCE);
		SentencesPackageImpl theSentencesPackage = (SentencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SentencesPackage.eNS_URI) instanceof SentencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SentencesPackage.eNS_URI) : SentencesPackage.eINSTANCE);
		OperandsPackageImpl theOperandsPackage = (OperandsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperandsPackage.eNS_URI) instanceof OperandsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperandsPackage.eNS_URI) : OperandsPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		IdentifiersPackageImpl theIdentifiersPackage = (IdentifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifiersPackage.eNS_URI) instanceof IdentifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifiersPackage.eNS_URI) : IdentifiersPackage.eINSTANCE);
		IosPackageImpl theIosPackage = (IosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IosPackage.eNS_URI) instanceof IosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IosPackage.eNS_URI) : IosPackage.eINSTANCE);
		WaterPackageImpl theWaterPackage = (WaterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WaterPackage.eNS_URI) instanceof WaterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WaterPackage.eNS_URI) : WaterPackage.eINSTANCE);
		RegistersPackageImpl theRegistersPackage = (RegistersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RegistersPackage.eNS_URI) instanceof RegistersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RegistersPackage.eNS_URI) : RegistersPackage.eINSTANCE);
		EnvironmentsPackageImpl theEnvironmentsPackage = (EnvironmentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvironmentsPackage.eNS_URI) instanceof EnvironmentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentsPackage.eNS_URI) : EnvironmentsPackage.eINSTANCE);
		DataitemsPackageImpl theDataitemsPackage = (DataitemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI) instanceof DataitemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI) : DataitemsPackage.eINSTANCE);
		SpecialnamesPackageImpl theSpecialnamesPackage = (SpecialnamesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpecialnamesPackage.eNS_URI) instanceof SpecialnamesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpecialnamesPackage.eNS_URI) : SpecialnamesPackage.eINSTANCE);
		TablesPackageImpl theTablesPackage = (TablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TablesPackage.eNS_URI) instanceof TablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TablesPackage.eNS_URI) : TablesPackage.eINSTANCE);
		FilesPackageImpl theFilesPackage = (FilesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilesPackage.eNS_URI) instanceof FilesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilesPackage.eNS_URI) : FilesPackage.eINSTANCE);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) instanceof ParametersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) : ParametersPackage.eINSTANCE);
		DeclarativesPackageImpl theDeclarativesPackage = (DeclarativesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarativesPackage.eNS_URI) instanceof DeclarativesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarativesPackage.eNS_URI) : DeclarativesPackage.eINSTANCE);
		VerbsPackageImpl theVerbsPackage = (VerbsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VerbsPackage.eNS_URI) instanceof VerbsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VerbsPackage.eNS_URI) : VerbsPackage.eINSTANCE);
		LabelsPackageImpl theLabelsPackage = (LabelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LabelsPackage.eNS_URI) instanceof LabelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LabelsPackage.eNS_URI) : LabelsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		HandlersPackageImpl theHandlersPackage = (HandlersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HandlersPackage.eNS_URI) instanceof HandlersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HandlersPackage.eNS_URI) : HandlersPackage.eINSTANCE);
		StringsPackageImpl theStringsPackage = (StringsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StringsPackage.eNS_URI) instanceof StringsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StringsPackage.eNS_URI) : StringsPackage.eINSTANCE);

		// Create package meta-data objects
		theContainersPackage.createPackageContents();
		theCobolPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theConditionsPackage.createPackageContents();
		theArithmeticsPackage.createPackageContents();
		theDivisionsPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theParagraphsPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theSectionsPackage.createPackageContents();
		theSentencesPackage.createPackageContents();
		theOperandsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theIdentifiersPackage.createPackageContents();
		theIosPackage.createPackageContents();
		theWaterPackage.createPackageContents();
		theRegistersPackage.createPackageContents();
		theEnvironmentsPackage.createPackageContents();
		theDataitemsPackage.createPackageContents();
		theSpecialnamesPackage.createPackageContents();
		theTablesPackage.createPackageContents();
		theFilesPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theDeclarativesPackage.createPackageContents();
		theVerbsPackage.createPackageContents();
		theLabelsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHandlersPackage.createPackageContents();
		theStringsPackage.createPackageContents();

		// Initialize created meta-data
		theContainersPackage.initializePackageContents();
		theCobolPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theConditionsPackage.initializePackageContents();
		theArithmeticsPackage.initializePackageContents();
		theDivisionsPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theParagraphsPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theSectionsPackage.initializePackageContents();
		theSentencesPackage.initializePackageContents();
		theOperandsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theIdentifiersPackage.initializePackageContents();
		theIosPackage.initializePackageContents();
		theWaterPackage.initializePackageContents();
		theRegistersPackage.initializePackageContents();
		theEnvironmentsPackage.initializePackageContents();
		theDataitemsPackage.initializePackageContents();
		theSpecialnamesPackage.initializePackageContents();
		theTablesPackage.initializePackageContents();
		theFilesPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theDeclarativesPackage.initializePackageContents();
		theVerbsPackage.initializePackageContents();
		theLabelsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHandlersPackage.initializePackageContents();
		theStringsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContainersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContainersPackage.eNS_URI, theContainersPackage);
		return theContainersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationGroup() {
		return compilationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationGroup_CompilationUnits() {
		return (EReference)compilationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_IdentificationDivision() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_EnvironmentDivision() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_DataDivision() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_ProcedureDivision() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_NestedCompilationUnits() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCobolRoot() {
		return cobolRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyModel() {
		return emptyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainersFactory getContainersFactory() {
		return (ContainersFactory)getEFactoryInstance();
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
		compilationGroupEClass = createEClass(COMPILATION_GROUP);
		createEReference(compilationGroupEClass, COMPILATION_GROUP__COMPILATION_UNITS);

		compilationUnitEClass = createEClass(COMPILATION_UNIT);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__IDENTIFICATION_DIVISION);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__ENVIRONMENT_DIVISION);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__DATA_DIVISION);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__PROCEDURE_DIVISION);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__NESTED_COMPILATION_UNITS);

		cobolRootEClass = createEClass(COBOL_ROOT);

		emptyModelEClass = createEClass(EMPTY_MODEL);
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
		DivisionsPackage theDivisionsPackage = (DivisionsPackage)EPackage.Registry.INSTANCE.getEPackage(DivisionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compilationGroupEClass.getESuperTypes().add(this.getCobolRoot());
		compilationGroupEClass.getESuperTypes().add(theCommonsPackage.getNamedElement());
		compilationUnitEClass.getESuperTypes().add(theCommonsPackage.getNamedElement());
		emptyModelEClass.getESuperTypes().add(this.getCobolRoot());

		// Initialize classes and features; add operations and parameters
		initEClass(compilationGroupEClass, CompilationGroup.class, "CompilationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompilationGroup_CompilationUnits(), this.getCompilationUnit(), null, "compilationUnits", null, 0, -1, CompilationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompilationUnit_IdentificationDivision(), theDivisionsPackage.getIdentificationDivision(), null, "identificationDivision", null, 1, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompilationUnit_EnvironmentDivision(), theDivisionsPackage.getEnvironmentDivision(), null, "environmentDivision", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompilationUnit_DataDivision(), theDivisionsPackage.getDataDivision(), null, "dataDivision", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompilationUnit_ProcedureDivision(), theDivisionsPackage.getProcedureDivision(), null, "procedureDivision", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompilationUnit_NestedCompilationUnits(), this.getCompilationUnit(), null, "nestedCompilationUnits", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cobolRootEClass, CobolRoot.class, "CobolRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emptyModelEClass, EmptyModel.class, "EmptyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ContainersPackageImpl
