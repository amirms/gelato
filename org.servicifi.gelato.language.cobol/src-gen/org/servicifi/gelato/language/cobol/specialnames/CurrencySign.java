/**
 */
package org.servicifi.gelato.language.cobol.specialnames;

import org.servicifi.gelato.language.cobol.literals.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency Sign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.CurrencySign#getPictureSymbol <em>Picture Symbol</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.CurrencySign#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getCurrencySign()
 * @model
 * @generated
 */
public interface CurrencySign extends SpecialName, SpecialNameStatement {
	/**
	 * Returns the value of the '<em><b>Picture Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture Symbol</em>' attribute.
	 * @see #setPictureSymbol(String)
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getCurrencySign_PictureSymbol()
	 * @model
	 * @generated
	 */
	String getPictureSymbol();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.specialnames.CurrencySign#getPictureSymbol <em>Picture Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture Symbol</em>' attribute.
	 * @see #getPictureSymbol()
	 * @generated
	 */
	void setPictureSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference.
	 * @see #setCurrency(Literal)
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getCurrencySign_Currency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getCurrency();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.specialnames.CurrencySign#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' containment reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Literal value);

} // CurrencySign
