package org.servicifi.language.cobol.resource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.servicifi.gelato.language.cobol.CobolClasspath;
import org.servicifi.gelato.language.cobol.resource.cobol.ICobolProblem;

public class CobolInitializer implements CobolClasspath.Initializer {
	protected static final String COBOL_SOURCE_FILES_FOLDER = "cobol";
	
	public void initialize(Resource resource) {
		initializeResourceSet(resource.getResourceSet(), resource.getURI());
		
		
		//IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
		//org.eclipse.core.resources.IProject project = workspace.getRoot().getProject(projectName);
	}
	
	private void initializeResourceSet(ResourceSet resourceSet, URI resourceURI) {
		if (resourceSet == null) {
			return;
		}
		if (resourceURI == null) {
			return;
		}
		URIConverter uriConverter = resourceSet.getURIConverter();
		if (uriConverter == null) {
			return;
		}
		URI normalizedURI = uriConverter.normalize(resourceURI);
		if (!normalizedURI.isPlatformResource()) {
			return;
		}
		
		IProject project = getProject(normalizedURI);
		
		IFolder sourceFilesfolder = project.getFolder(COBOL_SOURCE_FILES_FOLDER);
		
		CobolClasspath cobolClasspath = CobolClasspath.get();
		
		if (sourceFilesfolder.exists())	
		{
			System.out.println("Library Folder exists!");
			//registerCopybookFolder(cobolClasspath, libraryfolder);
			
		}
	}
	
	private void registerCopybookFolder(CobolClasspath cobolClasspath, IFolder libraryFolder){
		try{
			IResource[] members = libraryFolder.members();

			for (IResource member : members)
				if (member instanceof IFile)
					registerCopybook(cobolClasspath, (IFile)member);
			//cobolClasspath.registerCobolCopybookFolder(URI.createURI(libraryfolder.getLocationURI()));
			
			//cobolClasspath.registerCobolCopybookFolder(libURI);
			}catch(Exception e){
				//do nothing
			}
	}
	
	private IProject getProject(URI uri) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		if (uri.isPlatformResource() && uri.segmentCount() > 2) {
			return root.getProject(uri.segment(1));
		}
		throw new IllegalArgumentException("Can't handle URIs that do not reference platform resources.");
	}
	
	private void registerCopybook(CobolClasspath cobolClasspath, IFile file) {
		String filePath = file.getFullPath().toString();
		
		URI uri;
		if (isInWorkspace(filePath)) {
			uri = URI.createPlatformResourceURI(filePath, true);
					
		} else {
			uri = URI.createFileURI(filePath);
		}
		
		String fileName = file.getName();
		
		String cpyName = fileName.substring(0, fileName.lastIndexOf('.'));
		
		//cobolClasspath.registerCobolCopybook(cpyName, uri);
	}


		
	private boolean isInWorkspace(String path) {
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		return wsRoot.findMember(path) != null;
	}

	@Override
	public boolean requiresLocalClasspath() {
		// TODO Auto-generated method stub
		return true;
	}
}