/**
 */
package org.servicifi.gelato.language.cobol.tables;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.KeyName#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.KeyName#getKeyOrder <em>Key Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getKeyName()
 * @model
 * @generated
 */
public interface KeyName extends EObject {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.identifiers.IdentifierReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getKeyName_Keys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IdentifierReference> getKeys();

	/**
	 * Returns the value of the '<em><b>Key Order</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.tables.SortingOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Order</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.tables.SortingOrder
	 * @see #setKeyOrder(SortingOrder)
	 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getKeyName_KeyOrder()
	 * @model required="true"
	 * @generated
	 */
	SortingOrder getKeyOrder();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.tables.KeyName#getKeyOrder <em>Key Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Order</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.tables.SortingOrder
	 * @see #getKeyOrder()
	 * @generated
	 */
	void setKeyOrder(SortingOrder value);

} // KeyName
