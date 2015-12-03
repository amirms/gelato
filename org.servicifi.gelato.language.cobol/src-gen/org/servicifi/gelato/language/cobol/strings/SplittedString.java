/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Splitted String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.SplittedString#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getSplittedString()
 * @model
 * @generated
 */
public interface SplittedString extends ManipulatedStrings {
	/**
	 * Returns the value of the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' containment reference.
	 * @see #setCounter(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getSplittedString_Counter()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryOperand getCounter();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.strings.SplittedString#getCounter <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' containment reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(PrimaryOperand value);

} // SplittedString
