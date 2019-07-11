/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

import org.eclipse.jface.action.IAction;

public class PreprocessOutlinePageLexicalSortingAction extends org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.AbstractPreprocessOutlinePageAction {
	
	public PreprocessOutlinePageLexicalSortingAction(org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
