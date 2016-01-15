/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
	 * The operation id for the '<em>Resolve Traversal Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___RESOLVE_TRAVERSAL_EVENTS__MXICELL = 0;

	/**
	 * The number of operations of the '<em>Abstract Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH_OPERATION_COUNT = 1;

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
	 * The operation id for the '<em>Apply Traversal Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_GROUPINGINSTANCE = 0;

	/**
	 * The operation id for the '<em>Apply Traversal Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_ELIST = 1;

	/**
	 * The operation id for the '<em>Apply Traversal Event Copy Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_GROUPINGINSTANCE = 2;

	/**
	 * The operation id for the '<em>Apply Traversal Event Copy Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_ELIST = 3;

	/**
	 * The number of operations of the '<em>Traversal Event Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_GRAPH_OPERATION_COUNT = 4;

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
	 * The operation id for the '<em>Resolve Preprocessing Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_GRAPH___RESOLVE_PREPROCESSING_TASK__MXICELL_MXICELL = 0;

	/**
	 * The operation id for the '<em>Find Cells Where Preprocessing Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_GRAPH___FIND_CELLS_WHERE_PREPROCESSING_IS_REQUIRED = 1;

	/**
	 * The operation id for the '<em>Find Cells With Untranslated Data Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_GRAPH___FIND_CELLS_WITH_UNTRANSLATED_DATA_LINKS = 2;

	/**
	 * The operation id for the '<em>Resolve Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_GRAPH___RESOLVE_EDGE__EMAP = 3;

	/**
	 * The number of operations of the '<em>Preprocessing Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_GRAPH_OPERATION_COUNT = 4;

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
	 * The operation id for the '<em>Resolve Tool Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEPENDENCY_GRAPH___RESOLVE_TOOL_DEPENDENCIES__MXICELL_CATALOG = 0;

	/**
	 * The number of operations of the '<em>Tool Dependency Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEPENDENCY_GRAPH_OPERATION_COUNT = 1;

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
	 * The operation id for the '<em>Generate Workflow For Execution System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_GRAPH___GENERATE_WORKFLOW_FOR_EXECUTION_SYSTEM__MXICELL_IEXECUTIONSYSTEM = 0;

	/**
	 * The operation id for the '<em>Resolve Tool Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_GRAPH___RESOLVE_TOOL_PARAMS__MXICELL = 1;

	/**
	 * The operation id for the '<em>Resolve Pipes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_GRAPH___RESOLVE_PIPES__MXICELL = 2;

	/**
	 * The number of operations of the '<em>Execution Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_GRAPH_OPERATION_COUNT = 3;

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
	 * The operation id for the '<em>Compute Subgraph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH___COMPUTE_SUBGRAPH__TRAVERSALEVENT_BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH_OPERATION_COUNT = 1;

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
	 * The operation id for the '<em>Get Next Traversal Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NEXT_TRAVERSAL_EVENT__BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Get Traversal Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_TRAVERSAL_EVENTS__MXICELL_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Get New Traversal Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NEW_TRAVERSAL_EVENTS__TRAVERSALEVENT_MXICELL = 2;

	/**
	 * The operation id for the '<em>Remove Sub Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_SUB_GRAPH__MXICELL_TRAVERSALEVENT = 3;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CLEAR = 4;

	/**
	 * The operation id for the '<em>Compute Subgraph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___COMPUTE_SUBGRAPH__TRAVERSALEVENT_BOOLEAN = 5;

	/**
	 * The operation id for the '<em>Generate Workflow For Execution System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GENERATE_WORKFLOW_FOR_EXECUTION_SYSTEM__MXICELL_IEXECUTIONSYSTEM = 6;

	/**
	 * The operation id for the '<em>Resolve Tool Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___RESOLVE_TOOL_DEPENDENCIES__MXICELL_CATALOG = 7;

	/**
	 * The operation id for the '<em>Resolve Preprocessing Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___RESOLVE_PREPROCESSING_TASK__MXICELL_MXICELL = 8;

	/**
	 * The operation id for the '<em>Find Cells Where Preprocessing Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___FIND_CELLS_WHERE_PREPROCESSING_IS_REQUIRED = 9;

	/**
	 * The operation id for the '<em>Find Cells With Untranslated Data Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___FIND_CELLS_WITH_UNTRANSLATED_DATA_LINKS = 10;

	/**
	 * The operation id for the '<em>Resolve Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___RESOLVE_EDGE__EMAP = 11;

	/**
	 * The operation id for the '<em>Apply Traversal Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_GROUPINGINSTANCE = 12;

	/**
	 * The operation id for the '<em>Apply Traversal Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_ELIST = 13;

	/**
	 * The operation id for the '<em>Apply Traversal Event Copy Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_GROUPINGINSTANCE = 14;

	/**
	 * The operation id for the '<em>Apply Traversal Event Copy Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_ELIST = 15;

	/**
	 * The operation id for the '<em>Resolve Traversal Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___RESOLVE_TRAVERSAL_EVENTS__MXICELL = 16;

	/**
	 * The operation id for the '<em>Reset Flag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___RESET_FLAG__INT = 17;

	/**
	 * The operation id for the '<em>Reset Flags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___RESET_FLAGS = 18;

	/**
	 * The operation id for the '<em>Get Grouping Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_GROUPING_INSTANCES__TRAVERSALEVENT = 19;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___INIT = 20;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 21;


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
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.AbstractGraph#resolveTraversalEvents(com.mxgraph.model.mxICell) <em>Resolve Traversal Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Traversal Events</em>' operation.
	 * @see easyflow.graph.jgraphx.AbstractGraph#resolveTraversalEvents(com.mxgraph.model.mxICell)
	 * @generated
	 */
	EOperation getAbstractGraph__ResolveTraversalEvents__mxICell();

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
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.TraversalEventGraph#applyTraversalEvent(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, java.lang.String, easyflow.metadata.GroupingInstance) <em>Apply Traversal Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Traversal Event</em>' operation.
	 * @see easyflow.graph.jgraphx.TraversalEventGraph#applyTraversalEvent(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, java.lang.String, easyflow.metadata.GroupingInstance)
	 * @generated
	 */
	EOperation getTraversalEventGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.TraversalEventGraph#applyTraversalEvent(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, java.lang.String, org.eclipse.emf.common.util.EList) <em>Apply Traversal Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Traversal Event</em>' operation.
	 * @see easyflow.graph.jgraphx.TraversalEventGraph#applyTraversalEvent(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTraversalEventGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.TraversalEventGraph#applyTraversalEventCopyGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, easyflow.metadata.GroupingInstance) <em>Apply Traversal Event Copy Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Traversal Event Copy Graph</em>' operation.
	 * @see easyflow.graph.jgraphx.TraversalEventGraph#applyTraversalEventCopyGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, easyflow.metadata.GroupingInstance)
	 * @generated
	 */
	EOperation getTraversalEventGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.TraversalEventGraph#applyTraversalEventCopyGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, org.eclipse.emf.common.util.EList) <em>Apply Traversal Event Copy Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Traversal Event Copy Graph</em>' operation.
	 * @see easyflow.graph.jgraphx.TraversalEventGraph#applyTraversalEventCopyGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTraversalEventGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList();

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
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.PreprocessingGraph#resolvePreprocessingTask(com.mxgraph.model.mxICell, com.mxgraph.model.mxICell) <em>Resolve Preprocessing Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Preprocessing Task</em>' operation.
	 * @see easyflow.graph.jgraphx.PreprocessingGraph#resolvePreprocessingTask(com.mxgraph.model.mxICell, com.mxgraph.model.mxICell)
	 * @generated
	 */
	EOperation getPreprocessingGraph__ResolvePreprocessingTask__mxICell_mxICell();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.PreprocessingGraph#findCellsWherePreprocessingIsRequired() <em>Find Cells Where Preprocessing Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Cells Where Preprocessing Is Required</em>' operation.
	 * @see easyflow.graph.jgraphx.PreprocessingGraph#findCellsWherePreprocessingIsRequired()
	 * @generated
	 */
	EOperation getPreprocessingGraph__FindCellsWherePreprocessingIsRequired();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.PreprocessingGraph#findCellsWithUntranslatedDataLinks() <em>Find Cells With Untranslated Data Links</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Cells With Untranslated Data Links</em>' operation.
	 * @see easyflow.graph.jgraphx.PreprocessingGraph#findCellsWithUntranslatedDataLinks()
	 * @generated
	 */
	EOperation getPreprocessingGraph__FindCellsWithUntranslatedDataLinks();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.PreprocessingGraph#resolveEdge(org.eclipse.emf.common.util.EMap) <em>Resolve Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Edge</em>' operation.
	 * @see easyflow.graph.jgraphx.PreprocessingGraph#resolveEdge(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPreprocessingGraph__ResolveEdge__EMap();

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
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.ToolDependencyGraph#resolveToolDependencies(com.mxgraph.model.mxICell, easyflow.core.Catalog) <em>Resolve Tool Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Tool Dependencies</em>' operation.
	 * @see easyflow.graph.jgraphx.ToolDependencyGraph#resolveToolDependencies(com.mxgraph.model.mxICell, easyflow.core.Catalog)
	 * @generated
	 */
	EOperation getToolDependencyGraph__ResolveToolDependencies__mxICell_Catalog();

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
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.ExecutionGraph#generateWorkflowForExecutionSystem(com.mxgraph.model.mxICell, easyflow.execution.IExecutionSystem) <em>Generate Workflow For Execution System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Workflow For Execution System</em>' operation.
	 * @see easyflow.graph.jgraphx.ExecutionGraph#generateWorkflowForExecutionSystem(com.mxgraph.model.mxICell, easyflow.execution.IExecutionSystem)
	 * @generated
	 */
	EOperation getExecutionGraph__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.ExecutionGraph#resolveToolParams(com.mxgraph.model.mxICell) <em>Resolve Tool Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Tool Params</em>' operation.
	 * @see easyflow.graph.jgraphx.ExecutionGraph#resolveToolParams(com.mxgraph.model.mxICell)
	 * @generated
	 */
	EOperation getExecutionGraph__ResolveToolParams__mxICell();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.ExecutionGraph#resolvePipes(com.mxgraph.model.mxICell) <em>Resolve Pipes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Pipes</em>' operation.
	 * @see easyflow.graph.jgraphx.ExecutionGraph#resolvePipes(com.mxgraph.model.mxICell)
	 * @generated
	 */
	EOperation getExecutionGraph__ResolvePipes__mxICell();

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
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.SubGraph#computeSubgraph(easyflow.traversal.TraversalEvent, boolean) <em>Compute Subgraph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Subgraph</em>' operation.
	 * @see easyflow.graph.jgraphx.SubGraph#computeSubgraph(easyflow.traversal.TraversalEvent, boolean)
	 * @generated
	 */
	EOperation getSubGraph__ComputeSubgraph__TraversalEvent_boolean();

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
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#getNextTraversalEvent(boolean) <em>Get Next Traversal Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Traversal Event</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#getNextTraversalEvent(boolean)
	 * @generated
	 */
	EOperation getGraph__GetNextTraversalEvent__boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#getTraversalEvents(com.mxgraph.model.mxICell, boolean) <em>Get Traversal Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Traversal Events</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#getTraversalEvents(com.mxgraph.model.mxICell, boolean)
	 * @generated
	 */
	EOperation getGraph__GetTraversalEvents__mxICell_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#getNewTraversalEvents(easyflow.traversal.TraversalEvent, com.mxgraph.model.mxICell) <em>Get New Traversal Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Traversal Events</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#getNewTraversalEvents(easyflow.traversal.TraversalEvent, com.mxgraph.model.mxICell)
	 * @generated
	 */
	EOperation getGraph__GetNewTraversalEvents__TraversalEvent_mxICell();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#removeSubGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent) <em>Remove Sub Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Sub Graph</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#removeSubGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent)
	 * @generated
	 */
	EOperation getGraph__RemoveSubGraph__mxICell_TraversalEvent();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#clear()
	 * @generated
	 */
	EOperation getGraph__Clear();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#computeSubgraph(easyflow.traversal.TraversalEvent, boolean) <em>Compute Subgraph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Subgraph</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#computeSubgraph(easyflow.traversal.TraversalEvent, boolean)
	 * @generated
	 */
	EOperation getGraph__ComputeSubgraph__TraversalEvent_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#generateWorkflowForExecutionSystem(com.mxgraph.model.mxICell, easyflow.execution.IExecutionSystem) <em>Generate Workflow For Execution System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Workflow For Execution System</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#generateWorkflowForExecutionSystem(com.mxgraph.model.mxICell, easyflow.execution.IExecutionSystem)
	 * @generated
	 */
	EOperation getGraph__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#resolveToolDependencies(com.mxgraph.model.mxICell, easyflow.core.Catalog) <em>Resolve Tool Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Tool Dependencies</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#resolveToolDependencies(com.mxgraph.model.mxICell, easyflow.core.Catalog)
	 * @generated
	 */
	EOperation getGraph__ResolveToolDependencies__mxICell_Catalog();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#resolvePreprocessingTask(com.mxgraph.model.mxICell, com.mxgraph.model.mxICell) <em>Resolve Preprocessing Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Preprocessing Task</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#resolvePreprocessingTask(com.mxgraph.model.mxICell, com.mxgraph.model.mxICell)
	 * @generated
	 */
	EOperation getGraph__ResolvePreprocessingTask__mxICell_mxICell();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#findCellsWherePreprocessingIsRequired() <em>Find Cells Where Preprocessing Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Cells Where Preprocessing Is Required</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#findCellsWherePreprocessingIsRequired()
	 * @generated
	 */
	EOperation getGraph__FindCellsWherePreprocessingIsRequired();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#findCellsWithUntranslatedDataLinks() <em>Find Cells With Untranslated Data Links</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Cells With Untranslated Data Links</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#findCellsWithUntranslatedDataLinks()
	 * @generated
	 */
	EOperation getGraph__FindCellsWithUntranslatedDataLinks();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#resolveEdge(org.eclipse.emf.common.util.EMap) <em>Resolve Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Edge</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#resolveEdge(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getGraph__ResolveEdge__EMap();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#applyTraversalEvent(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, java.lang.String, easyflow.metadata.GroupingInstance) <em>Apply Traversal Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Traversal Event</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#applyTraversalEvent(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, java.lang.String, easyflow.metadata.GroupingInstance)
	 * @generated
	 */
	EOperation getGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#applyTraversalEvent(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, java.lang.String, org.eclipse.emf.common.util.EList) <em>Apply Traversal Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Traversal Event</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#applyTraversalEvent(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#applyTraversalEventCopyGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, easyflow.metadata.GroupingInstance) <em>Apply Traversal Event Copy Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Traversal Event Copy Graph</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#applyTraversalEventCopyGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, easyflow.metadata.GroupingInstance)
	 * @generated
	 */
	EOperation getGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#applyTraversalEventCopyGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, org.eclipse.emf.common.util.EList) <em>Apply Traversal Event Copy Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Traversal Event Copy Graph</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#applyTraversalEventCopyGraph(com.mxgraph.model.mxICell, easyflow.traversal.TraversalEvent, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#resolveTraversalEvents(com.mxgraph.model.mxICell) <em>Resolve Traversal Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Traversal Events</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#resolveTraversalEvents(com.mxgraph.model.mxICell)
	 * @generated
	 */
	EOperation getGraph__ResolveTraversalEvents__mxICell();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#resetFlag(int) <em>Reset Flag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Flag</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#resetFlag(int)
	 * @generated
	 */
	EOperation getGraph__ResetFlag__int();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#resetFlags() <em>Reset Flags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Flags</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#resetFlags()
	 * @generated
	 */
	EOperation getGraph__ResetFlags();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#getGroupingInstances(easyflow.traversal.TraversalEvent) <em>Get Grouping Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Grouping Instances</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#getGroupingInstances(easyflow.traversal.TraversalEvent)
	 * @generated
	 */
	EOperation getGraph__GetGroupingInstances__TraversalEvent();

	/**
	 * Returns the meta object for the '{@link easyflow.graph.jgraphx.Graph#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see easyflow.graph.jgraphx.Graph#init()
	 * @generated
	 */
	EOperation getGraph__Init();

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
		 * The meta object literal for the '<em><b>Resolve Traversal Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___RESOLVE_TRAVERSAL_EVENTS__MXICELL = eINSTANCE.getAbstractGraph__ResolveTraversalEvents__mxICell();
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
		 * The meta object literal for the '<em><b>Apply Traversal Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_GROUPINGINSTANCE = eINSTANCE.getTraversalEventGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance();
		/**
		 * The meta object literal for the '<em><b>Apply Traversal Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_ELIST = eINSTANCE.getTraversalEventGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList();
		/**
		 * The meta object literal for the '<em><b>Apply Traversal Event Copy Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_GROUPINGINSTANCE = eINSTANCE.getTraversalEventGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance();
		/**
		 * The meta object literal for the '<em><b>Apply Traversal Event Copy Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_ELIST = eINSTANCE.getTraversalEventGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList();
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
		 * The meta object literal for the '<em><b>Resolve Preprocessing Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREPROCESSING_GRAPH___RESOLVE_PREPROCESSING_TASK__MXICELL_MXICELL = eINSTANCE.getPreprocessingGraph__ResolvePreprocessingTask__mxICell_mxICell();
		/**
		 * The meta object literal for the '<em><b>Find Cells Where Preprocessing Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREPROCESSING_GRAPH___FIND_CELLS_WHERE_PREPROCESSING_IS_REQUIRED = eINSTANCE.getPreprocessingGraph__FindCellsWherePreprocessingIsRequired();
		/**
		 * The meta object literal for the '<em><b>Find Cells With Untranslated Data Links</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREPROCESSING_GRAPH___FIND_CELLS_WITH_UNTRANSLATED_DATA_LINKS = eINSTANCE.getPreprocessingGraph__FindCellsWithUntranslatedDataLinks();
		/**
		 * The meta object literal for the '<em><b>Resolve Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREPROCESSING_GRAPH___RESOLVE_EDGE__EMAP = eINSTANCE.getPreprocessingGraph__ResolveEdge__EMap();
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
		 * The meta object literal for the '<em><b>Resolve Tool Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_DEPENDENCY_GRAPH___RESOLVE_TOOL_DEPENDENCIES__MXICELL_CATALOG = eINSTANCE.getToolDependencyGraph__ResolveToolDependencies__mxICell_Catalog();
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
		 * The meta object literal for the '<em><b>Generate Workflow For Execution System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_GRAPH___GENERATE_WORKFLOW_FOR_EXECUTION_SYSTEM__MXICELL_IEXECUTIONSYSTEM = eINSTANCE.getExecutionGraph__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem();
		/**
		 * The meta object literal for the '<em><b>Resolve Tool Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_GRAPH___RESOLVE_TOOL_PARAMS__MXICELL = eINSTANCE.getExecutionGraph__ResolveToolParams__mxICell();
		/**
		 * The meta object literal for the '<em><b>Resolve Pipes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_GRAPH___RESOLVE_PIPES__MXICELL = eINSTANCE.getExecutionGraph__ResolvePipes__mxICell();
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
		 * The meta object literal for the '<em><b>Compute Subgraph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_GRAPH___COMPUTE_SUBGRAPH__TRAVERSALEVENT_BOOLEAN = eINSTANCE.getSubGraph__ComputeSubgraph__TraversalEvent_boolean();
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
		/**
		 * The meta object literal for the '<em><b>Get Next Traversal Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_NEXT_TRAVERSAL_EVENT__BOOLEAN = eINSTANCE.getGraph__GetNextTraversalEvent__boolean();
		/**
		 * The meta object literal for the '<em><b>Get Traversal Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_TRAVERSAL_EVENTS__MXICELL_BOOLEAN = eINSTANCE.getGraph__GetTraversalEvents__mxICell_boolean();
		/**
		 * The meta object literal for the '<em><b>Get New Traversal Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_NEW_TRAVERSAL_EVENTS__TRAVERSALEVENT_MXICELL = eINSTANCE.getGraph__GetNewTraversalEvents__TraversalEvent_mxICell();
		/**
		 * The meta object literal for the '<em><b>Remove Sub Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_SUB_GRAPH__MXICELL_TRAVERSALEVENT = eINSTANCE.getGraph__RemoveSubGraph__mxICell_TraversalEvent();
		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___CLEAR = eINSTANCE.getGraph__Clear();
		/**
		 * The meta object literal for the '<em><b>Compute Subgraph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___COMPUTE_SUBGRAPH__TRAVERSALEVENT_BOOLEAN = eINSTANCE.getGraph__ComputeSubgraph__TraversalEvent_boolean();
		/**
		 * The meta object literal for the '<em><b>Generate Workflow For Execution System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GENERATE_WORKFLOW_FOR_EXECUTION_SYSTEM__MXICELL_IEXECUTIONSYSTEM = eINSTANCE.getGraph__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem();
		/**
		 * The meta object literal for the '<em><b>Resolve Tool Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___RESOLVE_TOOL_DEPENDENCIES__MXICELL_CATALOG = eINSTANCE.getGraph__ResolveToolDependencies__mxICell_Catalog();
		/**
		 * The meta object literal for the '<em><b>Resolve Preprocessing Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___RESOLVE_PREPROCESSING_TASK__MXICELL_MXICELL = eINSTANCE.getGraph__ResolvePreprocessingTask__mxICell_mxICell();
		/**
		 * The meta object literal for the '<em><b>Find Cells Where Preprocessing Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___FIND_CELLS_WHERE_PREPROCESSING_IS_REQUIRED = eINSTANCE.getGraph__FindCellsWherePreprocessingIsRequired();
		/**
		 * The meta object literal for the '<em><b>Find Cells With Untranslated Data Links</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___FIND_CELLS_WITH_UNTRANSLATED_DATA_LINKS = eINSTANCE.getGraph__FindCellsWithUntranslatedDataLinks();
		/**
		 * The meta object literal for the '<em><b>Resolve Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___RESOLVE_EDGE__EMAP = eINSTANCE.getGraph__ResolveEdge__EMap();
		/**
		 * The meta object literal for the '<em><b>Apply Traversal Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_GROUPINGINSTANCE = eINSTANCE.getGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance();
		/**
		 * The meta object literal for the '<em><b>Apply Traversal Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_ELIST = eINSTANCE.getGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList();
		/**
		 * The meta object literal for the '<em><b>Apply Traversal Event Copy Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_GROUPINGINSTANCE = eINSTANCE.getGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance();
		/**
		 * The meta object literal for the '<em><b>Apply Traversal Event Copy Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_ELIST = eINSTANCE.getGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList();
		/**
		 * The meta object literal for the '<em><b>Resolve Traversal Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___RESOLVE_TRAVERSAL_EVENTS__MXICELL = eINSTANCE.getGraph__ResolveTraversalEvents__mxICell();
		/**
		 * The meta object literal for the '<em><b>Reset Flag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___RESET_FLAG__INT = eINSTANCE.getGraph__ResetFlag__int();
		/**
		 * The meta object literal for the '<em><b>Reset Flags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___RESET_FLAGS = eINSTANCE.getGraph__ResetFlags();
		/**
		 * The meta object literal for the '<em><b>Get Grouping Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_GROUPING_INSTANCES__TRAVERSALEVENT = eINSTANCE.getGraph__GetGroupingInstances__TraversalEvent();
		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___INIT = eINSTANCE.getGraph__Init();

	}

} //JgraphxPackage
