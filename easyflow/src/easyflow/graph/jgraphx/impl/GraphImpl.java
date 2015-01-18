/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import com.mxgraph.model.mxICell;
import easyflow.core.Catalog;
import com.mxgraph.view.mxGraph.mxICellVisitor;

import easyflow.core.Task;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.GroupingCriterionNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.GraphUtil;

import easyflow.data.DataLink;

import easyflow.execution.IExecutionSystem;
import easyflow.graph.jgraphx.AbstractGraph;
import easyflow.graph.jgraphx.ExecutionGraph;
import easyflow.graph.jgraphx.Graph;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.graph.jgraphx.JgraphxPackage;

import easyflow.graph.jgraphx.PreprocessingGraph;
import easyflow.graph.jgraphx.SubGraph;
import easyflow.graph.jgraphx.ToolDependencyGraph;
import easyflow.graph.jgraphx.TraversalEventGraph;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.MetadataFactory;

import easyflow.metadata.GroupingInstance;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalEvent;
import easyflow.traversal.TraversalFactory;

import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToGraphCellMapImpl;
import easyflow.util.maps.impl.StringToStringMapImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getMostProcessedTasks <em>Most Processed Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getDefaultRootCell <em>Default Root Cell</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getProcessedEdgesCopyGraph <em>Processed Edges Copy Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getDeprecatedEdges <em>Deprecated Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getAddEdges <em>Add Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getCopiedCells <em>Copied Cells</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getCurrentSubGraphs <em>Current Sub Graphs</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getTraversalEvents <em>Traversal Events</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getNewTraversalEvents <em>New Traversal Events</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getAbstractGraph <em>Abstract Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getSubGraph <em>Sub Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getTraversalEventGraph <em>Traversal Event Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getPreprocessingGraph <em>Preprocessing Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getToolDependencyGraph <em>Tool Dependency Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.GraphImpl#getExecutionGraph <em>Execution Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphImpl extends EObjectImpl implements Graph {
	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Graph.class);

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
	 * @generated
	 * @ordered
	 */
	protected static final EasyFlowGraph GRAPH_EDEFAULT = null;

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
	 * The cached value of the '{@link #getAbstractGraph() <em>Abstract Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractGraph()
	 * @generated
	 * @ordered
	 */
	protected AbstractGraph abstractGraph;

	/**
	 * The cached value of the '{@link #getSubGraph() <em>Sub Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGraph()
	 * @generated
	 * @ordered
	 */
	protected SubGraph subGraph;

	/**
	 * The cached value of the '{@link #getTraversalEventGraph() <em>Traversal Event Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalEventGraph()
	 * @generated
	 * @ordered
	 */
	protected TraversalEventGraph traversalEventGraph;

	/**
	 * The cached value of the '{@link #getPreprocessingGraph() <em>Preprocessing Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessingGraph()
	 * @generated
	 * @ordered
	 */
	protected PreprocessingGraph preprocessingGraph;

	/**
	 * The cached value of the '{@link #getToolDependencyGraph() <em>Tool Dependency Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolDependencyGraph()
	 * @generated
	 * @ordered
	 */
	protected ToolDependencyGraph toolDependencyGraph;

	/**
	 * The cached value of the '{@link #getExecutionGraph() <em>Execution Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionGraph()
	 * @generated
	 * @ordered
	 */
	protected ExecutionGraph executionGraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JgraphxPackage.Literals.GRAPH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.GRAPH__GRAPH, oldGraph, graph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getMostProcessedTasks() {
		if (mostProcessedTasks == null) {
			mostProcessedTasks = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.GRAPH__MOST_PROCESSED_TASKS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.GRAPH__META_DATA, oldMetaData, metaData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.GRAPH__META_DATA, oldMetaData, metaData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.GRAPH__DEFAULT_ROOT_CELL, oldDefaultRootCell, defaultRootCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getProcessedEdgesCopyGraph() {
		if (processedEdgesCopyGraph == null) {
			processedEdgesCopyGraph = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.GRAPH__PROCESSED_EDGES_COPY_GRAPH);
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
			deprecatedEdges = new EDataTypeUniqueEList<mxICell>(mxICell.class, this, JgraphxPackage.GRAPH__DEPRECATED_EDGES);
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
			addEdges = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, JgraphxPackage.GRAPH__ADD_EDGES);
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
			copiedCells = new EcoreEMap<String,mxICell>(MapsPackage.Literals.STRING_TO_GRAPH_CELL_MAP, StringToGraphCellMapImpl.class, this, JgraphxPackage.GRAPH__COPIED_CELLS);
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
			currentSubGraphs = new EDataTypeUniqueEList<mxICell>(mxICell.class, this, JgraphxPackage.GRAPH__CURRENT_SUB_GRAPHS);
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
			traversalEvents = new EObjectResolvingEList<TraversalEvent>(TraversalEvent.class, this, JgraphxPackage.GRAPH__TRAVERSAL_EVENTS);
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
			newTraversalEvents = new EObjectResolvingEList<TraversalEvent>(TraversalEvent.class, this, JgraphxPackage.GRAPH__NEW_TRAVERSAL_EVENTS);
		}
		return newTraversalEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGraph getAbstractGraph() {
		if (abstractGraph != null && abstractGraph.eIsProxy()) {
			InternalEObject oldAbstractGraph = (InternalEObject)abstractGraph;
			abstractGraph = (AbstractGraph)eResolveProxy(oldAbstractGraph);
			if (abstractGraph != oldAbstractGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.GRAPH__ABSTRACT_GRAPH, oldAbstractGraph, abstractGraph));
			}
		}
		return abstractGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGraph basicGetAbstractGraph() {
		return abstractGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractGraph(AbstractGraph newAbstractGraph) {
		AbstractGraph oldAbstractGraph = abstractGraph;
		abstractGraph = newAbstractGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.GRAPH__ABSTRACT_GRAPH, oldAbstractGraph, abstractGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGraph getSubGraph() {
		if (subGraph != null && subGraph.eIsProxy()) {
			InternalEObject oldSubGraph = (InternalEObject)subGraph;
			subGraph = (SubGraph)eResolveProxy(oldSubGraph);
			if (subGraph != oldSubGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.GRAPH__SUB_GRAPH, oldSubGraph, subGraph));
			}
		}
		return subGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGraph basicGetSubGraph() {
		return subGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubGraph(SubGraph newSubGraph) {
		SubGraph oldSubGraph = subGraph;
		subGraph = newSubGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.GRAPH__SUB_GRAPH, oldSubGraph, subGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalEventGraph getTraversalEventGraph() {
		if (traversalEventGraph != null && traversalEventGraph.eIsProxy()) {
			InternalEObject oldTraversalEventGraph = (InternalEObject)traversalEventGraph;
			traversalEventGraph = (TraversalEventGraph)eResolveProxy(oldTraversalEventGraph);
			if (traversalEventGraph != oldTraversalEventGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.GRAPH__TRAVERSAL_EVENT_GRAPH, oldTraversalEventGraph, traversalEventGraph));
			}
		}
		return traversalEventGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalEventGraph basicGetTraversalEventGraph() {
		return traversalEventGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraversalEventGraph(TraversalEventGraph newTraversalEventGraph) {
		TraversalEventGraph oldTraversalEventGraph = traversalEventGraph;
		traversalEventGraph = newTraversalEventGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.GRAPH__TRAVERSAL_EVENT_GRAPH, oldTraversalEventGraph, traversalEventGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingGraph getPreprocessingGraph() {
		if (preprocessingGraph != null && preprocessingGraph.eIsProxy()) {
			InternalEObject oldPreprocessingGraph = (InternalEObject)preprocessingGraph;
			preprocessingGraph = (PreprocessingGraph)eResolveProxy(oldPreprocessingGraph);
			if (preprocessingGraph != oldPreprocessingGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.GRAPH__PREPROCESSING_GRAPH, oldPreprocessingGraph, preprocessingGraph));
			}
		}
		return preprocessingGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingGraph basicGetPreprocessingGraph() {
		return preprocessingGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreprocessingGraph(PreprocessingGraph newPreprocessingGraph) {
		PreprocessingGraph oldPreprocessingGraph = preprocessingGraph;
		preprocessingGraph = newPreprocessingGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.GRAPH__PREPROCESSING_GRAPH, oldPreprocessingGraph, preprocessingGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDependencyGraph getToolDependencyGraph() {
		if (toolDependencyGraph != null && toolDependencyGraph.eIsProxy()) {
			InternalEObject oldToolDependencyGraph = (InternalEObject)toolDependencyGraph;
			toolDependencyGraph = (ToolDependencyGraph)eResolveProxy(oldToolDependencyGraph);
			if (toolDependencyGraph != oldToolDependencyGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.GRAPH__TOOL_DEPENDENCY_GRAPH, oldToolDependencyGraph, toolDependencyGraph));
			}
		}
		return toolDependencyGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDependencyGraph basicGetToolDependencyGraph() {
		return toolDependencyGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolDependencyGraph(ToolDependencyGraph newToolDependencyGraph) {
		ToolDependencyGraph oldToolDependencyGraph = toolDependencyGraph;
		toolDependencyGraph = newToolDependencyGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.GRAPH__TOOL_DEPENDENCY_GRAPH, oldToolDependencyGraph, toolDependencyGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionGraph getExecutionGraph() {
		if (executionGraph != null && executionGraph.eIsProxy()) {
			InternalEObject oldExecutionGraph = (InternalEObject)executionGraph;
			executionGraph = (ExecutionGraph)eResolveProxy(oldExecutionGraph);
			if (executionGraph != oldExecutionGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.GRAPH__EXECUTION_GRAPH, oldExecutionGraph, executionGraph));
			}
		}
		return executionGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionGraph basicGetExecutionGraph() {
		return executionGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionGraph(ExecutionGraph newExecutionGraph) {
		ExecutionGraph oldExecutionGraph = executionGraph;
		executionGraph = newExecutionGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.GRAPH__EXECUTION_GRAPH, oldExecutionGraph, executionGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws CellNotFoundException 
	 * @generated not
	 */
	public TraversalEvent getNextTraversalEvent(boolean isGrouping) throws TaskNotFoundException, CellNotFoundException {

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
			if (isGrouping)
				getNewTraversalEvents().addAll(
					getNewTraversalEvents(
							getTraversalEvents().remove(0), 
							getDefaultRootCell()));
			else
				getNewTraversalEvents().add(getTraversalEvents().remove(0));
		}
		
		return getNewTraversalEvents().remove(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<TraversalEvent> getTraversalEvents(mxICell root, final boolean isGrouping) throws CellNotFoundException, TaskNotFoundException {
		
		final EList<TraversalEvent> traversalEvents = new BasicEList<TraversalEvent>();
		
		mxICellVisitor visitor=new mxICellVisitor()
		{
		
			@Override
			public boolean visit(Object vertex, Object edge) {
				Task task=null;
				try {
					task = JGraphXUtil.loadTask(vertex);
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
					task = JGraphXUtil.loadTask(vertex);
					if (edge != null)
						dataLink = JGraphXUtil.loadDataLink(edge);
					
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
							GraphUtil.getNewTraversalEventBySplittingTask(task, traversalEvent);
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
								logger.trace("getNewTravEvents(): test if "
										+newTraversalEvents.get(key).getSplitTask().getUniqueString()
										+" is convertable to "+task.getUniqueString());
								if (GraphUtil.isValidConversion(newTraversalEvents.get(key).getSplitTask(), task))
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
					/*
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
					*/
						
				}
				return true;
			}
		};
		logger.debug("getNewTravEvents():"
				+" parentTasks=("+StringUtils.join(GraphUtil.getTaskStringList(traversalEvent.getParentTask()), ", ")+")"
				+" splitTask="+traversalEvent.getSplitTask().getUniqueString()
				+" mergeTasks=("+StringUtils.join(GraphUtil.getTaskStringList(traversalEvent.getMergeTask()), ", ")+")"
				+" root="+JGraphXUtil.loadTask(root).getUniqueString());
		//getGraph().traverse(root, true, visitor);
		//getGraph().traverse_topologicalOrder(getGraph().traverse_topologicalOrder(root), visitor);
		getGraph().getModel().beginUpdate();		try		{
			getGraph().traverseTopologicalOrder(root, visitor);
			JGraphXUtil.layoutGraph();
		}		finally		{			getGraph().getModel().endUpdate();		}


		logger.debug("getNewTravEvents(): "+newTraversalEvents.size()+" "+traversalEvent.getSplitTask().getUniqueString());
		EList<String> te2Remove = new BasicEList<String>();
		for (String key : newTraversalEvents.keySet())
		{
			
			Task tmp = GlobalVar.getTasks().get(key);
			if (!tmp.getUniqueString().equals(tmp.getPreviousTaskStr()) && newTraversalEvents.containsKey(tmp.getPreviousTaskStr()))
			{
				te2Remove.add(tmp.getPreviousTaskStr());
				logger.debug("getNewTravEvents(): marked "+tmp.getPreviousTaskStr()+" to be removed.");
			}
			TraversalEvent travEvent = newTraversalEvents.get(key);
			logger.debug("getNewTravEvents(): "+key
					+" parentTasks=("+StringUtils.join(GraphUtil.getTaskStringList(travEvent.getParentTask()), ", ")+")"
					+" splitTask="+travEvent.getSplitTask().getUniqueString()
					+" mergeTasks=("+StringUtils.join(GraphUtil.getTaskStringList(travEvent.getMergeTask()), ", ")+")");
		}
		
		if (newTraversalEvents.isEmpty())
			newTraversalEvents.put(traversalEvent.getSplitTask().getUniqueString(), traversalEvent);
		else if (!te2Remove.isEmpty())
			for (String key : te2Remove)
				newTraversalEvents.removeKey(key);
			
		return new BasicEList<TraversalEvent>(newTraversalEvents.values());
	}


	private boolean doesTraversalEventExistFor(Task task)
	{
		for (TraversalEvent te : getTraversalEvents())
		{
			if (te.getMergeTask().contains(task))
			{
				logger.trace("doesTraversalEventExistFor(): task "+task.getUniqueString()
						+" contained in list="+GraphUtil.getTaskStringList(te.getMergeTask()));
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
					task = JGraphXUtil.loadTask(vertex);
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
					logger.debug("removeSubGraph(): remove graph cell for task="+task.getUniqueString());
					getCopiedCells().remove(task.getUniqueString());
					tmpGraphCells.add(vertex);
					cells.add(GlobalVar.getCells().get(task.getUniqueString()));
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
			JGraphXUtil.layoutGraph();
		
		}finally{graph.getModel().endUpdate();}

		getProcessedEdgesCopyGraph().clear();
		// reset flag indicating not to be removed
		return !tmpGraphCells.isEmpty() || !cells.isEmpty();
	}
	
	
	public void clear()
	{
		getCopiedCells().clear();
		getCurrentSubGraphs().clear();
		getMostProcessedTasks().clear();
		getNewTraversalEvents().clear();
		getDeprecatedEdges().clear();
		getProcessedEdgesCopyGraph().clear();
		getTraversalEvents().clear();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public mxICell computeSubgraph(TraversalEvent traversalEvent, boolean isComplete) throws CellNotFoundException, TaskNotFoundException {
		
		return getSubGraph().computeSubgraph(traversalEvent, isComplete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateWorkflowForExecutionSystem(mxICell root, IExecutionSystem executionSystem) {
		
		//getExecutionGraph().resolveDataPorts(root);
		if (GlobalConfig.isPipeAllowed())
			getExecutionGraph().resolvePipes(root);
		getExecutionGraph().resolveToolParams(root);
		return getExecutionGraph().generateWorkflowForExecutionSystem(root, executionSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveToolDependencies(mxICell root, Catalog catalog) throws NoValidInOutDataException {
		
		return getToolDependencyGraph().resolveToolDependencies(root, catalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolvePreprocessingTask(mxICell vertex, mxICell cell) throws DataLinkNotFoundException, TaskNotFoundException {
		
		return getPreprocessingGraph().resolvePreprocessingTask(vertex, cell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<mxICell, EList<mxICell>> findCellsWherePreprocessingIsRequired() {

		return getPreprocessingGraph().findCellsWherePreprocessingIsRequired();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<mxICell, EList<mxICell>> findCellsWithUntranslatedDataLinks() {

		return getPreprocessingGraph().findCellsWithUntranslatedDataLinks();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveEdge(Map.Entry<mxICell, EList<mxICell>> entry) throws TaskNotFoundException, DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException {

		return getPreprocessingGraph().resolveEdge(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void applyTraversalEvent(mxICell root, TraversalEvent traversalEvent, String groupingStr, GroupingInstance groupingInstance) throws CellNotFoundException, TaskNotFoundException {

		getTraversalEventGraph().applyTraversalEvent(root, traversalEvent, groupingStr, groupingInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void applyTraversalEvent(mxICell root, TraversalEvent traversalEvent, String groupingStr, EList<GroupingInstance> groupingInstances) throws CellNotFoundException, TaskNotFoundException {
		
		getTraversalEventGraph().applyTraversalEvent(root, traversalEvent, groupingStr, groupingInstances);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public mxICell applyTraversalEventCopyGraph(mxICell root, TraversalEvent traversalEvent, GroupingInstance groupingInstance) throws CellNotFoundException, TaskNotFoundException {

		return getTraversalEventGraph().applyTraversalEventCopyGraph(root, traversalEvent, groupingInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public mxICell applyTraversalEventCopyGraph(mxICell root, TraversalEvent traversalEvent, EList<GroupingInstance> groupingInstances) throws CellNotFoundException, TaskNotFoundException {
		
		return getTraversalEventGraph().applyTraversalEventCopyGraph(root, traversalEvent, groupingInstances);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveTraversalEvents(mxICell root) throws CellNotFoundException, TaskNotFoundException {

		return getAbstractGraph().resolveTraversalEvents(root);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void resetFlag(final int mask) {
		
		mxICellVisitor visitor=new mxICellVisitor()
		{
		
			@Override
			public boolean visit(Object vertex, Object edge) {
				Task task=null;
				try {
					task = JGraphXUtil.loadTask(vertex);
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
	 * @generated not
	 */
	public void resetFlags() {
		resetFlag(0xFFF0);
		resetFlag(0xFF0F);
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
			logger.debug(traversalEvent.getTraversalCriterion().getId()+" "+GlobalVar.getMetaData().getGroupingInstances().keySet());
			//if (traversalEvent.getType().equals("grouping"))
				//if (traversalEvent.getTraversalCriterion().getMode().equals("batch"))
				if (!GlobalVar.getMetaData().getGroupingInstances().containsKey(traversalEvent.getTraversalCriterion().getId()))
					throw new GroupingCriterionInstanceNotFoundException();
				for (GroupingInstance groupingInstance :
					GlobalVar.getMetaData().getGroupingInstances().
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
									+" "+GlobalVar.getMetaData().getColumn(tc.getChunkSource()));
							
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
									if (GlobalVar.getMetaData().getColumn(tc.getChunkSource()).containsKey(chunk.getName()))
									{
										String[] elements = GlobalVar.getMetaData().getColumn(tc.getChunkSource()).get(chunk.getName()).split(",");
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
	public boolean init() {
		boolean rc = true;
		setAbstractGraph      (JgraphxFactory.eINSTANCE.createAbstractGraph());
		setSubGraph           (JgraphxFactory.eINSTANCE.createSubGraph());
		setTraversalEventGraph(JgraphxFactory.eINSTANCE.createTraversalEventGraph());
		setPreprocessingGraph (JgraphxFactory.eINSTANCE.createPreprocessingGraph());
		setToolDependencyGraph(JgraphxFactory.eINSTANCE.createToolDependencyGraph());
		setExecutionGraph     (JgraphxFactory.eINSTANCE.createExecutionGraph());
		
		getAbstractGraph()      .setGraph(this);
		getSubGraph()           .setGraph(this);
		getTraversalEventGraph().setGraph(this);
		getPreprocessingGraph() .setGraph(this);
		getToolDependencyGraph().setGraph(this);
		getExecutionGraph()     .setGraph(this);
		
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JgraphxPackage.GRAPH__MOST_PROCESSED_TASKS:
				return ((InternalEList<?>)getMostProcessedTasks()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.GRAPH__PROCESSED_EDGES_COPY_GRAPH:
				return ((InternalEList<?>)getProcessedEdgesCopyGraph()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.GRAPH__ADD_EDGES:
				return ((InternalEList<?>)getAddEdges()).basicRemove(otherEnd, msgs);
			case JgraphxPackage.GRAPH__COPIED_CELLS:
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
			case JgraphxPackage.GRAPH__LOGGER:
				return getLogger();
			case JgraphxPackage.GRAPH__GRAPH:
				return getGraph();
			case JgraphxPackage.GRAPH__MOST_PROCESSED_TASKS:
				if (coreType) return getMostProcessedTasks();
				else return getMostProcessedTasks().map();
			case JgraphxPackage.GRAPH__META_DATA:
				if (resolve) return getMetaData();
				return basicGetMetaData();
			case JgraphxPackage.GRAPH__DEFAULT_ROOT_CELL:
				return getDefaultRootCell();
			case JgraphxPackage.GRAPH__PROCESSED_EDGES_COPY_GRAPH:
				if (coreType) return getProcessedEdgesCopyGraph();
				else return getProcessedEdgesCopyGraph().map();
			case JgraphxPackage.GRAPH__DEPRECATED_EDGES:
				return getDeprecatedEdges();
			case JgraphxPackage.GRAPH__ADD_EDGES:
				if (coreType) return getAddEdges();
				else return getAddEdges().map();
			case JgraphxPackage.GRAPH__COPIED_CELLS:
				if (coreType) return getCopiedCells();
				else return getCopiedCells().map();
			case JgraphxPackage.GRAPH__CURRENT_SUB_GRAPHS:
				return getCurrentSubGraphs();
			case JgraphxPackage.GRAPH__TRAVERSAL_EVENTS:
				return getTraversalEvents();
			case JgraphxPackage.GRAPH__NEW_TRAVERSAL_EVENTS:
				return getNewTraversalEvents();
			case JgraphxPackage.GRAPH__ABSTRACT_GRAPH:
				if (resolve) return getAbstractGraph();
				return basicGetAbstractGraph();
			case JgraphxPackage.GRAPH__SUB_GRAPH:
				if (resolve) return getSubGraph();
				return basicGetSubGraph();
			case JgraphxPackage.GRAPH__TRAVERSAL_EVENT_GRAPH:
				if (resolve) return getTraversalEventGraph();
				return basicGetTraversalEventGraph();
			case JgraphxPackage.GRAPH__PREPROCESSING_GRAPH:
				if (resolve) return getPreprocessingGraph();
				return basicGetPreprocessingGraph();
			case JgraphxPackage.GRAPH__TOOL_DEPENDENCY_GRAPH:
				if (resolve) return getToolDependencyGraph();
				return basicGetToolDependencyGraph();
			case JgraphxPackage.GRAPH__EXECUTION_GRAPH:
				if (resolve) return getExecutionGraph();
				return basicGetExecutionGraph();
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
			case JgraphxPackage.GRAPH__GRAPH:
				setGraph((EasyFlowGraph)newValue);
				return;
			case JgraphxPackage.GRAPH__MOST_PROCESSED_TASKS:
				((EStructuralFeature.Setting)getMostProcessedTasks()).set(newValue);
				return;
			case JgraphxPackage.GRAPH__META_DATA:
				setMetaData((DefaultMetaData)newValue);
				return;
			case JgraphxPackage.GRAPH__DEFAULT_ROOT_CELL:
				setDefaultRootCell((mxICell)newValue);
				return;
			case JgraphxPackage.GRAPH__PROCESSED_EDGES_COPY_GRAPH:
				((EStructuralFeature.Setting)getProcessedEdgesCopyGraph()).set(newValue);
				return;
			case JgraphxPackage.GRAPH__DEPRECATED_EDGES:
				getDeprecatedEdges().clear();
				getDeprecatedEdges().addAll((Collection<? extends mxICell>)newValue);
				return;
			case JgraphxPackage.GRAPH__ADD_EDGES:
				((EStructuralFeature.Setting)getAddEdges()).set(newValue);
				return;
			case JgraphxPackage.GRAPH__COPIED_CELLS:
				((EStructuralFeature.Setting)getCopiedCells()).set(newValue);
				return;
			case JgraphxPackage.GRAPH__CURRENT_SUB_GRAPHS:
				getCurrentSubGraphs().clear();
				getCurrentSubGraphs().addAll((Collection<? extends mxICell>)newValue);
				return;
			case JgraphxPackage.GRAPH__TRAVERSAL_EVENTS:
				getTraversalEvents().clear();
				getTraversalEvents().addAll((Collection<? extends TraversalEvent>)newValue);
				return;
			case JgraphxPackage.GRAPH__NEW_TRAVERSAL_EVENTS:
				getNewTraversalEvents().clear();
				getNewTraversalEvents().addAll((Collection<? extends TraversalEvent>)newValue);
				return;
			case JgraphxPackage.GRAPH__ABSTRACT_GRAPH:
				setAbstractGraph((AbstractGraph)newValue);
				return;
			case JgraphxPackage.GRAPH__SUB_GRAPH:
				setSubGraph((SubGraph)newValue);
				return;
			case JgraphxPackage.GRAPH__TRAVERSAL_EVENT_GRAPH:
				setTraversalEventGraph((TraversalEventGraph)newValue);
				return;
			case JgraphxPackage.GRAPH__PREPROCESSING_GRAPH:
				setPreprocessingGraph((PreprocessingGraph)newValue);
				return;
			case JgraphxPackage.GRAPH__TOOL_DEPENDENCY_GRAPH:
				setToolDependencyGraph((ToolDependencyGraph)newValue);
				return;
			case JgraphxPackage.GRAPH__EXECUTION_GRAPH:
				setExecutionGraph((ExecutionGraph)newValue);
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
			case JgraphxPackage.GRAPH__GRAPH:
				setGraph(GRAPH_EDEFAULT);
				return;
			case JgraphxPackage.GRAPH__MOST_PROCESSED_TASKS:
				getMostProcessedTasks().clear();
				return;
			case JgraphxPackage.GRAPH__META_DATA:
				setMetaData((DefaultMetaData)null);
				return;
			case JgraphxPackage.GRAPH__DEFAULT_ROOT_CELL:
				setDefaultRootCell(DEFAULT_ROOT_CELL_EDEFAULT);
				return;
			case JgraphxPackage.GRAPH__PROCESSED_EDGES_COPY_GRAPH:
				getProcessedEdgesCopyGraph().clear();
				return;
			case JgraphxPackage.GRAPH__DEPRECATED_EDGES:
				getDeprecatedEdges().clear();
				return;
			case JgraphxPackage.GRAPH__ADD_EDGES:
				getAddEdges().clear();
				return;
			case JgraphxPackage.GRAPH__COPIED_CELLS:
				getCopiedCells().clear();
				return;
			case JgraphxPackage.GRAPH__CURRENT_SUB_GRAPHS:
				getCurrentSubGraphs().clear();
				return;
			case JgraphxPackage.GRAPH__TRAVERSAL_EVENTS:
				getTraversalEvents().clear();
				return;
			case JgraphxPackage.GRAPH__NEW_TRAVERSAL_EVENTS:
				getNewTraversalEvents().clear();
				return;
			case JgraphxPackage.GRAPH__ABSTRACT_GRAPH:
				setAbstractGraph((AbstractGraph)null);
				return;
			case JgraphxPackage.GRAPH__SUB_GRAPH:
				setSubGraph((SubGraph)null);
				return;
			case JgraphxPackage.GRAPH__TRAVERSAL_EVENT_GRAPH:
				setTraversalEventGraph((TraversalEventGraph)null);
				return;
			case JgraphxPackage.GRAPH__PREPROCESSING_GRAPH:
				setPreprocessingGraph((PreprocessingGraph)null);
				return;
			case JgraphxPackage.GRAPH__TOOL_DEPENDENCY_GRAPH:
				setToolDependencyGraph((ToolDependencyGraph)null);
				return;
			case JgraphxPackage.GRAPH__EXECUTION_GRAPH:
				setExecutionGraph((ExecutionGraph)null);
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
			case JgraphxPackage.GRAPH__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case JgraphxPackage.GRAPH__GRAPH:
				return GRAPH_EDEFAULT == null ? graph != null : !GRAPH_EDEFAULT.equals(graph);
			case JgraphxPackage.GRAPH__MOST_PROCESSED_TASKS:
				return mostProcessedTasks != null && !mostProcessedTasks.isEmpty();
			case JgraphxPackage.GRAPH__META_DATA:
				return metaData != null;
			case JgraphxPackage.GRAPH__DEFAULT_ROOT_CELL:
				return DEFAULT_ROOT_CELL_EDEFAULT == null ? defaultRootCell != null : !DEFAULT_ROOT_CELL_EDEFAULT.equals(defaultRootCell);
			case JgraphxPackage.GRAPH__PROCESSED_EDGES_COPY_GRAPH:
				return processedEdgesCopyGraph != null && !processedEdgesCopyGraph.isEmpty();
			case JgraphxPackage.GRAPH__DEPRECATED_EDGES:
				return deprecatedEdges != null && !deprecatedEdges.isEmpty();
			case JgraphxPackage.GRAPH__ADD_EDGES:
				return addEdges != null && !addEdges.isEmpty();
			case JgraphxPackage.GRAPH__COPIED_CELLS:
				return copiedCells != null && !copiedCells.isEmpty();
			case JgraphxPackage.GRAPH__CURRENT_SUB_GRAPHS:
				return currentSubGraphs != null && !currentSubGraphs.isEmpty();
			case JgraphxPackage.GRAPH__TRAVERSAL_EVENTS:
				return traversalEvents != null && !traversalEvents.isEmpty();
			case JgraphxPackage.GRAPH__NEW_TRAVERSAL_EVENTS:
				return newTraversalEvents != null && !newTraversalEvents.isEmpty();
			case JgraphxPackage.GRAPH__ABSTRACT_GRAPH:
				return abstractGraph != null;
			case JgraphxPackage.GRAPH__SUB_GRAPH:
				return subGraph != null;
			case JgraphxPackage.GRAPH__TRAVERSAL_EVENT_GRAPH:
				return traversalEventGraph != null;
			case JgraphxPackage.GRAPH__PREPROCESSING_GRAPH:
				return preprocessingGraph != null;
			case JgraphxPackage.GRAPH__TOOL_DEPENDENCY_GRAPH:
				return toolDependencyGraph != null;
			case JgraphxPackage.GRAPH__EXECUTION_GRAPH:
				return executionGraph != null;
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
		result.append(')');
		return result.toString();
	}

} //GraphImpl
