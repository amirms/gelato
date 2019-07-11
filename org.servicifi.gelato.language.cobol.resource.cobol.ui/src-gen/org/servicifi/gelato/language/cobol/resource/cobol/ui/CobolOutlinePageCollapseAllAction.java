/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

import org.eclipse.jface.action.IAction;

public class CobolOutlinePageCollapseAllAction extends org.servicifi.gelato.language.cobol.resource.cobol.ui.AbstractCobolOutlinePageAction {
	
	public CobolOutlinePageCollapseAllAction(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageTreeViewer treeViewer) {
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
