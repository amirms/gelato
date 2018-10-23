package org.servicifi.gelato.language.cobol.preprocess.resource;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.eclipse.emf.common.util.URI;

import org.apache.commons.io.IOUtils;
import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolLine;
import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolSourceFormat;
import org.servicifi.gelato.language.cobol.preprocess.layouts.LayoutsFactory;
import org.servicifi.gelato.language.cobol.preprocess.layouts.impl.ANSI85CobolSourceFormatImpl;
import org.servicifi.gelato.language.cobol.preprocess.layouts.impl.CobolLineImpl;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.ICobolCleanLinesSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.ICobolMarkCommentEntriesSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.ICobolNormalizeLinesSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.impl.CobolCleanLinesSubPreprocessorImpl;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.impl.CobolMarkCommentEntriesSubPreprocessorImpl;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.impl.CobolNormalizeLinesSubPreprocessorImpl;

public class CobolSubPreprocessorRunner {

	public static void main(String[] args) {

		try {
			String fileName = "C:/src/git/gelato/org.servicifi.gelato.language.cobol.preprocessor/COBOL/RT00000";
			File file = new File(fileName);
			InputStream inputStream = new DataInputStream(new FileInputStream(file));

			String result = new CobolSubPreprocessorRunner().subpreprocess(inputStream);

			String fileName2 = "C:/src/git/gelato/org.servicifi.gelato.language.cobol.preprocessor/COBOL/RT00000.prs";
			System.out.println(result);

			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(fileName2), "utf-8"))) {
				writer.write(result);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private String subpreprocess(InputStream inputStream) throws IOException {

		final ICobolCleanLinesSubPreprocessor cleanLinesPreprocessor = new CobolCleanLinesSubPreprocessorImpl();
		final ICobolMarkCommentEntriesSubPreprocessor markCommentEntriesPreprocessor = new CobolMarkCommentEntriesSubPreprocessorImpl();
		final ICobolNormalizeLinesSubPreprocessor normalizeLinesPreprocessor = new CobolNormalizeLinesSubPreprocessorImpl();

		String lines = IOUtils.toString(inputStream, "UTF-8");

		CobolSourceFormat format = new ANSI85CobolSourceFormatImpl();

		final String cleanedCode = cleanLinesPreprocessor.processLines(lines, format);
		final String markedCode = markCommentEntriesPreprocessor.processLines(cleanedCode, format);
		final String result = normalizeLinesPreprocessor.processLines(markedCode, format);
		return result;
	}
}
