/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolLine;
import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolSourceFormat;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.impl.AbstractCobolSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.ICobolMarkCommentEntriesSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.util.CobolPreprocessorUtil;

public class CobolMarkCommentEntriesSubPreprocessorImpl extends AbstractCobolSubPreprocessor
		implements ICobolMarkCommentEntriesSubPreprocessor {

	protected final Pattern commentEntryTriggerLinePattern;

	protected boolean foundCommentEntryTriggerInPreviousLine = false;

	protected boolean isInCommentEntry = false;

	protected final String[] triggersEnd = new String[] { "PROGRAM-ID.", "AUTHOR.", "INSTALLATION.", "DATE-WRITTEN.",
			"DATE-COMPILED.", "SECURITY.", "ENVIRONMENT", "DATA.", "PROCEDURE." };

	protected final String[] triggersStart = new String[] { "AUTHOR.", "INSTALLATION.", "DATE-WRITTEN.",
			"DATE-COMPILED.", "SECURITY.", "REMARKS." };

	public CobolMarkCommentEntriesSubPreprocessorImpl() {
		final String commentEntryTriggerLineFormat = new String("(" + String.join("|", triggersStart) + ")(.+)");
		commentEntryTriggerLinePattern = Pattern.compile(commentEntryTriggerLineFormat, Pattern.CASE_INSENSITIVE);
	}

	/**
	 * Blanks in a given line a potential comment entry.
	 */
	protected String blankCommentEntry(final String line, final CobolLine parsedLine) {
		final String result;

		final Matcher matcher = commentEntryTriggerLinePattern
				.matcher(parsedLine.getContentAreaA() + parsedLine.getContentAreaB());

		if (matcher.matches()) {
			final String trigger = matcher.group(1);
			final String commentEntry = matcher.group(2);
			final String newContentArea = trigger + StringUtils.repeat(Character.toString(CobolPreprocessorUtil.WS), commentEntry.length());

			result = parsedLine.getSequenceArea() + parsedLine.getIndicatorArea() + newContentArea
					+ parsedLine.getComment() + CobolPreprocessorUtil.NEW_LINE;
		} else {
			result = buildRegularLine(line);
		}

		return result;
	}

	protected String buildMultiLineCommentEntryLine(final CobolLine parsedLine) {
		return parsedLine.getSequenceArea() + CobolPreprocessorUtil.CHAR_SHARP + parsedLine.getContentAreaA()
				+ parsedLine.getContentAreaB() + parsedLine.getComment() + CobolPreprocessorUtil.NEW_LINE;
	}

	protected String buildRegularLine(final String line) {
		return line + CobolPreprocessorUtil.NEW_LINE;
	}

	/**
	 * Escapes in a given line a potential comment entry.
	 */
	protected String escapeCommentEntry(final String line, final CobolLine parsedLine) {
		final String result;

		final Matcher matcher = commentEntryTriggerLinePattern
				.matcher(parsedLine.getContentAreaA() + parsedLine.getContentAreaB());

		if (matcher.matches()) {
			final String trigger = matcher.group(1);
			final String commentEntry = matcher.group(2);
			final String newContentArea = trigger + CobolPreprocessorUtil.WS + CobolPreprocessorUtil.COMMENT_ENTRY_TAG
					+ commentEntry;

			result = parsedLine.getSequenceArea() + parsedLine.getIndicatorArea() + newContentArea
					+ parsedLine.getComment() + CobolPreprocessorUtil.NEW_LINE;
		} else {
			result = buildRegularLine(line);
		}

		return result;
	}

	protected boolean isInCommentEntry(final CobolLine parsedLine, final boolean isContentAreaAEmpty,
			final boolean isInOsvsCommentEntry) {
		final boolean result = parsedLine.getIndicatorArea() == CobolPreprocessorUtil.CHAR_ASTERISK
				|| parsedLine.getIndicatorArea() == CobolPreprocessorUtil.CHAR_SLASH || isContentAreaAEmpty
				|| isInOsvsCommentEntry;
		return result;
	}

	/**
	 * OSVS: The comment-entry can be contained in either area A or area B of
	 * the comment-entry lines. However, the next occurrence in area A of any
	 * one of the following COBOL words or phrases terminates the comment-entry
	 * and begin the next paragraph or division.
	 */
	protected boolean isInOsvsCommentEntry(final CobolLine parsedLine) {
		final boolean result = !startsWithTrigger(parsedLine, triggersEnd);
		return result;
	}

	@Override
	public String processLine(final String line, final int lineNumber, final CobolSourceFormat format) {
		final String result;

		if (format.isCommentEntryMultiLine()) {
			result = processMultiLineCommentEntry(line, lineNumber, format);
		} else {
			result = processSingleLineCommentEntry(line, lineNumber, format);
		}

		return result;
	}

	/**
	 * If the Compiler directive SOURCEFORMAT is specified as or defaulted to
	 * FIXED, the comment-entry can be contained on one or more lines but is
	 * restricted to area B of those lines; the next line commencing in area A
	 * begins the next non-comment entry.
	 */
	protected String processMultiLineCommentEntry(final String line, final int lineNumber,
			final CobolSourceFormat format) {
		final CobolLine parsedLine = parseCobolLine(line, format);

		if (parsedLine == null) {
			throwCobolLineParseException(line, lineNumber, format);
		}

		final boolean foundCommentEntryTriggerInCurrentLine = startsWithTrigger(parsedLine, triggersStart);
		final String result;

		if (foundCommentEntryTriggerInCurrentLine) {
			result = blankCommentEntry(line, parsedLine);
		} else if (foundCommentEntryTriggerInPreviousLine || isInCommentEntry) {
			final boolean isContentAreaAEmpty = parsedLine.getContentAreaA().trim().isEmpty();
			final boolean isInOsvsCommentEntry = isInOsvsCommentEntry(parsedLine);

			isInCommentEntry = isInCommentEntry(parsedLine, isContentAreaAEmpty, isInOsvsCommentEntry);

			if (isInCommentEntry) {
				result = buildMultiLineCommentEntryLine(parsedLine);
			} else {
				result = buildRegularLine(line);
			}
		} else {
			result = buildRegularLine(line);
		}

		foundCommentEntryTriggerInPreviousLine = foundCommentEntryTriggerInCurrentLine;

		return result;
	}

	protected String processSingleLineCommentEntry(final String line, final int lineNumber,
			final CobolSourceFormat format) {
		final CobolLine parsedLine = parseCobolLine(line, format);

		if (parsedLine == null) {
			throwCobolLineParseException(line, lineNumber, format);
		}

		final boolean foundCommentEntryTriggerInCurrentLine = startsWithTrigger(parsedLine, triggersStart);
		final String result;

		if (foundCommentEntryTriggerInCurrentLine) {
			result = escapeCommentEntry(line, parsedLine);
		} else {
			result = buildRegularLine(line);
		}

		return result;
	}

	/**
	 * Checks, whether given line starts with a trigger keyword indicating a
	 * comment entry.
	 */
	protected boolean startsWithTrigger(final CobolLine parsedLine, final String[] triggers) {
		final String contentAreaUpperCase = new String(parsedLine.getContentAreaA() + parsedLine.getContentAreaB())
				.toUpperCase();

		boolean result = false;

		for (final String trigger : triggers) {
			final boolean containsTrigger = contentAreaUpperCase.startsWith(trigger);

			if (containsTrigger) {
				result = true;
				break;
			}
		}

		return result;
	}
}
