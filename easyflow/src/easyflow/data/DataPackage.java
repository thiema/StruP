/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.data;

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

	}

} //DataPackage
