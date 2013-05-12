package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import org.w3c.dom.Element;

import com.mxgraph.examples.swing.editor.JTableRenderer;
import com.mxgraph.examples.swing.editor.ShadowBorder;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import com.mxgraph.model.mxCell;

import easyflow.core.DataPort;
import easyflow.core.GroupingCriterion;
import easyflow.core.Task;
import easyflow.custom.util.XMLUtil;

public class TestCellFoldingRenderer extends JComponent
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2106746763664760745L;

	/**
	 * 
	 */
	public static final String IMAGE_PATH = "/com/mxgraph/examples/swing/images/";

	/**
	 * 
	 */
	protected static int sourceRow = 0;

	/**
	 * 
	 */
	protected Object cell;

	/**
	 * 
	 */
	protected mxGraphComponent graphContainer;

	/**
	 * 
	 */
	protected mxGraph graph;

	/**
	 * 
	 */
	@SuppressWarnings("serial")
	public TestCellFoldingRenderer(final Object cell,
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
		graph.foldCells(true, false, new Object[] { cell });
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

		title.add(toolBar2, BorderLayout.EAST);
		add(title, BorderLayout.NORTH);
		//Create the text fields and set them up.
		JPanel fieldPane=new JPanel(new GridLayout(0,1));
		Object value = ((mxCell) cell).getValue();
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
		}
		//setSize(new Dimension(100, 100));
		
		add(fieldPane, BorderLayout.CENTER);
		
	}

}
