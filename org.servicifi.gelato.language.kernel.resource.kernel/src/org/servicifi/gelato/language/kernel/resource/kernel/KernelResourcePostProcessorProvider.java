package org.servicifi.gelato.language.kernel.resource.kernel;

public class KernelResourcePostProcessorProvider implements IKernelResourcePostProcessorProvider {

	@Override
	public IKernelResourcePostProcessor getResourcePostProcessor() {
		return new ExtraKernelResourcePostProcessor();
	}
}