package easyflow.custom.jgraphx.editor;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

import org.w3c.dom.Element;

import com.mxgraph.examples.swing.editor.JTableRenderer;
import com.mxgraph.examples.swing.editor.ShadowBorder;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.handler.mxCellHandler;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph;

import easyflow.core.Task;
import easyflow.custom.util.XMLUtil;
import easyflow.core.DataPort;
import easyflow.traversal.GroupingCriterion;


public class EasyFlowTaskSimpleRenderer extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7458647599457311194L;
	private Object cell;
	private mxGraphComponent graphContainer;
	private mxGraph graph;
	public static final String IMAGE_PATH = "/com/mxgraph/examples/swing/images/";
	
	public EasyFlowTaskSimpleRenderer(final Object cell,
			final mxGraphComponent graphContainer) 
	{
		this.cell = cell;
		this.graphContainer = graphContainer;
		this.graph = graphContainer.getGraph();
		
		
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createCompoundBorder(ShadowBorder
				.getSharedInstance(), BorderFactory
				.createBevelBorder(BevelBorder.RAISED)));

		JPanel title = new JPanel();
		title.setBackground(new Color(149, 173, 239));
		title.setOpaque(true);
		title.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
		title.setLayout(new BorderLayout());
		JPanel fieldPane = new JPanel(new GridLayout(0,1));
		final JScrollPane scrollPane = new JScrollPane(fieldPane);
		
		JLabel label = new JLabel(String.valueOf(graph.getLabel(cell)));
		label.addMouseListener(new MouseListener(){

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
				scrollPane.setMinimumSize(new Dimension(50, 60));
				graph.foldCells(false, false, new Object[] { cell });
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("exited");
				scrollPane.setMaximumSize(new Dimension(20, 30));
				graph.foldCells(true, false, new Object[] { cell });
				
			}
			
		});
		label.setForeground(Color.BLACK);
		label.setFont(title.getFont().deriveFont(Font.BOLD, 11));
		label.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 2));
		title.add(label, BorderLayout.CENTER);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(title, BorderLayout.EAST);
		add(panel, BorderLayout.NORTH);
		
		JPanel toolBar2 = new JPanel();
		toolBar2.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
		toolBar2.setOpaque(false);
		
		
		
		
		//the minimize/maximize button and action
		final JButton button = new JButton(new AbstractAction("", new ImageIcon(
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
		graph.foldCells(false, false, new Object[] { cell });
		button.setPreferredSize(new Dimension(16, 16));
		button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		button.setToolTipText("Collapse/Expand");
		button.setOpaque(false);
		toolBar2.add(button);

		title.add(toolBar2, BorderLayout.EAST);

		add(title, BorderLayout.NORTH);
		
		//Layout the text fields in a panel.
        
		
		//Create the text fields and set them up.
		Object value = ((mxCell) cell).getValue();
		double maxWidth=0;
		int lineCount=0;
		if (value instanceof Element) {
			Task task=XMLUtil.loadTaskFromElement((Element) value);
			Font font=new Font("Verdana", Font.TRUETYPE_FONT, 10);
			JFormattedTextField uniqName=new JFormattedTextField("unique:"+" "+task.getUniqueString());
			uniqName.setFont(font);
			uniqName.setSize(uniqName.getWidth(), 5);
			fieldPane.add(uniqName);
			
			String tmp="IN:";
			for (DataPort dataPort:task.getInDataPorts()) {
				tmp+=" "+dataPort.getDataFormat().getName();
				for (GroupingCriterion groupingCriterion:dataPort.getGroupingCriteria()) {
					tmp+=" "+groupingCriterion.getId();
				}
			}
			JFormattedTextField formatIn=new JFormattedTextField(tmp);
			formatIn.setFont(font);
			formatIn.setSize(uniqName.getWidth(), 5);
			fieldPane.add(formatIn);

			tmp="Out:";
			for (DataPort dataPort:task.getInDataPorts()) {
				tmp+=" "+dataPort.getDataFormat().getName();
				for (GroupingCriterion groupingCriterion:dataPort.getGroupingCriteria()) {
					tmp+=" "+groupingCriterion.getId();
				}
			}

			JFormattedTextField formatOut=new JFormattedTextField(tmp);
			formatOut.setFont(font);
			formatOut.setSize(uniqName.getWidth(), 5);
			fieldPane.add(formatOut);

			/*			
			maxWidth=uniqName.getPreferredSize().getWidth();
			Map<String,List<String>> map=XMLUtil.parseElementToMap((Element) value);
			Iterator<String> it=map.keySet().iterator();

			while (it.hasNext()) {
				String key=it.next();
				lineCount++;
				curField=new JFormattedTextField(key+": "+
						map.get(key).toString());
				double curMaxWidth=curField.getPreferredSize().getWidth();
				if (curMaxWidth>maxWidth) maxWidth=curMaxWidth;
				
				//curField.setEnabled(false);
				fieldPane.add(curField);

			}
			*/
		}
/*
		//graph.getModel().beginUpdate();
		//try {

		// Resize cells
		
		mxCell curCell=(mxCell) cell;
		mxGeometry g = (mxGeometry) curCell.getGeometry().clone();
        mxRectangle bounds = graph.getView().getState(cell).getLabelBounds();
        //g.setHeight(bounds.getHeight() + lineCount*20); //10 is for padding
        g.setWidth(maxWidth+5);

        graph.cellsResized(new Object[] { cell }, new mxRectangle[] { g });
		*/        
        
		
		//add(fieldPane, BorderLayout.CENTER);
		
		//add scrollpane

		scrollPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

		if (graph.getModel().getChildCount(cell) == 0)
		{
			scrollPane.getViewport().setBackground(Color.WHITE);
			setOpaque(true);
			add(scrollPane, BorderLayout.CENTER);
		}

		scrollPane.getVerticalScrollBar().addAdjustmentListener(
				new AdjustmentListener()
				{

					public void adjustmentValueChanged(AdjustmentEvent e)
					{
						graphContainer.refresh();
					}

				});

		label = new JLabel(new ImageIcon(JTableRenderer.class
				.getResource(IMAGE_PATH + "resize.gif")));
		label.setCursor(new Cursor(Cursor.NW_RESIZE_CURSOR));

		//setSize((int)g.getWidth(), (int)g.getHeight());
		//graphContainer.refresh();
		//graphContainer.redraw(graph.getView().getState(cell));

		ResizeHandler resizeHandler = new ResizeHandler();
		label.addMouseListener(resizeHandler);
		label.addMouseMotionListener(resizeHandler);
		setMinimumSize(new Dimension(20, 30));
		
	}
	
	/**
	 * Implements an event redirector for the specified handle index, where 0
	 * is the top right, and 1-7 are the top center, rop right, middle left,
	 * middle right, bottom left, bottom center and bottom right, respectively.
	 * Default index is 7 (bottom right).
	 */
	public class ResizeHandler implements MouseListener, MouseMotionListener
	{

		protected int index;

		public ResizeHandler()
		{
			this(7);
		}

		public ResizeHandler(int index)
		{
			this.index = index;
		}

		public void mouseClicked(MouseEvent e)
		{
			// ignore
		}

		public void mouseEntered(MouseEvent e)
		{
			// ignore
		}

		public void mouseExited(MouseEvent e)
		{
			// ignore
		}

		public void mousePressed(MouseEvent e)
		{
			// Selects to create a handler for resizing
			if (!graph.isCellSelected(cell))
			{
				graphContainer.selectCellForEvent(cell, e);
			}

			// Initiates a resize event in the handler
			mxCellHandler handler = graphContainer.getSelectionCellsHandler().getHandler(
					cell);

			if (handler != null)
			{
				// Starts the resize at index 7 (bottom right)
				handler.start(SwingUtilities.convertMouseEvent((Component) e
						.getSource(), e, graphContainer.getGraphControl()),
						index);
				e.consume();
			}
		}

		public void mouseReleased(MouseEvent e)
		{
			graphContainer.getGraphControl().dispatchEvent(
					SwingUtilities.convertMouseEvent((Component) e.getSource(),
							e, graphContainer.getGraphControl()));
		}

		public void mouseDragged(MouseEvent e)
		{
			graphContainer.getGraphControl().dispatchEvent(
					SwingUtilities.convertMouseEvent((Component) e.getSource(),
							e, graphContainer.getGraphControl()));
		}

		public void mouseMoved(MouseEvent e)
		{
			// ignore
		}
	}
	/**
	 * 
	 */
	public static EasyFlowTaskSimpleRenderer getVertex(Component component)
	{
		while (component != null)
		{
			if (component instanceof EasyFlowTaskSimpleRenderer)
			{
				return (EasyFlowTaskSimpleRenderer) component;
			}
			component = component.getParent();
		}

		return null;
	}

}
