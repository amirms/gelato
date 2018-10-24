/**
 */
package org.servicifi.gelato.language.cobol.water.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.water.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaterFactoryImpl extends EFactoryImpl implements WaterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WaterFactory init() {
		try {
			WaterFactory theWaterFactory = (WaterFactory)EPackage.Registry.INSTANCE.getEFactory(WaterPackage.eNS_URI);
			if (theWaterFactory != null) {
				return theWaterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WaterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WaterPackage.PROGRAM_DESCRIPTION: return createProgramDescription();
			case WaterPackage.DOT: return createDot();
			case WaterPackage.OBJECT_COMPUTER_DESCRIPTION: return createObjectComputerDescription();
			case WaterPackage.PRIORITY_NUMBER: return createPriorityNumber();
			case WaterPackage.SELECT_STATEMENT_CLAUSE: return createSelectStatementClause();
			case WaterPackage.SPECIAL_NAMES_CLAUSE: return createSpecialNamesClause();
			case WaterPackage.FILE_DESCRIPTION: return createFileDescription();
			case WaterPackage.DATA_DESCRIPTION: return createDataDescription();
			case WaterPackage.IO_CONTROL_DESCRIPTION: return createIOControlDescription();
			case WaterPackage.REPOSITORY_DESCRIPTION: return createRepositoryDescription();
			case WaterPackage.SQL_STATEMENT_TOKEN: return createSQLStatementToken();
			case WaterPackage.CICS_STATEMENT_TOKEN: return createCICSStatementToken();
			case WaterPackage.ACCEPT_STATEMENT_TOKEN: return createAcceptStatementToken();
			case WaterPackage.USE_STATEMENT_TOKEN: return createUseStatementToken();
			case WaterPackage.CLOSE_STATEMENT_TOKEN: return createCloseStatementToken();
			case WaterPackage.INVOKE_STATEMENT_TOKEN: return createInvokeStatementToken();
			case WaterPackage.OPEN_STATEMENT_TOKEN: return createOpenStatementToken();
			case WaterPackage.SORT_PHRASE_TOKEN: return createSortPhraseToken();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WaterPackage.PROGRAM_DESCRIPTION_INFO:
				return createProgramDescriptionInfoFromString(eDataType, initialValue);
			case WaterPackage.OBJECT_COMPUTER_DESCRIPTION_INFO:
				return createObjectComputerDescriptionInfoFromString(eDataType, initialValue);
			case WaterPackage.SELECT_STATEMENT_CLAUSES:
				return createSelectStatementClausesFromString(eDataType, initialValue);
			case WaterPackage.SPECIAL_NAMES_CLAUSES:
				return createSpecialNamesClausesFromString(eDataType, initialValue);
			case WaterPackage.FILE_DESCRIPTION_INFO:
				return createFileDescriptionInfoFromString(eDataType, initialValue);
			case WaterPackage.DATA_DESCRIPTION_INFO:
				return createDataDescriptionInfoFromString(eDataType, initialValue);
			case WaterPackage.IO_CONTROL_DESCRIPTION_INFO:
				return createIOControlDescriptionInfoFromString(eDataType, initialValue);
			case WaterPackage.REPOSITORY_DESCRIPTION_INFO:
				return createRepositoryDescriptionInfoFromString(eDataType, initialValue);
			case WaterPackage.CICS_STATEMENT_TOKENS:
				return createCICSStatementTokensFromString(eDataType, initialValue);
			case WaterPackage.SQL_STATEMENT_TOKENS:
				return createSQLStatementTokensFromString(eDataType, initialValue);
			case WaterPackage.ACCEPT_STATEMENT_TOKENS:
				return createAcceptStatementTokensFromString(eDataType, initialValue);
			case WaterPackage.USE_STATEMENT_TOKENS:
				return createUseStatementTokensFromString(eDataType, initialValue);
			case WaterPackage.CLOSE_STATEMENT_TOKENS:
				return createCloseStatementTokensFromString(eDataType, initialValue);
			case WaterPackage.INVOKE_STATEMENT_TOKENS:
				return createInvokeStatementTokensFromString(eDataType, initialValue);
			case WaterPackage.OPEN_STATEMENT_TOKENS:
				return createOpenStatementTokensFromString(eDataType, initialValue);
			case WaterPackage.SORT_PHRASE_TOKENS:
				return createSortPhraseTokensFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WaterPackage.PROGRAM_DESCRIPTION_INFO:
				return convertProgramDescriptionInfoToString(eDataType, instanceValue);
			case WaterPackage.OBJECT_COMPUTER_DESCRIPTION_INFO:
				return convertObjectComputerDescriptionInfoToString(eDataType, instanceValue);
			case WaterPackage.SELECT_STATEMENT_CLAUSES:
				return convertSelectStatementClausesToString(eDataType, instanceValue);
			case WaterPackage.SPECIAL_NAMES_CLAUSES:
				return convertSpecialNamesClausesToString(eDataType, instanceValue);
			case WaterPackage.FILE_DESCRIPTION_INFO:
				return convertFileDescriptionInfoToString(eDataType, instanceValue);
			case WaterPackage.DATA_DESCRIPTION_INFO:
				return convertDataDescriptionInfoToString(eDataType, instanceValue);
			case WaterPackage.IO_CONTROL_DESCRIPTION_INFO:
				return convertIOControlDescriptionInfoToString(eDataType, instanceValue);
			case WaterPackage.REPOSITORY_DESCRIPTION_INFO:
				return convertRepositoryDescriptionInfoToString(eDataType, instanceValue);
			case WaterPackage.CICS_STATEMENT_TOKENS:
				return convertCICSStatementTokensToString(eDataType, instanceValue);
			case WaterPackage.SQL_STATEMENT_TOKENS:
				return convertSQLStatementTokensToString(eDataType, instanceValue);
			case WaterPackage.ACCEPT_STATEMENT_TOKENS:
				return convertAcceptStatementTokensToString(eDataType, instanceValue);
			case WaterPackage.USE_STATEMENT_TOKENS:
				return convertUseStatementTokensToString(eDataType, instanceValue);
			case WaterPackage.CLOSE_STATEMENT_TOKENS:
				return convertCloseStatementTokensToString(eDataType, instanceValue);
			case WaterPackage.INVOKE_STATEMENT_TOKENS:
				return convertInvokeStatementTokensToString(eDataType, instanceValue);
			case WaterPackage.OPEN_STATEMENT_TOKENS:
				return convertOpenStatementTokensToString(eDataType, instanceValue);
			case WaterPackage.SORT_PHRASE_TOKENS:
				return convertSortPhraseTokensToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDescription createProgramDescription() {
		ProgramDescriptionImpl programDescription = new ProgramDescriptionImpl();
		return programDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dot createDot() {
		DotImpl dot = new DotImpl();
		return dot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComputerDescription createObjectComputerDescription() {
		ObjectComputerDescriptionImpl objectComputerDescription = new ObjectComputerDescriptionImpl();
		return objectComputerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityNumber createPriorityNumber() {
		PriorityNumberImpl priorityNumber = new PriorityNumberImpl();
		return priorityNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectStatementClause createSelectStatementClause() {
		SelectStatementClauseImpl selectStatementClause = new SelectStatementClauseImpl();
		return selectStatementClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialNamesClause createSpecialNamesClause() {
		SpecialNamesClauseImpl specialNamesClause = new SpecialNamesClauseImpl();
		return specialNamesClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDescription createFileDescription() {
		FileDescriptionImpl fileDescription = new FileDescriptionImpl();
		return fileDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescription createDataDescription() {
		DataDescriptionImpl dataDescription = new DataDescriptionImpl();
		return dataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOControlDescription createIOControlDescription() {
		IOControlDescriptionImpl ioControlDescription = new IOControlDescriptionImpl();
		return ioControlDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDescription createRepositoryDescription() {
		RepositoryDescriptionImpl repositoryDescription = new RepositoryDescriptionImpl();
		return repositoryDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLStatementToken createSQLStatementToken() {
		SQLStatementTokenImpl sqlStatementToken = new SQLStatementTokenImpl();
		return sqlStatementToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICSStatementToken createCICSStatementToken() {
		CICSStatementTokenImpl cicsStatementToken = new CICSStatementTokenImpl();
		return cicsStatementToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptStatementToken createAcceptStatementToken() {
		AcceptStatementTokenImpl acceptStatementToken = new AcceptStatementTokenImpl();
		return acceptStatementToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseStatementToken createUseStatementToken() {
		UseStatementTokenImpl useStatementToken = new UseStatementTokenImpl();
		return useStatementToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseStatementToken createCloseStatementToken() {
		CloseStatementTokenImpl closeStatementToken = new CloseStatementTokenImpl();
		return closeStatementToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeStatementToken createInvokeStatementToken() {
		InvokeStatementTokenImpl invokeStatementToken = new InvokeStatementTokenImpl();
		return invokeStatementToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStatementToken createOpenStatementToken() {
		OpenStatementTokenImpl openStatementToken = new OpenStatementTokenImpl();
		return openStatementToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortPhraseToken createSortPhraseToken() {
		SortPhraseTokenImpl sortPhraseToken = new SortPhraseTokenImpl();
		return sortPhraseToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDescriptionInfo createProgramDescriptionInfoFromString(EDataType eDataType, String initialValue) {
		ProgramDescriptionInfo result = ProgramDescriptionInfo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgramDescriptionInfoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComputerDescriptionInfo createObjectComputerDescriptionInfoFromString(EDataType eDataType, String initialValue) {
		ObjectComputerDescriptionInfo result = ObjectComputerDescriptionInfo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectComputerDescriptionInfoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectStatementClauses createSelectStatementClausesFromString(EDataType eDataType, String initialValue) {
		SelectStatementClauses result = SelectStatementClauses.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectStatementClausesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialNamesClauses createSpecialNamesClausesFromString(EDataType eDataType, String initialValue) {
		SpecialNamesClauses result = SpecialNamesClauses.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialNamesClausesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDescriptionInfo createFileDescriptionInfoFromString(EDataType eDataType, String initialValue) {
		FileDescriptionInfo result = FileDescriptionInfo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileDescriptionInfoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescriptionInfo createDataDescriptionInfoFromString(EDataType eDataType, String initialValue) {
		DataDescriptionInfo result = DataDescriptionInfo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataDescriptionInfoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOControlDescriptionInfo createIOControlDescriptionInfoFromString(EDataType eDataType, String initialValue) {
		IOControlDescriptionInfo result = IOControlDescriptionInfo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOControlDescriptionInfoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDescriptionInfo createRepositoryDescriptionInfoFromString(EDataType eDataType, String initialValue) {
		RepositoryDescriptionInfo result = RepositoryDescriptionInfo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepositoryDescriptionInfoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICSStatementTokens createCICSStatementTokensFromString(EDataType eDataType, String initialValue) {
		CICSStatementTokens result = CICSStatementTokens.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCICSStatementTokensToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLStatementTokens createSQLStatementTokensFromString(EDataType eDataType, String initialValue) {
		SQLStatementTokens result = SQLStatementTokens.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSQLStatementTokensToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptStatementTokens createAcceptStatementTokensFromString(EDataType eDataType, String initialValue) {
		AcceptStatementTokens result = AcceptStatementTokens.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcceptStatementTokensToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseStatementTokens createUseStatementTokensFromString(EDataType eDataType, String initialValue) {
		UseStatementTokens result = UseStatementTokens.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseStatementTokensToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseStatementTokens createCloseStatementTokensFromString(EDataType eDataType, String initialValue) {
		CloseStatementTokens result = CloseStatementTokens.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloseStatementTokensToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeStatementTokens createInvokeStatementTokensFromString(EDataType eDataType, String initialValue) {
		InvokeStatementTokens result = InvokeStatementTokens.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvokeStatementTokensToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStatementTokens createOpenStatementTokensFromString(EDataType eDataType, String initialValue) {
		OpenStatementTokens result = OpenStatementTokens.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenStatementTokensToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortPhraseTokens createSortPhraseTokensFromString(EDataType eDataType, String initialValue) {
		SortPhraseTokens result = SortPhraseTokens.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortPhraseTokensToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterPackage getWaterPackage() {
		return (WaterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WaterPackage getPackage() {
		return WaterPackage.eINSTANCE;
	}

} //WaterFactoryImpl
