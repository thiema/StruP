/**
 * $Id: GraphEditor.java,v 1.11 2012-01-13 12:51:15 david Exp $
 * Copyright (c) 2006-2012, JGraph Ltd */
package easyflow.custom.jgraphx;

import java.awt.Color;
import java.awt.Point;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.UIManager;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;

import com.mxgraph.examples.swing.GraphEditor;
import com.mxgraph.examples.swing.editor.EditorMenuBar;
import com.mxgraph.examples.swing.editor.EditorPalette;
import com.mxgraph.io.mxCodec;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.util.mxSwingConstants;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxResources;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;

import easyflow.custom.jgraphx.editor.EasyFlowBasicGraphEditor;
import easyflow.custom.jgraphx.editor.EasyFlowCustomGraph;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.editor.EasyFlowGraphComponent;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.editor.SchemaGraphComponent;

public class EasyFlowGraphEditor extends EasyFlowBasicGraphEditor
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4601740824088314699L;

	

	/**
	 * Holds the URL for the icon to be used as a handle for creating new
	 * connections. This is currently unused.
	 */
	public static URL url = null;
	protected static final Logger logger = Logger.getLogger(EasyFlowGraphEditor.class);
	//GraphEditor.class.getResource("/com/mxgraph/examples/swing/images/connector.gif");

	public EasyFlowGraphEditor()
		{
		super("mxGraph for JFC/Swing", new SchemaGraphComponent(new EasyFlowCustomGraph()));
		// from the examples
		//this("mxGraph Editor", new CustomGraphComponent(new EasyFlowCustomGraph()));
		//this("mxGraph Editor", new CustomGraphComponent(new EasyFlowGraph()));
		// 
		//this("EasyFlow Workbench", new EasyFlowGraphComponent(new EasyFlowGraph()));
	}

	/**
	 * 
	 */
	public EasyFlowGraphEditor(String appTitle, mxGraphComponent component)
	{
		super(appTitle, component);
		//final mxGraph graph = graphComponent.getGraph();

		// Creates the shapes palette
		EditorPalette shapesPalette = insertPalette(mxResources.get("shapes"));
		//EditorPalette imagesPalette = insertPalette(mxResources.get("images"));
		//EditorPalette symbolsPalette = insertPalette(mxResources.get("symbols"));

		

		// Adds some template cells for dropping into the graph
		shapesPalette
				.addTemplate(
						"New Task",
						new ImageIcon(
								EasyFlowGraphEditor.class
										.getResource("/com/mxgraph/examples/swing/images/rounded.png")),
						//"rounded=1",
						"icon;image=/com/mxgraph/examples/swing/images/wrench.png",
						160, 120, "Task");
		shapesPalette
		.addTemplate(
				"Label",
				new ImageIcon(
						GraphEditor.class
								.getResource("/com/mxgraph/examples/swing/images/rounded.png")),
				"label;image=/com/mxgraph/examples/swing/images/gear.png",
				130, 50, "Label");
		
	}

	/**
	* 
	*/
	public static class CustomGraphComponent extends mxGraphComponent
	{

		/**
		 * 
		 */
		private static final long serialVersionUID = -6833603133512882012L;

		/**
		 * 
		 * @param graph
		 */
		public CustomGraphComponent(mxGraph graph)
		{
			super(graph);

			// Sets switches typically used in an editor
			setPageVisible(true);
			setGridVisible(true);
			setToolTips(true);
			getConnectionHandler().setCreateTarget(true);

			// Loads the defalt stylesheet from an external file
			mxCodec codec = new mxCodec();
			Document doc = mxUtils.loadDocument(GraphEditor.class.getResource(
					"/com/mxgraph/examples/swing/resources/default-style.xml")
					.toString());
			codec.decode(doc.getDocumentElement(), graph.getStylesheet());

			// Sets the background to white
			getViewport().setOpaque(true);
			getViewport().setBackground(Color.WHITE);
		}

		/**
		 * Overrides drop behaviour to set the cell style if the target
		 * is not a valid drop target and the cells are of the same
		 * type (eg. both vertices or both edges). 
		 
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
		*/

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

		mxSwingConstants.SHADOW_COLOR = Color.LIGHT_GRAY;
		mxConstants.W3C_SHADOWCOLOR = "#D3D3D3";
		
		//GraphEditor editor = new GraphEditor();
		//editor.createFrame(new EditorMenuBar(editor)).setVisible(true);
		EasyFlowGraphEditor editor = new EasyFlowGraphEditor();
		editor.createFrame(new EditorMenuBar(editor)).setVisible(true);
	}
}
