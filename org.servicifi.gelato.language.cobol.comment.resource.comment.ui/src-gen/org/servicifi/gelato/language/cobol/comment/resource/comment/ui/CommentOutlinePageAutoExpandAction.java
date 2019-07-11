/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

import org.eclipse.jface.action.IAction;

public class CommentOutlinePageAutoExpandAction extends org.servicifi.gelato.language.cobol.comment.resource.comment.ui.AbstractCommentOutlinePageAction {
	
	public CommentOutlinePageAutoExpandAction(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
