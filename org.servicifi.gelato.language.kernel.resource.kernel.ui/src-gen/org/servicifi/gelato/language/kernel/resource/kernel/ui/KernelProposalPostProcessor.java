/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

import java.util.List;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class KernelProposalPostProcessor {
	
	public List<org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal> process(List<org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
