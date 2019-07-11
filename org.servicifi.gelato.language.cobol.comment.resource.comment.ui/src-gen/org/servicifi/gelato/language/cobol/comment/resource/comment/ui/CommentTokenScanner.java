/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

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
public class CommentTokenScanner implements org.servicifi.gelato.language.cobol.comment.resource.comment.ui.ICommentTokenScanner {
	
	private org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextScanner lexer;
	private org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextToken currentToken;
	private List<org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextToken> nextTokens;
	private int offset;
	private String languageId;
	private IPreferenceStore store;
	private org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentColorManager colorManager;
	private org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextResource resource;
	
	/**
	 * <p>
	 * Creates a new CommentTokenScanner. Uses the preference store belonging to the
	 * corresponding
	 * org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentUIPlugin.
	 * </p>
	 * 
	 * @param resource The resource to scan
	 * @param colorManager A manager to obtain color objects
	 */
	public CommentTokenScanner(org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextResource resource, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentColorManager colorManager) {
		this(resource, colorManager, (org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentUIPlugin.getDefault() == null ? null : org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentUIPlugin.getDefault().getPreferenceStore()));
	}
	
	/**
	 * <p>
	 * Creates a new CommentTokenScanner.
	 * </p>
	 * 
	 * @param resource The resource to scan
	 * @param colorManager A manager to obtain color objects
	 * @param preferenceStore The preference store to retrieve the defined token colors
	 */
	public CommentTokenScanner(org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextResource resource, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentColorManager colorManager, IPreferenceStore preferenceStore) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentMetaInformation().createLexer();
		this.languageId = new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentMetaInformation().getSyntaxName();
		this.store = preferenceStore;
		this.nextTokens = new ArrayList<org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextToken>();
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
			org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
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
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenStyle getStaticTokenStyle() {
		String tokenName = currentToken.getName();
		String enableKey = org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.ENABLE);
		if (store == null) {
			return null;
		}
		
		boolean enabled = store.getBoolean(enableKey);
		if (!enabled) {
			return null;
		}
		
		String colorKey = org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.COLOR);
		RGB foregroundRGB = PreferenceConverter.getColor(store, colorKey);
		RGB backgroundRGB = null;
		boolean bold = store.getBoolean(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.BOLD));
		boolean italic = store.getBoolean(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.ITALIC));
		boolean strikethrough = store.getBoolean(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
		boolean underline = store.getBoolean(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentSyntaxColoringHelper.StyleProperty.UNDERLINE));
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenStyle getDynamicTokenStyle(org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenStyle staticStyle) {
		org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentDynamicTokenStyler dynamicTokenStyler = new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentDynamicTokenStyler();
		dynamicTokenStyler.setOffset(offset);
		org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public TextAttribute getTextAttribute(org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenStyle tokeStyle) {
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
		
		List<org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTaskItem> taskItems = new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		List<org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextToken> newItems = new ArrayList<org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextToken>();
		for (org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTextToken(org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item
			String textAfter = text.substring(offset - charStart);
			newItems.add(new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}
