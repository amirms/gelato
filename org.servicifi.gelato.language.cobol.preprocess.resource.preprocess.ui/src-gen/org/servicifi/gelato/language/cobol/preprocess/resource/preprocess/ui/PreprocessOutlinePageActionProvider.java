/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class PreprocessOutlinePageActionProvider {
	
	public List<IAction> getActions(org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
