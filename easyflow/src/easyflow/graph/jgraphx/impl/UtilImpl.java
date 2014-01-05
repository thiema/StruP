/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import java.net.URI;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;

import easyflow.EasyflowFactory;
import easyflow.core.Catalog;
import easyflow.core.DataLink;
import easyflow.core.DataPort;
import easyflow.core.CorePackage;


import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph.mxICellVisitor;

import easyflow.core.CoreFactory;

import easyflow.core.Task;
import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.exception.TraversalChunkNotFoundException;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.execution.IExecutionSystem;
import easyflow.core.Workflow;
import easyflow.custom.util.XMLUtil;

import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.Util;

import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.GroupingInstance;
import easyflow.tool.Tool;
import easyflow.tool.ToolFactory;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalEvent;
import easyflow.traversal.TraversalFactory;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToDataLinkMapImpl;
import easyflow.util.maps.impl.StringToGraphCellMapImpl;
import easyflow.util.maps.impl.StringToStringMapImpl;
import easyflow.util.maps.impl.StringToTaskMapImpl;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

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
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getDataLinks <em>Data Links</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getUtilityTasks <em>Utility Tasks</em>}</li>
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
	 * The cached value of the '{@link #getDataLinks() <em>Data Links</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLinks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, DataLink> dataLinks;
	/**
	 * The cached value of the '{@link #getUtilityTasks() <em>Utility Tasks</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilityTasks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Task> utilityTasks;
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
			tasks = new EcoreEMap<String,Task>(MapsPackage.Literals.STRING_TO_TASK_MAP, StringToTaskMapImpl.class, this, JgraphxPackage.UTIL__TASKS);
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
			cells = new EcoreEMap<String,mxICell>(MapsPackage.Literals.STRING_TO_GRAPH_CELL_MAP, StringToGraphCellMapImpl.class, this, JgraphxPackage.UTIL__CELLS);
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
			depricatedTasks = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__DEPRICATED_TASKS);
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
			mostProcessedTasks = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__MOST_PROCESSED_TASKS);
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
			processedEdgesCopyGraph = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__PROCESSED_EDGES_COPY_GRAPH);
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
			processedEdges = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__PROCESSED_EDGES);
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
			addEdges = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.UTIL__ADD_EDGES);
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
			copiedCells = new EcoreEMap<String,mxICell>(MapsPackage.Literals.STRING_TO_GRAPH_CELL_MAP, StringToGraphCellMapImpl.class, this, JgraphxPackage.UTIL__COPIED_CELLS);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, DataLink> getDataLinks() {
		if (dataLinks == null) {
			dataLinks = new EcoreEMap<String,DataLink>(MapsPackage.Literals.STRING_TO_DATA_LINK_MAP, StringToDataLinkMapImpl.class, this, JgraphxPackage.UTIL__DATA_LINKS);
		}
		return dataLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Task> getUtilityTasks() {
		if (utilityTasks == null) {
			utilityTasks = new EcoreEMap<String,Task>(MapsPackage.Literals.STRING_TO_TASK_MAP, StringToTaskMapImpl.class, this, JgraphxPackage.UTIL__UTILITY_TASKS);
		}
		return utilityTasks;
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
		//mxCell vertex = null;
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
	 * enumerate all unique paths and update the traversal events.
	 * the traversal events are supposed to be unmerged. I.e. traversal events of the same type
	 * might occur along subsequent nodes on a path.
	 * Main concern is to merge all traversal events, that have a common splitting task. 
	 * This requires appropriate finding of
	 * the traversal event, and update the mergeTask reference attribute and finally remove 
	 * all obsolete traversal event (that are used to extend the parent tasks traversal event)
	 * so that only one (representing the splitting task) remains.
	 * TEs sharing same split and/or merging tasks might exist.
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveTraversalEvents(mxICell root) throws TaskNotFoundException, CellNotFoundException {
		

		// map to track all processed traversalevents: <grouping>_<mode>_<te's root> x <Traversalevent>
		final EMap<String, TraversalEvent> allTraversalEvents = new BasicEMap<String, TraversalEvent>();
		// track deprecated traversalevents : <task> x <te name>
		final EMap<String, EList<String>> deprecatedTraversalEvents = new BasicEMap<String, EList<String>>();
		
		mxICellVisitor visitor=new mxICellVisitor() {
			String debug="resolveTraversalEvents(): ";
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				//Task task=XMLUtil.loadTaskFromVertex(vertex);
				Task task = null;
				Task parentTask = null;
				String taskString = null;
				try {
					task = loadTask(vertex);
				
					taskString = task.getUniqueString();
					// set vertex's parent task
					
					if (edge != null)
						parentTask=getSourceTask((mxCell) edge);
					
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
						+" DataPort:"+(traversalEvent.getTraversalCriterion().getDataPort()!=null?
								traversalEvent.getTraversalCriterion().getDataPort().getName():null)
						+" Merge:"+mergeTasks+" te_type="+traversalEvent.getType()
						//+traversalEvent.isFoundMergeTask()
						//+" "+traversalEvent
						);
		}
		//logger.debug("#traversalEvents="+getTraversalEvents().size()+" #"+getTraversalEvents(getDefaultRootCell(), true).size()+" root"+getDefaultRootCell());
		return true;
	}

	
	/**
	 * <!-- begin-user-doc -->
		 * get subgraph that is spanned by the given traversal event.
		 * This sub graph is rooted by the splitting task and it contains all tasks
		 * that belong to paths to at least one of the merging tasks.
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @generated not
	 */
	
	public mxICell computeSubgraph(final TraversalEvent traversalEvent, final boolean isComplete) throws TaskNotFoundException {
		
		mxICell startCell = getCells().get(traversalEvent.getSplitTask().getUniqueString()); 
		EList<mxICell> stopCells = getCells(traversalEvent.getMergeTask());
		logger.trace("computeSubgraph(): "+getCells().size()+" "+traversalEvent.getMergeTask().size()+" "+stopCells.size()+" "+startCell);
		// get the task names and put in to List
		final List<String> targetTaskNames = new ArrayList<String>();
		for (mxICell tmpCell : stopCells) {
			//targetTaskNames.add(XMLUtil.loadTaskFromElement(
				//	(Element) tmpCell.getValue()).getUniqueString());
			targetTaskNames.add(loadTask(tmpCell).getUniqueString());			
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
				
				
				mxICell clonedVertex = cloneCell((mxICell) vertex1);
				// set the current task
				Task curTask = null;
				try {
					curTask = loadTask(vertex1);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//curTask = getTasks().get(curTask.getUniqueString());
				logger.debug("computeSubgraph(): "+curTask.getUniqueString() 
						+ " ("+ curTask.getPreviousTaskStr()+")"
						+ " " + targetTaskNames
						+ " flags=" + curTask.getFlags()
						+ " alreadyProcessed=" + ((curTask.getFlags() & 0x000F) == 1)
						+ " #out="+getGraph().getOutgoingEdges(vertex1).length
						+ " #out="+getGraph().getOutgoingEdges(clonedVertex).length
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
					
					
					mxICell target = getCells().get(mergeTask.getUniqueString());
					try {
						logger.debug(loadTask(vertex1).getUniqueString()+"->"+loadTask(target).getUniqueString());
					} catch (TaskNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//if (vertex1 == null || target == null)
						logger.trace("computeSubgraph(): "+"cur task:"+curTask.getUniqueString()
								+"("+curTask.getPreviousTaskStr()+") corresponding cell:"+vertex1
								+"merge task:"+mergeTask.getUniqueString()+" corresponding cell:"+target);
					//int ps1=getGraph().getShortestPath(vertex1, target).length;
					int ps=getGraph().getShortestPath(
							vertex1, 
							target).length;
					logger.trace("computeSubgraph(): compute shortest path from "+
							curTask.getUniqueString()+" ("+getCells().get(curTask.getUniqueString())+") to "
									+mergeTask.getUniqueString()+" ("+getCells().get(mergeTask.getUniqueString())+")="+ps
									+ " #out="+getGraph().getOutgoingEdges(vertex1).length
									+ " #in="+getGraph().getIncomingEdges(target).length);
					
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
				
				// everything fine, insert vertex into the subgraph, unless already inserted
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
				
				// the root node doesn't have an incoming edge
                if (edge1==null) return !mergeTaskReached && mergeTaskFound;
                
                // prepare to insert edge (combine vertex with its parent)
                mxICell tmp = (mxICell) ((mxCell)edge1).getTerminal(true);
                Task parentTask = null;
				try {
					parentTask = loadTask(tmp);
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
                			+" ("+source+" "+target+")");
                	addedEdges.put(parentTask.getUniqueString(), curTask.getUniqueString());
                	// create new edge, use the current edge value as new value 
                	getGraph().insertEdgeEasyFlow(null, null, source, target, 
                			((mxCell)edge1).getValue());
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
	 * @throws TaskNotFoundException 
	 * @generated not
	 */
	public mxICell applyTraversalEventCopyGraph(mxICell root, TraversalEvent traversalEvent, 
			GroupingInstance groupingInstance) throws TaskNotFoundException {
		EList<GroupingInstance> groupingInstances = new BasicEList<GroupingInstance>();
		groupingInstances.add(groupingInstance);
		return applyTraversalEventCopyGraph(root, traversalEvent, groupingInstances);
	}

	/**
	 * <!-- begin-user-doc -->
	 * apply the traversal criterion to the subgraph copy 
	 * - stop when grouping is not a valid along an edge
	 * - stop if task is not applicable to the grouping definition
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException
	 * @generated not
	 */
	public mxICell applyTraversalEventCopyGraph(mxICell root, 
			final TraversalEvent traversalEvent, 
			final EList<GroupingInstance> groupingInstances) throws TaskNotFoundException {

		final String  groupingStr=traversalEvent.getTraversalCriterion().getId();
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
				Task task = null;
				try {
					task = loadTask(vertex);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String taskString = task.getUniqueString();
				logger.trace("applyTraversalEventCopyGraph(): check "+task.getUniqueString()+
						" group="+groupingStr+
						" valid="+isValidConversion(task.getChunks(), groupingStr, groupingInstances));
				if (!isValidConversion(task.getChunks(), groupingStr, groupingInstances))
					return false;
				if (!task.shallProcess(groupingInstances,groupingStr))
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
					try {
						Task source = null;
					
						source = getSourceTask((mxCell) edge);
						//DataLink oldDataLink=loadDataLink(edge);
						logger.debug("applyTraversalEventCopyGraph(): try to insert edge:"
								+(source!=null?source.getUniqueString():null)
								+" ("+taskPreviousTaskMap.get(source.getUniqueString())+") "
								+"->"+copyTask.getUniqueString()
								);
						if (getProcessedEdgesCopyGraph().containsKey(taskPreviousTaskMap.get(source.getUniqueString()))
								&& getProcessedEdgesCopyGraph().get(taskPreviousTaskMap.get(source.getUniqueString())).equals(copyTask.getUniqueString()))
							logger.debug("applyTraversalEventCopyGraph(): skip already inserted edge");
						else
						{
							String taskStr=taskPreviousTaskMap.get(source.getUniqueString());
							Task tmp=getTasks().get(taskStr);
							logger.debug(tmp.getTraversalEvents().keySet()+" "+groupingStr);
							try {
								DataLink dataLink = createDataLink(edge, copyTask, groupingStr, groupingStr);
								
								getGraph().insertEdgeEasyFlow(null, null, 
										getCells().get(taskStr),
										cell,
										dataLink
										);
								getProcessedEdgesCopyGraph().put(
										taskPreviousTaskMap.get(source.getUniqueString()),
										copyTask.getUniqueString());
							} catch (DataLinkNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
						}
					} catch (TaskNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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

	private DataLink createDataLink(DataPort dataPort, Task task, String groupingStr, String parentGroupingStr)
	{
		DataLink newDataLink=CoreFactory.eINSTANCE.createDataLink();
		newDataLink.setGroupingStr(groupingStr);
		newDataLink.setDataPort(dataPort);
		if (parentGroupingStr != null)
			newDataLink.setParentGroupingStr(parentGroupingStr);
		int i=task.getChunks().indexOfKey(groupingStr);		
		if (i!=-1)
		{
			EList<TraversalChunk> chunks=new BasicEList<TraversalChunk>();
			Iterator<TraversalChunk> it = task.getChunks().get(i).getValue().iterator();
			while (it.hasNext())
				chunks.add(it.next());
			newDataLink.getChunks().addAll(chunks);
			newDataLink.setTraversalName(task.getChunks().get(i).getKey());
		}
		return newDataLink;
	}
	
	private DataLink createDataLink(Object edge, Task task, String groupingStr, String parentGroupingStr) throws DataLinkNotFoundException
	{
		DataLink dataLink = loadDataLink(edge);
		return createDataLink(dataLink.getDataPort(), task, groupingStr, parentGroupingStr);
		
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
		//logger.debug(" copy:"+copyTask.getTraversalEvents().get(groupingStr).getTraversalCriterion().getDataPort()+
			//	" orig:"+getTasks().get(task.getUniqueString()).getTraversalEvents().get(groupingStr).getTraversalCriterion().getDataPort());
		
		if (task.getGroupingCriteria().containsKey(groupingStr))
			// exclude from copy subgraph
			copyTask.setFlags(copyTask.getFlags() | 0x0001);
		
		if (!copyTask.getChunks().containsKey(groupingStr))
		{
			EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
			copyTask.getChunks().put(groupingStr, traversalChunks);
		}
		
		EList<TraversalChunk> traversalChunks = copyTask.getChunks().get(groupingStr);
		Iterator<GroupingInstance> it = groupingInstances.iterator();
		while (it.hasNext())
			addTraversalChunk(traversalChunks, it.next());
		
		
		logger.trace("createTask(): "+traversalChunks.size()+"("
				+copyTask.getChunks().get(groupingStr).size()+") " +
						"chunks added for Task="+copyTask.getUniqueString());
		return copyTask;
	}
	
	private boolean addTraversalChunk(EList<TraversalChunk> traversalChunks, 
			GroupingInstance groupingInstance)
	{
		for (TraversalChunk tc:traversalChunks)
			if (groupingInstance.getName().equals(tc.getName()))
				return false;
		TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
		traversalChunk.setName(groupingInstance.getName());
		traversalChunks.add(traversalChunk);
		return true;
	}

	
	private void applySplittingCriterion(mxICell cell, 
			mxICell parentCell,
			Object edgeIn,
			final String groupingStr) throws TaskNotFoundException, DataLinkNotFoundException, TraversalChunkNotFoundException
	{
		// setup the chunks
		Task parentTask = loadTask((parentCell));
		Task task = loadTask(cell);
		
		logger.trace("applySplittingCriterion(): test parentTask="+parentTask.getUniqueString() 
				+ "->" + task.getUniqueString()
				+ " #(parents chunks)="+parentTask.getChunks().size());
		
		if (parentTask.isRoot())
		{
			logger.debug("applySplittingCriterion(): insert edge: "+parentTask.getUniqueString()
					+" ->"+task.getUniqueString());
			
			getGraph().insertEdgeEasyFlow(null, null, parentCell, cell,
					createDataLink(edgeIn, task, groupingStr, null)
					);
		}
		else 
		{
			for (String parentGroupingStr : parentTask.getChunks().keySet()) {
	
				// grouping criterion doesn't change
				if (parentGroupingStr.equals(groupingStr)) {
					if (task.getGroupingCriteria().containsKey(groupingStr) &&
							parentTask.getGroupingCriteria().containsKey(groupingStr))
					{
						logger.trace("applySplittingCriterion(): parent vs child grouping criteria mode:"
								+task.getGroupingCriteria().get(groupingStr)+" "+parentTask.getGroupingCriteria().get(groupingStr));

						if (!task.getGroupingCriteria().get(groupingStr).
							equals(parentTask.getGroupingCriteria().get(groupingStr)))
						{
							//for (TraversalChunk traversalChunk :
								//parentTask.getChunks().get(parentGroupingStr))
								//if (parentGroupingStr.equals(traversalChunk.getName()))
							logger.debug("applySplittingCriterion(): insert edge: "+parentTask.getUniqueString()
									+" ->"+task.getUniqueString());
							
							getGraph().insertEdgeEasyFlow(null, null, parentCell, cell,
									createDataLink(edgeIn, task, groupingStr, parentGroupingStr)
									);
						}
					}
					else
							logger.trace("applySplittingCriterion(): "+"Same grouping instance: assume already processed.");
					
				}
	
				for (TraversalChunk parentTraversalChunk: parentTask.getChunks().get(parentGroupingStr))
				{
					if (!(getProcessedEdges().containsKey(parentTask.getUniqueString())
							&& getProcessedEdges().get(parentTask.getUniqueString()).equals(task.getUniqueString())))
					{
						String key = parentGroupingStr + "_" + groupingStr + "_" + parentTraversalChunk.getName();
						logger.trace("applySplittingCriterion(): check grouping instance="+key);
		
						logger.trace("applySplittingCriterion(): "+
								!getMetaData().getInstances(parentGroupingStr, 
										groupingStr, 
										parentTraversalChunk.getName()
										).isEmpty());
						
						if (!getMetaData().getInstances(parentGroupingStr, 
								groupingStr, 
								parentTraversalChunk.getName()
								).isEmpty()
								&& task.getChunks().containsKey(groupingStr))
						{
							if (isValidConversion(task.getChunks().get(groupingStr),
									getMetaData().getInstances(parentGroupingStr, 
											groupingStr, 
											parentTraversalChunk.getName()
											)
								))
							{
								logger.debug("applySplittingCriterion(): "+"insert edge:"
										+parentTask.getUniqueString()+"->"+task.getUniqueString());
								// insert edge from parent cell to cell
								getGraph().insertEdgeEasyFlow(null, null, parentCell, cell,
										createDataLink(edgeIn, task, groupingStr, parentGroupingStr));
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
	
	private void applyMergingCriterion(mxICell cell, 
			mxICell previousCell,
			String groupingStr) throws TaskNotFoundException, DataLinkNotFoundException, TraversalChunkNotFoundException
	{
		logger.trace("applyMergingCriterion(): "
				+getGraph().getOutgoingEdges(cell).length+" "
				+getGraph().getVertices(cell).size());
		Task task = loadTask(cell);
		//TraversalEvent traversalEvent = task.getTraversalEvents().get(groupingStr);
		// get all child cells
		for (Object edgeOut:getGraph().getOutgoingEdges(previousCell))
		{
			Object o = getTarget((mxCell) edgeOut);
					//getGraph().getView().getVisibleTerminal(edgeOut, false);
			Task childTask = loadTask(((mxICell) o));
			
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
				
				getGraph().insertEdgeEasyFlow(null, null, cell, o,
						createDataLink(edgeOut, childTask, groupingStr, null)
						);
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
	 * @throws TaskNotFoundException 
	 * @generated not
	 */
	
	public void applyTraversalEvent(mxICell root, 
			final TraversalEvent traversalEvent,
			final String groupingStr,
			//final EList<GroupingInstance> groupingInstances
			final String instanceStr
			) throws TaskNotFoundException 
	{
		
		final EMap<String, mxICell> mergeCells = new BasicEMap<String, mxICell>();
		mxICellVisitor visitor=new mxICellVisitor() {
			
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				Task task = null;
				try {
					task = loadTask(vertex);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String taskString = task.getUniqueString();
				logger.trace("applyTraversalEvent(): "+taskString 
						+ " #mergeTasks="+ traversalEvent.getMergeTask().size()
						+ " #incomingTasks(" +task.getPreviousTaskStr()+
						")="+getGraph().getIncomingEdges(
								getCells().get(task.getPreviousTaskStr())).length
						+ " cell=("+getCells().get(task.getPreviousTaskStr())+")"
						+ " dataPort="+traversalEvent.getTraversalCriterion().getDataPort()
						);
				// apply the splitting criterion, i.e. check for all old parents
				// (task.getPreviousTask(), which doesn't have the te applied)
				// get all parent cells
				// logger.trace(task.getPreviousTaskStr()+" "+getCells().get(task.getPreviousTaskStr()));
				for (Object edgeIn : getGraph().getIncomingEdges(
						getCells().get(task.getPreviousTaskStr()))) 
				{
					Object parentCell = getSource((mxCell) edgeIn);
							//getGraph().getView().getVisibleTerminal(edgeIn, true);
					try {
						applySplittingCriterion((mxICell) vertex,
								(mxICell) parentCell, edgeIn, groupingStr);
					} catch (TaskNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (DataLinkNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (TraversalChunkNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				// if (traversalEvent.getMergeTask().contains(task))
				logger.trace("applyTraversalEvent(): "
						+"mergeTasks="+getTaskStringList(traversalEvent.getMergeTask())+" size="+traversalEvent.getMergeTask().size()
						+" previousTaskStr="+task.getPreviousTaskStr()
						+" ("+task.getUniqueString()+", "
						+getTasks().get(task.getPreviousTaskStr()).getUniqueString()+")");
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
			logger.debug("merge task:"+mergeTaskStr+" ("+getTasks().get(mergeTaskStr).getPreviousTaskStr()+")");
			try {
				applyMergingCriterion(mergeCells.get(mergeTaskStr), 
						getCells().get(getTasks().get(mergeTaskStr).getPreviousTaskStr()), 
						groupingStr);
			} catch (DataLinkNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TraversalChunkNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void fixOffTargetCells(mxICell root, final String groupingStr)
	{
		mxICellVisitor visitor=new mxICellVisitor() {
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				Task task=null;;
				try {
					task = loadTask(vertex);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String taskString = task.getUniqueString();
				TraversalEvent traversalEvent = task.getTraversalEvents().get(groupingStr);
				if (!getCopiedCells().containsKey(taskString))
				{
					if (getCopiedCells().containsKey(task.getPreviousTaskStr()))
					{
						mxICell cell = getCells().get(task.getPreviousTaskStr());						
						// check the childs
						for (Object o : getGraph().getOutgoingEdges(cell))
						{
							Object target = getTarget((mxCell) o); 
							//getGraph().getView().getVisibleTerminal(o, false);
							Task child=null;
							try {
								child = loadTask(target);
							} catch (TaskNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (!getCopiedCells().containsKey(child.getUniqueString()) && 
									!child.getGroupingCriteria().containsKey(groupingStr))
							{
								if (getGraph().isConnected(vertex, target))
									return true;
								logger.debug("fixOffTargetCells(): fix child: insert edge: "
										+taskString+"->"+child.getUniqueString());
								
								try {
									getGraph().insertEdgeEasyFlow(null, null, vertex, target,
											createDataLink(edge, child, groupingStr, null));
								} catch (DataLinkNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						// check parents
						for (Object o : getGraph().getIncomingEdges(cell))
						{
							Object source = getTarget((mxCell) o);
							//getGraph().getView().getVisibleTerminal(o, true);
							Task parent=null;;
							try {
								parent = loadTask(source);
							} catch (TaskNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (!getCopiedCells().containsKey(parent.getUniqueString()) && 
									!parent.getGroupingCriteria().containsKey(groupingStr))
							{
								if (getGraph().isConnected(source, vertex))
									return true;
								logger.debug("fixOffTargetCells(): fix parent: insert edge: "
										+parent.getUniqueString()+"->"+taskString);
								try {
									getGraph().insertEdgeEasyFlow(null, null, source, vertex,
											createDataLink(edge, task, groupingStr, null));
								} catch (DataLinkNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}								
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
	 * @throws TaskNotFoundException 
	 * @generated not
	 */
	public EList<TraversalEvent> getNewTraversalEvents(final TraversalEvent traversalEvent, mxICell root) throws TaskNotFoundException {
		
		final EMap<String, TraversalEvent> newTraversalEvents = new BasicEMap<String, TraversalEvent>();
		mxICellVisitor visitor=new mxICellVisitor() {
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				Task task=null;;
				try {
					task = loadTask(vertex);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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
				+" root="+loadTask(root).getUniqueString());
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
	
	private mxCell getSource(mxCell edge)
	{
		mxCell source=(mxCell) getGraph().getView().getVisibleTerminal(edge, true);
		return source;
	}
	
	private mxCell getTarget(mxCell edge)
	{
		mxCell target=(mxCell) getGraph().getView().getVisibleTerminal(edge, false);
		return target;
	}
	
	private Task getSourceTask(mxCell edge) throws TaskNotFoundException
	{
		mxCell source=getSource(edge);
		return loadTask(source);
	}
	
	private Task getTargetTask(mxCell edge) throws TaskNotFoundException
	{
		mxCell target=getTarget(edge);
		return loadTask(target);
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
				else //if (getMetaData().getGroupingInstancesByGroup().containsKey(key))
					for (GroupingInstance groupingInstance : getMetaData().getInstances(parentGroupStr, groupingStr, traversalChunk.getName())
						)
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

	
	private boolean doesTraversalEventExistFor(Task task)
	{
		for (TraversalEvent te:getTraversalEvents())
		{
			if (te.getMergeTask().contains(task))
				return true;
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean removeSubGraph(mxICell root, final TraversalEvent traversalEvent) {

		final EList<Object> tmpGraphCells = new BasicEList<Object>();
		final EList<Object> cells = new BasicEList<Object>();
		mxICellVisitor visitor=new mxICellVisitor()
		{
		
			@Override
			public boolean visit(Object vertex, Object edge) {
				Task task=null;
				try {
					task = loadTask(vertex);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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
				if (!doesTraversalEventExistFor(task))
				{
				getCopiedCells().remove(task.getUniqueString());
				tmpGraphCells.add(vertex);
				cells.add(getCells().get(task.getUniqueString()));
				}
				
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
	 * @throws GroupingCriterionNotFoundException 
	 * @generated not
	 */
	public EList<GroupingInstance> getGroupingInstances(TraversalEvent traversalEvent) throws GroupingCriterionNotFoundException {
		EList<GroupingInstance> groupingInstances = new BasicEList<GroupingInstance>();
		if (traversalEvent.isGrouping())
			if (traversalEvent.getType().equals("grouping"))
				//if (traversalEvent.getTraversalCriterion().getMode().equals("batch"))
				if (!getMetaData().getGroupingInstances().containsKey(traversalEvent.getTraversalCriterion().getId()))
					throw new GroupingCriterionNotFoundException();
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
		DefaultMetaData m=(DefaultMetaData)getMetaData();
		String key=traversalEvent.getTraversalCriterion().getId();
		logger.debug("applyTraversalEvents(): "
				+traversalEvent.getTraversalCriterion().getId()+" "
				+traversalEvent.getTraversalCriterion().getMode()
				+" parentTasks="+parentTasks
				+" splittingTask="+traversalEvent.getSplitTask().getUniqueString()
				+" mergeTasks="+mergeTasks
				+m.getGroupingInstances().keySet());
		return "applyTraversalEvents(): "
				+traversalEvent.getTraversalCriterion().getId()+" "
				+traversalEvent.getTraversalCriterion().getMode()
				+" parentTasks="+parentTasks
				+" splittingTask="+traversalEvent.getSplitTask().getUniqueString()
				+" mergeTasks="+mergeTasks
				+" #instances="+(m.getGroupingInstances().containsKey(key)?
								m.getGroupingInstances().get(key).getInstances().size():null)
				;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @generated not
	 */
	public TraversalEvent getNextTraversalEvent() throws TaskNotFoundException {

		if (getTraversalEvents().isEmpty())
		{
			getTraversalEvents().addAll(getTraversalEvents(getDefaultRootCell(), true));
			getTraversalEvents().add(TraversalFactory.eINSTANCE.createTraversalEvent());
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
				Task task=null;
				try {
					task = loadTask(vertex);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
				Task task=null;
				try {
					task = loadTask(vertex);
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Iterator<String> it = task.getTraversalEvents().keySet().iterator();
				while(it.hasNext())
				//for (String key: task.getTraversalEvents().keySet())
				{
					String key = it.next();
					TraversalEvent traversalEvent = task.getTraversalEvents().get(key);
					logger.debug(task.getName()+" "+key+" "+traversalEvent.isGrouping());
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

	public String getTaskNameForCell(Object cell)
	{
		for (String name:getCells().keySet())
			if (getCells().get(name).equals(cell))
				return name;
		return null;
	}
	
	public boolean isChildOf(Task child, Task parent) throws TaskNotFoundException
	{
		Object childCell=getCells().get(child.getUniqueString());
		Object parentCell=getCells().get(parent.getUniqueString());
		logger.trace("test child="+child.getUniqueString()+" vs. parent="+parent.getUniqueString());
		for (Object cell:getGraph().getVertices(parentCell, false))
		{
			logger.trace("child="+getTaskNameForCell(cell)+" vs="+getTaskNameForCell(childCell)
					+" isChild="+(cell==childCell)+" "+cell.hashCode()+" "+childCell.hashCode());
			if (cell == childCell )
				return true;
		}
		return false;
	}
	
	
	// 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateWorklowForExecutionSystem(mxICell root, IExecutionSystem executionSystem) {

		getGraph().traverseTopologicalOrder(root, executionSystem.getJgraphxVisitor());
		return true;
	}
	
	/*public boolean resolveToolDependencies(mxICell root)
	{
		Tool tool = ToolFactory.eINSTANCE.createTool();
		tool.setId("default");
		for (Object o:getGraph().getOutgoingEdges(root))
		{
			Task child = XMLUtil.loadTaskFromVertex(getGraph().getView().getVisibleTerminal(o, false));
			for (Tool childTool:child.getTools().values())
			{
				
				
			}
			
		}
		return true;
	}*/
	
	// set the tools ToolDependency, InputFiles, OutputFiles attributes
	// resolve the outputs and use them when resolving the inputs of the 
	// corresponding child tasks
	public boolean resolveToolDependencies(mxICell root, Catalog catalog)
	{
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge) {
				Task task=null;
				try {
					task = loadTask(vertex);
				} catch (TaskNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (task.getTools().isEmpty())
				{
					logger.debug("no tool found for task="+task.getUniqueString()+". nothing to do.");
					
				}
				else
				{
					for (Object o:getGraph().getOutgoingEdges(vertex))
					{
						Task child=null;
						try {
							child = getTargetTask((mxCell) o);
							//loadTask(getGraph().getView().getVisibleTerminal(o, false));
						} catch (TaskNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						task.getChunks().keySet();
						// set the static input dependencies, e.g. genomic reference
						for (Tool childTool:child.getTools().values())
						{
							childTool.getCommand().getInputs(task.getChunks());
							
						}
					}
					for (Entry<String, URI> e:task.getInputs().entrySet())
					{
						logger.debug(task.getUniqueString()+" "+e.getKey()+" "+e.getValue().toString());
					}
					logger.debug(task.getUniqueString()+" "+task.getTools().keySet().toString());
					for (Tool tool:task.getTools().values())
					{
						logger.debug("tool id="+tool.getId());
						
					}
				}
				return true;
			}
		};
		getGraph().traverseTopologicalOrder(root, visitor);
		//computeToolDepsForRoot(root);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CellNotFoundException 
	 * @generated not
	 */
	public EList<DataPort> getParentDataPortsFor(Task task) throws CellNotFoundException {
		EList<DataPort> parents = new BasicEList<DataPort>();
		if (!getCells().containsKey(task.getUniqueString()))
			throw new CellNotFoundException();
		logger.trace(getGraph().getIncomingEdges(getCells().get(task)));
		for (Object e:getGraph().getIncomingEdges(getCells().get(task)))
		{
			DataPort dataPort=getDataPortBySource(e);
			if (dataPort != null)
				parents.add(dataPort);
		}
			
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CellNotFoundException 
	 * @generated not
	 */
	public EList<DataPort> getChildDataPortsFor(Task task) throws CellNotFoundException {
		EList<DataPort> childs = new BasicEList<DataPort>();
		if (!getCells().containsKey(task.getUniqueString()))
			throw new CellNotFoundException();
		for (Object e:getGraph().getOutgoingEdges(getCells().get(task)))
		{
			childs.add(getDataPortByTarget(e));
		}
		return childs;
	}
	
	private DataPort getDataPortBySource(Object e)
	{
		String dataPortName=(String) ((mxCell)e).getValue();
		Object c=getSource((mxCell) e);
		//getGraph().getView().getVisibleTerminal(e, true);
		String parentTaskName = (String) ((mxCell)c).getValue();
		Task parentTask = getTasks().get(parentTaskName);
		return parentTask.getDataPortByName(dataPortName, true);
	}
	
	private DataPort getDataPortByTarget(Object e)
	{
		String dataPortName=(String) ((mxCell)e).getValue();
		Object c=getTarget((mxCell) e);
		//getGraph().getView().getVisibleTerminal(e, false);
		String childTaskName = (String) ((mxCell)c).getValue();
		Task childTask = getTasks().get(childTaskName);
		return childTask.getDataPortByName(dataPortName, false);
	}
	
	private EList<Task> getTasksForCells(Object[] os) throws TaskNotFoundException
	{
		EList<Task> tasks = new BasicEList<Task>();
		for (Object o:os)
		{
			tasks.add(loadTask(o));
		}
		return tasks;
	}
	
	private EList<mxICell> getInEdgesForDataPort(Object vertex, DataPort dataPort) throws DataLinkNotFoundException, TaskNotFoundException
	{
		EList<mxICell> cells = new BasicEList<mxICell>();
		Task task = loadTask(vertex);
		logger.trace("getInEdgesForDataPort(): retrieving incoming edges for "+task.getUniqueString());
		for (Object edge:getGraph().getIncomingEdges(vertex))
		{
			DataLink dataLink = loadDataLink(edge);
			logger.trace("getInEdgesForDataPort(): check edge to "+getSourceTask((mxCell) edge).getUniqueString());
			if (dataPort.isCompatible(dataLink.getDataPort()))
			{
				cells.add((mxICell) edge);
				logger.trace("getInEdgesForDataPort(): edge added");
			}
		}
		return cells;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<mxICell,EList<mxICell>> findCellsWithUntranslatedDataLinks() {
		final EMap<mxICell,EList<mxICell>> edges = new BasicEMap<mxICell, EList<mxICell>>();
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge) {
				if (edge==null)
					return true;
				try {
					Task sourceTask=getSourceTask((mxCell) edge);
					Task targetTask=getTargetTask((mxCell) edge);
					Task task = loadTask(vertex);
					DataLink dataLink=loadDataLink(edge);
					
					DataPort dataPortIn=dataLink.getDataPort();
					logger.debug(task.getUniqueString()+"("+sourceTask.getUniqueString()+"): "+dataLink.getTraversalName()+" "
							+dataLink.getParentGroupingStr()+"->"+dataLink.getGroupingStr()+" "
							+dataPortIn.getName()+" "
							//+dataPortIn.getGroupingCriteria()+" "+sourceTask.getGroupingCriteria()
							);
					if (!dataLink.getGroupingStr().equals(dataLink.getParentGroupingStr()))
						edges.put((mxICell) vertex, getInEdgesForDataPort(vertex, dataLink.getDataPort()));
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return true;
			}
		};
		getGraph().traverse(getDefaultRootCell(), true, visitor);
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 	 * 1.   test if current task (entry key) and its dataport which are going to be resolved
		 *   - have multiple inputs 
		 *   - have inputs consisting of more than one grouping instance
		 *   - have inputs consisting of instances of two or more different groups
		 * 1a.  test if the task can handle the inputs by its own 
		 *   - if yes: nothing to do
		 *   - else  : continue with step 2
		 *     
		 * 2. find the utility task that fits best to the input constellation as found in step 1
		 * 
		 * 3. create new filter task and insert into graph (using utility task from step 2 as template)
		 * 
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws DataLinkNotFoundException 
	 * @throws ToolNotFoundException 
	 * @throws DataPortNotFoundException 
	 * @throws UtilityTaskNotFoundException 
	 * @generated not
	 */
	public boolean resolveEdge(Map.Entry<mxICell, EList<mxICell>> entry) throws TaskNotFoundException, DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException {
				
		boolean rc=false;
		
		int constellation = 0x00;
		int processMultipleInputs    = 1;
		int processMultipleGroupings = 2;
		int processMultipleInstances = 4;
		
		Task task = loadTask(entry.getKey());
		logger.debug("apply filter for "+task.getUniqueString()+" "+entry.getValue().size());
		if (!entry.getValue().isEmpty())
		{
			DataLink firstDataLink = loadDataLink(entry.getValue().get(0));
			if (
					!task.canProcessMultipleInputsFor(null, firstDataLink.getDataPort())
				)
			{
				
			}
			else { 
				if (
					task.hasMultipleGroupingsFor(firstDataLink.getDataPort()) && task.canProcessMultipleGroupingsFor(null, firstDataLink.getDataPort())
					|| task.hasMultipleInputsFor(firstDataLink.getDataPort()) && task.canProcessMultipleInputsFor(null, firstDataLink.getDataPort())
					)
				{
				//constellation|=1<<
				}
			}
			//graph.getModel().beginUpdate(); try {
				
				EMap<mxICell, mxICell> cellMap = createFilterTasks(entry.getKey(), entry.getValue(), firstDataLink.getDataPort(), constellation);
				EMap<String, EList<TraversalChunk>> traversalChunks = new BasicEMap<String, EList<TraversalChunk>>();
				for (Entry<mxICell, mxICell> e:cellMap.entrySet())
				{
					Task t=loadTask(e.getKey());
					for (Entry<String, EList<TraversalChunk>> e1:task.getChunks())
						traversalChunks.put(e1.getKey(), new BasicEList(EcoreUtil.copyAll(e1.getValue())));
				}
				if (!cellMap.isEmpty())
				{
				Task newTask=createUtilityTask(traversalChunks, "merge", task.getName());
				mxICell newCell=getCells().get(newTask.getUniqueString());

				for (Entry<mxICell, mxICell> e:cellMap.entrySet())
				{
					logger.debug("insert edge: (filter-merge)"+loadTask(e.getKey()).getUniqueString()+"->"+newTask.getUniqueString());
					getGraph().insertEdgeEasyFlow(null, null, e.getKey(), newCell, loadDataLink(e.getValue()));
				}
				logger.debug("insert edge: (merge-task) "+newTask.getUniqueString()+"->"+task.getUniqueString());
				getGraph().insertEdgeEasyFlow(null, null, newCell, entry.getKey(), 
						createDataLink(firstDataLink.getDataPort(), task, "Record", "Record"));
				}
				
			//} finally { graph.getModel().endUpdate(); }

		}
		return rc;
	}

	private EMap<mxICell, mxICell> createFilterTasks(
			mxICell cell, 
			EList<mxICell> edges, 
			DataPort dataPort, 
			int constellation) 
					throws TaskNotFoundException, DataLinkNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException
	{
		boolean rc = false;
		Task task = loadTask(cell);
		EMap<mxICell, mxICell> cells = new BasicEMap<mxICell, mxICell>();
		EMap<String, EList<TraversalChunk>> coveredChunks = null;
		//Task filterTask=getUtilityTasks().get("filter");
		//filterTask.getProvidedGroupingsFor(null, dataPort);
		//Task mergeTask=getUtilityTasks().get("merge");
		
		//if (filterTask.getRequiredGroupingsFor(null, dataPort))
		logger.debug("createFilterTasks(): "+task.getUniqueString()+": requiredChunks="+task.getChunks().keySet());
		for (mxICell edge:edges)
		{
			DataLink dataLink = loadDataLink(edge);
			EMap<String, EList<TraversalChunk>> currentCoveredChunks = getCoveredChunks(
					getTargetTask((mxCell) edge),
					getSourceTask((mxCell) edge),
					dataLink.getDataPort());
			if (!currentCoveredChunks.isEmpty())
			{
			if (coveredChunks==null)
				coveredChunks=currentCoveredChunks;
			else
				for (Entry<String, EList<TraversalChunk>> e:currentCoveredChunks.entrySet())
				{
					//if (coveredChunks.containsKey(e.getKey()))
					coveredChunks.get(e.getKey()).addAll(e.getValue());
				}
			logger.debug("createFilterTasks(): coveredChunks="+coveredChunks.keySet());
			Task newTask=createUtilityTask(currentCoveredChunks, "filter", task.getName());
			mxICell newCell=getCells().get(newTask.getUniqueString());
			logger.debug("createFilterTasks(): "+newTask.getUniqueString());
			mxICell newEdge=(mxICell) getGraph().insertEdgeEasyFlow(null, null, getSource((mxCell) edge), newCell, dataLink);
			getGraph().removeCells(new Object[]{edge}, true);
			cells.put(newCell, newEdge);
					//createDataLink(edge, newTask, groupingStr, parentGroupingStr));
			}
			else
			{
				logger.debug("no chunks found that can be translated.");	
			}
		}
		return cells;
	}

	
	private EMap<String, EList<TraversalChunk>> getCoveredChunks(Task task, Task sourceTask, DataPort dataPort) throws ToolNotFoundException
	{
		EMap<String, EList<TraversalChunk>> allCoveredChunks = new BasicEMap<String, EList<TraversalChunk>>();
		//EList<String> requiredGroupings=task.getRequiredGroupingsFor(null, dataPort);
		//EList<String> providedGroupings=sourceTask.getProvidedGroupingsFor(null, dataPort);
		for (String groupingStr:task.getChunks().keySet())
		{
			EList<TraversalChunk> coveredChunks = task.getOverlappingChunksFor(sourceTask, groupingStr);
			if (!coveredChunks.isEmpty())
				allCoveredChunks.put(groupingStr, coveredChunks);
		}
		if (allCoveredChunks.isEmpty())
		{
			EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
			for (TraversalChunk traversalChunk : getRecordsForChunks(sourceTask))
			{
				for (TraversalChunk targetTC : getRecordsForChunks(task))
				{
					if (traversalChunk.getName().equals(targetTC.getName()))
						traversalChunks.add(traversalChunk);
							
				}
			}
			if (!traversalChunks.isEmpty())
				allCoveredChunks.put("Record", traversalChunks);
					
		}
		return allCoveredChunks;

	}	

	private EList<TraversalChunk> getRecordsForChunks(Task task)
	{
		EList<TraversalChunk> chunks = new BasicEList<TraversalChunk>();
		for (String groupingStr:task.getChunks().keySet())
		{
			if (!groupingStr.equals("Record"))
			{
				for (TraversalChunk traversalChunk:task.getChunks().get(groupingStr))
				{
					for (String rec : getMetaData().getRecordsBy(groupingStr, traversalChunk.getName()))
					{				
						TraversalChunk newTC = TraversalFactory.eINSTANCE.createTraversalChunk();
						newTC.setName(rec);
						chunks.add(newTC);
					}
				}
			}
			else
			{
				chunks.addAll(task.getChunks().get(groupingStr));
			}
		}
		return chunks;
	}
	
	private Task createUtilityTask(
			EMap<String, EList<TraversalChunk>> chunks,
			String utilityType,
			String uniqueString) 
					throws TaskNotFoundException, DataLinkNotFoundException, UtilityTaskNotFoundException
	{
		Task utilityTask;
		if (getUtilityTasks().containsKey(utilityType))
			utilityTask = EcoreUtil.copy(getUtilityTasks().get(utilityType));
		else
			throw new UtilityTaskNotFoundException();
		utilityTask.setName(utilityTask.getName()+(uniqueString==null||uniqueString.equals("")?"":"_"+uniqueString));
		utilityTask.getChunks().clear();
		for (Entry<String, EList<TraversalChunk>> e:chunks.entrySet())
		{
			utilityTask.getChunks().put(e.getKey(), new BasicEList<TraversalChunk>(EcoreUtil.copyAll(e.getValue())));
			logger.debug(e.getValue().size());
		}
		getTasks().put(utilityTask.getUniqueString(), utilityTask);
		getCells().put(utilityTask.getUniqueString(), (mxICell)getGraph().insertVertexEasyFlow(null, null, utilityTask));
		
		return utilityTask;
	}
	
	public EList<Task> getParentTasksFor(Task task) throws CellNotFoundException, TaskNotFoundException
	{
		
		if (getCells().contains(task.getUniqueString()))
		{
			Object[] es=getGraph().getEdgesBetween(getDefaultRootCell(), getCells().get(task.getUniqueString()), true);
			return getTasksForCells(es);
		}
			
		else
			throw new CellNotFoundException();
		
	}
	
	public EList<Task> getChildTasksFor(Task task) throws CellNotFoundException, TaskNotFoundException
	{
		final EList<Task> tasks = new BasicEList<Task>(); 
		mxICellVisitor visitor=new mxICellVisitor() {
			@Override
			public boolean visit(Object vertex, Object edge) {
				if (edge!=null)
					try {
						tasks.add(loadTask(vertex));
					} catch (TaskNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				return true;
			}
		};
		if (getCells().contains(task.getUniqueString()))
			getGraph().traverse(getCells().get(task.getUniqueString()), true, visitor);
		else
			throw new CellNotFoundException();
		return tasks;
		
	}

	public EList<Task> getSiblingTasksFor(Task task) throws CellNotFoundException, TaskNotFoundException
	{
		final EList<Task> tasks = new BasicEList<Task>();		
		final Object stopVertex=getCells().get(task.getUniqueString()); 
		if (stopVertex==null)
			throw new CellNotFoundException();

		mxICellVisitor visitor=new mxICellVisitor() {
			@Override
			public boolean visit(Object vertex, Object edge) {
				if (vertex.equals(stopVertex))
					return false;
				try {
					tasks.add(loadTask(vertex));
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
		};
		getGraph().traverse(getDefaultRootCell(), true, visitor);
		return tasks;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Task loadTask(Object vertex) throws TaskNotFoundException {
		if (vertex instanceof mxCell)
		{
			Object value=((mxCell)vertex).getValue();
			if (value==null)
				throw new TaskNotFoundException();
			if (value instanceof Element)
				return XMLUtil.loadTaskFromValue(value);
			else if (value instanceof String)
			{
				return getTasks().get(value);
			}
		}
		else
		{
			//todo: handle wrong type exception
			
		}
		return  null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public DataLink loadDataLink(Object edge) throws DataLinkNotFoundException {
		if (edge instanceof mxCell)
		{
			Object value=((mxCell)edge).getValue();
			if (value instanceof Element)
			{
				return XMLUtil.loadDataLinkFromEdge(edge);
			}
			else if (value instanceof String)
			{
				return getDataLinks().get((String)value);
			}
			else if (value instanceof Integer)
			{
				return getDataLinks().get(Integer.toString((Integer) value));
			}
		}
		else
		{
			//todo: handle wrong type exception
			
		}
		throw new DataLinkNotFoundException();
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
			case JgraphxPackage.UTIL__DATA_LINKS:
				return ((InternalEList<?>)getDataLinks()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.UTIL__UTILITY_TASKS:
				return ((InternalEList<?>)getUtilityTasks()).basicRemove(otherEnd, msgs);
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
			case JgraphxPackage.UTIL__DATA_LINKS:
				if (coreType) return getDataLinks();
				else return getDataLinks().map();
			case JgraphxPackage.UTIL__UTILITY_TASKS:
				if (coreType) return getUtilityTasks();
				else return getUtilityTasks().map();
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
			case JgraphxPackage.UTIL__DATA_LINKS:
				((EStructuralFeature.Setting)getDataLinks()).set(newValue);
				return;
			case JgraphxPackage.UTIL__UTILITY_TASKS:
				((EStructuralFeature.Setting)getUtilityTasks()).set(newValue);
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
			case JgraphxPackage.UTIL__DATA_LINKS:
				getDataLinks().clear();
				return;
			case JgraphxPackage.UTIL__UTILITY_TASKS:
				getUtilityTasks().clear();
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
			case JgraphxPackage.UTIL__DATA_LINKS:
				return dataLinks != null && !dataLinks.isEmpty();
			case JgraphxPackage.UTIL__UTILITY_TASKS:
				return utilityTasks != null && !utilityTasks.isEmpty();
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
