/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

import org.eclipse.jface.action.IAction;

public class CobolOutlinePageLexicalSortingAction extends org.servicifi.gelato.language.cobol.resource.cobol.ui.AbstractCobolOutlinePageAction {
	
	public CobolOutlinePageLexicalSortingAction(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
