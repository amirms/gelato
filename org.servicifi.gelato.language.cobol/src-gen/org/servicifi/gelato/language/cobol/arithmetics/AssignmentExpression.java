/**
 */
package org.servicifi.gelato.language.cobol.arithmetics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.operators.Equal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getAssignmentExpression()
 * @model
 * @generated
 */
public interface AssignmentExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignment Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Operator</em>' containment reference.
	 * @see #setAssignmentOperator(Equal)
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getAssignmentExpression_AssignmentOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Equal getAssignmentOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Operator</em>' containment reference.
	 * @see #getAssignmentOperator()
	 * @generated
	 */
	void setAssignmentOperator(Equal value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getAssignmentExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ArithmeticExpression> getChildren();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ArithmeticExpression)
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getAssignmentExpression_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpression getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ArithmeticExpression value);

} // AssignmentExpression
