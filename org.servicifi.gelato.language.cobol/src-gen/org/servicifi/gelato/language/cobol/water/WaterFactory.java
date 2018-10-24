/**
 */
package org.servicifi.gelato.language.cobol.water;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage
 * @generated
 */
public interface WaterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WaterFactory eINSTANCE = org.servicifi.gelato.language.cobol.water.impl.WaterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Description</em>'.
	 * @generated
	 */
	ProgramDescription createProgramDescription();

	/**
	 * Returns a new object of class '<em>Dot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot</em>'.
	 * @generated
	 */
	Dot createDot();

	/**
	 * Returns a new object of class '<em>Object Computer Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Computer Description</em>'.
	 * @generated
	 */
	ObjectComputerDescription createObjectComputerDescription();

	/**
	 * Returns a new object of class '<em>Priority Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Priority Number</em>'.
	 * @generated
	 */
	PriorityNumber createPriorityNumber();

	/**
	 * Returns a new object of class '<em>Select Statement Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Statement Clause</em>'.
	 * @generated
	 */
	SelectStatementClause createSelectStatementClause();

	/**
	 * Returns a new object of class '<em>Special Names Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Special Names Clause</em>'.
	 * @generated
	 */
	SpecialNamesClause createSpecialNamesClause();

	/**
	 * Returns a new object of class '<em>File Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Description</em>'.
	 * @generated
	 */
	FileDescription createFileDescription();

	/**
	 * Returns a new object of class '<em>Data Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Description</em>'.
	 * @generated
	 */
	DataDescription createDataDescription();

	/**
	 * Returns a new object of class '<em>IO Control Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Control Description</em>'.
	 * @generated
	 */
	IOControlDescription createIOControlDescription();

	/**
	 * Returns a new object of class '<em>Repository Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository Description</em>'.
	 * @generated
	 */
	RepositoryDescription createRepositoryDescription();

	/**
	 * Returns a new object of class '<em>SQL Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQL Statement Token</em>'.
	 * @generated
	 */
	SQLStatementToken createSQLStatementToken();

	/**
	 * Returns a new object of class '<em>CICS Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CICS Statement Token</em>'.
	 * @generated
	 */
	CICSStatementToken createCICSStatementToken();

	/**
	 * Returns a new object of class '<em>Accept Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Statement Token</em>'.
	 * @generated
	 */
	AcceptStatementToken createAcceptStatementToken();

	/**
	 * Returns a new object of class '<em>Use Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Statement Token</em>'.
	 * @generated
	 */
	UseStatementToken createUseStatementToken();

	/**
	 * Returns a new object of class '<em>Close Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Close Statement Token</em>'.
	 * @generated
	 */
	CloseStatementToken createCloseStatementToken();

	/**
	 * Returns a new object of class '<em>Invoke Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoke Statement Token</em>'.
	 * @generated
	 */
	InvokeStatementToken createInvokeStatementToken();

	/**
	 * Returns a new object of class '<em>Open Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Statement Token</em>'.
	 * @generated
	 */
	OpenStatementToken createOpenStatementToken();

	/**
	 * Returns a new object of class '<em>Sort Phrase Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort Phrase Token</em>'.
	 * @generated
	 */
	SortPhraseToken createSortPhraseToken();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WaterPackage getWaterPackage();

} //WaterFactory
