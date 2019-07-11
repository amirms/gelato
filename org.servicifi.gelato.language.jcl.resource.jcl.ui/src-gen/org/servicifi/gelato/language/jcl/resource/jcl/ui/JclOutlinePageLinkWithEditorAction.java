/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

import org.eclipse.jface.action.IAction;

public class JclOutlinePageLinkWithEditorAction extends org.servicifi.gelato.language.jcl.resource.jcl.ui.AbstractJclOutlinePageAction {
	
	public JclOutlinePageLinkWithEditorAction(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
