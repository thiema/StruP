package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.CellRendererPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.view.mxInteractiveCanvas;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;

public class EasyFlowCanvas extends mxInteractiveCanvas
{
	protected CellRendererPane rendererPane = new CellRendererPane();

	//final protected JPanel vertexRenderer = new JPanel();
	protected JLabel vertexRenderer = new JLabel();
	protected mxGraphComponent graphComponent;

	public EasyFlowCanvas(mxGraphComponent graphComponent)
	{
		this.graphComponent = graphComponent;

		vertexRenderer.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.RAISED));
		vertexRenderer.setHorizontalAlignment(JLabel.CENTER);
		vertexRenderer.setBackground(graphComponent.getBackground()
				.darker());
		vertexRenderer.setOpaque(true);
	}

	public void drawVertex(mxCellState state, String label)
	{
		final mxCell cell = (mxCell)state.getCell();
		final mxGraph graph = graphComponent.getGraph();
		vertexRenderer.setText(label);
		//vertexLabel.setHorizontalAlignment(JLabel.CENTER);
		//System.out.println(graph.getLabel(cell));
		//vertexRenderer.add(vertexLabel, BorderLayout.CENTER);
		//JLabel taskName = new JLabel("_"+String.valueOf(graph.getLabel(cell))+"_");
		//vertexRenderer.add(taskName, BorderLayout.CENTER);
		vertexRenderer.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("entered");
				//rendererPane.add(content);
				//graph.foldCells(true, false, new Object[] { cell });				
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("exited");
				//rendererPane.remove(content);
				//title.setSize(new Dimension(30, 30));
				//setSize(new Dimension(30, 30));
				//graph.foldCells(false, false, new Object[] { cell });
				
			}

			
		});
		
		
		rendererPane.paintComponent(g, vertexRenderer, graphComponent,
				(int) state.getX() + translate.x, (int) state.getY()
						+ translate.y, (int) state.getWidth(),
				(int) state.getHeight(), true);
	}

}