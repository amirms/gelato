import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource;
import org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil;

public class CParserRunner {

	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
	}

	public static void main(String[] args) throws Exception {
		ParseTree tree = parse("./input/program.c");
		
		Rewrite2Kernel k = new Rewrite2Kernel();
		List cus = k.visit(tree);

		CompilationUnit cu = (CompilationUnit) cus.get(0);

		KernelResource rs = new KernelResource();
		rs.getContents().add(cu);

		KernelResourceUtil.resolveAll(rs);

		File file = new File("./output/program.kernel");
		KernelResourceUtil.saveResource(file, rs);
	}

	public static ParseTree parse(String filename) throws Exception {
		String program = readFileAsString(filename);

		ANTLRInputStream input = new ANTLRInputStream(program);

		CLexer lexer = new CLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		CParser parser = new CParser(tokens);
		ParseTree tree = parser.compilationUnit(); // begin parsing at rule 'r'
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree

		return tree;
	}
}
