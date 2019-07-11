/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

import org.eclipse.core.resources.IResource;

public class CommentUIMetaInformation extends org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentMetaInformation {
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentHoverTextProvider getHoverTextProvider() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentHoverTextProvider();
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentImageProvider getImageProvider() {
		return org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentImageProvider.INSTANCE;
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentColorManager createColorManager() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.servicifi.gelato.language.cobol.comment.resource.comment.
	 * ICommentTextResource,
	 * org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentColorMana
	 * ger) instead.
	 */
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentTokenScanner createTokenScanner(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentColorManager colorManager) {
		return (org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentTokenScanner) createTokenScanner(null, colorManager);
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ui.ICommentTokenScanner createTokenScanner(org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextResource resource, org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentColorManager colorManager) {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentTokenScanner(resource, colorManager);
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentCodeCompletionHelper createCodeCompletionHelper() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentCodeCompletionHelper();
	}
	
	@SuppressWarnings("rawtypes")
	public Object createResourceAdapter(Object adaptableObject, Class adapterType, IResource resource) {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.debug.CommentLineBreakpointAdapter();
	}
	
}
