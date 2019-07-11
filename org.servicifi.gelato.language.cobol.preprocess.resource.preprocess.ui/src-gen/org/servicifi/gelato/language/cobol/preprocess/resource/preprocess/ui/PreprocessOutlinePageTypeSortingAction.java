/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

import org.eclipse.jface.action.IAction;

public class PreprocessOutlinePageTypeSortingAction extends org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.AbstractPreprocessOutlinePageAction {
	
	public PreprocessOutlinePageTypeSortingAction(org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
