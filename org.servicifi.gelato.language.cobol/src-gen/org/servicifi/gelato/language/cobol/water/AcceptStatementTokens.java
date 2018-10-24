/**
 */
package org.servicifi.gelato.language.cobol.water;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Accept Statement Tokens</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getAcceptStatementTokens()
 * @model
 * @generated
 */
public enum AcceptStatementTokens implements Enumerator {
	/**
	 * The '<em><b>From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_VALUE
	 * @generated
	 * @ordered
	 */
	FROM(0, "from", "FROM"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(1, "date", "DATE"),

	/**
	 * The '<em><b>Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(2, "day", "DAY"),

	/**
	 * The '<em><b>Dow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOW_VALUE
	 * @generated
	 * @ordered
	 */
	DOW(3, "dow", "DAY-OF-WEEK"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(4, "time", "TIME"),

	/**
	 * The '<em><b>Dateformat1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATEFORMAT1_VALUE
	 * @generated
	 * @ordered
	 */
	DATEFORMAT1(5, "dateformat1", "YYYMMDD"),

	/**
	 * The '<em><b>Dateformat2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATEFORMAT2_VALUE
	 * @generated
	 * @ordered
	 */
	DATEFORMAT2(6, "dateformat2", "YYYYDDD");

	/**
	 * The '<em><b>From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM
	 * @model name="from" literal="FROM"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_VALUE = 0;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="date" literal="DATE"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 1;

	/**
	 * The '<em><b>Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY
	 * @model name="day" literal="DAY"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 2;

	/**
	 * The '<em><b>Dow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOW
	 * @model name="dow" literal="DAY-OF-WEEK"
	 * @generated
	 * @ordered
	 */
	public static final int DOW_VALUE = 3;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="time" literal="TIME"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 4;

	/**
	 * The '<em><b>Dateformat1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dateformat1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATEFORMAT1
	 * @model name="dateformat1" literal="YYYMMDD"
	 * @generated
	 * @ordered
	 */
	public static final int DATEFORMAT1_VALUE = 5;

	/**
	 * The '<em><b>Dateformat2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dateformat2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATEFORMAT2
	 * @model name="dateformat2" literal="YYYYDDD"
	 * @generated
	 * @ordered
	 */
	public static final int DATEFORMAT2_VALUE = 6;

	/**
	 * An array of all the '<em><b>Accept Statement Tokens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AcceptStatementTokens[] VALUES_ARRAY =
		new AcceptStatementTokens[] {
			FROM,
			DATE,
			DAY,
			DOW,
			TIME,
			DATEFORMAT1,
			DATEFORMAT2,
		};

	/**
	 * A public read-only list of all the '<em><b>Accept Statement Tokens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AcceptStatementTokens> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Accept Statement Tokens</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcceptStatementTokens get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcceptStatementTokens result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Accept Statement Tokens</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcceptStatementTokens getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcceptStatementTokens result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Accept Statement Tokens</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcceptStatementTokens get(int value) {
		switch (value) {
			case FROM_VALUE: return FROM;
			case DATE_VALUE: return DATE;
			case DAY_VALUE: return DAY;
			case DOW_VALUE: return DOW;
			case TIME_VALUE: return TIME;
			case DATEFORMAT1_VALUE: return DATEFORMAT1;
			case DATEFORMAT2_VALUE: return DATEFORMAT2;
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
	private AcceptStatementTokens(int value, String name, String literal) {
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
	
} //AcceptStatementTokens
