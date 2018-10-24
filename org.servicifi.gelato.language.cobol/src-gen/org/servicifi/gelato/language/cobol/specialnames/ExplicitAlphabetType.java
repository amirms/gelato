/**
 */
package org.servicifi.gelato.language.cobol.specialnames;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.arithmetics.RangeExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Alphabet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.ExplicitAlphabetType#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getExplicitAlphabetType()
 * @model
 * @generated
 */
public interface ExplicitAlphabetType extends AlphabetType {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.arithmetics.RangeExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getExplicitAlphabetType_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RangeExpression> getRange();

} // ExplicitAlphabetType
