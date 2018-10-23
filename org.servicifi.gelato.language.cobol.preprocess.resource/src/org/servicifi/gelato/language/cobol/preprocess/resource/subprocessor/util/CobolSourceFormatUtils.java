package org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.util;

import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolSourceFormat;

import com.google.common.base.Strings;



public class CobolSourceFormatUtils {
	public static String getBlankComments() {
		return Strings.repeat(CobolPreprocessorUtil.WS, 8);
	}

	public static String getBlankContentArea() {
		return Strings.repeat(CobolPreprocessorUtil.WS, 65);
	}

	public static String getBlankIndicatorArea() {
		return CobolPreprocessorUtil.WS;
	}

	public static String getBlankLine(final CobolSourceFormat format) {
		final String result;

		if (format == null) {
			result = null;
			// XXX
//		} else if (CobolSourceFormatEnum.TANDEM.equals(format)) {
//			result = getBlankSequenceAndIndicatorArea(format);
//		} else if (CobolSourceFormatEnum.VARIABLE.equals(format)) {
//			result = getBlankSequenceAndIndicatorArea(format);
		} else {
			result = getBlankSequenceAndIndicatorArea(format) + getBlankContentArea() + getBlankComments();
		}

		return result;
	}

	public static String getBlankSequenceAndIndicatorArea(final CobolSourceFormat format) {
		final String result;

		if (format == null) {
			result = null;
		} else {
			result = getBlankSequenceArea(format) + getBlankIndicatorArea();
		}

		return result;
	}

	public static String getBlankSequenceArea(final CobolSourceFormat format) {
		final String result;

		if (format == null) {
			result = null;
//		} else if (CobolSourceFormatEnum.TANDEM.equals(format)) {
//			result = "";
		} else {
			result = Strings.repeat(CobolPreprocessorUtil.WS, 6);
		}

		return result;
	}
}
