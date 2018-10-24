/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

public class KernelTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("SL_COMMENT".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x00, 0x00, 0x80}, null, false, true, false, false);
		}
		if ("IDENTIFIER".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x00, 0x00, 0x00}, null, false, false, false, false);
		}
		if ("CHARACTER_LITERAL".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x3C, 0xB3, 0x00}, null, false, false, false, false);
		}
		if ("var".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Procedure".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("main".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("while".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("do".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("if".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("then".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("else".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("goto".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("order".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("l2r".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("r2l".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("interleaved".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("try".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("with".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("exception".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("abort".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("skip".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("return".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("call".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ref".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("val".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("defines".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("uses".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("affects".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("postdefines".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("preuses".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("postaffects".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
