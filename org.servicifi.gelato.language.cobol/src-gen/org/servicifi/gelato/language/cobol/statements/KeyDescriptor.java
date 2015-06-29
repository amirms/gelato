/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.KeyDescriptor#getOrder <em>Order</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.KeyDescriptor#getKeyNames <em>Key Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getKeyDescriptor()
 * @model
 * @generated
 */
public interface KeyDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.statements.Orders}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Orders
	 * @see #setOrder(Orders)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getKeyDescriptor_Order()
	 * @model required="true"
	 * @generated
	 */
	Orders getOrder();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.KeyDescriptor#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Orders
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Orders value);

	/**
	 * Returns the value of the '<em><b>Key Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.identifiers.IdentifierReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Names</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getKeyDescriptor_KeyNames()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IdentifierReference> getKeyNames();

} // KeyDescriptor
