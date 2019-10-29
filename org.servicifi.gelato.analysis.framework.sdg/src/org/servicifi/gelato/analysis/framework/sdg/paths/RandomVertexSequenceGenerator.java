package org.servicifi.gelato.analysis.framework.sdg.paths;

import java.util.List;
import java.util.Set;

import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.SDG;

public class RandomVertexSequenceGenerator {
	public static Set<List<Node>> generateRandomly(SDG sdg, double samplePercent, VertexSequenceType seqType) {
		RandomGenerator generator = seqType == VertexSequenceType.PATH ? new RandomValidPathGenerator()
				: new RandomValidWalkGenerator();

		return generator.generateRandomly(sdg, samplePercent);
	}

	public static Set<List<Node>> generateForUseDefNodes(SDG sdg, double samplePercent, VertexSequenceType seqType) {
		RandomGenerator generator = seqType == VertexSequenceType.PATH ? new RandomValidPathGenerator()
				: new RandomValidWalkGenerator();

		return generator.generateForUseDefNodes(sdg, samplePercent);
	}
}
