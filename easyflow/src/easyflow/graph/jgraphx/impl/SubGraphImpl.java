/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import easyflow.core.CoreFactory;
import easyflow.core.Task;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.graph.jgraphx.Graph;
import easyflow.data.DataLink;
import easyflow.graph.impl.DefaultGraphImpl;
import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.SubGraph;
import easyflow.graph.jgraphx.Subgraph;
import easyflow.traversal.TraversalEvent;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.custom.util.GlobalVar;
import com.mxgraph.view.mxGraph.mxICellVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subgraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.impl.SubGraphImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubGraphImpl extends DefaultGraphImpl implements SubGraph {
	
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;
	private static Logger logger = Logger.getLogger(Subgraph.class);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
		 * get subgraph that is spanned by the given traversal event.
		 * This sub graph is rooted by the splitting task and it contains all tasks
		 * that belong to paths to at least one of the merging tasks.
		 * tracked information:
		 * global:
		 *    copiedCells -> any cell (mxCell) copied using original tasks unique name as key  
		 *    flags       -> check skip "subgraph-copy" flag
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @generated not
	 */	
	public mxICell computeSubgraph(final TraversalEvent traversalEvent, final boolean isComplete) throws TaskNotFoundException 
	{
		if (traversalEvent.isGrouping())
			return computeSubgraph_Grouping(traversalEvent);
		else
			return computeSubgraph_Param(traversalEvent);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JgraphxPackage.SUB_GRAPH__GRAPH:
				if (resolve) return getGraph();
				return basicGetGraph();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JgraphxPackage.SUB_GRAPH__GRAPH:
				setGraph((Graph)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JgraphxPackage.SUB_GRAPH__GRAPH:
				setGraph((Graph)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JgraphxPackage.SUB_GRAPH__GRAPH:
				return graph != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JgraphxPackage.SUB_GRAPH___COMPUTE_SUBGRAPH__TRAVERSALEVENT_BOOLEAN:
				try {
					return computeSubgraph((TraversalEvent)arguments.get(0), (Boolean)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	public mxICell computeSubgraph_Grouping(final TraversalEvent traversalEvent) throws TaskNotFoundException 
	{
		// track all new Tasks
		final Map<String, Object> addedTasks = new HashMap<String, Object>();
		final Map<String, String> addedEdges = new HashMap<String, String>();
		final EList<mxCell>     firstNodeTmp = new BasicEList<mxCell>();

		mxICell startCell = (mxICell) GlobalVar.getCells().get(traversalEvent.getSplitTask().getUniqueString());
		
		EList<mxICell> stopCells = JGraphXUtil.getCells(traversalEvent.getMergeTask());
		logger.trace("computeSubgraph(): "+GlobalVar.getCells().size()+" "+traversalEvent.getMergeTask().size()+" "+stopCells.size()+" "+startCell);
		// get the task names and put in to List
		final List<String> targetTaskNames = new ArrayList<String>();
		for (mxICell tmpCell : stopCells) {
			//targetTaskNames.add(XMLUtil.loadTaskFromElement(
				//	(Element) tmpCell.getValue()).getUniqueString());
			targetTaskNames.add(JGraphXUtil.loadTask(tmpCell).getUniqueString());			
		}

		mxICellVisitor visitor = new mxICellVisitor() {

			/**
			 * add vertex and edge to graph stop visiting when mergeTask is
			 * reached
			 */
			@Override
			public boolean visit(Object vertex, Object edge1) {
				
				
				mxICell clonedVertex = JGraphXUtil.cloneCell((mxICell) vertex);
				// set the current task
				Task     curTask  = null;
				DataLink dataLink = null;
				boolean processTerminalEdges = false;
				try {
					curTask = JGraphXUtil.loadTask(vertex);
					if (edge1 != null)
						dataLink = JGraphXUtil.loadDataLink(edge1);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//curTask = getTasks().get(curTask.getUniqueString());
				logger.debug("computeSubgraph(): "+curTask.getUniqueString() 
						+ " ("+ curTask.getPreviousTaskStr()+")"
						+ " " + targetTaskNames
						+ " flags=" + curTask.getFlags()
						+ " alreadyProcessed=" + ((curTask.getFlags() & 0x000F) == 1)
						+ " #out="+getGraph().getGraph().getOutgoingEdges(vertex).length
						+ " #out="+getGraph().getGraph().getOutgoingEdges(clonedVertex).length
						);
				if ((curTask.getFlags() & 0x000F) == 1)
					return false;
				
				logger.trace("computeSubgraph(): "+"merge task for task "+curTask.getUniqueString()+" not reached yet");
				// test if there is a path to any of the merging tasks. if yes insert this task in to the subgraph
				// test if merging task reached
				boolean mergeTaskFound = false;
				boolean mergeTaskReached = false;
				//mxICell source = (mxICell) vertex1;
				for (Task mergeTask:traversalEvent.getMergeTask())
				{
					if (curTask.getUniqueString().equals(mergeTask.getUniqueString()))
					{
						mergeTaskReached = true;
						break;
					}
					
					mxICell target = (mxICell) GlobalVar.getCells().get(mergeTask.getUniqueString());
					logger.trace("computeSubgraph(): "+"cur task:"+curTask.getUniqueString()
								+"("+curTask.getPreviousTaskStr()+") corresponding cell:"+vertex
								+"merge task:"+mergeTask.getUniqueString()+" corresponding cell:"+target);
					
					int ps=getGraph().getGraph().getShortestPath(
							vertex, 
							target).length;
					logger.trace("computeSubgraph(): compute shortest path from "+
							curTask.getUniqueString()+" ("+GlobalVar.getCells().get(curTask.getUniqueString())+") to "
									+mergeTask.getUniqueString()+" ("+GlobalVar.getCells().get(mergeTask.getUniqueString())+")="+ps
									+ " #out="+getGraph().getGraph().getOutgoingEdges(vertex).length
									+ " #in="+getGraph().getGraph().getIncomingEdges(target).length);
					
					if (ps>0)
					{
						mergeTaskFound = true;
						break;
					}
                }
				logger.trace("computeSubgraph(): mergeTask found: "+mergeTaskFound
						+" mergeTask reached: "+mergeTaskReached
						+" offtarget: "+!curTask.getGroupingCriteria().keySet().contains(traversalEvent.getTraversalCriterion().getId()));

				// stop traversal 
				if (!curTask.getGroupingCriteria().keySet().contains(traversalEvent.getTraversalCriterion().getId()))
					return false;				
				
				Object target = null;
				
				// everything fine, insert vertex into the subgraph, unless already inserted
				if (!addedTasks.containsKey(curTask.getUniqueString())) {
					if (getGraph().getCopiedCells().containsKey(curTask.getUniqueString()))
					{
						target = getGraph().getCopiedCells().get(curTask.getUniqueString());
						logger.debug("computeSubgraph(): "+"vertex "
	                    		+ curTask.getUniqueString()+" reused");						
					}
					else
					{
						target = getGraph().getGraph().insertVertexEasyFlow(null, null, curTask);
						getGraph().getCopiedCells().put(curTask.getUniqueString(), (mxICell) target);
						logger.debug("computeSubgraph(): "+"vertex "
                    		+ curTask.getUniqueString()+" inserted");
					}
                    if (firstNodeTmp.isEmpty())
                    	firstNodeTmp.add((mxCell) target);
                    processTerminalEdges = true;
                    addedTasks.put(curTask.getUniqueString(), target);
				}
				else 
					target=addedTasks.get(curTask.getUniqueString());
				
				// the root node doesn't have an incoming edge
                if (edge1 == null)
                {
                	if (processTerminalEdges)
                		computeSubgraph_TerminalEdge(vertex, target, curTask);
                	if (traversalEvent.isGrouping())
                		return !mergeTaskReached && mergeTaskFound;
                	else
                		return !mergeTaskReached;
                }
                // prepare to insert edge (combine vertex with its parent)
                mxICell tmp = (mxICell) ((mxCell)edge1).getTerminal(true);
                Task parentTask = null;
				try {
					parentTask = JGraphXUtil.loadTask(tmp);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                //logger.debug(curTask.getUniqueString()+" "+parentTask.getUniqueString());
                
                if (!addedEdges.containsKey(parentTask.getUniqueString()) ||
                		(addedEdges.containsKey(parentTask.getUniqueString()) && 
                		!addedEdges.get(parentTask.getUniqueString()).equals(curTask.getUniqueString())))
                {
                	Object source=addedTasks.get(parentTask.getUniqueString());
                	//logger.error("no vertex found for task "+parentTask.getUniqueString());
                	logger.debug("computeSubgraph(): "
                			+"edge "+parentTask.getUniqueString()
                			+"->"+curTask.getUniqueString()+" inserted"
                			//+" ("+source+" "+target+")"
                			);
                	addedEdges.put(parentTask.getUniqueString(), curTask.getUniqueString());
                	// create new edge, use the current edge value as new value 
                	getGraph().getGraph().insertEdgeEasyFlow(null, null, source, target, 
                			((mxCell)edge1).getValue());
                }
                if (processTerminalEdges)
                	computeSubgraph_TerminalEdge(vertex, target, curTask);
                return !mergeTaskReached && mergeTaskFound;
			}
		};

		getGraph().getGraph().getModel().beginUpdate();		try		{
			getGraph().getGraph().traverseAllPaths(startCell, true, visitor, null);
			JGraphXUtil.layoutGraph();
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
		
		if (firstNodeTmp.isEmpty())
			logger.debug("computeSubgraph(): "+(firstNodeTmp.isEmpty()?"empty":"non empty")+" subgraph found.");
		else
			logger.debug("computeSubgraph(): "+(firstNodeTmp.isEmpty()?"empty":"non empty")+" subgraph found.");
		return firstNodeTmp.isEmpty() ? null : firstNodeTmp.get(0);

	}

	private void computeSubgraph_TerminalEdge(Object vertex, Object source, Task curTask)
	{
        for (Object o : getGraph().getGraph().getOutgoingEdges(vertex))
        {
        	try {
				DataLink odl = JGraphXUtil.loadDataLink(o);
				if (odl.isTerminal())
				{
					//if (!addedEdges.contains(odl.getUniqueString()))
					{
						//addedEdges.add(curTask.getUniqueString());
						
						Object i = getGraph().getGraph().insertEdgeEasyFlow(null, null, source, null, ((mxCell)o).getValue());
						logger.debug("computeSubgraph_TerminalEdge(): "
	                			+"terminal edge inserted for task="+curTask.getUniqueString()
	                			//+" "+getGraph().getOutgoingEdges(source).length
	                			);
						

					}
				}
			} catch (DataLinkNotFoundException e) {
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
        }

	}
	

	public mxICell computeSubgraph_Param(final TraversalEvent traversalEvent)
	{
		final EList<mxICell>     firstNodeTmp = new BasicEList<mxICell>();
		final Map<String, mxICell> addedTasks = new HashMap<String, mxICell>();
		final EList<String>        mergeTasks = new BasicEList<String>();
		final EList<String>        addedEdges = new BasicEList<String>();
		final Map<String, Boolean>     memMap = new HashMap<String, Boolean>();
		
		final String SPLITTING_TASK_FOUND = "splittingTaskFound";
		final String MERGE_TASK_REACHED   = "mergeTaskReached";
		//final String CUR_TASK_IS_SPLITTING_TASK = "curTaskIsSplittingTask";
		//final String TERMINAL_EDGE_REACHED= "terminalEdgeReached";
		memMap.put(SPLITTING_TASK_FOUND, false);
		//memMap.put(, false);
		memMap.put(MERGE_TASK_REACHED, false);
		//memMap.put(TERMINAL_EDGE_REACHED, false);

		
		for (Task task:traversalEvent.getMergeTask())
		{
			mergeTasks.add(task.getName());
		}

		mxICellVisitor visitor = new mxICellVisitor() {

			/**
			 * add vertex and edge to graph stop visiting when mergeTask is
			 * reached
			 */
			@Override
			public boolean visit(Object vertex, Object edgeIn) {
				
				// set the current task
				Task     parentTask = null;
				Task     task       = null;
				DataLink dataLink   = null;
				mxICell  source     = null;
				mxICell  target     = null;
				boolean processTerminalEdges = false;
				try {
						task = JGraphXUtil.loadTask(vertex);
					if (edgeIn != null)
						parentTask = JGraphXUtil.getSourceTask((mxCell) edgeIn);
					
					logger.debug("computeSubgraph_Param(): process "+(parentTask != null ? parentTask.getUniqueString():null)+"=>"+task.getUniqueString());
					
					if (task.getName().equals(traversalEvent.getSplitTask().getName()))
					{
						logger.debug("computeSubgraph_Param(): splitting task found");
						//mxICell clonedVertex = cloneCell((mxICell) vertex);
						
						memMap.put(SPLITTING_TASK_FOUND, true);
						memMap.put(MERGE_TASK_REACHED, false);
						//memMap.put(CUR_TASK_IS_SPLITTING_TASK, true);
						//use artifical root node
						if (firstNodeTmp.isEmpty())
						{
							Task rootTask = CoreFactory.eINSTANCE.createTask();
							String rootTaskString = parentTask.getUniqueString();
							parentTask = rootTask;
							rootTask.setRoot(true);
							
							rootTask.setName("root_"+traversalEvent.getTraversalCriterion().getId());
							GlobalVar.getTasks().put(rootTask.getName(), rootTask);
							mxICell tmp = (mxICell) getGraph().getGraph().insertVertexEasyFlow(null, null, rootTask);
							logger.debug("added artifical root: "+tmp);
							addedTasks.put(rootTaskString, tmp);
							firstNodeTmp.clear();
							firstNodeTmp.add(tmp);
							//addedTasks.put(task.getUniqueString(), firstNodeTmp.get(0));
						}
						source = firstNodeTmp.get(0);
					}
					else if (mergeTasks.contains(task.getName()))
					{
						logger.debug("computeSubgraph_Param(): merge task "+task.getName()+" reached.");
						memMap.put("mergeTaskReached", true);
						return false;
					}
					else if (addedTasks.containsKey(task.getUniqueString()))
					{
						//memMap.put(MERGE_TASK_REACHED, false);
						;
					}
					else if (!memMap.get(SPLITTING_TASK_FOUND))
						return true;
					
					if (!addedTasks.containsKey(task.getUniqueString()))
					{
						//mxICell clonedVertex = cloneCell((mxICell) vertex);
						target = (mxICell) getGraph().getGraph().insertVertexEasyFlow(null, null, task);
						logger.debug("computeSubgraph_Param(): added task="+task.getUniqueString()+" "+target);
						addedTasks.put(task.getUniqueString(), target);
						processTerminalEdges = true;
					}
					else
						target = addedTasks.get(task.getUniqueString());
					

					if (edgeIn == null)
					{
						if (processTerminalEdges)
							computeSubgraph_TerminalEdge(vertex, target, task);
						return true;
					}
					logger.debug("computeSubgraph_Param(): added tasks="+addedTasks.keySet());
					if (source == null)
					{
						source = (mxICell) addedTasks.get(parentTask.getUniqueString());
					}
					
					dataLink = JGraphXUtil.loadDataLink(edgeIn);
					dataLink.setParamNameStr(traversalEvent.getTraversalCriterion().getName());
					dataLink.setProcessed(false);
					
					String debugTask = "RmDup";
					if (task.getName().equals(debugTask))
						logger.debug("debugging task="+debugTask);

					
					String uniqueDataLink = dataLink.getUniqueString()
							+"_"+(parentTask==null ? "root":parentTask.getUniqueString())
							+"_"+task.getUniqueString()+"_"+easyflow.custom.util.Util.list2String(dataLink.getChunks().get(dataLink.getParentGroupingStr()), null);
					logger.debug("computeSubgraph_Param(): "+dataLink.getUniqueString()+" "+dataLink.getUniqueString(true)+" addedEdges: size="+addedEdges.size());
					if (addedEdges.contains(uniqueDataLink))
						return true;
					//insert edge
					logger.debug("computeSubgraph_Param(): "
                			+"edge "+(parentTask == null ? "root":parentTask.getUniqueString())
                			+"->"+task.getUniqueString()+" inserted"
                			+" ("+source+" "+target+")");
					getGraph().getGraph().insertEdgeEasyFlow(null, null, source, target, 
	            			((mxCell)edgeIn).getValue());
					if (processTerminalEdges)
						computeSubgraph_TerminalEdge(vertex, target, task);
					
					addedEdges.add(uniqueDataLink);
					logger.debug("computeSubgraph_Param(): =====");
				
					
				} catch (TaskNotFoundException e) {
					// TODO Automatisch generierter Erfassungsblock
					e.printStackTrace();
				} catch (DataLinkNotFoundException e)
				{
					e.printStackTrace();
				}
				
				return true;
			}
		};
		
		getGraph().getGraph().getModel().beginUpdate();		try		{
			getGraph().getGraph().traverseAllPaths(getGraph().getDefaultRootCell(), true, visitor, null);
			//getGraph().traverseTopologicalOrder(getDefaultRootCell(), visitor);
			JGraphXUtil.layoutGraph();
			}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
		
		return firstNodeTmp.isEmpty() ? null : firstNodeTmp.get(0);
	}
	
	/*
	public mxICell computeSubgraph_Param1(final TraversalEvent traversalEvent)
	{
		// store the artifical root node (index 0) and the the first node after the splitting task 
		// of the current subgraph path
		final EList<mxICell>     firstNodeTmp = new BasicEList<mxICell>();
		final Map<String, mxICell> addedTasks = new HashMap<String, mxICell>();
		final EList<String>        mergeTasks = new BasicEList<String>();
		final EList<String>        addedEdges = new BasicEList<String>();
		final Map<String, Boolean>     memMap = new HashMap<String, Boolean>();
		memMap.put("splittingTaskFound", false);
		memMap.put("curTaskIsSplittingTask", false);
		memMap.put("mergeTaskReached", false);
		memMap.put("terminalEdgeReached", false);
		
		for (Task task:traversalEvent.getMergeTask())
		{
			mergeTasks.add(task.getName());
		}

		mxICellVisitor visitor = new mxICellVisitor() {

			@Override
			public boolean visit(Object vertex, Object edgeIn) {
				
				// set the current task
				Task     parentTask = null;
				Task     task       = null;
				DataLink dataLink   = null;
				mxICell  source     = null;
				mxICell  target     = null;
				try {
					task = loadTask(vertex);
					if (edgeIn != null)
						parentTask = getSourceTask((mxCell) edgeIn);
					
					logger.debug("process "+(parentTask != null ? parentTask.getUniqueString():null)+"=>"+task.getUniqueString());
					if (task.getName().equals(traversalEvent.getSplitTask().getName()))
					{
						logger.debug("splitting task found");
						//mxICell clonedVertex = cloneCell((mxICell) vertex);
						
						memMap.put("splittingTaskFound", true);
						memMap.put("curTaskIsSplittingTask", true);
						memMap.put("mergeTaskReached", false);
						memMap.put("terminalEdgeReached", false);
						//use artifical root node
						if (firstNodeTmp.isEmpty())
						{
							Task rootTask = CoreFactory.eINSTANCE.createTask();
							parentTask = rootTask;
							rootTask.setRoot(true);
							
							rootTask.setName("root_"+traversalEvent.getTraversalCriterion().getId());
							getTasks().put(rootTask.getName(), rootTask);
							mxICell tmp = (mxICell) getGraph().insertVertexEasyFlow(null, null, rootTask);
							logger.debug("added artifical root: "+tmp);
							firstNodeTmp.clear();
							firstNodeTmp.add(tmp);
							//addedTasks.put(task.getUniqueString(), firstNodeTmp.get(0));
						}
						source = firstNodeTmp.get(0);
					}
					else if (addedTasks.containsKey(task.getUniqueString()))
					{
						memMap.put("splittingTaskFound", true);
						memMap.put("mergeTaskReached", false);
						memMap.put("terminalEdgeReached", false);

					}
					else if (!memMap.get("splittingTaskFound"))
						return true;
					
					if (!addedTasks.containsKey(task.getUniqueString()))
					{
						//mxICell clonedVertex = cloneCell((mxICell) vertex);
						target = (mxICell) getGraph().insertVertexEasyFlow(null, null, task);
						logger.debug("added task="+task.getUniqueString()+" "+target);
						addedTasks.put(task.getUniqueString(), target);
					}
					else
						target = addedTasks.get(task.getUniqueString());
					
					if (edgeIn == null)
					{
						computeSubgraph_TerminalEdge(vertex, target, task, null);
						return true;
					}
					//for (Object edge : getGraph().getIncomingEdges(vertex))
					Object edge = edgeIn;
					{
					if (source == null)
					{
						source = (mxICell) addedTasks.get(parentTask.getUniqueString());
					}
					if (memMap.get("curTaskIsSplittingTask"))
					{
						memMap.put("curTaskIsSplittingTask", false);
						firstNodeTmp.add(1, (mxICell) vertex);
					}
					Object os[] = getGraph().getOutgoingEdges(vertex);
					if (os.length == 0)
					{
						memMap.put("terminalEdgeReached", true);
						
					}
					else
					for (Object o:os)
					{
						DataLink odl = loadDataLink(o);
						if (odl.isTerminal())
							memMap.put("terminalEdgeReached", true);
					}
					if (memMap.get("terminalEdgeReached"))
						logger.debug("terminal edge reached.");
					
					dataLink = loadDataLink(edge);
					dataLink.setProcessed(false);
					String uniqueDataLink = dataLink.getUniqueString()
							+"_"+(parentTask==null ? "root":parentTask.getUniqueString())
							+"_"+task.getUniqueString();
					logger.debug("computeSubgraph_Param(): "+dataLink.getUniqueString()+" "+dataLink.getUniqueString(true));
					if (addedEdges.contains(uniqueDataLink))
						return true;
					
					//insert edge
					logger.debug("computeSubgraph_Param(): "
                			+"edge "+(parentTask == null ? "root":parentTask.getUniqueString())
                			+"->"+task.getUniqueString()+" inserted"
                			+" ("+source+" "+target+")");
					getGraph().insertEdgeEasyFlow(null, null, source, target, 
	            			((mxCell)edge).getValue());
					computeSubgraph_TerminalEdge(vertex, target, task, null);
					
					addedEdges.add(uniqueDataLink);
					}
					if (mergeTasks.contains(task.getName()))
					{
						logger.debug("computeSubgraph_Param(): merge task "+task.getName()+" reached.");
						memMap.put("mergeTaskReached", true);
						return false;
					}
					logger.debug("mergeTaskReached="+memMap.get("mergeTaskReached")
							+" splittingTaskFound="+memMap.get("splittingTaskFound")
							+" terminalEdgeReached="+memMap.get("terminalEdgeReached")
							+" curTaskIsSplittingTask="+memMap.get("curTaskIsSplittingTask"));
					if (!memMap.get("mergeTaskReached") 
							&& memMap.get("splittingTaskFound") 
							&& memMap.get("terminalEdgeReached"))
					{
						getGraph().removeGraph(firstNodeTmp.get(1));
						firstNodeTmp.clear();
					}
					
					return true;
					
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (DataLinkNotFoundException e) {			e.printStackTrace();}
				
				if (!memMap.get("mergeTaskReached") 
						&& memMap.get("splittingTaskFound") 
						&& memMap.get("terminalEdgeReached"))
				{
					getGraph().removeGraph(firstNodeTmp.get(1));
					firstNodeTmp.clear();
				}
				
				return true;
			}
		};
		graph.getModel().beginUpdate();		try		{
			getGraph().traverseAllPaths(getDefaultRootCell(), true, visitor, null);
			//getGraph().traverseTopologicalOrder(getDefaultRootCell(), visitor);
			layoutGraph();
			}		finally		{			graph.getModel().endUpdate();		}
		
		return firstNodeTmp.isEmpty() ? null : firstNodeTmp.get(0);
	}
	*/

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JgraphxPackage.Literals.SUB_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getGraph() {
		if (graph != null && graph.eIsProxy()) {
			InternalEObject oldGraph = (InternalEObject)graph;
			graph = (Graph)eResolveProxy(oldGraph);
			if (graph != oldGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.SUB_GRAPH__GRAPH, oldGraph, graph));
			}
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(Graph newGraph) {
		Graph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.SUB_GRAPH__GRAPH, oldGraph, graph));
	}

} //SubgraphImpl
