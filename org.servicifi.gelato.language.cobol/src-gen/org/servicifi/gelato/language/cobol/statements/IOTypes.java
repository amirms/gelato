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
 * A representation of the literals of the enumeration '<em><b>IO Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getIOTypes()
 * @model
 * @generated
 */
public enum IOTypes implements Enumerator {
	/**
	 * The '<em><b>Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT(0, "input", "INPUT"),

	/**
	 * The '<em><b>Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT(1, "output", "OUTPUT"),

	/**
	 * The '<em><b>Io</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_VALUE
	 * @generated
	 * @ordered
	 */
	IO(2, "io", "I-O"),

	/**
	 * The '<em><b>Extend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTEND_VALUE
	 * @generated
	 * @ordered
	 */
	EXTEND(3, "extend", "EXTEND");

	/**
	 * The '<em><b>Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUT
	 * @model name="input" literal="INPUT"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_VALUE = 0;

	/**
	 * The '<em><b>Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Output</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTPUT
	 * @model name="output" literal="OUTPUT"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_VALUE = 1;

	/**
	 * The '<em><b>Io</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Io</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IO
	 * @model name="io" literal="I-O"
	 * @generated
	 * @ordered
	 */
	public static final int IO_VALUE = 2;

	/**
	 * The '<em><b>Extend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extend</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTEND
	 * @model name="extend" literal="EXTEND"
	 * @generated
	 * @ordered
	 */
	public static final int EXTEND_VALUE = 3;

	/**
	 * An array of all the '<em><b>IO Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IOTypes[] VALUES_ARRAY =
		new IOTypes[] {
			INPUT,
			OUTPUT,
			IO,
			EXTEND,
		};

	/**
	 * A public read-only list of all the '<em><b>IO Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IOTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IO Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOTypes get(int value) {
		switch (value) {
			case INPUT_VALUE: return INPUT;
			case OUTPUT_VALUE: return OUTPUT;
			case IO_VALUE: return IO;
			case EXTEND_VALUE: return EXTEND;
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
	private IOTypes(int value, String name, String literal) {
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
	
} //IOTypes
