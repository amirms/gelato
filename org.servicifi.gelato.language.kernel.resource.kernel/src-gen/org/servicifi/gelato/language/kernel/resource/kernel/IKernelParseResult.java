/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IKernelParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>> getPostParseCommands();
	
}
