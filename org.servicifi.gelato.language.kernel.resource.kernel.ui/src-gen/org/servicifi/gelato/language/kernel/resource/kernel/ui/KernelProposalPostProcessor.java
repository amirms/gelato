/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class KernelProposalPostProcessor {
	
	public java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal> process(java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
