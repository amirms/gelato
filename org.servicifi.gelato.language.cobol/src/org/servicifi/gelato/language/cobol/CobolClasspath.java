package org.servicifi.gelato.language.cobol;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
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
import org.servicifi.gelato.language.cobol.CobolClasspath;
import org.servicifi.gelato.language.cobol.CobolUniquePathConstructor;
import org.servicifi.gelato.language.cobol.containers.CompilationGroup;
import org.servicifi.gelato.language.cobol.containers.CompilationUnit;
import org.servicifi.gelato.language.cobol.containers.ContainersFactory;
//import org.servicifi.gelato.language.cobol.util.Logger;

/**
 * This class is based on the JavaClasspth, as in the Jamopp project 
 * This class is responsible for managing and retrieving Cobol resources to
 * establish inter-model references between different Java classes represented
 * as EMF-models.
 */
public class CobolClasspath extends AdapterImpl {
	
	/**
	 * Initializers can be registered to initialize each newly created classpath.
	 * An initializer may be used to connect Gelato with other Java tooling 
	 * (e.g., the Eclipse JDT IDE) by reading the classpath from the other tool.
	 * <p>
	 * Initializers can be registered at the classpath via 
	 * {@link CobolClasspath#getInitializers()}.
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
		 *         The {@link CobolClasspath#OPTION_USE_LOCAL_CLASSPATH} option can still be
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
	private static CobolClasspath globalClasspath = null;

	public static CobolClasspath get() {
		getInitializers();
		if (globalClasspath == null) {
			globalClasspath = new CobolClasspath(URIConverter.INSTANCE);
			}
		
		return globalClasspath;
	}
	
	public static CobolClasspath get(EObject objectContext) {
		getInitializers();
		if (objectContext == null) {
			return get();
		} else {
			return get(objectContext.eResource());
		}
	}

	public static CobolClasspath get(Resource resource) {
		getInitializers();
		if(resource == null) {
			return get();
		} else {
			CobolClasspath myClasspath = get();
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
	
	//taking hold of the comments
	private TreeSet<String> commentSet = new TreeSet<String>();
	
	public void addComments(String comment) {

		 commentSet.add(comment.trim());
	}
	
	public TreeSet<String> getCommentSet() {
		return commentSet;
	}
	
	//Compilation group to Compilation units Mapping
	protected Map<String, List<String>> cgTocuMap =
			new HashMap<String, List<String>>();

		protected void registerCompilationGroup(String cgName, String cuName) {
			if (!cgTocuMap.containsKey(cgName)) {
				cgTocuMap.put(cgName, new UniqueEList<String>());
			}
			if (!cgTocuMap.get(cgName).contains(cuName)) {
				cgTocuMap.get(cgName).add(cuName);
			}
		}

		protected void unRegisterCompilationGroup(String cgName, String cuName) {
			if (cgTocuMap.containsKey(cgName)) {
				cgTocuMap.get(cgName).remove(cuName);
			}
		}

		protected List<String> getCompilationGroupContents(String cgName) {
			List<String> content = new UniqueEList<String>();
			if (cgTocuMap.containsKey(cgName)) {
				content.addAll(cgTocuMap.get(cgName));
			}
			//delegate to global map
			if (get().cgTocuMap.containsKey(cgName)) {
				content.addAll(get().cgTocuMap.get(cgName));
			}
			return content;
		}

		public boolean existsCompilationGroup(String cgName) {
			if (cgTocuMap.containsKey(cgName)) {
				return true;
			}
			return get().cgTocuMap.containsKey(cgName);
		}
	
	
	protected URIConverter uriConverter = null;

	public Map<URI,URI> getURIMap() {
		if (uriConverter == URIConverter.INSTANCE) {
			return URIConverter.URI_MAP;
		}
		return uriConverter.getURIMap();
	}

	private CobolClasspath(URIConverter uriConverter) {
		this.uriConverter = uriConverter;
	}

	private CobolClasspath(Resource resource) {
		this.uriConverter = resource.getResourceSet().getURIConverter();
	}

	private boolean initialized = false;

	
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
				CobolUniquePathConstructor.getCobolCopybookFileResourceURI(copybookName);

			getURIMap().remove(logicalUri);
		}
	}	
	
	public void registerCobolSourceFileFolder(URI folderURI) {
		if (!folderURI.isFile()) {
			return;
		}
		File sourceFolder = new File(folderURI.toFileString());
		if (sourceFolder.exists()) {
			internalRegisterCobolSourceFileFolder(sourceFolder);			
		}
	}
	
	private void internalRegisterCobolSourceFileFolder(File folder) {
		for (File child : folder.listFiles()) {
			if (!child.getName().startsWith(".")) { //no hidden files
				if (child.isDirectory()) {
					internalRegisterCobolSourceFileFolder(child);
				} else {
					if (child.getName().endsWith(CobolUniquePathConstructor.COBOL_FILE_EXTENSION)) 
					{
						String fileName = child.getName().substring(0, child.getName().lastIndexOf('.'));
						URI uri = URI.createFileURI(child.getAbsolutePath());
						registerCompilationGroup(fileName, uri );
					}
				}
			}
		}
	}
	
	/**
	 * TODO not sure, if this is necessary
	 */
	public void registerCompilationGroup(String cgName, URI uri) {
		if (cgName == null || uri == null) {
			return;
		}

		synchronized (this) {

			URI logicalUri =
				CobolUniquePathConstructor.getCobolFileResourceURI(cgName);

			URI existingMapping = getURIMap().get(logicalUri);

			if (existingMapping != null && !uri.equals(existingMapping)) {
				//do nothing: silently replace old with new version
			}

			getURIMap().put(logicalUri, uri);

		}	
	}
	
	/**
	 * Registers all compilation units defined in the given compilation group.
	 *
	 * @param compilationGroup
	 */
	public void registerCompilationGroupSourceFile(CompilationGroup cg, URI uri) {
		String cgName = cg.getName();
		for(CompilationUnit cu : cg.getCompilationUnits()) {
			registerCompilationUnit(cgName, cu.getName(), uri);
			registerNestedCompilationUnits(
					cu, cgName, cu.getName(), uri);
		}
	}
	
	public void registerNestedCompilationUnits(
			CompilationUnit cu, String cgName, String cuName, URI uri) {
		for (CompilationUnit nestedcu : cu.getNestedCompilationUnits()) {
			String newcuName = cuName + CobolUniquePathConstructor.COMPILATION_UNIT_SEPARATOR + nestedcu.getName();
			registerCompilationUnit(cgName, newcuName, uri);
			registerNestedCompilationUnits(nestedcu, cgName, newcuName, uri);
		}
		
	}
	

	/**
	 * Registers the compilation unit with the given name that is physically
	 * located at the given URI.
	 *
	 * @param packageName
	 * @param classifierName
	 * @param uri
	 */
	public void registerCompilationUnit(String cgName, String cuName, URI uri) {
		if (cuName == null || uri == null) {
			return;
		}
		
		if (!cgName.endsWith(".")) {
			cgName = cgName + ".";
		}

		String innerName = cuName;
		String outerName = "";
		String qualifiedName = cgName;

		int idx = cuName.lastIndexOf(CobolUniquePathConstructor.COMPILATION_UNIT_SEPARATOR);
		
		//if idx is negative, then means this is root compilation unit
		if (idx >= 0) {
			
			innerName = cuName.substring(idx + 1);
			outerName = cuName.substring(0, idx + 1);
			
			//cgName must be defined
			
			qualifiedName = cgName + outerName;
			
		}
		

		synchronized (this) {
			registerCompilationGroup(qualifiedName, innerName);

			String fullName = cgName + cuName;
			
			URI logicalUri =
				CobolUniquePathConstructor.getCobolFileResourceURI(fullName);

			URI existingMapping = getURIMap().get(logicalUri);

			if (existingMapping != null && !uri.equals(existingMapping)) {
				//do nothing: silently replace old with new version
			}

			getURIMap().put(logicalUri, uri);

			//make sure outer classes are registered;
			outerName = qualifiedName;
			
			while(outerName.endsWith(".")) {
				//make sure outer classes are registered;
				idx = outerName.lastIndexOf("$");
				
				innerName = outerName.substring(idx + 1);
				outerName = outerName.substring(0, idx + 1);
				
				registerCompilationGroup(outerName, innerName);
				
			}
		}
	}

	//TODO Fix this
	private void registerNestedCompilationUnits(CompilationUnit cu, String cuName, URI uri) {
		CompilationGroup cg = (CompilationGroup)cu.eContainer();

		String cgName = cg.getName() + CobolUniquePathConstructor.COMPILATION_GROUP_SEPARATOR;
		
		String newCUName =  cuName + CobolUniquePathConstructor.COMPILATION_UNIT_SEPARATOR;
		
		registerCompilationUnit(cgName, cuName, uri);
		
	}

	/**
	 * Removes the compilation unit identified by its name from the class path.
	 *
	 * @param packageName
	 * @param classifierName
	 */
	public void unRegisterCompilationUnit(String cgName, String cuName) {
		if (cuName == null || cuName.equals("")) {
			return;
		}

		if (!cgName.endsWith(".")) {
			cgName = cgName + ".";
		}

		String innerName = cuName;
		String outerName = "";
		String qualifiedName = cgName;

		int idx = cuName.lastIndexOf(CobolUniquePathConstructor.COMPILATION_UNIT_SEPARATOR);
		if (idx >= 0) {
			innerName = cuName.substring(idx + 1);
			outerName = cuName.substring(0, idx + 1);
			qualifiedName = cgName + outerName;
		}

		synchronized (this) {
			unRegisterCompilationGroup(qualifiedName, innerName);

			String fullName = cgName + cuName;
			

			URI logicalUri =
				CobolUniquePathConstructor.getCobolFileResourceURI(fullName);

			getURIMap().remove(logicalUri);
		}
	}
	

	public boolean isRegistered(String fullQualifiedName) {
		int idx = fullQualifiedName.lastIndexOf(CobolUniquePathConstructor.COMPILATION_UNIT_SEPARATOR);
		if(idx == -1) {
			idx = -1;
		}
		String containerName = fullQualifiedName.substring(0, idx + 1);
		String cuName = fullQualifiedName.substring(idx + 1);
		List<String> containerContent = getCompilationGroupContents(containerName);
		if(containerContent == null) {
			return false;
		}
		return containerContent.contains(cuName);
	}
	
	/**
	 * Constructs a proxy pointing at the compilation unit identified by its
	 * fully qualified name.
	 *
	 * @param fullQualifiedName
	 * @return proxy element
	 */
	
	public EObject getCompilationUnit(String fullQualifiedName) {
		InternalEObject compilationUnitProxy 
			= (InternalEObject) ContainersFactory.eINSTANCE.createCompilationUnit();
		URI proxyURI = CobolUniquePathConstructor.getCobolCompilationUnitURI(fullQualifiedName);
		compilationUnitProxy.eSetProxyURI(proxyURI);
		//set also the name to reason about it without resolving the proxy
		((CompilationUnit)compilationUnitProxy).setName(CobolUniquePathConstructor.getSimpleCompilationUnitName(fullQualifiedName));
		return compilationUnitProxy;
	}

}
