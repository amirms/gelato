/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

import org.eclipse.jface.action.IAction;

public class CommentOutlinePageLinkWithEditorAction extends org.servicifi.gelato.language.cobol.comment.resource.comment.ui.AbstractCommentOutlinePageAction {
	
	public CommentOutlinePageLinkWithEditorAction(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
