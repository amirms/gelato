/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

public class KernelCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelResourceProvider resourceProvider;
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.IKernelBracketHandlerProvider bracketHandlerProvider;
	
	public KernelCompletionProcessor(org.servicifi.gelato.language.kernel.resource.kernel.IKernelResourceProvider resourceProvider, org.servicifi.gelato.language.kernel.resource.kernel.ui.IKernelBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCodeCompletionHelper helper = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCodeCompletionHelper();
		org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelProposalPostProcessor proposalPostProcessor = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelProposalPostProcessor();
		java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal> finalProposalList = new java.util.ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal>();
		for (org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			org.servicifi.gelato.language.kernel.resource.kernel.ui.IKernelBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
