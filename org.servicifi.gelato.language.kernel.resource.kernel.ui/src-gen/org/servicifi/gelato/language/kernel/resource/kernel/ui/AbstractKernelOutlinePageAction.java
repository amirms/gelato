/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;

public abstract class AbstractKernelOutlinePageAction extends Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageTreeViewer treeViewer;
	
	public AbstractKernelOutlinePageAction(org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		ImageDescriptor descriptor = org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
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
			org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
