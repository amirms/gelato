/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptions.RESOURCE_CON
 * TENT_TYPE
 */
public class KernelUnexpectedContentTypeException extends org.antlr.runtime3_4_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  KernelUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
