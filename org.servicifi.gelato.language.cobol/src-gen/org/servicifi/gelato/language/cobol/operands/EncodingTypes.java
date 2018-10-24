/**
 */
package org.servicifi.gelato.language.cobol.operands;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Encoding Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.operands.OperandsPackage#getEncodingTypes()
 * @model
 * @generated
 */
public enum EncodingTypes implements Enumerator {
	/**
	 * The '<em><b>Alphabetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHABETIC_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHABETIC(0, "alphabetic", "ALPHABETIC"),

	/**
	 * The '<em><b>Alphanumeric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHANUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHANUMERIC(1, "alphanumeric", "ALPHANUMERIC"),

	/**
	 * The '<em><b>Alphanumeric Edited</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHANUMERIC_EDITED_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHANUMERIC_EDITED(2, "alphanumericEdited", "ALPHANUMERIC-EDITED"),

	/**
	 * The '<em><b>National</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONAL(3, "national", "NATIONAL"),

	/**
	 * The '<em><b>National Edited</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_EDITED_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONAL_EDITED(4, "nationalEdited", "NATIONAL-EDITED"),

	/**
	 * The '<em><b>Numeric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC(5, "numeric", "NUMERIC"),

	/**
	 * The '<em><b>Numeric Edited</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_EDITED_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC_EDITED(6, "numericEdited", "NUMERIC-EDITED"),

	/**
	 * The '<em><b>Dbcs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBCS_VALUE
	 * @generated
	 * @ordered
	 */
	DBCS(7, "dbcs", "DBCS"),

	/**
	 * The '<em><b>Egcs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGCS_VALUE
	 * @generated
	 * @ordered
	 */
	EGCS(8, "egcs", "EGCS");

	/**
	 * The '<em><b>Alphabetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alphabetic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHABETIC
	 * @model name="alphabetic" literal="ALPHABETIC"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHABETIC_VALUE = 0;

	/**
	 * The '<em><b>Alphanumeric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alphanumeric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHANUMERIC
	 * @model name="alphanumeric" literal="ALPHANUMERIC"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHANUMERIC_VALUE = 1;

	/**
	 * The '<em><b>Alphanumeric Edited</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alphanumeric Edited</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHANUMERIC_EDITED
	 * @model name="alphanumericEdited" literal="ALPHANUMERIC-EDITED"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHANUMERIC_EDITED_VALUE = 2;

	/**
	 * The '<em><b>National</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>National</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONAL
	 * @model name="national" literal="NATIONAL"
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_VALUE = 3;

	/**
	 * The '<em><b>National Edited</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>National Edited</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_EDITED
	 * @model name="nationalEdited" literal="NATIONAL-EDITED"
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_EDITED_VALUE = 4;

	/**
	 * The '<em><b>Numeric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numeric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @model name="numeric" literal="NUMERIC"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_VALUE = 5;

	/**
	 * The '<em><b>Numeric Edited</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numeric Edited</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_EDITED
	 * @model name="numericEdited" literal="NUMERIC-EDITED"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_EDITED_VALUE = 6;

	/**
	 * The '<em><b>Dbcs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dbcs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DBCS
	 * @model name="dbcs" literal="DBCS"
	 * @generated
	 * @ordered
	 */
	public static final int DBCS_VALUE = 7;

	/**
	 * The '<em><b>Egcs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Egcs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EGCS
	 * @model name="egcs" literal="EGCS"
	 * @generated
	 * @ordered
	 */
	public static final int EGCS_VALUE = 8;

	/**
	 * An array of all the '<em><b>Encoding Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncodingTypes[] VALUES_ARRAY =
		new EncodingTypes[] {
			ALPHABETIC,
			ALPHANUMERIC,
			ALPHANUMERIC_EDITED,
			NATIONAL,
			NATIONAL_EDITED,
			NUMERIC,
			NUMERIC_EDITED,
			DBCS,
			EGCS,
		};

	/**
	 * A public read-only list of all the '<em><b>Encoding Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncodingTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encoding Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncodingTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncodingTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncodingTypes get(int value) {
		switch (value) {
			case ALPHABETIC_VALUE: return ALPHABETIC;
			case ALPHANUMERIC_VALUE: return ALPHANUMERIC;
			case ALPHANUMERIC_EDITED_VALUE: return ALPHANUMERIC_EDITED;
			case NATIONAL_VALUE: return NATIONAL;
			case NATIONAL_EDITED_VALUE: return NATIONAL_EDITED;
			case NUMERIC_VALUE: return NUMERIC;
			case NUMERIC_EDITED_VALUE: return NUMERIC_EDITED;
			case DBCS_VALUE: return DBCS;
			case EGCS_VALUE: return EGCS;
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
	private EncodingTypes(int value, String name, String literal) {
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
	
} //EncodingTypes
