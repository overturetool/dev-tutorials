package visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.expressions.PExp;
import org.overture.core.tests.ParseTcFacade;

public class Exercise03Test {

	@Test
	public void test_01() throws AnalysisException {
		PExp exp = ParseTcFacade.parseExpressionString("1");
		Exercise03Visitor visitor = new Exercise03Visitor();
		
		exp.apply(visitor);
		
		int expected = 1;
		int actual = visitor.exercise03();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_02() throws AnalysisException{
			PExp exp = ParseTcFacade.parseExpressionString(" 1 + 2");
			Exercise03Visitor visitor = new Exercise03Visitor();
			
			exp.apply(visitor);
			
			int expected = 2;
			int actual = visitor.exercise03();
			
			assertEquals(expected, actual);
		}
	
	@Test
	public void test_03() throws AnalysisException {
		PExp exp = ParseTcFacade.parseExpressionString("3*5 - 4 + 2*2");
		Exercise03Visitor visitor = new Exercise03Visitor();
		
		exp.apply(visitor);
		
		int expected = 3;
		int actual = visitor.exercise03();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_04() throws AnalysisException {
		PExp exp = ParseTcFacade.parseExpressionString("-2 + 3 * 4");
		Exercise03Visitor visitor = new Exercise03Visitor();
		
		exp.apply(visitor);
		
		int expected = 2;
		int actual = visitor.exercise03();
		
		assertEquals(expected, actual);
	}
	
	
	
}
