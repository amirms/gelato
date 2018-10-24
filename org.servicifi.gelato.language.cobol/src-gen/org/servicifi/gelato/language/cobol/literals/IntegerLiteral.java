/**
 */
package org.servicifi.gelato.language.cobol.literals;

import org.servicifi.gelato.language.cobol.water.FileDescriptorWater;
import org.servicifi.gelato.language.cobol.water.IOControlParagraphWater;
import org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.literals.IntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends NumericLiteral, ObjectComputerParagraphWater, FileDescriptorWater, IOControlParagraphWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getIntegerLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.literals.IntegerLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // IntegerLiteral
