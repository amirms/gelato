/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

import org.eclipse.jface.action.IAction;

public class KernelOutlinePageTypeSortingAction extends org.servicifi.gelato.language.kernel.resource.kernel.ui.AbstractKernelOutlinePageAction {
	
	public KernelOutlinePageTypeSortingAction(org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
