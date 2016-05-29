package easyflow.custom.jgraphx.editor;

import java.awt.Point;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxPoint;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;

import easyflow.core.Task;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.Util;
import easyflow.data.DataLink;
import easyflow.tool.Parameter;
import easyflow.traversal.TraversalCriterion;


/**
 * A graph that creates new edges from a given template edge.
 */


public class EasyFlowCustomGraph extends mxGraph
{
	private static final Logger logger = Logger.getLogger(EasyFlowCustomGraph.class);

	/**
	 * Holds the shared number formatter.
	 * 
	 * @see NumberFormat#getInstance()
	 */
	public static final NumberFormat numberFormat = NumberFormat.getInstance();

	/**
	 * Holds the edge to be used as a template for inserting new edges.
	 */
	protected Object edgeTemplate;

	/**
	 * Custom graph that defines the alternate edge style to be used when
	 * the middle control point of edges is double clicked (flipped).
	 */
	public EasyFlowCustomGraph()
	{
		setAlternateEdgeStyle("edgeStyle=mxEdgeStyle.ElbowConnector;elbow=vertical");
	}

	/**
	 * Sets the edge template to be used to inserting edges.
	 */
	public void setEdgeTemplate(Object template)
	{
		edgeTemplate = template;
	}

	/**
	 * Prints out some useful information about the cell in the tooltip.
	 */
	
	public String getToolTipForCell(Object cell)
	{
		String tip = "<html>";
		String label = getLabel(cell);
		if (!getModel().isEdge(cell))
		{
			Task task;
			try {
				task = JGraphXUtil.loadTask(cell);
				tip += "Name: "+task.getName()+"<br>";
				if (task.getChunks().size() > 0)
				{
				tip += "Data:<br>";
				for (String chunkType : task.getChunks().keySet())
				{
					tip += "  -" + chunkType+": "+Util.list2String(task.getChunks().get(chunkType), ",");
					tip += "<br>";
				}
				}
				tip += "Tool: "+task.getPreferredTool().getName()+"<br>";
			} catch (TaskNotFoundException e) {
				tip += "Task not found. ("+label+")<br>";
			}
		}
		else
		{
			try {
				DataLink dataLink = JGraphXUtil.loadDataLink(cell);
				tip += "Name: "+dataLink.getDataPort().getName()+"<br>";
				tip += "Format: "+dataLink.getFormat().getName()+"<br>";
				
				if (dataLink.getInDataPort() != null)
				{
					tip += "DataPort (In): "+dataLink.getInDataPort().getName()
							+" ("+dataLink.getInDataPort().getFormat().renderAsFileExtension()+")<br>";
				}
				if (dataLink.getInData() != null)
				{
					tip += "Data (In): "+dataLink.getInData().getFormatStr()+"<br>";
					
					if (dataLink.getInData().getParameter() != null)
					{
						Parameter param = dataLink.getInData().getParameter();
						tip += "Parameter (In): "+(param.getLabel() == null ? param.getName() : param.getLabel())+"<br>";
					}
				}
				tip += "DataPort (Out): "+dataLink.getDataPort().getName()
						+" ("+dataLink.getDataPort().getFormat().renderAsFileExtension()+")<br>";
				if (dataLink.getData() != null)
				{
					tip += "Data (Out): "+dataLink.getData().getFormatStr()+"<br>";
					
					if (dataLink.getData().getParameter() != null)
					{
						Parameter param = dataLink.getData().getParameter();
						tip += "Parameter (Out): "+(param.getLabel() == null ? param.getName() : param.getLabel())+"<br>";
					}
				}
				/*
				if (dataLink.getChunks() != null)
				{
					tip += "Data:<br>";
					for (String chunkType : dataLink.getChunks().keySet())
					{
						tip += "  -"+chunkType+": "+Util.list2String(dataLink.getChunks().get(chunkType), ",");
						tip += "<br>";
					}
				}
				
				if (dataLink.getDataPort() != null && !dataLink.getDataPort().isStatic())
				{
					tip += "Data:<br>";
					for (TraversalCriterion traversalCriterion : dataLink.getDataPort().getGroupingCriteria())
					{
						for (String chunkType : traversalCriterion.getChunks().keySet())
						{
							tip += "  -"+chunkType+": "+Util.list2String(dataLink.getChunks().get(chunkType), ",");
							tip += "<br>";
						}
					}
				}
				else
				{
					tip += "No DataPort defined.<br>";
				}
				tip += "Group: "+dataLink.getGroupingStr()+"<br>";
				tip += "Param: "+dataLink.getParamNameStr()+"<br>";
				*/
				
				
				
			} catch (DataLinkNotFoundException e) {
				tip += "Link not found. ("+label+")<br>";
			}
		}
		
		tip += "</html>";
		return tip;
	}
	
	/*
	public String getToolTipForCell(Object cell)
	{
		String tip = "<html>";
		mxGeometry geo = getModel().getGeometry(cell);
		mxCellState state = getView().getState(cell);

		if (getModel().isEdge(cell))
		{
			tip += "points={";

			if (geo != null)
			{
				List<mxPoint> points = geo.getPoints();

				if (points != null)
				{
					Iterator<mxPoint> it = points.iterator();

					while (it.hasNext())
					{
						mxPoint point = it.next();
						tip += "[x=" + numberFormat.format(point.getX())
								+ ",y=" + numberFormat.format(point.getY())
								+ "],";
					}

					tip = tip.substring(0, tip.length() - 1);
				}
			}

			tip += "}<br>";
			tip += "absPoints={";

			if (state != null)
			{

				for (int i = 0; i < state.getAbsolutePointCount(); i++)
				{
					mxPoint point = state.getAbsolutePoint(i);
					tip += "[x=" + numberFormat.format(point.getX())
							+ ",y=" + numberFormat.format(point.getY())
							+ "],";
				}

				tip = tip.substring(0, tip.length() - 1);
			}

			tip += "}";
		}
		else
		{
			tip += "geo=[";

			if (geo != null)
			{
				tip += "x=" + numberFormat.format(geo.getX()) + ",y="
						+ numberFormat.format(geo.getY()) + ",width="
						+ numberFormat.format(geo.getWidth()) + ",height="
						+ numberFormat.format(geo.getHeight());
			}

			tip += "]<br>";
			tip += "state=[";

			if (state != null)
			{
				tip += "x=" + numberFormat.format(state.getX()) + ",y="
						+ numberFormat.format(state.getY()) + ",width="
						+ numberFormat.format(state.getWidth())
						+ ",height="
						+ numberFormat.format(state.getHeight());
			}

			tip += "]";
		}

		mxPoint trans = getView().getTranslate();

		tip += "<br>scale=" + numberFormat.format(getView().getScale())
				+ ", translate=[x=" + numberFormat.format(trans.getX())
				+ ",y=" + numberFormat.format(trans.getY()) + "]";
		tip += "</html>";

		return tip;
	}
	*/

	/**
	 * Overrides the method to use the currently selected edge template for
	 * new edges.
	 * 
	 * @param graph
	 * @param parent
	 * @param id
	 * @param value
	 * @param source
	 * @param target
	 * @param style
	 * @return
	 */
	/*
	public Object createEdge(Object parent, String id, Object value,
			Object source, Object target, String style)
	{
		if (edgeTemplate != null)
		{
			mxCell edge = (mxCell) cloneCells(new Object[] { edgeTemplate })[0];
			edge.setId(id);

			return edge;
		}

		return super.createEdge(parent, id, value, source, target, style);
	}
*/
	/*
	 *custom label 
	 */
	public String getLabel(Object o) {
		
		if (o instanceof mxCell)
		{
			mxCell cell = (mxCell) o;
			if (cell.isVertex())
			{
				try {
					if (GlobalVar.getGraph()!=null)
					{
						
						Task task = JGraphXUtil.loadTask(cell);
						
						if (task != null)
						{
							//logger.trace(" "+task.getUniqueString()+" autosize="+isAutoSizeCell(o)+" resize="+isCellResizable(o));
							if (task.isUtil())
							{
								if (task.getSimpleName() != null && !"".equals(task.getSimpleName()))
									return task.getSimpleName()+Util.traversalChunks2String(task.getChunks(), false);
								else
									return task.getName();
							}
							else if (task.isRoot())
								return task.getName();
							return task.getUniqueString();
						}
					}
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (cell.isEdge())
			{
				try {
					if (GlobalVar.getGraph()!=null)
					{
						DataLink dataLink = JGraphXUtil.loadDataLink(cell);
						if (dataLink!=null && dataLink.getDataPort()!=null)
						{
							String labelName = dataLink.getDataPort().getName();
							
							String uniqueString = dataLink.getUniqueString(true);
							
							String condition = ""; 
							if (!dataLink.isUnconditional())
								condition+=" not ("+StringUtils.join(dataLink.getCondition().getForbidden(), " || ")+")";
							
							logger.trace("getLabel(): "+labelName+"_"+uniqueString+" cond="+condition);
							return labelName;
						}
					}
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				
				if (cell.getValue() instanceof String)
				{
					return (String)cell.getValue();
				}
			}
		}
		
		//logger.trace("cannot retrieve label");
		return null;
	}
	
	/**
	 * Moves or clones the specified cells and moves the cells or clones by the
	 * given amount, adding them to the optional target cell. The location is
	 * the position of the mouse pointer as the mouse was released. The change
	 * is carried out using cellsMoved. This method fires mxEvent.MOVE_CELLS
	 * while the transaction is in progress.
	 * 
	 * @param cells Array of cells to be moved, cloned or added to the target.
	 * @param dx Integer that specifies the x-coordinate of the vector.
	 * @param dy Integer that specifies the y-coordinate of the vector.
	 * @param clone Boolean indicating if the cells should be cloned.
	 * @param target Cell that represents the new parent of the cells.
	 * @param location Location where the mouse was released.
	 * @return Returns the cells that were moved.
	 */
	/*
	@Override
	public Object[] moveCells(Object[] cells, double dx, double dy,
			boolean clone, Object target, Point location)
	{
		if (cells != null && (dx != 0 || dy != 0 || clone || target != null))
		{
			model.beginUpdate();
			try
			{
				if (clone)
				{
					cells = cloneCells(cells, isCloneInvalidEdges());

					if (target == null)
					{
						target = getDefaultParent();
					}
				}

				// Need to disable allowNegativeCoordinates if target not null to
				// allow for temporary negative numbers until cellsAdded is called.
				boolean previous = isAllowNegativeCoordinates();
				
				if (target != null)
				{
					setAllowNegativeCoordinates(true);
				}
				
				cellsMoved(cells, dx, dy, !clone && isDisconnectOnMove()
						&& isAllowDanglingEdges(), target == null);
				
				setAllowNegativeCoordinates(previous);

				if (target != null)
				{
					Integer index = model.getChildCount(target);
					cellsAdded(cells, target, index, null, null, true);
				}

				fireEvent(new mxEventObject(mxEvent.MOVE_CELLS, "cells", cells,
						"dx", dx, "dy", dy, "clone", clone, "target", target,
						"location", location));
			}
			finally
			{
				model.endUpdate();
			}
		}

		return cells;
	}

	protected mxGraphView createGraphView()
	{
	  return new mxGraphView(this)
	  {
	    public mxPoint getPoint(mxCellState state,
	        mxGeometry geometry)
	    {
	      double x = state.getCenterX();
	      double y = state.getCenterY();
	      if (state.getAbsolutePointCount() == 3)
	      {
	        mxPoint mid = state.getAbsolutePoint(1);
	        x = mid.getX();
	        y = mid.getY();
	      }

	      return new mxPoint(x, y);
	    }
	  };
	}
*/
}



