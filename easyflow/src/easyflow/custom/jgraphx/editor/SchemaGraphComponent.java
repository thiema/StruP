package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.border.BevelBorder;

import org.apache.log4j.Logger;
import org.w3c.dom.Element;

import com.mxgraph.examples.swing.editor.ShadowBorder;
import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;

import easyflow.core.CorePackage;
import easyflow.core.Task;
import easyflow.custom.util.XMLUtil;

public class SchemaGraphComponent extends mxGraphComponent
{
	protected static final Logger logger = Logger.getLogger(SchemaGraphComponent.class);
	public class JPanelRenderer extends JComponent
	{
		public JPanelRenderer(final Object cell,
				final mxGraphComponent graphContainer)
		{
			
			setLayout(new BorderLayout());
			setBorder(BorderFactory.createCompoundBorder(ShadowBorder
					.getSharedInstance(), BorderFactory
					.createBevelBorder(BevelBorder.RAISED)));

			JPanel panel = new JPanel();
			JLabel label = null;
			
			Object value = ((mxCell) cell).getValue();
			Task task=null;
			if (value instanceof Element) {
				task=XMLUtil.loadTaskFromVertex(cell);
				label=new JLabel(task.getUniqueString());
			}
			else
				label = new JLabel(String.valueOf(graph.getLabel(cell)));
			label.setForeground(Color.BLACK);
			label.setFont(panel.getFont().deriveFont(Font.BOLD, 8));
			logger.trace(label.getText());
			panel.setBackground(new Color(149, 173, 239));
			panel.setOpaque(true);
			panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
			panel.setLayout(new BorderLayout());
			panel.add(label, BorderLayout.CENTER);
			add(panel, BorderLayout.NORTH);
			
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1152655782652932774L;

	/**
	 * 
	 * @param graph
	 */
	public SchemaGraphComponent(EasyFlowGraphUtil graph)
	{
		super(graph);
	}
	/**
	 * 
	 */
	public Component[] createComponents(mxCellState state)
	{
		if (getGraph().getModel().isVertex(state.getCell()))
		{
			return new Component[] { new JPanelRenderer(state.getCell(), this) };
		}

		return null;
	}
}
