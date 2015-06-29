/**
 */
package org.servicifi.gelato.language.cobol.dataitems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Usages</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getUsages()
 * @model
 * @generated
 */
public enum Usages implements Enumerator {
	/**
	 * The '<em><b>Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(0, "binary", "BINARY"),

	/**
	 * The '<em><b>Computational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTATIONAL(1, "computational", "COMPUTATIONAL"),

	/**
	 * The '<em><b>Comp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMP_VALUE
	 * @generated
	 * @ordered
	 */
	COMP(2, "comp", "COMP"),

	/**
	 * The '<em><b>Display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY(3, "display", "DISPLAY"),

	/**
	 * The '<em><b>Display1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY1_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY1(4, "display1", "DISPLAY-1"),

	/**
	 * The '<em><b>Index</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEX_VALUE
	 * @generated
	 * @ordered
	 */
	INDEX(5, "index", "INDEX"),

	/**
	 * The '<em><b>Packed Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKED_DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	PACKED_DECIMAL(6, "packedDecimal", "PACKED-DECIMAL"),

	/**
	 * The '<em><b>Computational1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL1_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTATIONAL1(7, "computational1", "COMPUTATIONAL-1"),

	/**
	 * The '<em><b>Comp1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMP1_VALUE
	 * @generated
	 * @ordered
	 */
	COMP1(8, "comp1", "COMP-1"),

	/**
	 * The '<em><b>Computational2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL2_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTATIONAL2(9, "computational2", "COMPUTATIONAL-2"),

	/**
	 * The '<em><b>Comp2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMP2_VALUE
	 * @generated
	 * @ordered
	 */
	COMP2(10, "comp2", "comp2"),

	/**
	 * The '<em><b>Computational3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL3_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTATIONAL3(11, "computational3", "COMPUTATIONAL-3"),

	/**
	 * The '<em><b>Comp3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMP3_VALUE
	 * @generated
	 * @ordered
	 */
	COMP3(12, "comp3", "COMP-3"),

	/**
	 * The '<em><b>Computational4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL4_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTATIONAL4(13, "computational4", "COMPUTATIONAL-4"),

	/**
	 * The '<em><b>Comp4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMP4_VALUE
	 * @generated
	 * @ordered
	 */
	COMP4(14, "comp4", "COMP-4"),

	/**
	 * The '<em><b>Computational5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL5_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTATIONAL5(15, "computational5", "COMPUTATIONAL-5"),

	/**
	 * The '<em><b>Comp5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMP5_VALUE
	 * @generated
	 * @ordered
	 */
	COMP5(16, "comp5", "COMP-5"),

	/**
	 * The '<em><b>Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	POINTER(17, "pointer", "POINTER"),

	/**
	 * The '<em><b>Procedure Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE_POINTER(18, "procedurePointer", "PROCEDURE-POINTER"),

	/**
	 * The '<em><b>Function Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_POINTER(19, "functionPointer", "FUNCTION-POINTER"),

	/**
	 * The '<em><b>National</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONAL(20, "national", "NATIONAL");

	/**
	 * The '<em><b>Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Binary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @model name="binary" literal="BINARY"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 0;

	/**
	 * The '<em><b>Computational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computational</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL
	 * @model name="computational" literal="COMPUTATIONAL"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTATIONAL_VALUE = 1;

	/**
	 * The '<em><b>Comp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMP
	 * @model name="comp" literal="COMP"
	 * @generated
	 * @ordered
	 */
	public static final int COMP_VALUE = 2;

	/**
	 * The '<em><b>Display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Display</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPLAY
	 * @model name="display" literal="DISPLAY"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY_VALUE = 3;

	/**
	 * The '<em><b>Display1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Display1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPLAY1
	 * @model name="display1" literal="DISPLAY-1"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY1_VALUE = 4;

	/**
	 * The '<em><b>Index</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Index</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDEX
	 * @model name="index" literal="INDEX"
	 * @generated
	 * @ordered
	 */
	public static final int INDEX_VALUE = 5;

	/**
	 * The '<em><b>Packed Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Packed Decimal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKED_DECIMAL
	 * @model name="packedDecimal" literal="PACKED-DECIMAL"
	 * @generated
	 * @ordered
	 */
	public static final int PACKED_DECIMAL_VALUE = 6;

	/**
	 * The '<em><b>Computational1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computational1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL1
	 * @model name="computational1" literal="COMPUTATIONAL-1"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTATIONAL1_VALUE = 7;

	/**
	 * The '<em><b>Comp1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comp1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMP1
	 * @model name="comp1" literal="COMP-1"
	 * @generated
	 * @ordered
	 */
	public static final int COMP1_VALUE = 8;

	/**
	 * The '<em><b>Computational2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computational2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL2
	 * @model name="computational2" literal="COMPUTATIONAL-2"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTATIONAL2_VALUE = 9;

	/**
	 * The '<em><b>Comp2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comp2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMP2
	 * @model name="comp2"
	 * @generated
	 * @ordered
	 */
	public static final int COMP2_VALUE = 10;

	/**
	 * The '<em><b>Computational3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computational3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL3
	 * @model name="computational3" literal="COMPUTATIONAL-3"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTATIONAL3_VALUE = 11;

	/**
	 * The '<em><b>Comp3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comp3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMP3
	 * @model name="comp3" literal="COMP-3"
	 * @generated
	 * @ordered
	 */
	public static final int COMP3_VALUE = 12;

	/**
	 * The '<em><b>Computational4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computational4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL4
	 * @model name="computational4" literal="COMPUTATIONAL-4"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTATIONAL4_VALUE = 13;

	/**
	 * The '<em><b>Comp4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comp4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMP4
	 * @model name="comp4" literal="COMP-4"
	 * @generated
	 * @ordered
	 */
	public static final int COMP4_VALUE = 14;

	/**
	 * The '<em><b>Computational5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computational5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL5
	 * @model name="computational5" literal="COMPUTATIONAL-5"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTATIONAL5_VALUE = 15;

	/**
	 * The '<em><b>Comp5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comp5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMP5
	 * @model name="comp5" literal="COMP-5"
	 * @generated
	 * @ordered
	 */
	public static final int COMP5_VALUE = 16;

	/**
	 * The '<em><b>Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINTER
	 * @model name="pointer" literal="POINTER"
	 * @generated
	 * @ordered
	 */
	public static final int POINTER_VALUE = 17;

	/**
	 * The '<em><b>Procedure Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Procedure Pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_POINTER
	 * @model name="procedurePointer" literal="PROCEDURE-POINTER"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_POINTER_VALUE = 18;

	/**
	 * The '<em><b>Function Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_POINTER
	 * @model name="functionPointer" literal="FUNCTION-POINTER"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_POINTER_VALUE = 19;

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
	public static final int NATIONAL_VALUE = 20;

	/**
	 * An array of all the '<em><b>Usages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Usages[] VALUES_ARRAY =
		new Usages[] {
			BINARY,
			COMPUTATIONAL,
			COMP,
			DISPLAY,
			DISPLAY1,
			INDEX,
			PACKED_DECIMAL,
			COMPUTATIONAL1,
			COMP1,
			COMPUTATIONAL2,
			COMP2,
			COMPUTATIONAL3,
			COMP3,
			COMPUTATIONAL4,
			COMP4,
			COMPUTATIONAL5,
			COMP5,
			POINTER,
			PROCEDURE_POINTER,
			FUNCTION_POINTER,
			NATIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Usages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Usages> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Usages</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Usages get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Usages result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usages</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Usages getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Usages result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usages</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Usages get(int value) {
		switch (value) {
			case BINARY_VALUE: return BINARY;
			case COMPUTATIONAL_VALUE: return COMPUTATIONAL;
			case COMP_VALUE: return COMP;
			case DISPLAY_VALUE: return DISPLAY;
			case DISPLAY1_VALUE: return DISPLAY1;
			case INDEX_VALUE: return INDEX;
			case PACKED_DECIMAL_VALUE: return PACKED_DECIMAL;
			case COMPUTATIONAL1_VALUE: return COMPUTATIONAL1;
			case COMP1_VALUE: return COMP1;
			case COMPUTATIONAL2_VALUE: return COMPUTATIONAL2;
			case COMP2_VALUE: return COMP2;
			case COMPUTATIONAL3_VALUE: return COMPUTATIONAL3;
			case COMP3_VALUE: return COMP3;
			case COMPUTATIONAL4_VALUE: return COMPUTATIONAL4;
			case COMP4_VALUE: return COMP4;
			case COMPUTATIONAL5_VALUE: return COMPUTATIONAL5;
			case COMP5_VALUE: return COMP5;
			case POINTER_VALUE: return POINTER;
			case PROCEDURE_POINTER_VALUE: return PROCEDURE_POINTER;
			case FUNCTION_POINTER_VALUE: return FUNCTION_POINTER;
			case NATIONAL_VALUE: return NATIONAL;
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
	private Usages(int value, String name, String literal) {
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
	
} //Usages
