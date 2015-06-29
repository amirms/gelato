/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.servicifi.gelato.language.cobol.operators.Negate;
import org.servicifi.gelato.language.cobol.operators.RelationalOperator;

import org.servicifi.gelato.language.cobol.verbs.Is;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abbreviated Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getChild <em>Child</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getNegateOperator <em>Negate Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getAbbreviatedRelationalExpression()
 * @model
 * @generated
 */
public interface AbbreviatedRelationalExpression extends NegatedAbbreviatedConditionalExpressionChild {
	/**
	 * Returns the value of the '<em><b>Relational Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relational Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational Operator</em>' containment reference.
	 * @see #setRelationalOperator(RelationalOperator)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getAbbreviatedRelationalExpression_RelationalOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelationalOperator getRelationalOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getRelationalOperator <em>Relational Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Operator</em>' containment reference.
	 * @see #getRelationalOperator()
	 * @generated
	 */
	void setRelationalOperator(RelationalOperator value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(AbbreviatedRelationalExpressionChild)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getAbbreviatedRelationalExpression_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbbreviatedRelationalExpressionChild getChild();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(AbbreviatedRelationalExpressionChild value);

	/**
	 * Returns the value of the '<em><b>Negate Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negate Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negate Operator</em>' containment reference.
	 * @see #setNegateOperator(Negate)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getAbbreviatedRelationalExpression_NegateOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Negate getNegateOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getNegateOperator <em>Negate Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negate Operator</em>' containment reference.
	 * @see #getNegateOperator()
	 * @generated
	 */
	void setNegateOperator(Negate value);

	/**
	 * Returns the value of the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' containment reference.
	 * @see #setIs(Is)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getAbbreviatedRelationalExpression_Is()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Is getIs();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getIs <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' containment reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(Is value);

} // AbbreviatedRelationalExpression
