package org.servicifi.gelato.transformation.core.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileFinder {

	public List<File> findAllFilesInFolder(
			File file,
			String[] fileExtensionsToInclude,
			String[] fileExtensionsToExclude) {
		
		List<File> foundFiles = new ArrayList<File>();
		if (!file.exists()) {
			throw new RuntimeException("Folder " + file + " does not exist.");
		}
		// file
		if (file.isFile()) {
			if (!matches(file, fileExtensionsToExclude) &&
				matches(file, fileExtensionsToInclude)) {
				foundFiles.add(file);
			}
		}
		// directory
		else {
			for (File member : file.listFiles()) {
				if (member.getName().startsWith(".")) {
					continue;
				}
				foundFiles.addAll(findAllFilesInFolder(member, fileExtensionsToInclude, fileExtensionsToExclude));
			}
		}
		
		return foundFiles;
	}

	private boolean matches(File file, String[] fileExtensions) {
		for (String fileExtension : fileExtensions) {
			if (file.getName().endsWith(fileExtension)) {
				return true;
			}
		}
		return false;
	}
}