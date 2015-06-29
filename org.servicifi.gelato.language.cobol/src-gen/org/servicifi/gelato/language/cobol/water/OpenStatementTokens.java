/**
 */
package org.servicifi.gelato.language.cobol.water;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Open Statement Tokens</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getOpenStatementTokens()
 * @model
 * @generated
 */
public enum OpenStatementTokens implements Enumerator {
	/**
	 * The '<em><b>Reversed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERSED_VALUE
	 * @generated
	 * @ordered
	 */
	REVERSED(0, "reversed", "REVERSED"),

	/**
	 * The '<em><b>With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITH_VALUE
	 * @generated
	 * @ordered
	 */
	WITH(1, "with", "WITH"),

	/**
	 * The '<em><b>No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(2, "no", "NO"),

	/**
	 * The '<em><b>Rewind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REWIND_VALUE
	 * @generated
	 * @ordered
	 */
	REWIND(3, "rewind", "REWIND");

	/**
	 * The '<em><b>Reversed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reversed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERSED
	 * @model name="reversed" literal="REVERSED"
	 * @generated
	 * @ordered
	 */
	public static final int REVERSED_VALUE = 0;

	/**
	 * The '<em><b>With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>With</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WITH
	 * @model name="with" literal="WITH"
	 * @generated
	 * @ordered
	 */
	public static final int WITH_VALUE = 1;

	/**
	 * The '<em><b>No</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO
	 * @model name="no" literal="NO"
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 2;

	/**
	 * The '<em><b>Rewind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rewind</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REWIND
	 * @model name="rewind" literal="REWIND"
	 * @generated
	 * @ordered
	 */
	public static final int REWIND_VALUE = 3;

	/**
	 * An array of all the '<em><b>Open Statement Tokens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OpenStatementTokens[] VALUES_ARRAY =
		new OpenStatementTokens[] {
			REVERSED,
			WITH,
			NO,
			REWIND,
		};

	/**
	 * A public read-only list of all the '<em><b>Open Statement Tokens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OpenStatementTokens> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Open Statement Tokens</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenStatementTokens get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OpenStatementTokens result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Open Statement Tokens</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenStatementTokens getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OpenStatementTokens result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Open Statement Tokens</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenStatementTokens get(int value) {
		switch (value) {
			case REVERSED_VALUE: return REVERSED;
			case WITH_VALUE: return WITH;
			case NO_VALUE: return NO;
			case REWIND_VALUE: return REWIND;
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
	private OpenStatementTokens(int value, String name, String literal) {
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
	
} //OpenStatementTokens
