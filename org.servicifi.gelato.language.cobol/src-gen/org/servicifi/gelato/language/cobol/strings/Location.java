/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.Location#getPosition <em>Position</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.Location#isInitial <em>Initial</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.Location#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.strings.Positions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.strings.Positions
	 * @see #setPosition(Positions)
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getLocation_Position()
	 * @model required="true"
	 * @generated
	 */
	Positions getPosition();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.strings.Location#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.strings.Positions
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Positions value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getLocation_Initial()
	 * @model required="true"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.strings.Location#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getLocation_Base()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryOperand getBase();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.strings.Location#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(PrimaryOperand value);

} // Location
