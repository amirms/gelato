/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

public class JclOutlinePageLexicalSortingAction extends org.servicifi.gelato.language.jcl.resource.jcl.ui.AbstractJclOutlinePageAction {
	
	public JclOutlinePageLexicalSortingAction(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
