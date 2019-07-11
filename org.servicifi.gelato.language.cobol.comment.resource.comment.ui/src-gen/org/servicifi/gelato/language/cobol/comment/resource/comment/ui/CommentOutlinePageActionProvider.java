/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class CommentOutlinePageActionProvider {
	
	public List<IAction> getActions(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
