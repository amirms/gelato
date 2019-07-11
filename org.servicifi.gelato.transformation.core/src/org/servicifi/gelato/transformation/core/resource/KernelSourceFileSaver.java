package org.servicifi.gelato.transformation.core.resource;

import java.io.File;
import java.io.IOException;

import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource;
import org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil;

public class KernelSourceFileSaver {

	public void save(String filename, CompilationUnit program) {
		File file = new File(filename);
		KernelResource kernelRes = new KernelResource();

		kernelRes.getContents().add(program);

		try {
			KernelResourceUtil.saveResource(file, kernelRes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
