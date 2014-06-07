/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import easyflow.core.Catalog;
import easyflow.core.PreprocessingTask;
import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.core.CoreFactory;
import easyflow.core.Task;
import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.exception.TraversalChunkNotFoundException;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.data.Data;
import easyflow.data.DataFactory;
import easyflow.data.DataFormat;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.execution.IExecutionSystem;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.XMLUtil;
import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.Util;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.GroupingInstance;
import easyflow.metadata.MetadataFactory;
import easyflow.tool.Command;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Tool;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalEvent;
import easyflow.traversal.TraversalFactory;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToDataLinkMapImpl;
import easyflow.util.maps.impl.StringToGraphCellMapImpl;
import easyflow.util.maps.impl.StringToStringMapImpl;
import easyflow.util.maps.impl.StringToTaskMapImpl;
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
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getMostProcessedTasks <em>Most Processed Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getDefaultRootCell <em>Default Root Cell</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getProcessedEdgesCopyGraph <em>Processed Edges Copy Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getDeprecatedEdges <em>Deprecated Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getAddEdges <em>Add Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getCopiedCells <em>Copied Cells</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getCurrentSubGraphs <em>Current Sub Graphs</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getTraversalEvents <em>Traversal Events</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getNewTraversalEvents <em>New Traversal Events</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getDataLinks <em>Data Links</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getUtilityTasks <em>Utility Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UtilImpl#getUtilityTaskCells <em>Utility Task Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UtilImpl extends EObjectImpl implements Util {
	
	private static easyflow.custom.util.Util easyFlowUtil; 
	
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
	 * The cached value of the '{@link #getDeprecatedEdges() <em>Deprecated Edges</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecatedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<mxICell> deprecatedEdges;
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
	 * The cached value of the '{@link #getUtilityTaskCells() <em>Utility Task Cells</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilityTaskCells()
	 * @generated
	 * @ordered
	 */
	protected EList<mxICell> utilityTaskCells;
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
	public EList<mxICell> getDeprecatedEdges() {
		if (deprecatedEdges == null) {
			deprecatedEdges = new EDataTypeUniqueEList<mxICell>(mxICell.class, this, JgraphxPackage.UTIL__DEPRECATED_EDGES);
		}
		return deprecatedEdges;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<mxICell> getUtilityTaskCells() {
		if (utilityTaskCells == null) {
			utilityTaskCells = new EDataTypeUniqueEList<mxICell>(mxICell.class, this, JgraphxPackage.UTIL__UTILITY_TASK_CELLS);
		}
		return utilityTaskCells;
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
		try {
			return (mxCell) cell.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public boolean resolveTraversalEvents_Param(mxICell root)
	{
		boolean rc = true;
		// map to track all processed traversalevents: <grouping>_<mode>_<te's root> x <Traversalevent>
		final EMap<String, TraversalEvent> allTraversalEvents = new BasicEMap<String, TraversalEvent>();
		// track deprecated traversalevents : <task> x <te name>
		final EMap<String, EList<String>> deprecatedTraversalEvents = new BasicEMap<String, EList<String>>();
		
		mxICellVisitor visitor=new mxICellVisitor() {
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				
				try {
					Task   task       = loadTask(vertex);
					String taskString = task.getUniqueString();
					Task   parentTask = null;
					
					if (edge !=null)
						parentTask = getSourceTask((mxCell) edge);
					
					//logger.debug("task="+task.getUniqueString());
					for (Entry<String, TraversalEvent> entry : task.getTraversalEvents()) {
						
						
						if (entry.getValue().isGrouping())
							continue;
						
						//logger.debug("te="+entry.getKey()+" keyset="+allTraversalEvents.keySet());
						TraversalEvent traversalEvent = entry.getValue();
						
						if (allTraversalEvents.containsKey(entry.getKey()))
						{
							
							traversalEvent = allTraversalEvents.get(entry.getKey());
							if (entry.getValue().getSplitTask() == null && !entry.getValue().getMergeTask().isEmpty())
							{
								if (parentTask != null)
									traversalEvent.getMergeTask().add(parentTask);
								else
									logger.error("resolveTraversalEvents_Param(): no parent task found.");
								
								traversalEvent.getMergeTasksParamCrit().addAll(entry.getValue().getMergeTask());
								EList<String> depricatedTEs = null;
								if (deprecatedTraversalEvents.containsKey(taskString))
									depricatedTEs = deprecatedTraversalEvents.get(taskString);
								else
									depricatedTEs = new BasicEList<String>();
								if (!depricatedTEs.contains(entry.getKey()))
									depricatedTEs.add(entry.getKey());
								deprecatedTraversalEvents.put(taskString, depricatedTEs);
							}
							else
							{
								logger.error("resolveTraversalEvents_Param(): merge task expected but no merge task found.");
								//rc = false;
							}

						}
						else
						{
							//logger.debug("add:"+entry.getKey()+" "+entry.getValue());
							//allTraversalEvents.add(entry);
							allTraversalEvents.put(entry.getKey(), entry.getValue());
						}
					}
					
					
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
		};
		getGraph().traverse(root, true, visitor);
		
		removeDeprecatedTraversalEvents(deprecatedTraversalEvents, allTraversalEvents);
		
		return rc;
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
		
		boolean rc = true;
		if (!resolveTraversalEvents_Grouping(root))
			rc = false;
		if (!resolveTraversalEvents_Param(root))
			rc = false;
			
		return rc;
	}
	
	public boolean resolveTraversalEvents_Grouping(mxICell root) throws TaskNotFoundException, CellNotFoundException {
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
				Task task         = null;
				Task parentTask   = null;
				String taskString = null;
				DataLink dataLink = null;
				try {
					task = loadTask(vertex);
				
					taskString = task.getUniqueString();
					// set vertex's parent task
					
					if (edge != null)
					{
						parentTask=getSourceTask((mxCell) edge);
						dataLink=loadDataLink(edge);
					}
					
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				debug = (parentTask==null?"null":parentTask.getUniqueString())+"=>"+task.getUniqueString()+": ";
							
				String parentTaskString = parentTask != null ? parentTask.getUniqueString() : "root";
				
				// check defined TraversalEvents for task
				for (String te : task.getTraversalEvents().keySet()) {
					
					TraversalEvent traversalEvent = task.getTraversalEvents().get(te);
					if (!traversalEvent.isGrouping())
						continue;
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
						parentTraversalEvent.getMergeTask().add(task);

						// remove parent from parents merge task and deprecate current te only in case an unconditional edge is observed 
						if (dataLink.isUnconditional())
						{

							if (parentTraversalEvent.getMergeTask().contains(parentTask))
							{
								debug+=" remove merge task:"+parentTaskString;
								parentTraversalEvent.getMergeTask().remove(parentTask);
							}

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
					}
					// a new te for this particular path,
					else
					{
						/*if (deprecatedTraversalEvents.containsKey(taskString))
						{
							if (deprecatedTraversalEvents.get(taskString).contains(te))
							{
								logger.debug("te found");
								TraversalEvent te2 = traversalEvent;
								traversalEvent = TraversalFactory.eINSTANCE.createTraversalEvent();
								traversalEvent.setSplitTask(task);
								traversalEvent.getMergeTask().add(task);
								traversalEvent.getParentTask().add(parentTask);
								traversalEvent.setTraversalCriterion(te2.getTraversalCriterion());
								task.getTraversalEvents().put(te, traversalEvent);
								deprecatedTraversalEvents.get(taskString).remove(te);
							}
						}*/
						
						debug+="(new:";
						// if no parent set 
						if (parentTask == null)
						{
							debug+=" no parent ";
						}
						else
						{
							debug+=" parent="+parentTaskString+" ";
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
						// set the traversal events merge task
						if (!traversalEvent.getMergeTask().contains(task) && traversalEvent.isGrouping())
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
		
		removeDeprecatedTraversalEvents(deprecatedTraversalEvents, allTraversalEvents);

		
		// traverse graph to resolve traversal events implied by conditional edges
		mxICellVisitor visitor1=new mxICellVisitor() {
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				try {
					Task     task     = loadTask(vertex);
					DataLink dataLink = null;
					if (edge!= null)
					{
						dataLink = loadDataLink(edge);
						Task parentTask = getSourceTask((mxCell) edge);
						if (!dataLink.isUnconditional())
						{
							logger.debug("resolve traversal event for conditional edge of task="+parentTask.getUniqueString()+"=>"+task.getUniqueString()+" "+task.getTraversalEvents());
							
						}
					}
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return true;
			}
		};
		getGraph().traverseAllPaths(root, true, visitor1, null);
		
		//logger.debug("#traversalEvents="+getTraversalEvents().size()+" #"+getTraversalEvents(getDefaultRootCell(), true).size()+" root"+getDefaultRootCell());
		return true;
	}

	private boolean removeDeprecatedTraversalEvents(EMap<String, EList<String>> deprecatedTraversalEvents, EMap<String, TraversalEvent> allTraversalEvents)
	{
		boolean rc = true;
		// remove deprecated traversal events
		for (String task: deprecatedTraversalEvents.keySet())
		{
			for (String te : deprecatedTraversalEvents.get(task))
			{
				logger.debug("resolveTraversalEvents(): "
						+"removed traversal event "
						+((TraversalEvent)getTasks().get(task).getTraversalEvents().get(te)).hashCode()
						+" "+te+" from task "+task);
				if (getTasks().get(task).getTraversalEvents().removeKey(te)==null)
					rc = false;
			}
		}
		
		for (String key:allTraversalEvents.keySet()) {
			//System.out.println(key+" "+traversalEventsByParent.get(key).keySet());
			
				String parentTasks="("+StringUtils.join(getTaskStringList(allTraversalEvents.get(key).getParentTask()), ", ")+")";
				String mergeTasks="("+StringUtils.join(getTaskStringList(allTraversalEvents.get(key).getMergeTask()), ", ")+")";
				String paramMergeTasks="("+StringUtils.join(getTaskStringList(allTraversalEvents.get(key).getMergeTasksParamCrit()), ", ")+")";
				TraversalEvent traversalEvent=allTraversalEvents.get(key);
				//if (traversalEvent.getType().equals("grouping"))
				logger.debug("resolveTraversalEvents(): "+"processed traversal event "+key+" with"
						+" Parent:"+parentTasks
						+" Split:"+(traversalEvent.getSplitTask() != null ? 
								traversalEvent.getSplitTask().getUniqueString():null)
						+" Merge:"+mergeTasks+", paramMerge="+paramMergeTasks+""
						+" DataPort:"+(traversalEvent.getTraversalCriterion().getDataPort()!=null?
								traversalEvent.getTraversalCriterion().getDataPort().getName():null)
						+" te_type="+traversalEvent.getType()+" crit="+traversalEvent.getTraversalCriterion().getId()
						
						//+traversalEvent.isFoundMergeTask()
						+" "+traversalEvent.hashCode()
						);
		}
		return rc;
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
	public mxICell computeSubgraph(final TraversalEvent traversalEvent, final boolean isComplete) throws TaskNotFoundException {
		
		// track all new Tasks
		final Map<String, Object> addedTasks = new HashMap<String, Object>();
		final Map<String, String> addedEdges = new HashMap<String, String>();
		final EList<mxCell>     firstNodeTmp = new BasicEList<mxCell>();

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
					/*try {
						logger.debug(loadTask(vertex1).getUniqueString()+"->"+loadTask(target).getUniqueString());
					} catch (TaskNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
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
				if (traversalEvent.isGrouping() && !curTask.getGroupingCriteria().keySet().contains(traversalEvent.getTraversalCriterion().getId()))
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
                    if (firstNodeTmp.isEmpty())
                    	firstNodeTmp.add((mxCell) target);
                    
                    addedTasks.put(curTask.getUniqueString(), target);
				}
				else 
					target=addedTasks.get(curTask.getUniqueString());
				
				// the root node doesn't have an incoming edge
                if (edge1==null)
                {
                	if (traversalEvent.isGrouping())
                		return !mergeTaskReached && mergeTaskFound;
                	else
                		return !mergeTaskReached;
                }
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
                			//+" ("+source+" "+target+")"
                			);
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
                if (traversalEvent.isGrouping())
                	return !mergeTaskReached && mergeTaskFound;
                else
                	return !mergeTaskReached;
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
	public void applyTraversalEvent(mxICell root, TraversalEvent traversalEvent, String groupingStr, GroupingInstance groupingInstance) throws CellNotFoundException, TaskNotFoundException {
		EList<GroupingInstance> groupingInstances = new BasicEList<GroupingInstance>();
		groupingInstances.add(groupingInstance);
		applyTraversalEvent(root, traversalEvent, groupingStr, groupingInstances);
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
			final EList<GroupingInstance> groupingInstances
			//final String groupingInstance
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
				logger.trace(
						"applyTraversalEvent(): "+taskString 
						+ " #mergeTasks="        +traversalEvent.getMergeTask().size()
						+ " #incomingTasks("     +task.getPreviousTaskStr()+
						                     ")="+getGraph().getIncomingEdges(getCells().get(task.getPreviousTaskStr())).length
						//+ " cell=("              +getCells().get(task.getPreviousTaskStr())+")"
						+ " dataPort="           +traversalEvent.getTraversalCriterion().getDataPort().getName()
						);
				// apply the splitting criterion, i.e. check for all old parents
				// (task.getPreviousTask(), which doesn't have the te applied)
				// get all parent cells
				logger.trace("applyTraversalEvent(): "
						+task.getPreviousTaskStr()
						+" #incoming edges="+getGraph().getIncomingEdges(getCells().get(task.getPreviousTaskStr())).length);
				
				
				for (Object edgeIn : getGraph().getIncomingEdges(
						getCells().get(task.getPreviousTaskStr())))
				{
					Object parentCell = getSource((mxCell) edgeIn);
							//getGraph().getView().getVisibleTerminal(edgeIn, true);
					try {
						DataLink dataLink=loadDataLink(edgeIn);
						logger.debug("applyTraversalEvent(): check datalink for "
								+"parent="+getSourceTask((mxCell) edgeIn).getUniqueString()
								+" child="+getTargetTask((mxCell) edgeIn).getUniqueString()
								+" link: group="+dataLink.getGroupingStr()
								+" port="+dataLink.getDataPort().getName()
								+" conditional="+!dataLink.isUnconditional()
								+" te parents="+getTaskStringList(traversalEvent.getParentTask())
						);
						
						boolean shallProcess=true;
						if (traversalEvent.isGrouping() && !dataLink.isUnconditional())
							shallProcess=
								(task.shallProcess(groupingInstances, groupingStr, 
									dataLink.getCondition().getForbidden(), true)
									
								/*&& shallProcess(getTaskStringList(traversalEvent.getParentTask()), 
									groupingInstances, groupingStr, 
									dataLink.getCondition().getForbidden(), true)*/
									&& !dataLink.getCondition().getCircumventingParents().
										containsAll(getTaskStringList(traversalEvent.getParentTask()))
									);
						
						logger.debug("applyTraversalEvent(): check creation ("
								+" conditional="+!dataLink.isUnconditional()
								+", shallProcess="+shallProcess+" "
								+") of edge (to parent="
								+getSourceTask((mxCell) edgeIn).getUniqueString()+") mode="
								+traversalEvent.getTraversalCriterion().getMode());
						
						if (dataLink.isUnconditional() || shallProcess)
							applySplittingCriterion((mxICell) vertex,
								(mxICell) parentCell, edgeIn, groupingStr, 
								traversalEvent.getTraversalCriterion().getMode(),
								traversalEvent.isGrouping());
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

				logger.trace("applyTraversalEvent():"
						+" mergeTasks="     +getTaskStringList(traversalEvent.getMergeTask())
						+" size="           +traversalEvent.getMergeTask().size()
						+" previousTaskStr="+task.getPreviousTaskStr()
						+" ("               +task.getUniqueString()+", "
						                    +getTasks().get(task.getPreviousTaskStr()).getUniqueString()+")");

				if (containsTask(traversalEvent.getMergeTask(),
						getTasks().get(task.getPreviousTaskStr()))
					)
				{
					mergeCells.put(taskString, (mxICell) vertex);
					logger.debug("applyTraversalEvent(): previousTask="+task.getPreviousTaskStr()+" marked to be merged (for "+task.getUniqueString()+")");
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
			logger.debug("applyTraversalEvent(): merge task:"+mergeTaskStr+" ("+getTasks().get(mergeTaskStr).getPreviousTaskStr()+")");
			try {
				applyMergingCriterion(mergeCells.get(mergeTaskStr), 
						getCells().get(getTasks().get(mergeTaskStr).getPreviousTaskStr()), 
						groupingStr, groupingInstances, true);
			} catch (DataLinkNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TraversalChunkNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// apply parameter criterion to the merging tasks (listed in MergeTasksParamCrit) 
		for (Task task:traversalEvent.getMergeTasksParamCrit())
		{
			logger.debug("applyTraversalEvent(): param crit merge task: "+task.getUniqueString()
					+" "+isValidConversion(traversalEvent.getSplitTask(), task)
					+" for splitting task="+traversalEvent.getSplitTask().getUniqueString());
			if (!isValidConversion(traversalEvent.getSplitTask(), task))
				continue;

			// if more than one grouping instance is defined, add corresponding edges
			mxICell cell=getCells().get(task.getUniqueString());
			if (cell!=null)
			{
				logger.debug("applyTraversalEvent(): check "+getGraph().getIncomingEdges(cell).length+" more mering cells for param crit");
				for (Object edge:getGraph().getIncomingEdges(cell))
				{
					DataLink dataLink;
					try {
						dataLink = loadDataLink(edge);
						Task sourceTask = getSourceTask((mxCell) edge);
						
						logger.trace(dataLink.getUniqueString()+"("+dataLink.getId()+") "+sourceTask.getUniqueString());
						if (dataLink.getDataPort().isCompatible(traversalEvent.getTraversalCriterion().getDataPort()))
						{
							logger.trace("applyTraversalEvent(): process edge with port="+dataLink.getDataPort().getName()
									+" #groupings="+dataLink.getDataPort().getGroupingCriteria().size()
									+" key is contained in chunks="+dataLink.getChunks().containsKey(groupingStr)
									+" grouping="+dataLink.getGroupingStr()
									+" #chunks="+dataLink.getChunks().size()
									+" traversal event's grouping="+groupingStr
									+" shallProcess="+isValidConversion(dataLink.getChunks(), groupingStr, groupingInstances)
									+" groupingInstances="+easyFlowUtil.list2String(groupingInstances, "")+")"
									+" for param crit merge task");
							
							if (!groupingStr.equals(dataLink.getParamStr()))
							{
								DataLink newDataLink = createDataLink(dataLink, task, groupingStr, null, groupingInstances, false);
								//dataLink.setParamStr(groupingStr);
								logger.trace("applyTraversalEvent(): #chunks="+newDataLink.getChunks().size()+"("+groupingInstances.size()
										//+") first chunk="+newDataLink.getChunks().get(0).getName()
										+"("+groupingInstances.get(0).getName()+")"
										+")"
										);
								if (!getDeprecatedEdges().contains(edge))
									getDeprecatedEdges().add((mxICell) edge);
								logger.debug("applyTraversalEvent(): insert edge "+getSourceTask((mxCell) edge).getUniqueString()+"->"+loadTask(cell).getUniqueString()
										+" with dataLink="+newDataLink.getUniqueString(true)+" "+dataLink.getId()
										);
								getGraph().insertEdgeEasyFlow(null, null, getSource((mxCell) edge), cell, newDataLink);
							}
						}
					} catch (DataLinkNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else
			{
				logger.trace("applyTraversalEvent(): no cell found for merge task.");
			}
		}
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
		
		if (traversalEvent.isGrouping())
			return applyTraversalEventCopyGraph(root, traversalEvent, groupingInstances);
		else
			return applyTraversalEventCopyGraph_Param(root, traversalEvent, groupingInstances);
	}

	
	private mxICell applyTraversalEventCopyGraph_Param(mxICell root, 
			final TraversalEvent traversalEvent, 
			final EList<GroupingInstance> groupingInstances) throws TaskNotFoundException {
		
		final String               groupingStr         = traversalEvent.getTraversalCriterion().getId();
		final EMap<String, String> taskPreviousTaskMap = new BasicEMap<String, String>();
		final EList<mxICell>       returnCell          = new BasicEList<mxICell>();
		
		mxICellVisitor visitor=new mxICellVisitor() {
			String debug="";
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				
				
				try {
					Task task = loadTask(vertex);
					//DataLink inDataLink = null;
					//if (edge != null)
						//inDataLink = loadDataLink(edge);

					String taskString = task.getUniqueString();
					Task copyTask = createTask_Param(task, groupingStr, groupingInstances);
					
					taskPreviousTaskMap.put(taskString, copyTask.getUniqueString());
					mxICell cell = null;
					if (getTasks().containsKey(copyTask.getUniqueString()))
					{
						cell = getCells().get(copyTask.getUniqueString());
					}
					else 
					{
						getTasks().put(copyTask.getUniqueString(), copyTask);
						logger.debug("applyTraversalEventCopyGraph_Param(): added key:"+copyTask.getUniqueString()+" "+getTasks().keySet());
						// create the new cell
						cell = (mxICell) getGraph().insertVertexEasyFlow(null, null, copyTask);
						logger.debug("applyTraversalEventCopyGraph_Param(): added vertex:"+copyTask.getUniqueString());
					
						getCells().put(copyTask.getUniqueString(), (mxICell) cell);
					}
					if (returnCell.isEmpty()) 
						returnCell.add(cell);
					
					if (edge!=null)
					{
						
						Task source = getSourceTask((mxCell) edge);
						String taskStr=taskPreviousTaskMap.get(source.getUniqueString());
						DataLink dataLink = createDataLink(edge, copyTask, groupingStr, groupingStr, false);
						
						logger.debug("applyTraversalEventCopyGraph_Param(): insert edge="+taskStr+"->"+copyTask.getUniqueString()
								+" dataLink="+dataLink.getUniqueString(null, null, null)
									);
						getGraph().insertEdgeEasyFlow(null, null, 
								getCells().get(taskStr),
								cell,
								dataLink
								);
					}
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return true;
			}
		};
		

		graph.getModel().beginUpdate();		try		{
			getGraph().traverse(root, true, visitor);
			layoutGraph();
			
		}		finally		{			graph.getModel().endUpdate();		}

		return returnCell.size() > 0 ? returnCell.get(0) : null;
	}

	
	private void applySplittingCriterion(mxICell cell, mxICell parentCell,
			Object edgeIn, final String groupingStr, String mode,
			boolean isGrouping) throws TaskNotFoundException,
			DataLinkNotFoundException, TraversalChunkNotFoundException {
		
		boolean modeRequireAll = true;
		// boolean modeUseFirstMatchingGroupingStr = true;

		boolean requireAllChunks = false;
		boolean requireAllInstances = true;

		if (mode.equals("batch")) {
			// batch
			requireAllChunks = true;
			requireAllInstances = false;
			modeRequireAll = false;
		} else {
			// when task is in joint mode
			requireAllChunks = false;
			requireAllInstances = true;
			modeRequireAll = true;
		}

		// String currentParentGroupingStr = "";
		DataLink dataLink = null;

		// setup the chunks
		Task parentTask = loadTask((parentCell));
		Task task = loadTask(cell);

		logger.trace("applySplittingCriterion(): test parentTask="
				+ parentTask.getUniqueString() + " for "
				+ task.getUniqueString() + " #(parents chunks)="
				+ parentTask.getChunks().size());

		if (parentTask.isRoot()) {
			logger.debug("applySplittingCriterion(): insert edge: "
					+ parentTask.getUniqueString() + " ->"
					+ task.getUniqueString()+" case=root");

			getGraph().insertEdgeEasyFlow(null, null, parentCell, cell,
					createDataLink(edgeIn, task, groupingStr, null, isGrouping));
		} else {
			if (!isGrouping
					|| !task.getOverlappingRecordsProvidedBy(parentTask)
							.isEmpty())
			{
				logger.debug("applySplittingCriterion(): insert edge: "
						+ parentTask.getUniqueString() + " ->"
						+ task.getUniqueString()+" case=non root");
				getGraph().insertEdgeEasyFlow(null, null, parentCell, cell,
						createDataLink(edgeIn, task, groupingStr, null, isGrouping));
			}
		}
	}

	private void applyMergingCriterion(mxICell cell, mxICell previousCell,
			String groupingStr, EList<GroupingInstance> groupingInstances, boolean isGrouping
			)
					throws TaskNotFoundException, DataLinkNotFoundException,
					
			TraversalChunkNotFoundException {
		logger.trace("applyMergingCriterion(): "
				+ getGraph().getOutgoingEdges(cell).length + " "
				+ getGraph().getVertices(cell).size());

		Task task = loadTask(cell);
		// TraversalEvent traversalEvent =
		// task.getTraversalEvents().get(groupingStr);
		// get all child cells
		for (Object edgeOut : getGraph().getOutgoingEdges(previousCell)) {
			Object childCell = getTarget((mxCell) edgeOut);

			Task childTask = loadTask(((mxICell) childCell));
			DataLink outDataLink = loadDataLink(edgeOut);
			logger.trace("applyMergingCriterion(): " + "test edge: "
					+ task.getUniqueString()
					// +" (cell:"+cell+") "
					+ "->" + childTask.getUniqueString()
			// +"(cell"+childCell+")"
			);
			// logger.debug(childTask.getCircumventingParents());

			if (outDataLink != null) {
				logger.debug("applyMergingCriterion(): " 
						+ groupingStr + " instances=(" + easyFlowUtil.list2String(groupingInstances, "")+")"
						+ " shallProcess1="+((!outDataLink.isUnconditional()) ?
										(
										getTasks().get(outDataLink.getCondition().getCircumventingParents().get(0))
										.shallProcess(groupingInstances, groupingStr, 
												outDataLink.getCondition().getForbidden(),
												true)
										+"/"+
										childTask
										.shallProcess(
												groupingInstances,groupingStr,
												(outDataLink.getCondition() != null ? outDataLink
														.getCondition().getForbidden()
														: null), true)
										+"/"+
											shallProcess(outDataLink.getCondition().getCircumventingParents(), 
													groupingInstances, groupingStr, 
													outDataLink.getCondition().getForbidden(), 
													true)
										)
									: "NA"
									
									)
									
						//+ " shallProcess="+task.shallProcess(groupingInstances, groupingStr)
						//+ " shallProcess (child)="+childTask.shallProcess(groupingInstances, groupingStr)
						+ " metadata="+!getMetaData().containsColumn(groupingStr)
						//+ " cond="+outDataLink.getCondition()
						);
				if (
				// test for conditional edges
						(outDataLink.isUnconditional() ||
						(outDataLink.getCondition() != null &&
						
							(!outDataLink.getCondition().getCircumventingParents().isEmpty() &&
									shallProcess(outDataLink.getCondition().getCircumventingParents(), 
											groupingInstances, groupingStr, 
											outDataLink.getCondition().getForbidden(), 
											true) 
									&&

/*							getTasks().get(outDataLink.getCondition().getCircumventingParents().get(0))
								.shallProcess(groupingInstances, groupingStr, 
										outDataLink.getCondition().getForbidden(),
										true)
								&&*/
							childTask
								.shallProcess(
										groupingInstances, groupingStr,
										(outDataLink.getCondition() != null ? outDataLink
												.getCondition().getForbidden()
												: null), true)
												)
							)
						)
						//
						&& (!getMetaData().containsColumn(groupingStr) ||
						
							(task.shallProcess(groupingInstances, groupingStr)
						
							&& childTask.shallProcess(groupingInstances, groupingStr)
							))
				) {
					DataLink dataLink = createDataLink(edgeOut, childTask,
							groupingStr, null, isGrouping);
					if (
					// getProcessedEdgesCopyGraph().keySet().contains(task.getUniqueString())
					isEdgeInGraph(task, childTask, dataLink))
						logger.trace("applyMergingCriterion(): skip inserting edge (already processed)");

					// insert edge from cell to its child cell
					else {
						logger.debug("applyMergingCriterion(): "
								+ "insert edge: " + task.getUniqueString()
								+ "->" + childTask.getUniqueString() + ")");

						getGraph().insertEdgeEasyFlow(null, null, cell,
								childCell, dataLink);
						// getProcessedEdges().put(task.getUniqueString(),
						// childTask.getUniqueString());
					}
				}
				else
					logger.debug("applyMergingCriterion(): skip inserting edge due unmatched condition.");
			} else
				logger.debug("applyMergingCriterion(): skip inserting edge due datalink null pointer.");
		}
	}
	
	private boolean shallProcess(EList<String> tasks,
								EList<GroupingInstance> groupingInstances,
								String groupingStr,
								EList<String> jexl,
								boolean inverse)
	{
		
		boolean rc = false;
		
		boolean requireAll = false;
		//return true if at least one task indicates a valid processing
		for (String taskStr:tasks)
		{
			Task task = getTasks().get(taskStr);
			rc = task.shallProcess(groupingInstances, groupingStr, 
				jexl,
				inverse);
			logger.trace("shallProcess(): test "+task.getUniqueString()+" groupingStr="+groupingStr+" jexl="+jexl+" inverse="+inverse);
			if (requireAll && !rc)
				break;
		}
		
		return rc;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * apply the traversal criterion to the subgraph copy 
	 * - stop when grouping is not a valid along an edge
	 * - stop if task is not applicable to the grouping definition
	 * - stop if condition does not fit the conditional edge
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException
	 * @generated not
	 */
	public mxICell applyTraversalEventCopyGraph(mxICell root, 
			final TraversalEvent traversalEvent, 
			final EList<GroupingInstance> groupingInstances) throws TaskNotFoundException {

		final String               groupingStr              = traversalEvent.getTraversalCriterion().getId();
		final EMap<String, String> taskPreviousTaskMap      = new BasicEMap<String, String>();
		final EList<mxICell>       returnCell               = new BasicEList<mxICell>();
		final EList<String>        circumventingParentsLast = new BasicEList<String>();

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
				DataLink inDataLink = null;
				try {
					task = loadTask(vertex);
					if (edge != null)
						inDataLink = loadDataLink(edge);
					else
						circumventingParentsLast.clear();
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String taskString = task.getUniqueString();
				logger.trace("applyTraversalEventCopyGraph(): check task="+task.getUniqueString()
						+" group="+groupingStr
						+" valid="+isValidConversion(task.getChunks(), groupingStr, groupingInstances)
						+" inDataLink is uncond="+(inDataLink!=null?inDataLink.isUnconditional():null)
						);
				
				boolean shouldAddCircumventingParents = false;
				

				// check special conditions to possibly break this path and stop copying tasks
				if (!isValidConversion(task.getChunks(), groupingStr, groupingInstances))
					return false;
				if (!task.shallProcess(groupingInstances, groupingStr))
					return false;
				
				
				if (inDataLink != null && !inDataLink.isUnconditional())
				{
					logger.debug("applyTraversalEventCopyGraph(): check conditional edge.  "
							+" circumventing parents="+inDataLink.getCondition().getCircumventingParents()
							+" shall process="+getTasks().get(inDataLink.getCondition().getCircumventingParents().get(0)).
							shallProcess(groupingInstances, groupingStr, 
									inDataLink.getCondition().getForbidden(),
									true)
									);
					// skip, because this processing is not permitted
					if (!task.shallProcess(groupingInstances, groupingStr, 
						inDataLink.getCondition().getForbidden(),
						true))
					{
						logger.debug("skip due to unpermitted conditions: "+inDataLink.getCondition().getForbidden());
						return false;
					}
					// skip, because the circumventing parent
					else if (
							!shallProcess(inDataLink.getCondition().getCircumventingParents(),
										groupingInstances, groupingStr, 
										inDataLink.getCondition().getForbidden(),
										true
									)
						)
					{
							logger.debug("skip due to unpermitted conditions: "+inDataLink.getCondition().getForbidden());
							return false;
					}
					//
					else if (!inDataLink.getCondition().isUnconditional())
					{
						shouldAddCircumventingParents=true;
					}
						
				}

				// create the new task/cell and add it to a map with key of 
				// tasks unique string (without the current instance information resolved)				
				Task copyTask = createTask(task, groupingStr, groupingInstances); 
						
				if (shouldAddCircumventingParents)
				{
					copyTask.getCircumventingParents().addAll(
							inDataLink.getCondition().getCircumventingParents());
					//circumventingParentsLast.clear();
				}

				logger.trace("applyTraversalEventCopyGraph(): prevTaskStringMap put: "+taskString+" "+copyTask.getUniqueString());
				taskPreviousTaskMap.put(taskString, copyTask.getUniqueString());
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
					logger.debug("applyTraversalEventCopyGraph(): added vertex:"+copyTask.getUniqueString());
				
					getCells().put(copyTask.getUniqueString(), (mxICell) cell);
				}				
				
				if (returnCell.isEmpty()) 
					returnCell.add(cell);
				
				if (edge != null)
				{
					try 
					{
						Task source = null;
						source = getSourceTask((mxCell) edge);
						//DataLink oldDataLink=loadDataLink(edge);
						logger.debug("applyTraversalEventCopyGraph(): try to insert edge:"
								+(source!=null?source.getUniqueString():null)
								+" ("+taskPreviousTaskMap.get(source.getUniqueString())+") "
								+"->"+copyTask.getUniqueString()
								);
						if (
								//isEdgeInGraph(source, childTask, dataLink)
						getProcessedEdgesCopyGraph().containsKey(taskPreviousTaskMap.get(source.getUniqueString()))
							&& getProcessedEdgesCopyGraph().get(taskPreviousTaskMap.get(source.getUniqueString())).equals(copyTask.getUniqueString())
								//||(getProcessedEdges().containsKey(taskPreviousTaskMap.get(source.getUniqueString()))
								//&& getProcessedEdges().get(taskPreviousTaskMap.get(source.getUniqueString())).equals(copyTask.getUniqueString()))
								)
							logger.debug("applyTraversalEventCopyGraph(): skip already inserted edge");
						else
						{
							String taskStr=taskPreviousTaskMap.get(source.getUniqueString());
							//Task tmp=getTasks().get(taskStr);
							//logger.debug(tmp.getTraversalEvents().keySet()+" "+groupingStr);
							try {
								DataLink dataLink = createDataLink(edge, copyTask, groupingStr, groupingStr, true);
								
								logger.debug("applyTraversalEventCopyGraph(): insert edge (inserted!)");
								getGraph().insertEdgeEasyFlow(null, null, 
										getCells().get(taskStr),
										cell,
										dataLink
										);
								getProcessedEdgesCopyGraph().put(
										taskPreviousTaskMap.get(source.getUniqueString()),
										copyTask.getUniqueString());
								//getProcessedEdges().put(
									//	taskPreviousTaskMap.get(source.getUniqueString()),
										//copyTask.getUniqueString());
								
							} catch (DataLinkNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
						}
					} 
					catch (TaskNotFoundException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//if (!circumventingParentsCurrent.isEmpty())
					//circumventingParentsLast.addAll(circumventingParentsCurrent);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<mxICell, EList<mxICell>> findCellsWherePreprocessingIsRequired()
	{
		final EMap<mxICell, EList<mxICell>> prepRequired = new BasicEMap<mxICell, EList<mxICell>>();
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge) {
				try {
					Task task = loadTask(vertex);
					
					if (!task.getPreprocessingTasks().isEmpty())
					{
						Iterator<PreprocessingTask> it = task.getPreprocessingTasks().iterator();
						while (it.hasNext())
						{
							PreprocessingTask prepTask = it.next();
							
							
							if (getUtilityTasks().get(prepTask.getName())!=null)
							{
								prepTask.setTask(getUtilityTasks().get(prepTask.getName()));
								loadDataLink(edge).getIntermediateTasks().add(prepTask);
								logger.debug("findCellsWherePreprocessingIsRequired(): preprocessing task "+prepTask.getName()+" added for "+task.getUniqueString());
								EList<mxICell> prepEdges = prepRequired.containsKey(vertex)?prepRequired.get(vertex):new BasicEList<mxICell>();
								if (prepEdges.isEmpty())
									prepRequired.put((mxICell) vertex, prepEdges);
								prepEdges.add((mxICell) edge);
									
							}
							else
							{
								logger.debug("findCellsWherePreprocessingIsRequired(): omit preprocessing tasks for "+task.getUniqueString()+": Preptask="+prepTask.getName()+" expression="+prepTask.getExpression()+" found="+(getUtilityTasks().get(prepTask.getName())!=null));
							}
						}
					}
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
		};
		graph.getModel().beginUpdate();		try		{
			getGraph().traverse(getDefaultRootCell(), true, visitor);
			layoutGraph();
			
		}		finally		{			graph.getModel().endUpdate();		}
		return prepRequired;

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws DataLinkNotFoundException 
	 * @throws TaskNotFoundException 
	 * @generated not
	 */
	public boolean resolvePreprocessingTask(mxICell vertex, mxICell edge) throws DataLinkNotFoundException, TaskNotFoundException {
		
		boolean nested = true;
		if (nested)
			return resolvePreprocessingTaskChained(vertex, edge);
		else
			return resolvePreprocessingTaskParallel(vertex, edge);
	}
		
		
	private boolean resolvePreprocessingTaskParallel(mxICell vertex, mxICell edge) throws TaskNotFoundException, DataLinkNotFoundException
	{
		boolean rc = false;
		Task task = loadTask(vertex);
		Iterator<PreprocessingTask> it = loadDataLink(edge).getIntermediateTasks().iterator();
		DataLink dataLink = loadDataLink(edge);
		
		while (it.hasNext())
		{
			
			PreprocessingTask prepTask = it.next();
			Task newPrepTask = (Task) EcoreUtil.copy(prepTask.getTask());
			logger.trace("resolvePreprocessingTask(): insertPrepTask="+newPrepTask.getUniqueString()+" for "+task.getUniqueString()+" "+prepTask.getTask().getPreferredTool());
			rc = true;
			// insert the new vertex 
			Object newVertex = getGraph().insertVertexEasyFlow(null, null, newPrepTask);
			// link with parent
			getGraph().insertEdgeEasyFlow(null, null, getSource((mxCell) edge), newVertex, copyDataLink(dataLink));
			// link with child
			getGraph().insertEdgeEasyFlow(null, null, newVertex, vertex, copyDataLink(dataLink));
			
		}

		// remove obsolet parent and child edge
		getGraph().removeCells(new Object[]{edge}, true);

		return rc;
		
		
	}
	
	private boolean resolvePreprocessingTaskChained(mxICell vertex, mxICell edge) throws DataLinkNotFoundException, TaskNotFoundException {
		
		boolean  rc       = false;
		Task     task     = loadTask(vertex);
		DataLink dataLink = loadDataLink(edge);
		boolean  first    = true;
		mxICell  last     = null;
		
		Iterator<PreprocessingTask> it = loadDataLink(edge).getIntermediateTasks().iterator();
		while (it.hasNext())
		{
			
			mxICell source = first ? getSource((mxCell) edge) : last;
			first = false;
			PreprocessingTask prepTask = it.next();
			Task newPrepTask = (Task) EcoreUtil.copy(prepTask.getTask());
			
			logger.trace("resolvePreprocessingTask(): insertPrepTask="+newPrepTask.getUniqueString()+" for "+task.getUniqueString()+" "+prepTask.getTask().getPreferredTool());
			rc = true;
			// insert the new vertex 
			Object newVertex = getGraph().insertVertexEasyFlow(null, null, newPrepTask);
			
			// link with parent
			getGraph().insertEdgeEasyFlow(null, null, source, newVertex, copyDataLink(dataLink));
			last = (mxICell) newVertex;
			
		}
		getGraph().insertEdgeEasyFlow(null, null, last, vertex, copyDataLink(dataLink));
		// remove obsolet parent and child edge		
		getGraph().removeCells(new Object[]{edge}, true);
		return rc;
	}
	


	private DataLink createDataLink(DataLink dataLink, Task task, String groupingStr, String parentGroupingStr, EList<GroupingInstance> groupingInstances, boolean isGrouping)
	{
		DataLink newDataLink = null;
		if (isGrouping)
		{
			newDataLink = DataFactory.eINSTANCE.createDataLink();
			newDataLink.setGroupingStr(groupingStr);
			newDataLink.setParamStr(dataLink.getParamStr());
			if (dataLink.getCondition()!=null && !dataLink.getCondition().isUnconditional())
				newDataLink.setCondition(dataLink.getCondition());
			if (parentGroupingStr != null)
				newDataLink.setParentGroupingStr(parentGroupingStr);
			newDataLink.setDataPort(EcoreUtil.copy(dataLink.getDataPort()));
			newDataLink.setInDataPort(EcoreUtil.copy(dataLink.getInDataPort()));
		}
		else
		{
			newDataLink = EcoreUtil.copy(dataLink);
			newDataLink.setId(0);
			newDataLink.setParamStr(groupingStr);
		}

		
		if (groupingInstances != null && !groupingInstances.isEmpty())
		{
			for (GroupingInstance groupingInstance : groupingInstances)
			{
				TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
				traversalChunk.setName(groupingInstance.getName());
				logger.trace("createDataLink(): add chunk from grouping instance="+groupingInstance.getName()+" with grouping="+groupingInstance.getGroupingStr());
				EList<TraversalChunk> chunks = null;
				String curGroupingStr = groupingStr;
				if (groupingInstance.getGroupingStr()!=null && newDataLink.getChunks().containsKey(groupingInstance.getGroupingStr()))
					curGroupingStr = groupingInstance.getGroupingStr();
				else if (!newDataLink.getChunks().containsKey(groupingStr))
				{
					chunks = new BasicEList<TraversalChunk>();
					newDataLink.getChunks().put(groupingStr, chunks);
					logger.trace("createDataLink(): put into chunks map: "+groupingStr);
				}
				chunks = newDataLink.getChunks().get(curGroupingStr);
				chunks.add(traversalChunk);
				logger.trace("createDataLink(): added chunks:"+traversalChunk.getName());
			}
			
		}
		else
		{
			
			logger.error("no grouping instances defiend.");
		}
		int i = task.getChunks().indexOfKey(groupingStr);		
		if (i!=-1)
		{
			EList<TraversalChunk> chunks = new BasicEList<TraversalChunk>();
			Iterator<TraversalChunk> it  = task.getChunks().get(i).getValue().iterator();
			while (it.hasNext())
			{
				chunks.add(it.next());
			}
			newDataLink.getChunks().put(groupingStr, chunks);
			//newDataLink.setTraversalName(task.getChunks().get(i).getKey());
		}

		return newDataLink;
	}
	
	private DataLink createDataLink(Object edge, Task task, String groupingStr, String parentGroupingStr, boolean isGrouping) throws DataLinkNotFoundException
	{
		DataLink dataLink = loadDataLink(edge);
		//if (dataLink != null)
		logger.trace("createDataLink(): groupingStr="+dataLink.getGroupingStr()
				+" id="+dataLink.getId()+" parentGroupingStr="+dataLink.getParentGroupingStr()
				//+" dataPort="+dataLink.getDataPort()!=null?dataLink.getDataPort().getName():null
				+" chunks="+easyFlowUtil.list2String(dataLink.getChunks(), null)
				//+" conditions circumventing parents="+dataLink.getCondition()==null?
					//	null:dataLink.getCondition().getCircumventingParents()==null?
						//		null:StringUtils.join(dataLink.getCondition().getCircumventingParents(), ", ")
								);
		return createDataLink(dataLink, task, groupingStr, parentGroupingStr, null, isGrouping);
		//else
			//return createDataLink(null, task, groupingStr, parentGroupingStr);
	}
	
	
	private void copyTask(Task fromTask, Task toTask)
	{
		
		if (fromTask.getCommand() == null && fromTask.getPreferredTool() != null)
			toTask.setCommand(EcoreUtil.copy(fromTask.getPreferredTool().getCommand()));
		
		Command cmd = fromTask.getCommand() != null ? fromTask.getCommand() : toTask.getCommand();
		
		toTask.setCommand(EcoreUtil.copy(cmd));
		Iterator<Entry<String, ResolvedParam>> it1 = cmd.getResolvedParams().iterator();
		while (it1.hasNext())
		{
			Entry<String, ResolvedParam> e = it1.next();
			toTask.getCommand().getResolvedParams().put(e.getKey(), EcoreUtil.copy(e.getValue()));
		}
	}
	
	private void copyTaskAttributes(Task task, Task copyTask)
	{
		for (int i=0; i<copyTask.getInDataPorts().size(); i++)
		{
			DataPort dataPort     = task.getInDataPorts().get(i);
			DataPort copyDataPort = copyTask.getInDataPorts().get(i);
			if (copyDataPort.getName().equals(dataPort.getName()))
				copyDataPort.getGroupingCriteria().addAll(dataPort.getGroupingCriteria());
		}
	}
	
	private Task createTask_Param(Task task, String groupingStr, EList<GroupingInstance> groupingInstances)
	{
		Task copyTask=EcoreUtil.copy(getTasks().get(task.getUniqueString()));
		copyTask(task, copyTask);
		copyTask.setPreviousTaskStr(task.getUniqueString());
		logger.trace("createTask(): (param traversal) "+copyTask.getChunks().keySet()+" from task="+task.getUniqueString());
		
		//if (keepCell)
			//task.setFlags(task.getFlags() | 0x0010);
		if (!copyTask.getChunks().keySet().contains(groupingStr))
			copyTask.getChunks().put(groupingStr, new BasicEList<TraversalChunk>());
		EList<TraversalChunk> traversalChunks = copyTask.getChunks().get(groupingStr);
		Iterator<GroupingInstance> it = groupingInstances.iterator();
		while (it.hasNext())
		{
			TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
			traversalChunk.setName(it.next().getName());
			traversalChunks.add(traversalChunk);
		}
		return copyTask;
	}
	
	private Task createTask(Task task, String groupingStr, EList<GroupingInstance> groupingInstances)
	{
		
		logger.trace("createTask(): create new Task from "+task.getUniqueString()+" with chunks="
				+task.getChunks().keySet()+"and grouping="+groupingStr);
		if (!task.getGroupingCriteria().containsKey(groupingStr))
		{
			// don't remove this task
			task.setFlags(task.getFlags() | 0x0010);
			logger.trace("createTask(): mark to keep="+task.getUniqueString()+" "+task.getFlags());
			return task;
		}
		Task copyTask=EcoreUtil.copy(getTasks().get(task.getUniqueString()));
		copyTask(task, copyTask);
		
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
		
		//copyTaskAttributes(task, copyTask);
		logger.trace("createTask(): "+traversalChunks.size()+"("
				+copyTask.getChunks().get(groupingStr).size()+") " +
						"chunks added for Task="+copyTask.getUniqueString()
		);

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
				Task     task     = null;
				DataLink dataLink = null;
				try {
					task = loadTask(vertex);
					if (edge != null)
						dataLink = loadDataLink(edge);
					
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// omit generating traversal events when the parent task is known to be opted out
				// due to conditional edge (manifested by tasks attribute circumventingParents
				if (task.getCircumventingParents()!=null && !task.getCircumventingParents().isEmpty())
				{
					logger.trace("getNewTravEvents(): "+task.getUniqueString()
							+" circumvents "+task.getCircumventingParents());
					//logger.debug(traversalEvent.getParentTask());
					for (Task parentTask:traversalEvent.getParentTask())
						if (task.getCircumventingParents().contains(parentTask.getName()))
							return false;
				}
				
				// check splitting task
				logger.trace("getNewTravEvents(): "
						+task.getUniqueString()+" vs "+traversalEvent.getSplitTask().getUniqueString());
				
				if (task.getName().equals(traversalEvent.getSplitTask().getName()))
				{
					TraversalEvent newTraversalEvent =
							getNewTraversalEventBySplittingTask(task, traversalEvent);
					logger.trace("getNewTravEvents(): create new TraversalEvent with splitting task="
							+task.getUniqueString());
					newTraversalEvents.put(task.getUniqueString(), newTraversalEvent);
					// set merging task as well, if it contains the splitting task
					if (newTraversalEvent.getMergeTask().contains(traversalEvent.getSplitTask()))
					{
						newTraversalEvent.getMergeTask().remove(traversalEvent.getSplitTask());
						//if (newTraversalEvent.getMergeTask().)
						newTraversalEvent.getMergeTask().add(task);
					}
				}
				// check and update the merging tasks
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
									logger.debug("getNewTravEvents(): add merge task: "+task.getUniqueString());
									newTraversalEvents.get(key).getMergeTask().add(task);
								}
							}
						}
					}
					for (String key : mergeTasksToDelete.keySet())
					{
						logger.trace("getNewTravEvents(): remove merge task: "+mergeTasksToDelete.get(key).getUniqueString());
						newTraversalEvents.get(key).getMergeTask().remove(mergeTasksToDelete.get(key));
					}
					
					mergeTasksToDelete.clear();
					for (Task mergeTaskParamCrit : traversalEvent.getMergeTasksParamCrit())
					{
						if (mergeTaskParamCrit.getName().equals(task.getName()) &&
								!mergeTaskParamCrit.getUniqueString().equals(task.getUniqueString()))
						{
							for (String key : newTraversalEvents.keySet())
							{
								//if (isValidConversion(newTraversalEvents.get(key).getSplitTask(), task))
								logger.debug("getNewTravEvents(): add param crit merge task: "+task.getUniqueString()+" "+task.hashCode()+" "+traversalEvent.getTraversalCriterion().getId());
								if (!mergeTasksToDelete.containsKey(key))
									mergeTasksToDelete.put(key, mergeTaskParamCrit);
								if (!newTraversalEvents.get(key).getMergeTasksParamCrit().contains(task))
									newTraversalEvents.get(key).getMergeTasksParamCrit().add(task);
							}
						}
					}
					for (String key : mergeTasksToDelete.keySet())
					{
						logger.trace("getNewTravEvents(): remove param crit merge task: "+mergeTasksToDelete.get(key).getUniqueString());
						newTraversalEvents.get(key).getMergeTasksParamCrit().remove(mergeTasksToDelete.get(key));
					}
						
				}
				return true;
			}
		};
		logger.debug("getNewTravEvents():"
				+" parentTasks=("+StringUtils.join(getTaskStringList(traversalEvent.getParentTask()), ", ")+")"
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
		EList<String> te2Remove = new BasicEList<String>();
		for (String key : newTraversalEvents.keySet())
		{
			
			Task tmp = getTasks().get(key);
			if (!tmp.getUniqueString().equals(tmp.getPreviousTaskStr()) && newTraversalEvents.containsKey(tmp.getPreviousTaskStr()))
			{
				te2Remove.add(tmp.getPreviousTaskStr());
				logger.debug("getNewTravEvents(): marked "+tmp.getPreviousTaskStr()+" to be removed.");
			}
			TraversalEvent travEvent = newTraversalEvents.get(key);
			logger.debug("getNewTravEvents(): "+key
					+" parentTasks=("+StringUtils.join(getTaskStringList(travEvent.getParentTask()), ", ")+")"
					+" splitTask="+travEvent.getSplitTask().getUniqueString()
					+" mergeTasks=("+StringUtils.join(getTaskStringList(travEvent.getMergeTask()), ", ")+")");
		}
		
		if (newTraversalEvents.isEmpty())
			newTraversalEvents.put(traversalEvent.getSplitTask().getUniqueString(), traversalEvent);
		else if (!te2Remove.isEmpty())
			for (String key : te2Remove)
				newTraversalEvents.removeKey(key);
			
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
	
	private EList<String> getTaskStringList(EList<Task> tasks)
	{
		EList<String> taskStrings = new BasicEList<String>();
		for (Task task:tasks)
			taskStrings.add(task.getUniqueString());
		return taskStrings;
	}	
	
	// used in getNewTraversalEvents
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


	// used in applyTraversalEventCopyGraph
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
	
	// internally used
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
	
	/*
	// used in applyTraversalEvent (for param crit merge task)
	private boolean isValidConversion(
			EList<TraversalChunk> traversalChunks,
			EList<GroupingInstance> groupingInstances) {

		if (traversalChunks.isEmpty())
			return true;

		for (GroupingInstance groupingInstance : groupingInstances) 
		{
			if (isValidConversion(traversalChunks, groupingInstance.getName()))
				return true;
		}
		return false;
	}
	
	private boolean isValidConversion(EList<TraversalChunk> traversalChunks, String instanceStr)
	{
		boolean isValid = false; 
		for (TraversalChunk traversalChunk : traversalChunks)
		{
			if (traversalChunk.getName().equals(instanceStr))
				{
					isValid = true;
					break;
				}
		}
		return isValid;


	}
	*/	
	
	private boolean isEdgeInGraph(Task parentTask, Task childTask, DataLink dataLink) throws TaskNotFoundException, DataLinkNotFoundException
	{
		boolean rc = false;
		String parentTaskName = parentTask.getUniqueString();
		String childTaskName  = childTask.getUniqueString();
		if (getTasks().containsKey(parentTaskName) && getCells().containsKey(parentTaskName))
		{
			mxICell parentVertex = getCells().get(parentTaskName);
			for (Object edgeOut:getGraph().getOutgoingEdges(parentVertex))
			{
				if (getTargetTask((mxCell) edgeOut).getUniqueString().equals(childTaskName))
				{
					if (dataLink != null)
					{
						DataLink curDataLink = loadDataLink(edgeOut);
						if (
								dataLink.getDataPort().getName().equals(curDataLink.getDataPort().getName()) &&
								dataLink.getGroupingStr().equals(curDataLink.getGroupingStr())
								)
							rc = true;
						
					}
					else
					{
						rc = true;
					}
					
					if (rc)
						break;
				}
			}
		}
		return rc;
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
			{
				logger.trace("doesTraversalEventExistFor(): task "+task.getUniqueString()+" contained in list="+getTaskStringList(te.getMergeTask()));
				return true;
			}
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
				else
				{
					logger.debug("removeSubGraph(): skip task "+task.getUniqueString()+" due to traversal event, which contains this task.");
				}
				
				return true;
			}
		};
		// reset flag indicating not to include into subgraph copy
		getGraph().traverse(root, true, visitor);

		graph.getModel().beginUpdate();try{
			getGraph().removeCells(cells.toArray(), true);
			
			getGraph().removeCells(tmpGraphCells.toArray(), true);
			getGraph().removeCells(getDeprecatedEdges().toArray());
			layoutGraph();
		
		}finally{graph.getModel().endUpdate();}

		getProcessedEdgesCopyGraph().clear();
		// reset flag indicating not to be removed
		return !tmpGraphCells.isEmpty() || !cells.isEmpty();
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws GroupingCriterionNotFoundException 
	 * @generated not
	 */
	public EList<GroupingInstance> getGroupingInstances(TraversalEvent traversalEvent) throws GroupingCriterionInstanceNotFoundException
	{
		EList<GroupingInstance> groupingInstances = new BasicEList<GroupingInstance>();
		if (traversalEvent.isGrouping())
		{
			//if (traversalEvent.getType().equals("grouping"))
				//if (traversalEvent.getTraversalCriterion().getMode().equals("batch"))
				if (!getMetaData().getGroupingInstances().containsKey(traversalEvent.getTraversalCriterion().getId()))
					throw new GroupingCriterionInstanceNotFoundException();
				for (GroupingInstance groupingInstance :
						getMetaData().getGroupingInstances().
					get(traversalEvent.getTraversalCriterion().getId()).getInstances())
				{
					groupingInstances.add(groupingInstance);
				}
			//else if (traversalEvent.getType().equals("traversal"))
		}
		else
		{
			// check if preferred tool has a corresponding input data param defined
			TraversalCriterion tc = traversalEvent.getTraversalCriterion();
			logger.trace("getGroupingInstances(): get instances for parameter traversal=("+traversalEvent.getType()+", "+tc.getId()+") op="+tc.getOperation().getName());
			if (tc.getChunks().isEmpty())
			{
				if (GlobalConstants.TRAVERSAL_CHUNK_SOURCE_TYPE_METADATA.equals(tc.getOperation().getName()))
				{
					if (tc.getChunkSource()!=null && !tc.getChunkSource().equals(""))
					{
						//traversalEvent.getSplitTask().getDataPortByName(dataPortName, isOutDataPort)
						if (tc.getDataPort()!=null)
						{
							EList<TraversalChunk> traversalChunks = traversalEvent.getSplitTask().getRecords(true);
							logger.debug("getGroupingInstances(): dataport="+tc.getDataPort().getName()
									+" with "+tc.getDataPort().getGroupingCriteria().size()+" tarversal criteria found. "
									+" #rec="+traversalChunks.size()
									+" source="+tc.getChunkSource()
									+" "+getMetaData().getColumn(tc.getChunkSource()));
							
							if (traversalChunks.isEmpty())
							{
								logger.error("getGroupingInstances(): no records found.");
							}
							else
							{
								boolean found = false;
								Iterator<TraversalChunk> it = traversalChunks.iterator();
								
								while (it.hasNext())
								{
									TraversalChunk chunk = it.next();
									if (getMetaData().getColumn(tc.getChunkSource()).containsKey(chunk.getName()))
									{
										String[] elements = getMetaData().getColumn(tc.getChunkSource()).get(chunk.getName()).split(",");
										for (String element : elements)
										{
											GroupingInstance groupingInstance = MetadataFactory.eINSTANCE.createGroupingInstance();
											groupingInstance.setName(element);
											
											groupingInstances.add(groupingInstance);
											found = true;
										}
									}
								}
								
								if (!found)
									logger.error("getGroupingInstances(): no adequate grouping instance found.");
								else
									logger.trace("getGroupingInstances(): "+groupingInstances.size()+" instances added.");
							}
						}
						else
							logger.error("getGroupingInstances(): no dataport specified.");
					}
					else
						logger.error("getGroupingInstances(): no source found for operation "+tc.getOperation().getName());
				}
				else
					logger.error("getGroupingInstances(): operation "+tc.getOperation().getName()+" not supported.");
			}
			else
			{
				Iterator<String> it = tc.getChunks().keySet().iterator();
				while (it.hasNext())
				{
					TraversalChunk traversalChunk = tc.getChunks().get(it.next());
					GroupingInstance groupingInstance = MetadataFactory.eINSTANCE.createGroupingInstance();
					groupingInstance.setName(traversalChunk.getName());
					logger.debug("add grouping instance from chunk="+traversalChunk.getName());
					groupingInstances.add(groupingInstance);
				}
			}
			
		}
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
		String str = traversalEvent.getTraversalCriterion().getId()+" "
				+traversalEvent.getTraversalCriterion().getMode()
				+" parentTasks="  +parentTasks
				+" splittingTask="+traversalEvent.getSplitTask().getUniqueString()
				+" mergeTasks="   +mergeTasks
				+" #instances="   +(m.getGroupingInstances().containsKey(key)?
					m.getGroupingInstances().get(key).getInstances().size():null); 
		//logger.debug("applyTraversalEvents(): "+str);

		return str;
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
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @generated not
	 */
	public TraversalEvent getNextTraversalEvent(boolean isGrouping) throws TaskNotFoundException {

		//logger.debug(""+getTraversalEvents().size()+" "+getNewTraversalEvents().size()+" "+getDefaultRootCell());
		if (getTraversalEvents().isEmpty())
		{
			getTraversalEvents().addAll(getTraversalEvents(getDefaultRootCell(), isGrouping));
			getTraversalEvents().add(TraversalFactory.eINSTANCE.createTraversalEvent());
		}
		if (getNewTraversalEvents().isEmpty() &&
			!getTraversalEvents().isEmpty())
		{
			if (getTraversalEvents().get(0).getSplitTask() == null)
			{
				getTraversalEvents().remove(0);
				return null;
			}
			
			getNewTraversalEvents().addAll(
					getNewTraversalEvents(
							getTraversalEvents().remove(0), 
							getDefaultRootCell()));
		}
		
		return getNewTraversalEvents().remove(0);
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
					logger.trace("getTraversalEvents(): "+task.getName()+" "+key+" isGrouping="+traversalEvent.isGrouping());
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
	
	public boolean isChildOf(Task child, Task parent)
	{
		Object childCell=getCells().get(child.getUniqueString());
		Object parentCell=getCells().get(parent.getUniqueString());
		//logger.trace("test child="+child.getUniqueString()+" vs. parent="+parent.getUniqueString());
		for (Object cell:getGraph().getVertices(parentCell, false))
		{
			//logger.trace("child="+getTaskNameForCell(cell)+" vs="+getTaskNameForCell(childCell)
				//	+" isChild="+(cell==childCell)+" "+cell.hashCode()+" "+childCell.hashCode());
			if (cell == childCell )
				return true;
		}
		return false;
	}
	
	
	private DataLink copyDataLink(DataLink dataLink)
	{
		DataLink dataLinkCopy = EcoreUtil.copy(dataLink);
		dataLinkCopy.setId(dataLinkCopy.hashCode());
		dataLinkCopy.setDataPort(EcoreUtil.copy(dataLink.getDataPort()));
		dataLinkCopy.setInDataPort(EcoreUtil.copy(dataLink.getInDataPort()));
		//dataLinkCopy.setData(EcoreUtil.copy(dataLink.getData()));
		
		return dataLinkCopy;
	}
	
	// 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateWorkflowForExecutionSystem(mxICell root, IExecutionSystem executionSystem) {

		graph.getModel().beginUpdate();		try		{
			getGraph().traverseTopologicalOrder(root, executionSystem.getJgraphxVisitor());
			layoutGraph();
			
		}		finally		{			graph.getModel().endUpdate();		}

		return true;
	}	
	
	// set the tools ToolDependency, InputFiles, OutputFiles attributes
	// resolve the output and input pairs of parent/child tasks (connected by an edge
	// and associated datalink)
	
	// algorithm:
	// iterate the graph in topological order
	//   for a vertex get all ingoing parents and set the static and non-static inputs (the operation is performed on the datalinks associated to each cell) 
	//   	set the member attribute data of datalink which contains the name of the input resource 
	//		(usually a file name, but we use here type URI)
	//      special case: the resource name of the available input data is not setable
	//		              (i.e. the tool expects a fixed name) either symlink, copy or move the resource to the fixed name 
	//		              
	
	private URI getURIFromObject(Object object)
	{
		URI uri = null;
		try {
			if (object instanceof String)
			uri = new URI((String)object);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uri;
	}
	
	
	private boolean isStaticPort(Data data, Task task)
	{
		boolean isStatic = data.getPort().isStatic();
		if (!isStatic)
		{
			for (DataPort dataPort:task.getOutDataPorts())
			{
				//logger.debug("test dataPort="+dataPort.getName()+" "+dataPort.isStatic());
				if (dataPort.isCompatible(data.getPort()))
				{
					logger.trace("isStaticPort(): found compatible port="+dataPort.getName()+" static="+dataPort.isStatic());
					isStatic = dataPort.isStatic();
				}
			}
		}
		return isStatic;
	}
	
	public boolean resolveToolDependencies(mxICell root, final Catalog catalog) throws NoValidInOutDataException
	{
		boolean rc = true;
		final EMap<String, DataPort> staticInputs = new BasicEMap<String, DataPort>();
		final EMap<String, DataPort> inputs       = new BasicEMap<String, DataPort>();
		final EList<String>          rcTraversal  = new BasicEList<String>();
		
		for (DataPort dataPort: GlobalVar.getRootTask().getOutDataPorts())
		{
			if (dataPort.isStatic())
			{
				staticInputs.put(dataPort.getName(), dataPort);
			}
			else
			{
				inputs.put(dataPort.getName(), dataPort);
			}
			logger.debug("resolveToolDependencies(): found data port="+dataPort.getName()
					+" with formats="+dataPort.getDataFormats().keySet()
					+" isStatic="+dataPort.isStatic());
			
		}
		
		logger.debug("resolveToolDependencies(): staticInputs="+staticInputs.keySet());
		
		
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge) {
				
				try {
					Task task = loadTask(vertex);
					logger.debug("resolveToolDependencies(): process task="+task.getUniqueString());
					if (task.getTools().isEmpty())
					{
						logger.error("resolveToolDependencies(): no tool. nothing to do.");
					}
					else
					{
						if (getGraph().getOutgoingEdges(vertex).length==0)
						{
							
						}
						else
						{
							int i=0;
							Tool tool = task.getPreferredTool();
							logger.debug("resolveToolDependencies(): tool="+tool.getId()+" data="+tool.getData().keySet());
							for (Object edgeOut:getGraph().getOutgoingEdges(vertex))
							{
								i++;
								try {
									Task     child         = getTargetTask((mxCell) edgeOut);
									Tool     childTool     = child.getPreferredTool();
									DataLink dataLink      = loadDataLink(edgeOut);
									
									String   firstInstance = getFirstInstance(task, dataLink);
									String   groupingStr   = dataLink.getGroupingStr();
									String   paramStr      = dataLink.getParamStr();
									String   firstInstanceDL = null;

									logger.debug("resolveToolDependencies(): "
											+"process datalink #"+(i)
											+" "+task.getUniqueString()+" "+tool.getName()+"=>"+(child!=null?child.getUniqueString():null)+" (Tool="+(childTool!=null?childTool.getName():null)+")"
											+" datalink="+dataLink.getId()
											+"\n   ---group="+groupingStr+" firstInstance="+firstInstance+"/"+firstInstanceDL
													+task.getTraversalEvents().keySet()+" childs:"+child.getTraversalEvents().keySet()
											+"\n   ---dataPort (Out)="+dataLink.getDataPort().getName()+" "+dataLink.getDataPort().getParameterName()+" "+dataLink.getDataPort().hashCode()
											+" dataPort (In)="+(dataLink.getInDataPort()!=null?
													(dataLink.getInDataPort().getName()+" "+dataLink.getInDataPort().getParameterName()+" "+dataLink.getInDataPort().hashCode()):null)
									);
									
									EList<Data> parentData = getToolDataForDataLink(tool.getData(), dataLink);
									EList<Data> childData  = null;
									if (childTool != null)
										childData = getToolDataForDataLink(childTool.getData(), dataLink);
									else
										logger.error("resolveToolDependencies(): to child tool found.");
									
									if (!dataLink.getChunks().isEmpty())
									{
										if (paramStr != null && !paramStr.equals("") 
												&& dataLink.getChunks().containsKey(paramStr) 
												&& !dataLink.getChunks().get(paramStr).isEmpty())
											firstInstanceDL=dataLink.getChunks().get(paramStr).get(0).getName();
										else if (!dataLink.getChunks().get(groupingStr).isEmpty())
											firstInstanceDL=dataLink.getChunks().get(groupingStr).get(0).getName();
									}
									
									
									// get the desired data matching both parent and child 
									Tuple<Data, Data> matchingData = getMatchingData(parentData, childData, dataLink.getFormat());
									if (matchingData == null)
										throw new NoValidInOutDataException();
									else if (matchingData.parent != null)
									{
										dataLink.setData(EcoreUtil.copy(matchingData.parent));
										
									}
									else if (matchingData.child != null)
									{
										dataLink.setData(EcoreUtil.copy(matchingData.child));
										
									}
									else
										throw new NoValidInOutDataException();
									
									if (matchingData.parent != null)
										dataLink.getInDataPort().setParameterName(matchingData.parent.getParameter().getEffectiveParentParameter(true).getName());
									if (dataLink.getInDataPort().getParameterName()==null)
										logger.error("resolveToolDependencies(): parametername could not be resolved. parent="+matchingData.parent);
									if (matchingData.child != null)
										dataLink.getDataPort().setParameterName(matchingData.child.getParameter().getEffectiveParentParameter(true).getName());
									if (dataLink.getDataPort().getParameterName()==null)
										logger.error("resolveToolDependencies(): parametername could not be resolved. child="+matchingData.child);
										
									
									// decide if the port is a static one if at least one 
									boolean isStatic = isStaticPort(dataLink.getData(), task);

									//TraversalCriterion tc = task.getTraversalEvents().containsKey(groupingStr) ? 
										//	task.getTraversalEvents().get(groupingStr).getTraversalCriterion() : null;
									TraversalCriterion tc = child.getTraversalEvents().containsKey(groupingStr) ? 
											child.getTraversalEvents().get(groupingStr).getTraversalCriterion() : null;
													
									
									logger.debug("resolveToolDependencies(): "
											+"... continue ..."
											+" travcrit=("+(tc != null ? 
													(tc.getChunkSource()+" "+tc.getId()+" "+tc.getName()+" "+tc.getMode()+" "+tc.getOperation().getName()):null)+") all:"
													+task.getTraversalEvents().keySet()+" childs:"+child.getTraversalEvents().keySet()
											+" static="+isStatic
											+" datalink="+dataLink.getId()
											+"\n   ---paramName out="+dataLink.getInDataPort().getParameterName()+" in="+dataLink.getDataPort().getParameterName()
											+"\n   ---parent data=("+(matchingData.parent != null ?
													("format="+matchingData.parent.getFormat().getName()+" name="+matchingData.parent.getName()
															+" port="+matchingData.parent.getPort().getName()) 
															+" param="+matchingData.parent.getPort().getParameterName()+" "
															+" handle="+matchingData.parent.getPreferredHandle()+" isOutput="+matchingData.parent.isOutput() : null)+")"
											+"\n   ---child data=("+(matchingData.child != null ?
													("format="+matchingData.child.getFormat().getName()+" name="+matchingData.child.getName()
															+" port="+matchingData.child.getPort().getName()
															+" param="+matchingData.child.getPort().getParameterName()
															+" handle="+matchingData.child.getPreferredHandle())+" isOutput="+matchingData.child.isOutput() : null)+")"
									);
									
										// set inputs from DataLinks first instance
										if (!isStatic && firstInstanceDL != null && tc != null 
												&& "InputFiles".equalsIgnoreCase(tc.getChunkSource()) 
												&& "metadata".equalsIgnoreCase(tc.getOperation().getName()))
										{
											dataLink.getData().setDataResourceName(getURIFromObject(firstInstanceDL));
											logger.debug("resolveToolDependencies(): set dataresource="+firstInstanceDL+" (metadata (cached))");
										}
										else if (!isStatic && paramStr != null && !paramStr.equals("") && firstInstanceDL != null)
										{
											dataLink.getData().setDataResourceName(getURIFromObject(firstInstanceDL));
											logger.debug("resolveToolDependencies(): set dataresource="+firstInstanceDL+" (param criterion (preset))");
										}
										// special handling for root:
										// set inputs from metadata file
										else if (task.isRoot() && !isStatic)// && tc != null)
										{
											if (firstInstanceDL == null)
											{
												logger.error("resolveToolDependencies(): cannot process non static root with undefined instance");
											}
											// test if groupingStr is a valid key for metadata
											else if (!getMetaData().containsColumn(groupingStr))
											{
												// try using the firstInstance
												dataLink.getData().setDataResourceName(getURIFromObject(firstInstanceDL));
												logger.debug("resolveToolDependencies(): set dataresource="+firstInstanceDL+" (metadata (cached, unknown traversal criterion))");
											}
											else
											// read from metadata
											// get inputfile defined in metadata for the first non-empty record w.r.t. inputfile column 
											// retrieved for first defined instance
											for (String record:getMetaData().getRecordsBy(groupingStr, firstInstanceDL))
											{
												logger.trace("resolveToolDependencies(): "+getMetaData().getRow(record).get(GlobalConstants.METADATA_INPUT));
												
												String inputFile = getMetaData().getRow(record).get(GlobalConstants.METADATA_INPUT);
												if (inputFile != null)
												{
													logger.debug("resolveToolDependencies(): set dataresource="+inputFile+" (metadata)");
													dataLink.getData().setDataResourceName(getURIFromObject(inputFile));
													// assume the first non-null-record in metadata has the correct inputfile name/uri
													break;
												}
												else
												{
													//logger.debug("resolveToolDependencies(): no file defined for record="+record);
												}
											}
										}

										// set from catalog
										else if (isStatic)
										{
											if (catalog.getEntries().containsKey(dataLink.getData().getName()))
											{
											logger.debug("resolveToolDependencies(): "
													+"set dataresource="+catalog.getEntries().get(dataLink.getData().getName())+" (catalog)");
											dataLink.getData().setDataResourceName(getURIFromObject(catalog.getEntries().get(dataLink.getData().getName())));
											}
											// try to get via data port
											else
											{
												boolean found = false;
												for (Entry<String, DataPort >e:staticInputs)
												{
													//logger.debug(e.getValue()+" "+dataLink.getDataPort());
													if (dataLink.getDataPort().isCompatible(e.getValue()))
													{
														logger.debug("resolveToolDependencies(): found matching static port="+e.getKey());
														if (catalog.getEntries().containsKey(e.getKey()))
														{
															logger.debug("resolveToolDependencies(): "
																	+"set dataresource="+catalog.getEntries().get(e.getKey())+" (catalog)");
															dataLink.getData().setDataResourceName(getURIFromObject(catalog.getEntries().get(e.getKey())));
															found = true;
															break;
														}
													}
												}
												if (!found)
													logger.error("resolveToolDependencies(): could not resolve static data port.");	
											}
										}
										// set from grouping criterion
										else if (!isStatic)
										{
											String fileName = task.getUniqueURIString()+"."+dataLink.getFormat().getName();
											dataLink.getData().setDataResourceName(getURIFromObject(fileName));
											logger.debug("resolveToolDependencies(): "
													+"set dataresource="+fileName+" (task's grouping)");
										}
										else
										{
											logger.error("resolveToolDependencies(): no input resource found !");
										}
									//}
									//else
									{
										
									}
									//
/*									
									
									
									// read from catalog
									
									// generate uri from group and its data port
									
									*/
							
								} catch (TaskNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (DataLinkNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (NoValidInOutDataException e) {
									// TODO Auto-generated catch block
									logger.error("failed to resolve tool "+tool.getName()+" task="+task.getUniqueString());
									e.printStackTrace();
									rcTraversal.add("NoValidInOutDataFoundException");
									return false;
								}
							}
						}
					}
				}
				catch (TaskNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				return true;
			}

		};
		graph.getModel().beginUpdate();		try		{
			getGraph().traverseTopologicalOrder(root, visitor);
			layoutGraph();
			
		}		finally		{			graph.getModel().endUpdate();		}

		if (rcTraversal.contains("NoValidInOutDataFoundException"))
			throw new NoValidInOutDataException();

		return rc;
	}
	
	// return the in/out data defined for the tool, for given datalink
	// special handling needed for:
	//   - root tool has undefined data
	//   - data, which has no parameter defined (->isAllowed() function)
	
	private EList<Data> getToolDataForDataLink(EMap<String, 
						EList<Data>> dataMap,
						DataLink dataLink) throws NoValidInOutDataException {
		
		EList<Data> data = new BasicEList<Data>();
		
		if (dataMap.isEmpty() && dataLink.getData() != null)
			data.add(dataLink.getData());
		else if (dataMap.isEmpty())
		{
			
		}
		else
		{
			for (EList<Data> dataList:dataMap.values())
			{
				for (Data curData:dataList)
				{
					if (curData.isAllowed() && curData.getPort().isCompatible(dataLink.getDataPort()))
						data.add(curData);
				}
			}
			if (data.isEmpty())
			{
				throw new NoValidInOutDataException();
			}
		}
		return data;
	}
	
	// compare given 2 data and do at least:
	//  - resolve the handle -> set preferred handle
	// if only one data is non-null check the only one return the non null data 
	// in the correct tuples value 
	private Tuple<Data,Data> getMatchingData(EList<Data> parentData,
			EList<Data> childData,
			DataFormat dataFormat) {
		
		EList<Data> tmpData = null;
		
		if ((parentData == null || parentData.isEmpty()) && childData != null && !childData.isEmpty())
			tmpData = childData;
		else if ((childData == null || childData.isEmpty()) && parentData != null && !parentData.isEmpty())
			tmpData = parentData;

		if (tmpData != null)
		{
			for (Data d : tmpData)
			{
				if (d.matchFormat(dataFormat))
				{
					EList<String> tmpHandleList = d.getSupportedHandles(false); 
					if (tmpHandleList!=null && !tmpHandleList.isEmpty())
					{
						d.setPreferredHandle(tmpHandleList.get(0));
						return new Tuple<Data, Data>((parentData == null || parentData.isEmpty())? null : d, 
								(childData == null || childData.isEmpty()) ? null:d);
					}
				}
			}
		}		
		else
		{
			for (Data child : childData)
			{
				if (!child.isOutput())				
					for (Data parent : parentData)
					{
						if (parent.isOutput() && child.match(parent, false))
							return new Tuple<Data, Data>(parent, child);
					}
			}
		}
		for (Data child : childData)
		{
			if (child.matchFormat(dataFormat))
			{
				//get the first dataformat matching data
				return new Tuple<Data, Data>(child, null);
			}
		}
		for (Data parent : parentData)
		{
			if (parent.matchFormat(dataFormat))
			{
				//get the first dataformat matching data
				return new Tuple<Data, Data>(parent, null);
			}
		}
		return null;
	}

	
	private String getFirstInstance(Task task, DataLink dataLink)
	{
		String firstInstanceStr = null;

		for (TraversalCriterion traversalCriterion : dataLink.getDataPort().getGroupingCriteria())
		{
			if (task.getChunks().containsKey(traversalCriterion.getId()))
			{
				logger.trace("getFirstInstance(): "+traversalCriterion.getId()+" "+task.getChunks().get(traversalCriterion.getId()).size());
				if (task.getChunks().get(traversalCriterion.getId()).isEmpty())
				{
					logger.error("getFirstInstance(): no instances found  for "+traversalCriterion.getId());
				}
				else
				{
					firstInstanceStr = task.getChunks().get(traversalCriterion.getId()).get(0).getName();
				}
			}
			else
			{
				logger.warn("getFirstInstance(): no chunks for "+traversalCriterion.getId()+" in task "+task.getUniqueString()+" found.");
			}
		}
		
		return firstInstanceStr;
		
	}
	
	private String generateKeyForInputData(Task task, DataLink dataLink)
	{
		String key = dataLink.getDataPort().getName();
		EList<String> tcs = new BasicEList<String>();
		for (TraversalCriterion traversalCriterion : dataLink.getDataPort().getGroupingCriteria())
		{
			if (task.getChunks().containsKey(traversalCriterion.getId()))
			{
				logger.trace("generateKeyForInputData(): "
						+"traversalCriterion="+traversalCriterion.getId()
						+" chunks="+easyFlowUtil.list2String(task.getChunks().get(traversalCriterion.getId()), null));
				tcs.add(traversalCriterion.getId()+":"+easyFlowUtil.list2String(task.getChunks().get(traversalCriterion.getId()), "-"));
			}
			else
			{
				logger.warn("generateKeyForInputData(): no chunks for "+traversalCriterion.getId()+" in task "+task.getUniqueString()+" found.");
			}
		}
		if (!tcs.isEmpty())
			key=key+"_"+StringUtils.join(tcs, "_");
		//logger.debug(key);
		return key; 
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
			Task   parentTask = getSourceTask((mxCell) edge);
			logger.trace("getInEdgesForDataPort(): check edge to "+parentTask.getUniqueString());
			if (dataPort.isCompatible(dataLink.getDataPort()))
			{
				cells.add((mxICell) edge);
				logger.trace("getInEdgesForDataPort(): compatible edge added");
			}
		}
		return cells;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * find tasks and all incoming datalinks that cannot be directly processed, i.e.
	 * another task is required to prepare (e.g. filter/merge) the inputs.
	 * 
	 *   
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<mxICell,EList<mxICell>> findCellsWithUntranslatedDataLinks() {
		
		final EMap<mxICell,EList<mxICell>> edges = new BasicEMap<mxICell, EList<mxICell>>();
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge) 
			{
				if (edge==null)
					return true;
				try {
					Task sourceTask=getSourceTask((mxCell) edge);
					//Task targetTask=getTargetTask((mxCell) edge);
					Task task = loadTask(vertex);
					DataLink dataLink = loadDataLink(edge);
					
					// skip non-grouping traversal events
					//logger.debug("task="+task.getUniqueString()+" grouping="+dataLink.getGroupingStr()+" "+task.getTraversalEvents().keySet());
					//if (!task.getTraversalEvents().containsKey(dataLink.getGroupingStr()))
						//return true;
					//else if (!task.getTraversalEvents().get(dataLink.getGroupingStr()).isGrouping())
						//return true;
					
					
					DataPort dataPortIn = dataLink.getDataPort();
					logger.debug("findCellsWithUntranslatedDataLinks(): test "+task.getUniqueString()+"("+sourceTask.getUniqueString()+"): "
							+dataLink.getParentGroupingStr()+"->"+dataLink.getGroupingStr()+" "
							+dataPortIn.getName()+" "
							//+dataPortIn.getGroupingCriteria()+" "+sourceTask.getGroupingCriteria()
							);
					if (!dataLink.getGroupingStr().equals(dataLink.getParentGroupingStr()) && !sourceTask.isRoot())
					{
						if (sourceTask.canProvideDataPort(null, dataPortIn, dataLink.getGroupingStr(), null))
						{
							logger.debug("findCellsWithUntranslatedDataLinks(): source task can be configured to generate required grouping.");
						}
						// somehow get the relevant outdataport of source task
						else if (task.canComsumeDataPort(null, null, dataLink.getParentGroupingStr(), null))
						{
							logger.debug("findCellsWithUntranslatedDataLinks(): task can be configured to accepted grouping as provided by source task.");
						}
						// check if the required chunk is entirely provided by the parent, i.e.
						// conversion: RG1 -> ID1
						// in metadata a record is defined to be "ID1 RG1 ..." and data RG1 is the same as data ID1 
						else if (sourceTask.canProvideDataPort(null, null, GlobalConstants.TRAVERSAL_CRITERION_RECORD, task.getRecords(true)))
						{
							logger.debug("findCellsWithUntranslatedDataLinks(): direct conversion found.");
						}
						else
						{
							logger.debug("findCellsWithUntranslatedDataLinks(): special conversion is required. track task in map.");
							edges.put((mxICell) vertex, getInEdgesForDataPort(vertex, dataLink.getDataPort()));

							// check if the parent output has to be filter
							// - 1) filtering not necessary (because it just outputs the equivalent of a single record)
							// - 2) extra filtering not necessary (because the parent can do it itself
							if (sourceTask.getRecords().size()==1 || sourceTask.canProvideDataPort(null, null, GlobalConstants.TRAVERSAL_CRITERION_RECORD, null))
							{
								logger.debug("findCellsWithUntranslatedDataLinks(): mark to skip filtering.");
								task.setFlags(task.getFlags() | 0x1000);
							}
							
							// check if the parent output has to be merged
							// - 1) merging not necessary, because the task require only the equivalent of a single record)
							// - 2) merging not necessary, because the task can do merging itself
							else if (task.getRecords().size()==1 || task.canComsumeDataPort(null, null, GlobalConstants.TRAVERSAL_CRITERION_RECORD, null))
							{
								logger.debug("findCellsWithUntranslatedDataLinks(): mark to skip merging.");
								task.setFlags(task.getFlags() | 0x2000);
							}
						}
					}
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataPortNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ToolNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return true;
			}
		};
		getGraph().traverse(getDefaultRootCell(), true, visitor);
		
		logger.debug("findCellsWithUntranslatedDataLinks(): "+edges.size()+" dataLinks found.");
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
		 * 
		 * argument entry: the cell/task and all (ingoing) edges to this cell 
		 * 
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws DataLinkNotFoundException 
	 * @throws ToolNotFoundException 
	 * @throws DataPortNotFoundException 
	 * @throws UtilityTaskNotFoundException 
	 * @generated not
	 */
	public boolean resolveEdge(Map.Entry<mxICell, EList<mxICell>> entry) 
			throws TaskNotFoundException, DataLinkNotFoundException, 
			DataPortNotFoundException, ToolNotFoundException, 
			UtilityTaskNotFoundException {
				
		boolean rc = true;
		
		int constellation = 0x00;
		
		// filter task can have multiple inputs
		int filterSupportMultipleInputs            = 0x01;
		// filter task can process multiple instances per single input
		int filterSupportMultipleInstancesPerInput = 0x02;
		// merge task can process multiple instances per single input
		int mergeSupportMultipleInstancesPerInput  = 0x04;
		
		
		//constellation|= filterSupportMultipleInputs;
		//constellation|= mergeSupportMultipleInstancesPerInput;
		//logger.debug("constellation: "+(constellation|filterSupportMultipleInputs)+" "+(constellation|filterSupportMultipleInstancesPerInput)+" ");
		logger.debug("resolveEdge(): constellation="+constellation);
		
		Task task = loadTask(entry.getKey());
		logger.debug("resolveEdge(): apply filter for "+task.getUniqueString()+" "+entry.getValue().size());
		if (!entry.getValue().isEmpty())
		{
			DataLink firstDataLink = loadDataLink(entry.getValue().get(0));
			Object   firstEdge     = entry.getValue().get(0);
			
			//if (!task.canProcessMultipleInputsFor(null, firstDataLink.getDataPort())){}
			//else if (task.hasMultipleGroupingsFor(firstDataLink.getDataPort()) && task.canProcessMultipleGroupingsFor(null, firstDataLink.getDataPort())
			//		|| task.hasMultipleInputsFor(firstDataLink.getDataPort()) && task.canProcessMultipleInputsFor(null, firstDataLink.getDataPort()) ){//constellation|=1<<	}
			
			graph.getModel().beginUpdate(); try {
				
				
				String filterGroupingStr = "ReadGroup";
				//String mergeGroupingStr  = "ReadGroup";
				
				// filter tasks can be the actual parent
				EMap<mxICell, DataLink> cellMap = createFilterTasks(entry.getKey(), entry.getValue(), firstDataLink.getDataPort(), filterGroupingStr, constellation);
				EMap<String, EList<TraversalChunk>> traversalChunks = new BasicEMap<String, EList<TraversalChunk>>();
				
				if (!cellMap.isEmpty())
				{
					
					for (Entry<mxICell, DataLink> e:cellMap.entrySet())
					{
						Task t=loadTask(e.getKey());
						if (t.getUniqueString().equals(task.getUniqueString()))
						{
							traversalChunks.put(GlobalConstants.TRAVERSAL_CRITERION_RECORD, t.getRecords(true));
						}
						else
						{
							for (Entry<String, EList<TraversalChunk>> e1:task.getChunks())
								traversalChunks.put(e1.getKey(), new BasicEList(EcoreUtil.copyAll(e1.getValue())));
						}
						
					}
					Task mergeTask = null;
					if (((task.getFlags() >> 13) & 0x1) == 1)
					{
						mergeTask=task;
					}
					else
					{
						mergeTask = createUtilityTask(traversalChunks, "merge",
							task.getName());
					}
					
					mxICell mergeCell = getCells().get(mergeTask.getUniqueString());

					for (Entry<mxICell, DataLink> e : cellMap.entrySet()) {
						Task source = loadTask(e.getKey());
						logger.debug("resolveEdge(): insert edge: (filter-merge)"
								+ source.getUniqueString()
								+ "->"
								+ mergeTask.getUniqueString());
						getGraph().insertEdgeEasyFlow(null, null, e.getKey(),
								mergeCell, copyDataLink(e.getValue()));
					}
					if (((task.getFlags() >> 13) & 0x1)!=1)
					{
					logger.debug("resolveEdge(): insert edge: (merge-task) "
							+ mergeTask.getUniqueString() + "->"
							+ task.getUniqueString());
					getGraph()
							.insertEdgeEasyFlow(
									null,
									null,
									mergeCell,
									entry.getKey(),
									createDataLink(firstEdge, task, "Record",
											"Record", true));
					}
				}
				
			} finally {
				layoutGraph();
				graph.getModel().endUpdate(); 
			}
			

		}
		return rc;
	}

	/**
	 * 
	 * @param cell
	 * @param edges
	 * @param dataPort
	 * @param constellation
	 * @return Map: filter task (cell) -> edge (the source and the edge toward the task, for which filtering/merging has to done)
	 * @throws TaskNotFoundException
	 * @throws DataLinkNotFoundException
	 * @throws ToolNotFoundException
	 * @throws UtilityTaskNotFoundException
	 */
	private EMap<mxICell, DataLink> createFilterTasks(mxICell cell, EList<mxICell> edges, 
											DataPort dataPort, String groupingStr, int constellation) 
						throws TaskNotFoundException, 
								DataLinkNotFoundException, 
								ToolNotFoundException, 
								UtilityTaskNotFoundException
	{
		
		//boolean rc = false;
		//boolean modeUnion=false;
		Task task = loadTask(cell);
		EMap<mxICell, DataLink> cells = new BasicEMap<mxICell, DataLink>();
		EMap<String, EList<TraversalChunk>> coveredChunks = null;

		logger.debug("createFilterTasks(): find filterTasks for "+task.getUniqueString()+" for criteria "+task.getChunks().keySet()+" "+dataPort);
		
		for (mxICell edge:edges)
		{
			DataLink dataLink = loadDataLink(edge);
			Task sourceTask   = getSourceTask((mxCell) edge);
			Task targetTask   = getTargetTask((mxCell) edge);
			
			logger.debug("createFilterTasks(): "+task.getFlags()+" 0x001="+0x001+" 0x01="+0x1+" "+(task.getFlags() >> 13));
			if (((task.getFlags() >> 12) & 0x1) == 1)
			{
				logger.debug("createFilterTasks(): no filtering necessary");
				cells.put(getSource((mxCell) edge), dataLink);
				getGraph().removeCells(new Object[]{edge}, true);
			}
			else
			{
				
				TraversalEvent te=task.getTraversalEvents().get(dataLink.getGroupingStr());
				logger.debug("createFilterTasks(): "+dataLink.getGroupingStr()+" "+dataLink.getParentGroupingStr()
						+" type of te="+te.getType()+" "+te.getTraversalCriterion().getMode()
						+" source tes="+sourceTask.getTraversalEvents().keySet());
				
				EMap<String, EList<TraversalChunk>> currentCoveredChunks = getCoveredChunks(
					targetTask,
					sourceTask,
					dataLink.getDataPort(),
					groupingStr,
					true
					//!sourceTask.getTraversalEvents().keySet().contains("Group")
					);
			
				logger.trace("createFilterTasks(): "+currentCoveredChunks.size()+" covered chunks found. "+" filter chunks from "+sourceTask.getUniqueString());
				if (currentCoveredChunks.isEmpty())
				{
					logger.debug("createFilterTasks(): no chunks found that can be translated.");	
				}
	
				else
				{
					if (coveredChunks==null)
						coveredChunks=currentCoveredChunks;
					else
						for (Entry<String, EList<TraversalChunk>> e:currentCoveredChunks.entrySet())
						{
							//if (coveredChunks.containsKey(e.getKey()))
							coveredChunks.get(e.getKey()).addAll(e.getValue());
						}
					
					logger.debug("createFilterTasks(): constallation="+(constellation & 0x04));
					if ((constellation & 0x04)>0)
					{
						
						Task newTask = createUtilityTask(currentCoveredChunks, "filter", task.getName());
						mxICell newCell=getCells().get(newTask.getUniqueString());
						logger.debug("createFilterTasks(): insert edge: (parent-filter)"+sourceTask.getUniqueString()+"->"+newTask.getUniqueString()+" coveredChunks="+coveredChunks.keySet());
						DataLink dataLinkCopy = copyDataLink(dataLink);
						mxICell newEdge=(mxICell) getGraph().insertEdgeEasyFlow(null, null, getSource((mxCell) edge), newCell, dataLinkCopy);
						cells.put(newCell, dataLinkCopy);
					}
					else
					{
						for (Entry<String, EList<TraversalChunk>> e:currentCoveredChunks.entrySet())
						{
							for (TraversalChunk traversalChunk:e.getValue())
							{
								EList<TraversalChunk> chunks = new BasicEList<TraversalChunk>();
								EMap<String, EList<TraversalChunk>> curCoveredChunks = new BasicEMap<String, EList<TraversalChunk>>();
								chunks.add(traversalChunk);
								curCoveredChunks.put(e.getKey(), chunks);
								Task newTask = createUtilityTask(curCoveredChunks, "filter", task.getName());
								logger.debug("createFilterTasks(): insert edge: (parent-filter)"
										+sourceTask.getUniqueString()+"->"+newTask.getUniqueString()
										+" coveredChunks="+curCoveredChunks.keySet());
								mxICell newCell=getCells().get(newTask.getUniqueString());
								DataLink dataLinkCopy = copyDataLink(dataLink);
								mxICell newEdge=(mxICell) getGraph().insertEdgeEasyFlow(null, null, getSource((mxCell) edge), newCell, dataLinkCopy);
								cells.put(newCell, dataLinkCopy);
							}
						}
					}
					getGraph().removeCells(new Object[]{edge}, true);
				}
			}
		}
		return cells;
	}

	
	
	private EMap<String, EList<TraversalChunk>> getCoveredChunks(Task task, Task sourceTask, 
			DataPort dataPort, String groupingStr, boolean modeUnion) throws ToolNotFoundException
	{
		
		EMap<String, EList<TraversalChunk>> allCoveredChunks = new BasicEMap<String, EList<TraversalChunk>>();
		
		//boolean fullOverlap = true;
		//EMap<String, EList<TraversalChunk>> allCoveredChunks = 
		//EList<String> requiredGroupings=task.getRequiredGroupingsFor(null, dataPort);
		//EList<String> providedGroupings=sourceTask.getProvidedGroupingsFor(null, dataPort);
		logger.trace("getCoveredChunks(): sourceTask="+sourceTask.getUniqueString()+" task="+task.getUniqueString());
		/*for (String groupingStr:task.getChunks().keySet())
		{
			EList<TraversalChunk> coveredChunks = task.getOverlappingChunksFor(sourceTask, groupingStr);
			logger.trace("getCoveredChunks(): "+coveredChunks.size()+" overlapping chunks found for "+groupingStr+".");
			if (!coveredChunks.isEmpty())
				allCoveredChunks.put(groupingStr, coveredChunks);
		}*/
		
		if (allCoveredChunks.isEmpty())
		{
			EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
			EList<String>         tcStrings       = new BasicEList<String>();
			
			for (TraversalChunk traversalChunk : getChunksFor(sourceTask, groupingStr, modeUnion))
			{
				logger.trace("getCoveredChunks(): check "+traversalChunk.getName()+" against "
						+getRecordsForChunks(task, modeUnion).size()
						+" target chunks. modeUnion="+modeUnion);
				
				boolean found = false;
				for (TraversalChunk targetTC : getChunksFor(task, groupingStr, modeUnion))
				{
					if (traversalChunk.getName().equals(targetTC.getName()))
					{
						logger.trace("getCoveredChunks(): chunk "+traversalChunk.getName()+" added");
						if (targetTC.isDerived1by1())
							traversalChunk.setDerived1by1(targetTC.isDerived1by1());
						traversalChunks.add(traversalChunk);
						tcStrings.add(traversalChunk.getName());
						found=true;
					}
				}
				if (!modeUnion && !found)
				{
					allCoveredChunks.clear();
					break;
				}
			}
			if (!traversalChunks.isEmpty())
			{
				logger.trace("getCoveredChunks(): add "+traversalChunks.size()+" traversal chunks for record. ("+StringUtils.join(tcStrings.iterator(), ", ")+")");
				allCoveredChunks.put(groupingStr, traversalChunks);
			}
					
		}
		return allCoveredChunks;

	}	

	
	private EList<TraversalChunk> getChunksFor(Task task, String groupingStr, boolean intersect)
	{
		
		EList<TraversalChunk> records = task.getRecords(intersect);
		EList<String> recordStr = new BasicEList<String>();
		EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
		for (TraversalChunk record:records)
		{
			
			recordStr.add(record.getName());
		}
		logger.debug("getChunksFor(): Found recs=("+StringUtils.join(recordStr, ",")+") ");
		EList<GroupingInstance> groupingInstances = GlobalVar.getGraphUtil().getMetaData().getInstancesForRecords(groupingStr, recordStr);
		for (GroupingInstance groupingInstance:groupingInstances)
		{
			TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
			traversalChunk.setName(groupingInstance.getName());
			traversalChunks.add(traversalChunk);
		}
		logger.debug("getChunksFor(): Found isntances=("+easyFlowUtil.list2String(traversalChunks, ",")+") for group "+groupingStr);
		return traversalChunks;
		
		/*
		EMap<String, TraversalChunk> traversalChunks = new BasicEMap<String, TraversalChunk>();
		boolean firstRound = true;
		for (Entry<String, EList<TraversalChunk>> entry:task.getChunks())
		{
			for (TraversalChunk chunk:entry.getValue())
			{
				EList<GroupingInstance> groupingInstances = GlobalVar.getGraphUtil().getMetaData().getInstances(groupingStr, entry.getKey(), chunk.getName());
				logger.debug("getChunksFor() got "+groupingInstances.size()+" chunks for transforming instance "+chunk.getName()+" from "+groupingStr+" to "+entry.getKey());
				if (!groupingInstances.isEmpty())
				{
					for (GroupingInstance groupingInstance:groupingInstances)
					{
						String key = groupingInstance.getName();
						
						if (!traversalChunks.containsKey(key) || firstRound)
						{
							TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
							traversalChunk.setName(key);
							traversalChunks.put(key, traversalChunk);
						}
						else if (!firstRound && !traversalChunks.containsKey(key))
						{
							logger.debug("getChunksFor(): found non intersecting chunk "+key);
						}
					}
				}
			}
			if (firstRound && intersect)
				firstRound = false;
		}
		return new BasicEList<TraversalChunk>(traversalChunks.values());
		*/
	}
	
	private EList<TraversalChunk> getRecordsForChunks(Task task, boolean modeUnion)
	{
		return task.getRecords(!modeUnion);
		// union=true ->return all found records
		// union=false->require records to match each traversalchunk group
	}
	
	private Task createUtilityTask(
			EMap<String, EList<TraversalChunk>> chunks,
			String utilityType,
			String uniqueString)
					throws TaskNotFoundException, DataLinkNotFoundException, UtilityTaskNotFoundException
	{
		Task utilityTask = CoreFactory.eINSTANCE.createTask();
		if (getUtilityTasks().containsKey(utilityType))
			utilityTask = EcoreUtil.copy(getUtilityTasks().get(utilityType));
		else
			throw new UtilityTaskNotFoundException();
		utilityTask.setName(utilityTask.getName()+(uniqueString==null||uniqueString.equals("")?"":"_"+uniqueString));
		utilityTask.getChunks().clear();
		copyTask(getUtilityTasks().get(utilityType), utilityTask);
		
		for (Entry<String, EList<TraversalChunk>> e:chunks.entrySet())
		{
			/*
			if (e.getKey().equals("Record") && (e.getValue().size()==1 && e.getValue().get(0).isDerived1by1()))
			{
				logger.debug("createUtilityTask(): do not create new utility task. 1-1 relation.");
				return null;
			}
			*/
			utilityTask.getChunks().put(e.getKey(), new BasicEList<TraversalChunk>(EcoreUtil.copyAll(e.getValue())));
			logger.trace("createUtilityTask(): set "+e.getValue().size()+" traversal chunks for "+e.getKey());
		}
		getTasks().put(utilityTask.getUniqueString(), utilityTask);
		getCells().put(utilityTask.getUniqueString(), (mxICell)getGraph().insertVertexEasyFlow(null, null, utilityTask));
		logger.debug("createUtilityTask(): Utility task '"+utilityTask.getUniqueString()+"' created.");
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
				if (value.equals(GlobalConstants.TEMPLATE_TASK_NAME))
					return GlobalVar.getTemplateTask();
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
				if (value.equals(GlobalConstants.TEMPLATE_DATA_PORT_NAME))
					return GlobalVar.getTemplateLink();
				return getDataLinks().get((String)value);
			}
			else if (value instanceof Integer)
			{
				return getDataLinks().get(Integer.toString((Integer) value));
			}
			else
			{
				logger.warn("loadDataLink(): unknown instance-type of value "+value.getClass().getCanonicalName());
			}
		}
		else
		{
			//todo: handle wrong type exception
			logger.warn("loadDataLink(): unknown instance-type of edge "+edge.getClass().getCanonicalName());
			
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
			case JgraphxPackage.UTIL__MOST_PROCESSED_TASKS:
				return ((InternalEList<?>)getMostProcessedTasks()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.UTIL__PROCESSED_EDGES_COPY_GRAPH:
				return ((InternalEList<?>)getProcessedEdgesCopyGraph()).basicRemove(otherEnd, msgs);
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
			case JgraphxPackage.UTIL__DEPRECATED_EDGES:
				return getDeprecatedEdges();
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
			case JgraphxPackage.UTIL__UTILITY_TASK_CELLS:
				return getUtilityTaskCells();
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
			case JgraphxPackage.UTIL__DEPRECATED_EDGES:
				getDeprecatedEdges().clear();
				getDeprecatedEdges().addAll((Collection<? extends mxICell>)newValue);
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
			case JgraphxPackage.UTIL__UTILITY_TASK_CELLS:
				getUtilityTaskCells().clear();
				getUtilityTaskCells().addAll((Collection<? extends mxICell>)newValue);
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
			case JgraphxPackage.UTIL__DEPRECATED_EDGES:
				getDeprecatedEdges().clear();
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
			case JgraphxPackage.UTIL__UTILITY_TASK_CELLS:
				getUtilityTaskCells().clear();
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
			case JgraphxPackage.UTIL__MOST_PROCESSED_TASKS:
				return mostProcessedTasks != null && !mostProcessedTasks.isEmpty();
			case JgraphxPackage.UTIL__META_DATA:
				return metaData != null;
			case JgraphxPackage.UTIL__DEFAULT_ROOT_CELL:
				return DEFAULT_ROOT_CELL_EDEFAULT == null ? defaultRootCell != null : !DEFAULT_ROOT_CELL_EDEFAULT.equals(defaultRootCell);
			case JgraphxPackage.UTIL__PROCESSED_EDGES_COPY_GRAPH:
				return processedEdgesCopyGraph != null && !processedEdgesCopyGraph.isEmpty();
			case JgraphxPackage.UTIL__DEPRECATED_EDGES:
				return deprecatedEdges != null && !deprecatedEdges.isEmpty();
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
			case JgraphxPackage.UTIL__UTILITY_TASK_CELLS:
				return utilityTaskCells != null && !utilityTaskCells.isEmpty();
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
		result.append(", deprecatedEdges: ");
		result.append(deprecatedEdges);
		result.append(", currentSubGraphs: ");
		result.append(currentSubGraphs);
		result.append(", utilityTaskCells: ");
		result.append(utilityTaskCells);
		result.append(')');
		return result.toString();
	}
	public class Tuple<X, Y> { 
		  public final X parent; 
		  public final Y child; 
		  public Tuple(X x, Y y) { 
		    this.parent = x; 
		    this.child = y; 
		  } 
		} 
} //UtilImpl
