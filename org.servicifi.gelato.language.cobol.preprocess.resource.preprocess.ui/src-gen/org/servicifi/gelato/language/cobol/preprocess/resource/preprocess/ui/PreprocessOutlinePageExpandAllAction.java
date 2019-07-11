/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

import org.eclipse.jface.action.IAction;

public class PreprocessOutlinePageExpandAllAction extends org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.AbstractPreprocessOutlinePageAction {
	
	public PreprocessOutlinePageExpandAllAction(org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
