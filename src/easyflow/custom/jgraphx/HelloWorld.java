package easyflow.custom.jgraphx;

import java.util.Hashtable;
import java.util.Map;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;

public class HelloWorld extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2707712944901661771L;

	public HelloWorld()
	{
		super("Hello, World!");

		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();

		String vertexStyle="EASYFLOW_VERTEX_STYLE";
		Hashtable<String, Object> baseStyle = new Hashtable<String, Object>();
		Map<String, Object> vertexStyleMap = new Hashtable<String, Object>(baseStyle);
		vertexStyleMap.put(mxConstants.STYLE_FILLCOLOR, "#000000");
        vertexStyleMap.put(mxConstants.STYLE_STROKECOLOR, "#000000");
        //vertexStyleMap.put(mxConstants.STYLE_AUTOSIZE, 1);
        vertexStyleMap.put(mxConstants.STYLE_RESIZABLE, 0);
        vertexStyleMap.put(mxConstants.STYLE_NOLABEL, 1);
        vertexStyleMap.put(mxConstants.STYLE_TEXT_OPACITY, 0);
        mxStylesheet stylesheet = graph.getStylesheet();
        stylesheet.putCellStyle(vertexStyle, vertexStyleMap);
		
		graph.getModel().beginUpdate();
		try
		{
			
			Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80,
					30, vertexStyle);
			Object v2 = graph.insertVertex(parent, null, "World!", 240, 150,
					80, 30);
			graph.insertEdge(parent, null, "Edge", v1, v2);
		}
		finally
		{
			graph.getModel().endUpdate();
		}

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);
	}

	public static void main(String[] args)
	{
		HelloWorld frame = new HelloWorld();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 320);
		frame.setVisible(true);
	}

}
