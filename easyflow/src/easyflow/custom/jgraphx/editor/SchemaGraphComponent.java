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
import easyflow.core.DataLink;
import easyflow.core.DataPort;
import easyflow.core.Task;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.XMLUtil;

public class SchemaGraphComponent extends mxGraphComponent
{
	protected static final Logger logger = Logger.getLogger(SchemaGraphComponent.class);
	protected static final Color normalBgColor              = new Color(149, 173, 239);
	protected static final Color warnMissingToolBgColor     = new Color(255, 40, 40);
	protected static final Color warnUnresolvedPortsBgColor = new Color(255, 255, 128);
	
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
			//mxCell mxcell=(mxCell) cell;
			//Object value = ((mxCell) cell).getValue();

			Task task;
			try {
				task = GlobalVar.getGraphUtil().loadTask(cell);
				label=new JLabel(task.getUniqueString());
				label.setForeground(Color.BLACK);
				label.setFont(panel.getFont().deriveFont(Font.BOLD, 8));
				logger.trace(label.getText()+" "+task.getPreferredTool());
				if (task.getPreferredTool()==null)
					panel.setBackground(warnMissingToolBgColor);
				else if (task.getToolMatches().get(task.getPreferredTool().getName()).isValid())
					panel.setBackground(normalBgColor);
				else
					panel.setBackground(warnUnresolvedPortsBgColor);
				panel.setOpaque(true);
				panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
				panel.setLayout(new BorderLayout());
				panel.add(label, BorderLayout.CENTER);
				add(panel, BorderLayout.NORTH);
				
			} catch (TaskNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public class JLabelRenderer extends JComponent
	{
		public JLabelRenderer(final Object cell,
				final mxGraphComponent graphContainer) 
		{
			/* ToDo
			 * implement a jcomponent that is adequately sized and positioned.
			 */
			JPanel panel = new JPanel();
			try {
				DataLink dataLink=GlobalVar.getGraphUtil().loadDataLink(cell);
				if (dataLink!=null && dataLink.getDataPort()!=null)
				{
				JLabel label = new JLabel(dataLink.getDataPort().getName());
				label.setForeground(Color.BLACK);
				label.setFont(panel.getFont().deriveFont(Font.BOLD, 8));
				panel.setBackground(new Color(149, 173, 239));
				panel.setOpaque(true);
				panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
				panel.add(label);
				add(panel);
				logger.debug("label renderer: set label="+label.getText());
				}
			} catch (DataLinkNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		else if (getGraph().getModel().isEdge(state.getCell()))
		{
			//logger.debug("edge rendering to be implemented.");
			return new Component[] { new JLabelRenderer(state.getCell(), this) };
		}
		

		return null;
	}
}
