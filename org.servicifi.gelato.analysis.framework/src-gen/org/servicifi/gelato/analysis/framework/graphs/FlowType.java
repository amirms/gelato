/**
 */
package org.servicifi.gelato.analysis.framework.graphs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Flow Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.analysis.framework.graphs.GraphsPackage#getFlowType()
 * @model
 * @generated
 */
public enum FlowType implements Enumerator {
	/**
	 * The '<em><b>Regular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR(0, "regular", "REGULAR"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(1, "procedure", "PROCEDURE"),

	/**
	 * The '<em><b>Summary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMMARY_VALUE
	 * @generated
	 * @ordered
	 */
	SUMMARY(2, "summary", "SUMMARY");

	/**
	 * The '<em><b>Regular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regular</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGULAR
	 * @model name="regular" literal="REGULAR"
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_VALUE = 0;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Procedure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE
	 * @model name="procedure" literal="PROCEDURE"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 1;

	/**
	 * The '<em><b>Summary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Summary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUMMARY
	 * @model name="summary" literal="SUMMARY"
	 * @generated
	 * @ordered
	 */
	public static final int SUMMARY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Flow Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FlowType[] VALUES_ARRAY =
		new FlowType[] {
			REGULAR,
			PROCEDURE,
			SUMMARY,
		};

	/**
	 * A public read-only list of all the '<em><b>Flow Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FlowType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Flow Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlowType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlowType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flow Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlowType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlowType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flow Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlowType get(int value) {
		switch (value) {
			case REGULAR_VALUE: return REGULAR;
			case PROCEDURE_VALUE: return PROCEDURE;
			case SUMMARY_VALUE: return SUMMARY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FlowType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FlowType
