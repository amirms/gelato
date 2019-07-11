/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

import java.util.List;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class CommentProposalPostProcessor {
	
	public List<org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentCompletionProposal> process(List<org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
