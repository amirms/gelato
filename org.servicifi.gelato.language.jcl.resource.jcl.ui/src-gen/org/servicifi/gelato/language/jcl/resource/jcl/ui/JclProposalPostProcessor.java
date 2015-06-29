/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

import java.util.List;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class JclProposalPostProcessor {
	
	public List<org.servicifi.gelato.language.jcl.resource.jcl.ui.JclCompletionProposal> process(List<org.servicifi.gelato.language.jcl.resource.jcl.ui.JclCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
