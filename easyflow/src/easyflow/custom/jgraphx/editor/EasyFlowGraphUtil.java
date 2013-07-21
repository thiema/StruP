package easyflow.custom.jgraphx.editor;

import java.util.Collections;
import java.util.HashSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.w3c.dom.Element;

import com.mxgraph.analysis.mxConstantCostFunction;
import com.mxgraph.analysis.mxGraphAnalysis;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxICell;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraph.mxICellVisitor;

import easyflow.core.Task;
import easyflow.custom.util.XMLUtil;

public class EasyFlowGraphUtil extends mxGraph
{
	
	final int maxEdges=100;
	final double defaultWidth=200;
	final double defaultHight=40;	
	
	public boolean isConnected(Object source, Object target)
	{
		if (getEdgesBetween(source, target).length > 0)
			return true;
		else
			return false;

	}
		
	
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