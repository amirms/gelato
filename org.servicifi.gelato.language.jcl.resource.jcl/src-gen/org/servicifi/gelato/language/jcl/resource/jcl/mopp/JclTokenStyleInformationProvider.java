/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;


public class JclTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("JCL_WORD".equals(tokenName)) {
			return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenStyle(new int[] {0x00, 0x00, 0x00}, null, false, false, false, false);
		}
		if ("EXEC".equals(tokenName)) {
			return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
