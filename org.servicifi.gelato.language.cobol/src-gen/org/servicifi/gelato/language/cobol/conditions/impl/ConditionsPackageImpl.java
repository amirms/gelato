/**
 */
package org.servicifi.gelato.language.cobol.conditions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.servicifi.gelato.language.cobol.CobolPackage;

import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage;

import org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl;

import org.servicifi.gelato.language.cobol.commons.CommonsPackage;

import org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl;

import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ClassCondition;
import org.servicifi.gelato.language.cobol.conditions.Condition;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionsFactory;
import org.servicifi.gelato.language.cobol.conditions.ConditionsPackage;
import org.servicifi.gelato.language.cobol.conditions.ExpressionList;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.NestedCondition;
import org.servicifi.gelato.language.cobol.conditions.RelationalExpression;
import org.servicifi.gelato.language.cobol.conditions.SignCondition;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;

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
public class ConditionsPackageImpl extends EPackageImpl implements ConditionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOrExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatedConditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatedConditionalExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleConditionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalAndExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalAndExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abbreviatedConditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abbreviatedConditionalExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatedAbbreviatedConditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatedAbbreviatedConditionalExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abbreviatedRelationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedAbbreviatedConditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abbreviatedRelationalExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedConditionEClass = null;

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
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConditionsPackageImpl() {
		super(eNS_URI, ConditionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConditionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConditionsPackage init() {
		if (isInited) return (ConditionsPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionsPackage.eNS_URI);

		// Obtain or create and register package
		ConditionsPackageImpl theConditionsPackage = (ConditionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConditionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConditionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CobolPackageImpl theCobolPackage = (CobolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CobolPackage.eNS_URI) instanceof CobolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CobolPackage.eNS_URI) : CobolPackage.eINSTANCE);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
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
		theConditionsPackage.createPackageContents();
		theCobolPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
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
		theConditionsPackage.initializePackageContents();
		theCobolPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
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
		theConditionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConditionsPackage.eNS_URI, theConditionsPackage);
		return theConditionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalOrExpression() {
		return conditionalOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalOrExpression_Children() {
		return (EReference)conditionalOrExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalOrExpression_LogicalOperators() {
		return (EReference)conditionalOrExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalOrExpressionChild() {
		return conditionalOrExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegatedConditionalExpression() {
		return negatedConditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegatedConditionalExpression_Child() {
		return (EReference)negatedConditionalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegatedConditionalExpression_NegateOperator() {
		return (EReference)negatedConditionalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegatedConditionalExpressionChild() {
		return negatedConditionalExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleConditionChild() {
		return simpleConditionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_Children() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_RelationalOperator() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_NegateOperator() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_Is() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionList() {
		return expressionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionList_Expressions() {
		return (EReference)expressionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalAndExpressionChild() {
		return conditionalAndExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalAndExpression() {
		return conditionalAndExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAndExpression_Children() {
		return (EReference)conditionalAndExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbbreviatedConditionalExpression() {
		return abbreviatedConditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbbreviatedConditionalExpression_Children() {
		return (EReference)abbreviatedConditionalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbbreviatedConditionalExpressionChild() {
		return abbreviatedConditionalExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegatedAbbreviatedConditionalExpression() {
		return negatedAbbreviatedConditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegatedAbbreviatedConditionalExpression_Child() {
		return (EReference)negatedAbbreviatedConditionalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegatedAbbreviatedConditionalExpression_NegateOperator() {
		return (EReference)negatedAbbreviatedConditionalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegatedAbbreviatedConditionalExpressionChild() {
		return negatedAbbreviatedConditionalExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbbreviatedRelationalExpression() {
		return abbreviatedRelationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbbreviatedRelationalExpression_RelationalOperator() {
		return (EReference)abbreviatedRelationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbbreviatedRelationalExpression_Child() {
		return (EReference)abbreviatedRelationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbbreviatedRelationalExpression_NegateOperator() {
		return (EReference)abbreviatedRelationalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbbreviatedRelationalExpression_Is() {
		return (EReference)abbreviatedRelationalExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedAbbreviatedConditionalExpression() {
		return nestedAbbreviatedConditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedAbbreviatedConditionalExpression_Expression() {
		return (EReference)nestedAbbreviatedConditionalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedAbbreviatedConditionalExpression_Rest() {
		return (EReference)nestedAbbreviatedConditionalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignCondition() {
		return signConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignCondition_Child() {
		return (EReference)signConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignCondition_SignOperator() {
		return (EReference)signConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignCondition_NegateOperator() {
		return (EReference)signConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignCondition_Is() {
		return (EReference)signConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassCondition() {
		return classConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassCondition_Child() {
		return (EReference)classConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassCondition_ClassOperator() {
		return (EReference)classConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassCondition_NegateOperator() {
		return (EReference)classConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassCondition_Is() {
		return (EReference)classConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbbreviatedRelationalExpressionChild() {
		return abbreviatedRelationalExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedCondition() {
		return nestedConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedCondition_Condition() {
		return (EReference)nestedConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsFactory getConditionsFactory() {
		return (ConditionsFactory)getEFactoryInstance();
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
		conditionEClass = createEClass(CONDITION);

		conditionalOrExpressionEClass = createEClass(CONDITIONAL_OR_EXPRESSION);
		createEReference(conditionalOrExpressionEClass, CONDITIONAL_OR_EXPRESSION__CHILDREN);
		createEReference(conditionalOrExpressionEClass, CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS);

		conditionalOrExpressionChildEClass = createEClass(CONDITIONAL_OR_EXPRESSION_CHILD);

		negatedConditionalExpressionEClass = createEClass(NEGATED_CONDITIONAL_EXPRESSION);
		createEReference(negatedConditionalExpressionEClass, NEGATED_CONDITIONAL_EXPRESSION__CHILD);
		createEReference(negatedConditionalExpressionEClass, NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR);

		negatedConditionalExpressionChildEClass = createEClass(NEGATED_CONDITIONAL_EXPRESSION_CHILD);

		simpleConditionChildEClass = createEClass(SIMPLE_CONDITION_CHILD);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__CHILDREN);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__NEGATE_OPERATOR);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__IS);

		expressionListEClass = createEClass(EXPRESSION_LIST);
		createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSIONS);

		conditionalAndExpressionChildEClass = createEClass(CONDITIONAL_AND_EXPRESSION_CHILD);

		conditionalAndExpressionEClass = createEClass(CONDITIONAL_AND_EXPRESSION);
		createEReference(conditionalAndExpressionEClass, CONDITIONAL_AND_EXPRESSION__CHILDREN);

		abbreviatedConditionalExpressionEClass = createEClass(ABBREVIATED_CONDITIONAL_EXPRESSION);
		createEReference(abbreviatedConditionalExpressionEClass, ABBREVIATED_CONDITIONAL_EXPRESSION__CHILDREN);

		abbreviatedConditionalExpressionChildEClass = createEClass(ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD);

		negatedAbbreviatedConditionalExpressionEClass = createEClass(NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION);
		createEReference(negatedAbbreviatedConditionalExpressionEClass, NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__CHILD);
		createEReference(negatedAbbreviatedConditionalExpressionEClass, NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR);

		negatedAbbreviatedConditionalExpressionChildEClass = createEClass(NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD);

		abbreviatedRelationalExpressionEClass = createEClass(ABBREVIATED_RELATIONAL_EXPRESSION);
		createEReference(abbreviatedRelationalExpressionEClass, ABBREVIATED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR);
		createEReference(abbreviatedRelationalExpressionEClass, ABBREVIATED_RELATIONAL_EXPRESSION__CHILD);
		createEReference(abbreviatedRelationalExpressionEClass, ABBREVIATED_RELATIONAL_EXPRESSION__NEGATE_OPERATOR);
		createEReference(abbreviatedRelationalExpressionEClass, ABBREVIATED_RELATIONAL_EXPRESSION__IS);

		nestedAbbreviatedConditionalExpressionEClass = createEClass(NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION);
		createEReference(nestedAbbreviatedConditionalExpressionEClass, NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION);
		createEReference(nestedAbbreviatedConditionalExpressionEClass, NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST);

		signConditionEClass = createEClass(SIGN_CONDITION);
		createEReference(signConditionEClass, SIGN_CONDITION__CHILD);
		createEReference(signConditionEClass, SIGN_CONDITION__SIGN_OPERATOR);
		createEReference(signConditionEClass, SIGN_CONDITION__NEGATE_OPERATOR);
		createEReference(signConditionEClass, SIGN_CONDITION__IS);

		classConditionEClass = createEClass(CLASS_CONDITION);
		createEReference(classConditionEClass, CLASS_CONDITION__CHILD);
		createEReference(classConditionEClass, CLASS_CONDITION__CLASS_OPERATOR);
		createEReference(classConditionEClass, CLASS_CONDITION__NEGATE_OPERATOR);
		createEReference(classConditionEClass, CLASS_CONDITION__IS);

		abbreviatedRelationalExpressionChildEClass = createEClass(ABBREVIATED_RELATIONAL_EXPRESSION_CHILD);

		nestedConditionEClass = createEClass(NESTED_CONDITION);
		createEReference(nestedConditionEClass, NESTED_CONDITION__CONDITION);
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
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		VerbsPackage theVerbsPackage = (VerbsPackage)EPackage.Registry.INSTANCE.getEPackage(VerbsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conditionalOrExpressionEClass.getESuperTypes().add(this.getCondition());
		conditionalOrExpressionChildEClass.getESuperTypes().add(this.getCondition());
		negatedConditionalExpressionEClass.getESuperTypes().add(this.getConditionalAndExpressionChild());
		negatedConditionalExpressionChildEClass.getESuperTypes().add(this.getConditionalAndExpressionChild());
		simpleConditionChildEClass.getESuperTypes().add(this.getNegatedConditionalExpressionChild());
		relationalExpressionEClass.getESuperTypes().add(this.getNegatedConditionalExpressionChild());
		conditionalAndExpressionChildEClass.getESuperTypes().add(this.getConditionalOrExpressionChild());
		conditionalAndExpressionEClass.getESuperTypes().add(this.getConditionalOrExpressionChild());
		abbreviatedConditionalExpressionEClass.getESuperTypes().add(this.getConditionalAndExpressionChild());
		abbreviatedConditionalExpressionChildEClass.getESuperTypes().add(this.getConditionalAndExpressionChild());
		negatedAbbreviatedConditionalExpressionEClass.getESuperTypes().add(this.getAbbreviatedConditionalExpressionChild());
		negatedAbbreviatedConditionalExpressionChildEClass.getESuperTypes().add(this.getAbbreviatedConditionalExpressionChild());
		abbreviatedRelationalExpressionEClass.getESuperTypes().add(this.getNegatedAbbreviatedConditionalExpressionChild());
		nestedAbbreviatedConditionalExpressionEClass.getESuperTypes().add(this.getAbbreviatedRelationalExpressionChild());
		signConditionEClass.getESuperTypes().add(this.getNegatedConditionalExpressionChild());
		classConditionEClass.getESuperTypes().add(this.getNegatedConditionalExpressionChild());
		abbreviatedRelationalExpressionChildEClass.getESuperTypes().add(this.getNegatedAbbreviatedConditionalExpressionChild());
		nestedConditionEClass.getESuperTypes().add(this.getSimpleConditionChild());

		// Initialize classes and features; add operations and parameters
		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalOrExpressionEClass, ConditionalOrExpression.class, "ConditionalOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalOrExpression_Children(), this.getConditionalOrExpressionChild(), null, "children", null, 0, -1, ConditionalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalOrExpression_LogicalOperators(), theOperatorsPackage.getLogicalOperator(), null, "logicalOperators", null, 1, -1, ConditionalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalOrExpressionChildEClass, ConditionalOrExpressionChild.class, "ConditionalOrExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negatedConditionalExpressionEClass, NegatedConditionalExpression.class, "NegatedConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegatedConditionalExpression_Child(), this.getNegatedConditionalExpressionChild(), null, "child", null, 1, 1, NegatedConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegatedConditionalExpression_NegateOperator(), theOperatorsPackage.getNegate(), null, "negateOperator", null, 1, 1, NegatedConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negatedConditionalExpressionChildEClass, NegatedConditionalExpressionChild.class, "NegatedConditionalExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleConditionChildEClass, SimpleConditionChild.class, "SimpleConditionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalExpression_Children(), this.getSimpleConditionChild(), null, "children", null, 1, -1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_RelationalOperator(), theOperatorsPackage.getRelationalOperator(), null, "relationalOperator", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_NegateOperator(), theOperatorsPackage.getNegate(), null, "negateOperator", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_Is(), theVerbsPackage.getIs(), null, "is", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionList_Expressions(), this.getCondition(), null, "expressions", null, 1, -1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalAndExpressionChildEClass, ConditionalAndExpressionChild.class, "ConditionalAndExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalAndExpressionEClass, ConditionalAndExpression.class, "ConditionalAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalAndExpression_Children(), this.getConditionalAndExpressionChild(), null, "children", null, 1, -1, ConditionalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abbreviatedConditionalExpressionEClass, AbbreviatedConditionalExpression.class, "AbbreviatedConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbbreviatedConditionalExpression_Children(), this.getAbbreviatedConditionalExpressionChild(), null, "children", null, 1, -1, AbbreviatedConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abbreviatedConditionalExpressionChildEClass, AbbreviatedConditionalExpressionChild.class, "AbbreviatedConditionalExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negatedAbbreviatedConditionalExpressionEClass, NegatedAbbreviatedConditionalExpression.class, "NegatedAbbreviatedConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegatedAbbreviatedConditionalExpression_Child(), this.getNegatedAbbreviatedConditionalExpressionChild(), null, "child", null, 1, 1, NegatedAbbreviatedConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegatedAbbreviatedConditionalExpression_NegateOperator(), theOperatorsPackage.getNegate(), null, "negateOperator", null, 1, 1, NegatedAbbreviatedConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negatedAbbreviatedConditionalExpressionChildEClass, NegatedAbbreviatedConditionalExpressionChild.class, "NegatedAbbreviatedConditionalExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abbreviatedRelationalExpressionEClass, AbbreviatedRelationalExpression.class, "AbbreviatedRelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbbreviatedRelationalExpression_RelationalOperator(), theOperatorsPackage.getRelationalOperator(), null, "relationalOperator", null, 1, 1, AbbreviatedRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbbreviatedRelationalExpression_Child(), this.getAbbreviatedRelationalExpressionChild(), null, "child", null, 1, 1, AbbreviatedRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbbreviatedRelationalExpression_NegateOperator(), theOperatorsPackage.getNegate(), null, "negateOperator", null, 1, 1, AbbreviatedRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbbreviatedRelationalExpression_Is(), theVerbsPackage.getIs(), null, "is", null, 1, 1, AbbreviatedRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedAbbreviatedConditionalExpressionEClass, NestedAbbreviatedConditionalExpression.class, "NestedAbbreviatedConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedAbbreviatedConditionalExpression_Expression(), this.getCondition(), null, "expression", null, 1, 1, NestedAbbreviatedConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNestedAbbreviatedConditionalExpression_Rest(), this.getCondition(), null, "rest", null, 1, 1, NestedAbbreviatedConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signConditionEClass, SignCondition.class, "SignCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignCondition_Child(), this.getSimpleConditionChild(), null, "child", null, 1, 1, SignCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignCondition_SignOperator(), theOperatorsPackage.getSignOperator(), null, "signOperator", null, 1, 1, SignCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignCondition_NegateOperator(), theOperatorsPackage.getNegate(), null, "negateOperator", null, 1, 1, SignCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignCondition_Is(), theVerbsPackage.getIs(), null, "is", null, 1, 1, SignCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classConditionEClass, ClassCondition.class, "ClassCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassCondition_Child(), this.getSimpleConditionChild(), null, "child", null, 1, 1, ClassCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassCondition_ClassOperator(), theOperatorsPackage.getClassOperator(), null, "classOperator", null, 1, 1, ClassCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassCondition_NegateOperator(), theOperatorsPackage.getNegate(), null, "negateOperator", null, 1, 1, ClassCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassCondition_Is(), theVerbsPackage.getIs(), null, "is", null, 1, 1, ClassCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abbreviatedRelationalExpressionChildEClass, AbbreviatedRelationalExpressionChild.class, "AbbreviatedRelationalExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nestedConditionEClass, NestedCondition.class, "NestedCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedCondition_Condition(), this.getCondition(), null, "condition", null, 1, 1, NestedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ConditionsPackageImpl
