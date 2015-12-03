/**
 */
package org.servicifi.gelato.language.cobol.water;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Select Statement Clauses</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSelectStatementClauses()
 * @model
 * @generated
 */
public enum SelectStatementClauses implements Enumerator {
	/**
	 * The '<em><b>Alternate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATE_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATE(0, "alternate", "ALTERNATE"),

	/**
	 * The '<em><b>Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD(1, "record", "RECORD"),

	/**
	 * The '<em><b>Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_VALUE
	 * @generated
	 * @ordered
	 */
	KEY(2, "key", "KEY"),

	/**
	 * The '<em><b>Relative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE(3, "relative", "RELATIVE"),

	/**
	 * The '<em><b>Delimiter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIMITER_VALUE
	 * @generated
	 * @ordered
	 */
	DELIMITER(4, "delimiter", "DELIMITER"),

	/**
	 * The '<em><b>Standard1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD1_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD1(5, "standard1", "STANDARD-1"),

	/**
	 * The '<em><b>Padding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADDING_VALUE
	 * @generated
	 * @ordered
	 */
	PADDING(6, "padding", "PADDING"),

	/**
	 * The '<em><b>Character</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTER(7, "character", "CHARACTER"),

	/**
	 * The '<em><b>Reserve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVE_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVE(8, "reserve", "RESERVE"),

	/**
	 * The '<em><b>Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(9, "area", "AREA"),

	/**
	 * The '<em><b>Areas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREAS_VALUE
	 * @generated
	 * @ordered
	 */
	AREAS(10, "areas", "AREAS"),

	/**
	 * The '<em><b>Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS(11, "access", "ACCESS"),

	/**
	 * The '<em><b>Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_VALUE
	 * @generated
	 * @ordered
	 */
	MODE(12, "mode", "MODE"),

	/**
	 * The '<em><b>Is</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_VALUE
	 * @generated
	 * @ordered
	 */
	IS(13, "is", "IS"),

	/**
	 * The '<em><b>Sequential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENTIAL(14, "sequential", "SEQUENTIAL"),

	/**
	 * The '<em><b>Random</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM(15, "random", "random"),

	/**
	 * The '<em><b>With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITH_VALUE
	 * @generated
	 * @ordered
	 */
	WITH(16, "with", "WITH"),

	/**
	 * The '<em><b>Dynamic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMIC(17, "dynamic", "DYNAMIC"),

	/**
	 * The '<em><b>Organization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION(18, "organization", "ORGANIZATION"),

	/**
	 * The '<em><b>Duplicates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATES_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATES(19, "duplicates", "DUPLICATES"),

	/**
	 * The '<em><b>Indexed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEXED_VALUE
	 * @generated
	 * @ordered
	 */
	INDEXED(20, "indexed", "INDEXED");

	/**
	 * The '<em><b>Alternate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alternate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALTERNATE
	 * @model name="alternate" literal="ALTERNATE"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATE_VALUE = 0;

	/**
	 * The '<em><b>Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Record</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD
	 * @model name="record" literal="RECORD"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_VALUE = 1;

	/**
	 * The '<em><b>Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEY
	 * @model name="key" literal="KEY"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_VALUE = 2;

	/**
	 * The '<em><b>Relative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIVE
	 * @model name="relative" literal="RELATIVE"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_VALUE = 3;

	/**
	 * The '<em><b>Delimiter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delimiter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELIMITER
	 * @model name="delimiter" literal="DELIMITER"
	 * @generated
	 * @ordered
	 */
	public static final int DELIMITER_VALUE = 4;

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
	public static final int STANDARD1_VALUE = 5;

	/**
	 * The '<em><b>Padding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADDING
	 * @model name="padding" literal="PADDING"
	 * @generated
	 * @ordered
	 */
	public static final int PADDING_VALUE = 6;

	/**
	 * The '<em><b>Character</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Character</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER
	 * @model name="character" literal="CHARACTER"
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_VALUE = 7;

	/**
	 * The '<em><b>Reserve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reserve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESERVE
	 * @model name="reserve" literal="RESERVE"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVE_VALUE = 8;

	/**
	 * The '<em><b>Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Area</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AREA
	 * @model name="area" literal="AREA"
	 * @generated
	 * @ordered
	 */
	public static final int AREA_VALUE = 9;

	/**
	 * The '<em><b>Areas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Areas</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AREAS
	 * @model name="areas" literal="AREAS"
	 * @generated
	 * @ordered
	 */
	public static final int AREAS_VALUE = 10;

	/**
	 * The '<em><b>Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Access</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCESS
	 * @model name="access" literal="ACCESS"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_VALUE = 11;

	/**
	 * The '<em><b>Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mode</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODE
	 * @model name="mode" literal="MODE"
	 * @generated
	 * @ordered
	 */
	public static final int MODE_VALUE = 12;

	/**
	 * The '<em><b>Is</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS
	 * @model name="is" literal="IS"
	 * @generated
	 * @ordered
	 */
	public static final int IS_VALUE = 13;

	/**
	 * The '<em><b>Sequential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL
	 * @model name="sequential" literal="SEQUENTIAL"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENTIAL_VALUE = 14;

	/**
	 * The '<em><b>Random</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Random</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANDOM
	 * @model name="random"
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_VALUE = 15;

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
	public static final int WITH_VALUE = 16;

	/**
	 * The '<em><b>Dynamic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dynamic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC
	 * @model name="dynamic" literal="DYNAMIC"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_VALUE = 17;

	/**
	 * The '<em><b>Organization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Organization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION
	 * @model name="organization" literal="ORGANIZATION"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_VALUE = 18;

	/**
	 * The '<em><b>Duplicates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Duplicates</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUPLICATES
	 * @model name="duplicates" literal="DUPLICATES"
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATES_VALUE = 19;

	/**
	 * The '<em><b>Indexed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Indexed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDEXED
	 * @model name="indexed" literal="INDEXED"
	 * @generated
	 * @ordered
	 */
	public static final int INDEXED_VALUE = 20;

	/**
	 * An array of all the '<em><b>Select Statement Clauses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SelectStatementClauses[] VALUES_ARRAY =
		new SelectStatementClauses[] {
			ALTERNATE,
			RECORD,
			KEY,
			RELATIVE,
			DELIMITER,
			STANDARD1,
			PADDING,
			CHARACTER,
			RESERVE,
			AREA,
			AREAS,
			ACCESS,
			MODE,
			IS,
			SEQUENTIAL,
			RANDOM,
			WITH,
			DYNAMIC,
			ORGANIZATION,
			DUPLICATES,
			INDEXED,
		};

	/**
	 * A public read-only list of all the '<em><b>Select Statement Clauses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SelectStatementClauses> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Select Statement Clauses</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SelectStatementClauses get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectStatementClauses result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Select Statement Clauses</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SelectStatementClauses getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectStatementClauses result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Select Statement Clauses</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SelectStatementClauses get(int value) {
		switch (value) {
			case ALTERNATE_VALUE: return ALTERNATE;
			case RECORD_VALUE: return RECORD;
			case KEY_VALUE: return KEY;
			case RELATIVE_VALUE: return RELATIVE;
			case DELIMITER_VALUE: return DELIMITER;
			case STANDARD1_VALUE: return STANDARD1;
			case PADDING_VALUE: return PADDING;
			case CHARACTER_VALUE: return CHARACTER;
			case RESERVE_VALUE: return RESERVE;
			case AREA_VALUE: return AREA;
			case AREAS_VALUE: return AREAS;
			case ACCESS_VALUE: return ACCESS;
			case MODE_VALUE: return MODE;
			case IS_VALUE: return IS;
			case SEQUENTIAL_VALUE: return SEQUENTIAL;
			case RANDOM_VALUE: return RANDOM;
			case WITH_VALUE: return WITH;
			case DYNAMIC_VALUE: return DYNAMIC;
			case ORGANIZATION_VALUE: return ORGANIZATION;
			case DUPLICATES_VALUE: return DUPLICATES;
			case INDEXED_VALUE: return INDEXED;
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
	private SelectStatementClauses(int value, String name, String literal) {
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
	
} //SelectStatementClauses
