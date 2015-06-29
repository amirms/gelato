/**
 */
package org.servicifi.gelato.language.cobol.literals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>High Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getHighValues()
 * @model
 * @generated
 */
public enum HighValues implements Enumerator {
	/**
	 * The '<em><b>High Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_VALUE(0, "highValue", "HIGH-VALUE"),

	/**
	 * The '<em><b>High Values</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUES_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_VALUES(1, "highValues", "HIGH-VALUES");

	/**
	 * The '<em><b>High Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @model name="highValue" literal="HIGH-VALUE"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE_VALUE = 0;

	/**
	 * The '<em><b>High Values</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Values</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUES
	 * @model name="highValues" literal="HIGH-VALUES"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUES_VALUE = 1;

	/**
	 * An array of all the '<em><b>High Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HighValues[] VALUES_ARRAY =
		new HighValues[] {
			HIGH_VALUE,
			HIGH_VALUES,
		};

	/**
	 * A public read-only list of all the '<em><b>High Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HighValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>High Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HighValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HighValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>High Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HighValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HighValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>High Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HighValues get(int value) {
		switch (value) {
			case HIGH_VALUE_VALUE: return HIGH_VALUE;
			case HIGH_VALUES_VALUE: return HIGH_VALUES;
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
	private HighValues(int value, String name, String literal) {
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
	
} //HighValues
