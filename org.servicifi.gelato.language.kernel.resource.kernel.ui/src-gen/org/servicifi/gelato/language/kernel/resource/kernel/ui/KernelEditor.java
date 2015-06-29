/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.ITextOperationTarget;
import org.eclipse.jface.text.ITextPresentationListener;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.AbstractMarkerAnnotationModel;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
import org.eclipse.ui.texteditor.SelectMarkerRulerAction;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * <p>
 * A text editor for 'kernel' models.
 * </p>
 * <p>
 * <p>
 * </p>
 * <p>
 * This editor has id
 * <code>org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelEditor</code
 * >
 * </p>
 * <p>
 * The editor's context menu has id
 * <code>org.servicifi.gelato.language.kernel.resource.kernel.EditorContext</code>.
 * </p>
 * <p>
 * The editor's ruler context menu has id
 * <code>org.servicifi.gelato.language.kernel.resource.kernel.EditorRuler</code>.
 * </p>
 * <p>
 * The editor's editing context has id
 * <code>org.servicifi.gelato.language.kernel.resource.kernel.EditorScope</code>.
 * </p>
 * <p>
 * </p>
 * </p>
 */
public class KernelEditor extends TextEditor implements IEditingDomainProvider, ISelectionProvider, ISelectionChangedListener, IViewerProvider, org.servicifi.gelato.language.kernel.resource.kernel.IKernelResourceProvider, org.servicifi.gelato.language.kernel.resource.kernel.ui.IKernelBracketHandlerProvider, org.servicifi.gelato.language.kernel.resource.kernel.ui.IKernelAnnotationModelProvider {
	
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelHighlighting highlighting;
	private ProjectionSupport projectionSupport;
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCodeFoldingManager codeFoldingManager;
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelBackgroundParsingStrategy bgParsingStrategy = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelBackgroundParsingStrategy();
	private Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelBackgroundParsingListener> bgParsingListeners = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelBackgroundParsingListener>();
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelColorManager colorManager = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelColorManager();
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePage outlinePage;
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource;
	private IResourceChangeListener resourceChangeListener = new ModelResourceChangeListener();
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelPropertySheetPage propertySheetPage;
	private EditingDomain editingDomain;
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.IKernelBracketHandler bracketHandler;
	private List<ISelectionChangedListener> selectionChangedListeners = new LinkedList<ISelectionChangedListener>();
	private ISelection editorSelection;
	
	public KernelEditor() {
		super();
		setSourceViewerConfiguration(new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelSourceViewerConfiguration(this, this, colorManager));
		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
		addSelectionChangedListener(this);
	}
	
	/**
	 * A custom document listener that triggers background parsing if needed.
	 */
	private final class DocumentListener implements IDocumentListener {
		
		public void documentAboutToBeChanged(DocumentEvent event) {
		}
		
		public void documentChanged(DocumentEvent event) {
			bgParsingStrategy.parse(event, getResource(), KernelEditor.this);
		}
	}
	
	/**
	 * <p>
	 * Reacts to changes of the text resource displayed in the editor and resources
	 * cross-referenced by it. Cross-referenced resources are unloaded, the displayed
	 * resource is reloaded. An attempt to resolve all proxies in the displayed
	 * resource is made after each change.
	 * </p>
	 * <p>
	 * The code pretty much corresponds to what EMF generates for a tree editor.
	 * </p>
	 */
	private class ModelResourceChangeListener implements IResourceChangeListener {
		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor implements IResourceDeltaVisitor {
					protected ResourceSet resourceSet = getResourceSet();
					
					public boolean visit(IResourceDelta delta) {
						if (delta.getResource().getType() != IResource.FILE) {
							return true;
						}
						int deltaKind = delta.getKind();
						if (deltaKind == IResourceDelta.CHANGED && delta.getFlags() != IResourceDelta.MARKERS) {
							Resource changedResource = resourceSet.getResource(URI.createURI(delta.getFullPath().toString()), false);
							if (changedResource != null) {
								changedResource.unload();
								org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource currentResource = getResource();
								if (changedResource.equals(currentResource)) {
									// reload the resource displayed in the editor
									resourceSet.getResource(currentResource.getURI(), true);
								}
								if (currentResource != null && currentResource.getErrors().isEmpty()) {
									EcoreUtil.resolveAll(currentResource);
								}
								// reset the selected element in outline and properties by text position
								if (highlighting != null) {
									highlighting.updateEObjectSelection();
								}
							}
						}
						
						return true;
					}
				}
				
				ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
				delta.accept(visitor);
			} catch (CoreException exception) {
				org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelUIPlugin.logError("Unexpected Error: ", exception);
			}
		}
	}
	
	public void initializeEditor() {
		super.initializeEditor();
		setEditorContextMenuId("org.servicifi.gelato.language.kernel.resource.kernel.EditorContext");
		setRulerContextMenuId("org.servicifi.gelato.language.kernel.resource.kernel.EditorRuler");
	}
	
	public Object getAdapter(@SuppressWarnings("rawtypes") Class required) {
		if (IContentOutlinePage.class.equals(required)) {
			return getOutlinePage();
		} else if (required.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(required);
	}
	
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		// Code Folding
		ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();
		// Occurrence initiation, need ITextResource and ISourceViewer.
		highlighting = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelHighlighting(getResource(), viewer, colorManager, this);
		
		projectionSupport = new ProjectionSupport(viewer, getAnnotationAccess(), getSharedColors());
		projectionSupport.install();
		
		// turn projection mode on
		viewer.doOperation(ProjectionViewer.TOGGLE);
		codeFoldingManager = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCodeFoldingManager(viewer, this);
		
		IContextService contextService = (IContextService) getSite().getService(IContextService.class);
		contextService.activateContext("org.servicifi.gelato.language.kernel.resource.kernel.EditorScope");
	}
	
	protected void doSetInput(IEditorInput editorInput) throws CoreException {
		super.doSetInput(editorInput);
		initializeResourceObject(editorInput);
		IDocument document = getDocumentProvider().getDocument(getEditorInput());
		document.addDocumentListener(new DocumentListener());
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		
		// Show the 'presentation' action set with the 'Toggle Block SelectionMode' and
		// 'Show Whitespace Characters' actions.
		IWorkbenchPage page = site.getPage();
		page.showActionSet("org.eclipse.ui.edit.text.actionSet.presentation");
	}
	
	private void initializeResourceObject(IEditorInput editorInput) {
		if (editorInput instanceof FileEditorInput) {
			initializeResourceObjectFromFile((FileEditorInput) editorInput);
		} else if (editorInput instanceof IStorageEditorInput) {
			initializeResourceObjectFromStorage((IStorageEditorInput) editorInput);
		}
	}
	
	private void initializeResourceObjectFromFile(FileEditorInput input) {
		IFile inputFile = input.getFile();
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelNature.activate(inputFile.getProject());
		String path = inputFile.getFullPath().toString();
		URI uri = URI.createPlatformResourceURI(path, true);
		ResourceSet resourceSet = getResourceSet();
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource loadedResource = (org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource) resourceSet.getResource(uri, false);
		if (loadedResource == null) {
			try {
				Resource demandLoadedResource = null;
				// here we do not use getResource(), because 'resource' might be null, which is ok
				// when initializing the resource object
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource currentResource = this.resource;
				if (currentResource != null && !currentResource.getURI().fileExtension().equals(uri.fileExtension())) {
					// do not attempt to load if file extension has changed in a 'save as' operation	
				}
				else {
					demandLoadedResource = resourceSet.getResource(uri, true);
				}
				if (demandLoadedResource instanceof org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource) {
					setResource((org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource) demandLoadedResource);
				} else {
					// the resource was not loaded by an EMFText resource, but some other EMF resource
					org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelUIPlugin.showErrorDialog("Invalid resource.", "The file '" + uri.lastSegment() + "' of type '" + uri.fileExtension() + "' can not be handled by the KernelEditor.");
					// close this editor because it can not present the resource
					close(false);
				}
			} catch (Exception e) {
				org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelUIPlugin.logError("Exception while loading resource in " + this.getClass().getSimpleName() + ".", e);
			}
		} else {
			setResource(loadedResource);
		}
	}
	
	private void initializeResourceObjectFromStorage(IStorageEditorInput input) {
		URI uri = null;
		try {
			IStorage storage = input.getStorage();
			InputStream inputStream = storage.getContents();
			uri = URI.createURI(storage.getName(), true);
			ResourceSet resourceSet = getResourceSet();
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource = (org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource) resourceSet.createResource(uri);
			resource.load(inputStream, null);
			setResource(resource);
		} catch (CoreException e) {
			org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelUIPlugin.logError("Exception while loading resource (" + uri + ") in " + getClass().getSimpleName() + ".", e);
		} catch (IOException e) {
			org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelUIPlugin.logError("Exception while loading resource (" + uri + ") in " + getClass().getSimpleName() + ".", e);
		}
	}
	
	public void dispose() {
		colorManager.dispose();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);
		super.dispose();
	}
	
	protected void performSave(boolean overwrite, IProgressMonitor progressMonitor) {
		
		super.performSave(overwrite, progressMonitor);
		
		// Save code folding state
		codeFoldingManager.saveCodeFoldingStateFile(getResource().getURI().toString());
	}
	
	public void registerTextPresentationListener(ITextPresentationListener listener) {
		ISourceViewer viewer = getSourceViewer();
		if (viewer instanceof TextViewer) {
			((TextViewer) viewer).addTextPresentationListener(listener);
		}
	}
	
	public void invalidateTextRepresentation() {
		ISourceViewer viewer = getSourceViewer();
		if (viewer != null) {
			viewer.invalidateTextPresentation();
		}
		highlighting.resetValues();
	}
	
	public void setFocus() {
		super.setFocus();
		this.invalidateTextRepresentation();
		// Parse the document again to remove errors that stem from unresolvable proxy
		// objects
		bgParsingStrategy.parse(getSourceViewer().getDocument(), resource, this, 10);
	}
	
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		FileEditorInput input = (FileEditorInput) getEditorInput();
		String path = input.getFile().getFullPath().toString();
		ResourceSet resourceSet = getResourceSet();
		URI platformURI = URI.createPlatformResourceURI(path, true);
		Resource oldFile = resourceSet.getResource(platformURI, true);
		
		super.performSaveAs(progressMonitor);
		
		// load and resave - input has been changed to new path by super
		FileEditorInput newInput = (FileEditorInput) getEditorInput();
		String newPath = newInput.getFile().getFullPath().toString();
		URI newPlatformURI = URI.createPlatformResourceURI(newPath, true);
		Resource newFile = resourceSet.createResource(newPlatformURI);
		// if the extension is the same, saving was already performed by super by saving
		// the plain text
		if (platformURI.fileExtension().equals(newPlatformURI.fileExtension())) {
			oldFile.unload();
			// save code folding state, is it possible with a new name
			codeFoldingManager.saveCodeFoldingStateFile(getResource().getURI().toString());
		}
		else {
			newFile.getContents().clear();
			newFile.getContents().addAll(oldFile.getContents());
			try {
				oldFile.unload();
				if (newFile.getErrors().isEmpty()) {
					newFile.save(null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public ResourceSet getResourceSet() {
		return getEditingDomain().getResourceSet();
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource getResource() {
		return resource;
	}
	
	private void setResource(org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
		assert resource != null;
		this.resource = resource;
		if (this.resource.getErrors().isEmpty()) {
			EcoreUtil.resolveAll(this.resource);
		}
	}
	
	/**
	 * Returns the outline page this is associated with this editor. If no outline
	 * page exists, a new one is created.
	 */
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePage getOutlinePage() {
		if (outlinePage == null) {
			outlinePage = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelOutlinePage(this);
			// Connect highlighting class and outline page for event notification
			outlinePage.addSelectionChangedListener(highlighting);
			highlighting.addSelectionChangedListener(outlinePage);
		}
		return outlinePage;
	}
	
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelPropertySheetPage();
			// add a slightly modified adapter factory that does not return any editors for
			// properties. this way, a model can never be modified through the properties view.
			AdapterFactory adapterFactory = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelAdapterFactoryProvider().getAdapterFactory();
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory) {
				protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
					return new PropertySource(object, itemPropertySource) {
						protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
							return new PropertyDescriptor(object, itemPropertyDescriptor) {
								public CellEditor createPropertyEditor(Composite composite) {
									return null;
								}
							};
						}
					};
				}
			});
			highlighting.addSelectionChangedListener(propertySheetPage);
		}
		return propertySheetPage;
	}
	
	public EditingDomain getEditingDomain() {
		if (editingDomain == null) {
			editingDomain = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelEditingDomainProvider().getEditingDomain(getEditorInput());
		}
		return editingDomain;
	}
	
	/**
	 * <p>
	 * Sets the caret to the offset of the given element.
	 * </p>
	 * 
	 * @param element has to be contained in the resource of this editor.
	 */
	public void setCaret(EObject element, String text) {
		try {
			if (element == null || text == null || text.equals("")) {
				return;
			}
			ISourceViewer viewer = getSourceViewer();
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource textResource = (org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource) element.eResource();
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = textResource.getLocationMap();
			int destination = locationMap.getCharStart(element);
			int length = locationMap.getCharEnd(element) + 1 - destination;
			
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextScanner lexer = getResource().getMetaInformation().createLexer();
			try {
				lexer.setText(viewer.getDocument().get(destination, length));
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextToken token = lexer.getNextToken();
				String tokenText = token.getText();
				while (tokenText != null) {
					if (token.getText().equals(text)) {
						destination += token.getOffset();
						break;
					}
					token = lexer.getNextToken();
					if (token == null) {
						break;
					}
					tokenText = token.getText();
				}
			} catch (BadLocationException e) {
			}
			destination = ((ProjectionViewer) viewer).modelOffset2WidgetOffset(destination);
			if (destination < 0) {
				destination = 0;
			}
			viewer.getTextWidget().setSelection(destination);
		} catch (Exception e) {
			org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelUIPlugin.logError("Exception in setCaret()", e);
		}
	}
	
	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new ProjectionViewer(parent, ruler, getOverviewRuler(), isOverviewRulerVisible(), styles) {
			
			public void setSelection(ISelection selection, boolean reveal) {
				if (!KernelEditor.this.setSelection(selection, reveal)) {
					super.setSelection(selection, reveal);
				}
			}
			
		};
		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);
		return viewer;
	}
	
	public void addBackgroundParsingListener(org.servicifi.gelato.language.kernel.resource.kernel.IKernelBackgroundParsingListener listener) {
		bgParsingListeners.add(listener);
	}
	
	public void notifyBackgroundParsingFinished() {
		for (org.servicifi.gelato.language.kernel.resource.kernel.IKernelBackgroundParsingListener listener : bgParsingListeners) {
			listener.parsingCompleted(getResource());
		}
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.ui.IKernelBracketHandler getBracketHandler() {
		return bracketHandler;
	}
	
	public void setBracketHandler(org.servicifi.gelato.language.kernel.resource.kernel.ui.IKernelBracketHandler bracketHandler) {
		this.bracketHandler = bracketHandler;
	}
	
	public void createActions() {
		super.createActions();
		ResourceBundle resourceBundle = new ResourceBundle() {
			public Enumeration<String> getKeys() {
				List<String> keys = new ArrayList<String>(3);
				keys.add("SelectAnnotationRulerAction.QuickFix.label");
				keys.add("SelectAnnotationRulerAction.QuickFix.tooltip");
				keys.add("SelectAnnotationRulerAction.QuickFix.description");
				return Collections.enumeration(keys);
			}
			public Object handleGetObject(String key) {
				if (key.equals("SelectAnnotationRulerAction.QuickFix.label")) return "&Quick Fix";
				if (key.equals("SelectAnnotationRulerAction.QuickFix.tooltip")) return "Quick Fix";
				if (key.equals("SelectAnnotationRulerAction.QuickFix.description")) return "Runs Quick Fix on the annotation's line";
				return null;
			}
		};
		setAction(ITextEditorActionConstants.RULER_CLICK, new SelectMarkerRulerAction(resourceBundle, "SelectAnnotationRulerAction.", this, getVerticalRuler()) {
			public void run() {
				runWithEvent(null);
			}
			
			public void runWithEvent(Event event) {
				ITextOperationTarget operation = (ITextOperationTarget) getAdapter(ITextOperationTarget.class);
				final int opCode = ISourceViewer.QUICK_ASSIST;
				if (operation != null && operation.canDoOperation(opCode)) {
					Position position = getPosition();
					if (position != null) {
						selectAndReveal(position.getOffset(), position.getLength());
					}
					operation.doOperation(opCode);
				}
			}
			
			private Position getPosition() {
				AbstractMarkerAnnotationModel model = getAnnotationModel();
				IAnnotationAccessExtension  annotationAccess = getAnnotationAccessExtension();
				
				IDocument document = getDocument();
				if (model == null) {
					return null;
				}
				
				Iterator<?> iter = model.getAnnotationIterator();
				int layer = Integer.MIN_VALUE;
				
				while (iter.hasNext()) {
					Annotation annotation = (Annotation) iter.next();
					if (annotation.isMarkedDeleted()) {
						continue;
					}
					
					if (annotationAccess != null) {
						int annotationLayer = annotationAccess.getLayer(annotation);
						if (annotationLayer < layer) {
							continue;
						}
					}
					
					Position position = model.getPosition(annotation);
					if (!includesRulerLine(position, document)) {
						continue;
					}
					
					return position;
				}
				return null;
			}
			
		});
	}
	
	public IAnnotationModel getAnnotationModel() {
		return getDocumentProvider().getAnnotationModel(getEditorInput());
	}
	
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}
	
	public ISelection getSelection() {
		return editorSelection;
	}
	
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}
	
	public void selectionChanged(SelectionChangedEvent event) {
		ISelection selection = event.getSelection();
		setSelection(selection, true);
	}
	
	public void setSelection(ISelection selection) {
		editorSelection = selection;
		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
	}
	
	private boolean setSelection(ISelection selection, boolean reveal) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object object = structuredSelection.getFirstElement();
			if (object instanceof EObject) {
				EObject element = (EObject) object;
				Resource resource = element.eResource();
				if (resource == null) {
					return false;
				}
				if (!(resource instanceof org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource)) {
					return false;
				}
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource textResource = (org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource) resource;
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = textResource.getLocationMap();
				int destination = locationMap.getCharStart(element);
				if (destination < 0) {
					destination = 0;
				}
				selectAndReveal(destination, 0);
				int length = locationMap.getCharEnd(element) - destination + 1;
				getSourceViewer().setRangeIndication(destination, length, true);
				getSourceViewer().setSelectedRange(destination, length);
				return true;
			}
		}
		return false;
	}
	
	public Viewer getViewer() {
		return (ProjectionViewer) getSourceViewer();
	}
	
}