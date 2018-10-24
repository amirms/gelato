/**
 */
package org.servicifi.gelato.language.cobol.statements;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Corresponding</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getCorresponding()
 * @model
 * @generated
 */
public enum Corresponding implements Enumerator {
	/**
	 * The '<em><b>Corr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORR_VALUE
	 * @generated
	 * @ordered
	 */
	CORR(0, "corr", "CORR"),

	/**
	 * The '<em><b>Corresponding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRESPONDING_VALUE
	 * @generated
	 * @ordered
	 */
	CORRESPONDING(1, "corresponding", "CORRESPONDING");

	/**
	 * The '<em><b>Corr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Corr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORR
	 * @model name="corr" literal="CORR"
	 * @generated
	 * @ordered
	 */
	public static final int CORR_VALUE = 0;

	/**
	 * The '<em><b>Corresponding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Corresponding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORRESPONDING
	 * @model name="corresponding" literal="CORRESPONDING"
	 * @generated
	 * @ordered
	 */
	public static final int CORRESPONDING_VALUE = 1;

	/**
	 * An array of all the '<em><b>Corresponding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Corresponding[] VALUES_ARRAY =
		new Corresponding[] {
			CORR,
			CORRESPONDING,
		};

	/**
	 * A public read-only list of all the '<em><b>Corresponding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Corresponding> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Corresponding</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Corresponding get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Corresponding result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Corresponding</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Corresponding getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Corresponding result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Corresponding</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Corresponding get(int value) {
		switch (value) {
			case CORR_VALUE: return CORR;
			case CORRESPONDING_VALUE: return CORRESPONDING;
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
	private Corresponding(int value, String name, String literal) {
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
	
} //Corresponding
