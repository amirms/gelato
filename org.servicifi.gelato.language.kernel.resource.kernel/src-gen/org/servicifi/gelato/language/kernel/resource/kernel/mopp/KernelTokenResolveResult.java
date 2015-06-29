/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;


/**
 * A basic implementation of the ITokenResolveResult interface.
 */
public class KernelTokenResolveResult implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public KernelTokenResolveResult() {
		super();
		clear();
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Object getResolvedToken() {
		return resolvedToken;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void setResolvedToken(Object resolvedToken) {
		this.resolvedToken = resolvedToken;
	}
	
	public void clear() {
		errorMessage = "Can't resolve token.";
		resolvedToken = null;
	}
	
}
