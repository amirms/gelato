/**
 */
package org.servicifi.gelato.language.cobol.specialnames;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Predefined Alphabet Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getPredefinedAlphabetTypes()
 * @model
 * @generated
 */
public enum PredefinedAlphabetTypes implements Enumerator {
	/**
	 * The '<em><b>Standard1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD1_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD1(0, "standard1", "STANDARD-1"),

	/**
	 * The '<em><b>Standard2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD2_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD2(1, "standard2", "STANDARD-2"),

	/**
	 * The '<em><b>Ebcdic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBCDIC_VALUE
	 * @generated
	 * @ordered
	 */
	EBCDIC(2, "ebcdic", "EBCDIC"),

	/**
	 * The '<em><b>Native</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NATIVE(3, "native", "NATIVE");

	/**
	 * The '<em><b>Standard1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD1
	 * @model name="standard1" literal="STANDARD-1"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD1_VALUE = 0;

	/**
	 * The '<em><b>Standard2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD2
	 * @model name="standard2" literal="STANDARD-2"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD2_VALUE = 1;

	/**
	 * The '<em><b>Ebcdic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ebcdic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EBCDIC
	 * @model name="ebcdic" literal="EBCDIC"
	 * @generated
	 * @ordered
	 */
	public static final int EBCDIC_VALUE = 2;

	/**
	 * The '<em><b>Native</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Native</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIVE
	 * @model name="native" literal="NATIVE"
	 * @generated
	 * @ordered
	 */
	public static final int NATIVE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Predefined Alphabet Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PredefinedAlphabetTypes[] VALUES_ARRAY =
		new PredefinedAlphabetTypes[] {
			STANDARD1,
			STANDARD2,
			EBCDIC,
			NATIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Predefined Alphabet Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PredefinedAlphabetTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Predefined Alphabet Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PredefinedAlphabetTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredefinedAlphabetTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Alphabet Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PredefinedAlphabetTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredefinedAlphabetTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Alphabet Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PredefinedAlphabetTypes get(int value) {
		switch (value) {
			case STANDARD1_VALUE: return STANDARD1;
			case STANDARD2_VALUE: return STANDARD2;
			case EBCDIC_VALUE: return EBCDIC;
			case NATIVE_VALUE: return NATIVE;
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
	private PredefinedAlphabetTypes(int value, String name, String literal) {
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
	
} //PredefinedAlphabetTypes
