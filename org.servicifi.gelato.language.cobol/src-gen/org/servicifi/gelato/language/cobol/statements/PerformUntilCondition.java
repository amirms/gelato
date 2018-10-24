/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.conditions.Condition;

import org.servicifi.gelato.language.cobol.strings.Positions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform Until Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.PerformUntilCondition#getPosition <em>Position</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.PerformUntilCondition#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getPerformUntilCondition()
 * @model abstract="true"
 * @generated
 */
public interface PerformUntilCondition extends Perform, VaryingUntilCondition {
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
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getPerformUntilCondition_Position()
	 * @model
	 * @generated
	 */
	Positions getPosition();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.PerformUntilCondition#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.strings.Positions
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Positions value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.conditions.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getPerformUntilCondition_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getConditions();

} // PerformUntilCondition
