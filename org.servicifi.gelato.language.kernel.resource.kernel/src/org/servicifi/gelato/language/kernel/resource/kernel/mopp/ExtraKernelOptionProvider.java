package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import java.util.HashMap;
import java.util.Map;

import org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptionProvider;
import org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptions;
import org.servicifi.gelato.language.kernel.resource.kernel.KernelResourcePostProcessorProvider;

public class ExtraKernelOptionProvider implements IKernelOptionProvider {

	public Map<?, ?> getOptions() {
		// create a map with static option providers here
		Map<String, KernelResourcePostProcessorProvider> extraOptions = new HashMap<>();

		extraOptions.put(IKernelOptions.RESOURCE_POSTPROCESSOR_PROVIDER, new KernelResourcePostProcessorProvider());

		return extraOptions;
	}
}