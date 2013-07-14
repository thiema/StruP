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

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;

import easyflow.EasyflowFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultMetaData;

import com.mxgraph.util.mxRectangle;
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

import org.apache.commons.lang.StringUtils;
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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getDefaultRootCell <em>Default Root Cell</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getProcessedEdgesCopyGraph <em>Processed Edges Copy Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getProcessedEdges <em>Processed Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getAddEdges <em>Add Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getCopiedCells <em>Copied Cells</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getCurrentSubGraphs <em>Current Sub Graphs</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getTraversalEvents <em>Traversal Events</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getNewTraversalEvents <em>New Traversal Events</em>}</li>
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
	 * The default value of the '{@link #getDefaultRootCell() <em>Default Root Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRootCell()
	 * @generated
	 * @ordered
	 */
	protected static final mxICell DEFAULT_ROOT_CELL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefaultRootCell() <em>Default Root Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRootCell()
	 * @generated
	 * @ordered
	 */
	protected mxICell defaultRootCell = DEFAULT_ROOT_CELL_EDEFAULT;
	/**
	 * The cached value of the '{@link #getProcessedEdgesCopyGraph() <em>Processed Edges Copy Graph</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessedEdgesCopyGraph()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> processedEdgesCopyGraph;
	/**
	 * The cached value of the '{@link #getProcessedEdges() <em>Processed Edges</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessedEdges()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> processedEdges;
	/**
	 * The cached value of the '{@link #getAddEdges() <em>Add Edges</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddEdges()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> addEdges;
	/**
	 * The cached value of the '{@link #getCopiedCells() <em>Copied Cells</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopiedCells()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, mxICell> copiedCells;
	/**
	 * The cached value of the '{@link #getCurrentSubGraphs() <em>Current Sub Graphs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSubGraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<mxICell> currentSubGraphs;
	/**
	 * The cached value of the '{@link #getTraversalEvents() <em>Traversal Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<TraversalEvent> traversalEvents;
	/**
	 * The cached value of the '{@link #getNewTraversalEvents() <em>New Traversal Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTraversalEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<TraversalEvent> newTraversalEvents;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mxICell getDefaultRootCell() {
		return defaultRootCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRootCell(mxICell newDefaultRootCell) {
		mxICell oldDefaultRootCell = defaultRootCell;
		defaultRootCell = newDefaultRootCell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.UTIL__DEFAULT_ROOT_CELL, oldDefaultRootCell, defaultRootCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getProcessedEdgesCopyGraph() {
		if (processedEdgesCopyGraph == null) {
			processedEdgesCopyGraph = new EcoreEMap<String,String>(CorePackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__PROCESSED_EDGES_COPY_GRAPH);
		}
		return processedEdgesCopyGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getProcessedEdges() {
		if (processedEdges == null) {
			processedEdges = new EcoreEMap<String,String>(CorePackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__PROCESSED_EDGES);
		}
		return processedEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getAddEdges() {
		if (addEdges == null) {
			addEdges = new EcoreEMap<String,String>(CorePackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__ADD_EDGES);
		}
		return addEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, mxICell> getCopiedCells() {
		if (copiedCells == null) {
			copiedCells = new EcoreEMap<String,mxICell>(CorePackage.Literals.STRING_TO_GRAPH_CELL_MAP, StringToGraphCellMapImpl.class, this, JgraphxPackage.UTIL__COPIED_CELLS);
		}
		return copiedCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<mxICell> getCurrentSubGraphs() {
		if (currentSubGraphs == null) {
			currentSubGraphs = new EDataTypeUniqueEList<mxICell>(mxICell.class, this, JgraphxPackage.UTIL__CURRENT_SUB_GRAPHS);
		}
		return currentSubGraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraversalEvent> getTraversalEvents() {
		if (traversalEvents == null) {
			traversalEvents = new EObjectResolvingEList<TraversalEvent>(TraversalEvent.class, this, JgraphxPackage.UTIL__TRAVERSAL_EVENTS);
		}
		return traversalEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraversalEvent> getNewTraversalEvents() {
		if (newTraversalEvents == null) {
			newTraversalEvents = new EObjectResolvingEList<TraversalEvent>(TraversalEvent.class, this, JgraphxPackage.UTIL__NEW_TRAVERSAL_EVENTS);
		}
		return newTraversalEvents;
	}

	public void layoutGraph()
	{
    	mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
    	layout.setIntraCellSpacing(10);
    	//layout.setOrientation(SwingConstants.NORTH);
    	layout.setFineTuning(true);
    	layout.execute(graph.getDefaultParent());

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
		final EMap<String, EList<String>> deprecatedTraversalEvents = new BasicEMap<String, EList<String>>();
		
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
				debug = (parentTask==null?"null":parentTask.getUniqueString())+"=>"+task.getUniqueString()+": ";
							
				String parentTaskString = parentTask != null ? parentTask.getUniqueString() : "root";
				
				// check defined TraversalEvents for task
				for (String te : task.getTraversalEvents().keySet()) {
					TraversalEvent traversalEvent = task.getTraversalEvents().get(te);
					TraversalEvent parentTraversalEvent = null;

					// set unique te string
					String te_unique=task.getTraversalEvents().get(te).getTraversalCriterion().getId()+"_"+
							task.getTraversalEvents().get(te).getTraversalCriterion().getMode();

					// get traversal event of parent
					if (parentTask != null &&
							parentTask.getTraversalEvents().keySet().contains(te) &&
							parentTask.getTraversalEvents().get(te).getTraversalCriterion().getMode().equals(
									task.getTraversalEvents().get(te).getTraversalCriterion().getMode()))
					{
						parentTraversalEvent = parentTask.getTraversalEvents().get(te);

					// te to be extended for this particular path
						
					//if (parentTraversalEvent != null)
					//{
						debug+="(extend:";
						// maintain merge tasks
						if (parentTraversalEvent.getMergeTask().contains(parentTask))
						{
							debug+=" remove merge task:"+parentTaskString;
							parentTraversalEvent.getMergeTask().remove(parentTask);
						}
						parentTraversalEvent.getMergeTask().add(task);
						
						EList<String> depricatedTEs = null;
						if (deprecatedTraversalEvents.containsKey(taskString))
							depricatedTEs = deprecatedTraversalEvents.get(taskString);
						else
							depricatedTEs = new BasicEList<String>();
						if (!depricatedTEs.contains(te))
							depricatedTEs.add(te);
						deprecatedTraversalEvents.put(taskString, depricatedTEs);
						debug+=" change te "+te+" of task:"+taskString+" to use te of task:"+parentTaskString;
						task.getTraversalEvents().put(te, parentTraversalEvent);
						//traversalEvent = parentTraversalEvent;
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
							/*if (!traversalEvent.getParentTask().contains(parentTask))
							{
								traversalEvent.getParentTask().add(parentTask);
								
							}
							else
							{
								debug+=" but known for whole graph ";
								
							}*/
							
							

						}
						// set the traversal events merge task
						if (!traversalEvent.getMergeTask().contains(task))
							traversalEvent.getMergeTask().add(task);
						
						allTraversalEvents.put(te_unique+"_"+taskString, traversalEvent);
					}
					debug+=" ("+te_unique+"))";					
				}
				
				//debug+="\n";
				logger.debug(debug);
				return true;
			}
		};
		
		getGraph().traverseAllPaths(root, true, visitor, null);
		//getGraph().traverse(root, true, visitor);
		
		
		// remove deprecated traversal events
		for (String task: deprecatedTraversalEvents.keySet())
		{
			for (String te : deprecatedTraversalEvents.get(task))
			{
				logger.debug("resolveTraversalEvents(): "
						+"removed traversal event "
						+((TraversalEvent)getTasks().get(task).getTraversalEvents().get(te)).hashCode()
						+" "+te+" from task "+task);
				getTasks().get(task).getTraversalEvents().removeKey(te);
			}
		}
		
		for (String key:allTraversalEvents.keySet()) {
			//System.out.println(key+" "+traversalEventsByParent.get(key).keySet());
			
				String parentTasks="("+StringUtils.join(getTaskStringList(allTraversalEvents.get(key).getParentTask()), ", ")+")";
				String mergeTasks="("+StringUtils.join(getTaskStringList(allTraversalEvents.get(key).getMergeTask()), ", ")+")";
				TraversalEvent traversalEvent=allTraversalEvents.get(key);
				logger.debug("resolveTraversalEvents(): "+"processed traversal event "+key+" with"
						+" Parent:"+parentTasks
						+" Split:"+(traversalEvent.getSplitTask() != null ? 
								traversalEvent.getSplitTask().getUniqueString():null)
						+" Merge:"+mergeTasks+" "+traversalEvent.hashCode()
						//+traversalEvent.isFoundMergeTask()
						//+" "+traversalEvent
						);
		}
		return true;
	}

	
	/**
	 * <!-- begin-user-doc -->
		 * get sub graph that is spanned by the given traversal event.
		 * This sub graph is rooted by the splitting task and it contains all tasks
		 * that belong to paths to at least one of the merging tasks.
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
				//curTask = getTasks().get(curTask.getUniqueString());
				logger.trace("computeSubgraph(): "+curTask.getUniqueString() 
						+ " ("+ curTask.getPreviousTaskStr()+")"
						+ " " + targetTaskNames
						+ " flags=" + curTask.getFlags()
						+ " alreadyProcessed=" + ((curTask.getFlags() & 0x000F) == 1)
						);
				if ((curTask.getFlags() & 0x000F) == 1)
					return false;
				
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
						logger.trace("computeSubgraph(): "+"cur task:"+curTask.getUniqueString()
								+"("+curTask.getPreviousTaskStr()+") corresponding cell:"+source
								+"merge task:"+mergeTask.getUniqueString()+" corresponding cell:"+target);
					logger.trace("computeSubgraph(): compute shortest path from "+
							curTask.getUniqueString()+" ("+getCells().get(curTask.getUniqueString())+") to "
									+mergeTask.getUniqueString()+" ("+getCells().get(mergeTask.getUniqueString())+") ");
					int ps=getGraph().getShortestPath(
							getCells().get(curTask.getUniqueString()), 
							getCells().get(mergeTask.getUniqueString())).length;
					if (ps>0)
					{
						mergeTaskFound = true;
						break;
					}
                }
				logger.trace("computeSubgraph(): mergeTask found: "+mergeTaskFound
						+" mergeTask reached: "+mergeTaskReached
						+" offtarget: "+curTask.getGroupingCriteria().keySet().contains(traversalEvent.getTraversalCriterion().getId()));
				// stop traversal if no mergeTask exists and current task is not the merge task
				if (!curTask.getGroupingCriteria().keySet().contains(traversalEvent.getTraversalCriterion().getId()))
					return false;
				//if (!targetTaskNames.isEmpty())
					//if (!mergeTaskFound && !mergeTaskReached)
						//return false;

				//logger.trace("computeSubgraph(): "+"path to merge task exists.");
				
				
				Object target = null;
				
				// everthing fine, insert vertex into the subgrah, if not already inserted
				if (!addedTasks.containsKey(curTask.getUniqueString())) {
					if (getCopiedCells().containsKey(curTask.getUniqueString()))
					{
						target = getCopiedCells().get(curTask.getUniqueString());
						logger.debug("computeSubgraph(): "+"vertex "
	                    		+ curTask.getUniqueString()+" reused");						
					}
					else
					{
						target = getGraph().insertVertexEasyFlow(null, null, curTask);
						getCopiedCells().put(curTask.getUniqueString(), (mxICell) target);
						logger.debug("computeSubgraph(): "+"vertex "
                    		+ curTask.getUniqueString()+" inserted");
					}
                    if (firstNodeTmp.isEmpty()) firstNodeTmp.add((mxCell) target);
                    addedTasks.put(curTask.getUniqueString(), target);
				}
				else 
					target=addedTasks.get(curTask.getUniqueString());
				
				// insert edge (combine vertex with its parent)
				// the root node doesn't have an incoming edge
                if (edge1==null) return !mergeTaskReached && mergeTaskFound;
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
                	logger.debug("computeSubgraph(): "
                			+"edge "+parentTask.getUniqueString()
                			+"->"+curTask.getUniqueString()+" inserted"
                			+" ("+source+" "+target+")");
                	addedEdges.put(parentTask.getUniqueString(), curTask.getUniqueString());
                	getGraph().insertEdgeEasyFlow(null, null, source, target);
                }
				/*if (!curTask.getGroupingCriteria().keySet().contains(traversalEvent.getTraversalCriterion().getId()))
				{
					logger.debug("adding: "+curTask.getUniqueString());
					traversalEvent.getMergeTask().add(curTask);
					return false;
				}*/

				return !mergeTaskReached && mergeTaskFound;
				
				
			}
		};

		graph.getModel().beginUpdate();		try		{
		getGraph().traverseAllPaths(startCell, true, visitor, null);
		layoutGraph();
		}		finally		{			graph.getModel().endUpdate();		}
		
		if (firstNodeTmp.isEmpty())
			logger.debug("computeSubgraph(): "+(firstNodeTmp.isEmpty()?"empty":"non empty")+" subgraph found.");
		else
			logger.debug("computeSubgraph(): "+(firstNodeTmp.isEmpty()?"empty":"non empty")+" subgraph found.");
		return firstNodeTmp.isEmpty() ? null : firstNodeTmp.get(0);

	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public mxICell applyTraversalEventCopyGraph(mxICell root, String groupingStr, GroupingInstance groupingInstance) {
		EList<GroupingInstance> groupingInstances = new BasicEList<GroupingInstance>();
		groupingInstances.add(groupingInstance);
		return applyTraversalEventCopyGraph(root, groupingStr, groupingInstances);
	}

	/**
	 * <!-- begin-user-doc -->
	 * apply the traversal criterion to the subgraph copy 
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public mxICell applyTraversalEventCopyGraph(mxICell root, 
			final String groupingStr, final EList<GroupingInstance> groupingInstances) {

		final EMap<String, String> taskPreviousTaskMap = new BasicEMap<String, String>();
		final EList<mxICell> returnCell = new BasicEList<mxICell>();
		EList<String> instances = new BasicEList<String>(); 
		for (GroupingInstance groupingInstance : groupingInstances)
			instances.add(groupingInstance.getName());
			
		logger.trace("applyTraversalEventCopyGraph(): group="+groupingStr+" instance="+StringUtils.join(instances.toArray(), ","));
		mxICellVisitor visitor=new mxICellVisitor() {
			String debug="";
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				Task task=XMLUtil.loadTaskFromVertex(vertex);
				String taskString = task.getUniqueString();
				logger.trace("applyTraversalEventCopyGraph(): check "+task.getUniqueString()+
						" group="+groupingStr+
						" valid="+isValidConversion(task.getChunks(), groupingStr, groupingInstances));
				if (!isValidConversion(task.getChunks(), groupingStr, groupingInstances))
					return false;
					
				// create the new task/cell and add it to a map with key of 
				// tasks unique string (without the current instance information resolved)
				
				Task copyTask = createTask(task, groupingStr, groupingInstances);
				taskPreviousTaskMap.put(taskString, copyTask.getUniqueString());
				logger.trace("applyTraversalEventCopyGraph(): prevTaskStringMap put: "+taskString+" "+copyTask.getUniqueString());
				mxICell cell = null;
				if (getTasks().containsKey(copyTask.getUniqueString()))
				{
					cell = getCells().get(copyTask.getUniqueString());
				}
				else 
				{
					getTasks().put(copyTask.getUniqueString(), copyTask);
					logger.debug("applyTraversalEventCopyGraph(): added key:"+copyTask.getUniqueString()+" "+getTasks().keySet());
					// create the new cell
					cell = (mxICell) getGraph().insertVertexEasyFlow(null, null, copyTask);
				
					getCells().put(copyTask.getUniqueString(), (mxICell) cell);
				}				
				
				if (returnCell.isEmpty()) returnCell.add(cell);
				if (edge != null)
				{
					Task source = XMLUtil.loadTaskFromVertex(getGraph().getView().getVisibleTerminal(edge, true));

					logger.debug("applyTraversalEventCopyGraph(): try to insert edge:"
							+(source!=null?source.getUniqueString():null)
							+" ("+taskPreviousTaskMap.get(source.getUniqueString())+") "
							+"->"+copyTask.getUniqueString());
					if (getProcessedEdgesCopyGraph().containsKey(taskPreviousTaskMap.get(source.getUniqueString()))
							&& getProcessedEdgesCopyGraph().get(taskPreviousTaskMap.get(source.getUniqueString())).equals(copyTask.getUniqueString()))
						logger.debug("applyTraversalEventCopyGraph(): skip already inserted edge");
					else
					{
						getGraph().insertEdgeEasyFlow(null, null, 
								getCells().get(taskPreviousTaskMap.get(source.getUniqueString())),
								cell
								);
						getProcessedEdgesCopyGraph().put(
								taskPreviousTaskMap.get(source.getUniqueString()),
								copyTask.getUniqueString());
					}
				}						

				//getMostProcessedTasks().put(copyTask.getUniqueString(), task.getUniqueString());
				return true;
			}
		};
		//getGraph().traverse(root, true, visitor);
		//getGraph().traverseTopologicalOrder(root, visitor);
		graph.getModel().beginUpdate();		try		{
			getGraph().traverseAllPaths(root, true, visitor, null);
			layoutGraph();
			
		}		finally		{			graph.getModel().endUpdate();		}

		return returnCell.size() > 0 ? returnCell.get(0) : null;
	}

	private Task createTask(Task task, String groupingStr, EList<GroupingInstance> groupingInstances)
	{
		
		logger.trace("createTask(): "+task.getUniqueString()+" "
				+task.getChunks().keySet()+" "+groupingStr);
		if (!task.getGroupingCriteria().containsKey(groupingStr))
		{
			// don't remove this task
			task.setFlags(task.getFlags() | 0x0010);
			logger.trace("createTask(): mark to keep="+task.getUniqueString()+" "+task.getFlags());
			return task;
		}
		Task copyTask=EcoreUtil.copy(getTasks().get(task.getUniqueString()));
		copyTask.setPreviousTaskStr(task.getUniqueString());
		
		if (task.getGroupingCriteria().containsKey(groupingStr))
		{
			// exclude from copy subgraph
			copyTask.setFlags(copyTask.getFlags() | 0x0001);
		}
		
		if (!copyTask.getChunks().containsKey(groupingStr))
		{
			//logger.debug("createTask(): no chunks for groupingstr "+groupingStr+" ");
			EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
			copyTask.getChunks().put(groupingStr, traversalChunks);
		}
		EList<TraversalChunk> traversalChunks = copyTask.getChunks().get(groupingStr);
		Iterator<GroupingInstance> it = groupingInstances.iterator();
		while (it.hasNext())
		{
			
			//logger.debug("createTask(): "+traversalChunks); 
			//traversalChunk = getTraversalChunk(copyTask.getChunks().get(groupingStr), traversalChunk);
			addTraversalChunk(traversalChunks, it.next());

		}
		
		
		logger.trace("createTask(): add chunks: "+traversalChunks.size()+" "
				+copyTask.getChunks().get(groupingStr).size()+" "+copyTask.getUniqueString());
		return copyTask;
	}
	
	private boolean addTraversalChunk(EList<TraversalChunk> traversalChunks, 
			GroupingInstance groupingInstance)
	{
		for (TraversalChunk tc:traversalChunks)
			if (groupingInstance.getName().equals(tc.getName()))
				return false;
		TraversalChunk traversalChunk = CoreFactory.eINSTANCE.createTraversalChunk();
		traversalChunk.setName(groupingInstance.getName());
		traversalChunks.add(traversalChunk);
		return true;
	}

	
	private void applySplittingCriterion(mxICell cell, mxICell parentCell, 
			String groupingStr)
	{
		// setup the chunks
		Task parentTask = XMLUtil.loadTaskFromVertex((parentCell));
		Task task = XMLUtil.loadTaskFromVertex(cell);
		logger.trace("applySplittingCriterion(): test parentTask="+parentTask.getUniqueString() 
				+ "->" + XMLUtil.loadTaskFromVertex(cell).getUniqueString()
				+ " #(parents chunks)="+parentTask.getChunks().size());
		
		if (parentTask.isRoot())
		{
			logger.debug("applySplittingCriterion(): insert edge: "+parentTask.getUniqueString()
					+" ->"+task.getUniqueString());
			getGraph().insertEdgeEasyFlow(null, null, parentCell, cell);
		}
		else 
		{
			
			for (String parentChunkStr : parentTask.getChunks().keySet()) {
	
				// grouping criterion doenst change
				if (parentChunkStr.equals(groupingStr)) {
					if (task.getGroupingCriteria().containsKey(groupingStr) &&
							parentTask.getGroupingCriteria().containsKey(groupingStr))
					{
						logger.trace("applySplittingCriterion(): parent vs child grouping criteria mode:"
								+task.getGroupingCriteria().get(groupingStr)+" "+parentTask.getGroupingCriteria().get(groupingStr));

						if (!task.getGroupingCriteria().get(groupingStr).
							equals(parentTask.getGroupingCriteria().get(groupingStr)))
						{
							//for (TraversalChunk traversalChunk :
								//parentTask.getChunks().get(parentChunkStr))
								//if (parentChunkStr.equals(traversalChunk.getName()))
							logger.debug("applySplittingCriterion(): insert edge: "+parentTask.getUniqueString()
									+" ->"+task.getUniqueString());
									getGraph().insertEdgeEasyFlow(null, null, parentCell, cell);
						}
					}
					else
							logger.trace("applySplittingCriterion(): "+"Same grouping instance: assume already processed.");
					
				}
	
				for (TraversalChunk parentTraversalChunk: parentTask.getChunks().get(parentChunkStr))
				{
					if (!(getProcessedEdges().containsKey(parentTask.getUniqueString())
							&& getProcessedEdges().get(parentTask.getUniqueString()).equals(task.getUniqueString())))
					{
					String key = parentChunkStr + "_" + groupingStr + "_" + parentTraversalChunk.getName();
					logger.trace("applySplittingCriterion(): check grouping instance="+key);
	
					logger.trace("applySplittingCriterion(): "+getMetaData().
								getGroupingInstancesByGroup().get(key));
					
					if (getMetaData().getGroupingInstancesByGroup().containsKey(key)
							&& task.getChunks().containsKey(groupingStr))
					{
						if (isValidConversion(task.getChunks().get(groupingStr), 
								getMetaData().getGroupingInstancesByGroup().get(key).getInstances()))
						{
							logger.debug("applySplittingCriterion(): "+"insert edge:"
									+parentTask.getUniqueString()+"->"+task.getUniqueString());
							// insert edge from parent cell to cell
							getGraph().insertEdgeEasyFlow(null, null, parentCell, cell);
							getProcessedEdges().put(parentTask.getUniqueString(), task.getUniqueString());
						}
						else
							logger.trace("applySplittingCriterion(): "+"parent does not match.");
	
					} else {
						logger.warn("applySplittingCriterion(): "+"no grouping instances found for key:" + key);
					}
				}
				}
			}
		}

	}
	
	private void applyMergingCriterion(mxICell cell, mxICell previousCell, String groupingStr)
	{
		logger.trace("applyMergingCriterion(): "
				+getGraph().getOutgoingEdges(cell).length+" "
				+getGraph().getVertices(cell).size());
		Task task = XMLUtil.loadTaskFromVertex(cell);
		// get all child cells
		for (Object o:getGraph().getOutgoingEdges(previousCell))
		{
			o = getGraph().getView().getVisibleTerminal(o, false);
			Task childTask = XMLUtil.loadTaskFromVertex(((mxICell) o));
			
			logger.trace("applyMergingCriterion(): "+"insert edge: "
					+task.getUniqueString()+"->"
					+childTask.getUniqueString()+")");
			//logger.debug(childTask.getUniqueString()+" grouping instance "+instanceStr);
			if (getProcessedEdges().containsKey(task.getUniqueString())
					&& getProcessedEdges().get(task.getUniqueString()).equals(childTask.getUniqueString()))
			{
				logger.trace("applyMergingCriterion(): skip inserting edge");
			}
			// insert edge from cell to its child cell
			else
			{
				logger.debug("applyMergingCriterion(): "+"insert edge: "
						+task.getUniqueString()+"->"
						+childTask.getUniqueString()+")");
				getGraph().insertEdgeEasyFlow(null, null, cell, o);
				getProcessedEdges().put(task.getUniqueString(), childTask.getUniqueString());
			}
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
			final String groupingStr,
			//final EList<GroupingInstance> groupingInstances
			final String instanceStr
			) 
	{
		
		final EMap<String, mxICell> mergeCells = new BasicEMap<String, mxICell>();
		mxICellVisitor visitor=new mxICellVisitor() {
			
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				Task task = XMLUtil.loadTaskFromVertex(vertex);
				String taskString = task.getUniqueString();
				logger.trace("applyTraversalEvent(): "+taskString 
						+ " #mergeTasks="+ traversalEvent.getMergeTask().size()
						+ " #incomingTasks(" +task.getPreviousTaskStr()+
						")="+getGraph().getIncomingEdges(
								getCells().get(task.getPreviousTaskStr())).length
						+ " cell=("+getCells().get(task.getPreviousTaskStr())+")"
						);
				// apply the splitting criterion, i.e. check for all old parents
				// (task.getPreviousTask(), which doesn't have the te applied)
				// get all parent cells
				// logger.trace(task.getPreviousTaskStr()+" "+getCells().get(task.getPreviousTaskStr()));
				for (Object parentCell : getGraph().getIncomingEdges(
						getCells().get(task.getPreviousTaskStr()))) 
				{
					parentCell = getGraph().getView().getVisibleTerminal(
							parentCell, true);
					applySplittingCriterion((mxICell) vertex,
							(mxICell) parentCell, groupingStr);
				}

				// if (traversalEvent.getMergeTask().contains(task))
				logger.trace("applyTraversalEvent(): "
						+"mergeTask size="+traversalEvent.getMergeTask().size()
						+" previousTaskStr="+task.getPreviousTaskStr()
						+" ("+task.getUniqueString()+", "
						+getTasks().get(task.getPreviousTaskStr())+")");
				if (containsTask(traversalEvent.getMergeTask(),
						getTasks().get(task.getPreviousTaskStr())))
				{
					mergeCells.put(taskString, (mxICell) vertex);
					logger.debug("applyTraversalEvent(): previousTask="+task.getPreviousTaskStr()+" marked to be merged");
				}
				return true;
			}
		};		
		graph.getModel().beginUpdate();try{
		getGraph().traverse(root, true, visitor);
		layoutGraph();
		}		finally		{			graph.getModel().endUpdate();		}


		

		// apply the mergingTasks
		for (String mergeTaskStr : mergeCells.keySet())
		{
			applyMergingCriterion(mergeCells.get(mergeTaskStr), 
					getCells().get(getTasks().get(mergeTaskStr).getPreviousTaskStr()), 
					groupingStr);
		}
		

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void fixOffTargetCells(mxICell root, final String groupingStr)
	{
		
		getCopiedCells();
		mxICellVisitor visitor=new mxICellVisitor() {
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				Task task = XMLUtil.loadTaskFromVertex(vertex);
				String taskString = task.getUniqueString();
				if (!getCopiedCells().containsKey(taskString))
				{
					if (getCopiedCells().containsKey(task.getPreviousTaskStr()))
					{
						mxICell cell = getCells().get(task.getPreviousTaskStr());						
						// check the childs
						for (Object o : getGraph().getOutgoingEdges(cell))
						{
							Object target = getGraph().getView().getVisibleTerminal(o, false);
							Task child = XMLUtil.loadTaskFromVertex(target);
							if (!getCopiedCells().containsKey(child.getUniqueString()) && 
									!child.getGroupingCriteria().containsKey(groupingStr))
							{
								if (getGraph().isConnected(vertex, target))
									return true;
								logger.debug("fixOffTargetCells(): fix child: insert edge: "
										+taskString+"->"+child.getUniqueString());
								getGraph().insertEdgeEasyFlow(null, null, vertex, target);
							}
						}
						// check parents
						for (Object o : getGraph().getIncomingEdges(cell))
						{
							Object source = getGraph().getView().getVisibleTerminal(o, true);
							Task parent = XMLUtil.loadTaskFromVertex(source);
							if (!getCopiedCells().containsKey(parent.getUniqueString()) && 
									!parent.getGroupingCriteria().containsKey(groupingStr))
							{
								if (getGraph().isConnected(source, vertex))
									return true;
								logger.debug("fixOffTargetCells(): fix parent: insert edge: "
										+parent.getUniqueString()+"->"+taskString);
								getGraph().insertEdgeEasyFlow(null, null, source, vertex);
								
							}
						}
							
						
					}							
				}

				return true;
			}
		};
		
		graph.getModel().beginUpdate();try{
		getGraph().traverse(root, true, visitor);
		layoutGraph();
		}		finally		{			graph.getModel().endUpdate();		}
	}
	
	
	public void testSomething()
	{
		logger.debug(getGraph().hashCode());
	Object parent = graph.getDefaultParent();
	graph.getModel().beginUpdate();
	try
	{
		Task t1 = CoreFactory.eINSTANCE.createTask();
		t1.setName("task1");
		Task t2 = CoreFactory.eINSTANCE.createTask();
		t2.setName("task2");
		//mxCell v1 = (mxCell) graph.insertVertex(parent, null, XMLUtil.getElement(t1),20, 20, 80, 20);
		mxCell v1 = (mxCell) graph.insertVertexEasyFlow(parent, null, t1);

		v1.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
		//mxCell v2 = (mxCell) graph.insertVertex(parent, null, XMLUtil.getElement(t2),280, 20, 80, 20);
		mxCell v2 = (mxCell) graph.insertVertexEasyFlow(parent, null, t2);
		v2.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
	}
	finally
	{
		graph.getModel().endUpdate();
	}
	}
	/**
	 * <!-- begin-user-doc -->
	 * update split and merge task of the given traversal event
	 * and create new traversal events according to the cells found
	 * in the graph given by the root cell.
	 * return the new traversal events.
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<TraversalEvent> getNewTraversalEvents(final TraversalEvent traversalEvent, mxICell root) {
		
		final EMap<String, TraversalEvent> newTraversalEvents = new BasicEMap<String, TraversalEvent>();
		mxICellVisitor visitor=new mxICellVisitor() {
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				Task task = XMLUtil.loadTaskFromVertex(vertex);
				
				//if (task == null) return true;
				
				// check splitting task
				logger.trace("getNewTravEvents(): "+task.getUniqueString()+" vs "+traversalEvent.getSplitTask().getUniqueString());
				if (task.getName().equals(traversalEvent.getSplitTask().getName()))
				{
					
					TraversalEvent newTraversalEvent =
							getNewTraversalEventBySplittingTask(task, traversalEvent);
					logger.debug("getNewTravEvents(): create new TraversalEvent with splitting task"
							+task.getUniqueString());
					newTraversalEvents.put(task.getUniqueString(), newTraversalEvent);
					// set merging task as well, if it contains the splitting task
					if (newTraversalEvent.getMergeTask().contains(traversalEvent.getSplitTask()))
					{
						newTraversalEvent.getMergeTask().remove(traversalEvent.getSplitTask());
						newTraversalEvent.getMergeTask().add(task);
					}
				}
				// check the merging tasks
				else
				{
					Map<String, Task> mergeTasksToDelete = new HashMap<String, Task>();
					for (Task mergeTask : traversalEvent.getMergeTask())
					{
						logger.trace("getNewTravEvents(): test "+mergeTask.getUniqueString()
								+" "+task.getUniqueString()+" "
								+mergeTask.getName().equals(task.getName()));
						if (mergeTask.getName().equals(task.getName()) &&
							!mergeTask.getUniqueString().equals(task.getUniqueString()))
						{							
							for (String key : newTraversalEvents.keySet())
							{
								logger.trace("getNewTravEvents(): test "
										+newTraversalEvents.get(key).getSplitTask().getUniqueString()
										+" convertable to "+task.getUniqueString());
								if (isValidConversion(newTraversalEvents.get(key).getSplitTask(), task))
								{
									mergeTasksToDelete.put(key, mergeTask);
									logger.debug("add merge task: "+task.getUniqueString());
									newTraversalEvents.get(key).getMergeTask().add(task);
								}
							}
						}
					}
					for (String key : mergeTasksToDelete.keySet())
					{
						logger.trace("remove merge task: "+mergeTasksToDelete.get(key).getUniqueString());
						newTraversalEvents.get(key).getMergeTask().remove(mergeTasksToDelete.get(key));
					}
						
				}
				return true;
			}
		};
		logger.debug("getNewTravEvents():"
				+" splitTask="+traversalEvent.getSplitTask().getUniqueString()
				+" mergeTasks=("+StringUtils.join(getTaskStringList(traversalEvent.getMergeTask()), ", ")+")"
				+" root="+XMLUtil.loadTaskFromVertex(root).getUniqueString());
		//getGraph().traverse(root, true, visitor);
		//getGraph().traverse_topologicalOrder(getGraph().traverse_topologicalOrder(root), visitor);
		graph.getModel().beginUpdate();		try		{
			getGraph().traverseTopologicalOrder(root, visitor);
			layoutGraph();
		}		finally		{			graph.getModel().endUpdate();		}


		logger.debug("getNewTravEvents(): "+newTraversalEvents.size()+" "+traversalEvent.getSplitTask().getUniqueString());
		for (String key :newTraversalEvents.keySet())
		{
			
			TraversalEvent travEvent = newTraversalEvents.get(key);
			logger.debug("getNewTravEvents(): "+key
					+" parentTasks=("+StringUtils.join(getTaskStringList(travEvent.getParentTask()), ", ")+")"
					+" splitTask="+travEvent.getSplitTask().getUniqueString()
					+" mergeTasks=("+StringUtils.join(getTaskStringList(travEvent.getMergeTask()), ", ")+")");
		}
		if (newTraversalEvents.isEmpty())
			newTraversalEvents.put(traversalEvent.getSplitTask().getUniqueString(), traversalEvent);
		return new BasicEList<TraversalEvent>(newTraversalEvents.values());
	}

	private TraversalEvent getNewTraversalEventBySplittingTask(Task task, TraversalEvent traversalEvent)
	{
		
		EMap<String, EList<TraversalChunk>> nonOverlappingChunks = 
				traversalEvent.getSplitTask().getNonOveralppingTraversalChunksFor(task);
		logger.debug("getNewTravEventBySplittingTask(): specialize "+traversalEvent.getSplitTask().getUniqueString()
				+" to "+task.getUniqueString());
		//if (nonOverlappingChunks.isEmpty())
			//return traversalEvent;
			
		TraversalEvent newTraversalEvent = EcoreUtil.copy(traversalEvent);
		newTraversalEvent.setSplitTask(task);
		return newTraversalEvent;
	}

	
	private EList<String> getTaskStringList(EList<Task> tasks)
	{
		EList<String> taskStrings = new BasicEList<String>();
		for (Task task:tasks)
			taskStrings.add(task.getUniqueString());
		return taskStrings;
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
	
	private boolean isValidConversion(Task taskFrom, Task taskTo)
	{
		//boolean isValid = false;
		for (String groupingStr : taskTo.getChunks().keySet())
			for (TraversalChunk traversalChunk : taskTo.getChunks().get(groupingStr))
				if (!isValidConversion(taskFrom.getChunks(), groupingStr, traversalChunk.getName()))
				{
					logger.debug("isValidConversion(): not valid: "+taskFrom.getUniqueString()+" -> "+taskTo.getUniqueString());
					return false;
				}
		logger.debug("isValidConversion(): valid: "+taskFrom.getUniqueString()+" -> "+taskTo.getUniqueString());
		return true;
	}

/*	
	private boolean isValidConversion2(
			EMap<String, EList<TraversalChunk>> traversalChunks,
			String groupingStr, String instanceStr)
	{
		for (String parentGroupStr : traversalChunks.keySet())
		{
			boolean isValid = false;
			for (TraversalChunk traversalChunk : traversalChunks.get(parentGroupStr))
			{
				String key = parentGroupStr+"_"+groupingStr+"_"+traversalChunk.getName();
				logger.debug("isValidConversion(): "+key+" contains:"+getMetaData().getGroupingInstancesByGroup().containsKey(key));
				if (parentGroupStr.equals(groupingStr))
				{
					//isValid = true;
				}
				else if (getMetaData().getGroupingInstancesByGroup().containsKey(key))
					for (GroupingInstance groupingInstance : 
						getMetaData().getGroupingInstancesByGroup().get(key).getInstances())
						if (groupingInstance.getName().equals(instanceStr))
						{
							isValid = true;
							break;
						}
				
			}
			if (!isValid)
				return false;
		}
		return true;
	}
*/
	
	private boolean isValidConversion(
			EMap<String, EList<TraversalChunk>> traversalChunks,
			String groupingStr,
			EList<GroupingInstance> groupingInstances
			)
	{
		for (GroupingInstance groupingInstance : groupingInstances)
		{
			if (isValidConversion(traversalChunks, groupingStr, groupingInstance.getName()))
				return true;
		}
		return false;
	}
	
	private boolean isValidConversion(
			EMap<String, EList<TraversalChunk>> traversalChunks,
			String groupingStr, String instanceStr)
	{
		for (String parentGroupStr : traversalChunks.keySet())
		{
			boolean isValid = false;
			for (TraversalChunk traversalChunk : traversalChunks.get(parentGroupStr))
			{
				String key = parentGroupStr+"_"+groupingStr+"_"+traversalChunk.getName();
				//logger.debug("isValidConversion(): "+key+" contains:"+getMetaData().getGroupingInstancesByGroup().containsKey(key));
				if (parentGroupStr.equals(groupingStr))
				{
					if (traversalChunk.getName().equals(instanceStr))
					{
						isValid = true;
						break;
					}
				}
				else if (getMetaData().getGroupingInstancesByGroup().containsKey(key))
					for (GroupingInstance groupingInstance : 
						getMetaData().getGroupingInstancesByGroup().get(key).getInstances())
						if (groupingInstance.getName().equals(instanceStr))
						{
							isValid = true;
							break;
						}
				
			}
			if (!isValid)
				return false;
		}
		return true;
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
	public boolean removeSubGraph(mxICell root, final String groupingStr) {

		final EList<Object> tmpGraphCells = new BasicEList<Object>();
		final EList<Object> cells = new BasicEList<Object>();
		mxICellVisitor visitor=new mxICellVisitor()
		{
		
			@Override
			public boolean visit(Object vertex, Object edge) {
				Task task=XMLUtil.loadTaskFromVertex(vertex);
				/*logger.debug("removeSubGraph(): "+
						task.getUniqueString()
						+" id="+task.hashCode()
						+" flags="+task.getFlags()
						+" test="+(task.getFlags() & 0x00F0)
						+" cond="+0x10);*/
				if ((task.getFlags() & 0x00F0) == 0x10)
				{
					logger.debug("removeSubGraph(): skip task "+task.getUniqueString());
					return true;
				}
				getCopiedCells().remove(task.getUniqueString());
				tmpGraphCells.add(vertex);
				cells.add(getCells().get(task.getUniqueString()));
				
				
				return true;
			}
		};
		// reset flag indicating not to include into subgraph copy
		
		getGraph().traverse(root, true, visitor);

		graph.getModel().beginUpdate();try{
			getGraph().removeCells(cells.toArray(), true);
			
			getGraph().removeCells(tmpGraphCells.toArray(), true);
			layoutGraph();

		}finally{graph.getModel().endUpdate();}

		getProcessedEdgesCopyGraph().clear();
		getProcessedEdges().clear();
		// reset flag indicating not to be removed
		return !tmpGraphCells.isEmpty() || !cells.isEmpty();
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<GroupingInstance> getGroupingInstances(TraversalEvent traversalEvent) {
		EList<GroupingInstance> groupingInstances = new BasicEList<GroupingInstance>();
		if (traversalEvent.isGrouping())
			if (traversalEvent.getType().equals("grouping"))
				//if (traversalEvent.getTraversalCriterion().getMode().equals("batch"))
					for (GroupingInstance groupingInstance :
						getMetaData().getGroupingInstances().
						get(traversalEvent.getTraversalCriterion().getId()).getInstances())
					{
						groupingInstances.add(groupingInstance);
					}
			//else if (traversalEvent.getType().equals("traversal"))
				
		return groupingInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void resetFlags() {
		resetFlag(0xFFF0);
		resetFlag(0xFF0F);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String traversalEventToString(TraversalEvent traversalEvent) {
		String parentTasks="(";
		for (Task parentTask : traversalEvent.getParentTask()) {
			parentTasks+=parentTask.getUniqueString()+" ";
		}
		parentTasks+=")";
		String mergeTasks="(";
		for (Task mergeTask : traversalEvent.getMergeTask()) {
			mergeTasks+=mergeTask.getUniqueString()+" ";
		}
		
		mergeTasks+=")";

		return "applyTraversalEvents(): "
				+traversalEvent.getTraversalCriterion().getId()+" "
				+traversalEvent.getTraversalCriterion().getMode()
				+" parentTasks="+parentTasks
				+" splittingTask="+traversalEvent.getSplitTask().getUniqueString()
				+" mergeTasks="+mergeTasks
				+" #instances="+((DefaultMetaData)getMetaData()).getGroupingInstances().get(traversalEvent.getTraversalCriterion().getId()).getInstances().size()
				;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TraversalEvent getNextTraversalEvent() {

		if (getTraversalEvents().isEmpty())
		{
			getTraversalEvents().addAll(getTraversalEvents(getDefaultRootCell(), true));
			getTraversalEvents().add(CoreFactory.eINSTANCE.createTraversalEvent());
		}
		if (getNewTraversalEvents().isEmpty() &&
			!getTraversalEvents().isEmpty())
		{
			if (getTraversalEvents().get(0).getSplitTask() == null)
				return null;
			
			getNewTraversalEvents().addAll(
					getNewTraversalEvents(
							getTraversalEvents().remove(0), 
							getDefaultRootCell()));
		}
		
		return getNewTraversalEvents().remove(0);
	}

	private void resetFlag(final int mask) 
	{
		mxICellVisitor visitor=new mxICellVisitor()
		{
		
			@Override
			public boolean visit(Object vertex, Object edge) {
				Task task=XMLUtil.loadTaskFromVertex(vertex);
				//logger.debug(task.getUniqueString()+" "+task.getFlags());
				task.setFlags(task.getFlags() & mask);
				return true;
			}
		};
		
		getGraph().traverse(getDefaultRootCell(), true, visitor);
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
				Iterator<String> it = task.getTraversalEvents().keySet().iterator();
				while(it.hasNext())
				//for (String key: task.getTraversalEvents().keySet())
				{
					String key = it.next();
					TraversalEvent traversalEvent = task.getTraversalEvents().get(key); 
					if (traversalEvent.isGrouping() && isGrouping ||
							!traversalEvent.isGrouping() && !isGrouping)
					{
						logger.debug("getTraversalEvents(): add te "+key+" from "+task.getUniqueString()+" "+traversalEvent.hashCode());
						traversalEvents.add(traversalEvent);
					}
				}
				return true;
			}
		};
		//getGraph().traverse(root, true, visitor);
		getGraph().traverseTopologicalOrder(root, visitor);
		return traversalEvents;
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
			case JgraphxPackage.UTIL__PROCESSED_EDGES_COPY_GRAPH:
				return ((InternalEList<?>)getProcessedEdgesCopyGraph()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.UTIL__PROCESSED_EDGES:
				return ((InternalEList<?>)getProcessedEdges()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.UTIL__ADD_EDGES:
				return ((InternalEList<?>)getAddEdges()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.UTIL__COPIED_CELLS:
				return ((InternalEList<?>)getCopiedCells()).basicRemove(otherEnd, msgs);
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
			case JgraphxPackage.UTIL__DEFAULT_ROOT_CELL:
				return getDefaultRootCell();
			case JgraphxPackage.UTIL__PROCESSED_EDGES_COPY_GRAPH:
				if (coreType) return getProcessedEdgesCopyGraph();
				else return getProcessedEdgesCopyGraph().map();
			case JgraphxPackage.UTIL__PROCESSED_EDGES:
				if (coreType) return getProcessedEdges();
				else return getProcessedEdges().map();
			case JgraphxPackage.UTIL__ADD_EDGES:
				if (coreType) return getAddEdges();
				else return getAddEdges().map();
			case JgraphxPackage.UTIL__COPIED_CELLS:
				if (coreType) return getCopiedCells();
				else return getCopiedCells().map();
			case JgraphxPackage.UTIL__CURRENT_SUB_GRAPHS:
				return getCurrentSubGraphs();
			case JgraphxPackage.UTIL__TRAVERSAL_EVENTS:
				return getTraversalEvents();
			case JgraphxPackage.UTIL__NEW_TRAVERSAL_EVENTS:
				return getNewTraversalEvents();
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
			case JgraphxPackage.UTIL__DEFAULT_ROOT_CELL:
				setDefaultRootCell((mxICell)newValue);
				return;
			case JgraphxPackage.UTIL__PROCESSED_EDGES_COPY_GRAPH:
				((EStructuralFeature.Setting)getProcessedEdgesCopyGraph()).set(newValue);
				return;
			case JgraphxPackage.UTIL__PROCESSED_EDGES:
				((EStructuralFeature.Setting)getProcessedEdges()).set(newValue);
				return;
			case JgraphxPackage.UTIL__ADD_EDGES:
				((EStructuralFeature.Setting)getAddEdges()).set(newValue);
				return;
			case JgraphxPackage.UTIL__COPIED_CELLS:
				((EStructuralFeature.Setting)getCopiedCells()).set(newValue);
				return;
			case JgraphxPackage.UTIL__CURRENT_SUB_GRAPHS:
				getCurrentSubGraphs().clear();
				getCurrentSubGraphs().addAll((Collection<? extends mxICell>)newValue);
				return;
			case JgraphxPackage.UTIL__TRAVERSAL_EVENTS:
				getTraversalEvents().clear();
				getTraversalEvents().addAll((Collection<? extends TraversalEvent>)newValue);
				return;
			case JgraphxPackage.UTIL__NEW_TRAVERSAL_EVENTS:
				getNewTraversalEvents().clear();
				getNewTraversalEvents().addAll((Collection<? extends TraversalEvent>)newValue);
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
			case JgraphxPackage.UTIL__DEFAULT_ROOT_CELL:
				setDefaultRootCell(DEFAULT_ROOT_CELL_EDEFAULT);
				return;
			case JgraphxPackage.UTIL__PROCESSED_EDGES_COPY_GRAPH:
				getProcessedEdgesCopyGraph().clear();
				return;
			case JgraphxPackage.UTIL__PROCESSED_EDGES:
				getProcessedEdges().clear();
				return;
			case JgraphxPackage.UTIL__ADD_EDGES:
				getAddEdges().clear();
				return;
			case JgraphxPackage.UTIL__COPIED_CELLS:
				getCopiedCells().clear();
				return;
			case JgraphxPackage.UTIL__CURRENT_SUB_GRAPHS:
				getCurrentSubGraphs().clear();
				return;
			case JgraphxPackage.UTIL__TRAVERSAL_EVENTS:
				getTraversalEvents().clear();
				return;
			case JgraphxPackage.UTIL__NEW_TRAVERSAL_EVENTS:
				getNewTraversalEvents().clear();
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
			case JgraphxPackage.UTIL__DEFAULT_ROOT_CELL:
				return DEFAULT_ROOT_CELL_EDEFAULT == null ? defaultRootCell != null : !DEFAULT_ROOT_CELL_EDEFAULT.equals(defaultRootCell);
			case JgraphxPackage.UTIL__PROCESSED_EDGES_COPY_GRAPH:
				return processedEdgesCopyGraph != null && !processedEdgesCopyGraph.isEmpty();
			case JgraphxPackage.UTIL__PROCESSED_EDGES:
				return processedEdges != null && !processedEdges.isEmpty();
			case JgraphxPackage.UTIL__ADD_EDGES:
				return addEdges != null && !addEdges.isEmpty();
			case JgraphxPackage.UTIL__COPIED_CELLS:
				return copiedCells != null && !copiedCells.isEmpty();
			case JgraphxPackage.UTIL__CURRENT_SUB_GRAPHS:
				return currentSubGraphs != null && !currentSubGraphs.isEmpty();
			case JgraphxPackage.UTIL__TRAVERSAL_EVENTS:
				return traversalEvents != null && !traversalEvents.isEmpty();
			case JgraphxPackage.UTIL__NEW_TRAVERSAL_EVENTS:
				return newTraversalEvents != null && !newTraversalEvents.isEmpty();
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
		result.append(", defaultRootCell: ");
		result.append(defaultRootCell);
		result.append(", currentSubGraphs: ");
		result.append(currentSubGraphs);
		result.append(')');
		return result.toString();
	}

} //UtilImpl
