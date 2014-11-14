package exercise4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.expressions.PExp;
import org.overture.core.tests.ParseTcFacade;

public class Exercise41Test {

	@Test
	public void test_01() throws AnalysisException {
		PExp setEnum = ParseTcFacade.parseExpressionString("{1,2,3}");
		Exercise41Visitor visitor = new Exercise41Visitor();
		
		int expected = 3;
		int actual = setEnum.apply(visitor);

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_02() throws AnalysisException {
		PExp setEnum = ParseTcFacade.parseExpressionString("{}");
		Exercise41Visitor visitor = new Exercise41Visitor();
		
		int expected = 0;
		int actual = setEnum.apply(visitor);

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_03() throws AnalysisException {
		PExp setEnum = ParseTcFacade.parseExpressionString("{1,2,3,{1,2,3}}");
		Exercise41Visitor visitor = new Exercise41Visitor();
		
		int expected = 4;
		int actual = setEnum.apply(visitor);

		assertEquals(expected, actual);
	}

}
