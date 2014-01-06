package easyflow.custom.jgraphx;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.apache.log4j.Logger;

import easyflow.custom.jgraphx.editor.EasyFlowToolBar;

public final class CurrentTaskPanel extends JPanel implements ListSelectionListener {

	private JList list;
    private DefaultListModel listModel;
    private JTextArea textArea;
    
    private static final Logger         logger         = Logger.getLogger(CurrentTaskPanel.class);
    
    static final String genAbstractGraphDescription = "The abstract Workflow is computed based on the Workflow template.";
    static final String applyTraversalCritDescription = "The metadata are applied to generate a concrete graph.";
    static final String addUtilityTasksDescription = "Utility Tasks are included in case of incompatible groupings.";
    
    public CurrentTaskPanel()
    {
    	super(new BorderLayout());
		java.net.URL imageUrl = ComposeWorkflowPanel.class.getResource("pix/russian_star.gif");
		ImageIcon icon = new ImageIcon(imageUrl);
		DefaultListModel listModel = new DefaultListModel();
		CurrentTaskListObject ctlo = new CurrentTaskListObject("abstract Workflow", icon, genAbstractGraphDescription);
		listModel.add(0, ctlo);
		ctlo = new CurrentTaskListObject("apply Traversal Criterion", icon, applyTraversalCritDescription);
		listModel.add(1, ctlo);
		ctlo = new CurrentTaskListObject("add Utility Tasks", icon, addUtilityTasksDescription);
		listModel.add(2, ctlo);
		
		//listModel.add(3, "test1");
		//Create the list and put it in a scroll pane.
        list = new JList(listModel);
        CurrentTaskRenderer currentTaskRenderer = new CurrentTaskRenderer();
        list.setCellRenderer(currentTaskRenderer);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(-1);
        list.addListSelectionListener(this);
        list.setVisibleRowCount(3);
        list.setEnabled(false);
        
        JScrollPane listScrollPane = new JScrollPane(list);
        add(listScrollPane, BorderLayout.WEST);
        textArea = new JTextArea("dummy text.");
        textArea.setEditable(false);
        add(textArea, BorderLayout.EAST);
        setEnabled(true);

    }
    
	//This method is required by ListSelectionListener.
	public void valueChanged(ListSelectionEvent e) {
	    if (e.getValueIsAdjusting() == false) {
	
	        if (list.getSelectedIndex() == -1) {
	        //No selection, disable fire button.
	            //fireButton.setEnabled(false);
	
	        } else {
	        //Selection, enable the fire button.
	            //fireButton.setEnabled(true);
	        }
	    }
	}
	
	public void setSelectedTask(String curTask)
	{
		logger.debug(list.getSelectedIndex()+" "+list.getLastVisibleIndex()+" "+list.isEnabled());
		if (list.getSelectedIndex()<list.getLastVisibleIndex())
		{
			list.setSelectedIndex(list.getSelectedIndex()+1);
			try {
				wait(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private class CurrentTaskListObject {
		private String name;
		private ImageIcon icon;
		private String description;
		
		public CurrentTaskListObject(String name, ImageIcon icon, String description)
		{
			this.name=name;
			this.description=description;
			this.icon=icon;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ImageIcon getIcon() {
			return icon;
		}

		public void setIcon(ImageIcon icon) {
			this.icon = icon;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}
	private class CurrentTaskRenderer extends JLabel implements ListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {
		    //Get the selected index. (The index param isn't
	        //always valid, so just use the value.)
	        //int selectedIndex = ((Integer)value).intValue();
		    setOpaque(true);
			
	        if (isSelected) {
	            setBackground(list.getSelectionBackground());
	            setForeground(list.getSelectionForeground());
	        } else {
	            setBackground(list.getBackground());
	            setForeground(list.getForeground());
	        }

	        if (value != null)
	        {
	        	if (value instanceof CurrentTaskListObject)
	        	{
		        	CurrentTaskListObject ctlo = (CurrentTaskListObject) value;
		        	if (ctlo.getIcon()!=null)
		        		setIcon(ctlo.getIcon());
		        	if (ctlo.getName()!=null)
		        		setText(ctlo.getName());
		        	setFont(list.getFont());
	        	}
	        }
	        return this;

		}
	}
}