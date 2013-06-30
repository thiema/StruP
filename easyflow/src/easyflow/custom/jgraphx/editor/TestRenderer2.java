package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EMap;
import org.w3c.dom.Element;

import com.mxgraph.examples.swing.editor.ShadowBorder;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.model.mxCell;

import easyflow.core.DataPort;
import easyflow.core.GroupingCriterion;
import easyflow.core.Task;
import easyflow.custom.util.XMLUtil;



public class TestRenderer2 extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7458647599457311194L;
	private Object cell;
	private mxGraphComponent graphContainer;
	private mxGraph graph;
	//public static final String IMAGE_PATH = "/com/mxgraph/examples/swing/images/";

	protected static final Logger logger = Logger.getLogger(TestRenderer.class);
	
	public TestRenderer2(final Object cell,
			final mxGraphComponent graphContainer) 
	{
		this.cell = cell;
		this.graphContainer = graphContainer;
		this.graph = graphContainer.getGraph();
		
		/*
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createCompoundBorder(ShadowBorder
				.getSharedInstance(), BorderFactory
				.createBevelBorder(BevelBorder.RAISED)));
		//setMinimumSize(new Dimension(100, 100));
		final JPanel title = new JPanel();

		title.setBackground(new Color(149, 173, 239));
		title.setOpaque(true);
		title.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
		title.setLayout(new BorderLayout());
		JLabel label = null;
		Object value = ((mxCell) cell).getValue();
		Task task=null;
		if (value instanceof Element) {
			//logger.debug(//(EMap<String,Task>)
				//	XMLUtil.container.get("tasks").hashCode());
			task=XMLUtil.loadTaskFromElement((Element) value);
			//logger.debug(graph.getLabel(cell)+" "+task);
			//logger.debug(task.getUniqueString()+" "+task.getChunks().keySet());
			//label=new JLabel(String.valueOf(graph.getLabel(cell)));
			label=new JLabel(task.getUniqueString());
			//if (task.isActive()) {
				label.setForeground(Color.BLACK);
			//} else {	
				//label.setForeground(Color.RED);
			//}
			
			label.setFont(title.getFont().deriveFont(Font.BOLD, 11));
			label.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 2));
			title.add(label, BorderLayout.CENTER);
			title.setMinimumSize(getSize());
		}		
		add(title, BorderLayout.NORTH);
		//mxCellState[] cellStates=graph.getView().getCellStates(new Object[] {cell});


		 */
	}
	
	public static TestRenderer2 getVertex(Component component)
	{
		while (component != null)
		{
			if (component instanceof TestRenderer2)
			{
				return (TestRenderer2) component;
			}
			component = component.getParent();
		}

		return null;
	}
}