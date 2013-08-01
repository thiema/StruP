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

import easyflow.core.Task;
import easyflow.custom.util.XMLUtil;
import easyflow.tool.DataPort;
import easyflow.traversal.GroupingCriterion;



public class TestRenderer extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7458647599457311194L;
	private Object cell;
	private mxGraphComponent graphContainer;
	private mxGraph graph;
	//public static final String IMAGE_PATH = "/com/mxgraph/examples/swing/images/";

	protected static final Logger logger = Logger.getLogger(TestRenderer.class);
	
	public TestRenderer(final Object cell,
			final mxGraphComponent graphContainer) 
	{
		this.cell = cell;
		this.graphContainer = graphContainer;
		this.graph = graphContainer.getGraph();
		
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
		mxCellState[] cellStates=graph.getView().getCellStates(new Object[] {cell});
		/*System.out.println(label.getText()+" "+graph.getLabel(cell)+" "+
				getComponentCount()+" "+title.getAlignmentX()+" "+
				title.getX()+" "+title.getY()+" "+
				cellStates[0].getX()+" "+cellStates[0].getY()+" "+
				cellStates[0].getAbsoluteOffset());
		*/
		
		//Create the text fields and set them up.
		final JPanel fieldPane=new JPanel(new GridLayout(0,1));
		
		//double maxWidth=0;
		//int lineCount=0;
		//graphContainer.getGraphControl().addMouseListener(new MouseAdapter(){
		addMouseListener(new MouseAdapter(){

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
				
				fieldPane.setVisible(true);
				setSize(new Dimension(100, 100));
	/*			fieldPane.setOpaque(true);
				add(fieldPane, BorderLayout.CENTER);
				setSize(new Dimension(100, 100));
				System.out.println(fieldPane.getComponentCount());
		*/		
				/*graph.foldCells(true, false, new Object[] { cell });
				mxCellState[] cellStates=graph.getView().getCellStates(new Object[] {cell});
				System.out.println(title.getAlignmentX()+" "+
						title.getX()+" "+title.getY()+" "+
						cellStates[0].getX()+" "+cellStates[0].getY()+" "+
								cellStates[0].getAbsoluteOffset());*/
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				//remove(fieldPane);
				setSize(new Dimension(100, 15));
				fieldPane.setVisible(false);
				
			}

			
		});
		if (task!=null) {
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
		setSize(new Dimension(100, 15));
		add(fieldPane, BorderLayout.CENTER);
		fieldPane.setVisible(false);
		//graphContainer.refresh();
		
	    mxCellState state = graph.getView().getStates().get(cell);
	    state.setHeight(10);
	    //graph.getView().setStates();
	    //graph.updateCellSize(cell);


		//remove(fieldPane);
		//graphContainer.refresh();
	}
	
	public static TestRenderer getVertex(Component component)
	{
		while (component != null)
		{
			if (component instanceof TestRenderer)
			{
				return (TestRenderer) component;
			}
			component = component.getParent();
		}

		return null;
	}
}