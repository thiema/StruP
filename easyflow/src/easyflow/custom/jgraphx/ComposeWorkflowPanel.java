package easyflow.custom.jgraphx;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import org.apache.log4j.Logger;

import easyflow.custom.jgraphx.editor.EasyFlowToolBar;
import easyflow.custom.util.EasyFlowUtil;
import easyflow.custom.util.GlobalVar;

public class ComposeWorkflowPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7097891149697524964L;
	private static final Logger         logger         = Logger.getLogger(ComposeWorkflowPanel.class);

	final Action runAction      = new RunAction();
	final Action stopAction     = new StopAction();
	final Action nextStepAction = new NextStepAction();
	final Action prevStepAction = new PrevStepAction();

	private JToolBar toolBar;
	private CurrentTaskPanel currentTaskPanel;

	private JButton runButton;
	private JButton stopButton;
	private JButton nextButton;
	private JButton prevButton;
	
	public ComposeWorkflowPanel() {
		super();
		//setLayout(new BorderLayout(1, 0));
		//setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
		add(createTaskPanel(), BorderLayout.NORTH);
		add(createControlPanel(), BorderLayout.SOUTH);
	}
	
	private JProgressBar getProgressBar() {
		//JProgressBar progressBar = new JProgressBar(0, GlobalVar.getGraphUtil().getTraversalEvents().size());
		JProgressBar progressBar = new JProgressBar(0, 10);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		return progressBar;
	}
	
	private JPanel createTaskPanel()
	{
		currentTaskPanel = new CurrentTaskPanel();
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


	private class RunAction extends AbstractAction {
		public RunAction() {
			putValue(NAME, "run");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
			getStopButton().setEnabled(true);
			setEnabled(false);
			EasyFlowUtil.composeEntireWorkflow();
			getStopButton().setEnabled(false);
		}
	}

	private class StopAction extends AbstractAction {
		public StopAction() {
			putValue(NAME, "stop");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

	private class NextStepAction extends AbstractAction {
		public NextStepAction() {
			putValue(NAME, "nxt");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
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
