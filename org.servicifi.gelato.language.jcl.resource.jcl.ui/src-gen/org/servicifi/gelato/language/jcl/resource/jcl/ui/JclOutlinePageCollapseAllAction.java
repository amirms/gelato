/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

import org.eclipse.jface.action.IAction;

public class JclOutlinePageCollapseAllAction extends org.servicifi.gelato.language.jcl.resource.jcl.ui.AbstractJclOutlinePageAction {
	
	public JclOutlinePageCollapseAllAction(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
