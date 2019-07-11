/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

import org.eclipse.emf.ecore.EObject;

public class CommentHoverTextProvider implements org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentHoverTextProvider {
	
	private org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentDefaultHoverTextProvider defaultProvider = new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentDefaultHoverTextProvider();
	
	public String getHoverText(EObject container, EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
