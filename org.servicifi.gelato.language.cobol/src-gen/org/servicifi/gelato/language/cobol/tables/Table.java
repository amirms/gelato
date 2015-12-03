/**
 */
package org.servicifi.gelato.language.cobol.tables;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.dataitems.DataItem;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.Table#getTableDimension <em>Table Dimension</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.Table#getIndexedBy <em>Indexed By</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.Table#getKeysAre <em>Keys Are</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.Table#getMaxTableDimension <em>Max Table Dimension</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.Table#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends DataItem, IncompleteElement {
	/**
	 * Returns the value of the '<em><b>Table Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Dimension</em>' containment reference.
	 * @see #setTableDimension(TableDimension)
	 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getTable_TableDimension()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TableDimension getTableDimension();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.tables.Table#getTableDimension <em>Table Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Dimension</em>' containment reference.
	 * @see #getTableDimension()
	 * @generated
	 */
	void setTableDimension(TableDimension value);

	/**
	 * Returns the value of the '<em><b>Indexed By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexed By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed By</em>' containment reference.
	 * @see #setIndexedBy(IndexName)
	 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getTable_IndexedBy()
	 * @model containment="true"
	 * @generated
	 */
	IndexName getIndexedBy();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.tables.Table#getIndexedBy <em>Indexed By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexed By</em>' containment reference.
	 * @see #getIndexedBy()
	 * @generated
	 */
	void setIndexedBy(IndexName value);

	/**
	 * Returns the value of the '<em><b>Keys Are</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.tables.KeyName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys Are</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys Are</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getTable_KeysAre()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyName> getKeysAre();

	/**
	 * Returns the value of the '<em><b>Max Table Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Table Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Table Dimension</em>' containment reference.
	 * @see #setMaxTableDimension(TableDimension)
	 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getTable_MaxTableDimension()
	 * @model containment="true"
	 * @generated
	 */
	TableDimension getMaxTableDimension();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.tables.Table#getMaxTableDimension <em>Max Table Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Table Dimension</em>' containment reference.
	 * @see #getMaxTableDimension()
	 * @generated
	 */
	void setMaxTableDimension(TableDimension value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference.
	 * @see #setDependsOn(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getTable_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierReference getDependsOn();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.tables.Table#getDependsOn <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' containment reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(IdentifierReference value);

} // Table
