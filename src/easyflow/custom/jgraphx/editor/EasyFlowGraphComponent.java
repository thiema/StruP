package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import com.mxgraph.examples.swing.editor.JTableRenderer;
import com.mxgraph.examples.swing.editor.ShadowBorder;
import com.mxgraph.examples.swing.editor.EditorActions.StylesheetAction;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxCellState;

import easyflow.core.Task;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.data.DataLink;
import easyflow.data.DataPort;

public class EasyFlowGraphComponent extends mxGraphComponent
{
	protected static final Logger logger = Logger.getLogger(EasyFlowGraphComponent.class);
	protected static final Color normalBgColor              = new Color(149, 173, 239);
	protected static final Color warnMissingToolBgColor     = new Color(255, 40, 40);
	protected static final Color warnUnresolvedPortsBgColor = new Color(255, 255, 128);
	
	
	public EasyFlowGraphComponent(EasyFlowGraph graph)
	{
		super(graph);
		// Sets switches typically used in an editor
		//setPageVisible(true);
		//setGridVisible(true);
		setToolTips(true);
		getConnectionHandler().setCreateTarget(true);

		// Loads the defalt stylesheet from an external file
		/*mxCodec codec = new mxCodec();
		Document doc = mxUtils.loadDocument(GraphEditor.class.getResource(
				"/com/mxgraph/examples/swing/resources/default-style.xml")
				.toString());
		codec.decode(doc.getDocumentElement(), graph.getStylesheet());
*/
		// Sets the background to white
		getViewport().setOpaque(true);
		//getViewport().setBackground(Color.WHITE);
		StylesheetAction sa = new StylesheetAction(
				"/com/mxgraph/examples/swing/resources/default-style.xml");
		ActionEvent e = new ActionEvent(this, this.hashCode(), "");
		sa.actionPerformed(e);
	}
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1152655782652932774L;


	/**
	 * 
	 */
	public Component[] createComponents(mxCellState state)
	{
		mxCell cell=(mxCell) state.getCell();

		if (getGraph().getModel().isVertex(state.getCell())) {
			//return new Component[] { new TaskRenderer(state.getCell(), this) };
			//return new Component[] { new TestRenderer(state.getCell(), this) };
			//return null;
		} else if (getGraph().getModel().isEdge(state.getCell())) {
			// logger.debug("edge rendering to be implemented.");
			//return new Component[] { new LinkRenderer(state.getCell(), this) };
		}
		return null;
	}
	/**
	 * Overrides drop behaviour to set the cell style if the target
	 * is not a valid drop target and the cells are of the same
	 * type (eg. both vertices or both edges). 
	 */
	public Object[] importCells(Object[] cells, double dx, double dy,
			Object target, Point location)
	{
		if (target == null && cells.length == 1 && location != null)
		{
			target = getCellAt(location.x, location.y);

			if (target instanceof mxICell && cells[0] instanceof mxICell)
			{
				mxICell targetCell = (mxICell) target;
				mxICell dropCell = (mxICell) cells[0];

				if (targetCell.isVertex() == dropCell.isVertex()
						|| targetCell.isEdge() == dropCell.isEdge())
				{
					mxIGraphModel model = graph.getModel();
					model.setStyle(target, model.getStyle(cells[0]));
					graph.setSelectionCell(target);

					return null;
				}
			}
		}

		return super.importCells(cells, dx, dy, target, location);
	}


	public class TestRenderer extends JComponent
	{
		
		public TestRenderer(final Object cell,
				final mxGraphComponent graphContainer)
		{
		
			String IMAGE_PATH = "/com/mxgraph/examples/swing/images/";
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createCompoundBorder(ShadowBorder
				.getSharedInstance(), BorderFactory
				.createBevelBorder(BevelBorder.RAISED)));

		JPanel title = new JPanel();
		title.setBackground(new Color(149, 173, 239));
		title.setOpaque(true);
		title.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
		title.setLayout(new BorderLayout());

		JLabel icon = new JLabel(new ImageIcon(JTableRenderer.class
				.getResource(IMAGE_PATH + "preferences.gif")));
		icon.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 1));
		title.add(icon, BorderLayout.WEST);

		JLabel label = new JLabel(String.valueOf(graph.getLabel(cell)));
		label.setForeground(Color.WHITE);
		label.setFont(title.getFont().deriveFont(Font.BOLD, 11));
		label.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 2));
		title.add(label, BorderLayout.CENTER);

		JPanel toolBar2 = new JPanel();
		toolBar2.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
		toolBar2.setOpaque(false);
		/*
		JButton button = new JButton(new AbstractAction("", new ImageIcon(
				JTableRenderer.class.getResource(IMAGE_PATH + "minimize.gif")))
		{

			public void actionPerformed(ActionEvent e)
			{
				graph.foldCells(!graph.isCellCollapsed(cell), false,
						new Object[] { cell });
				((JButton) e.getSource())
						.setIcon(new ImageIcon(
								JTableRenderer.class
										.getResource(IMAGE_PATH
												+ ((graph.isCellCollapsed(cell)) ? "maximize.gif"
														: "minimize.gif"))));
			}
		});
		button.setPreferredSize(new Dimension(16, 16));
		button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		button.setToolTipText("Collapse/Expand");
		button.setOpaque(false);
		toolBar2.add(button);
*/
		title.add(toolBar2, BorderLayout.EAST);
		add(title, BorderLayout.NORTH);
		}
	}
	
	public class TaskRenderer extends JComponent
	{

		public TaskRenderer(final Object cell,
				final mxGraphComponent graphContainer)
		{
			JPanel panel = new JPanel();
			//setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
			setLayout(new BorderLayout());
			setBorder(BorderFactory.createCompoundBorder(ShadowBorder
					.getSharedInstance(), BorderFactory
					.createBevelBorder(BevelBorder.RAISED)));

			Dimension dim = new Dimension();
			dim.setSize(80, 10);

			
			// define and setup panel for incoming data ports
			
			//setLayout(new BoxLayout(inDPPanel, BoxLayout.LINE_AXIS));
			
			
			// define and setup panel for outgoing data ports
			JPanel outDPPanel = new JPanel();
			//setLayout(new BoxLayout(outDPPanel, BoxLayout.LINE_AXIS));
			
			
			panel.setMaximumSize(dim);
			JLabel label = null;
			//mxCell mxcell=(mxCell) cell;
			//Object value = ((mxCell) cell).getValue();
			//logger.debug(getParent());//.getBounds().getMaxX()+" "+getParent().getBounds().getX());
			//setMaximumSize(dim);
			Task task;
			try {
				task = JGraphXUtil.loadTask(cell);
				label= new JLabel(task.getUniqueString());
				label.setForeground(Color.BLACK);
				label.setFont(panel.getFont().deriveFont(Font.BOLD, 8));
				//label.setMaximumSize(dim);
				logger.trace(label.getText()+" preferred tool defined="+task.getPreferredTool()!=null);
				logger.trace(task.getPreferredTool()+" "+task.getToolMatches().keySet());
				if (task.getPreferredTool()==null || task.getToolMatches().get(task.getPreferredTool().getName())==null)
					panel.setBackground(warnMissingToolBgColor);
				else if (task.getToolMatches().get(task.getPreferredTool().getName()).isValid())
					panel.setBackground(normalBgColor);
				else
					panel.setBackground(warnUnresolvedPortsBgColor);
				panel.setOpaque(true);
				//panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
				//panel.setLayout(new BorderLayout());
				
				panel.add(label, BorderLayout.CENTER);
				add(createDataPortInterface(task.getInDataPorts()), BorderLayout.PAGE_START);
				add(panel, BorderLayout.CENTER);
				add(createDataPortInterface(task.getOutDataPorts()), BorderLayout.PAGE_END);
				//add(panel);
				
			} catch (TaskNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private JPanel createDataPortInterface(EList<DataPort> dataPorts)
		{
			JPanel dpPanel = new JPanel();
			Component rigidArea = Box.createRigidArea(new Dimension(5,0));
			for (int i=0; i<dataPorts.size();i++)
			{
				DataPort dataPort=dataPorts.get(i);
				JLabel portLabel = new JLabel(dataPort.getName());
				portLabel.setForeground(Color.DARK_GRAY);
				portLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
				portLabel.setFont(portLabel.getFont().deriveFont(Font.PLAIN, 7));
				portLabel.setOpaque(true);
				dpPanel.add(portLabel);
				if (i<dataPorts.size()-1)
					dpPanel.add(rigidArea);	
			}
			return dpPanel;
		}
	}
	
	public class LinkRenderer extends JComponent
	{
		public LinkRenderer(final Object cell,
				final mxGraphComponent graphContainer) 
		{
			/* ToDo
			 * implement a jcomponent that is adequately sized and positioned.
			 */
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			try {
				DataLink dataLink = JGraphXUtil.loadDataLink(cell);
				if (dataLink!=null && dataLink.getDataPort()!=null)
				{
					JLabel label = new JLabel(dataLink.getDataPort().getName()+"_dummy");
					label.setForeground(Color.BLACK);
					label.setFont(panel.getFont().deriveFont(Font.BOLD, 8));
					panel.setBackground(new Color(149, 173, 239));
					panel.setOpaque(true);
					panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
					panel.add(label);
					if (!dataLink.isUnconditional())
					{
						JLabel perms = new JLabel(new Integer(dataLink.getCondition().getForbidden().size()).toString());
						panel.add(perms);
					}
					
					add(panel);
					logger.debug("LinkRenderer(): set label="+label.getText());
				}
			} catch (DataLinkNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
