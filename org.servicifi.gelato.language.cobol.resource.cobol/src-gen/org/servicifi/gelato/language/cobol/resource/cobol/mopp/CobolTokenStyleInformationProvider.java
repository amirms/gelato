/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;


public class CobolTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("SL_COMMENT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x00, 0x00, 0x80}, null, false, true, false, false);
		}
		if ("ALPHANUMERIC_LITERAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("COBOL_WORD".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x00, 0x00, 0x00}, null, false, false, false, false);
		}
		if ("BOOLEAN_LITERAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x3A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("FOOTING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LINAGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LINES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ORGANIZATION".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BLOCK".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BOTTOM".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CODE-SET".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SEQUENTIAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SD".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TOP".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REPORT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RECORDING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REPORTS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FROM".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ADD".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ADDRESS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ADVANCING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("AFP-5A".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("AFTER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALPHABETIC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALPHANUMERIC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALPHANUMERIC-EDITED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALSO".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALTER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ANY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ARE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ASCENDING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ASSIGN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("AT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BEFORE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BINARY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C01".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C02".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C03".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C04".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C05".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C06".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C07".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C08".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C09".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C10".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C11".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("C12".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CALL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CANCEL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CHARACTER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CHARACTERS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CLOSE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMMA".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMMON".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMP".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMP-1".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMP-2".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMP-3".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMP-4".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMP-5".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMPUTATIONAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMPUTATIONAL-1".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMPUTATIONAL-2".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMPUTATIONAL-3".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMPUTATIONAL-4".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMPUTATIONAL-5".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COMPUTE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CONFIGURATION".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CONSOLE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CONTAINS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CONTENT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CONTINUE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COPY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CORR".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CORRESPONDING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COUNT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CSP".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DATA".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DBCS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DEBUGGING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DECIMAL-POINT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DECLARATIVES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DECLARE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DELETE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DELIMITED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DELIMITER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DEPENDING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DESCENDING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DISABLE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DISPLAY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DIVIDE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DIVISION".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EGCS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ELSE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ENABLE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-ADD".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-CALL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-COMPUTE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-DIVIDE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-EVALUATE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-EXEC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-IF".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-MULTIPLY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-PERFORM".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-RETURN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-SEARCH".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-STRING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-SUBTRACT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-UNSTRING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ENTRY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ENVIRONMENT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EQUAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ERROR".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EVALUATE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EXCEPTION".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EXEC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EXIT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EXTEND".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EXTERNAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FD".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FILE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FILE-CONTROL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FILLER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FOR".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FUNCTION".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("GENERATE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("GIVING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("GLOBAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("GO".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("GOBACK".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("GREATER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("HIGH-VALUE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("HIGH-VALUES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("I-O".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("I-O-CONTROL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ID".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IDENTIFICATION".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IF".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INCLUDE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INDEX".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INDEXED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INITIAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INITIALIZE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INITIATE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INPUT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INPUT-OUTPUT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INSERT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INSPECT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INTO".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LABEL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LENGTH".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LESS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LINKAGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LOCAL-STORAGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WHERE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ORDER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LOCK".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LOW-VALUE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LOW-VALUES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MERGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MODE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MOVE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MULTIPLY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NATIONAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NATIONAL-EDITED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NEXT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NO".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NOT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NULL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NULLS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NUMERIC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NUMERIC-EDITED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OBJECT-COMPUTER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OCCURS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OF".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OFF".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OMITTED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ON".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OPEN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OPTIONAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OR".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OTHER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OUTPUT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OVERFLOW".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PACKED-DECIMAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PARAGRAPH".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PERFORM".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PIC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PICTURE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("POINTER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PROCEDURE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PROGRAM".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PROGRAM-ID".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PURGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("READ".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RECEIVE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RECORD".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RECORDS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REDEFINES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REEL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REFERENCE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RELEASE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REMAINDER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REMOVAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RENAMES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REPLACE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REPLACING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RETURN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RETURNING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REVERSED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REWIND".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REWRITE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ROUNDED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RUN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("S01".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("S02".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("S03".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("S04".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("S05".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SEARCH".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SECTION".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SELECT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SEND".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SENTENCE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SET".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SIGN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SIZE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SORT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SOURCE-COMPUTER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SPACE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SPACES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SPECIAL-NAMES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("STANDARD".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("START".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("STATUS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("STOP".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("STRING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SUBTRACT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SUPPRESS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYSIN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYSIPT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYSLIST".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYSLST".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYSOUT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYSPCH".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYSPUNCH".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TALLYING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TERMINATE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TEST".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("THAN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("THEN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("THROUGH".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("THRU".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TIMES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TO".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UNIT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UNSTRING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UNTIL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPDATE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPON".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("USAGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("USE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("USING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("VALUE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("VALUES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("VARYING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WHEN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WITH".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WORKING-STORAGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WRITE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ZERO".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ZEROES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ZEROS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LINKAGE-STORAGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REPOSITORY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Status".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CURRENCY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYMBOL".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CLASS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYMBOLIC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALPHABET".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("STANDARD-1".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("STANDARD-2".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EBCDIC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NATIVE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("GROUP-USAGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DISPLAY-1".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PROCEDURE-POINTER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FUNCTION-POINTER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ACCEPT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CONVERTING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UP".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DOWN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-READ".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LINE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PAGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-WRITE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-REWRITE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INVALID".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END-OF-PAGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EOP".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("AND".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LINAGE-COUNTER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LEADING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FIRST".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("POSITIVE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NEGATIVE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALPHABETIC-LOWER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALPHABETIC-UPPER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KANJI".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPSI-0".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPSI-1".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPSI-2".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPSI-3".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPSI-4".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPSI-5".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPSI-6".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UPSI-7".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SHIFT-IN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SHIFT-OUT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RETURN-CODE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WHEN-COMPILED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SEQUENCE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DUPLICATES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("COLLATING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("AUTHOR".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INSTALLATION".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DATE-WRITTEN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DATE-COMPLETED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SECUTIRY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MEMORY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WORDS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MODULES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SEGMENT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SEGMENT-LIMIT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("XML-SCHEMA".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ALTERNATE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RELATIVE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PADDING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RESERVE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("AREA".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("AREAS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ACCESS".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RANDOM".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DYNAMIC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BLANK".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("JUSTIFIED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("JUST".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RIGHT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TRAILING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SEPARATE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DATE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FORMAT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYNCHRONIZED".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SYNC".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LEFT".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RERUN".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EVERY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SAME".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MULTIPLE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TAPE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("POSITION".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("APPLY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WRITE-ONLY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SORT-MERGE".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DAY".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DAY-OF-WEEK".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TIME".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("YYYMMDD".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("YYYYDDD".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PROCEDURES".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BEGINNING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ENDING".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SELF".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SUPER".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NEW".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_69886967_6978684569886967".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
