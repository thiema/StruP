package easyflow.custom.jgraphx.editor;

import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.CellRendererPane;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

import com.mxgraph.examples.swing.editor.JTableRenderer;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.view.mxInteractiveCanvas;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;


public class EasyFlowGraphComponent extends mxGraphComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1043896160644320727L;

	public EasyFlowGraphComponent(mxGraph graph) {
		super(graph);
		mxGraphView graphView = new mxGraphView(graph);

		graph.setView(graphView);

	}

	public Component[] createComponents(mxCellState state)
	{
		if (getGraph().getModel().isVertex(state.getCell()))
		{
			//return new Component[] { new JTableRenderer(state.getCell(), this) };
			//return new Component[] { new EasyFlowTaskSimpleRenderer(state.getCell(), this) };
			return new Component[] {new TestRenderer2(state.getCell(), this)};
			//return new Component[] {new TestCellFoldingRenderer(state.getCell(), this)};
		}
		else if (getGraph().getModel().isEdge(state.getCell()))
		{
			return new Component[] {new TestRenderer2(state.getCell(), this)};
		}
		return null;
	}
	
	
	/*override createCanvas and return a custom CanvasObject
	public mxInteractiveCanvas createCanvas()
	{
		return new EasyFlowCanvas(this);
	}
	*/

	

}
