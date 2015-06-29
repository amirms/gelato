/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

public class JclResource extends ResourceImpl implements org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource {
	
	public class ElementBasedTextDiagnostic implements org.servicifi.gelato.language.jcl.resource.jcl.IJclTextDiagnostic {
		
		private final org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap;
		private final URI uri;
		private final EObject element;
		private final org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem problem;
		
		public ElementBasedTextDiagnostic(org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap, URI uri, org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem problem, EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem getProblem() {
			return problem;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public int getCharStart() {
			return Math.max(0, locationMap.getCharStart(element));
		}
		
		public int getCharEnd() {
			return Math.max(0, locationMap.getCharEnd(element));
		}
		
		public int getColumn() {
			return Math.max(0, locationMap.getColumn(element));
		}
		
		public int getLine() {
			return Math.max(0, locationMap.getLine(element));
		}
		
		public EObject getElement() {
			return element;
		}
		
		public boolean wasCausedBy(EObject element) {
			if (this.element == null) {
				return false;
			}
			return this.element.equals(element);
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	public class PositionBasedTextDiagnostic implements org.servicifi.gelato.language.jcl.resource.jcl.IJclTextDiagnostic {
		
		private final URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem problem;
		
		public PositionBasedTextDiagnostic(URI uri, org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem problem, int column, int line, int charStart, int charEnd) {
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem getProblem() {
			return problem;
		}
		
		public int getCharStart() {
			return charStart;
		}
		
		public int getCharEnd() {
			return charEnd;
		}
		
		public int getColumn() {
			return column;
		}
		
		public int getLine() {
			return line;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(EObject element) {
			return false;
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolverSwitch resolverSwitch;
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap;
	private int proxyCounter = 0;
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclTextParser parser;
	private org.servicifi.gelato.language.jcl.resource.jcl.util.JclLayoutUtil layoutUtil = new org.servicifi.gelato.language.jcl.resource.jcl.util.JclLayoutUtil();
	private org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMarkerHelper markerHelper;
	private Map<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclContextDependentURIFragment<? extends EObject>> internalURIFragmentMap = new LinkedHashMap<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclContextDependentURIFragment<? extends EObject>>();
	private Map<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix> quickFixMap = new LinkedHashMap<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix>();
	private Map<?, ?> loadOptions;
	
	/**
	 * If a post-processor is currently running, this field holds a reference to it.
	 * This reference is used to terminate post-processing if needed.
	 */
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessor runningPostProcessor;
	
	/**
	 * A flag (and lock) to indicate whether reloading of the resource shall be
	 * cancelled.
	 */
	private Boolean terminateReload = false;
	private Object terminateReloadLock = new Object();
	private Object loadingLock = new Object();
	private boolean delayNotifications = false;
	private List<Notification> delayedNotifications = new ArrayList<Notification>();
	private InputStream latestReloadInputStream = null;
	private Map<?, ?> latestReloadOptions = null;
	
	/**
	 * This flag indicates whether this resource is currently reloaded. The flag is
	 * set and unset in the reload() method and used to decide what kinds of
	 * constraints (live or batch) need to be evaluated. This decision is made in
	 * runValidators().
	 */
	private boolean isReloading = false;
	private org.servicifi.gelato.language.jcl.resource.jcl.util.JclInterruptibleEcoreResolver interruptibleResolver;
	
	protected org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMetaInformation metaInformation = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMetaInformation();
	
	public JclResource() {
		super();
		resetLocationMap();
	}
	
	public JclResource(URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(InputStream inputStream, Map<?,?> options) throws IOException {
		synchronized (loadingLock) {
			if (processTerminationRequested()) {
				return;
			}
			this.loadOptions = options;
			delayNotifications = true;
			resetLocationMap();
			String encoding = getEncoding(options);
			InputStream actualInputStream = inputStream;
			Object inputStreamPreProcessorProvider = null;
			if (options != null) {
				inputStreamPreProcessorProvider = options.get(org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
			}
			if (inputStreamPreProcessorProvider != null) {
				if (inputStreamPreProcessorProvider instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclInputStreamProcessorProvider) {
					org.servicifi.gelato.language.jcl.resource.jcl.IJclInputStreamProcessorProvider provider = (org.servicifi.gelato.language.jcl.resource.jcl.IJclInputStreamProcessorProvider) inputStreamPreProcessorProvider;
					org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
					actualInputStream = processor;
				}
			}
			
			// We store the parser instance in a field instead of a local variable, because we
			// may need to terminate the parser from another thread.
			parser = getMetaInformation().createParser(actualInputStream, encoding);
			parser.setOptions(options);
			org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
			referenceResolverSwitch.setOptions(options);
			org.servicifi.gelato.language.jcl.resource.jcl.IJclParseResult result = parser.parse();
			// dispose parser, we don't need it anymore
			parser = null;
			
			if (processTerminationRequested()) {
				// do nothing if reload was already restarted
				return;
			}
			
			clearState();
			unloadAndClearContents();
			// We must set the load options again since they are deleted by the unload()
			// method.
			this.loadOptions = options;
			EObject root = null;
			if (result != null) {
				root = result.getRoot();
				if (root != null) {
					org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap newLocationMap = result.getLocationMap();
					if (newLocationMap != null) {
						this.locationMap = newLocationMap;
					}
					if (isLayoutInformationRecordingEnabled()) {
						layoutUtil.transferAllLayoutInformationToModel(root);
					}
					if (processTerminationRequested()) {
						// the next reload will add new content
						return;
					}
					getContentsInternal().add(root);
				}
				Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>> commands = result.getPostParseCommands();
				if (commands != null) {
					for (org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>  command : commands) {
						command.execute(this);
					}
				}
			}
			getReferenceResolverSwitch().setOptions(options);
			if (getErrors().isEmpty()) {
				if (!runPostProcessors(options)) {
					return;
				}
				if (root != null) {
					runValidators(root);
				}
			}
			notifyDelayed();
		}
	}
	
	protected void unloadAndClearContents() {
		List<EObject> contentsInternal = getContentsInternal();
		// unload the root objects
		for (EObject eObject : contentsInternal) {
			if (eObject instanceof InternalEObject) {
				unloaded((InternalEObject) eObject);
			}
		}
		// unload all children using the super class method
		unload();
		// now we can clear the contents
		contentsInternal.clear();
	}
	
	protected boolean processTerminationRequested() {
		if (terminateReload) {
			delayNotifications = false;
			delayedNotifications.clear();
			return true;
		}
		return false;
	}
	
	protected void notifyDelayed() {
		delayNotifications = false;
		for (Notification delayedNotification : delayedNotifications) {
			super.eNotify(delayedNotification);
		}
		delayedNotifications.clear();
	}
	
	public void eNotify(Notification notification) {
		if (delayNotifications) {
			delayedNotifications.add(notification);
		} else {
			super.eNotify(notification);
		}
	}
	
	/**
	 * Reloads the contents of this resource from the given stream.
	 */
	public void reload(InputStream inputStream, Map<?,?> options) throws IOException {
		synchronized (terminateReloadLock) {
			latestReloadInputStream = inputStream;
			latestReloadOptions = options;
			if (terminateReload == true) {
				// reload already requested
			}
			terminateReload = true;
		}
		cancelReload();
		synchronized (loadingLock) {
			synchronized (terminateReloadLock) {
				terminateReload = false;
			}
			isLoaded = false;
			Map<Object, Object> loadOptions = addDefaultLoadOptions(latestReloadOptions);
			try {
				// Set isReloading flag to allow other method to differentiate between loading and
				// reloading.
				this.isReloading = true;
				doLoad(latestReloadInputStream, loadOptions);
			} catch (org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTerminateParsingException tpe) {
				// do nothing - the resource is left unchanged if this exception is thrown
			}
			this.isReloading = false;
			resolveAfterParsing();
			isLoaded = true;
		}
	}
	
	/**
	 * Cancels reloading this resource. The running parser and post processors are
	 * terminated.
	 */
	protected void cancelReload() {
		// Cancel parser
		org.servicifi.gelato.language.jcl.resource.jcl.IJclTextParser parserCopy = parser;
		if (parserCopy != null) {
			parserCopy.terminate();
		}
		// Cancel post processor(s)
		org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessor runningPostProcessorCopy = runningPostProcessor;
		if (runningPostProcessorCopy != null) {
			runningPostProcessorCopy.terminate();
		}
		// Cancel reference resolving
		org.servicifi.gelato.language.jcl.resource.jcl.util.JclInterruptibleEcoreResolver interruptibleResolverCopy = interruptibleResolver;
		if (interruptibleResolverCopy != null) {
			interruptibleResolverCopy.terminate();
		}
	}
	
	protected void doSave(OutputStream outputStream, Map<?,?> options) throws IOException {
		org.servicifi.gelato.language.jcl.resource.jcl.IJclTextPrinter printer = getMetaInformation().createPrinter(outputStream, this);
		org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		printer.setEncoding(getEncoding(options));
		printer.setOptions(options);
		referenceResolverSwitch.setOptions(options);
		for (EObject root : getContentsInternal()) {
			if (isLayoutInformationRecordingEnabled()) {
				layoutUtil.transferAllLayoutInformationFromModel(root);
			}
			printer.print(root);
			if (isLayoutInformationRecordingEnabled()) {
				layoutUtil.transferAllLayoutInformationToModel(root);
			}
		}
	}
	
	protected String getSyntaxName() {
		return "jcl";
	}
	
	public String getEncoding(Map<?, ?> options) {
		String encoding = null;
		if (new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().isEclipsePlatformAvailable()) {
			encoding = new org.servicifi.gelato.language.jcl.resource.jcl.util.JclEclipseProxy().getPlatformResourceEncoding(uri);
		}
		if (options != null) {
			Object encodingOption = options.get(org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.OPTION_ENCODING);
			if (encodingOption != null) {
				encoding = encodingOption.toString();
			}
		}
		return encoding;
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMetaInformation getMetaInformation() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMetaInformation();
	}
	
	/**
	 * Clears the location map by replacing it with a new instance.
	 */
	protected void resetLocationMap() {
		// Although, the location map is obtained from the parser after every parse run,
		// we initialize it here to avoid null pointer exceptions.
		locationMap = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclLocationMap();
	}
	
	public void addURIFragment(String internalURIFragment, org.servicifi.gelato.language.jcl.resource.jcl.IJclContextDependentURIFragment<? extends EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends EObject, ReferenceType extends EObject> void registerContextDependentProxy(org.servicifi.gelato.language.jcl.resource.jcl.IJclContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, EReference reference, String id, EObject proxyElement, int position) {
		InternalEObject proxy = (InternalEObject) proxyElement;
		String internalURIFragment = org.servicifi.gelato.language.jcl.resource.jcl.IJclContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		org.servicifi.gelato.language.jcl.resource.jcl.IJclContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, position, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			org.servicifi.gelato.language.jcl.resource.jcl.IJclContextDependentURIFragment<? extends EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolveResult<? extends EObject> result = null;
			// catch and report all Exceptions that occur during proxy resolving
			try {
				result = uriFragment.resolve();
			} catch (Exception e) {
				String message = "An expection occured while resolving the proxy for: "+ id + ". (" + e.toString() + ")";
				addProblem(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclProblem(message, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.UNRESOLVED_REFERENCE, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity.ERROR), uriFragment.getProxy());
				new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().logError(message, e);
			}
			if (result == null) {
				// the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachResolveError(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				EObject proxy = uriFragment.getProxy();
				// remove an error that might have been added by an earlier attempt
				removeDiagnostics(proxy, getErrors());
				// remove old warnings and attach new
				removeDiagnostics(proxy, getWarnings());
				attachResolveWarnings(result, proxy);
				org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceMapping<? extends EObject> mapping = result.getMappings().iterator().next();
				EObject resultElement = getResultElement(uriFragment, mapping, proxy, result.getErrorMessage());
				EObject container = uriFragment.getContainer();
				replaceProxyInLayoutAdapters(container, proxy, resultElement);
				return resultElement;
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	protected void replaceProxyInLayoutAdapters(EObject container, EObject proxy, EObject target) {
		for (Adapter adapter : container.eAdapters()) {
			if (adapter instanceof org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclLayoutInformationAdapter) {
				org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclLayoutInformationAdapter layoutInformationAdapter = (org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclLayoutInformationAdapter) adapter;
				layoutInformationAdapter.replaceProxy(proxy, target);
			}
		}
	}
	
	protected EObject getResultElement(org.servicifi.gelato.language.jcl.resource.jcl.IJclContextDependentURIFragment<? extends EObject> uriFragment, org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceMapping<? extends EObject> mapping, EObject proxy, final String errorMessage) {
		if (mapping instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclURIMapping<?>) {
			URI uri = ((org.servicifi.gelato.language.jcl.resource.jcl.IJclURIMapping<? extends EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (Exception e) {
					// we can catch exceptions here, because EMF will try to resolve again and handle
					// the exception
				}
				if (result == null || result.eIsProxy()) {
					// unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclProblem(errorMessage, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.UNRESOLVED_REFERENCE, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclElementMapping<?>) {
			EObject element = ((org.servicifi.gelato.language.jcl.resource.jcl.IJclElementMapping<? extends EObject>)mapping).getTargetElement();
			EReference reference = uriFragment.getReference();
			EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					ManyInverse<EObject> list = org.servicifi.gelato.language.jcl.resource.jcl.util.JclCastUtil.cast(element.eGet(oppositeReference, false));										// avoids duplicate entries in the reference caused by adding to the
					// oppositeReference
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert(false);
			return null;
		}
	}
	
	protected void removeDiagnostics(EObject cause, List<Diagnostic> diagnostics) {
		// remove all errors/warnings from this resource
		for (Diagnostic errorCand : new BasicEList<Diagnostic>(diagnostics)) {
			if (errorCand instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclTextDiagnostic) {
				if (((org.servicifi.gelato.language.jcl.resource.jcl.IJclTextDiagnostic) errorCand).wasCausedBy(cause)) {
					diagnostics.remove(errorCand);
					unmark(cause);
				}
			}
		}
	}
	
	protected void attachResolveError(org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolveResult<?> result, EObject proxy) {
		// attach errors to this resource
		assert result != null;
		final String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclProblem(errorMessage, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.UNRESOLVED_REFERENCE, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity.ERROR, result.getQuickFixes()), proxy);
		}
	}
	
	protected void attachResolveWarnings(org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolveResult<? extends EObject> result, EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceMapping<? extends EObject> mapping : result.getMappings()) {
				final String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclProblem(warningMessage, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.UNRESOLVED_REFERENCE, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity.WARNING), proxy);
			}
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void doUnload() {
		super.doUnload();
		clearState();
		loadOptions = null;
	}
	
	/**
	 * Runs all post processors to process this resource.
	 */
	protected boolean runPostProcessors(Map<?, ?> loadOptions) {
		unmark(org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.ANALYSIS_PROBLEM);
		if (processTerminationRequested()) {
			return false;
		}
		// first, run the generated post processor
		runPostProcessor(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResourcePostProcessor());
		if (loadOptions == null) {
			return true;
		}
		// then, run post processors that are registered via the load options extension
		// point
		Object resourcePostProcessorProvider = loadOptions.get(org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessorProvider) {
				runPostProcessor(((org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor());
			} else if (resourcePostProcessorProvider instanceof Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (processTerminationRequested()) {
						return false;
					}
					if (processorProvider instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessorProvider) {
						org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessorProvider csProcessorProvider = (org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessorProvider) processorProvider;
						org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						runPostProcessor(postProcessor);
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * Runs the given post processor to process this resource.
	 */
	protected void runPostProcessor(org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessor postProcessor) {
		try {
			this.runningPostProcessor = postProcessor;
			postProcessor.process(this);
		} catch (Exception e) {
			new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().logError("Exception while running a post-processor.", e);
		}
		this.runningPostProcessor = null;
	}
	
	public void load(Map<?, ?> options) throws IOException {
		Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
		resolveAfterParsing();
	}
	
	protected void resolveAfterParsing() {
		interruptibleResolver = new org.servicifi.gelato.language.jcl.resource.jcl.util.JclInterruptibleEcoreResolver();
		interruptibleResolver.resolveAll(this);
		interruptibleResolver = null;
	}
	
	public void setURI(URI uri) {
		// because of the context dependent proxy resolving it is essential to resolve all
		// proxies before the URI is changed which can cause loss of object identities
		EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	/**
	 * Returns the location map that contains information about the position of the
	 * contents of this resource in the original textual representation.
	 */
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap getLocationMap() {
		return locationMap;
	}
	
	/**
	 * <p>
	 * Sets the location map that contains information about the position of the
	 * contents of this resource in the original textual representation.
	 * </p>
	 * <p>
	 * Use this method carefully. If the location map is replaced with a map that
	 * contains wrong location data, clients that obtain locations via {@link
	 * #getLocationMap()} will behave unexpectedly.
	 * </p>
	 */
	public void setLocationMap(org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public void addProblem(org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem problem, EObject element) {
		ElementBasedTextDiagnostic diagnostic = new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		mark(diagnostic);
		addQuickFixesToQuickFixMap(problem);
	}
	
	public void addProblem(org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem problem, int column, int line, int charStart, int charEnd) {
		PositionBasedTextDiagnostic diagnostic = new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		mark(diagnostic);
		addQuickFixesToQuickFixMap(problem);
	}
	
	protected void addQuickFixesToQuickFixMap(org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem problem) {
		Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix> quickFixes = problem.getQuickFixes();
		if (quickFixes != null) {
			for (org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix quickFix : quickFixes) {
				if (quickFix != null) {
					quickFixMap.put(quickFix.getContextAsString(), quickFix);
				}
			}
		}
	}
	
	@Deprecated
	public void addError(String message, EObject cause) {
		addError(message, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.UNKNOWN, cause);
	}
	
	public void addError(String message, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType type, EObject cause) {
		addProblem(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclProblem(message, type, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity.ERROR), cause);
	}
	
	@Deprecated
	public void addWarning(String message, EObject cause) {
		addWarning(message, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.UNKNOWN, cause);
	}
	
	public void addWarning(String message, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType type, EObject cause) {
		addProblem(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclProblem(message, type, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity.WARNING), cause);
	}
	
	protected List<Diagnostic> getDiagnostics(org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity severity) {
		if (severity == org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected Map<Object, Object> addDefaultLoadOptions(Map<?, ?> loadOptions) {
		Map<Object, Object> loadOptionsCopy = org.servicifi.gelato.language.jcl.resource.jcl.util.JclMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		// first add static option provider
		loadOptionsCopy.putAll(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclOptionProvider().getOptions());
		
		// second, add dynamic option providers that are registered via extension
		if (new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().isEclipsePlatformAvailable()) {
			new org.servicifi.gelato.language.jcl.resource.jcl.util.JclEclipseProxy().getDefaultLoadOptionProviderExtensions(loadOptionsCopy);
		}
		return loadOptionsCopy;
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void clearState() {
		// clear concrete syntax information
		resetLocationMap();
		internalURIFragmentMap.clear();
		getErrors().clear();
		getWarnings().clear();
		// Remove temporary markers
		unmark(org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.UNKNOWN);
		unmark(org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.SYNTAX_ERROR);
		unmark(org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.UNRESOLVED_REFERENCE);
		unmark(org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.LIVE_CONSTRAINT_PROBLEM);
		// If the resource is reloaded, we do not remove the problems that were detected
		// by batch constraints. This ensures that we can see the problems while typing.
		// The problems might get out dated because of the ongoing modifications, but they
		// will be updated (i.e., deleted and recreated) the next time the resource is
		// saved (and loaded again).
		if (!isReloading) {
			unmark(org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.BATCH_CONSTRAINT_PROBLEM);
		}
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	/**
	 * Returns a copy of the contents of this resource wrapped in a list that
	 * propagates changes to the original resource list. Wrapping is required to make
	 * sure that clients which obtain a reference to the list of contents do not
	 * interfere when changing the list.
	 */
	public EList<EObject> getContents() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new BasicEList<EObject>();
		}
		return new org.servicifi.gelato.language.jcl.resource.jcl.util.JclCopiedEObjectInternalEList((InternalEList<EObject>) super.getContents());
	}
	
	/**
	 * Returns the raw contents of this resource. In contrast to getContents(), this
	 * methods does not return a copy of the content list, but the original list.
	 */
	public EList<EObject> getContentsInternal() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new BasicEList<EObject>();
		}
		return super.getContents();
	}
	
	/**
	 * Returns all warnings that are associated with this resource.
	 */
	public EList<Diagnostic> getWarnings() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new BasicEList<Diagnostic>();
		}
		return new org.servicifi.gelato.language.jcl.resource.jcl.util.JclCopiedEList<Diagnostic>(super.getWarnings());
	}
	
	/**
	 * Returns all errors that are associated with this resource.
	 */
	public EList<Diagnostic> getErrors() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new BasicEList<Diagnostic>();
		}
		return new org.servicifi.gelato.language.jcl.resource.jcl.util.JclCopiedEList<Diagnostic>(super.getErrors());
	}
	
	/**
	 * Returns true if errors are associated with this resource.
	 */
	public boolean hasErrors() {
		// We use the method of the super class to avoid copying the list of errors which
		// is done by getErrors() in this class. Creating a copy is not required to check
		// whether the list of errors is empty and moreover it did cause race conditions
		// in the editor that led to ArrayIndexOutOfBoundsExceptions while copying the
		// error list.
		return !super.getErrors().isEmpty();
	}
	
	protected void runValidators(EObject root) {
		// checking constraints provided by EMF validator classes was disabled by option
		// 'disableEValidators'.
		
		if (new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().isEclipsePlatformAvailable()) {
			if (loadOptions == null || !Boolean.TRUE.equals(loadOptions.get(org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.DISABLE_EMF_VALIDATION))) {
				// We do only evaluate batch constraints when the resource is loaded for the first
				// time. If the resource is reloaded, only live constraints are evaluated.
				boolean includeBatchConstraints = !this.isReloading;
				new org.servicifi.gelato.language.jcl.resource.jcl.util.JclEclipseProxy().checkEMFValidationConstraints(this, root, includeBatchConstraints);
			}
		}
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix getQuickFix(String quickFixContext) {
		return quickFixMap.get(quickFixContext);
	}
	
	protected void mark(org.servicifi.gelato.language.jcl.resource.jcl.IJclTextDiagnostic diagnostic) {
		org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMarkerHelper markerHelper = getMarkerHelper();
		if (markerHelper != null) {
			markerHelper.mark(this, diagnostic);
		}
	}
	
	protected void unmark(EObject cause) {
		org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMarkerHelper markerHelper = getMarkerHelper();
		if (markerHelper != null) {
			markerHelper.unmark(this, cause);
		}
	}
	
	protected void unmark(org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType analysisProblem) {
		org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMarkerHelper markerHelper = getMarkerHelper();
		if (markerHelper != null) {
			markerHelper.unmark(this, analysisProblem);
		}
	}
	
	protected org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMarkerHelper getMarkerHelper() {
		if (isMarkerCreationEnabled() && new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().isEclipsePlatformAvailable()) {
			if (markerHelper == null) {
				markerHelper = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMarkerHelper();
			}
			return markerHelper;
		}
		return null;
	}
	
	public boolean isMarkerCreationEnabled() {
		if (loadOptions == null) {
			return true;
		}
		Object value = loadOptions.get(org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.DISABLE_CREATING_MARKERS_FOR_PROBLEMS);
		return value == null || Boolean.FALSE.equals(value);
	}
	
	public boolean isLocationMapEnabled() {
		if (loadOptions == null) {
			return true;
		}
		Object value = loadOptions.get(org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.DISABLE_LOCATION_MAP);
		return value == null || Boolean.FALSE.equals(value);
	}
	
	public boolean isLayoutInformationRecordingEnabled() {
		if (loadOptions == null) {
			return true;
		}
		Object value = loadOptions.get(org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.DISABLE_LAYOUT_INFORMATION_RECORDING);
		return value == null || Boolean.FALSE.equals(value);
	}
	
}
