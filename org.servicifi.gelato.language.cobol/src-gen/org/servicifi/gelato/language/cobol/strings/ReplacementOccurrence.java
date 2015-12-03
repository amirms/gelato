/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replacement Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getReplacementOccurrence()
 * @model
 * @generated
 */
public interface ReplacementOccurrence extends Occurrence, Replacement {
	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.strings.Replacement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrences</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getReplacementOccurrence_Occurrences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Replacement> getOccurrences();

} // ReplacementOccurrence
