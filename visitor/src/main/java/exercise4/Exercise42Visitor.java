package exercise4;

import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.analysis.AnswerAdaptor;
import org.overture.ast.node.INode;

public class Exercise42Visitor extends AnswerAdaptor<String> {

	@Override
	public String createNewReturnValue(INode arg0) throws AnalysisException {
		return null;
	}

	@Override
	public String createNewReturnValue(Object arg0) throws AnalysisException {
		return null;
	}

}
