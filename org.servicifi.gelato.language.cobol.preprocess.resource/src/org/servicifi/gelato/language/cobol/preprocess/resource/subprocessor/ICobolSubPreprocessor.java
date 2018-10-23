/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor;

import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolSourceFormat;

public interface ICobolSubPreprocessor {

	String processLines(String lines, CobolSourceFormat format);
}
