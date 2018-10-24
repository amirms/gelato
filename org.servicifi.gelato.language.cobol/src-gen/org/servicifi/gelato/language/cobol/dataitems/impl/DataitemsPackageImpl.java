/**
 */
package org.servicifi.gelato.language.cobol.dataitems.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import org.servicifi.gelato.language.cobol.containers.ContainersPackage;

import org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl;

import org.servicifi.gelato.language.cobol.dataitems.ConditionName;
import org.servicifi.gelato.language.cobol.dataitems.DataItem;
import org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute;
import org.servicifi.gelato.language.cobol.dataitems.DataName;
import org.servicifi.gelato.language.cobol.dataitems.DataitemsFactory;
import org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage;
import org.servicifi.gelato.language.cobol.dataitems.External;
import org.servicifi.gelato.language.cobol.dataitems.Global;
import org.servicifi.gelato.language.cobol.dataitems.GroupUsage;
import org.servicifi.gelato.language.cobol.dataitems.PictureString;
import org.servicifi.gelato.language.cobol.dataitems.PictureStringCharacters;
import org.servicifi.gelato.language.cobol.dataitems.RecordName;
import org.servicifi.gelato.language.cobol.dataitems.Redefines;
import org.servicifi.gelato.language.cobol.dataitems.RenamingDataName;
import org.servicifi.gelato.language.cobol.dataitems.Usage;
import org.servicifi.gelato.language.cobol.dataitems.Usages;
import org.servicifi.gelato.language.cobol.dataitems.Value;

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
public class DataitemsPackageImpl extends EPackageImpl implements DataitemsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pictureStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renamingDataNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataItemAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usagesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pictureStringCharactersEEnum = null;

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
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataitemsPackageImpl() {
		super(eNS_URI, DataitemsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataitemsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataitemsPackage init() {
		if (isInited) return (DataitemsPackage)EPackage.Registry.INSTANCE.getEPackage(DataitemsPackage.eNS_URI);

		// Obtain or create and register package
		DataitemsPackageImpl theDataitemsPackage = (DataitemsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataitemsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataitemsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CobolPackageImpl theCobolPackage = (CobolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CobolPackage.eNS_URI) instanceof CobolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CobolPackage.eNS_URI) : CobolPackage.eINSTANCE);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		ConditionsPackageImpl theConditionsPackage = (ConditionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionsPackage.eNS_URI) instanceof ConditionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionsPackage.eNS_URI) : ConditionsPackage.eINSTANCE);
		ArithmeticsPackageImpl theArithmeticsPackage = (ArithmeticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArithmeticsPackage.eNS_URI) instanceof ArithmeticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArithmeticsPackage.eNS_URI) : ArithmeticsPackage.eINSTANCE);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) : ContainersPackage.eINSTANCE);
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
		theDataitemsPackage.createPackageContents();
		theCobolPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theConditionsPackage.createPackageContents();
		theArithmeticsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
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
		theDataitemsPackage.initializePackageContents();
		theCobolPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theConditionsPackage.initializePackageContents();
		theArithmeticsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
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
		theDataitemsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataitemsPackage.eNS_URI, theDataitemsPackage);
		return theDataitemsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPictureString() {
		return pictureStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureString_Picture() {
		return (EAttribute)pictureStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenamingDataName() {
		return renamingDataNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenamingDataName_NameRange() {
		return (EReference)renamingDataNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionName() {
		return conditionNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobal() {
		return globalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternal() {
		return externalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_Values() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataItemAttribute() {
		return dataItemAttributeEClass;
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
	public EAttribute getUsage_Usage() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsage_IsNative() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupUsage() {
		return groupUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataItem() {
		return dataItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataItem_LevelNumber() {
		return (EAttribute)dataItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataItem_Attributes() {
		return (EReference)dataItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataItem_Subentries() {
		return (EReference)dataItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataItem_Superentry() {
		return (EReference)dataItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordName() {
		return recordNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordName_Elems() {
		return (EReference)recordNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataName() {
		return dataNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefines() {
		return redefinesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefines_DataName() {
		return (EReference)redefinesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsages() {
		return usagesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPictureStringCharacters() {
		return pictureStringCharactersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataitemsFactory getDataitemsFactory() {
		return (DataitemsFactory)getEFactoryInstance();
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
		pictureStringEClass = createEClass(PICTURE_STRING);
		createEAttribute(pictureStringEClass, PICTURE_STRING__PICTURE);

		renamingDataNameEClass = createEClass(RENAMING_DATA_NAME);
		createEReference(renamingDataNameEClass, RENAMING_DATA_NAME__NAME_RANGE);

		conditionNameEClass = createEClass(CONDITION_NAME);

		globalEClass = createEClass(GLOBAL);

		externalEClass = createEClass(EXTERNAL);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__VALUES);

		dataItemAttributeEClass = createEClass(DATA_ITEM_ATTRIBUTE);

		usageEClass = createEClass(USAGE);
		createEAttribute(usageEClass, USAGE__USAGE);
		createEAttribute(usageEClass, USAGE__IS_NATIVE);

		groupUsageEClass = createEClass(GROUP_USAGE);

		dataItemEClass = createEClass(DATA_ITEM);
		createEAttribute(dataItemEClass, DATA_ITEM__LEVEL_NUMBER);
		createEReference(dataItemEClass, DATA_ITEM__ATTRIBUTES);
		createEReference(dataItemEClass, DATA_ITEM__SUBENTRIES);
		createEReference(dataItemEClass, DATA_ITEM__SUPERENTRY);

		recordNameEClass = createEClass(RECORD_NAME);
		createEReference(recordNameEClass, RECORD_NAME__ELEMS);

		dataNameEClass = createEClass(DATA_NAME);

		redefinesEClass = createEClass(REDEFINES);
		createEReference(redefinesEClass, REDEFINES__DATA_NAME);

		// Create enums
		usagesEEnum = createEEnum(USAGES);
		pictureStringCharactersEEnum = createEEnum(PICTURE_STRING_CHARACTERS);
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
		ArithmeticsPackage theArithmeticsPackage = (ArithmeticsPackage)EPackage.Registry.INSTANCE.getEPackage(ArithmeticsPackage.eNS_URI);
		ConditionsPackage theConditionsPackage = (ConditionsPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionsPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		WaterPackage theWaterPackage = (WaterPackage)EPackage.Registry.INSTANCE.getEPackage(WaterPackage.eNS_URI);
		IdentifiersPackage theIdentifiersPackage = (IdentifiersPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifiersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pictureStringEClass.getESuperTypes().add(this.getDataItemAttribute());
		renamingDataNameEClass.getESuperTypes().add(this.getDataName());
		conditionNameEClass.getESuperTypes().add(this.getDataItem());
		globalEClass.getESuperTypes().add(this.getDataItemAttribute());
		externalEClass.getESuperTypes().add(this.getDataItemAttribute());
		valueEClass.getESuperTypes().add(this.getDataItemAttribute());
		usageEClass.getESuperTypes().add(this.getDataItemAttribute());
		groupUsageEClass.getESuperTypes().add(this.getDataItemAttribute());
		dataItemEClass.getESuperTypes().add(theReferencesPackage.getReferenceableElement());
		dataItemEClass.getESuperTypes().add(theWaterPackage.getIncompleteElement());
		recordNameEClass.getESuperTypes().add(this.getDataItem());
		dataNameEClass.getESuperTypes().add(this.getDataItem());
		redefinesEClass.getESuperTypes().add(this.getDataItemAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(pictureStringEClass, PictureString.class, "PictureString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPictureString_Picture(), ecorePackage.getEString(), "picture", null, 1, 1, PictureString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renamingDataNameEClass, RenamingDataName.class, "RenamingDataName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenamingDataName_NameRange(), theArithmeticsPackage.getRangeExpression(), null, "nameRange", null, 1, 1, RenamingDataName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionNameEClass, ConditionName.class, "ConditionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalEClass, Global.class, "Global", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalEClass, External.class, "External", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_Values(), theConditionsPackage.getCondition(), null, "values", null, 1, -1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataItemAttributeEClass, DataItemAttribute.class, "DataItemAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsage_Usage(), this.getUsages(), "usage", null, 1, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsage_IsNative(), ecorePackage.getEBoolean(), "isNative", null, 1, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupUsageEClass, GroupUsage.class, "GroupUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataItemEClass, DataItem.class, "DataItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataItem_LevelNumber(), ecorePackage.getEString(), "levelNumber", null, 1, 1, DataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataItem_Attributes(), this.getDataItemAttribute(), null, "attributes", null, 0, -1, DataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataItem_Subentries(), this.getDataItem(), this.getDataItem_Superentry(), "subentries", null, 0, -1, DataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataItem_Superentry(), this.getDataItem(), this.getDataItem_Subentries(), "superentry", null, 0, 1, DataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordNameEClass, RecordName.class, "RecordName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordName_Elems(), this.getDataItem(), null, "elems", null, 1, -1, RecordName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataNameEClass, DataName.class, "DataName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(redefinesEClass, Redefines.class, "Redefines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedefines_DataName(), theIdentifiersPackage.getIdentifierReference(), null, "dataName", null, 1, 1, Redefines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(usagesEEnum, Usages.class, "Usages");
		addEEnumLiteral(usagesEEnum, Usages.BINARY);
		addEEnumLiteral(usagesEEnum, Usages.COMPUTATIONAL);
		addEEnumLiteral(usagesEEnum, Usages.COMP);
		addEEnumLiteral(usagesEEnum, Usages.DISPLAY);
		addEEnumLiteral(usagesEEnum, Usages.DISPLAY1);
		addEEnumLiteral(usagesEEnum, Usages.INDEX);
		addEEnumLiteral(usagesEEnum, Usages.PACKED_DECIMAL);
		addEEnumLiteral(usagesEEnum, Usages.COMPUTATIONAL1);
		addEEnumLiteral(usagesEEnum, Usages.COMP1);
		addEEnumLiteral(usagesEEnum, Usages.COMPUTATIONAL2);
		addEEnumLiteral(usagesEEnum, Usages.COMP2);
		addEEnumLiteral(usagesEEnum, Usages.COMPUTATIONAL3);
		addEEnumLiteral(usagesEEnum, Usages.COMP3);
		addEEnumLiteral(usagesEEnum, Usages.COMPUTATIONAL4);
		addEEnumLiteral(usagesEEnum, Usages.COMP4);
		addEEnumLiteral(usagesEEnum, Usages.COMPUTATIONAL5);
		addEEnumLiteral(usagesEEnum, Usages.COMP5);
		addEEnumLiteral(usagesEEnum, Usages.POINTER);
		addEEnumLiteral(usagesEEnum, Usages.PROCEDURE_POINTER);
		addEEnumLiteral(usagesEEnum, Usages.FUNCTION_POINTER);
		addEEnumLiteral(usagesEEnum, Usages.NATIONAL);

		initEEnum(pictureStringCharactersEEnum, PictureStringCharacters.class, "PictureStringCharacters");
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.ANY);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.BLANK);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.SIGN);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.LEADING_ZERO);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.DECIMAL_POINT);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.NUMERIC);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.ASSUMED_DECIMAL_POINT);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.ALPHABETIC);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.NATIONAL);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.CREDIT);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.DEBIT);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.ZERO);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.PLUS);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.NEGATIVE);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.EXPONENT);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.PERIOD);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.COMMA);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.DOLLAR);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.ASTERIK);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.SLASH);
		addEEnumLiteral(pictureStringCharactersEEnum, PictureStringCharacters.ESCAPE);
	}

} //DataitemsPackageImpl
