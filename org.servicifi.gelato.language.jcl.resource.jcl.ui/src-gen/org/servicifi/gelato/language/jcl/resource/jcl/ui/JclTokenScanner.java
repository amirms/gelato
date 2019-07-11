/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class JclTokenScanner implements org.servicifi.gelato.language.jcl.resource.jcl.ui.IJclTokenScanner {
	
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclTextScanner lexer;
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclTextToken currentToken;
	private List<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextToken> nextTokens;
	private int offset;
	private String languageId;
	private IPreferenceStore store;
	private org.servicifi.gelato.language.jcl.resource.jcl.ui.JclColorManager colorManager;
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource;
	
	/**
	 * <p>
	 * Creates a new JclTokenScanner. Uses the preference store belonging to the
	 * corresponding org.servicifi.gelato.language.jcl.resource.jcl.ui.JclUIPlugin.
	 * </p>
	 * 
	 * @param resource The resource to scan
	 * @param colorManager A manager to obtain color objects
	 */
	public JclTokenScanner(org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclColorManager colorManager) {
		this(resource, colorManager, (org.servicifi.gelato.language.jcl.resource.jcl.ui.JclUIPlugin.getDefault() == null ? null : org.servicifi.gelato.language.jcl.resource.jcl.ui.JclUIPlugin.getDefault().getPreferenceStore()));
	}
	
	/**
	 * <p>
	 * Creates a new JclTokenScanner.
	 * </p>
	 * 
	 * @param resource The resource to scan
	 * @param colorManager A manager to obtain color objects
	 * @param preferenceStore The preference store to retrieve the defined token colors
	 */
	public JclTokenScanner(org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclColorManager colorManager, IPreferenceStore preferenceStore) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMetaInformation().createLexer();
		this.languageId = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMetaInformation().getSyntaxName();
		this.store = preferenceStore;
		this.nextTokens = new ArrayList<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextToken>();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public IToken nextToken() {
		boolean isOriginalToken = true;
		if (!nextTokens.isEmpty()) {
			currentToken = nextTokens.remove(0);
			isOriginalToken = false;
		} else {
			currentToken = lexer.getNextToken();
		}
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return Token.EOF;
		}
		
		if (isOriginalToken) {
			splitCurrentToken();
		}
		
		TextAttribute textAttribute = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
			if (dynamicStyle != null) {
				textAttribute = getTextAttribute(dynamicStyle);
			}
		}
		
		return new Token(textAttribute);
	}
	
	public void setRange(IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenStyle getStaticTokenStyle() {
		String tokenName = currentToken.getName();
		String enableKey = org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.StyleProperty.ENABLE);
		if (store == null) {
			return null;
		}
		
		boolean enabled = store.getBoolean(enableKey);
		if (!enabled) {
			return null;
		}
		
		String colorKey = org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.StyleProperty.COLOR);
		RGB foregroundRGB = PreferenceConverter.getColor(store, colorKey);
		RGB backgroundRGB = null;
		boolean bold = store.getBoolean(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.StyleProperty.BOLD));
		boolean italic = store.getBoolean(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.StyleProperty.ITALIC));
		boolean strikethrough = store.getBoolean(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
		boolean underline = store.getBoolean(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclSyntaxColoringHelper.StyleProperty.UNDERLINE));
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenStyle getDynamicTokenStyle(org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenStyle staticStyle) {
		org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclDynamicTokenStyler dynamicTokenStyler = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclDynamicTokenStyler();
		dynamicTokenStyler.setOffset(offset);
		org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public TextAttribute getTextAttribute(org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenStyle tokeStyle) {
		int[] foregroundColorArray = tokeStyle.getColorAsRGB();
		Color foregroundColor = null;
		if (colorManager != null) {
			foregroundColor = colorManager.getColor(new RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
		}
		int[] backgroundColorArray = tokeStyle.getBackgroundColorAsRGB();
		Color backgroundColor = null;
		if (backgroundColorArray != null) {
			RGB backgroundRGB = new RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
			if (colorManager != null) {
				backgroundColor = colorManager.getColor(backgroundRGB);
			}
		}
		int style = SWT.NORMAL;
		if (tokeStyle.isBold()) {
			style = style | SWT.BOLD;
		}
		if (tokeStyle.isItalic()) {
			style = style | SWT.ITALIC;
		}
		if (tokeStyle.isStrikethrough()) {
			style = style | TextAttribute.STRIKETHROUGH;
		}
		if (tokeStyle.isUnderline()) {
			style = style | TextAttribute.UNDERLINE;
		}
		return new TextAttribute(foregroundColor, backgroundColor, style);
	}
	
	/**
	 * Tries to split the current token if it contains task items.
	 */
	public void splitCurrentToken() {
		final String text = currentToken.getText();
		final String name = currentToken.getName();
		final int line = currentToken.getLine();
		final int charStart = currentToken.getOffset();
		final int column = currentToken.getColumn();
		
		List<org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTaskItem> taskItems = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		List<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextToken> newItems = new ArrayList<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextToken>();
		for (org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTextToken(org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item
			String textAfter = text.substring(offset - charStart);
			newItems.add(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}
