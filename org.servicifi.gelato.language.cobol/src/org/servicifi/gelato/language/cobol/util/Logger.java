package org.servicifi.gelato.language.cobol.util;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

public class Logger {

	public static final String COBOL_RESOURCE_PLUGIN = "org.servicifi.language.cobol";
	
	public static void log(String msg) {
		ILog log = Platform.getLog(Platform.getBundle(COBOL_RESOURCE_PLUGIN));
		IStatus status = new Status(IStatus.OK, COBOL_RESOURCE_PLUGIN, msg);
		log.log(status);
	}
	
}
