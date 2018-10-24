/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

/**
 * The KernelTaskItemBuilder is used to find task items in text documents. The
 * current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class KernelTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTaskItem> taskItems = new java.util.ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTaskItem>();
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTaskItemDetector taskItemDetector = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStreamUtil.getContent(inputStream);
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextScanner lexer = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelMetaInformation().createLexer();
			lexer.setText(content);
			
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelPlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelPlugin.logError("Exception while searching for task items", e);
		}
		
		for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
