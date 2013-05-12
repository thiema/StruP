/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;

import easyflow.EasyflowFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultMetaData;
import com.mxgraph.view.mxGraph.mxICellVisitor;

import easyflow.core.CoreFactory;
import easyflow.core.GroupingInstance;
import easyflow.core.Task;
import easyflow.core.TraversalChunk;
import easyflow.core.TraversalEvent;
import easyflow.core.impl.StringToGraphCellMapImpl;
import easyflow.core.impl.StringToStringMapImpl;
import easyflow.core.impl.StringToTaskMapImpl;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.core.Workflow;
import easyflow.custom.util.XMLUtil;

import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.Util;

import java.util.Collection;
import easyflow.sequencing.MetaData;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Util</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getDepricatedTasks <em>Depricated Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getMostProcessedTasks <em>Most Processed Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getMetaData <em>Meta Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UtilImpl extends EObjectImpl implements Util {
	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Util.class);
	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */

	protected Logger logger = LOGGER_EDEFAULT;
	/**
	 * The default value of the '{@link #getGraph() <em>Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated not
	 * @ordered
	 */
	protected static final EasyFlowGraph GRAPH_EDEFAULT = new EasyFlowGraph();
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowGraph graph = GRAPH_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Task> tasks;
	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, mxICell> cells;
	/**
	 * The cached value of the '{@link #getDepricatedTasks() <em>Depricated Tasks</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepricatedTasks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> depricatedTasks;
	/**
	 * The cached value of the '{@link #getMostProcessedTasks() <em>Most Processed Tasks</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMostProcessedTasks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> mostProcessedTasks;
	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected DefaultMetaData metaData;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JgraphxPackage.Literals.UTIL;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowGraph getGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(EasyFlowGraph newGraph) {
		EasyFlowGraph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.UTIL__GRAPH, oldGraph, graph));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Task> getTasks() {
		if (tasks == null) {
			tasks = new EcoreEMap<String,Task>(CorePackage.Literals.STRING_TO_TASK_MAP, StringToTaskMapImpl.class, this, JgraphxPackage.UTIL__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, mxICell> getCells() {
		if (cells == null) {
			cells = new EcoreEMap<String,mxICell>(CorePackage.Literals.STRING_TO_GRAPH_CELL_MAP, StringToGraphCellMapImpl.class, this, JgraphxPackage.UTIL__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getDepricatedTasks() {
		if (depricatedTasks == null) {
			depricatedTasks = new EcoreEMap<String,String>(CorePackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__DEPRICATED_TASKS);
		}
		return depricatedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getMostProcessedTasks() {
		if (mostProcessedTasks == null) {
			mostProcessedTasks = new EcoreEMap<String,String>(CorePackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__MOST_PROCESSED_TASKS);
		}
		return mostProcessedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultMetaData getMetaData() {
		if (metaData != null && metaData.eIsProxy()) {
			InternalEObject oldMetaData = (InternalEObject)metaData;
			metaData = (DefaultMetaData)eResolveProxy(oldMetaData);
			if (metaData != oldMetaData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.UTIL__META_DATA, oldMetaData, metaData));
			}
		}
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultMetaData basicGetMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(DefaultMetaData newMetaData) {
		DefaultMetaData oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.UTIL__META_DATA, oldMetaData, metaData));
	}

	/**
	 * task map to quickly retrieve the task associated to a node (using its unique name as a string)
	 * 	also it circumvents to xml serialize/deserialize the task object, which is currently
	 * 	not properly implemented.
	 * Might improve performance
	*/
	/**
	 * mxcell map to retrieve mxcell by tasks name/unique string or any string
	 */

	private mxICell cloneCell(mxICell cell)
	{
		mxCell vertex = null;
		try {
			return (mxCell) cell.clone();
			// logger.debug("cloned: "+vertex);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
		 * get sub graph that is spanned by the given traversal event.
		 * This sub graph is rooted by the splitting task and it contains all tasks
		 * that belong to pathes to at least one of the merging tasks.
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	
	public mxICell computeSubgraph(final TraversalEvent traversalEvent, final boolean isComplete) {
		
		mxICell startCell = getCells().get(traversalEvent.getSplitTask().getUniqueString()); 
		EList<mxICell> stopCells = getCells(traversalEvent.getMergeTask());
		logger.trace("computeSubgraph(): "+getCells().size()+" "+traversalEvent.getMergeTask().size()+" "+stopCells.size()+" "+startCell);
		// get the task names and put in to List
		final List<String> targetTaskNames = new ArrayList<String>();
		for (mxICell tmpCell : stopCells) {
			targetTaskNames.add(XMLUtil.loadTaskFromElement(
					(Element) tmpCell.getValue()).getUniqueString());
		}

		// logger.debug(XMLUtil.loadTaskFromVertex(sourceCell).getUniqueString()+" "+targetTaskNames);
		final Map<String, Object> addedTasks = new HashMap<String, Object>();
		final Map<String, String> addedEdges = new HashMap<String, String>();
		final EList<mxCell> firstNodeTmp = new BasicEList<mxCell>();

		mxICellVisitor visitor = new mxICellVisitor() {

			/**
			 * add vertex and edge to graph stop visiting when mergeTask is
			 * reached
			 */
			@Override
			public boolean visit(Object vertex1, Object edge1) {
				
				
				mxICell vertex = cloneCell((mxICell) vertex1);
				// set the current task
				Task curTask = XMLUtil.loadTaskFromVertex(vertex);
				curTask = getTasks().get(curTask.getUniqueString());
				logger.trace("computeSubgraph(): "+curTask.getUniqueString() 
						+ " " + targetTaskNames
						+ " " + isComplete);
				
				logger.trace("computeSubgraph(): "+"merge task for task "+curTask.getUniqueString()+" not reached yet");
				// test if there is a path to any of the merging tasks. if yes insert this task in to the subgraph
				// test if merging task reached
				boolean mergeTaskFound = false;
				boolean mergeTaskReached = false;
				for (Task mergeTask:traversalEvent.getMergeTask())
				{
					if (curTask.getUniqueString().equals(mergeTask.getUniqueString()))
					{
						mergeTaskReached = true;
						break;
					}
					
					mxICell source = getCells().get(curTask.getUniqueString());
					mxICell target = getCells().get(mergeTask.getUniqueString());
					if (source == null || target == null)
						logger.trace("computeSubgraph(): "+"cur task:"+curTask.getUniqueString()+" corresponding cell:"+source
								+"merge task:"+mergeTask.getUniqueString()+" corresponding cell:"+target);
					int ps=getGraph().getShortestPath(
							getCells().get(curTask.getUniqueString()), 
							getCells().get(mergeTask.getUniqueString())).length;
					if (ps>0)
					{
						mergeTaskFound = true;
						break;
					}
                }

				// stop traversal if no mergeTask exists and current task is not the merge task
				if (!mergeTaskFound && !mergeTaskReached)
					return false;
				logger.trace("computeSubgraph(): "+"path to merge task exists.");
				
				
				Object target = null;
				
				// everthing fine, insert vertex into the subgrah, if not already inserted
				if (!addedTasks.containsKey(curTask.getUniqueString())) {
                    target = getGraph().insertVertexEasyFlow(null, null, curTask);
                    logger.trace("computeSubgraph(): "+"vertex inserted");
                    if (firstNodeTmp.isEmpty()) firstNodeTmp.add((mxCell) target);
                    addedTasks.put(curTask.getUniqueString(), target);
				}
				else 
					target=addedTasks.get(curTask.getUniqueString());
				
				// insert edge (combine vertex with its parent)
				//the root node doesnt have an incoming edge
                if (edge1==null) return true;
                // parent vertex was already inserted at this point
                // insert edge
                mxICell tmp = (mxICell) ((mxCell)edge1).getTerminal(true);
                Task parentTask=XMLUtil.loadTaskFromVertex(tmp);
                //logger.debug(curTask.getUniqueString()+" "+parentTask.getUniqueString());
                
                if (!addedEdges.containsKey(parentTask.getUniqueString()) ||
                		(addedEdges.containsKey(parentTask.getUniqueString()) && 
                		!addedEdges.get(parentTask.getUniqueString()).equals(curTask.getUniqueString())))
                {
                	Object source=addedTasks.get(parentTask.getUniqueString());
                	//logger.error("no vertex found for task "+parentTask.getUniqueString());
                	logger.trace("computeSubgraph(): "+"edge "+parentTask.getUniqueString()+"->"+curTask.getUniqueString()+" inserted"
                		+" ("+source+" "+target+")");
                	addedEdges.put(parentTask.getUniqueString(), curTask.getUniqueString());
                	getGraph().insertEdgeEasyFlow(null, null, source, target);
                }
                
				return !mergeTaskReached;
				
				
			}
		};
		getGraph().traverseAllPaths(startCell, true, visitor, null);
		
		if (firstNodeTmp.isEmpty())
			logger.debug("computeSubgraph(): "+(firstNodeTmp.isEmpty()?"empty":"non empty")+" subgraph found.");
		else
			logger.trace("computeSubgraph(): "+(firstNodeTmp.isEmpty()?"empty":"non empty")+" subgraph found.");
		return firstNodeTmp.isEmpty() ? null : firstNodeTmp.get(0);

	}

	/**
	 * <!-- begin-user-doc -->
	 * enumerate all different paths and update the traversal events.
	 * the traversal events are supposed to be unmerged.
	 * Main concern is to merge all traversal events, that have a common splitting task. 
	 * This requires appropriate finding of
	 * the traversal event, and update the mergeTask reference attribute and finally remove 
	 * all obsolete traversal event (that are used to extend the parent tasks traversal event)
	 * so that only one (representing the splitting task) remains.
	 * TEs sharing same split and/or merging tasks might exist.
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveTraversalEvents(mxICell root) {
		

		// map to track all processed traversalevents: <grouping>_<mode>_<te's root> x <Traversalevent>
		final EMap<String, TraversalEvent> allTraversalEvents = new BasicEMap<String, TraversalEvent>();
		// track deprecated traversalevents : <task> x <te name>
		final EMap<String, String> deprecatedTraversalEvents = new BasicEMap<String, String>();
		
		
		mxICellVisitor visitor=new mxICellVisitor() {
			String debug="resolveTraversalEvents(): ";
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				Task task=XMLUtil.loadTaskFromVertex(vertex);
				String taskString = task.getUniqueString();
				// set vertex's parent task
				Task parentTask = null;
				if (edge != null)
					parentTask=XMLUtil.loadTaskFromVertex(getGraph().getView().getVisibleTerminal(edge, true));
				debug = "checking edge: "+
							(parentTask==null?"null":parentTask.getUniqueString())+"=>"+task.getUniqueString()+": ";
							
				String parentTaskString = parentTask != null ? parentTask.getUniqueString() : "root";
				
				// check defined TraversalEvents for task
				for (String te : task.getTraversalEvents().keySet()) {
					TraversalEvent traversalEvent=task.getTraversalEvents().get(te);
					TraversalEvent parentTraversalEvent = null;

					// set unique te string
					String te_unique=task.getTraversalEvents().get(te).getTraversalCriterion().getId()+"_"+
							task.getTraversalEvents().get(te).getTraversalCriterion().getMode();

					// get traversal event of parent
					if (parentTask != null &&
							parentTask.getTraversalEvents().keySet().contains(te) &&
							parentTask.getTraversalEvents().get(te).getTraversalCriterion().getMode().equals(
									task.getTraversalEvents().get(te).getTraversalCriterion().getMode()))
						parentTraversalEvent = parentTask.getTraversalEvents().get(te);

					// te to be extended for this particular path
					if (parentTraversalEvent != null)
					{
						debug+="(extend:";
						// maintain merge tasks
						if (parentTraversalEvent.getMergeTask().contains(parentTask))
						{
							debug+=" contains:"+parentTaskString;
							parentTraversalEvent.getMergeTask().remove(parentTask);
						}
						parentTraversalEvent.getMergeTask().add(task);
						deprecatedTraversalEvents.put(taskString, te);
						debug+=" change te for task:"+taskString+" to use te of task:"+parentTaskString;
						task.getTraversalEvents().put(te, parentTraversalEvent);
					}
					// a new te for this particular path,
					else
					{
						debug+="(new:";
						// if no parent set 
						if (parentTask == null)
						{
							debug+=" no parent ";
						}
						else
						{  
							// known at the overall graph
							if (!traversalEvent.getParentTask().contains(parentTask))
							{
								traversalEvent.getParentTask().add(parentTask);
								
							}
							else
							{
								debug+=" but known for whole graph ";
								
							}
						}
						allTraversalEvents.put(te_unique+"_"+taskString, traversalEvent);
					}
					debug+=te_unique+")";					
				}
				
				//debug+="\n";
				logger.trace(debug);
				return true;
			}
		};
		getGraph().traverseAllPaths(root, true, visitor, null);
		//getGraph().traverse(root, true, visitor);
		
		
		// remove deprecated traversal events
		for (String task: deprecatedTraversalEvents.keySet())
		{
			getTasks().get(task).getTraversalEvents().removeKey(deprecatedTraversalEvents.get(task));
			logger.debug("resolveTraversalEvents(): "+"removed traversal event "+deprecatedTraversalEvents.get(task)+" from task "+task);
		}
		
		for (String key:allTraversalEvents.keySet()) {
			//System.out.println(key+" "+traversalEventsByParent.get(key).keySet());
			
				String parentTasks="(";
				for (Task parentTask:allTraversalEvents.get(key).getParentTask()) {
					parentTasks+=parentTask.getUniqueString()+" ";
				}
				parentTasks+=")";
				String mergeTasks="(";
				for (Task mergeTask:allTraversalEvents.get(key).getMergeTask()) {
					mergeTasks+=mergeTask.getUniqueString()+" ";
				}
				mergeTasks+=")";
				TraversalEvent traversalEvent=allTraversalEvents.get(key);
				logger.debug("resolveTraversalEvents(): "+"processed traversal event "+key+" with"
						+" Parent:"+parentTasks
						+" Split:"+(traversalEvent.getSplitTask() != null ? 
								traversalEvent.getSplitTask().getUniqueString():null)
						+" Merge:"+mergeTasks+" "
						+traversalEvent.isFoundMergeTask()
						//+" "+traversalEvent
						);
		}
		return true;
	}
	
	

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printGraph(mxICell root) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	
	
	private Task createTask(Task task, String groupingStr, String instanceStr)
	{
		Task copyTask=EcoreUtil.copy(getTasks().get(task.getUniqueString()));
		copyTask.setPreviousTaskStr(task.getUniqueString());
		EList<TraversalChunk> traversalChunks = null;
		if (copyTask.getChunks().containsKey(groupingStr))
		{
			traversalChunks = copyTask.getChunks().get(groupingStr);
		}
		else
		{
			traversalChunks = new BasicEList<TraversalChunk>();
			//copyTask.getChunks().put(groupingStr, traversalChunks);
		}
		TraversalChunk traversalChunk = CoreFactory.eINSTANCE.createTraversalChunk();
		traversalChunk.setName(instanceStr);
		traversalChunk = getTraversalChunk(traversalChunks, traversalChunk);
		copyTask.getChunks().put(groupingStr, traversalChunks);
		logger.trace("createTask(): "+traversalChunks.size()+" "
				+copyTask.getChunks().get(groupingStr).size());
		return copyTask;
	}
	
	private TraversalChunk getTraversalChunk(EList<TraversalChunk> traversalChunks, 
			TraversalChunk traversalChunk)
	{
		for (TraversalChunk tc:traversalChunks)
			if (traversalChunk.getName().equals(tc.getName()))
					return traversalChunk;
		traversalChunks.add(traversalChunk);
		return traversalChunk;
	}
	
	private boolean isValidConversion(EList<TraversalChunk> traversalChunks,
			EList<GroupingInstance> groupingInstances)
	{
		for (TraversalChunk traversalChunk : traversalChunks)
			for (GroupingInstance groupingInstance : groupingInstances) {
				logger.trace("isValidConversion(): "+traversalChunk.getName()+" vs "+groupingInstance.getName());
				if (traversalChunk.getName().equals(groupingInstance.getName()))
					return true;
		}
		return false;
	}
	
	private void applySplittingCriterion(mxICell cell, mxICell parentCell, 
			String groupingStr, String instanceStr)
	{
		// setup the chunks
		Task parentTask = XMLUtil.loadTaskFromVertex((parentCell));
		Task task = XMLUtil.loadTaskFromVertex(cell);
		logger.trace("applySplittingCriterion(): test parentTask="+parentTask.getUniqueString() 
				+ "->" + XMLUtil.loadTaskFromVertex(cell).getUniqueString()
				+ " #(parents chunks)="+parentTask.getChunks().size());
		for (String parentChunkStr : parentTask.getChunks().keySet()) {

			// grouping criterion doenst change
			if (parentChunkStr.equals(groupingStr)) {
				logger.trace("applySplittingCriterion(): "+"Same grouping instance: assume already processed.");
				// for (TraversalChunk traversalChunk :
				// parentTask.getChunks().get(parentChunkStr))
				// if (instanceStr.equals(traversalChunk.getName()))
				// getGraph().insertEdgeEasyFlow(null, null, parentCell, cell);
			}

			
			for (TraversalChunk parentTraversalChunk: parentTask.getChunks().get(parentChunkStr))
			{
				String key = parentChunkStr + "_" + groupingStr + "_" + parentTraversalChunk.getName();
				logger.trace("applySplittingCriterion(): check grouping instance="+key);

				logger.trace("applySplittingCriterion(): "+getMetaData().
							getGroupingInstancesByGroup().get(key));

				if (getMetaData().getGroupingInstancesByGroup().containsKey(key))
				{
					if (isValidConversion(task.getChunks().get(groupingStr), 
							getMetaData().getGroupingInstancesByGroup().get(key).getInstances()))
					{
						logger.trace("applySplittingCriterion(): "+"insert edge.");
						// insert edge from parent cell to cell
						getGraph().insertEdgeEasyFlow(null, null, parentCell, cell);
					}
					else
						logger.trace("applySplittingCriterion(): "+"parent does not match.");

				} else {
					logger.warn("applySplittingCriterion(): "+"no grouping instances found for key:" + key);
				}
			}
		}

	}
	
	private void applyMergingCriterion(mxICell cell, mxICell previousCell, String groupingStr, String instanceStr)
	{
		logger.trace("applyMergingCriterion(): "
				+getGraph().getOutgoingEdges(cell).length+" "
				+getGraph().getVertices(cell).size());
		// get all child cells
		for (Object o:getGraph().getOutgoingEdges(previousCell))
		{
			o = getGraph().getView().getVisibleTerminal(o, false);
			//Task childTask = XMLUtil.loadTaskFromVertex(((mxICell) o));
			//logger.debug(childTask.getUniqueString()+" grouping instance "+instanceStr);
			// insert edge from cell to its child cell
			logger.trace("applyMergingCriterion(): "+"insert edge (merge with "+XMLUtil.loadTaskFromVertex(o).getUniqueString()+")");
			getGraph().insertEdgeEasyFlow(null, null, cell, o);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * apply the traversal event:
	 * go along the "template" graph defined by the parent cell
	 * and create a new cell for each chunk that is defined 
	 * for associated traversal event and integrate it into the main graph 
	 * (it can be seen as: copying the graph, one copy per chunklist)
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	
	public void applyTraversalEvent(mxICell root, final TraversalEvent traversalEvent,
			final String groupingStr, final String instanceStr) {
		
		final EMap<String, mxICell> mergeCells = new BasicEMap<String, mxICell>();
		mxICellVisitor visitor=new mxICellVisitor() {
			
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				String debug=" applied";
				Task task = XMLUtil.loadTaskFromVertex(vertex);
				String taskString = task.getUniqueString();
				logger.trace("applyTraversalEvent(): "+taskString + " #mergeTasks=" + traversalEvent.getMergeTask().size());
				debug+=" "+taskString+" #incomingTasks="+
				getGraph().getIncomingEdges(getCells().get(task.getPreviousTaskStr())).length
						+";";
				// apply the splitting criterion, i.e. check for all old parents
				// (task.getPreviousTask(), which doesn't have the te applied)
				// get all parent cells
				// logger.trace(task.getPreviousTaskStr()+" "+getCells().get(task.getPreviousTaskStr()));
				for (Object parentCell : getGraph().getIncomingEdges(
						getCells().get(task.getPreviousTaskStr()))) {
					parentCell = getGraph().getView().getVisibleTerminal(
							parentCell, true);
					applySplittingCriterion((mxICell) vertex,
							(mxICell) parentCell, groupingStr, instanceStr);
				}

				// if (traversalEvent.getMergeTask().contains(task))
				if (containsTask(traversalEvent.getMergeTask(),
						getTasks().get(task.getPreviousTaskStr())))
				{
					mergeCells.put(taskString, (mxICell) vertex);
					debug+="previousTask="+task.getPreviousTaskStr()+" marked to be merged";
				}
				logger.debug("applyTraversalEvent(): "+debug);
				return true;
			}
		};
		
		getGraph().traverse(root, true, visitor);
		

		// apply the mergingTasks
		for (String mergeTaskStr : mergeCells.keySet())
		{
			applyMergingCriterion(mergeCells.get(mergeTaskStr), 
					getCells().get(getTasks().get(mergeTaskStr).getPreviousTaskStr()), 
					groupingStr, instanceStr);
		}
		

	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public mxICell applyTraversalEventCopyGraph(mxICell root, final String groupingStr, final String instanceStr) {

		final EMap<String, String> taskPreviousTaskMap = new BasicEMap<String, String>();
		final EList<mxICell> returnCell = new BasicEList<mxICell>();
		mxICellVisitor visitor=new mxICellVisitor() {
			String debug="";
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				Task task=XMLUtil.loadTaskFromVertex(vertex);
				String taskString = task.getUniqueString();
				// in joint mode: all instances of criterion are processed jointly
				// there is only one task
				
				
				// in batch mode: create one cell with task per each instance of 
				// the grouping criterion
				
				
					
				// create the new task/cell and add it to a map with key of 
				// same task without the instance information resolved
				Task copyTask = createTask(task, groupingStr, instanceStr);
				taskPreviousTaskMap.put(taskString, copyTask.getUniqueString());
				logger.trace("applyTraversalEventCopyGraph(): "+copyTask.getUniqueString());
				// create the new cell
				mxICell cell = (mxICell) getGraph().insertVertexEasyFlow(null, null, copyTask);
				if (returnCell.isEmpty()) returnCell.add(cell);
				if (edge != null)
					getGraph().insertEdgeEasyFlow(
						null, null, 
						getCells().get(taskPreviousTaskMap.get(XMLUtil.loadTaskFromVertex(
								getGraph().getView().getVisibleTerminal(edge, true)
								).getUniqueString())),
						cell
					);
				
				getCells().put(copyTask.getUniqueString(), (mxICell) cell);
				getTasks().put(copyTask.getUniqueString(), copyTask);
				
				return true;
			}
		};
		getGraph().traverse(root, true, visitor);
		return returnCell.size()>0?returnCell.get(0):null;
	}

	
	private boolean containsTask(EList<Task> tasks, Task task)
	{
		for (Task t:tasks)
		{
			//logger.debug(t.getUniqueString()+" vs "+task.getUniqueString());
			if (task.getUniqueString().equals(t.getUniqueString()))
				return true;
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<mxICell> getCells(EList<Task> tasks) {
		final EList<mxICell> cells=new BasicEList<mxICell>();
		for (Task task:tasks)
			cells.add(getCells().get(task.getUniqueString()));
	
		return cells;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean removeSubGraph(mxICell root) {

		final EList<Object> tmpGraphCells = new BasicEList<Object>();
		final EList<Object> cells = new BasicEList<Object>();
		mxICellVisitor visitor=new mxICellVisitor()
		{
		
			@Override
			public boolean visit(Object vertex, Object edge) {
				Task task=XMLUtil.loadTaskFromVertex(vertex);
				
				tmpGraphCells.add(vertex);
				cells.add(getCells().get(task.getUniqueString()));
				return true;
			}
		};
		getGraph().traverse(root, true, visitor);

		getGraph().removeCells(cells.toArray(), true);
		
		getGraph().removeCells(tmpGraphCells.toArray(), true);
		return !tmpGraphCells.isEmpty() || !cells.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean updateTraversalEvent(TraversalEvent traversalEvent) {
		
		boolean changed = updateTaskList(traversalEvent.getParentTask());
		changed = changed || updateTaskList(traversalEvent.getMergeTask());
		if (getMostProcessedTasks().contains(traversalEvent.getSplitTask().getUniqueString()))
			if (getMostProcessedTasks().get(traversalEvent.getSplitTask().getUniqueString()).
					equals(traversalEvent.getSplitTask().getUniqueString()))
			{
				Task newTask = getTasks().get(getMostProcessedTasks().get(traversalEvent.getSplitTask().getUniqueString()));
				logger.trace("udpate split task: "+traversalEvent.getSplitTask().getUniqueString()+"->"+newTask.getUniqueString());
				traversalEvent.setSplitTask(newTask);
				changed = true;
			}
		return changed;
	}
	
	private boolean updateTaskList(EList<Task> tasks)
	{
		EMap<String, Task> tmpTaskMap = new BasicEMap<String, Task>();
		for (Task task:tasks)
			if (getMostProcessedTasks().contains(task.getName()))
				if (getMostProcessedTasks().get(task.getName()).equals(task.getUniqueString()))
					tmpTaskMap.put(task.getName(), task);
		if (!tmpTaskMap.isEmpty())
		{
			EList<Task> newTasks = new BasicEList<Task>();
			for (Task task : tasks)
				if (tmpTaskMap.containsKey(task.getUniqueString()))
					newTasks.add(tmpTaskMap.get(task.getUniqueString()));
				else
					newTasks.add(task);
			tasks = newTasks;
			logger.trace("tasks updated.");
			return true;
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * return list of Traversalevents
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<TraversalEvent> getTraversalEvents(mxICell root, final boolean isGrouping) {
		
		final EList<TraversalEvent> traversalEvents = new BasicEList<TraversalEvent>();
		mxICellVisitor visitor=new mxICellVisitor()
		{
		
			@Override
			public boolean visit(Object vertex, Object edge) {
				Task task=XMLUtil.loadTaskFromVertex(vertex);
				for (TraversalEvent traversalEvent : task.getTraversalEvents().values())
					if (traversalEvent.isGrouping() && isGrouping ||
							!traversalEvent.isGrouping() && !isGrouping)
						traversalEvents.add(traversalEvent);


				return true;
			}
		};
		getGraph().traverse(root, true, visitor);
		return traversalEvents;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<mxICell> getTraversalEvents(Task task, boolean isGrouping) {
		final EList<mxICell> cells=new BasicEList<mxICell>();
		getGraph().traverse(getTasks().get(task),
				true, new mxICellVisitor() {

			@Override
			public boolean visit(Object arg0, Object arg1) {
				mxCell vertex=(mxCell)arg0;
				mxCell edge=(mxCell)arg1;
				
				Task task=getTasks().get(XMLUtil.loadTaskFromVertex(vertex).getUniqueString());
				for (TraversalEvent traversalEvent:task.getTraversalEvents().values()) {
					if (traversalEvent.isGrouping()) {
						cells.add(vertex);
					}
				}

				return true;
			}			
				});
		return cells;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JgraphxPackage.UTIL__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.UTIL__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.UTIL__DEPRICATED_TASKS:
				return ((InternalEList<?>)getDepricatedTasks()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.UTIL__MOST_PROCESSED_TASKS:
				return ((InternalEList<?>)getMostProcessedTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}


	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JgraphxPackage.UTIL__LOGGER:
				return getLogger();
			case JgraphxPackage.UTIL__GRAPH:
				return getGraph();
			case JgraphxPackage.UTIL__TASKS:
				if (coreType) return getTasks();
				else return getTasks().map();
			case JgraphxPackage.UTIL__CELLS:
				if (coreType) return getCells();
				else return getCells().map();
			case JgraphxPackage.UTIL__DEPRICATED_TASKS:
				if (coreType) return getDepricatedTasks();
				else return getDepricatedTasks().map();
			case JgraphxPackage.UTIL__MOST_PROCESSED_TASKS:
				if (coreType) return getMostProcessedTasks();
				else return getMostProcessedTasks().map();
			case JgraphxPackage.UTIL__META_DATA:
				if (resolve) return getMetaData();
				return basicGetMetaData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JgraphxPackage.UTIL__GRAPH:
				setGraph((EasyFlowGraph)newValue);
				return;
			case JgraphxPackage.UTIL__TASKS:
				((EStructuralFeature.Setting)getTasks()).set(newValue);
				return;
			case JgraphxPackage.UTIL__CELLS:
				((EStructuralFeature.Setting)getCells()).set(newValue);
				return;
			case JgraphxPackage.UTIL__DEPRICATED_TASKS:
				((EStructuralFeature.Setting)getDepricatedTasks()).set(newValue);
				return;
			case JgraphxPackage.UTIL__MOST_PROCESSED_TASKS:
				((EStructuralFeature.Setting)getMostProcessedTasks()).set(newValue);
				return;
			case JgraphxPackage.UTIL__META_DATA:
				setMetaData((DefaultMetaData)newValue);
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
			case JgraphxPackage.UTIL__GRAPH:
				setGraph(GRAPH_EDEFAULT);
				return;
			case JgraphxPackage.UTIL__TASKS:
				getTasks().clear();
				return;
			case JgraphxPackage.UTIL__CELLS:
				getCells().clear();
				return;
			case JgraphxPackage.UTIL__DEPRICATED_TASKS:
				getDepricatedTasks().clear();
				return;
			case JgraphxPackage.UTIL__MOST_PROCESSED_TASKS:
				getMostProcessedTasks().clear();
				return;
			case JgraphxPackage.UTIL__META_DATA:
				setMetaData((DefaultMetaData)null);
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
			case JgraphxPackage.UTIL__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case JgraphxPackage.UTIL__GRAPH:
				return GRAPH_EDEFAULT == null ? graph != null : !GRAPH_EDEFAULT.equals(graph);
			case JgraphxPackage.UTIL__TASKS:
				return tasks != null && !tasks.isEmpty();
			case JgraphxPackage.UTIL__CELLS:
				return cells != null && !cells.isEmpty();
			case JgraphxPackage.UTIL__DEPRICATED_TASKS:
				return depricatedTasks != null && !depricatedTasks.isEmpty();
			case JgraphxPackage.UTIL__MOST_PROCESSED_TASKS:
				return mostProcessedTasks != null && !mostProcessedTasks.isEmpty();
			case JgraphxPackage.UTIL__META_DATA:
				return metaData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (logger: ");
		result.append(logger);
		result.append(", graph: ");
		result.append(graph);
		result.append(')');
		return result.toString();
	}

} //UtilImpl
