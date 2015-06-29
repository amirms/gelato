/**
 */
package org.servicifi.gelato.language.cobol.water;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Computer Description Info</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getObjectComputerDescriptionInfo()
 * @model
 * @generated
 */
public enum ObjectComputerDescriptionInfo implements Enumerator {
	/**
	 * The '<em><b>Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY(0, "memory", "MEMORY"),

	/**
	 * The '<em><b>Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	SIZE(1, "size", "SIZE"),

	/**
	 * The '<em><b>Words</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORDS_VALUE
	 * @generated
	 * @ordered
	 */
	WORDS(2, "words", "WORDS"),

	/**
	 * The '<em><b>Characters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTERS_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTERS(3, "characters", "CHARACTERS"),

	/**
	 * The '<em><b>Modules</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULES_VALUE
	 * @generated
	 * @ordered
	 */
	MODULES(4, "modules", "MODULES"),

	/**
	 * The '<em><b>Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SEGMENT(5, "segment", "SEGMENT"),

	/**
	 * The '<em><b>Program</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRAM(6, "program", "PROGRAM"),

	/**
	 * The '<em><b>Collating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLATING_VALUE
	 * @generated
	 * @ordered
	 */
	COLLATING(7, "collating", "COLLATING"),

	/**
	 * The '<em><b>Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE(8, "sequence", "SEQUENCE"),

	/**
	 * The '<em><b>Segment Limit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_LIMIT_VALUE
	 * @generated
	 * @ordered
	 */
	SEGMENT_LIMIT(9, "segmentLimit", "SEGMENT-LIMIT");

	/**
	 * The '<em><b>Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY
	 * @model name="memory" literal="MEMORY"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_VALUE = 0;

	/**
	 * The '<em><b>Size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Size</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIZE
	 * @model name="size" literal="SIZE"
	 * @generated
	 * @ordered
	 */
	public static final int SIZE_VALUE = 1;

	/**
	 * The '<em><b>Words</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Words</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORDS
	 * @model name="words" literal="WORDS"
	 * @generated
	 * @ordered
	 */
	public static final int WORDS_VALUE = 2;

	/**
	 * The '<em><b>Characters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Characters</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTERS
	 * @model name="characters" literal="CHARACTERS"
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTERS_VALUE = 3;

	/**
	 * The '<em><b>Modules</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Modules</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULES
	 * @model name="modules" literal="MODULES"
	 * @generated
	 * @ordered
	 */
	public static final int MODULES_VALUE = 4;

	/**
	 * The '<em><b>Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Segment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEGMENT
	 * @model name="segment" literal="SEGMENT"
	 * @generated
	 * @ordered
	 */
	public static final int SEGMENT_VALUE = 5;

	/**
	 * The '<em><b>Program</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Program</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROGRAM
	 * @model name="program" literal="PROGRAM"
	 * @generated
	 * @ordered
	 */
	public static final int PROGRAM_VALUE = 6;

	/**
	 * The '<em><b>Collating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collating</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLATING
	 * @model name="collating" literal="COLLATING"
	 * @generated
	 * @ordered
	 */
	public static final int COLLATING_VALUE = 7;

	/**
	 * The '<em><b>Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE
	 * @model name="sequence" literal="SEQUENCE"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_VALUE = 8;

	/**
	 * The '<em><b>Segment Limit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Segment Limit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_LIMIT
	 * @model name="segmentLimit" literal="SEGMENT-LIMIT"
	 * @generated
	 * @ordered
	 */
	public static final int SEGMENT_LIMIT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Object Computer Description Info</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectComputerDescriptionInfo[] VALUES_ARRAY =
		new ObjectComputerDescriptionInfo[] {
			MEMORY,
			SIZE,
			WORDS,
			CHARACTERS,
			MODULES,
			SEGMENT,
			PROGRAM,
			COLLATING,
			SEQUENCE,
			SEGMENT_LIMIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Computer Description Info</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectComputerDescriptionInfo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Computer Description Info</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectComputerDescriptionInfo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectComputerDescriptionInfo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Computer Description Info</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectComputerDescriptionInfo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectComputerDescriptionInfo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Computer Description Info</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectComputerDescriptionInfo get(int value) {
		switch (value) {
			case MEMORY_VALUE: return MEMORY;
			case SIZE_VALUE: return SIZE;
			case WORDS_VALUE: return WORDS;
			case CHARACTERS_VALUE: return CHARACTERS;
			case MODULES_VALUE: return MODULES;
			case SEGMENT_VALUE: return SEGMENT;
			case PROGRAM_VALUE: return PROGRAM;
			case COLLATING_VALUE: return COLLATING;
			case SEQUENCE_VALUE: return SEQUENCE;
			case SEGMENT_LIMIT_VALUE: return SEGMENT_LIMIT;
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
	private ObjectComputerDescriptionInfo(int value, String name, String literal) {
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
	
} //ObjectComputerDescriptionInfo
