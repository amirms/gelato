/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.impl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolLine;
import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolSourceFormat;
import org.servicifi.gelato.language.cobol.preprocess.layouts.LayoutsFactory;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.ICobolSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.util.CobolSourceFormatUtils;

public abstract class AbstractCobolSubPreprocessor implements ICobolSubPreprocessor {

	public CobolLine parseCobolLine(final String line, final CobolSourceFormat format) {
		final Pattern pattern = format.getPattern();
		final Matcher matcher = pattern.matcher(line);

		final CobolLine result;

		if (!matcher.matches()) {
			result = null;
		} else {
			final String sequenceAreaGroup = matcher.group(1);
			final String indicatorAreaGroup = matcher.group(2);
			final String contentAreaAGroup = matcher.group(3);
			final String contentAreaBGroup = matcher.group(4);
			final String commentAreaGroup = matcher.group(5);

			final String sequenceArea = sequenceAreaGroup != null ? sequenceAreaGroup : "";
			final char indicatorArea = indicatorAreaGroup != null ? indicatorAreaGroup.charAt(0) : ' ';
			final String contentAreaA = contentAreaAGroup != null ? contentAreaAGroup : "";
			final String contentAreaB = contentAreaBGroup != null ? contentAreaBGroup : "";
			final String commentArea = commentAreaGroup != null ? commentAreaGroup : "";

			result = LayoutsFactory.eINSTANCE.createCobolLine(sequenceArea, indicatorArea, contentAreaA, contentAreaB, commentArea, format);
		}

		return result;
	}

	public abstract String processLine(final String line, int lineNumber, final CobolSourceFormat format);

	@Override
	public String processLines(final String lines, final CobolSourceFormat format) {
		final Scanner scanner = new Scanner(lines);
		final StringBuffer outputBuffer = new StringBuffer();

		String currentLine = null;
		int lineNumber = 0;

		while (scanner.hasNextLine()) {
			currentLine = scanner.nextLine();

			final String processedLine = processLine(currentLine, lineNumber, format);
			outputBuffer.append(processedLine);

			lineNumber++;
		}

		scanner.close();

		final String result = outputBuffer.toString();
		return result;
	}

	protected void throwCobolLineParseException(final String line, final int lineNumber,
			final CobolSourceFormat format) {
		throw new RuntimeException(
				"Is " + format + " the correct line format? Could not parse line " + (lineNumber + 1) + ": " + line);
	}
}
