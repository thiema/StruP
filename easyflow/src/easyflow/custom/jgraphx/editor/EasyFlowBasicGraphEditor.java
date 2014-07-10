package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

import org.apache.log4j.Logger;


import com.mxgraph.examples.swing.editor.BasicGraphEditor;
import com.mxgraph.examples.swing.editor.EditorMenuBar;
import com.mxgraph.examples.swing.editor.EditorToolBar;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.mxGraphOutline;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxUndoableEdit;
import com.mxgraph.util.mxEventSource.mxIEventListener;
import com.mxgraph.util.mxUndoableEdit.mxUndoableChange;
import com.mxgraph.view.mxGraph;

import easyflow.custom.jgraphx.ComposeWorkflowPanel;

public class EasyFlowBasicGraphEditor extends BasicGraphEditor
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6561623072112577140L;

	private JPanel upperPanel;
	protected static final Logger logger = Logger.getLogger(EasyFlowBasicGraphEditor.class);
	/**
	 * 
	 */
	public EasyFlowBasicGraphEditor(String appTitle, mxGraphComponent component)
	{
		super(appTitle, component);
		
		// Stores and updates the frame title
		this.appTitle = appTitle;

		// Stores a reference to the graph and creates the command history
		graphComponent = component;
		final mxGraph graph = graphComponent.getGraph();
		undoManager = createUndoManager();

		// Do not change the scale and translation after files have been loaded
		graph.setResetViewOnRootChange(false);

		// Updates the modified flag if the graph model changes
		graph.getModel().addListener(mxEvent.CHANGE, changeTracker);

		// Adds the command history to the model and view
		graph.getModel().addListener(mxEvent.UNDO, undoHandler);
		graph.getView().addListener(mxEvent.UNDO, undoHandler);

		// Keeps the selection in sync with the command history
		mxIEventListener undoHandler = new mxIEventListener()
		{
			public void invoke(Object source, mxEventObject evt)
			{
				List<mxUndoableChange> changes = ((mxUndoableEdit) evt
						.getProperty("edit")).getChanges();
				graph.setSelectionCells(graph
						.getSelectionCellsForChanges(changes));
			}
		};

		undoManager.addListener(mxEvent.UNDO, undoHandler);
		undoManager.addListener(mxEvent.REDO, undoHandler);

		// Creates the graph outline component
		graphOutline = new mxGraphOutline(graphComponent);

		// Creates the library pane that contains the tabs with the palettes
		libraryPane = new JTabbedPane();

		// Creates the inner split pane that contains the library with the
		// palettes and the graph outline on the left side of the window
		JSplitPane inner = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				libraryPane, graphOutline);
		inner.setDividerLocation(320);
		inner.setResizeWeight(1);
		inner.setDividerSize(6);
		inner.setBorder(null);

		// Creates the outer split pane that contains the inner split pane and
		// the graph component on the right side of the window
		JSplitPane outer = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, inner,
				graphComponent);
		outer.setOneTouchExpandable(true);
		outer.setDividerLocation(200);
		outer.setDividerSize(6);
		outer.setBorder(null);

		// Creates the status bar
		statusBar = createStatusBar();

		// Display some useful information about repaint events
		installRepaintListener();

		
		// Puts everything together
		setLayout(new BorderLayout());
		add(outer, BorderLayout.CENTER);
		add(statusBar, BorderLayout.SOUTH);
		installToolBar();
		
		
		//EditorToolBar and EasyFlowToolBar in one Panel
		/*
		upperPanel = new JPanel();
		upperPanel.setLayout(new BorderLayout());
		upperPanel.add(new EditorToolBar(this, JToolBar.HORIZONTAL), BorderLayout.NORTH);
		//upperPanel.add(new EasyFlowToolBar(this, JToolBar.HORIZONTAL), BorderLayout.SOUTH);
		add(upperPanel, BorderLayout.NORTH);
		*/
		
		
		// Installs rubberband selection and handling for some special
		// keystrokes such as F2, Control-C, -V, X, A etc.
		installHandlers();
		installListeners();
		updateTitle();
	}
	
	public JFrame createFrame()
	{
		JFrame frame = new JFrame();
		frame.getContentPane().add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setJMenuBar(new EditorMenuBar(this));
		
		frame.setSize(870, 640);
		
		// Updates the frame title
		updateTitle();

		return frame;
	}

	public ComposeWorkflowPanel insertComposeWorkflowPanel(String title)
	{
		final ComposeWorkflowPanel jPanel = new ComposeWorkflowPanel();
		libraryPane.add(title, jPanel);
		return jPanel;
		
	}
}
