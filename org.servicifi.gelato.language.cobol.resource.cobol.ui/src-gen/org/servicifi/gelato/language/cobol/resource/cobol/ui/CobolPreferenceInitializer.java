/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

/**
 * A class used to initialize default preference values.
 */
public class CobolPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.servicifi.gelato.language.cobol.resource.cobol.ICobolMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolBracketSet bracketSet = new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolBracketSet(null, null);
		final java.util.Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.servicifi.gelato.language.cobol.resource.cobol.ICobolBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
