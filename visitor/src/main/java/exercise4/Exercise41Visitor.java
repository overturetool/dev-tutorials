package exercise4;

import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.analysis.AnswerAdaptor;
import org.overture.ast.node.INode;

public class Exercise41Visitor extends AnswerAdaptor<Integer> {

	@Override
	public Integer createNewReturnValue(INode arg0) throws AnalysisException {
		return null;
	}

	@Override
	public Integer createNewReturnValue(Object arg0) throws AnalysisException {
		return null;
	}



}
