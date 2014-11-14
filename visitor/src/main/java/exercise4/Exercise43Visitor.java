package exercise4;

import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.analysis.QuestionAnswerAdaptor;
import org.overture.ast.node.INode;

public class Exercise43Visitor extends QuestionAnswerAdaptor<Integer, Integer> {

	@Override
	public Integer createNewReturnValue(INode arg0, Integer arg1)
			throws AnalysisException {
		return null;
	}

	@Override
	public Integer createNewReturnValue(Object arg0, Integer arg1)
			throws AnalysisException {
		return null;
	}

}
