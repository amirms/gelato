/**
 */
package org.servicifi.gelato.language.cobol.water;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CICS Statement Tokens</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getCICSStatementTokens()
 * @model
 * @generated
 */
public enum CICSStatementTokens implements Enumerator {
	/**
	 * The '<em><b>Ts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TS_VALUE
	 * @generated
	 * @ordered
	 */
	TS(0, "ts", "TS"),

	/**
	 * The '<em><b>Queue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEUE_VALUE
	 * @generated
	 * @ordered
	 */
	QUEUE(1, "queue", "QUEUE"),

	/**
	 * The '<em><b>Qname</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QNAME_VALUE
	 * @generated
	 * @ordered
	 */
	QNAME(2, "qname", "QNAME"),

	/**
	 * The '<em><b>Openpar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENPAR_VALUE
	 * @generated
	 * @ordered
	 */
	OPENPAR(3, "openpar", "("),

	/**
	 * The '<em><b>Closepar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEPAR_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSEPAR(4, "closepar", ")"),

	/**
	 * The '<em><b>Sysid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSID_VALUE
	 * @generated
	 * @ordered
	 */
	SYSID(5, "sysid", "SYSID"),

	/**
	 * The '<em><b>Sys</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYS_VALUE
	 * @generated
	 * @ordered
	 */
	SYS(6, "sys", "SYS"),

	/**
	 * The '<em><b>Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(7, "set", "SET"),

	/**
	 * The '<em><b>Into</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTO_VALUE
	 * @generated
	 * @ordered
	 */
	INTO(8, "into", "INTO"),

	/**
	 * The '<em><b>Length</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH(9, "length", "LENGTH"),

	/**
	 * The '<em><b>Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM(10, "item", "ITEM"),

	/**
	 * The '<em><b>Next</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT(11, "next", "NEXT"),

	/**
	 * The '<em><b>Numitems</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMITEMS_VALUE
	 * @generated
	 * @ordered
	 */
	NUMITEMS(12, "numitems", "NUMITEMS"),

	/**
	 * The '<em><b>Td</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TD_VALUE
	 * @generated
	 * @ordered
	 */
	TD(13, "td", "TD"),

	/**
	 * The '<em><b>Writeq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITEQ_VALUE
	 * @generated
	 * @ordered
	 */
	WRITEQ(14, "writeq", "WRITEQ"),

	/**
	 * The '<em><b>From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_VALUE
	 * @generated
	 * @ordered
	 */
	FROM(15, "from", "FROM"),

	/**
	 * The '<em><b>Rewrite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REWRITE_VALUE
	 * @generated
	 * @ordered
	 */
	REWRITE(16, "rewrite", "REWRITE"),

	/**
	 * The '<em><b>Nosuspend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOSUSPEND_VALUE
	 * @generated
	 * @ordered
	 */
	NOSUSPEND(17, "nosuspend", "NOSUSPEND"),

	/**
	 * The '<em><b>Main</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIN_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN(18, "main", "MAIN"),

	/**
	 * The '<em><b>Auxiliary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_VALUE
	 * @generated
	 * @ordered
	 */
	AUXILIARY(19, "auxiliary", "AUXILIARY"),

	/**
	 * The '<em><b>Deleteq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETEQ_VALUE
	 * @generated
	 * @ordered
	 */
	DELETEQ(20, "deleteq", "DELETEQ"),

	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(21, "read", "READ"),

	/**
	 * The '<em><b>File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_VALUE
	 * @generated
	 * @ordered
	 */
	FILE(22, "file", "FILE"),

	/**
	 * The '<em><b>Dataset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATASET_VALUE
	 * @generated
	 * @ordered
	 */
	DATASET(23, "dataset", "DATASET"),

	/**
	 * The '<em><b>Ridfld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIDFLD_VALUE
	 * @generated
	 * @ordered
	 */
	RIDFLD(24, "ridfld", "RIDFLD"),

	/**
	 * The '<em><b>Keylength</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYLENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	KEYLENGTH(25, "keylength", "KEYLENGTH"),

	/**
	 * The '<em><b>Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(26, "generic", "GENERIC"),

	/**
	 * The '<em><b>Gteq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTEQ_VALUE
	 * @generated
	 * @ordered
	 */
	GTEQ(27, "gteq", "GTEQ"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(28, "equal", "EQUAL"),

	/**
	 * The '<em><b>Uncommitted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCOMMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNCOMMITTED(29, "uncommitted", "UNCOMMITTED"),

	/**
	 * The '<em><b>Consistent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSISTENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSISTENT(30, "consistent", "CONSISTENT"),

	/**
	 * The '<em><b>Repeatable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEATABLE_VALUE
	 * @generated
	 * @ordered
	 */
	REPEATABLE(31, "repeatable", "REPEATABLE"),

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(32, "update", "UPDATE"),

	/**
	 * The '<em><b>Token</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN(33, "token", "TOKEN"),

	/**
	 * The '<em><b>Rba</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBA_VALUE
	 * @generated
	 * @ordered
	 */
	RBA(34, "rba", "RBA"),

	/**
	 * The '<em><b>Xrba</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XRBA_VALUE
	 * @generated
	 * @ordered
	 */
	XRBA(35, "xrba", "XRBA"),

	/**
	 * The '<em><b>Rrn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RRN_VALUE
	 * @generated
	 * @ordered
	 */
	RRN(36, "rrn", "RRN"),

	/**
	 * The '<em><b>Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE(37, "write", "WRITE"),

	/**
	 * The '<em><b>Massinsert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASSINSERT_VALUE
	 * @generated
	 * @ordered
	 */
	MASSINSERT(38, "massinsert", "MASSINSERT"),

	/**
	 * The '<em><b>Program</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRAM(39, "program", "PROGRAM"),

	/**
	 * The '<em><b>Commarea</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMAREA_VALUE
	 * @generated
	 * @ordered
	 */
	COMMAREA(40, "commarea", "COMMAREA"),

	/**
	 * The '<em><b>Datalength</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATALENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	DATALENGTH(41, "datalength", "DATALENGTH"),

	/**
	 * The '<em><b>Synconreturn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCONRETURN_VALUE
	 * @generated
	 * @ordered
	 */
	SYNCONRETURN(42, "synconreturn", "SYNCONRETURN"),

	/**
	 * The '<em><b>Transid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSID_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSID(43, "transid", "TRANSID"),

	/**
	 * The '<em><b>Inputmsg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUTMSG_VALUE
	 * @generated
	 * @ordered
	 */
	INPUTMSG(44, "inputmsg", "INPUTMSG"),

	/**
	 * The '<em><b>Inputmsglen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUTMSGLEN_VALUE
	 * @generated
	 * @ordered
	 */
	INPUTMSGLEN(45, "inputmsglen", "INPUTMSGLEN"),

	/**
	 * The '<em><b>Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	CHANNEL(46, "channel", "CHANNEL"),

	/**
	 * The '<em><b>Xctl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCTL_VALUE
	 * @generated
	 * @ordered
	 */
	XCTL(47, "xctl", "XCTL"),

	/**
	 * The '<em><b>Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD(48, "load", "LOAD"),

	/**
	 * The '<em><b>Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_VALUE
	 * @generated
	 * @ordered
	 */
	START(52, "start", "START"),

	/**
	 * The '<em><b>Tr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TR_VALUE
	 * @generated
	 * @ordered
	 */
	TR(49, "tr", "TR");

	/**
	 * The '<em><b>Ts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TS
	 * @model name="ts" literal="TS"
	 * @generated
	 * @ordered
	 */
	public static final int TS_VALUE = 0;

	/**
	 * The '<em><b>Queue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Queue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUEUE
	 * @model name="queue" literal="QUEUE"
	 * @generated
	 * @ordered
	 */
	public static final int QUEUE_VALUE = 1;

	/**
	 * The '<em><b>Qname</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qname</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QNAME
	 * @model name="qname" literal="QNAME"
	 * @generated
	 * @ordered
	 */
	public static final int QNAME_VALUE = 2;

	/**
	 * The '<em><b>Openpar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Openpar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPENPAR
	 * @model name="openpar" literal="("
	 * @generated
	 * @ordered
	 */
	public static final int OPENPAR_VALUE = 3;

	/**
	 * The '<em><b>Closepar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Closepar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSEPAR
	 * @model name="closepar" literal=")"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSEPAR_VALUE = 4;

	/**
	 * The '<em><b>Sysid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sysid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSID
	 * @model name="sysid" literal="SYSID"
	 * @generated
	 * @ordered
	 */
	public static final int SYSID_VALUE = 5;

	/**
	 * The '<em><b>Sys</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sys</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYS
	 * @model name="sys" literal="SYS"
	 * @generated
	 * @ordered
	 */
	public static final int SYS_VALUE = 6;

	/**
	 * The '<em><b>Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model name="set" literal="SET"
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 7;

	/**
	 * The '<em><b>Into</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Into</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTO
	 * @model name="into" literal="INTO"
	 * @generated
	 * @ordered
	 */
	public static final int INTO_VALUE = 8;

	/**
	 * The '<em><b>Length</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Length</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENGTH
	 * @model name="length" literal="LENGTH"
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_VALUE = 9;

	/**
	 * The '<em><b>Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEM
	 * @model name="item" literal="ITEM"
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_VALUE = 10;

	/**
	 * The '<em><b>Next</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Next</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT
	 * @model name="next" literal="NEXT"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_VALUE = 11;

	/**
	 * The '<em><b>Numitems</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numitems</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMITEMS
	 * @model name="numitems" literal="NUMITEMS"
	 * @generated
	 * @ordered
	 */
	public static final int NUMITEMS_VALUE = 12;

	/**
	 * The '<em><b>Td</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Td</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TD
	 * @model name="td" literal="TD"
	 * @generated
	 * @ordered
	 */
	public static final int TD_VALUE = 13;

	/**
	 * The '<em><b>Writeq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Writeq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITEQ
	 * @model name="writeq" literal="WRITEQ"
	 * @generated
	 * @ordered
	 */
	public static final int WRITEQ_VALUE = 14;

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
	public static final int FROM_VALUE = 15;

	/**
	 * The '<em><b>Rewrite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rewrite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REWRITE
	 * @model name="rewrite" literal="REWRITE"
	 * @generated
	 * @ordered
	 */
	public static final int REWRITE_VALUE = 16;

	/**
	 * The '<em><b>Nosuspend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nosuspend</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOSUSPEND
	 * @model name="nosuspend" literal="NOSUSPEND"
	 * @generated
	 * @ordered
	 */
	public static final int NOSUSPEND_VALUE = 17;

	/**
	 * The '<em><b>Main</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Main</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAIN
	 * @model name="main" literal="MAIN"
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_VALUE = 18;

	/**
	 * The '<em><b>Auxiliary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auxiliary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY
	 * @model name="auxiliary" literal="AUXILIARY"
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_VALUE = 19;

	/**
	 * The '<em><b>Deleteq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deleteq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETEQ
	 * @model name="deleteq" literal="DELETEQ"
	 * @generated
	 * @ordered
	 */
	public static final int DELETEQ_VALUE = 20;

	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @model name="read" literal="READ"
	 * @generated
	 * @ordered
	 */
	public static final int READ_VALUE = 21;

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
	public static final int FILE_VALUE = 22;

	/**
	 * The '<em><b>Dataset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dataset</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATASET
	 * @model name="dataset" literal="DATASET"
	 * @generated
	 * @ordered
	 */
	public static final int DATASET_VALUE = 23;

	/**
	 * The '<em><b>Ridfld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ridfld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIDFLD
	 * @model name="ridfld" literal="RIDFLD"
	 * @generated
	 * @ordered
	 */
	public static final int RIDFLD_VALUE = 24;

	/**
	 * The '<em><b>Keylength</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Keylength</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYLENGTH
	 * @model name="keylength" literal="KEYLENGTH"
	 * @generated
	 * @ordered
	 */
	public static final int KEYLENGTH_VALUE = 25;

	/**
	 * The '<em><b>Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model name="generic" literal="GENERIC"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 26;

	/**
	 * The '<em><b>Gteq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gteq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GTEQ
	 * @model name="gteq" literal="GTEQ"
	 * @generated
	 * @ordered
	 */
	public static final int GTEQ_VALUE = 27;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal" literal="EQUAL"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 28;

	/**
	 * The '<em><b>Uncommitted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uncommitted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCOMMITTED
	 * @model name="uncommitted" literal="UNCOMMITTED"
	 * @generated
	 * @ordered
	 */
	public static final int UNCOMMITTED_VALUE = 29;

	/**
	 * The '<em><b>Consistent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consistent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSISTENT
	 * @model name="consistent" literal="CONSISTENT"
	 * @generated
	 * @ordered
	 */
	public static final int CONSISTENT_VALUE = 30;

	/**
	 * The '<em><b>Repeatable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repeatable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEATABLE
	 * @model name="repeatable" literal="REPEATABLE"
	 * @generated
	 * @ordered
	 */
	public static final int REPEATABLE_VALUE = 31;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @model name="update" literal="UPDATE"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 32;

	/**
	 * The '<em><b>Token</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN
	 * @model name="token" literal="TOKEN"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_VALUE = 33;

	/**
	 * The '<em><b>Rba</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rba</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RBA
	 * @model name="rba" literal="RBA"
	 * @generated
	 * @ordered
	 */
	public static final int RBA_VALUE = 34;

	/**
	 * The '<em><b>Xrba</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xrba</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XRBA
	 * @model name="xrba" literal="XRBA"
	 * @generated
	 * @ordered
	 */
	public static final int XRBA_VALUE = 35;

	/**
	 * The '<em><b>Rrn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rrn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RRN
	 * @model name="rrn" literal="RRN"
	 * @generated
	 * @ordered
	 */
	public static final int RRN_VALUE = 36;

	/**
	 * The '<em><b>Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE
	 * @model name="write" literal="WRITE"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_VALUE = 37;

	/**
	 * The '<em><b>Massinsert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Massinsert</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASSINSERT
	 * @model name="massinsert" literal="MASSINSERT"
	 * @generated
	 * @ordered
	 */
	public static final int MASSINSERT_VALUE = 38;

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
	public static final int PROGRAM_VALUE = 39;

	/**
	 * The '<em><b>Commarea</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Commarea</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMAREA
	 * @model name="commarea" literal="COMMAREA"
	 * @generated
	 * @ordered
	 */
	public static final int COMMAREA_VALUE = 40;

	/**
	 * The '<em><b>Datalength</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Datalength</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATALENGTH
	 * @model name="datalength" literal="DATALENGTH"
	 * @generated
	 * @ordered
	 */
	public static final int DATALENGTH_VALUE = 41;

	/**
	 * The '<em><b>Synconreturn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Synconreturn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCONRETURN
	 * @model name="synconreturn" literal="SYNCONRETURN"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCONRETURN_VALUE = 42;

	/**
	 * The '<em><b>Transid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSID
	 * @model name="transid" literal="TRANSID"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSID_VALUE = 43;

	/**
	 * The '<em><b>Inputmsg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inputmsg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUTMSG
	 * @model name="inputmsg" literal="INPUTMSG"
	 * @generated
	 * @ordered
	 */
	public static final int INPUTMSG_VALUE = 44;

	/**
	 * The '<em><b>Inputmsglen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inputmsglen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUTMSGLEN
	 * @model name="inputmsglen" literal="INPUTMSGLEN"
	 * @generated
	 * @ordered
	 */
	public static final int INPUTMSGLEN_VALUE = 45;

	/**
	 * The '<em><b>Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Channel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANNEL
	 * @model name="channel" literal="CHANNEL"
	 * @generated
	 * @ordered
	 */
	public static final int CHANNEL_VALUE = 46;

	/**
	 * The '<em><b>Xctl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xctl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XCTL
	 * @model name="xctl" literal="XCTL"
	 * @generated
	 * @ordered
	 */
	public static final int XCTL_VALUE = 47;

	/**
	 * The '<em><b>Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD
	 * @model name="load" literal="LOAD"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_VALUE = 48;

	/**
	 * The '<em><b>Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START
	 * @model name="start" literal="START"
	 * @generated
	 * @ordered
	 */
	public static final int START_VALUE = 52;

	/**
	 * The '<em><b>Tr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TR
	 * @model name="tr" literal="TR"
	 * @generated
	 * @ordered
	 */
	public static final int TR_VALUE = 49;

	/**
	 * An array of all the '<em><b>CICS Statement Tokens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CICSStatementTokens[] VALUES_ARRAY =
		new CICSStatementTokens[] {
			TS,
			QUEUE,
			QNAME,
			OPENPAR,
			CLOSEPAR,
			SYSID,
			SYS,
			SET,
			INTO,
			LENGTH,
			ITEM,
			NEXT,
			NUMITEMS,
			TD,
			WRITEQ,
			FROM,
			REWRITE,
			NOSUSPEND,
			MAIN,
			AUXILIARY,
			DELETEQ,
			READ,
			FILE,
			DATASET,
			RIDFLD,
			KEYLENGTH,
			GENERIC,
			GTEQ,
			EQUAL,
			UNCOMMITTED,
			CONSISTENT,
			REPEATABLE,
			UPDATE,
			TOKEN,
			RBA,
			XRBA,
			RRN,
			WRITE,
			MASSINSERT,
			PROGRAM,
			COMMAREA,
			DATALENGTH,
			SYNCONRETURN,
			TRANSID,
			INPUTMSG,
			INPUTMSGLEN,
			CHANNEL,
			XCTL,
			LOAD,
			START,
			TR,
		};

	/**
	 * A public read-only list of all the '<em><b>CICS Statement Tokens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CICSStatementTokens> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CICS Statement Tokens</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CICSStatementTokens get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CICSStatementTokens result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CICS Statement Tokens</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CICSStatementTokens getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CICSStatementTokens result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CICS Statement Tokens</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CICSStatementTokens get(int value) {
		switch (value) {
			case TS_VALUE: return TS;
			case QUEUE_VALUE: return QUEUE;
			case QNAME_VALUE: return QNAME;
			case OPENPAR_VALUE: return OPENPAR;
			case CLOSEPAR_VALUE: return CLOSEPAR;
			case SYSID_VALUE: return SYSID;
			case SYS_VALUE: return SYS;
			case SET_VALUE: return SET;
			case INTO_VALUE: return INTO;
			case LENGTH_VALUE: return LENGTH;
			case ITEM_VALUE: return ITEM;
			case NEXT_VALUE: return NEXT;
			case NUMITEMS_VALUE: return NUMITEMS;
			case TD_VALUE: return TD;
			case WRITEQ_VALUE: return WRITEQ;
			case FROM_VALUE: return FROM;
			case REWRITE_VALUE: return REWRITE;
			case NOSUSPEND_VALUE: return NOSUSPEND;
			case MAIN_VALUE: return MAIN;
			case AUXILIARY_VALUE: return AUXILIARY;
			case DELETEQ_VALUE: return DELETEQ;
			case READ_VALUE: return READ;
			case FILE_VALUE: return FILE;
			case DATASET_VALUE: return DATASET;
			case RIDFLD_VALUE: return RIDFLD;
			case KEYLENGTH_VALUE: return KEYLENGTH;
			case GENERIC_VALUE: return GENERIC;
			case GTEQ_VALUE: return GTEQ;
			case EQUAL_VALUE: return EQUAL;
			case UNCOMMITTED_VALUE: return UNCOMMITTED;
			case CONSISTENT_VALUE: return CONSISTENT;
			case REPEATABLE_VALUE: return REPEATABLE;
			case UPDATE_VALUE: return UPDATE;
			case TOKEN_VALUE: return TOKEN;
			case RBA_VALUE: return RBA;
			case XRBA_VALUE: return XRBA;
			case RRN_VALUE: return RRN;
			case WRITE_VALUE: return WRITE;
			case MASSINSERT_VALUE: return MASSINSERT;
			case PROGRAM_VALUE: return PROGRAM;
			case COMMAREA_VALUE: return COMMAREA;
			case DATALENGTH_VALUE: return DATALENGTH;
			case SYNCONRETURN_VALUE: return SYNCONRETURN;
			case TRANSID_VALUE: return TRANSID;
			case INPUTMSG_VALUE: return INPUTMSG;
			case INPUTMSGLEN_VALUE: return INPUTMSGLEN;
			case CHANNEL_VALUE: return CHANNEL;
			case XCTL_VALUE: return XCTL;
			case LOAD_VALUE: return LOAD;
			case START_VALUE: return START;
			case TR_VALUE: return TR;
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
	private CICSStatementTokens(int value, String name, String literal) {
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
	
} //CICSStatementTokens
