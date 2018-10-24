/**
 */
package org.servicifi.gelato.language.cobol.water;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>File Description Info</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getFileDescriptionInfo()
 * @model
 * @generated
 */
public enum FileDescriptionInfo implements Enumerator {
	/**
	 * The '<em><b>Block</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCK(0, "block", "BLOCK"),

	/**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(1, "contains", "CONTAINS"),

	/**
	 * The '<em><b>To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_VALUE
	 * @generated
	 * @ordered
	 */
	TO(2, "to", "TO"),

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
	 * The '<em><b>Records</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORDS_VALUE
	 * @generated
	 * @ordered
	 */
	RECORDS(4, "records", "RECORDS"),

	/**
	 * The '<em><b>Code Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_SET_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_SET(5, "codeSet", "CODE-SET"),

	/**
	 * The '<em><b>Is</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_VALUE
	 * @generated
	 * @ordered
	 */
	IS(6, "is", "IS"),

	/**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(7, "data", "DATA"),

	/**
	 * The '<em><b>Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD(8, "record", "RECORD"),

	/**
	 * The '<em><b>Are</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARE_VALUE
	 * @generated
	 * @ordered
	 */
	ARE(9, "are", "ARE"),

	/**
	 * The '<em><b>Label</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(10, "label", "LABEL"),

	/**
	 * The '<em><b>Omitted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	OMITTED(11, "omitted", "OMITTED"),

	/**
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(12, "standard", "STANDARD"),

	/**
	 * The '<em><b>Linage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LINAGE(13, "linage", "LINAGE"),

	/**
	 * The '<em><b>Lines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINES_VALUE
	 * @generated
	 * @ordered
	 */
	LINES(14, "lines", "LINES"),

	/**
	 * The '<em><b>With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITH_VALUE
	 * @generated
	 * @ordered
	 */
	WITH(15, "with", "WITH"),

	/**
	 * The '<em><b>Footing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOOTING_VALUE
	 * @generated
	 * @ordered
	 */
	FOOTING(16, "footing", "FOOTING"),

	/**
	 * The '<em><b>At</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_VALUE
	 * @generated
	 * @ordered
	 */
	AT(17, "at", "AT"),

	/**
	 * The '<em><b>Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_VALUE
	 * @generated
	 * @ordered
	 */
	TOP(18, "top", "TOP"),

	/**
	 * The '<em><b>Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM(19, "bottom", "BOTTOM"),

	/**
	 * The '<em><b>Varying</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARYING_VALUE
	 * @generated
	 * @ordered
	 */
	VARYING(20, "varying", "VARYING"),

	/**
	 * The '<em><b>In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(21, "in", "IN"),

	/**
	 * The '<em><b>Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	SIZE(22, "size", "SIZE"),

	/**
	 * The '<em><b>From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_VALUE
	 * @generated
	 * @ordered
	 */
	FROM(23, "from", "FROM"),

	/**
	 * The '<em><b>Depending</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDING_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDING(24, "depending", "DEPENDING"),

	/**
	 * The '<em><b>On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_VALUE
	 * @generated
	 * @ordered
	 */
	ON(25, "on", "ON"),

	/**
	 * The '<em><b>Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_VALUE
	 * @generated
	 * @ordered
	 */
	MODE(26, "mode", "MODE"),

	/**
	 * The '<em><b>Recording</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORDING_VALUE
	 * @generated
	 * @ordered
	 */
	RECORDING(27, "recording", "RECORDING"),

	/**
	 * The '<em><b>F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F_VALUE
	 * @generated
	 * @ordered
	 */
	F(28, "f", "F"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(29, "v", "V"),

	/**
	 * The '<em><b>U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U_VALUE
	 * @generated
	 * @ordered
	 */
	U(30, "u", "U"),

	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(31, "s", "S"),

	/**
	 * The '<em><b>Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(32, "value", "VALUE"),

	/**
	 * The '<em><b>Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OF_VALUE
	 * @generated
	 * @ordered
	 */
	OF(33, "of", "OF"),

	/**
	 * The '<em><b>Identification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFICATION(34, "identification", "IDENTIFICATION"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(35, "id", "ID"),

	/**
	 * The '<em><b>Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT(36, "report", "REPORT"),

	/**
	 * The '<em><b>Reports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTS_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTS(37, "reports", "REPORTS");

	/**
	 * The '<em><b>Block</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Block</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOCK
	 * @model name="block" literal="BLOCK"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCK_VALUE = 0;

	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contains</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model name="contains" literal="CONTAINS"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 1;

	/**
	 * The '<em><b>To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO
	 * @model name="to" literal="TO"
	 * @generated
	 * @ordered
	 */
	public static final int TO_VALUE = 2;

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
	 * The '<em><b>Code Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Code Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE_SET
	 * @model name="codeSet" literal="CODE-SET"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_SET_VALUE = 5;

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
	public static final int IS_VALUE = 6;

	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model name="data" literal="DATA"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 7;

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
	public static final int RECORD_VALUE = 8;

	/**
	 * The '<em><b>Are</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Are</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARE
	 * @model name="are" literal="ARE"
	 * @generated
	 * @ordered
	 */
	public static final int ARE_VALUE = 9;

	/**
	 * The '<em><b>Label</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Label</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL
	 * @model name="label" literal="LABEL"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 10;

	/**
	 * The '<em><b>Omitted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Omitted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OMITTED
	 * @model name="omitted" literal="OMITTED"
	 * @generated
	 * @ordered
	 */
	public static final int OMITTED_VALUE = 11;

	/**
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @model name="standard" literal="STANDARD"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 12;

	/**
	 * The '<em><b>Linage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINAGE
	 * @model name="linage" literal="LINAGE"
	 * @generated
	 * @ordered
	 */
	public static final int LINAGE_VALUE = 13;

	/**
	 * The '<em><b>Lines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lines</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINES
	 * @model name="lines" literal="LINES"
	 * @generated
	 * @ordered
	 */
	public static final int LINES_VALUE = 14;

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
	public static final int WITH_VALUE = 15;

	/**
	 * The '<em><b>Footing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Footing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOOTING
	 * @model name="footing" literal="FOOTING"
	 * @generated
	 * @ordered
	 */
	public static final int FOOTING_VALUE = 16;

	/**
	 * The '<em><b>At</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>At</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AT
	 * @model name="at" literal="AT"
	 * @generated
	 * @ordered
	 */
	public static final int AT_VALUE = 17;

	/**
	 * The '<em><b>Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP
	 * @model name="top" literal="TOP"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_VALUE = 18;

	/**
	 * The '<em><b>Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM
	 * @model name="bottom" literal="BOTTOM"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_VALUE = 19;

	/**
	 * The '<em><b>Varying</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Varying</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARYING
	 * @model name="varying" literal="VARYING"
	 * @generated
	 * @ordered
	 */
	public static final int VARYING_VALUE = 20;

	/**
	 * The '<em><b>In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @model name="in" literal="IN"
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 21;

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
	public static final int SIZE_VALUE = 22;

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
	public static final int FROM_VALUE = 23;

	/**
	 * The '<em><b>Depending</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Depending</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDING
	 * @model name="depending" literal="DEPENDING"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDING_VALUE = 24;

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
	public static final int ON_VALUE = 25;

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
	public static final int MODE_VALUE = 26;

	/**
	 * The '<em><b>Recording</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recording</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORDING
	 * @model name="recording" literal="RECORDING"
	 * @generated
	 * @ordered
	 */
	public static final int RECORDING_VALUE = 27;

	/**
	 * The '<em><b>F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F
	 * @model name="f" literal="F"
	 * @generated
	 * @ordered
	 */
	public static final int F_VALUE = 28;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #V
	 * @model name="v" literal="V"
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 29;

	/**
	 * The '<em><b>U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #U
	 * @model name="u" literal="U"
	 * @generated
	 * @ordered
	 */
	public static final int U_VALUE = 30;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S
	 * @model name="s" literal="S"
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 31;

	/**
	 * The '<em><b>Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @model name="value" literal="VALUE"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 32;

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
	public static final int OF_VALUE = 33;

	/**
	 * The '<em><b>Identification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Identification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDENTIFICATION
	 * @model name="identification" literal="IDENTIFICATION"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFICATION_VALUE = 34;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID
	 * @model name="id" literal="ID"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 35;

	/**
	 * The '<em><b>Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Report</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPORT
	 * @model name="report" literal="REPORT"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_VALUE = 36;

	/**
	 * The '<em><b>Reports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reports</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPORTS
	 * @model name="reports" literal="REPORTS"
	 * @generated
	 * @ordered
	 */
	public static final int REPORTS_VALUE = 37;

	/**
	 * An array of all the '<em><b>File Description Info</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FileDescriptionInfo[] VALUES_ARRAY =
		new FileDescriptionInfo[] {
			BLOCK,
			CONTAINS,
			TO,
			CHARACTERS,
			RECORDS,
			CODE_SET,
			IS,
			DATA,
			RECORD,
			ARE,
			LABEL,
			OMITTED,
			STANDARD,
			LINAGE,
			LINES,
			WITH,
			FOOTING,
			AT,
			TOP,
			BOTTOM,
			VARYING,
			IN,
			SIZE,
			FROM,
			DEPENDING,
			ON,
			MODE,
			RECORDING,
			F,
			V,
			U,
			S,
			VALUE,
			OF,
			IDENTIFICATION,
			ID,
			REPORT,
			REPORTS,
		};

	/**
	 * A public read-only list of all the '<em><b>File Description Info</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FileDescriptionInfo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>File Description Info</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FileDescriptionInfo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileDescriptionInfo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Description Info</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FileDescriptionInfo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileDescriptionInfo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Description Info</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FileDescriptionInfo get(int value) {
		switch (value) {
			case BLOCK_VALUE: return BLOCK;
			case CONTAINS_VALUE: return CONTAINS;
			case TO_VALUE: return TO;
			case CHARACTERS_VALUE: return CHARACTERS;
			case RECORDS_VALUE: return RECORDS;
			case CODE_SET_VALUE: return CODE_SET;
			case IS_VALUE: return IS;
			case DATA_VALUE: return DATA;
			case RECORD_VALUE: return RECORD;
			case ARE_VALUE: return ARE;
			case LABEL_VALUE: return LABEL;
			case OMITTED_VALUE: return OMITTED;
			case STANDARD_VALUE: return STANDARD;
			case LINAGE_VALUE: return LINAGE;
			case LINES_VALUE: return LINES;
			case WITH_VALUE: return WITH;
			case FOOTING_VALUE: return FOOTING;
			case AT_VALUE: return AT;
			case TOP_VALUE: return TOP;
			case BOTTOM_VALUE: return BOTTOM;
			case VARYING_VALUE: return VARYING;
			case IN_VALUE: return IN;
			case SIZE_VALUE: return SIZE;
			case FROM_VALUE: return FROM;
			case DEPENDING_VALUE: return DEPENDING;
			case ON_VALUE: return ON;
			case MODE_VALUE: return MODE;
			case RECORDING_VALUE: return RECORDING;
			case F_VALUE: return F;
			case V_VALUE: return V;
			case U_VALUE: return U;
			case S_VALUE: return S;
			case VALUE_VALUE: return VALUE;
			case OF_VALUE: return OF;
			case IDENTIFICATION_VALUE: return IDENTIFICATION;
			case ID_VALUE: return ID;
			case REPORT_VALUE: return REPORT;
			case REPORTS_VALUE: return REPORTS;
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
	private FileDescriptionInfo(int value, String name, String literal) {
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
	
} //FileDescriptionInfo
