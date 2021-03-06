/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

public class JclOutlinePageAutoExpandAction extends org.servicifi.gelato.language.jcl.resource.jcl.ui.AbstractJclOutlinePageAction {
	
	public JclOutlinePageAutoExpandAction(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
