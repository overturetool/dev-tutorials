package visitor;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.lex.Dialect;
import org.overture.ast.modules.AModuleModules;
import org.overture.ast.node.INode;
import org.overture.core.tests.ParseTcFacade;

public class Exercise02Test {

	@Test
	public void test_01() throws AnalysisException {
		List<INode> ast = ParseTcFacade.typedAstFromString("operations op() post true", Dialect.VDM_SL);
		Exercise02Visitor visitor = new Exercise02Visitor();
		
		for (INode n : ast){
			if (n instanceof AModuleModules){
				AModuleModules amm = (AModuleModules) n;
				amm.getDefs().get(0).apply(visitor);
			}
		}
		ast.get(0).apply(visitor);
		String expected = "op";
		String actual = visitor.exercise02();
		
		assertEquals(expected, actual);
		
	}

	@Test
	public void test_02() throws AnalysisException {
		List<INode> ast = ParseTcFacade.typedAstFromString("types a = bool | nat", Dialect.VDM_SL);
		Exercise02Visitor visitor = new Exercise02Visitor();
		
		for (INode n : ast){
			if (n instanceof AModuleModules){
				AModuleModules amm = (AModuleModules) n;
				amm.getDefs().get(0).apply(visitor);
			}
		}

		String expected = "a";
		String actual = visitor.exercise02();
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void test_03() throws AnalysisException {
		List<INode> ast = ParseTcFacade.typedAstFromString("functions f : int -> int f(x) == x", Dialect.VDM_SL);
		Exercise02Visitor visitor = new Exercise02Visitor();
		
		for (INode n : ast){
			if (n instanceof AModuleModules){
				AModuleModules amm = (AModuleModules) n;
				amm.getDefs().get(0).apply(visitor);
			}
		}

		String expected = "f";
		String actual = visitor.exercise02();
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void test_04() throws AnalysisException {
		List<INode> ast = ParseTcFacade.typedAstFromString("class Example end Example", Dialect.VDM_PP);
		Exercise02Visitor visitor = new Exercise02Visitor();
		ast.get(0).apply(visitor);
		String expected = "Example";
		String actual = visitor.exercise02();
		
		assertEquals(expected, actual);
		
	}
}
