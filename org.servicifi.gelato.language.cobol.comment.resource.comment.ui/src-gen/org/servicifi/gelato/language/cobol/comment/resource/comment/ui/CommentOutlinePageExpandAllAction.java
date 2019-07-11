/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

import org.eclipse.jface.action.IAction;

public class CommentOutlinePageExpandAllAction extends org.servicifi.gelato.language.cobol.comment.resource.comment.ui.AbstractCommentOutlinePageAction {
	
	public CommentOutlinePageExpandAllAction(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
