/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

public class CobolCompletionProcessor implements IContentAssistProcessor {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.ICobolResourceProvider resourceProvider;
	
	public CobolCompletionProcessor(org.servicifi.gelato.language.cobol.resource.cobol.ICobolResourceProvider resourceProvider) {
		super();
		this.resourceProvider = resourceProvider;
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		return computeCompletionProposals(textResource, content, offset);
	}
	
	public ICompletionProposal[] computeCompletionProposals(org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource textResource, String text, int offset) {
		org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCodeCompletionHelper helper = new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCodeCompletionHelper();
		org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, text, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolProposalPostProcessor proposalPostProcessor = new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolProposalPostProcessor();
		List<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> computedProposalList = Arrays.asList(computedProposals);
		List<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = Collections.emptyList();
		}
		List<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> finalProposalList = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>();
		for (org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal proposal : extendedProposalList) {
			if (proposal.isMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		ICompletionProposal[] result = new ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = (proposal.getDisplayString()==null)?proposalString:proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			Image image = proposal.getImage();
			IContextInformation info;
			info = new ContextInformation(image, displayString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			result[i++] = new CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		IPreferenceStore preferenceStore = org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolUIPlugin.getDefault().getPreferenceStore();
		boolean enabled = preferenceStore.getBoolean(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolPreferenceConstants.EDITOR_CONTENT_ASSIST_ENABLED);
		String triggerString = preferenceStore.getString(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolPreferenceConstants.EDITOR_CONTENT_ASSIST_TRIGGERS);
		if(enabled && triggerString != null && triggerString.length() > 0){
			char[] triggers = new char[triggerString.length()];
			for (int i = 0; i < triggerString.length(); i++) {
				triggers[i] = triggerString.charAt(i);
			}
			return triggers;
		}
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
