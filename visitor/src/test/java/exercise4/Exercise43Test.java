package exercise4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.expressions.PExp;
import org.overture.core.tests.ParseTcFacade;

public class Exercise43Test {

	@Test
	public void test_01() throws AnalysisException {
		PExp exp = ParseTcFacade.parseExpressionString("1");
		Exercise43Visitor visitor = new Exercise43Visitor();

		int expected = 1;
		int actual = exp.apply(visitor, 0);

		assertEquals(expected, actual);
	}

	@Test
	public void test_02() throws AnalysisException {
		PExp exp = ParseTcFacade.parseExpressionString(" 1 + 2");
		Exercise43Visitor visitor = new Exercise43Visitor();

		int expected = 2;
		int actual = exp.apply(visitor, 0);

		assertEquals(expected, actual);
	}

	@Test
	public void test_03() throws AnalysisException {
		PExp exp = ParseTcFacade.parseExpressionString("3*5 - 4 + 2*2");
		Exercise43Visitor visitor = new Exercise43Visitor();

		int expected = 3;
		int actual = exp.apply(visitor, 0);

		assertEquals(expected, actual);
	}

	@Test
	public void test_04() throws AnalysisException {
		PExp exp = ParseTcFacade.parseExpressionString("-2 + 3 * 4");
		Exercise43Visitor visitor = new Exercise43Visitor();

		int expected = 2;
		int actual = exp.apply(visitor, 0);

		assertEquals(expected, actual);
	}

}
