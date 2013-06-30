package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;

import org.apache.log4j.Logger;
import org.w3c.dom.Element;

import com.mxgraph.examples.swing.GraphEditor;
import com.mxgraph.examples.swing.editor.BasicGraphEditor;
import com.mxgraph.examples.swing.editor.EditorPalette;
import com.mxgraph.examples.swing.editor.EditorToolBar;
import com.mxgraph.examples.swing.editor.SchemaEditorMenuBar;
import com.mxgraph.examples.swing.editor.SchemaEditorToolBar;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;

import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.Task;
import easyflow.custom.util.ResourceManager;
import easyflow.custom.util.XMLUtil;

public class SchemaEditor extends BasicGraphEditor
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7007225006753337933L;
	private static final Logger logger = Logger.getLogger(SchemaEditor.class);

	/**
	 * 
	 */
	private JPanel upperPanel;
	public SchemaEditor()
	{
		//super("mxGraph for JFC/Swing", new SchemaGraphComponent(new mxGraph()
		super("mxGraph for JFC/Swing", new SchemaGraphComponent(new EasyFlowGraph()
		{
			/**
			 * Allows expanding tables
			 
			public boolean isCellFoldable(Object cell, boolean collapse)
			{
				return model.isVertex(cell);
			}
			*/
			
		})

		{
			/**
			 * 
			 */
			private static final long serialVersionUID = -1194463455177427496L;

			/**
			 * Disables folding icons.
			 */
			public ImageIcon getFoldingIcon(mxCellState state)
			{
				return null;
			}

		});
		logger.debug(((EasyFlowGraph)getGraphComponent().getGraph()).hashCode());

		// Creates a single shapes palette
		EditorPalette shapesPalette = insertPalette("Schema");
		graphOutline.setVisible(false);

		mxCell tableTemplate = new mxCell("New Table", new mxGeometry(0, 0,
				200, 280), null);
		tableTemplate.getGeometry().setAlternateBounds(
				new mxRectangle(0, 0, 140, 25));
		tableTemplate.setVertex(true);

		shapesPalette
				.addTemplate(
						"Table",
						new ImageIcon(
								GraphEditor.class
										.getResource("/com/mxgraph/examples/swing/images/rectangle.png")),
						tableTemplate);

		getGraphComponent().getGraph().setCellsResizable(false);
		getGraphComponent().setConnectable(false);
		getGraphComponent().getGraphHandler().setCloneEnabled(false);
		getGraphComponent().getGraphHandler().setImagePreview(false);

		// Prefers default JComponent event-handling before mxCellHandler handling
		//getGraphComponent().getGraphHandler().setKeepOnTop(false);
		upperPanel = new JPanel();
		upperPanel.setLayout(new BorderLayout());
		upperPanel.add(new EditorToolBar(this, JToolBar.HORIZONTAL), BorderLayout.NORTH);
		upperPanel.add(new EasyFlowToolBar(this, JToolBar.HORIZONTAL), BorderLayout.SOUTH);
		add(upperPanel, BorderLayout.NORTH);

		/*
		mxGraph graph = getGraphComponent().getGraph();
		Object parent = graph.getDefaultParent();
		
		graph.getModel().beginUpdate();
		try
		{
			Task t1 = CoreFactory.eINSTANCE.createTask();
			t1.setName("task1");
			Task t2 = CoreFactory.eINSTANCE.createTask();
			t2.setName("task2");
			mxCell v1 = (mxCell) graph.insertVertex(parent, null, XMLUtil.getElement(t1),
					20, 20, 80, 20);

			v1.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
			mxCell v2 = (mxCell) graph.insertVertex(parent, null, XMLUtil.getElement(t2),
					280, 20, 80, 20);
			v2.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
		}
		finally
		{
			graph.getModel().endUpdate();
		}
		*/
	}

	/**
	 * 
	 */
	protected void installToolBar()
	{
		add(new SchemaEditorToolBar(this, JToolBar.HORIZONTAL),
				BorderLayout.NORTH);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}

		SchemaEditor editor = new SchemaEditor();
		editor.createFrame(new SchemaEditorMenuBar(editor)).setVisible(true);
	}

}
