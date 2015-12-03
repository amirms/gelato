/**
 */
package org.servicifi.gelato.language.cobol.environments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Selects</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getSelects()
 * @model
 * @generated
 */
public enum Selects implements Enumerator {
	/**
	 * The '<em><b>S1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S1_VALUE
	 * @generated
	 * @ordered
	 */
	S1(0, "s1", "S01"),

	/**
	 * The '<em><b>S2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S2_VALUE
	 * @generated
	 * @ordered
	 */
	S2(1, "s2", "S02"),

	/**
	 * The '<em><b>S3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S3_VALUE
	 * @generated
	 * @ordered
	 */
	S3(2, "s3", "S03"),

	/**
	 * The '<em><b>S4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S4_VALUE
	 * @generated
	 * @ordered
	 */
	S4(3, "s4", "S04"),

	/**
	 * The '<em><b>S5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S5_VALUE
	 * @generated
	 * @ordered
	 */
	S5(4, "s5", "S05");

	/**
	 * The '<em><b>S1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S1
	 * @model name="s1" literal="S01"
	 * @generated
	 * @ordered
	 */
	public static final int S1_VALUE = 0;

	/**
	 * The '<em><b>S2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S2
	 * @model name="s2" literal="S02"
	 * @generated
	 * @ordered
	 */
	public static final int S2_VALUE = 1;

	/**
	 * The '<em><b>S3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S3
	 * @model name="s3" literal="S03"
	 * @generated
	 * @ordered
	 */
	public static final int S3_VALUE = 2;

	/**
	 * The '<em><b>S4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S4
	 * @model name="s4" literal="S04"
	 * @generated
	 * @ordered
	 */
	public static final int S4_VALUE = 3;

	/**
	 * The '<em><b>S5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S5
	 * @model name="s5" literal="S05"
	 * @generated
	 * @ordered
	 */
	public static final int S5_VALUE = 4;

	/**
	 * An array of all the '<em><b>Selects</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Selects[] VALUES_ARRAY =
		new Selects[] {
			S1,
			S2,
			S3,
			S4,
			S5,
		};

	/**
	 * A public read-only list of all the '<em><b>Selects</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Selects> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Selects</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Selects get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Selects result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Selects</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Selects getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Selects result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Selects</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Selects get(int value) {
		switch (value) {
			case S1_VALUE: return S1;
			case S2_VALUE: return S2;
			case S3_VALUE: return S3;
			case S4_VALUE: return S4;
			case S5_VALUE: return S5;
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
	private Selects(int value, String name, String literal) {
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
	
} //Selects
