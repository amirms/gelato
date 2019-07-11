/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class KernelOutlinePageActionProvider {
	
	public List<IAction> getActions(org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
