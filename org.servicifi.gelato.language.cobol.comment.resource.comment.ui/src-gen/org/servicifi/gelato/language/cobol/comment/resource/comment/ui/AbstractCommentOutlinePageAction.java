/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.ui;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;

public abstract class AbstractCommentOutlinePageAction extends Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTreeViewer treeViewer;
	
	public AbstractCommentOutlinePageAction(org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		ImageDescriptor descriptor = org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (org.servicifi.gelato.language.cobol.comment.resource.comment.ui.CommentOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
