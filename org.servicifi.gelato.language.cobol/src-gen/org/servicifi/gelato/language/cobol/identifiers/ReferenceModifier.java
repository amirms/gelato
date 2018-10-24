/**
 */
package org.servicifi.gelato.language.cobol.identifiers;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier#getStart <em>Start</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getReferenceModifier()
 * @model
 * @generated
 */
public interface ReferenceModifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(ArithmeticExpression)
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getReferenceModifier_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpression getStart();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ArithmeticExpression value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(ArithmeticExpression)
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getReferenceModifier_Length()
	 * @model containment="true"
	 * @generated
	 */
	ArithmeticExpression getLength();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(ArithmeticExpression value);

} // ReferenceModifier
