/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class CobolOutlinePageActionProvider {
	
	public List<IAction> getActions(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
