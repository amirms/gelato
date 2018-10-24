/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Phrase Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.SortPhraseToken#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSortPhraseToken()
 * @model
 * @generated
 */
public interface SortPhraseToken extends SortPhraseWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.SortPhraseTokens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.SortPhraseTokens
	 * @see #setValue(SortPhraseTokens)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSortPhraseToken_Value()
	 * @model required="true"
	 * @generated
	 */
	SortPhraseTokens getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.SortPhraseToken#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.SortPhraseTokens
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SortPhraseTokens value);

} // SortPhraseToken
