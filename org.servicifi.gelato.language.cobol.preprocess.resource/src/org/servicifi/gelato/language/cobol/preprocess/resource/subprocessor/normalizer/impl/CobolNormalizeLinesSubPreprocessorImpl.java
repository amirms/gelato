/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.impl;

import org.apache.commons.lang.StringUtils;
import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolLine;
import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolSourceFormat;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.impl.AbstractCobolSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.ICobolNormalizeLinesSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.util.CobolPreprocessorUtil;

public class CobolNormalizeLinesSubPreprocessorImpl extends AbstractCobolSubPreprocessor
		implements ICobolNormalizeLinesSubPreprocessor {

	protected String handleTrailingComma(final String contentArea) {
		final String result;

		/*
		 * repair trimmed whitespace after comma separator
		 */
		if (contentArea.isEmpty()) {
			result = contentArea;
		} else {
			final char lastCharAtTrimmedLineArea = contentArea.charAt(contentArea.length() - 1);

			if (lastCharAtTrimmedLineArea == ',' || lastCharAtTrimmedLineArea == ';') {
				result = contentArea + CobolPreprocessorUtil.WS;
			} else {
				result = contentArea;
			}
		}

		return result;
	}

	/**
	 * Normalizes the sequence and indicator area to NEWLINE and whitespace.
	 */
	protected String normalizeLineBreakAndSequenceArea(final CobolLine line, final boolean isFirstLine) {
		// newline
		final String newLine = isFirstLine ? "" : Character.toString(CobolPreprocessorUtil.NEW_LINE);
		
		// sequence area
//		final String sequenceAreaPlaceholder = StringUtils.leftPad("", line.getSequenceArea().length());

		final String sequenceAreaPlaceholder = "000000";
		
		final String result = newLine + sequenceAreaPlaceholder;
		return result;
	}

	/**
	 * Normalizes a line by stripping the sequence number and line indicator,
	 * and interpreting the line indicator.
	 */
	protected String processLine(final CobolLine line, final boolean isFirstLine) {
		final String result;

		// determine line prefix
		final String linePrefix = normalizeLineBreakAndSequenceArea(line, isFirstLine);

		// join content areas A and B
		final String joinedContentArea = line.getContentAreaA() + line.getContentAreaB();

		// trim trailing whitespace
		final String trimmedTrailWsContentArea = joinedContentArea.replaceAll("\\s+$", "");

		// handle trailing comma
		final String handledContentArea = handleTrailingComma(trimmedTrailWsContentArea);

		/*
		 * switch on line indicator
		 */
		switch (line.getIndicatorArea()) {
		// debugging line
		case CobolPreprocessorUtil.CHAR_D:
		case CobolPreprocessorUtil.CHAR_D_:
			result = linePrefix + CobolPreprocessorUtil.WS + handledContentArea;
			break;
		// continuation line
		case CobolPreprocessorUtil.CHAR_MINUS:
			final String trimmedContentArea = handledContentArea.trim();
			final char firstCharOfContentArea = trimmedContentArea.charAt(0);

			switch (firstCharOfContentArea) {
			case '\"':
			case '\'':
				result = trimmedContentArea.substring(1);
				break;
			default:
				result = trimmedContentArea;
				break;
			}
			break;
		// comment line
		case CobolPreprocessorUtil.CHAR_ASTERISK:
		case CobolPreprocessorUtil.CHAR_SLASH:
			result = linePrefix + CobolPreprocessorUtil.COMMENT_TAG + CobolPreprocessorUtil.WS + handledContentArea;
			break;
		// comment entry
		case CobolPreprocessorUtil.CHAR_SHARP:
			result = linePrefix + CobolPreprocessorUtil.COMMENT_ENTRY_TAG + CobolPreprocessorUtil.WS + handledContentArea;
			break;
		case ' ':
		default:
			result = linePrefix + CobolPreprocessorUtil.WS + handledContentArea;
			break;
		}

		return result;
	}

	@Override
	public String processLine(final String line, final int lineNumber, final CobolSourceFormat format) {
		final CobolLine parsedLine = parseCobolLine(line, format);

		if (parsedLine == null) {
			throwCobolLineParseException(line, lineNumber, format);
		}

		final boolean isFirstLine = lineNumber == 0;
		final String result = processLine(parsedLine, isFirstLine);
		return result;
	}

}
