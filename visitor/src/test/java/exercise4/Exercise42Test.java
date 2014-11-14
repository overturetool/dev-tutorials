package exercise4;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.lex.Dialect;
import org.overture.ast.modules.AModuleModules;
import org.overture.ast.node.INode;
import org.overture.core.tests.ParseTcFacade;

public class Exercise42Test {

	@Test
	public void test_01() throws AnalysisException {
		List<INode> ast = ParseTcFacade.typedAstFromString(
				"operations op() post true", Dialect.VDM_SL);
		Exercise42Visitor visitor = new Exercise42Visitor();

		String expected = "op";
		String actual = "";

		for (INode n : ast) {
			if (n instanceof AModuleModules) {
				AModuleModules amm = (AModuleModules) n;
				actual = amm.getDefs().get(0).apply(visitor);
			}
		}
		assertEquals(expected, actual);
	}

	@Test
	public void test_02() throws AnalysisException {
		List<INode> ast = ParseTcFacade.typedAstFromString(
				"types a = bool | nat", Dialect.VDM_SL);
		Exercise42Visitor visitor = new Exercise42Visitor();

		String expected = "a";
		String actual = "";

		for (INode n : ast) {
			if (n instanceof AModuleModules) {
				AModuleModules amm = (AModuleModules) n;
				actual = amm.getDefs().get(0).apply(visitor);
			}
		}
		assertEquals(expected, actual);
	}

	@Test
	public void test_03() throws AnalysisException {
		List<INode> ast = ParseTcFacade.typedAstFromString(
				"functions f : int -> int f(x) == x", Dialect.VDM_SL);
		Exercise42Visitor visitor = new Exercise42Visitor();

		String expected = "f";
		String actual = "";

		for (INode n : ast) {
			if (n instanceof AModuleModules) {
				AModuleModules amm = (AModuleModules) n;
				actual = amm.getDefs().get(0).apply(visitor);
			}
		}
		assertEquals(expected, actual);
	}

	@Test
	public void test_04() throws AnalysisException {
		List<INode> ast = ParseTcFacade.typedAstFromString(
				"class Example end Example", Dialect.VDM_PP);
		Exercise42Visitor visitor = new Exercise42Visitor();

		String expected = "Example";
		String actual = ast.get(0).apply(visitor);

		assertEquals(expected, actual);
	}
}
