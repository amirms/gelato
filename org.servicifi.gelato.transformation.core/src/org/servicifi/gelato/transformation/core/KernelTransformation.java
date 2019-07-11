package org.servicifi.gelato.transformation.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import org.servicifi.gelato.language.cobol.CobolClasspath;
import org.servicifi.gelato.transformation.core.statistics.StatisticsCollector;
import org.servicifi.gelato.transformation.core.transformation.QVTOTransformationWrapper;

public class KernelTransformation {

	private static final String COBOL2KERNEL_QVTO = "c2k.qvto";
	
	private static final String CURRENT_DIR = new File(System.getProperty("user.dir"))
			.getAbsolutePath();
	private static final String INPUT_SRC_PATH = CURRENT_DIR + File.separator + "input" + File.separator + "src";
	
	private static final String INPUT_LIB_PATH = CURRENT_DIR + File.separator + "input" + File.separator + "lib";
	
	private static final String INPUT_BCH_PATH = CURRENT_DIR + File.separator + "input" + File.separator + "bch";
	
	private static final String OUTPUT_PATH = CURRENT_DIR + File.separator
			+ "output_qvto";
	private static final String QVT_SCRIPT_PATH = CURRENT_DIR + File.separator
			+ "transforms" + File.separator;

	// initializes the static collector of transformation statistics
	// as transformations are executed statically during test case
	// initialization
	// this controller needs to be static to.
	private StatisticsCollector collector;
	
	
	/**
	 * Applies a QVTO transformation to all source files in a given input 
	 * directory by merging them into a single gile.
	 * 
	 * @param framework
	 *            a directory inside the input directory
	 * @throws Exception if transformation fails
	 */
	public void run(String qvtScript, String inputDir, String framework, StatisticsCollector collector)
			throws Exception{
		
		this.collector = collector;
		
		// configure QVTO starter
		String inputFolderPath = inputDir + File.separator + framework;
		File inputFolder = new File(inputFolderPath);
		if (!inputFolder.exists()) {
			throw new RuntimeException("Path " + inputFolderPath
					+ " does not exist!");
		}
		URI inputURI = URI.createFileURI(inputFolder.getAbsoluteFile()
				.getCanonicalPath());

		String outputFolderPath = OUTPUT_PATH + File.separator + framework;
		File outputFolder = new File(outputFolderPath);
		outputFolder.mkdirs();
		URI outputURI = URI.createFileURI(outputFolder.getAbsolutePath());

		File qvtoFile = new File(QVT_SCRIPT_PATH + qvtScript);
		URI transformationFileURI = URI.createFileURI(qvtoFile
				.getCanonicalPath());

		boolean isInPlace = false;
		boolean debug = true;
		
		
		QVTOTransformationWrapper starter = new QVTOTransformationWrapper(
				inputURI, outputURI, transformationFileURI,
				isInPlace, debug, collector);
		
		//FIXME registerLibraries(inputFolderPath, starter);
		
		
	}
	
	/**
	 * Applies a QVTO transformation to a single file in a given input 
	 * directory.
	 * 
	 * @param framework
	 *            a directory inside the input directory
	 * @throws Exception if transformation fails
	 */
	public void run(String qvtScript, String inputDir, String framework,
			List<File> inputFiles, StatisticsCollector collector) throws Exception {
		this.collector = collector;
		
		// configure QVTO starter
		String inputFolderPath = inputDir + File.separator + framework;
		File inputFolder = new File(inputFolderPath);
		if (!inputFolder.exists()) {
			throw new RuntimeException("Path " + inputFolderPath
					+ " does not exist!");
		}
		URI inputURI = URI.createFileURI(inputFolder.getAbsoluteFile()
				.getCanonicalPath());

		String outputFolderPath = OUTPUT_PATH + File.separator + framework;
		File outputFolder = new File(outputFolderPath);
		outputFolder.mkdirs();
		URI outputURI = URI.createFileURI(outputFolder.getAbsolutePath());

		File qvtoFile = new File(QVT_SCRIPT_PATH + qvtScript);
		URI transformationFileURI = URI.createFileURI(qvtoFile
				.getCanonicalPath());

		boolean isInPlace = false;
		boolean debug = true;
		boolean allFiles = false;
		
		QVTOTransformationWrapper starter = new QVTOTransformationWrapper(
				inputURI, outputURI, transformationFileURI,
				isInPlace, debug, collector);

		//FIXME registerLibraries(inputFolderPath, starter);
		// TODO start timer
		System.out.println(CURRENT_DIR);
		
		
		if (allFiles)	
			starter.launch(inputFiles.get(0));
		else
			starter.launch(inputFiles);
	}
	
	
	private void registerLibraries(String inputFolderPath,
			QVTOTransformationWrapper starter) throws IOException {
//		CobolClasspath cobolClasspath = CobolClasspath.get(starter
//				.getResourceSet());
		CobolClasspath cobolClasspath = CobolClasspath.get();
		String libFolderPath = inputFolderPath + File.separator + "lib";
		File libFolder = new File(libFolderPath);
		if (!libFolder.exists()) {
			return;
		}
		for (File nextLib : libFolder.listFiles()) {
			// skip directories inside of lib directory
			if (nextLib.isDirectory()) {
				continue;
			}
			//register cobol copybooks
			if (nextLib.getName().endsWith(".cpy")) {
				URI libURI = URI.createFileURI(nextLib.getAbsolutePath());
				//CobolClasspath. (libURI);
			}
		}
	}
	
}
