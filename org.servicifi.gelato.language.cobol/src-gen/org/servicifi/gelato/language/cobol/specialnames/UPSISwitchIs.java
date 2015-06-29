/**
 */
package org.servicifi.gelato.language.cobol.specialnames;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UPSI Switch Is</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs#getConditionNames <em>Condition Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getUPSISwitchIs()
 * @model
 * @generated
 */
public interface UPSISwitchIs extends MnemonicName, SpecialNameStatement {
	/**
	 * Returns the value of the '<em><b>Condition Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.specialnames.ConditionName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Names</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getUPSISwitchIs_ConditionNames()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<ConditionName> getConditionNames();

} // UPSISwitchIs
