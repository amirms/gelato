package org.servicifi.gelato.language.cobol;

import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

/**
 * This provides functionality to construct unique identifier
 * (i.e., logical URI strings) for Cobol compilation units and 
 * copybooks represented as EMF-models.
 * 
 * May require 
 */
public class CobolUniquePathConstructor {

	/**
	 * Pathmap (URI scheme + first segment) for Cobol compilation units.
	 */
	public static final String COBOL_COMPILATION_UNIT_PATHMAP = "pathmap:/cobolcompilationunits/";

	/**
	 * Pathmap (URI scheme + first segment) for Cobol copybooks.
	 */
	public static final String COBOL_COPYBOOK_PATHMAP    = "pathmap:/cobolcopybooks/";

	/**
	 * Start of a URI fragment part pointing at a compilation unit contained in a
	 * compilation group.
	 */
	public static final String COMPILATION_UNITS_ROOT_PATH_PREFIX = "@compilationunit[name='";

	/**
	 * Start of a URI fragment part pointing at a compilation unit contained 
	 * as member in another classifier.
	 */
	public static final String COMPILATION_UNITS_SUB_PATH_PREFIX  = "@members[name='";

	/**
	 * End of a URI fragment part.
	 */
	public static final String COBOL_PATH_SUFFIX  = "']";
	
	/**
	 * Start of a URI fragment part pointing at a copybook
	 */
	public static final String COBOL_COPYBOOK_PATH_PREFIX = "@copybook[name='";

	/**
	 * Cobol's separator for a compilation group (.).
	 */
	public static final String COMPILATION_GROUP_SEPARATOR = ".";
	
	/**
	 * Cobol's separator for compilation unit names in a compilation group ($).
	 */
	public static final String COMPILATION_UNIT_SEPARATOR = "$";

	
	/**
	 * Cobol's file extension (.cob | .cbl).
	 * TODO Check if this actually works
	 */
	public static final String COBOL_FILE_EXTENSION = ".cob";

	/**
	 * Cobol's copybook file extension (.cpy).
	 */
	public static final String COBOL_COPYBOOK_FILE_EXTENSION = ".cpy";
	
	/**
	 * We cache this regular expression because it is used very frequently.
	 */
	private static final Pattern COMPILATION_UNIT_SEPARATOR_REGEX_PATTERN = Pattern.compile("\\" + COMPILATION_UNIT_SEPARATOR);

	/**
	 * Constructs an URI from a fully qualified compilation unit name
	 * pointing at the resource containing the compilation unit.
	 *
	 * @param fullQualifiedName
	 * @return the logical URI for the compilation unit
	 */
	public static URI getCobolFileResourceURI(String fullQualifiedName) {
		StringBuilder logicalUriString = new StringBuilder(COBOL_COMPILATION_UNIT_PATHMAP);
		logicalUriString.append(fullQualifiedName);
		logicalUriString.append(COBOL_FILE_EXTENSION);

		return URI.createURI(logicalUriString.toString());
	}
	
	
	/**
	 * Constructs an URI from a fully qualified compilation unit name
	 * pointing at the file containing the compilation unit and the
	 * compilation unit itself inside the EMF-model constructed 
	 * from that resource.
	 *
	 * @param fullQualifiedName
	 * @return the logical URI for the classifier
	 */
	public static URI getCobolCompilationUnitURI(String fullQualifiedName) {
		
		URI logicalUri = getCobolCopybookFileResourceURI(fullQualifiedName);
		
		String cusPart = fullQualifiedName;
		int idx = fullQualifiedName.lastIndexOf(COMPILATION_GROUP_SEPARATOR);
		if (idx >= 0) {
			cusPart = cusPart.substring(idx + 1);
		}
		
		String[] cuNames = COMPILATION_UNIT_SEPARATOR_REGEX_PATTERN.split(cusPart, -1);

		StringBuilder uriFragment = new StringBuilder();
		for(int i = 0; i < cuNames.length; i++) {
			if (i == 0) {
				uriFragment.append("//");
				uriFragment.append(COMPILATION_UNITS_ROOT_PATH_PREFIX);
			}
			else {
				uriFragment.append("/");
				uriFragment.append(COMPILATION_UNITS_SUB_PATH_PREFIX);
			}
			uriFragment.append(cuNames[i]);
			uriFragment.append(COBOL_PATH_SUFFIX);
		}
		logicalUri = logicalUri.appendFragment(uriFragment.toString());
		return logicalUri;
	}

	

	/**
	 * Returns a simple compilation unit name (i.e., last segment) for 
	 * a given fully qualified name
	 *
	 * @param fullQualifiedName
	 * @return simple name string
	 */
	public static String getSimpleCompilationUnitName(String fullQualifiedName) {
		int idx1 = fullQualifiedName.lastIndexOf(COMPILATION_GROUP_SEPARATOR);
		int idx2 = fullQualifiedName.lastIndexOf(COMPILATION_UNIT_SEPARATOR);
		if (idx1 == -1 && idx2 == -1) {
			return fullQualifiedName;
		}
		if (idx1 > idx2) {
			return fullQualifiedName.substring(idx1 + 1);
		}
		else {
			return fullQualifiedName.substring(idx2 + 1);
		}
	}
	
	
	/**
	 * Constructs an URI for a copybook inside the EMF-model 
	 * constructed  from that resource.
	 *
	 * @param fullName
	 * @return the logical URI for the classifier
	 */
	public static URI getCobolCopybookFileResourceURI(String fullName) {
		StringBuilder logicalUriString = new StringBuilder(COBOL_COPYBOOK_PATHMAP);
		logicalUriString.append(fullName);
		logicalUriString.append(COBOL_COPYBOOK_FILE_EXTENSION);		
		return URI.createURI(logicalUriString.toString());
	}
	
	/**
	 * Constructs an URI from a fully qualified copybook name
	 * pointing at the file containing the copybook and the
	 * copybook itself inside the EMF-model constructed from 
	 * that resource.
	 *
	 * @param fullQualifiedName
	 * @return the logical URI for the classifier
	 */
	
	public static URI getCobolCopybookResourceURI(String fullQualifiedName) {
		
		URI logicalUri = getCobolCopybookFileResourceURI(fullQualifiedName);
		/*
		StringBuilder uriFragment = new StringBuilder();
		
		uriFragment.append("//");
		uriFragment.append(COBOL_COPYBOOK_PATH_PREFIX);
		uriFragment.append(fullQualifiedName);
		uriFragment.append(COBOL_PATH_SUFFIX);
		
		logicalUri = logicalUri.appendFragment(uriFragment.toString());
		*/
		return logicalUri;
	}
	

}
