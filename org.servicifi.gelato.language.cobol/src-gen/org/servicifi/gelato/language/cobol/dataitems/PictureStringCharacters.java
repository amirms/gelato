/**
 */
package org.servicifi.gelato.language.cobol.dataitems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Picture String Characters</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getPictureStringCharacters()
 * @model
 * @generated
 */
public enum PictureStringCharacters implements Enumerator {
	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "any", "X"),

	/**
	 * The '<em><b>Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	BLANK(1, "blank", "B"),

	/**
	 * The '<em><b>Sign</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGN_VALUE
	 * @generated
	 * @ordered
	 */
	SIGN(2, "sign", "S"),

	/**
	 * The '<em><b>Leading Zero</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEADING_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	LEADING_ZERO(3, "leadingZero", "Z"),

	/**
	 * The '<em><b>Decimal Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL_POINT(4, "decimalPoint", "P"),

	/**
	 * The '<em><b>Numeric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC(5, "numeric", "9"),

	/**
	 * The '<em><b>Assumed Decimal Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSUMED_DECIMAL_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSUMED_DECIMAL_POINT(6, "assumedDecimalPoint", "V"),

	/**
	 * The '<em><b>Alphabetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHABETIC_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHABETIC(7, "alphabetic", "A"),

	/**
	 * The '<em><b>National</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONAL(8, "national", "N"),

	/**
	 * The '<em><b>Credit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	CREDIT(9, "credit", "CR"),

	/**
	 * The '<em><b>Debit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIT_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIT(10, "debit", "DB"),

	/**
	 * The '<em><b>Zero</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO(11, "zero", "0"),

	/**
	 * The '<em><b>Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS(12, "plus", "+"),

	/**
	 * The '<em><b>Negative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE(13, "negative", "-"),

	/**
	 * The '<em><b>Exponent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPONENT(14, "exponent", "E"),

	/**
	 * The '<em><b>Period</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	PERIOD(15, "period", "."),

	/**
	 * The '<em><b>Comma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMA_VALUE
	 * @generated
	 * @ordered
	 */
	COMMA(16, "comma", ","),

	/**
	 * The '<em><b>Dollar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOLLAR_VALUE
	 * @generated
	 * @ordered
	 */
	DOLLAR(17, "dollar", "$"),

	/**
	 * The '<em><b>Asterik</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASTERIK_VALUE
	 * @generated
	 * @ordered
	 */
	ASTERIK(18, "asterik", "*"),

	/**
	 * The '<em><b>Slash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLASH_VALUE
	 * @generated
	 * @ordered
	 */
	SLASH(19, "slash", "/"),

	/**
	 * The '<em><b>Escape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	ESCAPE(20, "escape", "\\\\");

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model name="any" literal="X"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLANK
	 * @model name="blank" literal="B"
	 * @generated
	 * @ordered
	 */
	public static final int BLANK_VALUE = 1;

	/**
	 * The '<em><b>Sign</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sign</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGN
	 * @model name="sign" literal="S"
	 * @generated
	 * @ordered
	 */
	public static final int SIGN_VALUE = 2;

	/**
	 * The '<em><b>Leading Zero</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Leading Zero</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEADING_ZERO
	 * @model name="leadingZero" literal="Z"
	 * @generated
	 * @ordered
	 */
	public static final int LEADING_ZERO_VALUE = 3;

	/**
	 * The '<em><b>Decimal Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decimal Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_POINT
	 * @model name="decimalPoint" literal="P"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_POINT_VALUE = 4;

	/**
	 * The '<em><b>Numeric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numeric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @model name="numeric" literal="9"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_VALUE = 5;

	/**
	 * The '<em><b>Assumed Decimal Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assumed Decimal Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSUMED_DECIMAL_POINT
	 * @model name="assumedDecimalPoint" literal="V"
	 * @generated
	 * @ordered
	 */
	public static final int ASSUMED_DECIMAL_POINT_VALUE = 6;

	/**
	 * The '<em><b>Alphabetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alphabetic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHABETIC
	 * @model name="alphabetic" literal="A"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHABETIC_VALUE = 7;

	/**
	 * The '<em><b>National</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>National</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONAL
	 * @model name="national" literal="N"
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_VALUE = 8;

	/**
	 * The '<em><b>Credit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Credit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREDIT
	 * @model name="credit" literal="CR"
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_VALUE = 9;

	/**
	 * The '<em><b>Debit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIT
	 * @model name="debit" literal="DB"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIT_VALUE = 10;

	/**
	 * The '<em><b>Zero</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zero</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO
	 * @model name="zero" literal="0"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_VALUE = 11;

	/**
	 * The '<em><b>Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS
	 * @model name="plus" literal="+"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_VALUE = 12;

	/**
	 * The '<em><b>Negative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Negative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE
	 * @model name="negative" literal="-"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_VALUE = 13;

	/**
	 * The '<em><b>Exponent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exponent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPONENT
	 * @model name="exponent" literal="E"
	 * @generated
	 * @ordered
	 */
	public static final int EXPONENT_VALUE = 14;

	/**
	 * The '<em><b>Period</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Period</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIOD
	 * @model name="period" literal="."
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_VALUE = 15;

	/**
	 * The '<em><b>Comma</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comma</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMA
	 * @model name="comma" literal=","
	 * @generated
	 * @ordered
	 */
	public static final int COMMA_VALUE = 16;

	/**
	 * The '<em><b>Dollar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dollar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOLLAR
	 * @model name="dollar" literal="$"
	 * @generated
	 * @ordered
	 */
	public static final int DOLLAR_VALUE = 17;

	/**
	 * The '<em><b>Asterik</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asterik</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASTERIK
	 * @model name="asterik" literal="*"
	 * @generated
	 * @ordered
	 */
	public static final int ASTERIK_VALUE = 18;

	/**
	 * The '<em><b>Slash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Slash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLASH
	 * @model name="slash" literal="/"
	 * @generated
	 * @ordered
	 */
	public static final int SLASH_VALUE = 19;

	/**
	 * The '<em><b>Escape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Escape</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESCAPE
	 * @model name="escape" literal="\\\\"
	 * @generated
	 * @ordered
	 */
	public static final int ESCAPE_VALUE = 20;

	/**
	 * An array of all the '<em><b>Picture String Characters</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PictureStringCharacters[] VALUES_ARRAY =
		new PictureStringCharacters[] {
			ANY,
			BLANK,
			SIGN,
			LEADING_ZERO,
			DECIMAL_POINT,
			NUMERIC,
			ASSUMED_DECIMAL_POINT,
			ALPHABETIC,
			NATIONAL,
			CREDIT,
			DEBIT,
			ZERO,
			PLUS,
			NEGATIVE,
			EXPONENT,
			PERIOD,
			COMMA,
			DOLLAR,
			ASTERIK,
			SLASH,
			ESCAPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Picture String Characters</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PictureStringCharacters> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Picture String Characters</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PictureStringCharacters get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PictureStringCharacters result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Picture String Characters</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PictureStringCharacters getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PictureStringCharacters result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Picture String Characters</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PictureStringCharacters get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case BLANK_VALUE: return BLANK;
			case SIGN_VALUE: return SIGN;
			case LEADING_ZERO_VALUE: return LEADING_ZERO;
			case DECIMAL_POINT_VALUE: return DECIMAL_POINT;
			case NUMERIC_VALUE: return NUMERIC;
			case ASSUMED_DECIMAL_POINT_VALUE: return ASSUMED_DECIMAL_POINT;
			case ALPHABETIC_VALUE: return ALPHABETIC;
			case NATIONAL_VALUE: return NATIONAL;
			case CREDIT_VALUE: return CREDIT;
			case DEBIT_VALUE: return DEBIT;
			case ZERO_VALUE: return ZERO;
			case PLUS_VALUE: return PLUS;
			case NEGATIVE_VALUE: return NEGATIVE;
			case EXPONENT_VALUE: return EXPONENT;
			case PERIOD_VALUE: return PERIOD;
			case COMMA_VALUE: return COMMA;
			case DOLLAR_VALUE: return DOLLAR;
			case ASTERIK_VALUE: return ASTERIK;
			case SLASH_VALUE: return SLASH;
			case ESCAPE_VALUE: return ESCAPE;
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
	private PictureStringCharacters(int value, String name, String literal) {
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
	
} //PictureStringCharacters
