package easyflow.custom.jgraphx;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;

import easyflow.custom.jgraphx.editor.EasyFlowGraph;

public class Util {

	public final static EasyFlowGraph graph = new EasyFlowGraph();
	
	public static void test(Object cell) {
		mxICell clone = null;
		
		try {
			clone = (mxICell) ((mxCell) cell).clone();
			// logger.debug("cloned: "+vertex);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Object cloneI=getGraph().insertVertexEasyFlow(null, null, clone);
		Object v1 = graph.insertVertex(graph.getDefaultParent(), null, "Hello", 20, 20, 80,
				30);
		graph.insertVertex(graph.getDefaultParent(), 
				null, clone.getValue(), 400, 100, 20, 100);
		System.out.println("hallo");
		
	}
}
