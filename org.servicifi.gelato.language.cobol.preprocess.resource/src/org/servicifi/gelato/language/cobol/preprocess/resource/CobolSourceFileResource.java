package org.servicifi.gelato.language.cobol.preprocess.resource;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.servicifi.gelato.language.cobol.preprocess.CobolPreprocessClasspath;
import org.servicifi.gelato.language.cobol.preprocess.CobolUniquePathConstructor;
import org.servicifi.gelato.language.cobol.preprocess.containers.Copybook;
import org.servicifi.gelato.language.cobol.preprocess.containers.PreprocessingGroup;
import org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessResource;

public class CobolSourceFileResource extends PreprocessResource{

	public CobolSourceFileResource(URI uri) {
	
		super(uri);
	}
	
	
	protected boolean isCopybook() {
		if (getContentsInternal().isEmpty()) {
			return false;
		}
		return getContentsInternal().get(0) instanceof Copybook;
	}
	
	protected boolean isCobolSourceFile() {
		if (getContentsInternal().isEmpty()) {
			return false;
		}
		return getContentsInternal().get(0) instanceof PreprocessingGroup;
	}
	
	
	protected boolean hasCobolCopybookURI() {
		if (uri == null) {
			return false;
		}
		return uri.toString().startsWith(
				CobolUniquePathConstructor.COBOL_COPYBOOK_PATHMAP);
	}
	
	
		
	@Override
	public void load(Map<?, ?> options) throws IOException {
    	URIConverter uriConverter = getURIConverter();
    	URI normalizedURI = uriConverter.normalize(uri);
    	//Logger.log("Loading the resource with the normalized URI: " + normalizedURI);
    	System.out.println("Loading the resource with the normalized URI: " + normalizedURI);
		if (normalizedURI.toString().startsWith(CobolUniquePathConstructor.COBOL_COPYBOOK_PATHMAP)) {
			System.out.println("[Gelato] Warning: " + uri.lastSegment() + " not registered in class path");
		} else if (normalizedURI.toString().startsWith(CobolUniquePathConstructor.COBOL_COMPILATION_UNIT_PATHMAP)) {
			//classes should have a physical resource
			System.out.println("[Gelato] Warning: " + uri.lastSegment() + " not registered in class path");
		} else {
			System.out.println("Loading uri: " + uri);
			super.load(options);
			System.out.println("Loaded");
		}
		register();
	}
	
	@Override
	protected EObject getEObject(List<String> uriFragmentPath) {
		System.out.println("Getting Eobject with URI Fragment Path: " + uriFragmentPath.toString());
		int size = uriFragmentPath.size();
		EObject eObject = getEObjectForURIFragmentRootSegment(size == 0 ? ""
				: uriFragmentPath.get(0));
		for (int i = 1; i < size && eObject != null; ++i) {
			String uriFragment = uriFragmentPath.get(i);
			if (eObject instanceof Copybook && uriFragment.startsWith(
					CobolUniquePathConstructor.COBOL_COPYBOOK_PATH_PREFIX)){

				return eObject;

			} else {
				 eObject = ((InternalEObject)eObject).eObjectForURIFragmentSegment(uriFragmentPath.get(i));
			}
		}

		return eObject;
	}
	
	protected void register() throws IOException {
		URI myURI = getURI();

		System.out.println("The URI with which the contents are being registered is: "+ myURI);
		if (!getContentsInternal().isEmpty()) {
			
			EObject root = getContentsInternal().get(0);
			
			//only for physical URIs
			if(hasCobolCopybookURI()) {
				//Logger.log("Registering URI which has a Copybook Proxy URI: "+ myURI);
				return;
			}
			
			if (root instanceof Copybook) {
				System.out.println("Registering copybook with URI: "+ myURI);
				Copybook cp = (Copybook) root;
				setCopybookName(cp);
				CobolPreprocessClasspath.get(this).registerCobolCopybookFile(cp, myURI);
			}
		}
	}
	
	protected void setCopybookName(Copybook cpy) {
		String cpyName = getURI().trimFileExtension().lastSegment();
		cpy.setName(cpyName);
		
	}

	
}
