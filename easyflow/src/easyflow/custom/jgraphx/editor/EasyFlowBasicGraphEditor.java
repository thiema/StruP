package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import org.apache.log4j.Logger;

import com.mxgraph.examples.swing.editor.BasicGraphEditor;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.mxGraphOutline;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxUndoableEdit;
import com.mxgraph.util.mxEventSource.mxIEventListener;
import com.mxgraph.util.mxUndoableEdit.mxUndoableChange;
import com.mxgraph.view.mxGraph;

import easyflow.custom.jgraphx.ComposeWorkflowPanel;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;

public class EasyFlowBasicGraphEditor extends BasicGraphEditor
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6561623072112577140L;

	protected static final Logger logger = Logger.getLogger(EasyFlowBasicGraphEditor.class);
	/**
	 * 
	 */
	public EasyFlowBasicGraphEditor(String appTitle, mxGraphComponent component)
	{
		super(appTitle, component);
		
		// Stores and updates the frame title
//		this.appTitle = appTitle;

		// Stores a reference to the graph and creates the command history
//		graphComponent = component;
		final mxGraph graph = graphComponent.getGraph();
		GlobalVar.setGraphComponent(graphComponent);
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

		
		//JPanel lowerPanel = new JPanel();
		//lowerPanel.add(new JTextPane());
		JTextPane logMsgTextArea = new JTextPane ();
		logMsgTextArea.setEditable(false);
		
/*		
 * dont understand which component I am ...
 * 
		logger.debug("the dimensions of the whole window are: "
				+getGraphComponent().getHeight()+" "+
				+getComponentCount()+" "
				+getVisibleRect().getHeight()+" x "+getSize().getWidth());
		for (int i=0; i<getComponentCount(); i++)
		{
			logger.debug("dimensions of component "
					+i+":  "+getComponent(i).getName()
					+" y="+getComponent(i).getY()
					+" width="+getComponent(i).getSize().getWidth());
		}
		*/
		logger.debug("width of graphcomponent="+graphComponent.getWidth());
		
		logMsgTextArea.setPreferredSize(new Dimension(0, 100));
		addStylesToDocument(logMsgTextArea.getStyledDocument());
		//logMsgTextArea.setLineWrap(true);
		//logMsgTextArea.setFont(new Font("Arial", Font.ITALIC, 10));
		JScrollPane logMsgTextAreaScrollPane = new JScrollPane (logMsgTextArea, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		logMsgTextAreaScrollPane.setAutoscrolls(true);
		//logMsgTextAreaScrollPane.setPreferredSize(new Dimension(0, 400));
		//logMsgTextAreaScrollPane.setMinimumSize(new Dimension(0, 400));
		//logMsgTextAreaScrollPane.add(logMsgTextArea);
		//lowerPanel.add(logMsgTextAreaScrollPane);
		//add(lowerPanel, BorderLayout.SOUTH);
		GlobalVar.setTextAreaForLogMsg(logMsgTextArea);
		
		JSplitPane overall = new JSplitPane(JSplitPane.VERTICAL_SPLIT, outer, logMsgTextAreaScrollPane);
		overall.setOneTouchExpandable(true);
		overall.setDividerLocation(-5);
		overall.setResizeWeight(1);
		overall.setDividerSize(3);

		
		
		// Creates the status bar
		statusBar = createStatusBar();

		// Display some useful information about repaint events
		installRepaintListener();

		// Puts everything together
		setLayout(new BorderLayout());
		add(overall, BorderLayout.CENTER);
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
//		frame.setJMenuBar(new EditorMenuBar(this));
		frame.setSize(870, 640);
		// Updates the frame title
		updateTitle();

		return frame;
	}

	public ComposeWorkflowPanel insertComposeWorkflowPanel(String title)
	{
		final ComposeWorkflowPanel jPanel = new ComposeWorkflowPanel();
		//jPanel.setBackground();
		jPanel.setOpaque(false);
		libraryPane.add(title, jPanel);
		return jPanel;
		
	}
	
	protected void addStylesToDocument(StyledDocument doc) {
		
        //Initialize some styles.
        //Style def_monospace = StyleContext.getDefaultStyleContext().
          //              getStyle(StyleContext.DEFAULT_STYLE);
        Style defaultStyle = StyleContext.getDefaultStyleContext().
                getStyle(StyleContext.DEFAULT_STYLE);
        //GlobalVar.setDefaultDocStyle(defaultStyle);
        StyleConstants.setFontFamily(defaultStyle, "Courier");
        //font and some styles can't be set this way. has to be set everytime before writing 
        //StyleConstants.setItalic(def_monospace, true);
        
        //for (String s : GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames())
        	//logger.info(s);
        //choose a monospaced font:
        //"Bitstream Charter" "Courier 10 Pitch" "Courier"
        //StyleConstants.setFontFamily(def_monospace, "Courier");

        Style s,ss;

        //set category
        s = doc.addStyle(GlobalConstants.GUI_LOG_MSG_STYLE_CATEGORY, defaultStyle);
        StyleConstants.setBold(s, true);
        StyleConstants.setForeground(s, Color.BLUE);
        StyleConstants.setFontSize(s, 12);

        //set severity
        ss = doc.addStyle(GlobalConstants.GUI_LOG_MSG_STYLE_SEVERITY, defaultStyle);
        StyleConstants.setFontSize(ss, 12);
        
        s = doc.addStyle(GlobalConstants.GUI_LOG_MSG_STYLE_SEVERITY_LOW, ss);
        StyleConstants.setForeground(s, Color.GRAY);
        
        s = doc.addStyle(GlobalConstants.GUI_LOG_MSG_STYLE_SEVERITY_MEDIUM, ss);
        StyleConstants.setForeground(s, Color.BLACK);
        
        s = doc.addStyle(GlobalConstants.GUI_LOG_MSG_STYLE_SEVERITY_HIGH, ss);
        StyleConstants.setForeground(s, Color.RED);
        

        //set log message text style
        s = doc.addStyle(GlobalConstants.GUI_LOG_MSG_STYLE_TEXT, defaultStyle);
        StyleConstants.setFontSize(s, 11);
        
//        s = doc.addStyle("icon", regular);
//        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
        /*
        ImageIcon pigIcon = createImageIcon("images/Pig.gif",
                                            "a cute pig");
        if (pigIcon != null) {
            StyleConstants.setIcon(s, pigIcon);
        }

        s = doc.addStyle("button", regular);
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
        ImageIcon soundIcon = createImageIcon("images/sound.gif",
                                              "sound icon");
        JButton button = new JButton();
        if (soundIcon != null) {
            button.setIcon(soundIcon);
        } else {
            button.setText("BEEP");
        }
        button.setCursor(Cursor.getDefaultCursor());
        button.setMargin(new Insets(0,0,0,0));
        button.setActionCommand(buttonString);
        button.addActionListener(this);
        
        StyleConstants.setComponent(s, button);
        */
    }

}
