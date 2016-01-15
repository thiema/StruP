/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.data;

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
 * @see easyflow.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/data/1.0.0";

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
	DataPackage eINSTANCE = easyflow.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.data.impl.DataPortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.data.impl.DataPortImpl
	 * @see easyflow.data.impl.DataPackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 0;

	/**
	 * The feature id for the '<em><b>Grouping Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__GROUPING_CRITERIA = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Data Formats</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__DATA_FORMATS = 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__OPTIONAL = 3;

	/**
	 * The feature id for the '<em><b>Bit Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__BIT_POS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__NAME = 5;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__TOOLS = 6;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__STATIC = 7;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__PARAMETER_NAME = 8;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Is Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___IS_COMPATIBLE__DATAPORT = 0;

	/**
	 * The operation id for the '<em>Remove Data Port From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___REMOVE_DATA_PORT_FROM__ELIST = 1;

	/**
	 * The operation id for the '<em>Get Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___GET_FORMAT = 2;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___MATCHES__DATAFORMAT = 3;

	/**
	 * The operation id for the '<em>Is Compatible Str</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___IS_COMPATIBLE_STR__ELIST_BOOLEAN = 4;

	/**
	 * The operation id for the '<em>Is Compatible Str</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___IS_COMPATIBLE_STR__ELIST = 5;

	/**
	 * The operation id for the '<em>Is Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___IS_COMPATIBLE__ELIST_BOOLEAN = 6;

	/**
	 * The operation id for the '<em>Is Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___IS_COMPATIBLE__ELIST = 7;

	/**
	 * The operation id for the '<em>Is Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___IS_COMPATIBLE__STRING = 8;

	/**
	 * The operation id for the '<em>Is Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___IS_COMPATIBLE__DATAFORMAT = 9;

	/**
	 * The operation id for the '<em>Set Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___SET_FORMAT__STRING = 10;

	/**
	 * The operation id for the '<em>Set Formats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT___SET_FORMATS__ELIST = 11;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link easyflow.data.impl.DataLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.data.impl.DataLinkImpl
	 * @see easyflow.data.impl.DataPackageImpl#getDataLink()
	 * @generated
	 */
	int DATA_LINK = 1;

	/**
	 * The feature id for the '<em><b>Data Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__DATA_PORT = 0;

	/**
	 * The feature id for the '<em><b>In Data Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__IN_DATA_PORT = 1;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__CHUNKS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__ID = 3;

	/**
	 * The feature id for the '<em><b>Grouping Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__GROUPING_STR = 4;

	/**
	 * The feature id for the '<em><b>Parent Grouping Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__PARENT_GROUPING_STR = 5;

	/**
	 * The feature id for the '<em><b>Param Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__PARAM_STR = 6;

	/**
	 * The feature id for the '<em><b>Param Name Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__PARAM_NAME_STR = 7;

	/**
	 * The feature id for the '<em><b>Param Chunks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__PARAM_CHUNKS = 8;

	/**
	 * The feature id for the '<em><b>Identical Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__IDENTICAL_GROUPING = 9;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Intermediate Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__INTERMEDIATE_TASKS = 11;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__DATA = 12;

	/**
	 * The feature id for the '<em><b>In Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__IN_DATA = 13;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__TERMINAL = 14;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__PROCESSED = 15;

	/**
	 * The feature id for the '<em><b>Data Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__DATA_RESOURCE_NAME = 16;

	/**
	 * The feature id for the '<em><b>Pipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__PIPE = 17;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_FEATURE_COUNT = 18;

	/**
	 * The operation id for the '<em>Is Unconditional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK___IS_UNCONDITIONAL = 0;

	/**
	 * The operation id for the '<em>Get Unique String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK___GET_UNIQUE_STRING__STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Get Unique String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK___GET_UNIQUE_STRING = 2;

	/**
	 * The operation id for the '<em>Get Unique String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK___GET_UNIQUE_STRING__BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Get Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK___GET_FORMAT = 4;

	/**
	 * The operation id for the '<em>Is Pipeable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK___IS_PIPEABLE = 5;

	/**
	 * The operation id for the '<em>Get Matching Data For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK___GET_MATCHING_DATA_FOR__ELIST_ELIST_BOOLEAN = 6;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link easyflow.data.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.data.impl.DataImpl
	 * @see easyflow.data.impl.DataPackageImpl#getData()
	 * @generated
	 */
	int DATA = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PORT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Resolved Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__RESOLVED_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__HANDLE = 7;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___GET_FORMAT = 0;

	/**
	 * The operation id for the '<em>Get Format Str</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___GET_FORMAT_STR = 1;

	/**
	 * The operation id for the '<em>Is Allowed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___IS_ALLOWED = 2;

	/**
	 * The operation id for the '<em>Get Supported Handles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___GET_SUPPORTED_HANDLES = 3;

	/**
	 * The operation id for the '<em>Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___MATCH__DATA = 4;

	/**
	 * The operation id for the '<em>Match Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___MATCH_FORMAT__DATAFORMAT = 5;

	/**
	 * The operation id for the '<em>Resolve Handle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___RESOLVE_HANDLE__DATA = 6;

	/**
	 * The operation id for the '<em>Resolve Handle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___RESOLVE_HANDLE__STRING = 7;

	/**
	 * The operation id for the '<em>Resolve Supported Handles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___RESOLVE_SUPPORTED_HANDLES = 8;

	/**
	 * The operation id for the '<em>Is Pipable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___IS_PIPABLE = 9;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link easyflow.data.impl.DataFormatImpl <em>Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.data.impl.DataFormatImpl
	 * @see easyflow.data.impl.DataPackageImpl#getDataFormat()
	 * @generated
	 */
	int DATA_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT_FEATURE_COUNT = 2;


	/**
	 * The operation id for the '<em>Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT___MATCH__DATAFORMAT = 0;

	/**
	 * The operation id for the '<em>Render As File Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT___RENDER_AS_FILE_EXTENSION = 1;

	/**
	 * The number of operations of the '<em>Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.data.impl.DataMatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.data.impl.DataMatchImpl
	 * @see easyflow.data.impl.DataPackageImpl#getDataMatch()
	 * @generated
	 */
	int DATA_MATCH = 4;

	/**
	 * The feature id for the '<em><b>Parent Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MATCH__PARENT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Child Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MATCH__CHILD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MATCH__SCORE = 2;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MATCH_FEATURE_COUNT = 3;


	/**
	 * The operation id for the '<em>Compute Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MATCH___COMPUTE_SCORE__EMAP = 0;

	/**
	 * The operation id for the '<em>Is Pipable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MATCH___IS_PIPABLE = 1;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MATCH_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link easyflow.data.DataPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see easyflow.data.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.data.DataPort#getGroupingCriteria <em>Grouping Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouping Criteria</em>'.
	 * @see easyflow.data.DataPort#getGroupingCriteria()
	 * @see #getDataPort()
	 * @generated
	 */
	EReference getDataPort_GroupingCriteria();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataPort#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see easyflow.data.DataPort#getCardinality()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_Cardinality();

	/**
	 * Returns the meta object for the map '{@link easyflow.data.DataPort#getDataFormats <em>Data Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Data Formats</em>'.
	 * @see easyflow.data.DataPort#getDataFormats()
	 * @see #getDataPort()
	 * @generated
	 */
	EReference getDataPort_DataFormats();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataPort#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see easyflow.data.DataPort#isOptional()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_Optional();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataPort#getBitPos <em>Bit Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Pos</em>'.
	 * @see easyflow.data.DataPort#getBitPos()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_BitPos();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.data.DataPort#getName()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_Name();

	/**
	 * Returns the meta object for the map '{@link easyflow.data.DataPort#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Tools</em>'.
	 * @see easyflow.data.DataPort#getTools()
	 * @see #getDataPort()
	 * @generated
	 */
	EReference getDataPort_Tools();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataPort#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see easyflow.data.DataPort#isStatic()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_Static();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataPort#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see easyflow.data.DataPort#getParameterName()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_ParameterName();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#isCompatible(easyflow.data.DataPort) <em>Is Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible</em>' operation.
	 * @see easyflow.data.DataPort#isCompatible(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getDataPort__IsCompatible__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#removeDataPortFrom(org.eclipse.emf.common.util.EList) <em>Remove Data Port From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Data Port From</em>' operation.
	 * @see easyflow.data.DataPort#removeDataPortFrom(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataPort__RemoveDataPortFrom__EList();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#getFormat() <em>Get Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Format</em>' operation.
	 * @see easyflow.data.DataPort#getFormat()
	 * @generated
	 */
	EOperation getDataPort__GetFormat();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#matches(easyflow.data.DataFormat) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches</em>' operation.
	 * @see easyflow.data.DataPort#matches(easyflow.data.DataFormat)
	 * @generated
	 */
	EOperation getDataPort__Matches__DataFormat();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#isCompatibleStr(org.eclipse.emf.common.util.EList, boolean) <em>Is Compatible Str</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible Str</em>' operation.
	 * @see easyflow.data.DataPort#isCompatibleStr(org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getDataPort__IsCompatibleStr__EList_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#isCompatibleStr(org.eclipse.emf.common.util.EList) <em>Is Compatible Str</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible Str</em>' operation.
	 * @see easyflow.data.DataPort#isCompatibleStr(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataPort__IsCompatibleStr__EList();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#isCompatible(org.eclipse.emf.common.util.EList, boolean) <em>Is Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible</em>' operation.
	 * @see easyflow.data.DataPort#isCompatible(org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getDataPort__IsCompatible__EList_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#isCompatible(org.eclipse.emf.common.util.EList) <em>Is Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible</em>' operation.
	 * @see easyflow.data.DataPort#isCompatible(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataPort__IsCompatible__EList();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#isCompatible(java.lang.String) <em>Is Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible</em>' operation.
	 * @see easyflow.data.DataPort#isCompatible(java.lang.String)
	 * @generated
	 */
	EOperation getDataPort__IsCompatible__String();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#isCompatible(easyflow.data.DataFormat) <em>Is Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible</em>' operation.
	 * @see easyflow.data.DataPort#isCompatible(easyflow.data.DataFormat)
	 * @generated
	 */
	EOperation getDataPort__IsCompatible__DataFormat();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#setFormat(java.lang.String) <em>Set Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Format</em>' operation.
	 * @see easyflow.data.DataPort#setFormat(java.lang.String)
	 * @generated
	 */
	EOperation getDataPort__SetFormat__String();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataPort#setFormats(org.eclipse.emf.common.util.EList) <em>Set Formats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Formats</em>' operation.
	 * @see easyflow.data.DataPort#setFormats(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataPort__SetFormats__EList();

	/**
	 * Returns the meta object for class '{@link easyflow.data.DataLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see easyflow.data.DataLink
	 * @generated
	 */
	EClass getDataLink();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.DataLink#getDataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Port</em>'.
	 * @see easyflow.data.DataLink#getDataPort()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_DataPort();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.DataLink#getInDataPort <em>In Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Data Port</em>'.
	 * @see easyflow.data.DataLink#getInDataPort()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_InDataPort();

	/**
	 * Returns the meta object for the map '{@link easyflow.data.DataLink#getChunks <em>Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Chunks</em>'.
	 * @see easyflow.data.DataLink#getChunks()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_Chunks();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see easyflow.data.DataLink#getId()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_Id();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#getGroupingStr <em>Grouping Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping Str</em>'.
	 * @see easyflow.data.DataLink#getGroupingStr()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_GroupingStr();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#getParentGroupingStr <em>Parent Grouping Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Grouping Str</em>'.
	 * @see easyflow.data.DataLink#getParentGroupingStr()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_ParentGroupingStr();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#isIdenticalGrouping <em>Identical Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identical Grouping</em>'.
	 * @see easyflow.data.DataLink#isIdenticalGrouping()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_IdenticalGrouping();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.DataLink#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see easyflow.data.DataLink#getCondition()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_Condition();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.data.DataLink#getIntermediateTasks <em>Intermediate Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intermediate Tasks</em>'.
	 * @see easyflow.data.DataLink#getIntermediateTasks()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_IntermediateTasks();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.DataLink#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see easyflow.data.DataLink#getData()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_Data();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.DataLink#getInData <em>In Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Data</em>'.
	 * @see easyflow.data.DataLink#getInData()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_InData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#isTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal</em>'.
	 * @see easyflow.data.DataLink#isTerminal()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_Terminal();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#isProcessed <em>Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processed</em>'.
	 * @see easyflow.data.DataLink#isProcessed()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_Processed();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#getDataResourceName <em>Data Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Resource Name</em>'.
	 * @see easyflow.data.DataLink#getDataResourceName()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_DataResourceName();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#getPipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pipe</em>'.
	 * @see easyflow.data.DataLink#getPipe()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_Pipe();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataLink#isUnconditional() <em>Is Unconditional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Unconditional</em>' operation.
	 * @see easyflow.data.DataLink#isUnconditional()
	 * @generated
	 */
	EOperation getDataLink__IsUnconditional();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataLink#getUniqueString(java.lang.String, java.lang.String, java.lang.String) <em>Get Unique String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique String</em>' operation.
	 * @see easyflow.data.DataLink#getUniqueString(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataLink__GetUniqueString__String_String_String();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataLink#getUniqueString() <em>Get Unique String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique String</em>' operation.
	 * @see easyflow.data.DataLink#getUniqueString()
	 * @generated
	 */
	EOperation getDataLink__GetUniqueString();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataLink#getUniqueString(boolean) <em>Get Unique String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique String</em>' operation.
	 * @see easyflow.data.DataLink#getUniqueString(boolean)
	 * @generated
	 */
	EOperation getDataLink__GetUniqueString__boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataLink#getFormat() <em>Get Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Format</em>' operation.
	 * @see easyflow.data.DataLink#getFormat()
	 * @generated
	 */
	EOperation getDataLink__GetFormat();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataLink#isPipeable() <em>Is Pipeable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Pipeable</em>' operation.
	 * @see easyflow.data.DataLink#isPipeable()
	 * @generated
	 */
	EOperation getDataLink__IsPipeable();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataLink#getMatchingDataFor(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Get Matching Data For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Matching Data For</em>' operation.
	 * @see easyflow.data.DataLink#getMatchingDataFor(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getDataLink__GetMatchingDataFor__EList_EList_boolean();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#getParamStr <em>Param Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Str</em>'.
	 * @see easyflow.data.DataLink#getParamStr()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_ParamStr();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataLink#getParamNameStr <em>Param Name Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Name Str</em>'.
	 * @see easyflow.data.DataLink#getParamNameStr()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_ParamNameStr();

	/**
	 * Returns the meta object for the map '{@link easyflow.data.DataLink#getParamChunks <em>Param Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Param Chunks</em>'.
	 * @see easyflow.data.DataLink#getParamChunks()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_ParamChunks();

	/**
	 * Returns the meta object for class '{@link easyflow.data.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see easyflow.data.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.Data#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see easyflow.data.Data#getLabel()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Label();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.Data#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see easyflow.data.Data#getPort()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Port();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.Data#isOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see easyflow.data.Data#isOutput()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Output();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.data.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.Data#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see easyflow.data.Data#getDescription()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Description();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.Data#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see easyflow.data.Data#getParameter()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Parameter();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.Data#getResolvedParam <em>Resolved Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Param</em>'.
	 * @see easyflow.data.Data#getResolvedParam()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_ResolvedParam();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.Data#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see easyflow.data.Data#getHandle()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Handle();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#getFormat() <em>Get Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Format</em>' operation.
	 * @see easyflow.data.Data#getFormat()
	 * @generated
	 */
	EOperation getData__GetFormat();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#getFormatStr() <em>Get Format Str</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Format Str</em>' operation.
	 * @see easyflow.data.Data#getFormatStr()
	 * @generated
	 */
	EOperation getData__GetFormatStr();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#isAllowed() <em>Is Allowed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Allowed</em>' operation.
	 * @see easyflow.data.Data#isAllowed()
	 * @generated
	 */
	EOperation getData__IsAllowed();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#getSupportedHandles() <em>Get Supported Handles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Supported Handles</em>' operation.
	 * @see easyflow.data.Data#getSupportedHandles()
	 * @generated
	 */
	EOperation getData__GetSupportedHandles();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#match(easyflow.data.Data) <em>Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Match</em>' operation.
	 * @see easyflow.data.Data#match(easyflow.data.Data)
	 * @generated
	 */
	EOperation getData__Match__Data();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#matchFormat(easyflow.data.DataFormat) <em>Match Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Match Format</em>' operation.
	 * @see easyflow.data.Data#matchFormat(easyflow.data.DataFormat)
	 * @generated
	 */
	EOperation getData__MatchFormat__DataFormat();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#resolveHandle(easyflow.data.Data) <em>Resolve Handle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Handle</em>' operation.
	 * @see easyflow.data.Data#resolveHandle(easyflow.data.Data)
	 * @generated
	 */
	EOperation getData__ResolveHandle__Data();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#resolveHandle(java.lang.String) <em>Resolve Handle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Handle</em>' operation.
	 * @see easyflow.data.Data#resolveHandle(java.lang.String)
	 * @generated
	 */
	EOperation getData__ResolveHandle__String();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#resolveSupportedHandles() <em>Resolve Supported Handles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Supported Handles</em>' operation.
	 * @see easyflow.data.Data#resolveSupportedHandles()
	 * @generated
	 */
	EOperation getData__ResolveSupportedHandles();

	/**
	 * Returns the meta object for the '{@link easyflow.data.Data#isPipable() <em>Is Pipable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Pipable</em>' operation.
	 * @see easyflow.data.Data#isPipable()
	 * @generated
	 */
	EOperation getData__IsPipable();

	/**
	 * Returns the meta object for class '{@link easyflow.data.DataFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format</em>'.
	 * @see easyflow.data.DataFormat
	 * @generated
	 */
	EClass getDataFormat();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataFormat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.data.DataFormat#getName()
	 * @see #getDataFormat()
	 * @generated
	 */
	EAttribute getDataFormat_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataFormat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see easyflow.data.DataFormat#getDescription()
	 * @see #getDataFormat()
	 * @generated
	 */
	EAttribute getDataFormat_Description();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataFormat#match(easyflow.data.DataFormat) <em>Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Match</em>' operation.
	 * @see easyflow.data.DataFormat#match(easyflow.data.DataFormat)
	 * @generated
	 */
	EOperation getDataFormat__Match__DataFormat();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataFormat#renderAsFileExtension() <em>Render As File Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render As File Extension</em>' operation.
	 * @see easyflow.data.DataFormat#renderAsFileExtension()
	 * @generated
	 */
	EOperation getDataFormat__RenderAsFileExtension();

	/**
	 * Returns the meta object for class '{@link easyflow.data.DataMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see easyflow.data.DataMatch
	 * @generated
	 */
	EClass getDataMatch();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.DataMatch#getParentData <em>Parent Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Data</em>'.
	 * @see easyflow.data.DataMatch#getParentData()
	 * @see #getDataMatch()
	 * @generated
	 */
	EReference getDataMatch_ParentData();

	/**
	 * Returns the meta object for the reference '{@link easyflow.data.DataMatch#getChildData <em>Child Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Data</em>'.
	 * @see easyflow.data.DataMatch#getChildData()
	 * @see #getDataMatch()
	 * @generated
	 */
	EReference getDataMatch_ChildData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.data.DataMatch#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see easyflow.data.DataMatch#getScore()
	 * @see #getDataMatch()
	 * @generated
	 */
	EAttribute getDataMatch_Score();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataMatch#computeScore(org.eclipse.emf.common.util.EMap) <em>Compute Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Score</em>' operation.
	 * @see easyflow.data.DataMatch#computeScore(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getDataMatch__ComputeScore__EMap();

	/**
	 * Returns the meta object for the '{@link easyflow.data.DataMatch#isPipable() <em>Is Pipable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Pipable</em>' operation.
	 * @see easyflow.data.DataMatch#isPipable()
	 * @generated
	 */
	EOperation getDataMatch__IsPipable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link easyflow.data.impl.DataPortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.data.impl.DataPortImpl
		 * @see easyflow.data.impl.DataPackageImpl#getDataPort()
		 * @generated
		 */
		EClass DATA_PORT = eINSTANCE.getDataPort();

		/**
		 * The meta object literal for the '<em><b>Grouping Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PORT__GROUPING_CRITERIA = eINSTANCE.getDataPort_GroupingCriteria();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__CARDINALITY = eINSTANCE.getDataPort_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Data Formats</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PORT__DATA_FORMATS = eINSTANCE.getDataPort_DataFormats();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__OPTIONAL = eINSTANCE.getDataPort_Optional();

		/**
		 * The meta object literal for the '<em><b>Bit Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__BIT_POS = eINSTANCE.getDataPort_BitPos();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__NAME = eINSTANCE.getDataPort_Name();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PORT__TOOLS = eINSTANCE.getDataPort_Tools();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__STATIC = eINSTANCE.getDataPort_Static();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__PARAMETER_NAME = eINSTANCE.getDataPort_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Is Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___IS_COMPATIBLE__DATAPORT = eINSTANCE.getDataPort__IsCompatible__DataPort();

		/**
		 * The meta object literal for the '<em><b>Remove Data Port From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___REMOVE_DATA_PORT_FROM__ELIST = eINSTANCE.getDataPort__RemoveDataPortFrom__EList();

		/**
		 * The meta object literal for the '<em><b>Get Format</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___GET_FORMAT = eINSTANCE.getDataPort__GetFormat();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___MATCHES__DATAFORMAT = eINSTANCE.getDataPort__Matches__DataFormat();

		/**
		 * The meta object literal for the '<em><b>Is Compatible Str</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___IS_COMPATIBLE_STR__ELIST_BOOLEAN = eINSTANCE.getDataPort__IsCompatibleStr__EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Is Compatible Str</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___IS_COMPATIBLE_STR__ELIST = eINSTANCE.getDataPort__IsCompatibleStr__EList();

		/**
		 * The meta object literal for the '<em><b>Is Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___IS_COMPATIBLE__ELIST_BOOLEAN = eINSTANCE.getDataPort__IsCompatible__EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Is Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___IS_COMPATIBLE__ELIST = eINSTANCE.getDataPort__IsCompatible__EList();

		/**
		 * The meta object literal for the '<em><b>Is Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___IS_COMPATIBLE__STRING = eINSTANCE.getDataPort__IsCompatible__String();

		/**
		 * The meta object literal for the '<em><b>Is Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___IS_COMPATIBLE__DATAFORMAT = eINSTANCE.getDataPort__IsCompatible__DataFormat();

		/**
		 * The meta object literal for the '<em><b>Set Format</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___SET_FORMAT__STRING = eINSTANCE.getDataPort__SetFormat__String();

		/**
		 * The meta object literal for the '<em><b>Set Formats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PORT___SET_FORMATS__ELIST = eINSTANCE.getDataPort__SetFormats__EList();

		/**
		 * The meta object literal for the '{@link easyflow.data.impl.DataLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.data.impl.DataLinkImpl
		 * @see easyflow.data.impl.DataPackageImpl#getDataLink()
		 * @generated
		 */
		EClass DATA_LINK = eINSTANCE.getDataLink();

		/**
		 * The meta object literal for the '<em><b>Data Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__DATA_PORT = eINSTANCE.getDataLink_DataPort();

		/**
		 * The meta object literal for the '<em><b>In Data Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__IN_DATA_PORT = eINSTANCE.getDataLink_InDataPort();

		/**
		 * The meta object literal for the '<em><b>Chunks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__CHUNKS = eINSTANCE.getDataLink_Chunks();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__ID = eINSTANCE.getDataLink_Id();

		/**
		 * The meta object literal for the '<em><b>Grouping Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__GROUPING_STR = eINSTANCE.getDataLink_GroupingStr();

		/**
		 * The meta object literal for the '<em><b>Parent Grouping Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__PARENT_GROUPING_STR = eINSTANCE.getDataLink_ParentGroupingStr();

		/**
		 * The meta object literal for the '<em><b>Identical Grouping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__IDENTICAL_GROUPING = eINSTANCE.getDataLink_IdenticalGrouping();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__CONDITION = eINSTANCE.getDataLink_Condition();

		/**
		 * The meta object literal for the '<em><b>Intermediate Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__INTERMEDIATE_TASKS = eINSTANCE.getDataLink_IntermediateTasks();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__DATA = eINSTANCE.getDataLink_Data();

		/**
		 * The meta object literal for the '<em><b>In Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__IN_DATA = eINSTANCE.getDataLink_InData();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__TERMINAL = eINSTANCE.getDataLink_Terminal();

		/**
		 * The meta object literal for the '<em><b>Processed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__PROCESSED = eINSTANCE.getDataLink_Processed();

		/**
		 * The meta object literal for the '<em><b>Data Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__DATA_RESOURCE_NAME = eINSTANCE.getDataLink_DataResourceName();

		/**
		 * The meta object literal for the '<em><b>Pipe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__PIPE = eINSTANCE.getDataLink_Pipe();

		/**
		 * The meta object literal for the '<em><b>Is Unconditional</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_LINK___IS_UNCONDITIONAL = eINSTANCE.getDataLink__IsUnconditional();

		/**
		 * The meta object literal for the '<em><b>Get Unique String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_LINK___GET_UNIQUE_STRING__STRING_STRING_STRING = eINSTANCE.getDataLink__GetUniqueString__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Unique String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_LINK___GET_UNIQUE_STRING = eINSTANCE.getDataLink__GetUniqueString();

		/**
		 * The meta object literal for the '<em><b>Get Unique String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_LINK___GET_UNIQUE_STRING__BOOLEAN = eINSTANCE.getDataLink__GetUniqueString__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Format</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_LINK___GET_FORMAT = eINSTANCE.getDataLink__GetFormat();

		/**
		 * The meta object literal for the '<em><b>Is Pipeable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_LINK___IS_PIPEABLE = eINSTANCE.getDataLink__IsPipeable();

		/**
		 * The meta object literal for the '<em><b>Get Matching Data For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_LINK___GET_MATCHING_DATA_FOR__ELIST_ELIST_BOOLEAN = eINSTANCE.getDataLink__GetMatchingDataFor__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Param Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__PARAM_STR = eINSTANCE.getDataLink_ParamStr();

		/**
		 * The meta object literal for the '<em><b>Param Name Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__PARAM_NAME_STR = eINSTANCE.getDataLink_ParamNameStr();

		/**
		 * The meta object literal for the '<em><b>Param Chunks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__PARAM_CHUNKS = eINSTANCE.getDataLink_ParamChunks();

		/**
		 * The meta object literal for the '{@link easyflow.data.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.data.impl.DataImpl
		 * @see easyflow.data.impl.DataPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__LABEL = eINSTANCE.getData_Label();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__PORT = eINSTANCE.getData_Port();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__OUTPUT = eINSTANCE.getData_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DESCRIPTION = eINSTANCE.getData_Description();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__PARAMETER = eINSTANCE.getData_Parameter();

		/**
		 * The meta object literal for the '<em><b>Resolved Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__RESOLVED_PARAM = eINSTANCE.getData_ResolvedParam();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__HANDLE = eINSTANCE.getData_Handle();

		/**
		 * The meta object literal for the '<em><b>Get Format</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___GET_FORMAT = eINSTANCE.getData__GetFormat();

		/**
		 * The meta object literal for the '<em><b>Get Format Str</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___GET_FORMAT_STR = eINSTANCE.getData__GetFormatStr();

		/**
		 * The meta object literal for the '<em><b>Is Allowed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___IS_ALLOWED = eINSTANCE.getData__IsAllowed();

		/**
		 * The meta object literal for the '<em><b>Get Supported Handles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___GET_SUPPORTED_HANDLES = eINSTANCE.getData__GetSupportedHandles();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___MATCH__DATA = eINSTANCE.getData__Match__Data();

		/**
		 * The meta object literal for the '<em><b>Match Format</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___MATCH_FORMAT__DATAFORMAT = eINSTANCE.getData__MatchFormat__DataFormat();

		/**
		 * The meta object literal for the '<em><b>Resolve Handle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___RESOLVE_HANDLE__DATA = eINSTANCE.getData__ResolveHandle__Data();

		/**
		 * The meta object literal for the '<em><b>Resolve Handle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___RESOLVE_HANDLE__STRING = eINSTANCE.getData__ResolveHandle__String();

		/**
		 * The meta object literal for the '<em><b>Resolve Supported Handles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___RESOLVE_SUPPORTED_HANDLES = eINSTANCE.getData__ResolveSupportedHandles();

		/**
		 * The meta object literal for the '<em><b>Is Pipable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___IS_PIPABLE = eINSTANCE.getData__IsPipable();

		/**
		 * The meta object literal for the '{@link easyflow.data.impl.DataFormatImpl <em>Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.data.impl.DataFormatImpl
		 * @see easyflow.data.impl.DataPackageImpl#getDataFormat()
		 * @generated
		 */
		EClass DATA_FORMAT = eINSTANCE.getDataFormat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORMAT__NAME = eINSTANCE.getDataFormat_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORMAT__DESCRIPTION = eINSTANCE.getDataFormat_Description();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORMAT___MATCH__DATAFORMAT = eINSTANCE.getDataFormat__Match__DataFormat();

		/**
		 * The meta object literal for the '<em><b>Render As File Extension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORMAT___RENDER_AS_FILE_EXTENSION = eINSTANCE.getDataFormat__RenderAsFileExtension();

		/**
		 * The meta object literal for the '{@link easyflow.data.impl.DataMatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.data.impl.DataMatchImpl
		 * @see easyflow.data.impl.DataPackageImpl#getDataMatch()
		 * @generated
		 */
		EClass DATA_MATCH = eINSTANCE.getDataMatch();

		/**
		 * The meta object literal for the '<em><b>Parent Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MATCH__PARENT_DATA = eINSTANCE.getDataMatch_ParentData();

		/**
		 * The meta object literal for the '<em><b>Child Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MATCH__CHILD_DATA = eINSTANCE.getDataMatch_ChildData();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MATCH__SCORE = eINSTANCE.getDataMatch_Score();

		/**
		 * The meta object literal for the '<em><b>Compute Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_MATCH___COMPUTE_SCORE__EMAP = eINSTANCE.getDataMatch__ComputeScore__EMap();

		/**
		 * The meta object literal for the '<em><b>Is Pipable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_MATCH___IS_PIPABLE = eINSTANCE.getDataMatch__IsPipable();

	}

} //DataPackage
