/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer;

import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolSourceFormat;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.ICobolSubPreprocessor;

/**
 * Preprocessor, which identifies and marks comment entries depending on the
 * COBOL dialect.
 */
public interface ICobolMarkCommentEntriesSubPreprocessor extends ICobolSubPreprocessor {

	String processLine(String line, int lineNumber, CobolSourceFormat format);
}
