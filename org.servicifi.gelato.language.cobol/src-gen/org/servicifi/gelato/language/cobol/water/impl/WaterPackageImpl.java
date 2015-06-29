/**
 */
package org.servicifi.gelato.language.cobol.water.impl;

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

import org.servicifi.gelato.language.cobol.water.AcceptStatementToken;
import org.servicifi.gelato.language.cobol.water.AcceptStatementTokens;
import org.servicifi.gelato.language.cobol.water.AcceptStatementWater;
import org.servicifi.gelato.language.cobol.water.CICSStatementToken;
import org.servicifi.gelato.language.cobol.water.CICSStatementTokens;
import org.servicifi.gelato.language.cobol.water.CICSStatementWater;
import org.servicifi.gelato.language.cobol.water.CloseStatementToken;
import org.servicifi.gelato.language.cobol.water.CloseStatementTokens;
import org.servicifi.gelato.language.cobol.water.CloseStatementWater;
import org.servicifi.gelato.language.cobol.water.DataDescription;
import org.servicifi.gelato.language.cobol.water.DataDescriptionInfo;
import org.servicifi.gelato.language.cobol.water.DataDescriptorWater;
import org.servicifi.gelato.language.cobol.water.Dot;
import org.servicifi.gelato.language.cobol.water.FileDescription;
import org.servicifi.gelato.language.cobol.water.FileDescriptionInfo;
import org.servicifi.gelato.language.cobol.water.FileDescriptorWater;
import org.servicifi.gelato.language.cobol.water.IOControlDescription;
import org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo;
import org.servicifi.gelato.language.cobol.water.IOControlParagraphWater;
import org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater;
import org.servicifi.gelato.language.cobol.water.IncompleteElement;
import org.servicifi.gelato.language.cobol.water.InvokeStatementToken;
import org.servicifi.gelato.language.cobol.water.InvokeStatementTokens;
import org.servicifi.gelato.language.cobol.water.InvokeStatementWater;
import org.servicifi.gelato.language.cobol.water.ObjectComputerDescription;
import org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo;
import org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater;
import org.servicifi.gelato.language.cobol.water.OpenStatementToken;
import org.servicifi.gelato.language.cobol.water.OpenStatementTokens;
import org.servicifi.gelato.language.cobol.water.OpenStatementWater;
import org.servicifi.gelato.language.cobol.water.PriorityNumber;
import org.servicifi.gelato.language.cobol.water.ProgramDescription;
import org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo;
import org.servicifi.gelato.language.cobol.water.RepositoryDescription;
import org.servicifi.gelato.language.cobol.water.RepositoryDescriptionInfo;
import org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater;
import org.servicifi.gelato.language.cobol.water.SQLStatementToken;
import org.servicifi.gelato.language.cobol.water.SQLStatementTokens;
import org.servicifi.gelato.language.cobol.water.SQLStatementWater;
import org.servicifi.gelato.language.cobol.water.SelectStatementClause;
import org.servicifi.gelato.language.cobol.water.SelectStatementClauses;
import org.servicifi.gelato.language.cobol.water.SelectStatementWater;
import org.servicifi.gelato.language.cobol.water.SortPhraseToken;
import org.servicifi.gelato.language.cobol.water.SortPhraseTokens;
import org.servicifi.gelato.language.cobol.water.SortPhraseWater;
import org.servicifi.gelato.language.cobol.water.SpecialNamesClause;
import org.servicifi.gelato.language.cobol.water.SpecialNamesClauses;
import org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater;
import org.servicifi.gelato.language.cobol.water.UseStatementToken;
import org.servicifi.gelato.language.cobol.water.UseStatementTokens;
import org.servicifi.gelato.language.cobol.water.UseStatementWater;
import org.servicifi.gelato.language.cobol.water.Water;
import org.servicifi.gelato.language.cobol.water.WaterFactory;
import org.servicifi.gelato.language.cobol.water.WaterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaterPackageImpl extends EPackageImpl implements WaterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incompleteElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationDivisionWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectComputerParagraphWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectComputerDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectStatementWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectStatementClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialNamesParagraphWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialNamesClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDescriptorWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDescriptorWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioControlParagraphWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioControlDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryParagraphWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlStatementWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cicsStatementWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlStatementTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cicsStatementTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptStatementWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptStatementTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useStatementWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useStatementTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeStatementWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeStatementTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeStatementWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeStatementTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStatementWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStatementTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortPhraseTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortPhraseWaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum programDescriptionInfoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectComputerDescriptionInfoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectStatementClausesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialNamesClausesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileDescriptionInfoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataDescriptionInfoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ioControlDescriptionInfoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repositoryDescriptionInfoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cicsStatementTokensEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sqlStatementTokensEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acceptStatementTokensEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum useStatementTokensEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum closeStatementTokensEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invokeStatementTokensEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum openStatementTokensEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortPhraseTokensEEnum = null;

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
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WaterPackageImpl() {
		super(eNS_URI, WaterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WaterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WaterPackage init() {
		if (isInited) return (WaterPackage)EPackage.Registry.INSTANCE.getEPackage(WaterPackage.eNS_URI);

		// Obtain or create and register package
		WaterPackageImpl theWaterPackage = (WaterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WaterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WaterPackageImpl());

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
		theWaterPackage.createPackageContents();
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
		theWaterPackage.initializePackageContents();
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
		theWaterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WaterPackage.eNS_URI, theWaterPackage);
		return theWaterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncompleteElement() {
		return incompleteElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncompleteElement_Water() {
		return (EReference)incompleteElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentificationDivisionWater() {
		return identificationDivisionWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWater() {
		return waterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramDescription() {
		return programDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDescription_Value() {
		return (EAttribute)programDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDot() {
		return dotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectComputerParagraphWater() {
		return objectComputerParagraphWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectComputerDescription() {
		return objectComputerDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectComputerDescription_Value() {
		return (EAttribute)objectComputerDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityNumber() {
		return priorityNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriorityNumber_Value() {
		return (EAttribute)priorityNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectStatementWater() {
		return selectStatementWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectStatementClause() {
		return selectStatementClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectStatementClause_Value() {
		return (EAttribute)selectStatementClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialNamesParagraphWater() {
		return specialNamesParagraphWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialNamesClause() {
		return specialNamesClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialNamesClause_Value() {
		return (EAttribute)specialNamesClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileDescriptorWater() {
		return fileDescriptorWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileDescription() {
		return fileDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileDescription_Value() {
		return (EAttribute)fileDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDescriptorWater() {
		return dataDescriptorWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDescription() {
		return dataDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDescription_Value() {
		return (EAttribute)dataDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOControlParagraphWater() {
		return ioControlParagraphWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOControlDescription() {
		return ioControlDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOControlDescription_Value() {
		return (EAttribute)ioControlDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryParagraphWater() {
		return repositoryParagraphWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryDescription() {
		return repositoryDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDescription_Value() {
		return (EAttribute)repositoryDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLStatementWater() {
		return sqlStatementWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCICSStatementWater() {
		return cicsStatementWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLStatementToken() {
		return sqlStatementTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLStatementToken_Value() {
		return (EAttribute)sqlStatementTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCICSStatementToken() {
		return cicsStatementTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCICSStatementToken_Value() {
		return (EAttribute)cicsStatementTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptStatementWater() {
		return acceptStatementWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptStatementToken() {
		return acceptStatementTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptStatementToken_Value() {
		return (EAttribute)acceptStatementTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseStatementWater() {
		return useStatementWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseStatementToken() {
		return useStatementTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseStatementToken_Value() {
		return (EAttribute)useStatementTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseStatementWater() {
		return closeStatementWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseStatementToken() {
		return closeStatementTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloseStatementToken_Value() {
		return (EAttribute)closeStatementTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvokeStatementWater() {
		return invokeStatementWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvokeStatementToken() {
		return invokeStatementTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeStatementToken_Value() {
		return (EAttribute)invokeStatementTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStatementWater() {
		return openStatementWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStatementToken() {
		return openStatementTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStatementToken_Value() {
		return (EAttribute)openStatementTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortPhraseToken() {
		return sortPhraseTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortPhraseToken_Value() {
		return (EAttribute)sortPhraseTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortPhraseWater() {
		return sortPhraseWaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProgramDescriptionInfo() {
		return programDescriptionInfoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectComputerDescriptionInfo() {
		return objectComputerDescriptionInfoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelectStatementClauses() {
		return selectStatementClausesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecialNamesClauses() {
		return specialNamesClausesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileDescriptionInfo() {
		return fileDescriptionInfoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataDescriptionInfo() {
		return dataDescriptionInfoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIOControlDescriptionInfo() {
		return ioControlDescriptionInfoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepositoryDescriptionInfo() {
		return repositoryDescriptionInfoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCICSStatementTokens() {
		return cicsStatementTokensEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSQLStatementTokens() {
		return sqlStatementTokensEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcceptStatementTokens() {
		return acceptStatementTokensEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUseStatementTokens() {
		return useStatementTokensEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloseStatementTokens() {
		return closeStatementTokensEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvokeStatementTokens() {
		return invokeStatementTokensEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOpenStatementTokens() {
		return openStatementTokensEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortPhraseTokens() {
		return sortPhraseTokensEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterFactory getWaterFactory() {
		return (WaterFactory)getEFactoryInstance();
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
		incompleteElementEClass = createEClass(INCOMPLETE_ELEMENT);
		createEReference(incompleteElementEClass, INCOMPLETE_ELEMENT__WATER);

		identificationDivisionWaterEClass = createEClass(IDENTIFICATION_DIVISION_WATER);

		waterEClass = createEClass(WATER);

		programDescriptionEClass = createEClass(PROGRAM_DESCRIPTION);
		createEAttribute(programDescriptionEClass, PROGRAM_DESCRIPTION__VALUE);

		dotEClass = createEClass(DOT);

		objectComputerParagraphWaterEClass = createEClass(OBJECT_COMPUTER_PARAGRAPH_WATER);

		objectComputerDescriptionEClass = createEClass(OBJECT_COMPUTER_DESCRIPTION);
		createEAttribute(objectComputerDescriptionEClass, OBJECT_COMPUTER_DESCRIPTION__VALUE);

		priorityNumberEClass = createEClass(PRIORITY_NUMBER);
		createEAttribute(priorityNumberEClass, PRIORITY_NUMBER__VALUE);

		selectStatementWaterEClass = createEClass(SELECT_STATEMENT_WATER);

		selectStatementClauseEClass = createEClass(SELECT_STATEMENT_CLAUSE);
		createEAttribute(selectStatementClauseEClass, SELECT_STATEMENT_CLAUSE__VALUE);

		specialNamesParagraphWaterEClass = createEClass(SPECIAL_NAMES_PARAGRAPH_WATER);

		specialNamesClauseEClass = createEClass(SPECIAL_NAMES_CLAUSE);
		createEAttribute(specialNamesClauseEClass, SPECIAL_NAMES_CLAUSE__VALUE);

		fileDescriptorWaterEClass = createEClass(FILE_DESCRIPTOR_WATER);

		fileDescriptionEClass = createEClass(FILE_DESCRIPTION);
		createEAttribute(fileDescriptionEClass, FILE_DESCRIPTION__VALUE);

		dataDescriptorWaterEClass = createEClass(DATA_DESCRIPTOR_WATER);

		dataDescriptionEClass = createEClass(DATA_DESCRIPTION);
		createEAttribute(dataDescriptionEClass, DATA_DESCRIPTION__VALUE);

		ioControlParagraphWaterEClass = createEClass(IO_CONTROL_PARAGRAPH_WATER);

		ioControlDescriptionEClass = createEClass(IO_CONTROL_DESCRIPTION);
		createEAttribute(ioControlDescriptionEClass, IO_CONTROL_DESCRIPTION__VALUE);

		repositoryParagraphWaterEClass = createEClass(REPOSITORY_PARAGRAPH_WATER);

		repositoryDescriptionEClass = createEClass(REPOSITORY_DESCRIPTION);
		createEAttribute(repositoryDescriptionEClass, REPOSITORY_DESCRIPTION__VALUE);

		sqlStatementWaterEClass = createEClass(SQL_STATEMENT_WATER);

		cicsStatementWaterEClass = createEClass(CICS_STATEMENT_WATER);

		sqlStatementTokenEClass = createEClass(SQL_STATEMENT_TOKEN);
		createEAttribute(sqlStatementTokenEClass, SQL_STATEMENT_TOKEN__VALUE);

		cicsStatementTokenEClass = createEClass(CICS_STATEMENT_TOKEN);
		createEAttribute(cicsStatementTokenEClass, CICS_STATEMENT_TOKEN__VALUE);

		acceptStatementWaterEClass = createEClass(ACCEPT_STATEMENT_WATER);

		acceptStatementTokenEClass = createEClass(ACCEPT_STATEMENT_TOKEN);
		createEAttribute(acceptStatementTokenEClass, ACCEPT_STATEMENT_TOKEN__VALUE);

		useStatementWaterEClass = createEClass(USE_STATEMENT_WATER);

		useStatementTokenEClass = createEClass(USE_STATEMENT_TOKEN);
		createEAttribute(useStatementTokenEClass, USE_STATEMENT_TOKEN__VALUE);

		closeStatementWaterEClass = createEClass(CLOSE_STATEMENT_WATER);

		closeStatementTokenEClass = createEClass(CLOSE_STATEMENT_TOKEN);
		createEAttribute(closeStatementTokenEClass, CLOSE_STATEMENT_TOKEN__VALUE);

		invokeStatementWaterEClass = createEClass(INVOKE_STATEMENT_WATER);

		invokeStatementTokenEClass = createEClass(INVOKE_STATEMENT_TOKEN);
		createEAttribute(invokeStatementTokenEClass, INVOKE_STATEMENT_TOKEN__VALUE);

		openStatementWaterEClass = createEClass(OPEN_STATEMENT_WATER);

		openStatementTokenEClass = createEClass(OPEN_STATEMENT_TOKEN);
		createEAttribute(openStatementTokenEClass, OPEN_STATEMENT_TOKEN__VALUE);

		sortPhraseTokenEClass = createEClass(SORT_PHRASE_TOKEN);
		createEAttribute(sortPhraseTokenEClass, SORT_PHRASE_TOKEN__VALUE);

		sortPhraseWaterEClass = createEClass(SORT_PHRASE_WATER);

		// Create enums
		programDescriptionInfoEEnum = createEEnum(PROGRAM_DESCRIPTION_INFO);
		objectComputerDescriptionInfoEEnum = createEEnum(OBJECT_COMPUTER_DESCRIPTION_INFO);
		selectStatementClausesEEnum = createEEnum(SELECT_STATEMENT_CLAUSES);
		specialNamesClausesEEnum = createEEnum(SPECIAL_NAMES_CLAUSES);
		fileDescriptionInfoEEnum = createEEnum(FILE_DESCRIPTION_INFO);
		dataDescriptionInfoEEnum = createEEnum(DATA_DESCRIPTION_INFO);
		ioControlDescriptionInfoEEnum = createEEnum(IO_CONTROL_DESCRIPTION_INFO);
		repositoryDescriptionInfoEEnum = createEEnum(REPOSITORY_DESCRIPTION_INFO);
		cicsStatementTokensEEnum = createEEnum(CICS_STATEMENT_TOKENS);
		sqlStatementTokensEEnum = createEEnum(SQL_STATEMENT_TOKENS);
		acceptStatementTokensEEnum = createEEnum(ACCEPT_STATEMENT_TOKENS);
		useStatementTokensEEnum = createEEnum(USE_STATEMENT_TOKENS);
		closeStatementTokensEEnum = createEEnum(CLOSE_STATEMENT_TOKENS);
		invokeStatementTokensEEnum = createEEnum(INVOKE_STATEMENT_TOKENS);
		openStatementTokensEEnum = createEEnum(OPEN_STATEMENT_TOKENS);
		sortPhraseTokensEEnum = createEEnum(SORT_PHRASE_TOKENS);
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
		identificationDivisionWaterEClass.getESuperTypes().add(this.getWater());
		programDescriptionEClass.getESuperTypes().add(this.getIdentificationDivisionWater());
		dotEClass.getESuperTypes().add(this.getIdentificationDivisionWater());
		dotEClass.getESuperTypes().add(this.getSQLStatementWater());
		objectComputerParagraphWaterEClass.getESuperTypes().add(this.getWater());
		objectComputerDescriptionEClass.getESuperTypes().add(this.getObjectComputerParagraphWater());
		priorityNumberEClass.getESuperTypes().add(this.getObjectComputerParagraphWater());
		selectStatementWaterEClass.getESuperTypes().add(this.getWater());
		selectStatementClauseEClass.getESuperTypes().add(this.getSelectStatementWater());
		specialNamesParagraphWaterEClass.getESuperTypes().add(this.getWater());
		specialNamesClauseEClass.getESuperTypes().add(this.getSpecialNamesParagraphWater());
		fileDescriptorWaterEClass.getESuperTypes().add(this.getWater());
		fileDescriptionEClass.getESuperTypes().add(this.getFileDescriptorWater());
		dataDescriptorWaterEClass.getESuperTypes().add(this.getWater());
		dataDescriptionEClass.getESuperTypes().add(this.getDataDescriptorWater());
		ioControlParagraphWaterEClass.getESuperTypes().add(this.getWater());
		ioControlDescriptionEClass.getESuperTypes().add(this.getIOControlParagraphWater());
		repositoryParagraphWaterEClass.getESuperTypes().add(this.getWater());
		repositoryDescriptionEClass.getESuperTypes().add(this.getRepositoryParagraphWater());
		sqlStatementWaterEClass.getESuperTypes().add(this.getWater());
		cicsStatementWaterEClass.getESuperTypes().add(this.getWater());
		sqlStatementTokenEClass.getESuperTypes().add(this.getSQLStatementWater());
		cicsStatementTokenEClass.getESuperTypes().add(this.getCICSStatementWater());
		acceptStatementWaterEClass.getESuperTypes().add(this.getWater());
		acceptStatementTokenEClass.getESuperTypes().add(this.getAcceptStatementWater());
		useStatementWaterEClass.getESuperTypes().add(this.getWater());
		useStatementTokenEClass.getESuperTypes().add(this.getUseStatementWater());
		closeStatementWaterEClass.getESuperTypes().add(this.getWater());
		closeStatementTokenEClass.getESuperTypes().add(this.getCloseStatementWater());
		invokeStatementWaterEClass.getESuperTypes().add(this.getWater());
		invokeStatementTokenEClass.getESuperTypes().add(this.getInvokeStatementWater());
		openStatementWaterEClass.getESuperTypes().add(this.getWater());
		openStatementTokenEClass.getESuperTypes().add(this.getOpenStatementWater());
		sortPhraseTokenEClass.getESuperTypes().add(this.getSortPhraseWater());
		sortPhraseWaterEClass.getESuperTypes().add(this.getWater());

		// Initialize classes and features; add operations and parameters
		initEClass(incompleteElementEClass, IncompleteElement.class, "IncompleteElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncompleteElement_Water(), this.getWater(), null, "water", null, 0, -1, IncompleteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identificationDivisionWaterEClass, IdentificationDivisionWater.class, "IdentificationDivisionWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(waterEClass, Water.class, "Water", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(programDescriptionEClass, ProgramDescription.class, "ProgramDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramDescription_Value(), this.getProgramDescriptionInfo(), "value", null, 1, 1, ProgramDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotEClass, Dot.class, "Dot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectComputerParagraphWaterEClass, ObjectComputerParagraphWater.class, "ObjectComputerParagraphWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectComputerDescriptionEClass, ObjectComputerDescription.class, "ObjectComputerDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectComputerDescription_Value(), this.getObjectComputerDescriptionInfo(), "value", null, 1, 1, ObjectComputerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priorityNumberEClass, PriorityNumber.class, "PriorityNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriorityNumber_Value(), ecorePackage.getEString(), "value", null, 1, 1, PriorityNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectStatementWaterEClass, SelectStatementWater.class, "SelectStatementWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectStatementClauseEClass, SelectStatementClause.class, "SelectStatementClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectStatementClause_Value(), this.getSelectStatementClauses(), "value", null, 1, 1, SelectStatementClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialNamesParagraphWaterEClass, SpecialNamesParagraphWater.class, "SpecialNamesParagraphWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specialNamesClauseEClass, SpecialNamesClause.class, "SpecialNamesClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialNamesClause_Value(), this.getSpecialNamesClauses(), "value", null, 1, 1, SpecialNamesClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileDescriptorWaterEClass, FileDescriptorWater.class, "FileDescriptorWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileDescriptionEClass, FileDescription.class, "FileDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileDescription_Value(), this.getFileDescriptionInfo(), "value", null, 1, 1, FileDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataDescriptorWaterEClass, DataDescriptorWater.class, "DataDescriptorWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDescriptionEClass, DataDescription.class, "DataDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDescription_Value(), this.getDataDescriptionInfo(), "value", null, 1, 1, DataDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioControlParagraphWaterEClass, IOControlParagraphWater.class, "IOControlParagraphWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ioControlDescriptionEClass, IOControlDescription.class, "IOControlDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOControlDescription_Value(), this.getIOControlDescriptionInfo(), "value", null, 1, 1, IOControlDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryParagraphWaterEClass, RepositoryParagraphWater.class, "RepositoryParagraphWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryDescriptionEClass, RepositoryDescription.class, "RepositoryDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepositoryDescription_Value(), this.getRepositoryDescriptionInfo(), "value", null, 1, 1, RepositoryDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlStatementWaterEClass, SQLStatementWater.class, "SQLStatementWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cicsStatementWaterEClass, CICSStatementWater.class, "CICSStatementWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlStatementTokenEClass, SQLStatementToken.class, "SQLStatementToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSQLStatementToken_Value(), this.getSQLStatementTokens(), "value", null, 1, 1, SQLStatementToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cicsStatementTokenEClass, CICSStatementToken.class, "CICSStatementToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCICSStatementToken_Value(), this.getCICSStatementTokens(), "value", null, 1, 1, CICSStatementToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptStatementWaterEClass, AcceptStatementWater.class, "AcceptStatementWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceptStatementTokenEClass, AcceptStatementToken.class, "AcceptStatementToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptStatementToken_Value(), this.getAcceptStatementTokens(), "value", null, 1, 1, AcceptStatementToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useStatementWaterEClass, UseStatementWater.class, "UseStatementWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(useStatementTokenEClass, UseStatementToken.class, "UseStatementToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseStatementToken_Value(), this.getUseStatementTokens(), "value", null, 1, 1, UseStatementToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closeStatementWaterEClass, CloseStatementWater.class, "CloseStatementWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(closeStatementTokenEClass, CloseStatementToken.class, "CloseStatementToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloseStatementToken_Value(), this.getCloseStatementTokens(), "value", null, 1, 1, CloseStatementToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeStatementWaterEClass, InvokeStatementWater.class, "InvokeStatementWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invokeStatementTokenEClass, InvokeStatementToken.class, "InvokeStatementToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvokeStatementToken_Value(), this.getInvokeStatementTokens(), "value", null, 1, 1, InvokeStatementToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openStatementWaterEClass, OpenStatementWater.class, "OpenStatementWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openStatementTokenEClass, OpenStatementToken.class, "OpenStatementToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenStatementToken_Value(), this.getOpenStatementTokens(), "value", null, 1, 1, OpenStatementToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortPhraseTokenEClass, SortPhraseToken.class, "SortPhraseToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortPhraseToken_Value(), this.getSortPhraseTokens(), "value", null, 1, 1, SortPhraseToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortPhraseWaterEClass, SortPhraseWater.class, "SortPhraseWater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(programDescriptionInfoEEnum, ProgramDescriptionInfo.class, "ProgramDescriptionInfo");
		addEEnumLiteral(programDescriptionInfoEEnum, ProgramDescriptionInfo.AUTHOR);
		addEEnumLiteral(programDescriptionInfoEEnum, ProgramDescriptionInfo.INSTALLATION);
		addEEnumLiteral(programDescriptionInfoEEnum, ProgramDescriptionInfo.DATE_WRITTEN);
		addEEnumLiteral(programDescriptionInfoEEnum, ProgramDescriptionInfo.DATE_COMPLETED);
		addEEnumLiteral(programDescriptionInfoEEnum, ProgramDescriptionInfo.SECURITY);

		initEEnum(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.class, "ObjectComputerDescriptionInfo");
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.MEMORY);
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.SIZE);
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.WORDS);
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.CHARACTERS);
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.MODULES);
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.SEGMENT);
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.PROGRAM);
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.COLLATING);
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.SEQUENCE);
		addEEnumLiteral(objectComputerDescriptionInfoEEnum, ObjectComputerDescriptionInfo.SEGMENT_LIMIT);

		initEEnum(selectStatementClausesEEnum, SelectStatementClauses.class, "SelectStatementClauses");
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.ALTERNATE);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.RECORD);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.KEY);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.RELATIVE);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.DELIMITER);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.STANDARD1);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.PADDING);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.CHARACTER);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.RESERVE);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.AREA);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.AREAS);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.ACCESS);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.MODE);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.IS);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.SEQUENTIAL);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.RANDOM);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.WITH);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.DYNAMIC);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.ORGANIZATION);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.DUPLICATES);
		addEEnumLiteral(selectStatementClausesEEnum, SelectStatementClauses.INDEXED);

		initEEnum(specialNamesClausesEEnum, SpecialNamesClauses.class, "SpecialNamesClauses");
		addEEnumLiteral(specialNamesClausesEEnum, SpecialNamesClauses.DECIMAL_POINT);
		addEEnumLiteral(specialNamesClausesEEnum, SpecialNamesClauses.IS);
		addEEnumLiteral(specialNamesClausesEEnum, SpecialNamesClauses.COMMA);
		addEEnumLiteral(specialNamesClausesEEnum, SpecialNamesClauses.XML_SCHEMA);

		initEEnum(fileDescriptionInfoEEnum, FileDescriptionInfo.class, "FileDescriptionInfo");
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.BLOCK);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.CONTAINS);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.TO);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.CHARACTERS);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.RECORDS);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.CODE_SET);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.IS);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.DATA);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.RECORD);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.ARE);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.LABEL);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.OMITTED);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.STANDARD);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.LINAGE);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.LINES);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.WITH);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.FOOTING);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.AT);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.TOP);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.BOTTOM);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.VARYING);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.IN);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.SIZE);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.FROM);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.DEPENDING);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.ON);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.MODE);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.RECORDING);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.F);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.V);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.U);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.S);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.VALUE);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.OF);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.IDENTIFICATION);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.ID);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.REPORT);
		addEEnumLiteral(fileDescriptionInfoEEnum, FileDescriptionInfo.REPORTS);

		initEEnum(dataDescriptionInfoEEnum, DataDescriptionInfo.class, "DataDescriptionInfo");
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.BLANK);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.WHEN);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.ZERO);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.ZEROS);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.ZEROES);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.JUSTIFIED);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.JUST);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.RIGHT);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.SIGN);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.IS);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.LEADING);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.TRAILING);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.SEPARATE);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.CHARACTER);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.DATE);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.FORMAT);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.SYNCHRONIZED);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.SYNC);
		addEEnumLiteral(dataDescriptionInfoEEnum, DataDescriptionInfo.LEFT);

		initEEnum(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.class, "IOControlDescriptionInfo");
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.RERUN);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.ON);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.OF);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.RECORD);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.RECORDS);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.EVERY);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.SAME);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.AREA);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.FOR);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.MULTIPLE);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.FILE);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.TAPE);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.CONTAINS);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.POSITION);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.APPLY);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.WRITE_ONLY);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.SORT);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.SORT_MERGE);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.REEL);
		addEEnumLiteral(ioControlDescriptionInfoEEnum, IOControlDescriptionInfo.UNIT);

		initEEnum(repositoryDescriptionInfoEEnum, RepositoryDescriptionInfo.class, "RepositoryDescriptionInfo");
		addEEnumLiteral(repositoryDescriptionInfoEEnum, RepositoryDescriptionInfo.CLASS);
		addEEnumLiteral(repositoryDescriptionInfoEEnum, RepositoryDescriptionInfo.IS);

		initEEnum(cicsStatementTokensEEnum, CICSStatementTokens.class, "CICSStatementTokens");
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.TS);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.QUEUE);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.QNAME);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.OPENPAR);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.CLOSEPAR);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.SYSID);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.SYS);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.SET);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.INTO);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.LENGTH);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.ITEM);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.NEXT);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.NUMITEMS);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.TD);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.WRITEQ);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.FROM);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.REWRITE);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.NOSUSPEND);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.MAIN);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.AUXILIARY);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.DELETEQ);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.READ);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.FILE);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.DATASET);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.RIDFLD);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.KEYLENGTH);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.GENERIC);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.GTEQ);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.EQUAL);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.UNCOMMITTED);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.CONSISTENT);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.REPEATABLE);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.UPDATE);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.TOKEN);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.RBA);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.XRBA);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.RRN);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.WRITE);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.MASSINSERT);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.PROGRAM);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.COMMAREA);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.DATALENGTH);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.SYNCONRETURN);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.TRANSID);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.INPUTMSG);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.INPUTMSGLEN);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.CHANNEL);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.XCTL);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.LOAD);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.START);
		addEEnumLiteral(cicsStatementTokensEEnum, CICSStatementTokens.TR);

		initEEnum(sqlStatementTokensEEnum, SQLStatementTokens.class, "SQLStatementTokens");
		addEEnumLiteral(sqlStatementTokensEEnum, SQLStatementTokens.INCLUDE);
		addEEnumLiteral(sqlStatementTokensEEnum, SQLStatementTokens.SELECT);
		addEEnumLiteral(sqlStatementTokensEEnum, SQLStatementTokens.DECLARE);
		addEEnumLiteral(sqlStatementTokensEEnum, SQLStatementTokens.FROM);
		addEEnumLiteral(sqlStatementTokensEEnum, SQLStatementTokens.INSERT);
		addEEnumLiteral(sqlStatementTokensEEnum, SQLStatementTokens.INTO);
		addEEnumLiteral(sqlStatementTokensEEnum, SQLStatementTokens.UPDATE);
		addEEnumLiteral(sqlStatementTokensEEnum, SQLStatementTokens.DELETE);

		initEEnum(acceptStatementTokensEEnum, AcceptStatementTokens.class, "AcceptStatementTokens");
		addEEnumLiteral(acceptStatementTokensEEnum, AcceptStatementTokens.FROM);
		addEEnumLiteral(acceptStatementTokensEEnum, AcceptStatementTokens.DATE);
		addEEnumLiteral(acceptStatementTokensEEnum, AcceptStatementTokens.DAY);
		addEEnumLiteral(acceptStatementTokensEEnum, AcceptStatementTokens.DOW);
		addEEnumLiteral(acceptStatementTokensEEnum, AcceptStatementTokens.TIME);
		addEEnumLiteral(acceptStatementTokensEEnum, AcceptStatementTokens.DATEFORMAT1);
		addEEnumLiteral(acceptStatementTokensEEnum, AcceptStatementTokens.DATEFORMAT2);

		initEEnum(useStatementTokensEEnum, UseStatementTokens.class, "UseStatementTokens");
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.GLOBAL);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.AFTER);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.STANDARD);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.ERROR);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.EXCEPTION);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.PROCEDURE);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.ON);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.INPUT);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.OUTPUT);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.EXTEND);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.FOR);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.DEBUGGING);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.ALL);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.PROCEDURES);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.BEGINNING);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.ENDING);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.FILE);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.REEL);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.UNIT);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.LABEL);
		addEEnumLiteral(useStatementTokensEEnum, UseStatementTokens.IO);

		initEEnum(closeStatementTokensEEnum, CloseStatementTokens.class, "CloseStatementTokens");
		addEEnumLiteral(closeStatementTokensEEnum, CloseStatementTokens.WITH);
		addEEnumLiteral(closeStatementTokensEEnum, CloseStatementTokens.NO);
		addEEnumLiteral(closeStatementTokensEEnum, CloseStatementTokens.REWIND);
		addEEnumLiteral(closeStatementTokensEEnum, CloseStatementTokens.LOCK);
		addEEnumLiteral(closeStatementTokensEEnum, CloseStatementTokens.REEL);
		addEEnumLiteral(closeStatementTokensEEnum, CloseStatementTokens.UNIT);
		addEEnumLiteral(closeStatementTokensEEnum, CloseStatementTokens.FOR);
		addEEnumLiteral(closeStatementTokensEEnum, CloseStatementTokens.REMOVAL);

		initEEnum(invokeStatementTokensEEnum, InvokeStatementTokens.class, "InvokeStatementTokens");
		addEEnumLiteral(invokeStatementTokensEEnum, InvokeStatementTokens.SELF);
		addEEnumLiteral(invokeStatementTokensEEnum, InvokeStatementTokens.SUPER);
		addEEnumLiteral(invokeStatementTokensEEnum, InvokeStatementTokens.NEW);
		addEEnumLiteral(invokeStatementTokensEEnum, InvokeStatementTokens.USING);
		addEEnumLiteral(invokeStatementTokensEEnum, InvokeStatementTokens.BY);
		addEEnumLiteral(invokeStatementTokensEEnum, InvokeStatementTokens.VALUE);
		addEEnumLiteral(invokeStatementTokensEEnum, InvokeStatementTokens.LENGTH);
		addEEnumLiteral(invokeStatementTokensEEnum, InvokeStatementTokens.OF);
		addEEnumLiteral(invokeStatementTokensEEnum, InvokeStatementTokens.RETURNING);

		initEEnum(openStatementTokensEEnum, OpenStatementTokens.class, "OpenStatementTokens");
		addEEnumLiteral(openStatementTokensEEnum, OpenStatementTokens.REVERSED);
		addEEnumLiteral(openStatementTokensEEnum, OpenStatementTokens.WITH);
		addEEnumLiteral(openStatementTokensEEnum, OpenStatementTokens.NO);
		addEEnumLiteral(openStatementTokensEEnum, OpenStatementTokens.REWIND);

		initEEnum(sortPhraseTokensEEnum, SortPhraseTokens.class, "SortPhraseTokens");
		addEEnumLiteral(sortPhraseTokensEEnum, SortPhraseTokens.WITH);
		addEEnumLiteral(sortPhraseTokensEEnum, SortPhraseTokens.IN);
		addEEnumLiteral(sortPhraseTokensEEnum, SortPhraseTokens.ORDER);
		addEEnumLiteral(sortPhraseTokensEEnum, SortPhraseTokens.SEQUENCE);
		addEEnumLiteral(sortPhraseTokensEEnum, SortPhraseTokens.DUPLICATES);
		addEEnumLiteral(sortPhraseTokensEEnum, SortPhraseTokens.COLLATING);
		addEEnumLiteral(sortPhraseTokensEEnum, SortPhraseTokens.IS);
	}

} //WaterPackageImpl
