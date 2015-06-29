package org.servicifi.language.cobol.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.servicifi.gelato.language.cobol.CobolClasspath;
import org.servicifi.gelato.language.cobol.CobolUniquePathConstructor;
import org.servicifi.gelato.language.cobol.commons.NamedElement;
import org.servicifi.gelato.language.cobol.containers.CompilationGroup;
import org.servicifi.gelato.language.cobol.resource.cobol.ICobolContextDependentURIFragmentFactory;
import org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation;
import org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformationAdapter;
import org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResource;
import org.servicifi.gelato.language.cobol.resource.cobol.util.CobolLayoutUtil;
//import org.servicifi.language.cobol.resource.util.Logger;

public class PreprocessedCobolSourceOrCopybookFileResource extends CobolResource {
	
	//private CobolLayoutUtil layoutUtil = new CobolLayoutUtil();
	
	public PreprocessedCobolSourceOrCopybookFileResource(URI uri){
		
		super(uri);
		
	}
	
	protected boolean isCobolSourceFile() {
		if (getContentsInternal().isEmpty()) {
			return false;
		}
		return getContentsInternal().get(0) instanceof CompilationGroup;
	}
	
	protected boolean hasCobolCompilationUnitURI() {
		if (uri == null) {
			return false;
		}
		return uri.toString().startsWith(
				CobolUniquePathConstructor.COBOL_COMPILATION_UNIT_PATHMAP);
	}

	
		
	@Override
	public void load(Map<?, ?> options) throws IOException {
    	URIConverter uriConverter = getURIConverter();
    	URI normalizedURI = uriConverter.normalize(uri);
    	//Logger.log("Loading the resource with the normalized URI: " + normalizedURI);
    	System.out.println("Loading the resource with the normalized URI: " + normalizedURI);
    	if (normalizedURI.toString().startsWith(CobolUniquePathConstructor.COBOL_COMPILATION_UNIT_PATHMAP)) {
			//classes should have a physical resource
			System.out.println("[Gelato] Warning: " + uri.lastSegment() + " not registered in class path");
		} else {
			System.out.println("Loading uri: " + uri);
			
			super.load(options);
			System.out.println("Loaded");
			
			
		}
		register();
	}
	
	
	
	/**
	 * We override this method to enhance the created proxy objects by setting
	 * the 'name' attribute. This is needed to ask proxy objects for their name
	 * without resolving them.
	 * 
	 * @author Jamopp
	 */

	public <ContainerType extends EObject, ReferenceType extends EObject> void registerContextDependentProxy
		(ICobolContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, EReference reference, String id, EObject proxyElement, int position) {
		super.registerContextDependentProxy(factory, container, reference, id, proxyElement, position);
		System.out.println("setting name of the proxy element with: " + id);
		if (proxyElement instanceof NamedElement) {
		NamedElement namedElement = (NamedElement) proxyElement;
			namedElement.setName(id);
		}
	}
	
	
	protected void register() throws IOException {
		URI myURI = getURI();
		
		System.out.println("The URI with which the contents are being registered is: "+ myURI);
		if (!getContentsInternal().isEmpty()) {
			
			EObject root = getContentsInternal().get(0);
			if(root instanceof CompilationGroup) {
				CompilationGroup cg = (CompilationGroup) root;
				setCompilationGroup(cg);
			}

			
			//only for physical URIs
			//if(hasCobolCompilationUnitURI()) {
				//Logger.log("Registering URI which has a Copybook Proxy URI: "+ myURI);
				//return;
			//}
			
			if(root instanceof CompilationGroup) {
				CompilationGroup cg = (CompilationGroup) root;
				CobolClasspath.get().registerCompilationGroupSourceFile(cg, myURI);

			}
		}
	}
	
	protected void setCompilationGroup(CompilationGroup cg) {
		//System.out.println("Setting compilation group name");
		String fileName = getURI().lastSegment();
		cg.setName(fileName);
		
	}
	
}
