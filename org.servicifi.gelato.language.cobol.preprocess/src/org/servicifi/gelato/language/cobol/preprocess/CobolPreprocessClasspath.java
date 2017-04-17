package org.servicifi.gelato.language.cobol.preprocess;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.internal.runtime.Log;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.servicifi.gelato.language.cobol.preprocess.CobolUniquePathConstructor;
import org.servicifi.gelato.language.cobol.preprocess.containers.Copybook;
import org.servicifi.gelato.language.cobol.preprocess.containers.ContainersFactory;;
//import org.servicifi.gelato.language.cobol.util.Logger;

/**
 * This class is based on the JavaClasspth, as in the Jamopp project 
 * This class is responsible for managing and retrieving Cobol resources to
 * establish inter-model references between different Java classes represented
 * as EMF-models.
 */
public class CobolPreprocessClasspath extends AdapterImpl {
	
	/**
	 * Initializers can be registered to initialize each newly created classpath.
	 * An initializer may be used to connect Gelato with other Java tooling 
	 * (e.g., the Eclipse JDT IDE) by reading the classpath from the other tool.
	 * <p>
	 * Initializers can be registered at the classpath via 
	 * {@link CobolPreprocessClasspath#getInitializers()}.
	 * Inside Eclipse, the extension point
	 * <i>org.emftext.language.java.java_classpath_initializer</i>
	 * may also be used for this.
	 */
	public static interface Initializer {
		
		/**
		 * Initializes the classpath. It is called as soon as the
		 * first resource of the resource set with which the classpath 
		 * is associated accesses the classpath.
		 * 
		 * @param resource One resource of the associated resource set
		 * 	               that gives context for initializing the classpath
		 *                 (e.g., the URI of the resource can be analyzed). 
		 */
		void initialize(Resource resource);
		
		/**
		 * @return Should be <code>true</code>, if the classpath depends on the resource that
		 *         is passed to the {@link Initializer#initialize(Resource)} method.
		 *         If one of the registered initializers returns <code>true</code>, it
		 *         enforces the usage an individual classpath for each resource set.
		 *         The {@link CobolPreprocessClasspath#OPTION_USE_LOCAL_CLASSPATH} option can still be
		 *         used to override this.
		 */
		boolean requiresLocalClasspath();
		
	}
	
	private static class InitializerExtensionPointReader {
		
		private static void read() {
			if (Platform.isRunning()) {
				IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
				
				IConfigurationElement configurationElements[] 
						= extensionRegistry.getConfigurationElementsFor(EP_COBOL_CLASSPATH_INITIALIZER);
				for (IConfigurationElement element : configurationElements) {
					try {
						String type = element.getAttribute("class");
						if (type == null) {
							continue;
						}
						Initializer initializer = (Initializer) element.createExecutableExtension("class");
						initializers.add(initializer);
						
					} catch (CoreException ce) {
						String contributingPluginID = element.getDeclaringExtension().getContributor().getName();
						ILog log = Platform.getLog(Platform.getBundle(contributingPluginID));
						IStatus status = new Status(IStatus.ERROR, contributingPluginID, 0, "Error instantiating Java classpath initializer", ce);
						log.log(status);
					}
				}
			}		
		}
	}
	
	public static final String EP_COBOL_CLASSPATH_INITIALIZER = "org.servicifi.gelato.language.cobol.cobol_classpath_initializer";
	
	private static Set<Initializer> initializers = null;
	
	public static Set<Initializer> getInitializers() {
		if (initializers == null) {
			initializers = new LinkedHashSet<Initializer>();
			readInitializersExtensionPoint();
		}
		return initializers;
	}
	
	private static void readInitializersExtensionPoint() {
		try {
			java.lang.Class.forName("org.eclipse.core.runtime.Platform");
		} catch (ClassNotFoundException e) {
			// running outside Eclipse
			return;
		}
		InitializerExtensionPointReader.read();
	}
	
	private static void initialize(Resource resource) {
		for (Initializer initializer : getInitializers()) {
			initializer.initialize(resource);
		}
	}

	/**
	 * If this option is set to true in a resource set, each compilation unit or copybook
	 * loaded is registered in the URI map of the resource set's <code>URIConverter</code>.
	 * <p>
	 * If the option is set to false (default), each classifier loaded is registered
	 * in the global <code>URIConverter.URI_MAP</code>.
	 */
	//public static final String OPTION_USE_LOCAL_CLASSPATH = "OPTION_USE_LOCAL_CLASSPATH";
	
	/**
	 * If this option is set to true in a resource set, all names in a Java resource will 
	 * be printed as full-qualified names when the resource is saved. If this option is
	 * used, imports do not need to be updated when Java resources are modified.
	 * This option is set to false by default. (?)
	 */
	//public static final String OPTION_ALWAYS_USE_FULLY_QUALIFIED_NAMES = "OPTION_ALWAYS_USE_FULLY_QUALIFIED_NAMES";

	/**
	 * Singleton instance.
	 */
	private static CobolPreprocessClasspath globalClasspath = null;

	public static CobolPreprocessClasspath get() {
		getInitializers();
		if (globalClasspath == null) {
			globalClasspath = new CobolPreprocessClasspath(URIConverter.INSTANCE);
			}
		
		return globalClasspath;
	}
	
	public static CobolPreprocessClasspath get(EObject objectContext) {
		getInitializers();
		if (objectContext == null) {
			return get();
		} else {
			return get(objectContext.eResource());
		}
	}

	public static CobolPreprocessClasspath get(Resource resource) {
		getInitializers();
		if(resource == null) {
			return get();
		} else {
			CobolPreprocessClasspath myClasspath = get();
			if (!myClasspath.initialized) {
				//set to true before calling initializers, 
				//since the initializers most likely call this
				//method again to obtain the classpath.
				myClasspath.initialized = true;
				initialize(resource);	
			}
			return myClasspath;
		}
	}
	
	
	protected URIConverter uriConverter = null;
	
	protected ArrayList<String> missingCopybooks = new ArrayList<String>(); 

	public ArrayList<String> getMissingCopybooks(){
		 return missingCopybooks;
	}
	
	public void addMissingCopybook(String cpyName) {
		
		if (!missingCopybooks.contains(cpyName))
			missingCopybooks.add(cpyName);
	}
	
	protected ArrayList<String> usedCopybooks = new ArrayList<String>();
	
	public ArrayList<String> getUsedCopybooks(){
		 return usedCopybooks;
	}
	
	public void addUsedCopybook(String cpyName) {
		
		if (!usedCopybooks.contains(cpyName))
			usedCopybooks.add(cpyName);
	}
	
	
	public Map<URI,URI> getURIMap() {
		if (uriConverter == URIConverter.INSTANCE) {
			return URIConverter.URI_MAP;
		}
		return uriConverter.getURIMap();
	}
	
	public URIConverter getURIConverter() {
		return uriConverter;
	}

	private CobolPreprocessClasspath(URIConverter uriConverter) {
		this.uriConverter = uriConverter;
	}

	private CobolPreprocessClasspath(Resource resource) {
		this.uriConverter = resource.getResourceSet().getURIConverter();
	}

	private boolean initialized = false;

	public void registerCobolCopybookFolder(URI folderURI) {
				
		if (!folderURI.isFile()) {
			return;
		}
		
		//Logger.log("The folderURI.toFileString() is: " + folderURI.toFileString());
		
		File libraryFolder = new File(folderURI.toFileString());
		
		if (libraryFolder.exists()) {
			
			internalRegisterCobolCopybookFolder(libraryFolder);			
		}
		
	}
	
	
	private void internalRegisterCobolCopybookFolder(File folder) {
		for (File child : folder.listFiles()) {
			if (!child.getName().startsWith(".")) { //no hidden files
				if (child.isDirectory()) {					
					internalRegisterCobolCopybookFolder(child);
				} else {
					if (child.getName().endsWith(CobolUniquePathConstructor.COBOL_COPYBOOK_FILE_EXTENSION)) 
					{
						String fileName = child.getName().substring(0, child.getName().lastIndexOf('.'));
						URI uri = URI.createFileURI(child.getAbsolutePath());
						registerCobolCopybook(fileName, uri );
					}
				}
			}
		}
	}
	
	public void registerCobolCopybookFile(Copybook cpy, URI uri) {
		registerCobolCopybook(cpy.getName(), uri);
	}
	
	public void registerCobolCopybook(String copybookName, URI uri) {
		if (copybookName == null || uri == null) {
			return;
		}
		
		
		synchronized (this) {
			
			
			//TODO problem is in the copybookname, adds one extension too many
			URI logicalUri =
				CobolUniquePathConstructor.getCopybookFileResourceURI(copybookName);
			
			URI existingMapping = getURIMap().get(logicalUri);

			if (existingMapping != null && !uri.equals(existingMapping)) {
				//do nothing: silently replace old with new version
			}

		//	Logger.log("Registering Copybook with logical URI: " + logicalUri + " with URI: " + uri);
			
			System.out.println("Registering Copybook with logical URI: " + logicalUri + " with URI: " + uri);
			
			getURIMap().put(logicalUri, uri);
		}
	}
	
	
	public void registerExpandedCobolCopybook(String copybookName, URI uri) {
		if (copybookName == null || uri == null) {
			return;
		}
			
		synchronized (this) {
						
			//TODO problem is in the copybookname, adds one extension too many
			URI logicalUri =
				CobolUniquePathConstructor.getExpandedCopybookResourceURI(copybookName);
			
			URI existingMapping = getURIMap().get(logicalUri);

			if (existingMapping != null && !uri.equals(existingMapping)) {
				//do nothing: silently replace old with new version
			}

		//	Logger.log("Registering Copybook with logical URI: " + logicalUri + " with URI: " + uri);
			
			System.out.println("Registering Expanded Copybook with logical URI: " + logicalUri + "\n corrseponding to the Copybook with URI: " + uri);
		
			getURIMap().put(logicalUri, uri);
		}
	}
	
	
	public URI getExpandedCobolCopybook(String copybookName) {
		return CobolUniquePathConstructor.getExpandedCopybookResourceURI(copybookName);
	}
	
	public URI getCobolCopybook(String copybookName) {
		
		URI logicalUri =
				CobolUniquePathConstructor.getCopybookFileResourceURI(copybookName);
		return getURIMap().get(logicalUri);
	}
			
	
	/**
	 * Removes the copybook identified by its name from the class path.
	 *
	 * @param packageName
	 * @param classifierName
	 */
	public void unRegisterCobolCopybook(String copybookName) {
		if (copybookName == null || copybookName.equals(""))
			return;

		synchronized (this) {

			URI logicalUri =
				CobolUniquePathConstructor.getCopybookFileResourceURI(copybookName);

			getURIMap().remove(logicalUri);
		}
	}	
	
	/**
	 * Constructs a proxy pointing at the copybook identified by its
	 * fully qualified name.
	 *
	 * @param fullQualifiedName
	 * @return proxy element
	 */
	public EObject getCopybook(String fullName) {
		//Logger.log("Getting copy book with Name: " + fullName);
		InternalEObject copybookProxy = null;		
		copybookProxy = (InternalEObject) ContainersFactory.eINSTANCE.createCopybook();
		
		URI proxyURI = CobolUniquePathConstructor.getCopybookResourceURI(fullName);
		//Logger.log("The proxy URI of the copybook is: " + proxyURI.toString());
		copybookProxy.eSetProxyURI(proxyURI);
		//set also the name to reason about it without resolving the proxy  
		((Copybook)copybookProxy).setName(fullName);
		
		return copybookProxy;
	}


}
