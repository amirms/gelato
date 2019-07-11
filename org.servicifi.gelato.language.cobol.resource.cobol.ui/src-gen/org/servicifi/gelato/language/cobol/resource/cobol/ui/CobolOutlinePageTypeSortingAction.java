/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

import org.eclipse.jface.action.IAction;

public class CobolOutlinePageTypeSortingAction extends org.servicifi.gelato.language.cobol.resource.cobol.ui.AbstractCobolOutlinePageAction {
	
	public CobolOutlinePageTypeSortingAction(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
