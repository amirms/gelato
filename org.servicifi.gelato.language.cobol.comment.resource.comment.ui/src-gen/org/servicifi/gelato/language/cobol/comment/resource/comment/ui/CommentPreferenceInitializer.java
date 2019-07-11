/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

import java.util.Collection;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * This class can be used to initialize default preference values.
 */
public class CommentPreferenceInitializer extends AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		initializeDefaultsContentAssist();
		
		IPreferenceStore store = org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	protected void initializeDefaultBrackets() {
		IPreferenceStore store = org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentMetaInformation());
	}
	
	protected void initializeDefaultBrackets(IPreferenceStore store, org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets
		org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentBracketSet bracketSet = new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentBracketSet();
		final Collection<org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside(), bracketPair.isCloseAfterEnter());
			}
		}
		store.setDefault(languageId + org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.serialize());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		IPreferenceStore store = org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentMetaInformation());
	}
	
	protected void initializeDefaultSyntaxHighlighting(IPreferenceStore store, org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void initializeDefaultsContentAssist() {
		IPreferenceStore store = org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentUIPlugin.getDefault().getPreferenceStore();
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentPreferenceConstants.EDITOR_CONTENT_ASSIST_ENABLED, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentPreferenceConstants.EDITOR_CONTENT_ASSIST_ENABLED_DEFAULT);
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentPreferenceConstants.EDITOR_CONTENT_ASSIST_DELAY, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentPreferenceConstants.EDITOR_CONTENT_ASSIST_DELAY_DEFAULT);
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentPreferenceConstants.EDITOR_CONTENT_ASSIST_TRIGGERS, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentPreferenceConstants.EDITOR_CONTENT_ASSIST_TRIGGERS_DEFAULT);
	}
	
	protected void setProperties(IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	protected String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
	
}

