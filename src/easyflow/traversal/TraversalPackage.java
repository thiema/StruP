/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal;

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
 * @see easyflow.traversal.TraversalFactory
 * @model kind="package"
 * @generated
 */
public interface TraversalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traversal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/traversal/1.0.0";

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
	TraversalPackage eINSTANCE = easyflow.traversal.impl.TraversalPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.traversal.impl.GroupingCriterionImpl <em>Grouping Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.traversal.impl.GroupingCriterionImpl
	 * @see easyflow.traversal.impl.TraversalPackageImpl#getGroupingCriterion()
	 * @generated
	 */
	int GROUPING_CRITERION = 1;

	/**
	 * The meta object id for the '{@link easyflow.traversal.impl.TraversalCriterionImpl <em>Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.traversal.impl.TraversalCriterionImpl
	 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalCriterion()
	 * @generated
	 */
	int TRAVERSAL_CRITERION = 2;

	/**
	 * The meta object id for the '{@link easyflow.traversal.impl.TraversalEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.traversal.impl.TraversalEventImpl
	 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalEvent()
	 * @generated
	 */
	int TRAVERSAL_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Merge Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__MERGE_TASK = 0;

	/**
	 * The feature id for the '<em><b>Split Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__SPLIT_TASK = 1;

	/**
	 * The feature id for the '<em><b>Parent Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__PARENT_TASK = 2;

	/**
	 * The feature id for the '<em><b>Merge Tasks Param Crit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__MERGE_TASKS_PARAM_CRIT = 3;

	/**
	 * The feature id for the '<em><b>Parent Cells</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__PARENT_CELLS = 4;

	/**
	 * The feature id for the '<em><b>Traversal Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__TRAVERSAL_CRITERION = 5;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__LOGGER = 6;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__META_DATA = 7;

	/**
	 * The feature id for the '<em><b>Dependancy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__DEPENDANCY = 8;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Apply Metadata</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT___APPLY_METADATA = 0;

	/**
	 * The operation id for the '<em>Read Chunks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT___READ_CHUNKS = 1;

	/**
	 * The operation id for the '<em>Is Grouping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT___IS_GROUPING = 2;

	/**
	 * The operation id for the '<em>Is Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT___IS_PARENT__TASK_STRING = 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT___GET_TYPE = 4;

	/**
	 * The operation id for the '<em>Get Dep Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT___GET_DEP_NUM = 5;

	/**
	 * The operation id for the '<em>Inc Dep</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT___INC_DEP = 6;

	/**
	 * The operation id for the '<em>Dec Dep</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT___DEC_DEP = 7;

	/**
	 * The operation id for the '<em>Has Dep</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT___HAS_DEP = 8;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_OPERATION_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__MODE = 3;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__MULTIPLE_INSTANCES = 4;

	/**
	 * The feature id for the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__SEPERATE_INPUT_PORTS = 5;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__LOGGER = 6;

	/**
	 * The feature id for the '<em><b>Data Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__DATA_PORT = 7;

	/**
	 * The number of structural features of the '<em>Grouping Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Grouping Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__ID = GROUPING_CRITERION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__NAME = GROUPING_CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__DESCRIPTION = GROUPING_CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__MODE = GROUPING_CRITERION__MODE;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__MULTIPLE_INSTANCES = GROUPING_CRITERION__MULTIPLE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__SEPERATE_INPUT_PORTS = GROUPING_CRITERION__SEPERATE_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__LOGGER = GROUPING_CRITERION__LOGGER;

	/**
	 * The feature id for the '<em><b>Data Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__DATA_PORT = GROUPING_CRITERION__DATA_PORT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__OPERATION = GROUPING_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__CHUNKS = GROUPING_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Chunk Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__CHUNK_SOURCE = GROUPING_CRITERION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION_FEATURE_COUNT = GROUPING_CRITERION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION_OPERATION_COUNT = GROUPING_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link easyflow.traversal.impl.TraversalOperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.traversal.impl.TraversalOperationImpl
	 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalOperation()
	 * @generated
	 */
	int TRAVERSAL_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_OPERATION__LOGGER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_OPERATION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.traversal.impl.TraversalChunkImpl <em>Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.traversal.impl.TraversalChunkImpl
	 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalChunk()
	 * @generated
	 */
	int TRAVERSAL_CHUNK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK__LOGGER = 1;

	/**
	 * The feature id for the '<em><b>Derived1by1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK__DERIVED1BY1 = 2;

	/**
	 * The feature id for the '<em><b>Grouping Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK__GROUPING_INSTANCE = 3;

	/**
	 * The number of structural features of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK_FEATURE_COUNT = 4;


	/**
	 * The operation id for the '<em>As Grouping Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK___AS_GROUPING_INSTANCE = 0;

	/**
	 * The number of operations of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '{@link easyflow.traversal.impl.TraversalDependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.traversal.impl.TraversalDependencyImpl
	 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalDependency()
	 * @generated
	 */
	int TRAVERSAL_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_DEPENDENCY__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Processed Cells</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_DEPENDENCY__PROCESSED_CELLS = 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_DEPENDENCY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link easyflow.traversal.GroupingCriterion <em>Grouping Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping Criterion</em>'.
	 * @see easyflow.traversal.GroupingCriterion
	 * @generated
	 */
	EClass getGroupingCriterion();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.GroupingCriterion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see easyflow.traversal.GroupingCriterion#getId()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_Id();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.GroupingCriterion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.traversal.GroupingCriterion#getName()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.GroupingCriterion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see easyflow.traversal.GroupingCriterion#getDescription()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_Description();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.GroupingCriterion#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see easyflow.traversal.GroupingCriterion#getMode()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_Mode();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.GroupingCriterion#isMultipleInstances <em>Multiple Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Instances</em>'.
	 * @see easyflow.traversal.GroupingCriterion#isMultipleInstances()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_MultipleInstances();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.GroupingCriterion#isSeperateInputPorts <em>Seperate Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seperate Input Ports</em>'.
	 * @see easyflow.traversal.GroupingCriterion#isSeperateInputPorts()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_SeperateInputPorts();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.GroupingCriterion#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.traversal.GroupingCriterion#getLogger()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_Logger();

	/**
	 * Returns the meta object for the reference '{@link easyflow.traversal.GroupingCriterion#getDataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Port</em>'.
	 * @see easyflow.traversal.GroupingCriterion#getDataPort()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EReference getGroupingCriterion_DataPort();

	/**
	 * Returns the meta object for class '{@link easyflow.traversal.TraversalCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion</em>'.
	 * @see easyflow.traversal.TraversalCriterion
	 * @generated
	 */
	EClass getTraversalCriterion();

	/**
	 * Returns the meta object for the reference '{@link easyflow.traversal.TraversalCriterion#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see easyflow.traversal.TraversalCriterion#getOperation()
	 * @see #getTraversalCriterion()
	 * @generated
	 */
	EReference getTraversalCriterion_Operation();

	/**
	 * Returns the meta object for the map '{@link easyflow.traversal.TraversalCriterion#getChunks <em>Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Chunks</em>'.
	 * @see easyflow.traversal.TraversalCriterion#getChunks()
	 * @see #getTraversalCriterion()
	 * @generated
	 */
	EReference getTraversalCriterion_Chunks();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalCriterion#getChunkSource <em>Chunk Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chunk Source</em>'.
	 * @see easyflow.traversal.TraversalCriterion#getChunkSource()
	 * @see #getTraversalCriterion()
	 * @generated
	 */
	EAttribute getTraversalCriterion_ChunkSource();

	/**
	 * Returns the meta object for class '{@link easyflow.traversal.TraversalEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see easyflow.traversal.TraversalEvent
	 * @generated
	 */
	EClass getTraversalEvent();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.traversal.TraversalEvent#getMergeTask <em>Merge Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merge Task</em>'.
	 * @see easyflow.traversal.TraversalEvent#getMergeTask()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_MergeTask();

	/**
	 * Returns the meta object for the reference '{@link easyflow.traversal.TraversalEvent#getSplitTask <em>Split Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Split Task</em>'.
	 * @see easyflow.traversal.TraversalEvent#getSplitTask()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_SplitTask();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.traversal.TraversalEvent#getParentTask <em>Parent Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Task</em>'.
	 * @see easyflow.traversal.TraversalEvent#getParentTask()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_ParentTask();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.traversal.TraversalEvent#getMergeTasksParamCrit <em>Merge Tasks Param Crit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merge Tasks Param Crit</em>'.
	 * @see easyflow.traversal.TraversalEvent#getMergeTasksParamCrit()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_MergeTasksParamCrit();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.traversal.TraversalEvent#getParentCells <em>Parent Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parent Cells</em>'.
	 * @see easyflow.traversal.TraversalEvent#getParentCells()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EAttribute getTraversalEvent_ParentCells();

	/**
	 * Returns the meta object for the reference '{@link easyflow.traversal.TraversalEvent#getTraversalCriterion <em>Traversal Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Traversal Criterion</em>'.
	 * @see easyflow.traversal.TraversalEvent#getTraversalCriterion()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_TraversalCriterion();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalEvent#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.traversal.TraversalEvent#getLogger()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EAttribute getTraversalEvent_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalEvent#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data</em>'.
	 * @see easyflow.traversal.TraversalEvent#getMetaData()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EAttribute getTraversalEvent_MetaData();

	/**
	 * Returns the meta object for the reference '{@link easyflow.traversal.TraversalEvent#getDependancy <em>Dependancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependancy</em>'.
	 * @see easyflow.traversal.TraversalEvent#getDependancy()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_Dependancy();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalEvent#applyMetadata() <em>Apply Metadata</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Metadata</em>' operation.
	 * @see easyflow.traversal.TraversalEvent#applyMetadata()
	 * @generated
	 */
	EOperation getTraversalEvent__ApplyMetadata();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalEvent#readChunks() <em>Read Chunks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Chunks</em>' operation.
	 * @see easyflow.traversal.TraversalEvent#readChunks()
	 * @generated
	 */
	EOperation getTraversalEvent__ReadChunks();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalEvent#isGrouping() <em>Is Grouping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Grouping</em>' operation.
	 * @see easyflow.traversal.TraversalEvent#isGrouping()
	 * @generated
	 */
	EOperation getTraversalEvent__IsGrouping();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalEvent#isParent(easyflow.core.Task, java.lang.String) <em>Is Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Parent</em>' operation.
	 * @see easyflow.traversal.TraversalEvent#isParent(easyflow.core.Task, java.lang.String)
	 * @generated
	 */
	EOperation getTraversalEvent__IsParent__Task_String();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalEvent#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see easyflow.traversal.TraversalEvent#getType()
	 * @generated
	 */
	EOperation getTraversalEvent__GetType();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalEvent#getDepNum() <em>Get Dep Num</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dep Num</em>' operation.
	 * @see easyflow.traversal.TraversalEvent#getDepNum()
	 * @generated
	 */
	EOperation getTraversalEvent__GetDepNum();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalEvent#incDep() <em>Inc Dep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inc Dep</em>' operation.
	 * @see easyflow.traversal.TraversalEvent#incDep()
	 * @generated
	 */
	EOperation getTraversalEvent__IncDep();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalEvent#decDep() <em>Dec Dep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dec Dep</em>' operation.
	 * @see easyflow.traversal.TraversalEvent#decDep()
	 * @generated
	 */
	EOperation getTraversalEvent__DecDep();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalEvent#hasDep() <em>Has Dep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Dep</em>' operation.
	 * @see easyflow.traversal.TraversalEvent#hasDep()
	 * @generated
	 */
	EOperation getTraversalEvent__HasDep();

	/**
	 * Returns the meta object for class '{@link easyflow.traversal.TraversalOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see easyflow.traversal.TraversalOperation
	 * @generated
	 */
	EClass getTraversalOperation();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.traversal.TraversalOperation#getName()
	 * @see #getTraversalOperation()
	 * @generated
	 */
	EAttribute getTraversalOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalOperation#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.traversal.TraversalOperation#getLogger()
	 * @see #getTraversalOperation()
	 * @generated
	 */
	EAttribute getTraversalOperation_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see easyflow.traversal.TraversalOperation#getType()
	 * @see #getTraversalOperation()
	 * @generated
	 */
	EAttribute getTraversalOperation_Type();

	/**
	 * Returns the meta object for class '{@link easyflow.traversal.TraversalChunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk</em>'.
	 * @see easyflow.traversal.TraversalChunk
	 * @generated
	 */
	EClass getTraversalChunk();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalChunk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.traversal.TraversalChunk#getName()
	 * @see #getTraversalChunk()
	 * @generated
	 */
	EAttribute getTraversalChunk_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalChunk#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.traversal.TraversalChunk#getLogger()
	 * @see #getTraversalChunk()
	 * @generated
	 */
	EAttribute getTraversalChunk_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalChunk#isDerived1by1 <em>Derived1by1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived1by1</em>'.
	 * @see easyflow.traversal.TraversalChunk#isDerived1by1()
	 * @see #getTraversalChunk()
	 * @generated
	 */
	EAttribute getTraversalChunk_Derived1by1();

	/**
	 * Returns the meta object for the reference '{@link easyflow.traversal.TraversalChunk#getGroupingInstance <em>Grouping Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grouping Instance</em>'.
	 * @see easyflow.traversal.TraversalChunk#getGroupingInstance()
	 * @see #getTraversalChunk()
	 * @generated
	 */
	EReference getTraversalChunk_GroupingInstance();

	/**
	 * Returns the meta object for the '{@link easyflow.traversal.TraversalChunk#asGroupingInstance() <em>As Grouping Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Grouping Instance</em>' operation.
	 * @see easyflow.traversal.TraversalChunk#asGroupingInstance()
	 * @generated
	 */
	EOperation getTraversalChunk__AsGroupingInstance();

	/**
	 * Returns the meta object for class '{@link easyflow.traversal.TraversalDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see easyflow.traversal.TraversalDependency
	 * @generated
	 */
	EClass getTraversalDependency();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.traversal.TraversalDependency#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see easyflow.traversal.TraversalDependency#getNumber()
	 * @see #getTraversalDependency()
	 * @generated
	 */
	EAttribute getTraversalDependency_Number();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.traversal.TraversalDependency#getProcessedCells <em>Processed Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Processed Cells</em>'.
	 * @see easyflow.traversal.TraversalDependency#getProcessedCells()
	 * @see #getTraversalDependency()
	 * @generated
	 */
	EAttribute getTraversalDependency_ProcessedCells();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraversalFactory getTraversalFactory();

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
		 * The meta object literal for the '{@link easyflow.traversal.impl.GroupingCriterionImpl <em>Grouping Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.traversal.impl.GroupingCriterionImpl
		 * @see easyflow.traversal.impl.TraversalPackageImpl#getGroupingCriterion()
		 * @generated
		 */
		EClass GROUPING_CRITERION = eINSTANCE.getGroupingCriterion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__ID = eINSTANCE.getGroupingCriterion_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__NAME = eINSTANCE.getGroupingCriterion_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__DESCRIPTION = eINSTANCE.getGroupingCriterion_Description();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__MODE = eINSTANCE.getGroupingCriterion_Mode();

		/**
		 * The meta object literal for the '<em><b>Multiple Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__MULTIPLE_INSTANCES = eINSTANCE.getGroupingCriterion_MultipleInstances();

		/**
		 * The meta object literal for the '<em><b>Seperate Input Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__SEPERATE_INPUT_PORTS = eINSTANCE.getGroupingCriterion_SeperateInputPorts();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__LOGGER = eINSTANCE.getGroupingCriterion_Logger();

		/**
		 * The meta object literal for the '<em><b>Data Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING_CRITERION__DATA_PORT = eINSTANCE.getGroupingCriterion_DataPort();

		/**
		 * The meta object literal for the '{@link easyflow.traversal.impl.TraversalCriterionImpl <em>Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.traversal.impl.TraversalCriterionImpl
		 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalCriterion()
		 * @generated
		 */
		EClass TRAVERSAL_CRITERION = eINSTANCE.getTraversalCriterion();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_CRITERION__OPERATION = eINSTANCE.getTraversalCriterion_Operation();

		/**
		 * The meta object literal for the '<em><b>Chunks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_CRITERION__CHUNKS = eINSTANCE.getTraversalCriterion_Chunks();

		/**
		 * The meta object literal for the '<em><b>Chunk Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_CRITERION__CHUNK_SOURCE = eINSTANCE.getTraversalCriterion_ChunkSource();

		/**
		 * The meta object literal for the '{@link easyflow.traversal.impl.TraversalEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.traversal.impl.TraversalEventImpl
		 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalEvent()
		 * @generated
		 */
		EClass TRAVERSAL_EVENT = eINSTANCE.getTraversalEvent();

		/**
		 * The meta object literal for the '<em><b>Merge Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__MERGE_TASK = eINSTANCE.getTraversalEvent_MergeTask();

		/**
		 * The meta object literal for the '<em><b>Split Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__SPLIT_TASK = eINSTANCE.getTraversalEvent_SplitTask();

		/**
		 * The meta object literal for the '<em><b>Parent Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__PARENT_TASK = eINSTANCE.getTraversalEvent_ParentTask();

		/**
		 * The meta object literal for the '<em><b>Merge Tasks Param Crit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__MERGE_TASKS_PARAM_CRIT = eINSTANCE.getTraversalEvent_MergeTasksParamCrit();

		/**
		 * The meta object literal for the '<em><b>Parent Cells</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_EVENT__PARENT_CELLS = eINSTANCE.getTraversalEvent_ParentCells();

		/**
		 * The meta object literal for the '<em><b>Traversal Criterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__TRAVERSAL_CRITERION = eINSTANCE.getTraversalEvent_TraversalCriterion();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_EVENT__LOGGER = eINSTANCE.getTraversalEvent_Logger();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_EVENT__META_DATA = eINSTANCE.getTraversalEvent_MetaData();

		/**
		 * The meta object literal for the '<em><b>Dependancy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__DEPENDANCY = eINSTANCE.getTraversalEvent_Dependancy();

		/**
		 * The meta object literal for the '<em><b>Apply Metadata</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT___APPLY_METADATA = eINSTANCE.getTraversalEvent__ApplyMetadata();

		/**
		 * The meta object literal for the '<em><b>Read Chunks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT___READ_CHUNKS = eINSTANCE.getTraversalEvent__ReadChunks();

		/**
		 * The meta object literal for the '<em><b>Is Grouping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT___IS_GROUPING = eINSTANCE.getTraversalEvent__IsGrouping();

		/**
		 * The meta object literal for the '<em><b>Is Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT___IS_PARENT__TASK_STRING = eINSTANCE.getTraversalEvent__IsParent__Task_String();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT___GET_TYPE = eINSTANCE.getTraversalEvent__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Dep Num</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT___GET_DEP_NUM = eINSTANCE.getTraversalEvent__GetDepNum();

		/**
		 * The meta object literal for the '<em><b>Inc Dep</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT___INC_DEP = eINSTANCE.getTraversalEvent__IncDep();

		/**
		 * The meta object literal for the '<em><b>Dec Dep</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT___DEC_DEP = eINSTANCE.getTraversalEvent__DecDep();

		/**
		 * The meta object literal for the '<em><b>Has Dep</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_EVENT___HAS_DEP = eINSTANCE.getTraversalEvent__HasDep();

		/**
		 * The meta object literal for the '{@link easyflow.traversal.impl.TraversalOperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.traversal.impl.TraversalOperationImpl
		 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalOperation()
		 * @generated
		 */
		EClass TRAVERSAL_OPERATION = eINSTANCE.getTraversalOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_OPERATION__NAME = eINSTANCE.getTraversalOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_OPERATION__LOGGER = eINSTANCE.getTraversalOperation_Logger();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_OPERATION__TYPE = eINSTANCE.getTraversalOperation_Type();

		/**
		 * The meta object literal for the '{@link easyflow.traversal.impl.TraversalChunkImpl <em>Chunk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.traversal.impl.TraversalChunkImpl
		 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalChunk()
		 * @generated
		 */
		EClass TRAVERSAL_CHUNK = eINSTANCE.getTraversalChunk();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_CHUNK__NAME = eINSTANCE.getTraversalChunk_Name();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_CHUNK__LOGGER = eINSTANCE.getTraversalChunk_Logger();

		/**
		 * The meta object literal for the '<em><b>Derived1by1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_CHUNK__DERIVED1BY1 = eINSTANCE.getTraversalChunk_Derived1by1();

		/**
		 * The meta object literal for the '<em><b>Grouping Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_CHUNK__GROUPING_INSTANCE = eINSTANCE.getTraversalChunk_GroupingInstance();

		/**
		 * The meta object literal for the '<em><b>As Grouping Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVERSAL_CHUNK___AS_GROUPING_INSTANCE = eINSTANCE.getTraversalChunk__AsGroupingInstance();

		/**
		 * The meta object literal for the '{@link easyflow.traversal.impl.TraversalDependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.traversal.impl.TraversalDependencyImpl
		 * @see easyflow.traversal.impl.TraversalPackageImpl#getTraversalDependency()
		 * @generated
		 */
		EClass TRAVERSAL_DEPENDENCY = eINSTANCE.getTraversalDependency();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_DEPENDENCY__NUMBER = eINSTANCE.getTraversalDependency_Number();

		/**
		 * The meta object literal for the '<em><b>Processed Cells</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_DEPENDENCY__PROCESSED_CELLS = eINSTANCE.getTraversalDependency_ProcessedCells();

	}

} //TraversalPackage
