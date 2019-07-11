/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

import org.eclipse.jface.action.IAction;

public class KernelOutlinePageAutoExpandAction extends org.servicifi.gelato.language.kernel.resource.kernel.ui.AbstractKernelOutlinePageAction {
	
	public KernelOutlinePageAutoExpandAction(org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
