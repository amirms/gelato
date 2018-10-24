/**
 */
package org.servicifi.gelato.language.cobol.environments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>System Outputs</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getSystemOutputs()
 * @model
 * @generated
 */
public enum SystemOutputs implements Enumerator {
	/**
	 * The '<em><b>Sysout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSOUT_VALUE
	 * @generated
	 * @ordered
	 */
	SYSOUT(0, "sysout", "SYSOUT"),

	/**
	 * The '<em><b>Syslist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSLIST_VALUE
	 * @generated
	 * @ordered
	 */
	SYSLIST(1, "syslist", "SYSLIST"),

	/**
	 * The '<em><b>Syslst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSLST_VALUE
	 * @generated
	 * @ordered
	 */
	SYSLST(2, "syslst", "SYSLST");

	/**
	 * The '<em><b>Sysout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sysout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSOUT
	 * @model name="sysout" literal="SYSOUT"
	 * @generated
	 * @ordered
	 */
	public static final int SYSOUT_VALUE = 0;

	/**
	 * The '<em><b>Syslist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Syslist</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSLIST
	 * @model name="syslist" literal="SYSLIST"
	 * @generated
	 * @ordered
	 */
	public static final int SYSLIST_VALUE = 1;

	/**
	 * The '<em><b>Syslst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Syslst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSLST
	 * @model name="syslst" literal="SYSLST"
	 * @generated
	 * @ordered
	 */
	public static final int SYSLST_VALUE = 2;

	/**
	 * An array of all the '<em><b>System Outputs</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SystemOutputs[] VALUES_ARRAY =
		new SystemOutputs[] {
			SYSOUT,
			SYSLIST,
			SYSLST,
		};

	/**
	 * A public read-only list of all the '<em><b>System Outputs</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SystemOutputs> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>System Outputs</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemOutputs get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemOutputs result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Outputs</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemOutputs getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemOutputs result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Outputs</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemOutputs get(int value) {
		switch (value) {
			case SYSOUT_VALUE: return SYSOUT;
			case SYSLIST_VALUE: return SYSLIST;
			case SYSLST_VALUE: return SYSLST;
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
	private SystemOutputs(int value, String name, String literal) {
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
	
} //SystemOutputs
