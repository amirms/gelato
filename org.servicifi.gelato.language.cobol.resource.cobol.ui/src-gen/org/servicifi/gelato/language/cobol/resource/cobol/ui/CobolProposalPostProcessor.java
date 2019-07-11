/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

import java.util.List;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class CobolProposalPostProcessor {
	
	public List<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> process(List<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
