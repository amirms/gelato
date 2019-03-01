/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class JclProposalPostProcessor {
	
	public java.util.List<org.servicifi.gelato.language.jcl.resource.jcl.ui.JclCompletionProposal> process(java.util.List<org.servicifi.gelato.language.jcl.resource.jcl.ui.JclCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
