package exercises123;

import org.overture.ast.analysis.AnalysisAdaptor;

public class Exercise03Visitor extends AnalysisAdaptor {

	int termCount = 0;

	public int exercise03() {
		return termCount;
	}

}
