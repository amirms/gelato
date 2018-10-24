/**
 */
package org.servicifi.gelato.language.cobol.operators.impl;

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

import org.servicifi.gelato.language.cobol.operators.Addition;
import org.servicifi.gelato.language.cobol.operators.AdditiveOperator;
import org.servicifi.gelato.language.cobol.operators.Alphabetic;
import org.servicifi.gelato.language.cobol.operators.AlphabeticLower;
import org.servicifi.gelato.language.cobol.operators.AlphabeticUpper;
import org.servicifi.gelato.language.cobol.operators.ClassName;
import org.servicifi.gelato.language.cobol.operators.ClassOperator;
import org.servicifi.gelato.language.cobol.operators.ConditionAnd;
import org.servicifi.gelato.language.cobol.operators.ConditionOr;
import org.servicifi.gelato.language.cobol.operators.Division;
import org.servicifi.gelato.language.cobol.operators.Equal;
import org.servicifi.gelato.language.cobol.operators.EqualPhrase;
import org.servicifi.gelato.language.cobol.operators.EqualSign;
import org.servicifi.gelato.language.cobol.operators.GTEQPhrase;
import org.servicifi.gelato.language.cobol.operators.GTEQSign;
import org.servicifi.gelato.language.cobol.operators.GTPhrase;
import org.servicifi.gelato.language.cobol.operators.GTSign;
import org.servicifi.gelato.language.cobol.operators.GreaterThan;
import org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual;
import org.servicifi.gelato.language.cobol.operators.Kanji;
import org.servicifi.gelato.language.cobol.operators.LTEQPhrase;
import org.servicifi.gelato.language.cobol.operators.LTEQSign;
import org.servicifi.gelato.language.cobol.operators.LTPhrase;
import org.servicifi.gelato.language.cobol.operators.LTSign;
import org.servicifi.gelato.language.cobol.operators.LessThan;
import org.servicifi.gelato.language.cobol.operators.LessThanOrEqual;
import org.servicifi.gelato.language.cobol.operators.LogicalOperator;
import org.servicifi.gelato.language.cobol.operators.Multiplication;
import org.servicifi.gelato.language.cobol.operators.MultiplicativeOperator;
import org.servicifi.gelato.language.cobol.operators.Negate;
import org.servicifi.gelato.language.cobol.operators.Negative;
import org.servicifi.gelato.language.cobol.operators.Numeric;
import org.servicifi.gelato.language.cobol.operators.Operator;
import org.servicifi.gelato.language.cobol.operators.OperatorsFactory;
import org.servicifi.gelato.language.cobol.operators.OperatorsPackage;
import org.servicifi.gelato.language.cobol.operators.Positive;
import org.servicifi.gelato.language.cobol.operators.Power;
import org.servicifi.gelato.language.cobol.operators.RelationalOperator;
import org.servicifi.gelato.language.cobol.operators.SignOperator;
import org.servicifi.gelato.language.cobol.operators.Subtraction;
import org.servicifi.gelato.language.cobol.operators.Through;
import org.servicifi.gelato.language.cobol.operators.ThroughPhrase;
import org.servicifi.gelato.language.cobol.operators.UnaryOperator;
import org.servicifi.gelato.language.cobol.operators.Zero;

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
public class OperatorsPackageImpl extends EPackageImpl implements OperatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicativeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throughEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbcsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticUpperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticLowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kanjiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalSignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltSignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lteqPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lteqSignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtSignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gteqPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gteqSignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum throughPhraseEEnum = null;

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
	 * @see org.servicifi.gelato.language.cobol.operators.OperatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatorsPackageImpl() {
		super(eNS_URI, OperatorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OperatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperatorsPackage init() {
		if (isInited) return (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);

		// Obtain or create and register package
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatorsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CobolPackageImpl theCobolPackage = (CobolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CobolPackage.eNS_URI) instanceof CobolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CobolPackage.eNS_URI) : CobolPackage.eINSTANCE);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		ConditionsPackageImpl theConditionsPackage = (ConditionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionsPackage.eNS_URI) instanceof ConditionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionsPackage.eNS_URI) : ConditionsPackage.eINSTANCE);
		ArithmeticsPackageImpl theArithmeticsPackage = (ArithmeticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArithmeticsPackage.eNS_URI) instanceof ArithmeticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArithmeticsPackage.eNS_URI) : ArithmeticsPackage.eINSTANCE);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) : ContainersPackage.eINSTANCE);
		DivisionsPackageImpl theDivisionsPackage = (DivisionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DivisionsPackage.eNS_URI) instanceof DivisionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DivisionsPackage.eNS_URI) : DivisionsPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
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
		theOperatorsPackage.createPackageContents();
		theCobolPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theConditionsPackage.createPackageContents();
		theArithmeticsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theDivisionsPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
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
		theOperatorsPackage.initializePackageContents();
		theCobolPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theConditionsPackage.initializePackageContents();
		theArithmeticsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theDivisionsPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
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
		theOperatorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperatorsPackage.eNS_URI, theOperatorsPackage);
		return theOperatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditiveOperator() {
		return additiveOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicativeOperator() {
		return multiplicativeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperator() {
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalOperator() {
		return logicalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalOperator() {
		return relationalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionOr() {
		return conditionOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionAnd() {
		return conditionAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignOperator() {
		return signOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositive() {
		return positiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegative() {
		return negativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtraction() {
		return subtractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThanOrEqual() {
		return greaterThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGreaterThanOrEqual_Than() {
		return (EAttribute)greaterThanOrEqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGreaterThanOrEqual_To() {
		return (EAttribute)greaterThanOrEqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGreaterThan_Than() {
		return (EAttribute)greaterThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLessThan_Than() {
		return (EAttribute)lessThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThanOrEqual() {
		return lessThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLessThanOrEqual_Than() {
		return (EAttribute)lessThanOrEqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLessThanOrEqual_To() {
		return (EAttribute)lessThanOrEqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqual_To() {
		return (EAttribute)equalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPower() {
		return powerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegate() {
		return negateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrough() {
		return throughEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrough_Value() {
		return (EAttribute)throughEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassOperator() {
		return classOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZero() {
		return zeroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassName() {
		return classNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabetic() {
		return alphabeticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBCS() {
		return dbcsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumeric() {
		return numericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabeticUpper() {
		return alphabeticUpperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabeticLower() {
		return alphabeticLowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKanji() {
		return kanjiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualPhrase() {
		return equalPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualSign() {
		return equalSignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLTPhrase() {
		return ltPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLTSign() {
		return ltSignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLTEQPhrase() {
		return lteqPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLTEQSign() {
		return lteqSignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGTPhrase() {
		return gtPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGTSign() {
		return gtSignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGTEQPhrase() {
		return gteqPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGTEQSign() {
		return gteqSignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getThroughPhrase() {
		return throughPhraseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorsFactory getOperatorsFactory() {
		return (OperatorsFactory)getEFactoryInstance();
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
		operatorEClass = createEClass(OPERATOR);

		additiveOperatorEClass = createEClass(ADDITIVE_OPERATOR);

		multiplicativeOperatorEClass = createEClass(MULTIPLICATIVE_OPERATOR);

		unaryOperatorEClass = createEClass(UNARY_OPERATOR);

		logicalOperatorEClass = createEClass(LOGICAL_OPERATOR);

		relationalOperatorEClass = createEClass(RELATIONAL_OPERATOR);

		conditionOrEClass = createEClass(CONDITION_OR);

		conditionAndEClass = createEClass(CONDITION_AND);

		multiplicationEClass = createEClass(MULTIPLICATION);

		signOperatorEClass = createEClass(SIGN_OPERATOR);

		positiveEClass = createEClass(POSITIVE);

		negativeEClass = createEClass(NEGATIVE);

		divisionEClass = createEClass(DIVISION);

		additionEClass = createEClass(ADDITION);

		subtractionEClass = createEClass(SUBTRACTION);

		greaterThanOrEqualEClass = createEClass(GREATER_THAN_OR_EQUAL);
		createEAttribute(greaterThanOrEqualEClass, GREATER_THAN_OR_EQUAL__THAN);
		createEAttribute(greaterThanOrEqualEClass, GREATER_THAN_OR_EQUAL__TO);

		greaterThanEClass = createEClass(GREATER_THAN);
		createEAttribute(greaterThanEClass, GREATER_THAN__THAN);

		lessThanEClass = createEClass(LESS_THAN);
		createEAttribute(lessThanEClass, LESS_THAN__THAN);

		lessThanOrEqualEClass = createEClass(LESS_THAN_OR_EQUAL);
		createEAttribute(lessThanOrEqualEClass, LESS_THAN_OR_EQUAL__THAN);
		createEAttribute(lessThanOrEqualEClass, LESS_THAN_OR_EQUAL__TO);

		equalEClass = createEClass(EQUAL);
		createEAttribute(equalEClass, EQUAL__TO);

		powerEClass = createEClass(POWER);

		negateEClass = createEClass(NEGATE);

		throughEClass = createEClass(THROUGH);
		createEAttribute(throughEClass, THROUGH__VALUE);

		classOperatorEClass = createEClass(CLASS_OPERATOR);

		zeroEClass = createEClass(ZERO);

		classNameEClass = createEClass(CLASS_NAME);

		alphabeticEClass = createEClass(ALPHABETIC);

		dbcsEClass = createEClass(DBCS);

		numericEClass = createEClass(NUMERIC);

		alphabeticUpperEClass = createEClass(ALPHABETIC_UPPER);

		alphabeticLowerEClass = createEClass(ALPHABETIC_LOWER);

		kanjiEClass = createEClass(KANJI);

		equalPhraseEClass = createEClass(EQUAL_PHRASE);

		equalSignEClass = createEClass(EQUAL_SIGN);

		ltPhraseEClass = createEClass(LT_PHRASE);

		ltSignEClass = createEClass(LT_SIGN);

		lteqPhraseEClass = createEClass(LTEQ_PHRASE);

		lteqSignEClass = createEClass(LTEQ_SIGN);

		gtPhraseEClass = createEClass(GT_PHRASE);

		gtSignEClass = createEClass(GT_SIGN);

		gteqPhraseEClass = createEClass(GTEQ_PHRASE);

		gteqSignEClass = createEClass(GTEQ_SIGN);

		// Create enums
		throughPhraseEEnum = createEEnum(THROUGH_PHRASE);
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
		additiveOperatorEClass.getESuperTypes().add(this.getOperator());
		multiplicativeOperatorEClass.getESuperTypes().add(this.getOperator());
		unaryOperatorEClass.getESuperTypes().add(this.getOperator());
		logicalOperatorEClass.getESuperTypes().add(this.getOperator());
		relationalOperatorEClass.getESuperTypes().add(this.getOperator());
		conditionOrEClass.getESuperTypes().add(this.getLogicalOperator());
		conditionAndEClass.getESuperTypes().add(this.getLogicalOperator());
		multiplicationEClass.getESuperTypes().add(this.getMultiplicativeOperator());
		signOperatorEClass.getESuperTypes().add(this.getOperator());
		positiveEClass.getESuperTypes().add(this.getSignOperator());
		negativeEClass.getESuperTypes().add(this.getSignOperator());
		divisionEClass.getESuperTypes().add(this.getMultiplicativeOperator());
		additionEClass.getESuperTypes().add(this.getAdditiveOperator());
		additionEClass.getESuperTypes().add(this.getUnaryOperator());
		subtractionEClass.getESuperTypes().add(this.getAdditiveOperator());
		subtractionEClass.getESuperTypes().add(this.getUnaryOperator());
		greaterThanOrEqualEClass.getESuperTypes().add(this.getRelationalOperator());
		greaterThanEClass.getESuperTypes().add(this.getRelationalOperator());
		lessThanEClass.getESuperTypes().add(this.getRelationalOperator());
		lessThanOrEqualEClass.getESuperTypes().add(this.getRelationalOperator());
		equalEClass.getESuperTypes().add(this.getRelationalOperator());
		powerEClass.getESuperTypes().add(this.getOperator());
		negateEClass.getESuperTypes().add(this.getOperator());
		throughEClass.getESuperTypes().add(this.getOperator());
		classOperatorEClass.getESuperTypes().add(this.getOperator());
		zeroEClass.getESuperTypes().add(this.getSignOperator());
		classNameEClass.getESuperTypes().add(this.getClassOperator());
		alphabeticEClass.getESuperTypes().add(this.getClassOperator());
		dbcsEClass.getESuperTypes().add(this.getClassOperator());
		numericEClass.getESuperTypes().add(this.getClassOperator());
		alphabeticUpperEClass.getESuperTypes().add(this.getClassOperator());
		alphabeticLowerEClass.getESuperTypes().add(this.getClassOperator());
		kanjiEClass.getESuperTypes().add(this.getClassOperator());
		equalPhraseEClass.getESuperTypes().add(this.getEqual());
		equalSignEClass.getESuperTypes().add(this.getEqual());
		ltPhraseEClass.getESuperTypes().add(this.getLessThan());
		ltSignEClass.getESuperTypes().add(this.getLessThan());
		lteqPhraseEClass.getESuperTypes().add(this.getLessThanOrEqual());
		lteqSignEClass.getESuperTypes().add(this.getLessThanOrEqual());
		gtPhraseEClass.getESuperTypes().add(this.getGreaterThan());
		gtSignEClass.getESuperTypes().add(this.getGreaterThan());
		gteqPhraseEClass.getESuperTypes().add(this.getGreaterThanOrEqual());
		gteqSignEClass.getESuperTypes().add(this.getGreaterThanOrEqual());

		// Initialize classes and features; add operations and parameters
		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additiveOperatorEClass, AdditiveOperator.class, "AdditiveOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicativeOperatorEClass, MultiplicativeOperator.class, "MultiplicativeOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalOperatorEClass, LogicalOperator.class, "LogicalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalOperatorEClass, RelationalOperator.class, "RelationalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionOrEClass, ConditionOr.class, "ConditionOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionAndEClass, ConditionAnd.class, "ConditionAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signOperatorEClass, SignOperator.class, "SignOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveEClass, Positive.class, "Positive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeEClass, Negative.class, "Negative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractionEClass, Subtraction.class, "Subtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanOrEqualEClass, GreaterThanOrEqual.class, "GreaterThanOrEqual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGreaterThanOrEqual_Than(), ecorePackage.getEBoolean(), "than", null, 0, 1, GreaterThanOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGreaterThanOrEqual_To(), ecorePackage.getEBoolean(), "to", null, 0, 1, GreaterThanOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGreaterThan_Than(), ecorePackage.getEBoolean(), "than", null, 0, 1, GreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lessThanEClass, LessThan.class, "LessThan", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLessThan_Than(), ecorePackage.getEBoolean(), "than", null, 0, 1, LessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lessThanOrEqualEClass, LessThanOrEqual.class, "LessThanOrEqual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLessThanOrEqual_Than(), ecorePackage.getEBoolean(), "than", null, 0, 1, LessThanOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLessThanOrEqual_To(), ecorePackage.getEBoolean(), "to", null, 0, 1, LessThanOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalEClass, Equal.class, "Equal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEqual_To(), ecorePackage.getEBoolean(), "to", null, 0, 1, Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerEClass, Power.class, "Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negateEClass, Negate.class, "Negate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(throughEClass, Through.class, "Through", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrough_Value(), this.getThroughPhrase(), "value", null, 1, 1, Through.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classOperatorEClass, ClassOperator.class, "ClassOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zeroEClass, Zero.class, "Zero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classNameEClass, ClassName.class, "ClassName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alphabeticEClass, Alphabetic.class, "Alphabetic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dbcsEClass, org.servicifi.gelato.language.cobol.operators.DBCS.class, "DBCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericEClass, Numeric.class, "Numeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alphabeticUpperEClass, AlphabeticUpper.class, "AlphabeticUpper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alphabeticLowerEClass, AlphabeticLower.class, "AlphabeticLower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kanjiEClass, Kanji.class, "Kanji", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalPhraseEClass, EqualPhrase.class, "EqualPhrase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalSignEClass, EqualSign.class, "EqualSign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ltPhraseEClass, LTPhrase.class, "LTPhrase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ltSignEClass, LTSign.class, "LTSign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lteqPhraseEClass, LTEQPhrase.class, "LTEQPhrase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lteqSignEClass, LTEQSign.class, "LTEQSign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gtPhraseEClass, GTPhrase.class, "GTPhrase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gtSignEClass, GTSign.class, "GTSign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gteqPhraseEClass, GTEQPhrase.class, "GTEQPhrase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gteqSignEClass, GTEQSign.class, "GTEQSign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(throughPhraseEEnum, ThroughPhrase.class, "ThroughPhrase");
		addEEnumLiteral(throughPhraseEEnum, ThroughPhrase.THROUGH);
		addEEnumLiteral(throughPhraseEEnum, ThroughPhrase.THRU);
	}

} //OperatorsPackageImpl
