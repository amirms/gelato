/**
 */
package org.servicifi.gelato.language.cobol.tables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage
 * @generated
 */
public interface TablesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TablesFactory eINSTANCE = org.servicifi.gelato.language.cobol.tables.impl.TablesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Key Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Name</em>'.
	 * @generated
	 */
	KeyName createKeyName();

	/**
	 * Returns a new object of class '<em>Index Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Name</em>'.
	 * @generated
	 */
	IndexName createIndexName();

	/**
	 * Returns a new object of class '<em>Table Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Dimension</em>'.
	 * @generated
	 */
	TableDimension createTableDimension();

	/**
	 * Returns a new object of class '<em>Additional Index Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Index Name</em>'.
	 * @generated
	 */
	AdditionalIndexName createAdditionalIndexName();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TablesPackage getTablesPackage();

} //TablesFactory
