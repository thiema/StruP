package easyflow.custom.jgraphx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.ScrollPaneLayout;

import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

import easyflow.custom.jgraphx.EasyFlowWorker.Informable;
import easyflow.ui.DefaultProject;
import groovy.swing.factory.BoxLayoutFactory;

public class ComposeWorkflowPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7097891149697524964L;
	private static final Logger         logger = Logger.getLogger(ComposeWorkflowPanel.class);

	private final Action                runAction            = new RunAction();
	private final Action                stopAction           = new StopAction();
	private final Action                nextStepAction       = new NextStepAction();
	private final Action                prevStepAction       = new PrevStepAction();

	private       JToolBar              toolBar;
	private       JProgressBar          progressBar          = null;
	private       CurrentTaskPanel      currentTaskPanel;
	private       EasyFlowOverallWorker worker;
	
	final private JTextArea             textAreaTaskDesc     = new JTextArea(5, 10);
	final private JTextArea             textAreaTaskProgress = new JTextArea(5, 10);
    final private JLabel                taskLabel            = new JLabel();
	
	
	private       DefaultProject        defaultProject;
	private       boolean               mayInterruptIfRunning = true;
	
	private JButton runButton;
	private JButton stopButton;
	private JButton nextButton;
	private JButton prevButton;
	
	public ComposeWorkflowPanel() {
		super();
		worker = createWorker();
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
		add(createTaskScrollPanel(), BorderLayout.CENTER);
		//add(createTaskPanel(), BorderLayout.NORTH);
		//add(createControlPanel(), BorderLayout.SOUTH);
	}
	
	public EasyFlowOverallWorker createWorker()
	{
		EasyFlowOverallWorker worker = new EasyFlowOverallWorker(new Informable() {

			@Override
			public void messageChanged(String message) {
				// TODO Auto-generated method stub
				textAreaTaskProgress.append(message + "\n");
			}
			}, this);
		worker.addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				if (event.getPropertyName().equals("progress"))
				{
					getProgressBar().setIndeterminate(false);
					getProgressBar().setValue((Integer) event.getNewValue());
					getProgressBar().validate();
				}
			}
		});
		return worker;
	}
	
	public void setWorker(EasyFlowOverallWorker worker)
	{
		if (this.worker!=null)
		{
			// do something with the 'old' worker
		}
		this.worker=worker;
	}
	
	public JProgressBar createProgressBar()
	{
		progressBar = new JProgressBar();
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		return progressBar;
	}
	
	public JProgressBar getProgressBar() {
		//JProgressBar progressBar = new JProgressBar(0, GlobalVar.getGraphUtil().getTraversalEvents().size());
		if (progressBar == null)
		{
			progressBar = createProgressBar();
		}
		return progressBar;
	}
	
	public JTextArea getTextAreaTaskDesc() {
		return textAreaTaskDesc;
	}
	public JTextArea getTextAreaTaskProgress()
	{
		return textAreaTaskProgress;
	}
	
	public EasyFlowOverallWorker getWorker()
	{
		return worker;
	}
	
	private JScrollPane createTaskScrollPanel()
	//private JPanel createTaskScrollPanel()
	{
		JPanel currentTaskPanel = new JPanel();
		currentTaskPanel.setLayout(new BoxLayout(currentTaskPanel, BoxLayout.PAGE_AXIS));
        
        //textAreaTaskProgress.setMinimumSize(new Dimension(50, 25));
        //textAreaTaskProgress.setMaximumSize(new Dimension(350, 300));
        textAreaTaskProgress.setPreferredSize(new Dimension(50, 25));
        textAreaTaskProgress.setEditable(false);
        textAreaTaskProgress.setBorder(BorderFactory.createLineBorder(Color.black));
        textAreaTaskProgress.setLineWrap(true);
        textAreaTaskProgress.setFont(new Font("Arial", Font.ITALIC, 10));
        //textAreaTaskProgress.setOpaque(false);
        //currentTaskPanel.add(taskLabel);
		
		//currentTaskPanel.add(textAreaTaskDesc);
		currentTaskPanel.add(textAreaTaskProgress);
		currentTaskPanel.setVisible(true);
		JScrollPane scrollPane = new JScrollPane (currentTaskPanel, 
	            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
	            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		scrollPane.setVisible(true);
		return scrollPane;
		
	}
	private JPanel createTaskPanel()
	{
		// implementation as a selection list
		//currentTaskPanel = new CurrentTaskPanel();
		
		JPanel currentTaskPanel = new JPanel();
		currentTaskPanel.setLayout(new BoxLayout(currentTaskPanel, BoxLayout.PAGE_AXIS));
        textAreaTaskDesc.setBorder(BorderFactory.createLineBorder(Color.black));
        textAreaTaskDesc.setMinimumSize(new Dimension(50, 25));
        textAreaTaskDesc.setMaximumSize(new Dimension(350, 100));
        textAreaTaskDesc.setEditable(false);
        textAreaTaskDesc.setFont(new Font("Serif", Font.ITALIC, 12));
        textAreaTaskDesc.setLineWrap(true);
        textAreaTaskDesc.setWrapStyleWord(true);
        
        textAreaTaskProgress.setMinimumSize(new Dimension(50, 25));
        textAreaTaskProgress.setMaximumSize(new Dimension(350, 100));
        textAreaTaskProgress.setEditable(false);
        textAreaTaskProgress.setBorder(BorderFactory.createLineBorder(Color.black));
        currentTaskPanel.add(taskLabel);
		
		currentTaskPanel.add(textAreaTaskDesc);
		currentTaskPanel.add(textAreaTaskProgress);
		currentTaskPanel.setVisible(true);
		
		return currentTaskPanel;
	}
	
	private JPanel createControlPanel()
	{
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new BorderLayout());
		
		toolBar = new JToolBar();
		toolBar.setBorder(BorderFactory.createCompoundBorder(BorderFactory
				.createEmptyBorder(3, 3, 3, 3), toolBar.getBorder()));
		toolBar.setFloatable(false);
		
		runButton  = toolBar.add(runAction);
		stopButton = toolBar.add(stopAction);
		nextButton = toolBar.add(nextStepAction);
		prevButton = toolBar.add(prevStepAction);
		
		runButton.setEnabled(false);
		stopButton.setEnabled(false);
		nextButton.setEnabled(false);
		prevButton.setEnabled(false);
		
		controlPanel.add(getProgressBar(), BorderLayout.NORTH);
		controlPanel.add(toolBar, BorderLayout.SOUTH);
		
		return controlPanel;
	}
	
	/*
	private class Action extends AbstractAction {
		public Action() {
			putValue(NAME, "");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}*/

	public JToolBar getToolBar() {
		return toolBar;
	}

	public void setToolBar(JToolBar toolbar) {
		this.toolBar = toolbar;
	}

	public CurrentTaskPanel getCurrentTaskPanel() {
		return currentTaskPanel;
	}

	public void setCurrentTaskPanel(CurrentTaskPanel currentTaskPanel) {
		this.currentTaskPanel = currentTaskPanel;
	}

	public JButton getRunButton() {
		return runButton;
	}

	public JButton getStopButton() {
		return stopButton;
	}

	public JButton getNextButton() {
		return nextButton;
	}

	public JButton getPrevButton() {
		return prevButton;
	}

	public DefaultProject getDefaultProject() {
		return defaultProject;
	}

	public void setDefaultProject(DefaultProject defaultProject) {
		this.defaultProject = defaultProject;
		logger.debug(defaultProject.getActiveWorkflow());
		getWorker().setDefaultProject(defaultProject);
		getDefaultProject().setWorker(getWorker());
	}

	public JLabel getTaskLabel() {
		return taskLabel;
	}

	private class RunAction extends AbstractAction {
		public RunAction() {
			putValue(NAME, "run");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
			getStopButton().setEnabled(true);
			setEnabled(false);
			worker.setAddUtilityTask(false);
			worker.setProcessNextStepOnly(false);
			try {
				
				worker.execute();
				
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private class StopAction extends AbstractAction {
		public StopAction() {
			putValue(NAME, "stop");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
			
			worker.cancel(mayInterruptIfRunning);
			setWorker(createWorker());
			setDefaultProject(getDefaultProject());
			getProgressBar().setValue(0);
			//getWorker().getDefaultProject().resetWorkflowStep();
			
			setEnabled(false);
			
			
		}
	}

	private class NextStepAction extends AbstractAction {
		public NextStepAction() {
			putValue(NAME, "nxt");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
			worker.setProcessNextStepOnly(true);
			
			try {
				int old=worker.getProgress();
				worker.doInBackground();
				//if (worker.isDone())
					worker.firePropertyChange("progress", old, worker.getProgress());
				
				//worker.execute();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private class PrevStepAction extends AbstractAction {
		public PrevStepAction() {
			putValue(NAME, "prv");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	private class CurStepAction extends AbstractAction {
		public CurStepAction(ImageIcon icon, String name, String description) {
			putValue(LARGE_ICON_KEY, icon);
			putValue(NAME, name);
			putValue(SHORT_DESCRIPTION, description);
		}
		public void actionPerformed(ActionEvent e) {
		}
	
	}
	
}
