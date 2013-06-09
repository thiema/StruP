package easyflow.custom.jgraphx.editor;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.mxgraph.analysis.mxConstantCostFunction;
import com.mxgraph.analysis.mxGraphAnalysis;
import com.mxgraph.canvas.mxICanvas;
import com.mxgraph.canvas.mxImageCanvas;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxICell;
import com.mxgraph.util.mxPoint;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraph.mxICellVisitor;


import easyflow.core.CoreFactory;
import easyflow.core.GroupingCriterion;
import easyflow.core.Task;
import easyflow.core.TraversalChunk;
import easyflow.core.TraversalEvent;

import easyflow.custom.util.XMLUtil;
import easyflow.sequencing.MetaData;

/**
 * A graph that creates new edges from a given template edge.
 */
public class EasyFlowGraph extends mxGraph
{
	/**
	 * task map to quickly retrieve the task associated to a node (using its unique name as a string)
	 * 	also it circumvents to xml serialize/deserialize the task object, which is currently
	 * 	not properly implemented.
	 * Might improve performance
	
	protected EMap<String, Task> tasks=new BasicEMap<String, Task>();
	public EMap<String, Task> getTasks() {
		return tasks;
	}
	public void setTasks(EMap<String, Task> tasks) {
		this.tasks = tasks;
	}
	*/ 
	/**
	 * mxcell map to retrieve mxcell by tasks name/unique string or any string
	 
	protected EMap<String, mxICell> cells=new BasicEMap<String, mxICell>();
	public EMap<String, mxICell> getCells() {
		return cells;
	}
	public void setCells(EMap<String, mxICell> cells) {
		this.cells = cells;
	}
*/
	
	
	protected static final Logger logger = Logger.getLogger(EasyFlowGraph.class);
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
	public EasyFlowGraph()
	{
		
		setAlternateEdgeStyle("edgeStyle=mxEdgeStyle.ElbowConnector;elbow=vertical");
		new mxGraph();
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

	/*
	 *custom label 
	 */
	public String getLabel(Object cell) {
		if (cell instanceof mxCell)
		{
			Object value = ((mxCell) cell).getValue();
			if (value instanceof Element)
			{
				
				Element elt = (Element) value;
				//logger.debug("getLabel(): elements first child="+elt.getFirstChild());
				if (elt.getFirstChild() == null && elt.getLocalName().equalsIgnoreCase("Task"))
				{
					
					return elt.getAttributes().getNamedItem("name").getNodeValue();
				}
				else if (! elt.getFirstChild().getLocalName().equalsIgnoreCase("Task"))
				{
					String label = elt.getFirstChild().getAttributes().getNamedItem("name").getNodeValue();
					//logger.debug(label);
					return label;
				}
			}
		}
		return null;
	}
	/*
	// Overrides method to disallow edge label editing
	public boolean isCellEditable(Object cell)
	{
		return !getModel().isEdge(cell);
	}
	*/

	public String convertValueToString(Object cell)
	{
		if (cell instanceof mxCell)
		{
			Object value = ((mxCell) cell).getValue();

			if (value instanceof Element)
			{
				Element elt = (Element) value;
				
				if (elt.getFirstChild().getLocalName().equalsIgnoreCase("Task"))
				{
					String label = elt.getFirstChild().getAttributes().getNamedItem("name").getNodeValue();
					//logger.debug(label);
					return label;
				}
			}
		}

		return super.convertValueToString(cell);
	}
	
	// Overrides method to store a cell label in the model
	public void cellLabelChanged(Object cell, Object newValue,
			boolean autoSize)
	{
		if (cell instanceof mxCell && newValue != null)
		{
			Object value = ((mxCell) cell).getValue();

			if (value instanceof Node)
			{
				String label = newValue.toString();
				Element elt = (Element) value;
				if (elt.getFirstChild().getLocalName().equalsIgnoreCase("Task"))
				//if (elt.getTagName().equalsIgnoreCase(EasyflowPackage.eNS_PREFIX+":Task"))
				{
					// Clones the value for correct undo/redo
					elt = (Element) elt.cloneNode(true);

					elt.setAttribute("name", label);

					newValue = elt;
				}
			}
		}

		super.cellLabelChanged(cell, newValue, autoSize);
	}
	
	public void drawState(mxICanvas canvas, mxCellState state,
			boolean drawLabel)
	{
		String label = (drawLabel) ? state.getLabel() : "";

		// Indirection for wrapped swing canvas inside image canvas (used for creating
		// the preview image when cells are dragged)
		if (getModel().isVertex(state.getCell())
				&& canvas instanceof mxImageCanvas
				&& ((mxImageCanvas) canvas).getGraphicsCanvas() instanceof EasyFlowCanvas)
		{
			((EasyFlowCanvas) ((mxImageCanvas) canvas).getGraphicsCanvas())
					.drawVertex(state, label);
		}
		// Redirection of drawing vertices in SwingCanvas
		else if (getModel().isVertex(state.getCell())
				&& canvas instanceof EasyFlowCanvas)
		{
			((EasyFlowCanvas) canvas).drawVertex(state, label);
		}
		else
		{
			super.drawState(canvas, state, drawLabel);
		}
	}
	final int maxEdges=100;
	final double defaultWidth=200;
	final double defaultHight=40;
	
	
	public Object insertVertexEasyFlow(Object parent, String id, Task task) {
		if (parent==null) parent=getDefaultParent();
		return insertVertex(parent, id, XMLUtil.getElement(task), 400, 100, defaultWidth, defaultHight);
	}
	public Object insertVertexEasyFlow(Object parent, String id, Object value) {
		if (parent==null) parent=getDefaultParent();
		return insertVertex(parent, id, value, 400, 100, defaultWidth, defaultHight);
	}
	public Object insertVertexEasyFlow(Object parent, String id, mxCell vertex) {
		if (parent==null) parent=getDefaultParent();
		return insertVertex(parent, id, vertex.getValue(), 400, 100, defaultWidth, defaultHight);
	}
	public Object insertEdgeEasyFlow(Object parent, String id, Object source, Object target) {
		if (parent==null) parent=getDefaultParent();
		return insertEdge(parent, id, "", source, target);
	}
	public Object removeGraph(Object cell) {
		return removeCells(getVertices(cell).toArray());
	}

	public Object removeFromGraph(Object cell) {
		removeCells(getChildVertices(cell));
		removeCells(getChildCells(cell, true, true));
		return removeCells(new Object[]{cell});
	}

	
	public Object[] getShortestPath(Object source, Object target) {
        return mxGraphAnalysis.getInstance().
        		getShortestPath(this, source, target,  
        				new mxConstantCostFunction(1),
        				maxEdges, true);
	}
	
	/*
	 * get all vertices
	 */
	public EList<Object> getVertices(Object source) {
		final EList<Object> cells=new BasicEList<Object>();
		if (source==null) source=getDefaultParent();
		traverse(source, true, new mxICellVisitor() {
			
			@Override
			public boolean visit(Object arg0, Object arg1) {
				cells.add(arg0);
				return true;
			}
		});
		return cells;
	}
	
	
	public void traverseAllPaths(Object vertex, boolean directed,
			mxICellVisitor visitor, Object edge) {
		
		if (vertex != null && visitor != null) {
			if (visitor.visit(vertex, edge)) {
				int edgeCount = model.getEdgeCount(vertex);
				if (edgeCount > 0) {
					for (int i = 0; i < edgeCount; i++) {
						Object e = model.getEdgeAt(vertex, i);
						boolean isSource = model.getTerminal(e, true) == vertex;
						if (!directed || isSource) {
							Object next = model.getTerminal(e, !isSource);
							traverseAllPaths(next, directed, visitor, e);
						}
					}
				}
			}
		}
	}

	public void somethingUseful() {
		//get all cells even invisibles
		mxGraphModel.getChildCells(getModel(), getDefaultParent(), true, true);
		//get all cells
		getChildVertices(getDefaultParent());
		
	}
	
	/*
	public void removeInactiveTasks(mxCell root) {

		for (Object vertex:getVertices(root)) {
			Task curTask=XMLUtil.loadTaskFromVertex(vertex);
			if (!curTask.isActive()) {
				mxCell curCell=getCells().get(curTask.getUniqueString());
				//remove the master cell and possibly its in/outgoing edge
				if (getIncomingEdges(curCell).length>0)
					remove(getIncomingEdges(curCell));
				remove(curCell);			

				if (getOutgoingEdges(curCell).length>0)
					remove(getOutgoingEdges(curCell));
			}
		}

	}
	
	public void markInactiveTasks(final mxCell root) {
		mxICellVisitor visitor=new mxICellVisitor(){

			@Override
			public boolean visit(Object vertex1, Object edge1) {
				Task curTask=XMLUtil.loadTaskFromVertex(vertex1);
				if (getOutgoingEdges((mxCell) vertex1).length==0 && !root.equals(vertex1)) return true;
				if (curTask.getPreviousTaskString()==null) {
					curTask.setActive(false);
					return true;
				}
				Task sybTask=getTasks().get(curTask.getPreviousTaskString());
				mxCell sybCell=getCells().get(curTask.getPreviousTaskString());				
				logger.debug(curTask.getUniqueString()+" "
						+curTask.getPreviousTaskString()
						+" ("+(sybTask!=null?sybTask.getUniqueString():null)+" "+(sybCell!=null?sybCell.getValue():null)+")");
				//remove the master cell and possibly its in/outgoing edge
				//if (getIncomingEdges(sybCell).length>0)
					//remove(getIncomingEdges(sybCell));
				//remove(sybCell);
				
				sybTask.setActive(false);
				//if (getOutgoingEdges(sybCell).length>0)
					//remove(getOutgoingEdges(sybCell));
				//o=((mxCell)o).getTerminal(true);
				
				return true;
			}
		};
		//traverse_custom1(root, true, visitor, null);
		traverse(root, true, visitor);
	}
	*/
	
	public void printGraph(mxCell root) {
		mxICellVisitor visitor=new mxICellVisitor(){

			/**
			 * 
			 */
			@Override
			public boolean visit(Object vertex1, Object edge1) {
				
				Task curTask=XMLUtil.loadTaskFromVertex(vertex1);
				System.out.print("\n"+(curTask.getUniqueString())+" "+curTask.getTraversalEvents().keySet());
				/*for (TraversalEvent te:curTask.getTraversalEvents().values()) {
					if (!te.isProcessed()) {
						System.out.print(te.getTraversalCriterion().getId()
								+" "+te.getSplitTask().getUniqueString());
						//te.setSplitTask(curTask);
					}
				}*/
				return true;
			}
		};
		traverse(root, true, visitor);
	}
	
/*		
	public void insertRoot(mxCell vertex, Object[] parents, 
			TraversalEvent traversalEvent, TraversalChunk traversalChunk, boolean fixParent
			) {
		
		//the root cell: connect cell to all incoming cells of the 'master sybling'
		//logger.debug("2. "+"insertEdge (parent): "+XMLUtil.loadTaskFromVertex(vertex).getUniqueString());
		
		for (Object o:parents) {
			Task parentTask=null;
			if (fixParent) {
				parentTask=XMLUtil.loadTaskFromVertex(o);
			} else {
				o=((mxCell)o).getTerminal(true);
				parentTask=XMLUtil.loadTaskFromVertex(o);
			}

			//logger.debug(parentTask.getUniqueString()+" "+parentTask.getChunks());
			if (traversalEvent.isParent(parentTask, traversalChunk.getName())) {
				//if (insertVertex) insertVertexEasyFlow(null, null, o);
				insertEdgeEasyFlow(null, null, o, vertex);
				//logger.debug("insertEdge (Root):"+parentTask.getUniqueString()+"=>"+
						//XMLUtil.loadTaskFromVertex(vertex).getUniqueString());
			} 
		}
	}
	
	
	public void insertLeaf(mxICell vertex, mxICell vertex1) {
		//logger.debug(XMLUtil.loadTaskFromVertex(vertex)+" "+vertex);
		
		for (Object o:getOutgoingEdges(vertex1)) {
					o=((mxCell)o).getTerminal(false);
					insertEdgeEasyFlow(null, null, vertex, o);
					//logger.debug("3 insertEdge (merge):"+XMLUtil.loadTaskFromVertex(vertex).getUniqueString()+"=>"+
						//	XMLUtil.loadTaskFromVertex(o).getUniqueString());
		}
		//logger.debug("######\n\n");
	}
	*/
	
	/*
	public void traverseToResolveNextTraversalEvent(mxCell root) {
		final Map<String, Object> propMap=new HashMap<String, Object>();
		//flags if the current task is the last task in the path
		propMap.put("traversalEvent", null);
		
		mxICellVisitor visitor=new mxICellVisitor() {
			@Override
			public boolean visit(Object arg0, Object arg1) {

				//set the current task
				Task task=XMLUtil.loadTaskFromVertex(arg0);
				task=getTasks().get(task.getUniqueString());
				//set the parent task
				Task parentTask=null;
				String parent=null;
				if (arg1!=null) {
					parentTask=XMLUtil.loadTaskFromVertex(getView().getVisibleTerminal(arg1, true));
					parentTask=getTasks().get(parentTask.getUniqueString());
					parent=parentTask.getUniqueString();
				}
				for (String traversalEvent:task.getTraversalEvents().keySet()) {
					
				}
				return true;
			}
		};
		traverseAllPaths(root, true, visitor, null);
	}*/
	
	
	/**
	 * <!-- begin-user-doc -->
	 * test for iterative breadth first graph traversal
	 * <!-- end-user-doc -->
	 */
	/*
	public void traverse_iterativeBreadthFirstSearch(mxICell parent) {
		//EasyFlowGraph graph=new EasyFlowGraph();

		
		// clear marker set
		Set<mxICell> visitedSet = new HashSet<mxICell>();

        // create a queue Q
        List<mxICell> queue = new ArrayList<mxICell>();

        // enqueue v onto Q
        queue.add(parent);

        // mark v
        visitedSet.add(parent);
        
        // while Q is not empty:
        while (!queue.isEmpty()) {

            // t <- Q.dequeue()
            mxICell cell = queue.get(0);
            queue.remove(cell);

        	//'cast' to task
        	Task sourceTask=XMLUtil.loadTaskFromElement((Element) cell.getValue());
        	sourceTask=getTasks().get(sourceTask.getUniqueString());
            //Object newSource=graph.insertVertex(parent, null, cell.getValue(), 400, 100, 100, 30);
            
            // for all edges e in G.incidentEdges(t) do
            Object[] edges = getOutgoingEdges(cell);
        	logger.debug("visiting: " + sourceTask.getUniqueString()+" "+getVertices(cell).size()+" ");
        	//logger.debug(sourceTask+" ");
        	//logger.debug(getTasks().get(sourceTask.getUniqueString()));
            for (Object edge : edges) {
            	// o <- G.opposite(t,e)
                // get node from edge
                mxICell target = (mxICell) getView().getVisibleTerminal(edge, false);
            	
                Task targetTask=XMLUtil.loadTaskFromElement((Element) target.getValue());
                targetTask=getTasks().get(targetTask.getUniqueString());
	            // if o is not marked:
	            if (!visitedSet.contains(target)) {
	            	//'cast' to task
	            	
	                    // mark o
	                	visitedSet.add(target);
	                    // enqueue o onto Q
	                    queue.add(target);
	                    //logger.debug(sourceTask.getUniqueString()+"=>"+targetTask.getUniqueString());
	            } else {
	            	//graph.insertEdge(parent, null, "", source, target);
	                //if (visitor.visit(cell, target)) {	                		
	                //}
	            	logger.debug(sourceTask.getUniqueString()+"=>"+targetTask.getUniqueString()+" (skipped)");
	            }
	            for (TraversalEvent traversalEvent:sourceTask.getTraversalEvents().values()) {
	            	System.out.print(
	            			traversalEvent.getTraversalCriterion().getId()+" "
	            					+traversalEvent.getType());

	            		System.out.print(" "
	            				+((traversalEvent.getParentTask()!=null)?traversalEvent.getParentTask().getName():null)+"=>"
	            				+((traversalEvent.getSplitTask()!=null)?traversalEvent.getSplitTask().getName():null)+"=>"
	            				+traversalEvent.getMergeTask().size()+" ("
	            			);
	            		for (Task tmp:traversalEvent.getMergeTask()) System.out.print(tmp.getUniqueString()+" ");
	            	System.out.println(")");
	            }
	            if (getOutgoingEdges(target).length==0) {
	            	for (TraversalEvent traversalEvent:targetTask.getTraversalEvents().values()) {
		            	System.out.print(
		            			traversalEvent.getTraversalCriterion().getId()+" "
		            					+traversalEvent.getType());

		            	System.out.print(" "
		            				+((traversalEvent.getParentTask()!=null)?traversalEvent.getParentTask().getName():null)+"=>"
		            				+((traversalEvent.getSplitTask()!=null)?traversalEvent.getSplitTask().getName():null)+"=>"
		            				+traversalEvent.getMergeTask().size()+" "
		            			);
		            	System.out.println();
	            	}
	            }
            }
        }
	}

*/
	
	public void traverseTopologicalOrder(mxICell root, mxICellVisitor visitor)
	{
		EMap<mxICell, mxICell> edgeMap = new BasicEMap<mxICell, mxICell>();
		traverse_topologicalOrder(traverse_topologicalOrder(root, edgeMap), visitor, edgeMap);
	}
	
	private void traverse_topologicalOrder(EList<mxICell> cells, mxICellVisitor visitor, EMap<mxICell, mxICell> edgeMap)
	{
		for (mxICell cell : cells)
			if (edgeMap == null)
				visitor.visit(cell, null);
				//if (!visitor.visit(cell, null))
					//break;
			else
				visitor.visit(cell, edgeMap.get(cell));
				//if (!visitor.visit(cell, edgeMap.get(cell)))
					//break;
	}
	
	private EList<mxICell> traverse_topologicalOrder(mxICell parent, EMap<mxICell, mxICell> edgeMap) {
		EList<mxICell> sortedList=new BasicEList<mxICell>();
		// clear marker set
		HashSet<mxICell> visitedSet = new HashSet<mxICell>();

		visit_topologicalOrder(parent, sortedList, visitedSet, edgeMap, null);
		Collections.reverse(sortedList);
		return sortedList;
	}
	
	
	private void visit_topologicalOrder(mxICell vertex, EList<mxICell> sortedList, 
			HashSet<mxICell> visitedSet, EMap<mxICell, mxICell> edgeMap, mxICell edge1) {
		if (!visitedSet.contains(vertex)) {
			visitedSet.add(vertex);
			for (Object edge : getOutgoingEdges(vertex)) {			
				visit_topologicalOrder((mxICell) getView().getVisibleTerminal(edge, false), 
						sortedList, visitedSet, edgeMap, (mxICell)edge);
			}
			edgeMap.put(vertex, edge1);
			sortedList.add(vertex);
			//logger.debug(XMLUtil.loadTaskFromVertex(parent).getUniqueString());
		}
	}
	
	
	public Object[] getShortestPath(mxICell source, mxICell target) {
		return mxGraphAnalysis.getInstance().
				getShortestPath(
						this, source, target, 
						new mxConstantCostFunction(1),
						maxEdges, true);
	}

}