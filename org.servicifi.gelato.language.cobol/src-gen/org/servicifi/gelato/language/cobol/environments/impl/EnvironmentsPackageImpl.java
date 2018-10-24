/**
 */
package org.servicifi.gelato.language.cobol.environments.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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

import org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage;

import org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl;

import org.servicifi.gelato.language.cobol.declaratives.DeclarativesPackage;

import org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesPackageImpl;

import org.servicifi.gelato.language.cobol.divisions.DivisionsPackage;

import org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl;

import org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting;
import org.servicifi.gelato.language.cobol.environments.Channel;
import org.servicifi.gelato.language.cobol.environments.Channels;
import org.servicifi.gelato.language.cobol.environments.Console;
import org.servicifi.gelato.language.cobol.environments.Environment;
import org.servicifi.gelato.language.cobol.environments.EnvironmentsFactory;
import org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage;
import org.servicifi.gelato.language.cobol.environments.Pocket;
import org.servicifi.gelato.language.cobol.environments.Selects;
import org.servicifi.gelato.language.cobol.environments.SuppressSpacing;
import org.servicifi.gelato.language.cobol.environments.SystemDevice;
import org.servicifi.gelato.language.cobol.environments.SystemInputs;
import org.servicifi.gelato.language.cobol.environments.SystemLogicalInput;
import org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput;
import org.servicifi.gelato.language.cobol.environments.SystemOutputs;
import org.servicifi.gelato.language.cobol.environments.SystemPunchDevice;
import org.servicifi.gelato.language.cobol.environments.SystemPunchDevices;
import org.servicifi.gelato.language.cobol.environments.UPSISwitches;

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
public class EnvironmentsPackageImpl extends EPackageImpl implements EnvironmentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemLogicalInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upsiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemLogicalOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemPunchDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advancedFunctionPrintingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suppressSpacingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pocketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum upsiSwitchesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemInputsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemOutputsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemPunchDevicesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectsEEnum = null;

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
	 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnvironmentsPackageImpl() {
		super(eNS_URI, EnvironmentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnvironmentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnvironmentsPackage init() {
		if (isInited) return (EnvironmentsPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentsPackage.eNS_URI);

		// Obtain or create and register package
		EnvironmentsPackageImpl theEnvironmentsPackage = (EnvironmentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnvironmentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnvironmentsPackageImpl());

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
		theEnvironmentsPackage.createPackageContents();
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
		theEnvironmentsPackage.initializePackageContents();
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
		theEnvironmentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnvironmentsPackage.eNS_URI, theEnvironmentsPackage);
		return theEnvironmentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemDevice() {
		return systemDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemLogicalInput() {
		return systemLogicalInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemLogicalInput_Value() {
		return (EAttribute)systemLogicalInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUPSI() {
		return upsiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUPSI_Value() {
		return (EAttribute)upsiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemLogicalOutput() {
		return systemLogicalOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemLogicalOutput_Value() {
		return (EAttribute)systemLogicalOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemPunchDevice() {
		return systemPunchDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemPunchDevice_Value() {
		return (EAttribute)systemPunchDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsole() {
		return consoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Value() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvancedFunctionPrinting() {
		return advancedFunctionPrintingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuppressSpacing() {
		return suppressSpacingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPocket() {
		return pocketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPocket_Value() {
		return (EAttribute)pocketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUPSISwitches() {
		return upsiSwitchesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannels() {
		return channelsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemInputs() {
		return systemInputsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemOutputs() {
		return systemOutputsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemPunchDevices() {
		return systemPunchDevicesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelects() {
		return selectsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentsFactory getEnvironmentsFactory() {
		return (EnvironmentsFactory)getEFactoryInstance();
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
		systemDeviceEClass = createEClass(SYSTEM_DEVICE);

		systemLogicalInputEClass = createEClass(SYSTEM_LOGICAL_INPUT);
		createEAttribute(systemLogicalInputEClass, SYSTEM_LOGICAL_INPUT__VALUE);

		upsiEClass = createEClass(UPSI);
		createEAttribute(upsiEClass, UPSI__VALUE);

		systemLogicalOutputEClass = createEClass(SYSTEM_LOGICAL_OUTPUT);
		createEAttribute(systemLogicalOutputEClass, SYSTEM_LOGICAL_OUTPUT__VALUE);

		systemPunchDeviceEClass = createEClass(SYSTEM_PUNCH_DEVICE);
		createEAttribute(systemPunchDeviceEClass, SYSTEM_PUNCH_DEVICE__VALUE);

		consoleEClass = createEClass(CONSOLE);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__VALUE);

		advancedFunctionPrintingEClass = createEClass(ADVANCED_FUNCTION_PRINTING);

		suppressSpacingEClass = createEClass(SUPPRESS_SPACING);

		pocketEClass = createEClass(POCKET);
		createEAttribute(pocketEClass, POCKET__VALUE);

		environmentEClass = createEClass(ENVIRONMENT);

		// Create enums
		upsiSwitchesEEnum = createEEnum(UPSI_SWITCHES);
		channelsEEnum = createEEnum(CHANNELS);
		systemInputsEEnum = createEEnum(SYSTEM_INPUTS);
		systemOutputsEEnum = createEEnum(SYSTEM_OUTPUTS);
		systemPunchDevicesEEnum = createEEnum(SYSTEM_PUNCH_DEVICES);
		selectsEEnum = createEEnum(SELECTS);
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
		WaterPackage theWaterPackage = (WaterPackage)EPackage.Registry.INSTANCE.getEPackage(WaterPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemDeviceEClass.getESuperTypes().add(this.getEnvironment());
		systemLogicalInputEClass.getESuperTypes().add(this.getSystemDevice());
		upsiEClass.getESuperTypes().add(this.getEnvironment());
		systemLogicalOutputEClass.getESuperTypes().add(this.getSystemDevice());
		systemPunchDeviceEClass.getESuperTypes().add(this.getSystemDevice());
		consoleEClass.getESuperTypes().add(this.getSystemDevice());
		channelEClass.getESuperTypes().add(this.getSystemDevice());
		advancedFunctionPrintingEClass.getESuperTypes().add(this.getSystemDevice());
		suppressSpacingEClass.getESuperTypes().add(this.getSystemDevice());
		pocketEClass.getESuperTypes().add(this.getSystemDevice());
		environmentEClass.getESuperTypes().add(theWaterPackage.getAcceptStatementWater());

		// Initialize classes and features; add operations and parameters
		initEClass(systemDeviceEClass, SystemDevice.class, "SystemDevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemLogicalInputEClass, SystemLogicalInput.class, "SystemLogicalInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemLogicalInput_Value(), this.getSystemInputs(), "value", null, 1, 1, SystemLogicalInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upsiEClass, org.servicifi.gelato.language.cobol.environments.UPSI.class, "UPSI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUPSI_Value(), this.getUPSISwitches(), "value", null, 1, 1, org.servicifi.gelato.language.cobol.environments.UPSI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemLogicalOutputEClass, SystemLogicalOutput.class, "SystemLogicalOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemLogicalOutput_Value(), this.getSystemOutputs(), "value", null, 1, 1, SystemLogicalOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemPunchDeviceEClass, SystemPunchDevice.class, "SystemPunchDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemPunchDevice_Value(), this.getSystemPunchDevices(), "value", null, 1, 1, SystemPunchDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consoleEClass, Console.class, "Console", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_Value(), this.getChannels(), "value", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advancedFunctionPrintingEClass, AdvancedFunctionPrinting.class, "AdvancedFunctionPrinting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suppressSpacingEClass, SuppressSpacing.class, "SuppressSpacing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pocketEClass, Pocket.class, "Pocket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPocket_Value(), this.getSelects(), "value", null, 1, 1, Pocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(upsiSwitchesEEnum, UPSISwitches.class, "UPSISwitches");
		addEEnumLiteral(upsiSwitchesEEnum, UPSISwitches.UPSI0);
		addEEnumLiteral(upsiSwitchesEEnum, UPSISwitches.UPSI1);
		addEEnumLiteral(upsiSwitchesEEnum, UPSISwitches.UPSI2);
		addEEnumLiteral(upsiSwitchesEEnum, UPSISwitches.UPSI3);
		addEEnumLiteral(upsiSwitchesEEnum, UPSISwitches.UPSI4);
		addEEnumLiteral(upsiSwitchesEEnum, UPSISwitches.UPSI5);
		addEEnumLiteral(upsiSwitchesEEnum, UPSISwitches.UPSI6);
		addEEnumLiteral(upsiSwitchesEEnum, UPSISwitches.UPSI7);

		initEEnum(channelsEEnum, Channels.class, "Channels");
		addEEnumLiteral(channelsEEnum, Channels.C1);
		addEEnumLiteral(channelsEEnum, Channels.C2);
		addEEnumLiteral(channelsEEnum, Channels.C3);
		addEEnumLiteral(channelsEEnum, Channels.C4);
		addEEnumLiteral(channelsEEnum, Channels.C5);
		addEEnumLiteral(channelsEEnum, Channels.C6);
		addEEnumLiteral(channelsEEnum, Channels.C7);
		addEEnumLiteral(channelsEEnum, Channels.C8);
		addEEnumLiteral(channelsEEnum, Channels.C9);
		addEEnumLiteral(channelsEEnum, Channels.C10);
		addEEnumLiteral(channelsEEnum, Channels.C11);
		addEEnumLiteral(channelsEEnum, Channels.C12);

		initEEnum(systemInputsEEnum, SystemInputs.class, "SystemInputs");
		addEEnumLiteral(systemInputsEEnum, SystemInputs.SYSIN);
		addEEnumLiteral(systemInputsEEnum, SystemInputs.SYSIPT);

		initEEnum(systemOutputsEEnum, SystemOutputs.class, "SystemOutputs");
		addEEnumLiteral(systemOutputsEEnum, SystemOutputs.SYSOUT);
		addEEnumLiteral(systemOutputsEEnum, SystemOutputs.SYSLIST);
		addEEnumLiteral(systemOutputsEEnum, SystemOutputs.SYSLST);

		initEEnum(systemPunchDevicesEEnum, SystemPunchDevices.class, "SystemPunchDevices");
		addEEnumLiteral(systemPunchDevicesEEnum, SystemPunchDevices.SYSPUNCH);
		addEEnumLiteral(systemPunchDevicesEEnum, SystemPunchDevices.SYSPCH);

		initEEnum(selectsEEnum, Selects.class, "Selects");
		addEEnumLiteral(selectsEEnum, Selects.S1);
		addEEnumLiteral(selectsEEnum, Selects.S2);
		addEEnumLiteral(selectsEEnum, Selects.S3);
		addEEnumLiteral(selectsEEnum, Selects.S4);
		addEEnumLiteral(selectsEEnum, Selects.S5);
	}

} //EnvironmentsPackageImpl
