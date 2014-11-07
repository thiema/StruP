/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see easyflow.graph.jgraphx.JgraphxFactory
 * @model kind="package"
 * @generated
 */
public interface JgraphxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jgraphx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/graph/jgraphx/easyflow.core/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "easyflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JgraphxPackage eINSTANCE = easyflow.graph.jgraphx.impl.JgraphxPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.graph.jgraphx.impl.AbstractGraphImpl <em>Abstract Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.graph.jgraphx.impl.AbstractGraphImpl
	 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getAbstractGraph()
	 * @generated
	 */
	int ABSTRACT_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__GRAPH = 0;

	/**
	 * The number of structural features of the '<em>Abstract Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.graph.jgraphx.impl.TraversalEventGraphImpl <em>Traversal Event Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.graph.jgraphx.impl.TraversalEventGraphImpl
	 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getTraversalEventGraph()
	 * @generated
	 */
	int TRAVERSAL_EVENT_GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_GRAPH__GRAPH = 0;

	/**
	 * The number of structural features of the '<em>Traversal Event Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_GRAPH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.graph.jgraphx.impl.PreprocessingGraphImpl <em>Preprocessing Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.graph.jgraphx.impl.PreprocessingGraphImpl
	 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getPreprocessingGraph()
	 * @generated
	 */
	int PREPROCESSING_GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_GRAPH__GRAPH = 0;

	/**
	 * The number of structural features of the '<em>Preprocessing Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_GRAPH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.graph.jgraphx.impl.ToolDependencyGraphImpl <em>Tool Dependency Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.graph.jgraphx.impl.ToolDependencyGraphImpl
	 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getToolDependencyGraph()
	 * @generated
	 */
	int TOOL_DEPENDENCY_GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEPENDENCY_GRAPH__GRAPH = 0;

	/**
	 * The number of structural features of the '<em>Tool Dependency Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEPENDENCY_GRAPH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.graph.jgraphx.impl.ExecutionGraphImpl <em>Execution Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.graph.jgraphx.impl.ExecutionGraphImpl
	 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getExecutionGraph()
	 * @generated
	 */
	int EXECUTION_GRAPH = 4;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_GRAPH__GRAPH = 0;

	/**
	 * The number of structural features of the '<em>Execution Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_GRAPH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.graph.jgraphx.impl.SubGraphImpl <em>Sub Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.graph.jgraphx.impl.SubGraphImpl
	 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getSubGraph()
	 * @generated
	 */
	int SUB_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__GRAPH = 0;

	/**
	 * The number of structural features of the '<em>Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.graph.jgraphx.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.graph.jgraphx.impl.GraphImpl
	 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 6;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__LOGGER = 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Most Processed Tasks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__MOST_PROCESSED_TASKS = 2;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__META_DATA = 3;

	/**
	 * The feature id for the '<em><b>Default Root Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__DEFAULT_ROOT_CELL = 4;

	/**
	 * The feature id for the '<em><b>Processed Edges Copy Graph</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__PROCESSED_EDGES_COPY_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Deprecated Edges</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__DEPRECATED_EDGES = 6;

	/**
	 * The feature id for the '<em><b>Add Edges</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ADD_EDGES = 7;

	/**
	 * The feature id for the '<em><b>Copied Cells</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__COPIED_CELLS = 8;

	/**
	 * The feature id for the '<em><b>Current Sub Graphs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__CURRENT_SUB_GRAPHS = 9;

	/**
	 * The feature id for the '<em><b>Traversal Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__TRAVERSAL_EVENTS = 10;

	/**
	 * The feature id for the '<em><b>New Traversal Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NEW_TRAVERSAL_EVENTS = 11;

	/**
	 * The feature id for the '<em><b>Abstract Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ABSTRACT_GRAPH = 12;

	/**
	 * The feature id for the '<em><b>Sub Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__SUB_GRAPH = 13;

	/**
	 * The feature id for the '<em><b>Traversal Event Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__TRAVERSAL_EVENT_GRAPH = 14;

	/**
	 * The feature id for the '<em><b>Preprocessing Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__PREPROCESSING_GRAPH = 15;

	/**
	 * The feature id for the '<em><b>Tool Dependency Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__TOOL_DEPENDENCY_GRAPH = 16;

	/**
	 * The feature id for the '<em><b>Execution Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__EXECUTION_GRAPH = 17;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 18;


	/**
	 * Returns the meta object for class '{@link easyflow.graph.jgraphx.AbstractGraph <em>Abstract Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Graph</em>'.
	 * @see easyflow.graph.jgraphx.AbstractGraph
	 * @generated
	 */
	EClass getAbstractGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.AbstractGraph#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see easyflow.graph.jgraphx.AbstractGraph#getGraph()
	 * @see #getAbstractGraph()
	 * @generated
	 */
	EReference getAbstractGraph_Graph();

	/**
	 * Returns the meta object for class '{@link easyflow.graph.jgraphx.TraversalEventGraph <em>Traversal Event Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traversal Event Graph</em>'.
	 * @see easyflow.graph.jgraphx.TraversalEventGraph
	 * @generated
	 */
	EClass getTraversalEventGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.TraversalEventGraph#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see easyflow.graph.jgraphx.TraversalEventGraph#getGraph()
	 * @see #getTraversalEventGraph()
	 * @generated
	 */
	EReference getTraversalEventGraph_Graph();

	/**
	 * Returns the meta object for class '{@link easyflow.graph.jgraphx.PreprocessingGraph <em>Preprocessing Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocessing Graph</em>'.
	 * @see easyflow.graph.jgraphx.PreprocessingGraph
	 * @generated
	 */
	EClass getPreprocessingGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.PreprocessingGraph#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see easyflow.graph.jgraphx.PreprocessingGraph#getGraph()
	 * @see #getPreprocessingGraph()
	 * @generated
	 */
	EReference getPreprocessingGraph_Graph();

	/**
	 * Returns the meta object for class '{@link easyflow.graph.jgraphx.ToolDependencyGraph <em>Tool Dependency Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Dependency Graph</em>'.
	 * @see easyflow.graph.jgraphx.ToolDependencyGraph
	 * @generated
	 */
	EClass getToolDependencyGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.ToolDependencyGraph#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see easyflow.graph.jgraphx.ToolDependencyGraph#getGraph()
	 * @see #getToolDependencyGraph()
	 * @generated
	 */
	EReference getToolDependencyGraph_Graph();

	/**
	 * Returns the meta object for class '{@link easyflow.graph.jgraphx.ExecutionGraph <em>Execution Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Graph</em>'.
	 * @see easyflow.graph.jgraphx.ExecutionGraph
	 * @generated
	 */
	EClass getExecutionGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.ExecutionGraph#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see easyflow.graph.jgraphx.ExecutionGraph#getGraph()
	 * @see #getExecutionGraph()
	 * @generated
	 */
	EReference getExecutionGraph_Graph();

	/**
	 * Returns the meta object for class '{@link easyflow.graph.jgraphx.SubGraph <em>Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Graph</em>'.
	 * @see easyflow.graph.jgraphx.SubGraph
	 * @generated
	 */
	EClass getSubGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.SubGraph#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see easyflow.graph.jgraphx.SubGraph#getGraph()
	 * @see #getSubGraph()
	 * @generated
	 */
	EReference getSubGraph_Graph();

	/**
	 * Returns the meta object for class '{@link easyflow.graph.jgraphx.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see easyflow.graph.jgraphx.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.graph.jgraphx.Graph#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getLogger()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.graph.jgraphx.Graph#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Graph();

	/**
	 * Returns the meta object for the map '{@link easyflow.graph.jgraphx.Graph#getMostProcessedTasks <em>Most Processed Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Most Processed Tasks</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getMostProcessedTasks()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_MostProcessedTasks();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.Graph#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Data</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getMetaData()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.graph.jgraphx.Graph#getDefaultRootCell <em>Default Root Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Root Cell</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getDefaultRootCell()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_DefaultRootCell();

	/**
	 * Returns the meta object for the map '{@link easyflow.graph.jgraphx.Graph#getProcessedEdgesCopyGraph <em>Processed Edges Copy Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Processed Edges Copy Graph</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getProcessedEdgesCopyGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_ProcessedEdgesCopyGraph();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.graph.jgraphx.Graph#getDeprecatedEdges <em>Deprecated Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Deprecated Edges</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getDeprecatedEdges()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_DeprecatedEdges();

	/**
	 * Returns the meta object for the map '{@link easyflow.graph.jgraphx.Graph#getAddEdges <em>Add Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Add Edges</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getAddEdges()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_AddEdges();

	/**
	 * Returns the meta object for the map '{@link easyflow.graph.jgraphx.Graph#getCopiedCells <em>Copied Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Copied Cells</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getCopiedCells()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_CopiedCells();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.graph.jgraphx.Graph#getCurrentSubGraphs <em>Current Sub Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Current Sub Graphs</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getCurrentSubGraphs()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_CurrentSubGraphs();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.graph.jgraphx.Graph#getTraversalEvents <em>Traversal Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traversal Events</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getTraversalEvents()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_TraversalEvents();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.graph.jgraphx.Graph#getNewTraversalEvents <em>New Traversal Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Traversal Events</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getNewTraversalEvents()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_NewTraversalEvents();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.Graph#getAbstractGraph <em>Abstract Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Graph</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getAbstractGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_AbstractGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.Graph#getSubGraph <em>Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Graph</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getSubGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_SubGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.Graph#getTraversalEventGraph <em>Traversal Event Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Traversal Event Graph</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getTraversalEventGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_TraversalEventGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.Graph#getPreprocessingGraph <em>Preprocessing Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preprocessing Graph</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getPreprocessingGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_PreprocessingGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.Graph#getToolDependencyGraph <em>Tool Dependency Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool Dependency Graph</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getToolDependencyGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_ToolDependencyGraph();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.Graph#getExecutionGraph <em>Execution Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution Graph</em>'.
	 * @see easyflow.graph.jgraphx.Graph#getExecutionGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_ExecutionGraph();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JgraphxFactory getJgraphxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link easyflow.graph.jgraphx.impl.AbstractGraphImpl <em>Abstract Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.graph.jgraphx.impl.AbstractGraphImpl
		 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getAbstractGraph()
		 * @generated
		 */
		EClass ABSTRACT_GRAPH = eINSTANCE.getAbstractGraph();
		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_GRAPH__GRAPH = eINSTANCE.getAbstractGraph_Graph();
		/**
		 * The meta object literal for the '{@link easyflow.graph.jgraphx.impl.TraversalEventGraphImpl <em>Traversal Event Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.graph.jgraphx.impl.TraversalEventGraphImpl
		 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getTraversalEventGraph()
		 * @generated
		 */
		EClass TRAVERSAL_EVENT_GRAPH = eINSTANCE.getTraversalEventGraph();
		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT_GRAPH__GRAPH = eINSTANCE.getTraversalEventGraph_Graph();
		/**
		 * The meta object literal for the '{@link easyflow.graph.jgraphx.impl.PreprocessingGraphImpl <em>Preprocessing Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.graph.jgraphx.impl.PreprocessingGraphImpl
		 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getPreprocessingGraph()
		 * @generated
		 */
		EClass PREPROCESSING_GRAPH = eINSTANCE.getPreprocessingGraph();
		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPROCESSING_GRAPH__GRAPH = eINSTANCE.getPreprocessingGraph_Graph();
		/**
		 * The meta object literal for the '{@link easyflow.graph.jgraphx.impl.ToolDependencyGraphImpl <em>Tool Dependency Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.graph.jgraphx.impl.ToolDependencyGraphImpl
		 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getToolDependencyGraph()
		 * @generated
		 */
		EClass TOOL_DEPENDENCY_GRAPH = eINSTANCE.getToolDependencyGraph();
		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_DEPENDENCY_GRAPH__GRAPH = eINSTANCE.getToolDependencyGraph_Graph();
		/**
		 * The meta object literal for the '{@link easyflow.graph.jgraphx.impl.ExecutionGraphImpl <em>Execution Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.graph.jgraphx.impl.ExecutionGraphImpl
		 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getExecutionGraph()
		 * @generated
		 */
		EClass EXECUTION_GRAPH = eINSTANCE.getExecutionGraph();
		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_GRAPH__GRAPH = eINSTANCE.getExecutionGraph_Graph();
		/**
		 * The meta object literal for the '{@link easyflow.graph.jgraphx.impl.SubGraphImpl <em>Sub Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.graph.jgraphx.impl.SubGraphImpl
		 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getSubGraph()
		 * @generated
		 */
		EClass SUB_GRAPH = eINSTANCE.getSubGraph();
		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GRAPH__GRAPH = eINSTANCE.getSubGraph_Graph();
		/**
		 * The meta object literal for the '{@link easyflow.graph.jgraphx.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.graph.jgraphx.impl.GraphImpl
		 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();
		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__LOGGER = eINSTANCE.getGraph_Logger();
		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__GRAPH = eINSTANCE.getGraph_Graph();
		/**
		 * The meta object literal for the '<em><b>Most Processed Tasks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__MOST_PROCESSED_TASKS = eINSTANCE.getGraph_MostProcessedTasks();
		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__META_DATA = eINSTANCE.getGraph_MetaData();
		/**
		 * The meta object literal for the '<em><b>Default Root Cell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__DEFAULT_ROOT_CELL = eINSTANCE.getGraph_DefaultRootCell();
		/**
		 * The meta object literal for the '<em><b>Processed Edges Copy Graph</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__PROCESSED_EDGES_COPY_GRAPH = eINSTANCE.getGraph_ProcessedEdgesCopyGraph();
		/**
		 * The meta object literal for the '<em><b>Deprecated Edges</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__DEPRECATED_EDGES = eINSTANCE.getGraph_DeprecatedEdges();
		/**
		 * The meta object literal for the '<em><b>Add Edges</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ADD_EDGES = eINSTANCE.getGraph_AddEdges();
		/**
		 * The meta object literal for the '<em><b>Copied Cells</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__COPIED_CELLS = eINSTANCE.getGraph_CopiedCells();
		/**
		 * The meta object literal for the '<em><b>Current Sub Graphs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__CURRENT_SUB_GRAPHS = eINSTANCE.getGraph_CurrentSubGraphs();
		/**
		 * The meta object literal for the '<em><b>Traversal Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__TRAVERSAL_EVENTS = eINSTANCE.getGraph_TraversalEvents();
		/**
		 * The meta object literal for the '<em><b>New Traversal Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NEW_TRAVERSAL_EVENTS = eINSTANCE.getGraph_NewTraversalEvents();
		/**
		 * The meta object literal for the '<em><b>Abstract Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ABSTRACT_GRAPH = eINSTANCE.getGraph_AbstractGraph();
		/**
		 * The meta object literal for the '<em><b>Sub Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__SUB_GRAPH = eINSTANCE.getGraph_SubGraph();
		/**
		 * The meta object literal for the '<em><b>Traversal Event Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__TRAVERSAL_EVENT_GRAPH = eINSTANCE.getGraph_TraversalEventGraph();
		/**
		 * The meta object literal for the '<em><b>Preprocessing Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__PREPROCESSING_GRAPH = eINSTANCE.getGraph_PreprocessingGraph();
		/**
		 * The meta object literal for the '<em><b>Tool Dependency Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__TOOL_DEPENDENCY_GRAPH = eINSTANCE.getGraph_ToolDependencyGraph();
		/**
		 * The meta object literal for the '<em><b>Execution Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__EXECUTION_GRAPH = eINSTANCE.getGraph_ExecutionGraph();

	}

} //JgraphxPackage
