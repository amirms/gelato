/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class CobolProposalPostProcessor {
	
	public java.util.List<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> process(java.util.List<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
