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
 * A representation of the literals of the enumeration '<em><b>Exit Labels</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getExitLabels()
 * @model
 * @generated
 */
public enum ExitLabels implements Enumerator {
	/**
	 * The '<em><b>Program</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRAM(0, "program", "PROGRAM"),

	/**
	 * The '<em><b>Paragraph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH(1, "paragraph", "PARAGRAPH"),

	/**
	 * The '<em><b>Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD(2, "method", "METHOD");

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
	public static final int PROGRAM_VALUE = 0;

	/**
	 * The '<em><b>Paragraph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paragraph</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH
	 * @model name="paragraph" literal="PARAGRAPH"
	 * @generated
	 * @ordered
	 */
	public static final int PARAGRAPH_VALUE = 1;

	/**
	 * The '<em><b>Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD
	 * @model name="method" literal="METHOD"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Exit Labels</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExitLabels[] VALUES_ARRAY =
		new ExitLabels[] {
			PROGRAM,
			PARAGRAPH,
			METHOD,
		};

	/**
	 * A public read-only list of all the '<em><b>Exit Labels</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExitLabels> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exit Labels</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExitLabels get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExitLabels result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exit Labels</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExitLabels getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExitLabels result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exit Labels</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExitLabels get(int value) {
		switch (value) {
			case PROGRAM_VALUE: return PROGRAM;
			case PARAGRAPH_VALUE: return PARAGRAPH;
			case METHOD_VALUE: return METHOD;
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
	private ExitLabels(int value, String name, String literal) {
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
	
} //ExitLabels
