/**
 */
package org.servicifi.gelato.language.cobol.water;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Close Statement Tokens</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getCloseStatementTokens()
 * @model
 * @generated
 */
public enum CloseStatementTokens implements Enumerator {
	/**
	 * The '<em><b>With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITH_VALUE
	 * @generated
	 * @ordered
	 */
	WITH(0, "with", "WITH"),

	/**
	 * The '<em><b>No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(1, "no", "NO"),

	/**
	 * The '<em><b>Rewind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REWIND_VALUE
	 * @generated
	 * @ordered
	 */
	REWIND(2, "rewind", "REWIND"),

	/**
	 * The '<em><b>Lock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	LOCK(3, "lock", "LOCK"),

	/**
	 * The '<em><b>Reel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REEL_VALUE
	 * @generated
	 * @ordered
	 */
	REEL(4, "reel", "REEL"),

	/**
	 * The '<em><b>Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT(5, "unit", "UNIT"),

	/**
	 * The '<em><b>For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOR_VALUE
	 * @generated
	 * @ordered
	 */
	FOR(6, "for", "FOR"),

	/**
	 * The '<em><b>Removal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVAL_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVAL(7, "removal", "REMOVAL");

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
	public static final int WITH_VALUE = 0;

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
	public static final int NO_VALUE = 1;

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
	public static final int REWIND_VALUE = 2;

	/**
	 * The '<em><b>Lock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lock</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCK
	 * @model name="lock" literal="LOCK"
	 * @generated
	 * @ordered
	 */
	public static final int LOCK_VALUE = 3;

	/**
	 * The '<em><b>Reel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REEL
	 * @model name="reel" literal="REEL"
	 * @generated
	 * @ordered
	 */
	public static final int REEL_VALUE = 4;

	/**
	 * The '<em><b>Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT
	 * @model name="unit" literal="UNIT"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_VALUE = 5;

	/**
	 * The '<em><b>For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>For</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOR
	 * @model name="for" literal="FOR"
	 * @generated
	 * @ordered
	 */
	public static final int FOR_VALUE = 6;

	/**
	 * The '<em><b>Removal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Removal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVAL
	 * @model name="removal" literal="REMOVAL"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVAL_VALUE = 7;

	/**
	 * An array of all the '<em><b>Close Statement Tokens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CloseStatementTokens[] VALUES_ARRAY =
		new CloseStatementTokens[] {
			WITH,
			NO,
			REWIND,
			LOCK,
			REEL,
			UNIT,
			FOR,
			REMOVAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Close Statement Tokens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CloseStatementTokens> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Close Statement Tokens</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloseStatementTokens get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloseStatementTokens result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Close Statement Tokens</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloseStatementTokens getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloseStatementTokens result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Close Statement Tokens</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloseStatementTokens get(int value) {
		switch (value) {
			case WITH_VALUE: return WITH;
			case NO_VALUE: return NO;
			case REWIND_VALUE: return REWIND;
			case LOCK_VALUE: return LOCK;
			case REEL_VALUE: return REEL;
			case UNIT_VALUE: return UNIT;
			case FOR_VALUE: return FOR;
			case REMOVAL_VALUE: return REMOVAL;
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
	private CloseStatementTokens(int value, String name, String literal) {
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
	
} //CloseStatementTokens
