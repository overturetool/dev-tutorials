package visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.expressions.PExp;
import org.overture.core.tests.ParseTcFacade;

public class Exercise01Test {

	@Test
	public void test_01() throws AnalysisException {
		PExp setEnum = ParseTcFacade.parseExpressionString("{1,2,3}");
		Exercise01Visitor visitor = new Exercise01Visitor();
		setEnum.apply(visitor);
		int expected = 3;
		int actual = visitor.exercise01();

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_02() throws AnalysisException {
		PExp setEnum = ParseTcFacade.parseExpressionString("{}");
		Exercise01Visitor visitor = new Exercise01Visitor();
		setEnum.apply(visitor);
		int expected = 0;
		int actual = visitor.exercise01();

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_03() throws AnalysisException {
		PExp setEnum = ParseTcFacade.parseExpressionString("{1,2,3,{1,2,3}}");
		Exercise01Visitor visitor = new Exercise01Visitor();
		setEnum.apply(visitor);
		int expected = 4;
		int actual = visitor.exercise01();

		assertEquals(expected, actual);
	}

}
