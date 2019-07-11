/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class JclOutlinePageActionProvider {
	
	public List<IAction> getActions(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
