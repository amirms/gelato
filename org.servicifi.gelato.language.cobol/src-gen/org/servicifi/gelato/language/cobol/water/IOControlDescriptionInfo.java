/**
 */
package org.servicifi.gelato.language.cobol.water;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IO Control Description Info</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getIOControlDescriptionInfo()
 * @model
 * @generated
 */
public enum IOControlDescriptionInfo implements Enumerator {
	/**
	 * The '<em><b>Rerun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RERUN_VALUE
	 * @generated
	 * @ordered
	 */
	RERUN(0, "rerun", "RERUN"),

	/**
	 * The '<em><b>On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_VALUE
	 * @generated
	 * @ordered
	 */
	ON(1, "on", "ON"),

	/**
	 * The '<em><b>Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OF_VALUE
	 * @generated
	 * @ordered
	 */
	OF(2, "of", "OF"),

	/**
	 * The '<em><b>Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD(3, "record", "RECORD"),

	/**
	 * The '<em><b>Records</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORDS_VALUE
	 * @generated
	 * @ordered
	 */
	RECORDS(4, "records", "RECORDS"),

	/**
	 * The '<em><b>Every</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERY_VALUE
	 * @generated
	 * @ordered
	 */
	EVERY(5, "every", "EVERY"),

	/**
	 * The '<em><b>Same</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAME_VALUE
	 * @generated
	 * @ordered
	 */
	SAME(6, "same", "SAME"),

	/**
	 * The '<em><b>Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(7, "area", "AREA"),

	/**
	 * The '<em><b>For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOR_VALUE
	 * @generated
	 * @ordered
	 */
	FOR(8, "for", "FOR"),

	/**
	 * The '<em><b>Multiple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE(9, "multiple", "MULTIPLE"),

	/**
	 * The '<em><b>File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_VALUE
	 * @generated
	 * @ordered
	 */
	FILE(10, "file", "FILE"),

	/**
	 * The '<em><b>Tape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAPE_VALUE
	 * @generated
	 * @ordered
	 */
	TAPE(11, "tape", "TAPE"),

	/**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(12, "contains", "contains"),

	/**
	 * The '<em><b>Position</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITION_VALUE
	 * @generated
	 * @ordered
	 */
	POSITION(13, "position", "POSITION"),

	/**
	 * The '<em><b>Apply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_VALUE
	 * @generated
	 * @ordered
	 */
	APPLY(14, "apply", "APPLY"),

	/**
	 * The '<em><b>Write Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_ONLY(15, "writeOnly", "WRITE-ONLY"),

	/**
	 * The '<em><b>Sort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SORT_VALUE
	 * @generated
	 * @ordered
	 */
	SORT(16, "sort", "SORT"),

	/**
	 * The '<em><b>Sort Merge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SORT_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	SORT_MERGE(17, "sortMerge", "SORT-MERGE"),

	/**
	 * The '<em><b>Reel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REEL_VALUE
	 * @generated
	 * @ordered
	 */
	REEL(18, "reel", "REEL"),

	/**
	 * The '<em><b>Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT(19, "unit", "UNIT");

	/**
	 * The '<em><b>Rerun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rerun</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RERUN
	 * @model name="rerun" literal="RERUN"
	 * @generated
	 * @ordered
	 */
	public static final int RERUN_VALUE = 0;

	/**
	 * The '<em><b>On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON
	 * @model name="on" literal="ON"
	 * @generated
	 * @ordered
	 */
	public static final int ON_VALUE = 1;

	/**
	 * The '<em><b>Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Of</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OF
	 * @model name="of" literal="OF"
	 * @generated
	 * @ordered
	 */
	public static final int OF_VALUE = 2;

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
	public static final int RECORD_VALUE = 3;

	/**
	 * The '<em><b>Records</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Records</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORDS
	 * @model name="records" literal="RECORDS"
	 * @generated
	 * @ordered
	 */
	public static final int RECORDS_VALUE = 4;

	/**
	 * The '<em><b>Every</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Every</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVERY
	 * @model name="every" literal="EVERY"
	 * @generated
	 * @ordered
	 */
	public static final int EVERY_VALUE = 5;

	/**
	 * The '<em><b>Same</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Same</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAME
	 * @model name="same" literal="SAME"
	 * @generated
	 * @ordered
	 */
	public static final int SAME_VALUE = 6;

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
	public static final int AREA_VALUE = 7;

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
	public static final int FOR_VALUE = 8;

	/**
	 * The '<em><b>Multiple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE
	 * @model name="multiple" literal="MULTIPLE"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_VALUE = 9;

	/**
	 * The '<em><b>File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE
	 * @model name="file" literal="FILE"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_VALUE = 10;

	/**
	 * The '<em><b>Tape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tape</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAPE
	 * @model name="tape" literal="TAPE"
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_VALUE = 11;

	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contains</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model name="contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 12;

	/**
	 * The '<em><b>Position</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Position</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITION
	 * @model name="position" literal="POSITION"
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_VALUE = 13;

	/**
	 * The '<em><b>Apply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Apply</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLY
	 * @model name="apply" literal="APPLY"
	 * @generated
	 * @ordered
	 */
	public static final int APPLY_VALUE = 14;

	/**
	 * The '<em><b>Write Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY
	 * @model name="writeOnly" literal="WRITE-ONLY"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_ONLY_VALUE = 15;

	/**
	 * The '<em><b>Sort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sort</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SORT
	 * @model name="sort" literal="SORT"
	 * @generated
	 * @ordered
	 */
	public static final int SORT_VALUE = 16;

	/**
	 * The '<em><b>Sort Merge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sort Merge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SORT_MERGE
	 * @model name="sortMerge" literal="SORT-MERGE"
	 * @generated
	 * @ordered
	 */
	public static final int SORT_MERGE_VALUE = 17;

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
	public static final int REEL_VALUE = 18;

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
	public static final int UNIT_VALUE = 19;

	/**
	 * An array of all the '<em><b>IO Control Description Info</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IOControlDescriptionInfo[] VALUES_ARRAY =
		new IOControlDescriptionInfo[] {
			RERUN,
			ON,
			OF,
			RECORD,
			RECORDS,
			EVERY,
			SAME,
			AREA,
			FOR,
			MULTIPLE,
			FILE,
			TAPE,
			CONTAINS,
			POSITION,
			APPLY,
			WRITE_ONLY,
			SORT,
			SORT_MERGE,
			REEL,
			UNIT,
		};

	/**
	 * A public read-only list of all the '<em><b>IO Control Description Info</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IOControlDescriptionInfo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IO Control Description Info</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOControlDescriptionInfo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOControlDescriptionInfo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Control Description Info</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOControlDescriptionInfo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOControlDescriptionInfo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Control Description Info</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOControlDescriptionInfo get(int value) {
		switch (value) {
			case RERUN_VALUE: return RERUN;
			case ON_VALUE: return ON;
			case OF_VALUE: return OF;
			case RECORD_VALUE: return RECORD;
			case RECORDS_VALUE: return RECORDS;
			case EVERY_VALUE: return EVERY;
			case SAME_VALUE: return SAME;
			case AREA_VALUE: return AREA;
			case FOR_VALUE: return FOR;
			case MULTIPLE_VALUE: return MULTIPLE;
			case FILE_VALUE: return FILE;
			case TAPE_VALUE: return TAPE;
			case CONTAINS_VALUE: return CONTAINS;
			case POSITION_VALUE: return POSITION;
			case APPLY_VALUE: return APPLY;
			case WRITE_ONLY_VALUE: return WRITE_ONLY;
			case SORT_VALUE: return SORT;
			case SORT_MERGE_VALUE: return SORT_MERGE;
			case REEL_VALUE: return REEL;
			case UNIT_VALUE: return UNIT;
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
	private IOControlDescriptionInfo(int value, String name, String literal) {
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
	
} //IOControlDescriptionInfo
