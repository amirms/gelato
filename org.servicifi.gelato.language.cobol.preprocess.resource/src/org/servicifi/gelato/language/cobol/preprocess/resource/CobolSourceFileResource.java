package org.servicifi.gelato.language.cobol.preprocess.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.servicifi.gelato.language.cobol.preprocess.CobolPreprocessClasspath;
import org.servicifi.gelato.language.cobol.preprocess.CobolUniquePathConstructor;
import org.servicifi.gelato.language.cobol.preprocess.containers.Copybook;
import org.servicifi.gelato.language.cobol.preprocess.containers.PreprocessingGroup;
import org.servicifi.gelato.language.cobol.preprocess.layouts.CobolSourceFormat;
import org.servicifi.gelato.language.cobol.preprocess.layouts.LayoutsFactory;
import org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessReferenceResolverSwitch;
import org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTextPrinter;
import org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessResource;
import org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.util.PreprocessLayoutUtil;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.ICobolCleanLinesSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.ICobolMarkCommentEntriesSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.ICobolNormalizeLinesSubPreprocessor;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.impl.CobolCleanLinesSubPreprocessorImpl;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.impl.CobolMarkCommentEntriesSubPreprocessorImpl;
import org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.normalizer.impl.CobolNormalizeLinesSubPreprocessorImpl;


public class CobolSourceFileResource extends PreprocessResource {

	private PreprocessLayoutUtil layoutUtil = new PreprocessLayoutUtil();

	public CobolSourceFileResource(URI uri) {

		super(uri);
	}

	protected boolean isCopybook() {
		if (getContentsInternal().isEmpty()) {
			return false;
		}
		return getContentsInternal().get(0) instanceof Copybook;
	}

	protected boolean isCobolSourceFile() {
		if (getContentsInternal().isEmpty()) {
			return false;
		}
		return getContentsInternal().get(0) instanceof PreprocessingGroup;
	}

	protected boolean hasCobolCopybookURI() {
		if (uri == null) {
			return false;
		}
		return uri.toString().startsWith(CobolUniquePathConstructor.COBOL_COPYBOOK_PATHMAP);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {

		Map<Object, Object> optionsWithUnicodeConverter = new LinkedHashMap<Object, Object>();
		if (options != null) {
			optionsWithUnicodeConverter.putAll(options);
		}
		// if
		// (!optionsWithUnicodeConverter.containsKey(Option.INPUT_STREAM_PREPROCESSOR_PROVIDER))
		// {
		// optionsWithUnicodeConverter.put(IJavaOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER,
		// new IJavaInputStreamProcessorProvider() {
		//
		// public JavaInputStreamProcessor getInputStreamProcessor(InputStream
		// inputStream) {
		// return new JavaUnicodeConverter(inputStream);
		// }
		// });
		// }
		// XXX CHECK IF IN THE OPTIONS COBOL DIALECT IS SET
		// For now we always use Cobol85 dialect
		String normalizedCobolSourceCode = normalizeLines(inputStream);

		InputStream processedInputStream = IOUtils.toInputStream(normalizedCobolSourceCode, "UTF-8");

		super.doLoad(processedInputStream, optionsWithUnicodeConverter);
//		if (getContentsInternal().isEmpty() && getErrors().isEmpty()) {
//			contents.add(ContainersFactory.eINSTANCE.createEmptyModel());
//		}
	}

	private String normalizeLines(InputStream inputStream) throws IOException {
		final ICobolCleanLinesSubPreprocessor cleanLinesPreprocessor = new CobolCleanLinesSubPreprocessorImpl();
		final ICobolMarkCommentEntriesSubPreprocessor markCommentEntriesPreprocessor = new CobolMarkCommentEntriesSubPreprocessorImpl();
		final ICobolNormalizeLinesSubPreprocessor normalizeLinesPreprocessor = new CobolNormalizeLinesSubPreprocessorImpl();

		String lines = IOUtils.toString(inputStream, "UTF-8");
		
		CobolSourceFormat format = LayoutsFactory.eINSTANCE.createANSI85CobolSourceFormat();

		final String cleanedCode = cleanLinesPreprocessor.processLines(lines, format);
		final String markedCode = markCommentEntriesPreprocessor.processLines(cleanedCode, format);
		final String result = normalizeLinesPreprocessor.processLines(markedCode, format);
		return result;
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		URIConverter uriConverter = getURIConverter();
		URI normalizedURI = uriConverter.normalize(uri);
		// Logger.log("Loading the resource with the normalized URI: " +
		// normalizedURI);
		System.out.println("Loading the resource with the normalized URI: " + normalizedURI);
		if (normalizedURI.toString().startsWith(CobolUniquePathConstructor.COBOL_COPYBOOK_PATHMAP)) {
			System.out.println("[Gelato] Warning: " + uri.lastSegment() + " not registered in class path");
		} else if (normalizedURI.toString().startsWith(CobolUniquePathConstructor.COBOL_COMPILATION_UNIT_PATHMAP)) {
			// classes should have a physical resource
			System.out.println("[Gelato] Warning: " + uri.lastSegment() + " not registered in class path");
		} else {
			System.out.println("Loading uri: " + uri);
			super.load(options);
			System.out.println("Loaded");
		}
		register();
	}

	@Override
	protected EObject getEObject(List<String> uriFragmentPath) {
		System.out.println("Getting Eobject with URI Fragment Path: " + uriFragmentPath.toString());
		int size = uriFragmentPath.size();
		EObject eObject = getEObjectForURIFragmentRootSegment(size == 0 ? "" : uriFragmentPath.get(0));
		for (int i = 1; i < size && eObject != null; ++i) {
			String uriFragment = uriFragmentPath.get(i);
			if (eObject instanceof Copybook
					&& uriFragment.startsWith(CobolUniquePathConstructor.COBOL_COPYBOOK_PATH_PREFIX)) {

				return eObject;

			} else {
				eObject = ((InternalEObject) eObject).eObjectForURIFragmentSegment(uriFragmentPath.get(i));
			}
		}

		return eObject;
	}

	/**
	 * We override this method to enhance the created proxy objects by setting
	 * the 'name' attribute. This is needed to ask proxy objects for their name
	 * without resolving them.
	 */
//	public <ContainerType extends EObject, ReferenceType extends EObject> void registerContextDependentProxy(
//			IPreprocessContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory,
//			ContainerType container, EReference reference, String id, EObject proxyElement, int position) {
//		super.registerContextDependentProxy(factory, container, reference, id, proxyElement, position);
//		if (proxyElement instanceof NamedElement) {
//			NamedElement namedElement = (NamedElement) proxyElement;
//			namedElement.setName(id);
//		}
//	}

	protected void register() throws IOException {
		URI myURI = getURI();

		System.out.println("The URI with which the contents are being registered is: " + myURI);
		if (!getContentsInternal().isEmpty()) {

			EObject root = getContentsInternal().get(0);

			// only for physical URIs
			if (hasCobolCopybookURI()) {
				// Logger.log("Registering URI which has a Copybook Proxy URI:
				// "+ myURI);
				return;
			}

			if (root instanceof Copybook) {
				System.out.println("Registering copybook with URI: " + myURI);
				Copybook cp = (Copybook) root;
				setCopybookName(cp);
				CobolPreprocessClasspath.get(this).registerCobolCopybookFile(cp, myURI);
			}
		}
	}

	protected void setCopybookName(Copybook cpy) {
		String cpyName = getURI().trimFileExtension().lastSegment();
		cpy.setName(cpyName);
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {

		ResourceSet resourceSetForSave = getResourceSet();
		if (resourceSetForSave == null) {
			resourceSetForSave = new ResourceSetImpl();
		}

		// XXX what to do when multiple compilation units?
		
		if (!getContentsInternal().isEmpty()) {
			// super.doSave(outputStream, options);
			IPreprocessTextPrinter printer = getMetaInformation().createPrinter(outputStream, this);
			IPreprocessReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
			printer.setEncoding(getEncoding(options));
			printer.setOptions(options);
			referenceResolverSwitch.setOptions(options);
			EObject root = getContentsInternal().get(0); // only print the
															// single CobolRoot
			if (isLayoutInformationRecordingEnabled()) {
				layoutUtil.transferAllLayoutInformationFromModel(root);
			}
			printer.print(root);
			if (isLayoutInformationRecordingEnabled()) {
				layoutUtil.transferAllLayoutInformationToModel(root);
			}
		}
	}
}
