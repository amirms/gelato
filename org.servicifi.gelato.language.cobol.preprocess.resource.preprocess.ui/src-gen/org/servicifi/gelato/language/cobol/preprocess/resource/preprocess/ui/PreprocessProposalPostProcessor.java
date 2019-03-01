/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class PreprocessProposalPostProcessor {
	
	public java.util.List<org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessCompletionProposal> process(java.util.List<org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
