/**
 */
package org.servicifi.gelato.language.cobol.water;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Special Names Clauses</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSpecialNamesClauses()
 * @model
 * @generated
 */
public enum SpecialNamesClauses implements Enumerator {
	/**
	 * The '<em><b>Decimal Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL_POINT(0, "decimalPoint", "DECIMAL-POINT"),

	/**
	 * The '<em><b>Is</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_VALUE
	 * @generated
	 * @ordered
	 */
	IS(1, "is", "IS"),

	/**
	 * The '<em><b>Comma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMA_VALUE
	 * @generated
	 * @ordered
	 */
	COMMA(2, "comma", "COMMA"),

	/**
	 * The '<em><b>Xml Schema</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_SCHEMA_VALUE
	 * @generated
	 * @ordered
	 */
	XML_SCHEMA(3, "xmlSchema", "XML-SCHEMA");

	/**
	 * The '<em><b>Decimal Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decimal Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_POINT
	 * @model name="decimalPoint" literal="DECIMAL-POINT"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_POINT_VALUE = 0;

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
	public static final int IS_VALUE = 1;

	/**
	 * The '<em><b>Comma</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comma</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMA
	 * @model name="comma" literal="COMMA"
	 * @generated
	 * @ordered
	 */
	public static final int COMMA_VALUE = 2;

	/**
	 * The '<em><b>Xml Schema</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xml Schema</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML_SCHEMA
	 * @model name="xmlSchema" literal="XML-SCHEMA"
	 * @generated
	 * @ordered
	 */
	public static final int XML_SCHEMA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Special Names Clauses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpecialNamesClauses[] VALUES_ARRAY =
		new SpecialNamesClauses[] {
			DECIMAL_POINT,
			IS,
			COMMA,
			XML_SCHEMA,
		};

	/**
	 * A public read-only list of all the '<em><b>Special Names Clauses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpecialNamesClauses> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Special Names Clauses</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecialNamesClauses get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecialNamesClauses result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Special Names Clauses</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecialNamesClauses getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecialNamesClauses result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Special Names Clauses</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecialNamesClauses get(int value) {
		switch (value) {
			case DECIMAL_POINT_VALUE: return DECIMAL_POINT;
			case IS_VALUE: return IS;
			case COMMA_VALUE: return COMMA;
			case XML_SCHEMA_VALUE: return XML_SCHEMA;
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
	private SpecialNamesClauses(int value, String name, String literal) {
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
	
} //SpecialNamesClauses
