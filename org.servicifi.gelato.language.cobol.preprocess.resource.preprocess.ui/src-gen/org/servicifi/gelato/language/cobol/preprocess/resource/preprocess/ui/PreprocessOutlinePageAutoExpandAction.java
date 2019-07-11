/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

import org.eclipse.jface.action.IAction;

public class PreprocessOutlinePageAutoExpandAction extends org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.AbstractPreprocessOutlinePageAction {
	
	public PreprocessOutlinePageAutoExpandAction(org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
