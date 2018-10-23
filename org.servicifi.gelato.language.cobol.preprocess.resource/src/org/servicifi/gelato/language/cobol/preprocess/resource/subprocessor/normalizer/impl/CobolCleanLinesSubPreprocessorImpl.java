/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.impl;

import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolSourceFormat;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.impl.AbstractCobolSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.ICobolCleanLinesSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.util.CobolPreprocessorUtil;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.util.CobolSourceFormatUtils;

public class CobolCleanLinesSubPreprocessorImpl extends AbstractCobolSubPreprocessor
		implements ICobolCleanLinesSubPreprocessor {

	@Override
	public String processLine(final String line, final int lineNumber, final CobolSourceFormat format) {
		// clean line from certain ASCII chars
		final int substituteChar = 0x1A;
		final String cleanedLine = line.replace((char) substituteChar, ' ');
		final boolean isLineEmpty = cleanedLine.trim().isEmpty();
		final String result;

		if (isLineEmpty) {
			result = CobolSourceFormatUtils.getBlankLine(format) + CobolPreprocessorUtil.NEW_LINE;
		} else {
			result = cleanedLine + CobolPreprocessorUtil.NEW_LINE;
		}

		return result;
	}
}
