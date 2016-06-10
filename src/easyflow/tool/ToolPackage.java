/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

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
 * <!-- begin-model-doc -->
 * Package provides classes to encapsulate tool properties.
 * <!-- end-model-doc -->
 * @see easyflow.tool.ToolFactory
 * @model kind="package"
 * @generated
 */
public interface ToolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tool";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/tool/1.0.0";

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
	ToolPackage eINSTANCE = easyflow.tool.impl.ToolPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.tool.IRule <em>IRule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.IRule
	 * @see easyflow.tool.impl.ToolPackageImpl#getIRule()
	 * @generated
	 */
	int IRULE = 0;

	/**
	 * The number of structural features of the '<em>IRule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRULE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRULE___CLEAR = 0;

	/**
	 * The number of operations of the '<em>IRule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRULE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.ToolSchemataImpl <em>Schemata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.ToolSchemataImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getToolSchemata()
	 * @generated
	 */
	int TOOL_SCHEMATA = 1;

	/**
	 * The feature id for the '<em><b>Schemata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SCHEMATA__SCHEMATA = 0;

	/**
	 * The feature id for the '<em><b>Schemata URI</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SCHEMATA__SCHEMATA_URI = 1;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SCHEMATA__LOGGER = 2;

	/**
	 * The number of structural features of the '<em>Schemata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SCHEMATA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Read Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SCHEMATA___READ_SCHEMA__URI_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Read Schemata</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SCHEMATA___READ_SCHEMATA__ELIST_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Get Default Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SCHEMATA___GET_DEFAULT_SCHEMA = 2;

	/**
	 * The operation id for the '<em>Get Schema For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SCHEMATA___GET_SCHEMA_FOR__DOCUMENT = 3;

	/**
	 * The number of operations of the '<em>Schemata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SCHEMATA_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.ToolDefinitionsImpl <em>Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.ToolDefinitionsImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getToolDefinitions()
	 * @generated
	 */
	int TOOL_DEFINITIONS = 2;

	/**
	 * The feature id for the '<em><b>Tool Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS__TOOL_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Tool Schemata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS__TOOL_SCHEMATA = 1;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS__LOGGER = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS__PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Log Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS__LOG_MESSAGE = 4;

	/**
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Validate Tool Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS___VALIDATE_TOOL_DEFINITION__URI_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Init Log Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS___INIT_LOG_MESSAGE = 1;

	/**
	 * The number of operations of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.tool.IToolElement <em>ITool Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.IToolElement
	 * @see easyflow.tool.impl.ToolPackageImpl#getIToolElement()
	 * @generated
	 */
	int ITOOL_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>ITool Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITOOL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Render To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITOOL_ELEMENT___RENDER_TO_STRING = 0;

	/**
	 * The number of operations of the '<em>ITool Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITOOL_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.DefaultToolElementImpl <em>Default Tool Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.DefaultToolElementImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getDefaultToolElement()
	 * @generated
	 */
	int DEFAULT_TOOL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TOOL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TOOL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Default Tool Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TOOL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Default Tool Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TOOL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.ToolImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = ITOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DESCRIPTION = ITOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LOGGER = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__VERSION = ITOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PACKAGE = ITOOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__REQUIREMENTS = ITOOL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Executables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__EXECUTABLES = ITOOL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Data</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DATA = ITOOL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Filename Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__FILENAME_PREFIX = ITOOL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Analysis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ANALYSIS_TYPE = ITOOL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__COMMAND = ITOOL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Resolved Params</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__RESOLVED_PARAMS = ITOOL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ROOT = ITOOL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Resolve Uri Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__RESOLVE_URI_MAP = ITOOL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Log Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LOG_MESSAGE = ITOOL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Render To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___RENDER_TO_STRING = ITOOL_ELEMENT___RENDER_TO_STRING;

	/**
	 * The operation id for the '<em>Write Model To XML</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___WRITE_MODEL_TO_XML = ITOOL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Filter Instances For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___CAN_FILTER_INSTANCES_FOR__DATAPORT = ITOOL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Requires Grouping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___REQUIRES_GROUPING__STRING_DATAPORT = ITOOL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Provides Grouping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___PROVIDES_GROUPING__STRING_DATAPORT = ITOOL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Groupings For Input Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_GROUPINGS_FOR_INPUT_PORT__DATAPORT_BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Groupings For Output Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_GROUPINGS_FOR_OUTPUT_PORT__DATAPORT_BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Analysis Type Of Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_ANALYSIS_TYPE_OF_PACKAGE__ELIST = ITOOL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_TEMPLATE_PARAMETER__PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_TEMPLATE_PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Matching Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_MATCHING_PARAMETER__ELIST_PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Matching Parameter By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_MATCHING_PARAMETER_BY_NAME__ELIST_PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Assume Data Param Positional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___ASSUME_DATA_PARAM_POSITIONAL = ITOOL_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Omit Prefix If No Arg Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___OMIT_PREFIX_IF_NO_ARG_KEY = ITOOL_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Cmd Part Delimiter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_CMD_PART_DELIMITER = ITOOL_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Interpreter Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_INTERPRETER_PARAMS = ITOOL_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Exe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_EXE = ITOOL_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Module Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_MODULE_PARAMS = ITOOL_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Interpreter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_INTERPRETER = ITOOL_ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Can Provide Multiple Inputs For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___CAN_PROVIDE_MULTIPLE_INPUTS_FOR__DATAPORT = ITOOL_ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Can Provide Multiple Instances For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___CAN_PROVIDE_MULTIPLE_INSTANCES_FOR__DATAPORT = ITOOL_ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can Provide Multiple Instances Per Dataport For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___CAN_PROVIDE_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__DATAPORT = ITOOL_ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Can Process Multiple Inputs For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___CAN_PROCESS_MULTIPLE_INPUTS_FOR__DATAPORT = ITOOL_ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Can Process Multiple Instances Per Dataport For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___CAN_PROCESS_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__DATAPORT = ITOOL_ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Can Process Multiple Instances For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___CAN_PROCESS_MULTIPLE_INSTANCES_FOR__DATAPORT = ITOOL_ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Resolve Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___RESOLVE_PATH = ITOOL_ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Assume Param Positional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___ASSUME_PARAM_POSITIONAL = ITOOL_ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Create Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___CREATE_DATA__INOUTPARAMETER_EMAP_EMAP = ITOOL_ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Create Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___CREATE_DATA__RESOLVEDPARAM_EMAP_EMAP = ITOOL_ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Init Log Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___INIT_LOG_MESSAGE = ITOOL_ELEMENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Allowed Conversion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___IS_ALLOWED_CONVERSION__DATAPORT_STRING_STRING = ITOOL_ELEMENT_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = ITOOL_ELEMENT_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.CommandImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 15;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.ResolvedParamImpl <em>Resolved Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.ResolvedParamImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getResolvedParam()
	 * @generated
	 */
	int RESOLVED_PARAM = 8;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.ParameterImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ITOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = ITOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOGGER = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Option Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTION_VALUES = ITOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTIONAL = ITOOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MULTIPLE = ITOOL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multiple Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MULTIPLE_VALUE = ITOOL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE_TYPE = ITOOL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = ITOOL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PREFIX = ITOOL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Option Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTION_KEY = ITOOL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DELIMITER = ITOOL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Value Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE_DELIMITER = ITOOL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEYS = ITOOL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Named</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAMED = ITOOL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LABEL = ITOOL_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__HELP = ITOOL_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Min Occ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MIN_OCC = ITOOL_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Max Occ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAX_OCC = ITOOL_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Advanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ADVANCED = ITOOL_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__POSITIONAL = ITOOL_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GROUPING = ITOOL_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Data Deprecated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA_DEPRECATED = ITOOL_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Fixed Arg Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FIXED_ARG_VALUE = ITOOL_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARENT = ITOOL_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Handles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__HANDLES = ITOOL_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>General Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GENERAL_VALUE = ITOOL_ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Data Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA_PARAM = ITOOL_ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Cmd Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CMD_PART = ITOOL_ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MULTIPLE_INSTANCES = ITOOL_ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Multiple Instances Per Dataport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MULTIPLE_INSTANCES_PER_DATAPORT = ITOOL_ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Output Arg Value For Boolean Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OUTPUT_ARG_VALUE_FOR_BOOLEAN_PARAM = ITOOL_ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__HIDDEN = ITOOL_ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Output Default Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OUTPUT_DEFAULT_PARAM = ITOOL_ELEMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONDITION_TYPE = ITOOL_ELEMENT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Override Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OVERRIDE_ATTRIBUTES = ITOOL_ELEMENT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ABSTRACT = ITOOL_ELEMENT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Tool Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TOOL_REFS = ITOOL_ELEMENT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Prefer Pkg Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PREFER_PKG_PARAM = ITOOL_ELEMENT_FEATURE_COUNT + 39;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 40;

	/**
	 * The operation id for the '<em>Render To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___RENDER_TO_STRING = ITOOL_ELEMENT___RENDER_TO_STRING;

	/**
	 * The operation id for the '<em>Get Arg Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_ARG_KEY__STRING_KEY = ITOOL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Arg Delimiter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_ARG_DELIMITER__STRING = ITOOL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Arg Value Delimiter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_ARG_VALUE_DELIMITER__STRING = ITOOL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_PREFIX__STRING = ITOOL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Parameter For Analysis Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_PARAMETER_FOR_ANALYSIS_TYPE__ELIST = ITOOL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Analysis Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_ANALYSIS_TYPE = ITOOL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Supported Handles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_SUPPORTED_HANDLES__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Effective Parent Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_EFFECTIVE_PARENT_PARAMETER__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Merged Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_MERGED_PARAMETER__PARAMETER_BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___MATCHES__PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___MATCHES__INOUTPARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Generate Command String URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_COMMAND_STRING_URI__EMAP_ELIST_PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Generate Command String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_COMMAND_STRING__EMAP_ELIST_PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Generate Command String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_COMMAND_STRING__EMAP_OBJECT_PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Generate Command String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_COMMAND_STRING__EMAP_OPTIONVALUE_PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Generate Command String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_COMMAND_STRING__EMAP_URI_PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_OPTIONAL__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Multiple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_MULTIPLE__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Is Multiple Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_MULTIPLE_INSTANCES__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Multiple Instances Per Dataport</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_MULTIPLE_INSTANCES_PER_DATAPORT__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_NAMED__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Positional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_POSITIONAL__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Fixed Arg Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_FIXED_ARG_VALUE__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Multiple Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_MULTIPLE_VALUE__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Should Output Arg Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___SHOULD_OUTPUT_ARG_VALUE__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Merge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___MERGE__PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Unique String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_UNIQUE_STRING = ITOOL_ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Resolve Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___RESOLVE_NAME = ITOOL_ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Should Output Default Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___SHOULD_OUTPUT_DEFAULT_PARAM__BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Meta Data Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_META_DATA_PARAM = ITOOL_ELEMENT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Data Specifying Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_DATA_SPECIFYING_PARAM = ITOOL_ELEMENT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Preferred</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_PREFERRED = ITOOL_ELEMENT_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ITOOL_ELEMENT_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.InOutParameterImpl <em>In Out Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.InOutParameterImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getInOutParameter()
	 * @generated
	 */
	int IN_OUT_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__LOGGER = PARAMETER__LOGGER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Option Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__OPTION_VALUES = PARAMETER__OPTION_VALUES;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__OPTIONAL = PARAMETER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__MULTIPLE = PARAMETER__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Multiple Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__MULTIPLE_VALUE = PARAMETER__MULTIPLE_VALUE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__VALUE_TYPE = PARAMETER__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__DEFAULT_VALUE = PARAMETER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__PREFIX = PARAMETER__PREFIX;

	/**
	 * The feature id for the '<em><b>Option Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__OPTION_KEY = PARAMETER__OPTION_KEY;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__DELIMITER = PARAMETER__DELIMITER;

	/**
	 * The feature id for the '<em><b>Value Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__VALUE_DELIMITER = PARAMETER__VALUE_DELIMITER;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__KEYS = PARAMETER__KEYS;

	/**
	 * The feature id for the '<em><b>Named</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__NAMED = PARAMETER__NAMED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__LABEL = PARAMETER__LABEL;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__HELP = PARAMETER__HELP;

	/**
	 * The feature id for the '<em><b>Min Occ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__MIN_OCC = PARAMETER__MIN_OCC;

	/**
	 * The feature id for the '<em><b>Max Occ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__MAX_OCC = PARAMETER__MAX_OCC;

	/**
	 * The feature id for the '<em><b>Advanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__ADVANCED = PARAMETER__ADVANCED;

	/**
	 * The feature id for the '<em><b>Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__POSITIONAL = PARAMETER__POSITIONAL;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__GROUPING = PARAMETER__GROUPING;

	/**
	 * The feature id for the '<em><b>Data Deprecated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__DATA_DEPRECATED = PARAMETER__DATA_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Fixed Arg Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__FIXED_ARG_VALUE = PARAMETER__FIXED_ARG_VALUE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__PARENT = PARAMETER__PARENT;

	/**
	 * The feature id for the '<em><b>Handles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__HANDLES = PARAMETER__HANDLES;

	/**
	 * The feature id for the '<em><b>General Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__GENERAL_VALUE = PARAMETER__GENERAL_VALUE;

	/**
	 * The feature id for the '<em><b>Data Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__DATA_PARAM = PARAMETER__DATA_PARAM;

	/**
	 * The feature id for the '<em><b>Cmd Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__CMD_PART = PARAMETER__CMD_PART;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__MULTIPLE_INSTANCES = PARAMETER__MULTIPLE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Multiple Instances Per Dataport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__MULTIPLE_INSTANCES_PER_DATAPORT = PARAMETER__MULTIPLE_INSTANCES_PER_DATAPORT;

	/**
	 * The feature id for the '<em><b>Output Arg Value For Boolean Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__OUTPUT_ARG_VALUE_FOR_BOOLEAN_PARAM = PARAMETER__OUTPUT_ARG_VALUE_FOR_BOOLEAN_PARAM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__HIDDEN = PARAMETER__HIDDEN;

	/**
	 * The feature id for the '<em><b>Output Default Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__OUTPUT_DEFAULT_PARAM = PARAMETER__OUTPUT_DEFAULT_PARAM;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__CONDITION_TYPE = PARAMETER__CONDITION_TYPE;

	/**
	 * The feature id for the '<em><b>Override Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__OVERRIDE_ATTRIBUTES = PARAMETER__OVERRIDE_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__ABSTRACT = PARAMETER__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Tool Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__TOOL_REFS = PARAMETER__TOOL_REFS;

	/**
	 * The feature id for the '<em><b>Prefer Pkg Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__PREFER_PKG_PARAM = PARAMETER__PREFER_PKG_PARAM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__OUTPUT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__EXTENSION = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filename Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__FILENAME_CREATION = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__FORMATS = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__DATA_PORT = PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Convert Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__CONVERT_GROUPING = PARAMETER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>In Out Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Render To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___RENDER_TO_STRING = PARAMETER___RENDER_TO_STRING;

	/**
	 * The operation id for the '<em>Get Arg Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_ARG_KEY__STRING_KEY = PARAMETER___GET_ARG_KEY__STRING_KEY;

	/**
	 * The operation id for the '<em>Get Arg Delimiter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_ARG_DELIMITER__STRING = PARAMETER___GET_ARG_DELIMITER__STRING;

	/**
	 * The operation id for the '<em>Get Arg Value Delimiter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_ARG_VALUE_DELIMITER__STRING = PARAMETER___GET_ARG_VALUE_DELIMITER__STRING;

	/**
	 * The operation id for the '<em>Get Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_PREFIX__STRING = PARAMETER___GET_PREFIX__STRING;

	/**
	 * The operation id for the '<em>Get Parameter For Analysis Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_PARAMETER_FOR_ANALYSIS_TYPE__ELIST = PARAMETER___GET_PARAMETER_FOR_ANALYSIS_TYPE__ELIST;

	/**
	 * The operation id for the '<em>Is Analysis Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_ANALYSIS_TYPE = PARAMETER___IS_ANALYSIS_TYPE;

	/**
	 * The operation id for the '<em>Get Supported Handles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_SUPPORTED_HANDLES__BOOLEAN = PARAMETER___GET_SUPPORTED_HANDLES__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Effective Parent Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_EFFECTIVE_PARENT_PARAMETER__BOOLEAN = PARAMETER___GET_EFFECTIVE_PARENT_PARAMETER__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Merged Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_MERGED_PARAMETER__PARAMETER_BOOLEAN = PARAMETER___GET_MERGED_PARAMETER__PARAMETER_BOOLEAN;

	/**
	 * The operation id for the '<em>Generate Command String URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GENERATE_COMMAND_STRING_URI__EMAP_ELIST_PARAMETER = PARAMETER___GENERATE_COMMAND_STRING_URI__EMAP_ELIST_PARAMETER;

	/**
	 * The operation id for the '<em>Generate Command String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GENERATE_COMMAND_STRING__EMAP_ELIST_PARAMETER = PARAMETER___GENERATE_COMMAND_STRING__EMAP_ELIST_PARAMETER;

	/**
	 * The operation id for the '<em>Generate Command String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GENERATE_COMMAND_STRING__EMAP_OBJECT_PARAMETER = PARAMETER___GENERATE_COMMAND_STRING__EMAP_OBJECT_PARAMETER;

	/**
	 * The operation id for the '<em>Generate Command String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GENERATE_COMMAND_STRING__EMAP_OPTIONVALUE_PARAMETER = PARAMETER___GENERATE_COMMAND_STRING__EMAP_OPTIONVALUE_PARAMETER;

	/**
	 * The operation id for the '<em>Generate Command String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GENERATE_COMMAND_STRING__EMAP_URI_PARAMETER = PARAMETER___GENERATE_COMMAND_STRING__EMAP_URI_PARAMETER;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_OPTIONAL__BOOLEAN = PARAMETER___IS_OPTIONAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Multiple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_MULTIPLE__BOOLEAN = PARAMETER___IS_MULTIPLE__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Multiple Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_MULTIPLE_INSTANCES__BOOLEAN = PARAMETER___IS_MULTIPLE_INSTANCES__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Multiple Instances Per Dataport</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_MULTIPLE_INSTANCES_PER_DATAPORT__BOOLEAN = PARAMETER___IS_MULTIPLE_INSTANCES_PER_DATAPORT__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_NAMED__BOOLEAN = PARAMETER___IS_NAMED__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Positional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_POSITIONAL__BOOLEAN = PARAMETER___IS_POSITIONAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Fixed Arg Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_FIXED_ARG_VALUE__BOOLEAN = PARAMETER___IS_FIXED_ARG_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Multiple Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_MULTIPLE_VALUE__BOOLEAN = PARAMETER___IS_MULTIPLE_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Should Output Arg Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___SHOULD_OUTPUT_ARG_VALUE__BOOLEAN = PARAMETER___SHOULD_OUTPUT_ARG_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Unique String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_UNIQUE_STRING = PARAMETER___GET_UNIQUE_STRING;

	/**
	 * The operation id for the '<em>Resolve Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___RESOLVE_NAME = PARAMETER___RESOLVE_NAME;

	/**
	 * The operation id for the '<em>Should Output Default Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___SHOULD_OUTPUT_DEFAULT_PARAM__BOOLEAN = PARAMETER___SHOULD_OUTPUT_DEFAULT_PARAM__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Meta Data Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_META_DATA_PARAM = PARAMETER___IS_META_DATA_PARAM;

	/**
	 * The operation id for the '<em>Is Data Specifying Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_DATA_SPECIFYING_PARAM = PARAMETER___IS_DATA_SPECIFYING_PARAM;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_BOOLEAN = PARAMETER___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Preferred</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_PREFERRED = PARAMETER___IS_PREFERRED;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___MATCHES__INOUTPARAMETER = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___MATCHES__PARAMETER = PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Merge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___MERGE__PARAMETER = PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Omit Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___OMIT_EXTENSION = PARAMETER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Allowed Conversion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___IS_ALLOWED_CONVERSION__STRING_STRING = PARAMETER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Convert Grouping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER___GET_CONVERT_GROUPING__STRING = PARAMETER_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>In Out Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.PackageImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 14;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.KeyImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 9;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.RequirementImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 10;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.DocumentPropertiesImpl <em>Document Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.DocumentPropertiesImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getDocumentProperties()
	 * @generated
	 */
	int DOCUMENT_PROPERTIES = 11;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.OptionValueImpl <em>Option Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.OptionValueImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getOptionValue()
	 * @generated
	 */
	int OPTION_VALUE = 12;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.BaseCommandImpl <em>Base Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.BaseCommandImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getBaseCommand()
	 * @generated
	 */
	int BASE_COMMAND = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__NAME = ITOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__DESCRIPTION = ITOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__PARAMETER = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__VALUE = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__HANDLE = ITOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__DATA_FORMAT = ITOOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conditional Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__CONDITIONAL_PARAM = ITOOL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Child Params</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__CHILD_PARAMS = ITOOL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__CONDITIONS = ITOOL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__RESOLVED = ITOOL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__PIPE = ITOOL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Condition Resolving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__CONDITION_RESOLVING = ITOOL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Resolved Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Render To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___RENDER_TO_STRING = ITOOL_ELEMENT___RENDER_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Command String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___GENERATE_COMMAND_STRING__EMAP_PARAMETER = ITOOL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Arg Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___GET_ARG_VALUE = ITOOL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Resolve Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___RESOLVE_NAME = ITOOL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Effective Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___GET_EFFECTIVE_PARAMETERS__ELIST_EMAP = ITOOL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Supported Handles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___GET_SUPPORTED_HANDLES = ITOOL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Deep Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___DEEP_COPY = ITOOL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Resolve Pipe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___RESOLVE_PIPE__STRING = ITOOL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Resolve Condititional Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___RESOLVE_CONDITITIONAL_PARAM__STRING_STRING = ITOOL_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Child Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___GET_CHILD_PARAM__STRING_STRING = ITOOL_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Condition Resolving Child Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM___GET_CONDITION_RESOLVING_CHILD_PARAM__STRING_BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Resolved Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM_OPERATION_COUNT = ITOOL_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__NAME = DEFAULT_TOOL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__DESCRIPTION = DEFAULT_TOOL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__VALUE = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__DELIMITER = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__PREFIX = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__TYPE = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Resolve Arg Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___RESOLVE_ARG_KEY__STRING = DEFAULT_TOOL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Resolve Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___RESOLVE_NAME = DEFAULT_TOOL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_OPERATION_COUNT = DEFAULT_TOOL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = DEFAULT_TOOL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = DEFAULT_TOOL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERSION = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VALUE = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = DEFAULT_TOOL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTIES__SOURCE_URI = 0;

	/**
	 * The feature id for the '<em><b>From Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTIES__FROM_JAR = 1;

	/**
	 * The number of structural features of the '<em>Document Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE__NAME = DEFAULT_TOOL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE__DESCRIPTION = DEFAULT_TOOL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE__CONDITION = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE__HELP = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE__EXE = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Option Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE_FEATURE_COUNT = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Resolve Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE___RESOLVE_VALUE = DEFAULT_TOOL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Option Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE_OPERATION_COUNT = DEFAULT_TOOL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND__COMMAND_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Template Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND__TEMPLATE_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Assume Data Param Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL = 2;

	/**
	 * The feature id for the '<em><b>Assume Param Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND__ASSUME_PARAM_POSITIONAL = 3;

	/**
	 * The feature id for the '<em><b>Cmd Part Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND__CMD_PART_DELIMITER = 4;

	/**
	 * The number of structural features of the '<em>Base Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Base Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ITOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = ITOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMMAND_PATTERN = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TEMPLATE_PARAMS = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assume Data Param Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ASSUME_DATA_PARAM_POSITIONAL = ITOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assume Param Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ASSUME_PARAM_POSITIONAL = ITOOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cmd Part Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CMD_PART_DELIMITER = ITOOL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resolved Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__RESOLVED_PARAMS = ITOOL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = ITOOL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = ITOOL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resolve Uri Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__RESOLVE_URI_MAP = ITOOL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Render To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___RENDER_TO_STRING = ITOOL_ELEMENT___RENDER_TO_STRING;

	/**
	 * The operation id for the '<em>Get Interpreter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_INTERPRETER = ITOOL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Exe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_EXE = ITOOL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Interpreter Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_INTERPRETER_PARAMS = ITOOL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = ITOOL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = ITOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = ITOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMMAND_PATTERN = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TEMPLATE_PARAMS = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assume Data Param Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ASSUME_DATA_PARAM_POSITIONAL = ITOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assume Param Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ASSUME_PARAM_POSITIONAL = ITOOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cmd Part Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__CMD_PART_DELIMITER = ITOOL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__EXECUTABLE = ITOOL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__LOGGER = ITOOL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resolved Params</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__RESOLVED_PARAMS = ITOOL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 10;


	/**
	 * The operation id for the '<em>Render To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___RENDER_TO_STRING = ITOOL_ELEMENT___RENDER_TO_STRING;

	/**
	 * The operation id for the '<em>Get Positional Parameter Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___GET_POSITIONAL_PARAMETER_NAMES = ITOOL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Optional Parameter Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___GET_OPTIONAL_PARAMETER_NAMES = ITOOL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Interperter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___GET_INTERPERTER = ITOOL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Exe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___GET_EXE = ITOOL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Resolve Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___RESOLVE_PARAMETER__STRING_ELIST = ITOOL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Data Param For Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___GET_DATA_PARAM_FOR_DATA_PORT__DATAPORT_BOOLEAN = ITOOL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Data Param For Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___GET_DATA_PARAM_FOR_DATA_PORT__DATAPORT_BOOLEAN_INT = ITOOL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = ITOOL_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.RuleImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 16;

	/**
	 * The feature id for the '<em><b>Cmd Line</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CMD_LINE = IRULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TASK = IRULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DEPENDENCIES = IRULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TARGETS = IRULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Read From Pipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__READ_FROM_PIPE = IRULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Write To Pipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__WRITE_TO_PIPE = IRULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INPUT_PARAMS = IRULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OUTPUT_PARAMS = IRULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Opt Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OPT_PARAMS = IRULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pos Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__POS_PARAMS = IRULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Exe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXE = IRULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Exe Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXE_PARAMS = IRULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INTERPRETER = IRULE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Interpreter Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INTERPRETER_PARAMS = IRULE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = IRULE_FEATURE_COUNT + 14;


	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___CLEAR = IRULE___CLEAR;

	/**
	 * The operation id for the '<em>Resolve Command Line Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___RESOLVE_COMMAND_LINE_PARTS = IRULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Command Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___CREATE_COMMAND_LINE = IRULE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = IRULE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.ConditionImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;


	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link easyflow.tool.IRule <em>IRule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRule</em>'.
	 * @see easyflow.tool.IRule
	 * @generated
	 */
	EClass getIRule();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.IRule#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see easyflow.tool.IRule#clear()
	 * @generated
	 */
	EOperation getIRule__Clear();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.ToolSchemata <em>Schemata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schemata</em>'.
	 * @see easyflow.tool.ToolSchemata
	 * @generated
	 */
	EClass getToolSchemata();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.ToolSchemata#getSchemata <em>Schemata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Schemata</em>'.
	 * @see easyflow.tool.ToolSchemata#getSchemata()
	 * @see #getToolSchemata()
	 * @generated
	 */
	EReference getToolSchemata_Schemata();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.ToolSchemata#getSchemataURI <em>Schemata URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Schemata URI</em>'.
	 * @see easyflow.tool.ToolSchemata#getSchemataURI()
	 * @see #getToolSchemata()
	 * @generated
	 */
	EReference getToolSchemata_SchemataURI();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.ToolSchemata#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.tool.ToolSchemata#getLogger()
	 * @see #getToolSchemata()
	 * @generated
	 */
	EAttribute getToolSchemata_Logger();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ToolSchemata#readSchema(java.net.URI, boolean) <em>Read Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Schema</em>' operation.
	 * @see easyflow.tool.ToolSchemata#readSchema(java.net.URI, boolean)
	 * @generated
	 */
	EOperation getToolSchemata__ReadSchema__URI_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ToolSchemata#readSchemata(org.eclipse.emf.common.util.EList, boolean) <em>Read Schemata</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Schemata</em>' operation.
	 * @see easyflow.tool.ToolSchemata#readSchemata(org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getToolSchemata__ReadSchemata__EList_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ToolSchemata#getDefaultSchema() <em>Get Default Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Schema</em>' operation.
	 * @see easyflow.tool.ToolSchemata#getDefaultSchema()
	 * @generated
	 */
	EOperation getToolSchemata__GetDefaultSchema();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ToolSchemata#getSchemaFor(org.w3c.dom.Document) <em>Get Schema For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Schema For</em>' operation.
	 * @see easyflow.tool.ToolSchemata#getSchemaFor(org.w3c.dom.Document)
	 * @generated
	 */
	EOperation getToolSchemata__GetSchemaFor__Document();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.ToolDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions</em>'.
	 * @see easyflow.tool.ToolDefinitions
	 * @generated
	 */
	EClass getToolDefinitions();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.ToolDefinitions#getToolDefinitions <em>Tool Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tool Definitions</em>'.
	 * @see easyflow.tool.ToolDefinitions#getToolDefinitions()
	 * @see #getToolDefinitions()
	 * @generated
	 */
	EAttribute getToolDefinitions_ToolDefinitions();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.ToolDefinitions#getToolSchemata <em>Tool Schemata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool Schemata</em>'.
	 * @see easyflow.tool.ToolDefinitions#getToolSchemata()
	 * @see #getToolDefinitions()
	 * @generated
	 */
	EReference getToolDefinitions_ToolSchemata();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.ToolDefinitions#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.tool.ToolDefinitions#getLogger()
	 * @see #getToolDefinitions()
	 * @generated
	 */
	EAttribute getToolDefinitions_Logger();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.ToolDefinitions#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see easyflow.tool.ToolDefinitions#getProperties()
	 * @see #getToolDefinitions()
	 * @generated
	 */
	EReference getToolDefinitions_Properties();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.ToolDefinitions#getLogMessage <em>Log Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Log Message</em>'.
	 * @see easyflow.tool.ToolDefinitions#getLogMessage()
	 * @see #getToolDefinitions()
	 * @generated
	 */
	EReference getToolDefinitions_LogMessage();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ToolDefinitions#validateToolDefinition(java.net.URI, boolean) <em>Validate Tool Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Tool Definition</em>' operation.
	 * @see easyflow.tool.ToolDefinitions#validateToolDefinition(java.net.URI, boolean)
	 * @generated
	 */
	EOperation getToolDefinitions__ValidateToolDefinition__URI_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ToolDefinitions#initLogMessage() <em>Init Log Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Log Message</em>' operation.
	 * @see easyflow.tool.ToolDefinitions#initLogMessage()
	 * @generated
	 */
	EOperation getToolDefinitions__InitLogMessage();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.IToolElement <em>ITool Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITool Element</em>'.
	 * @see easyflow.tool.IToolElement
	 * @generated
	 */
	EClass getIToolElement();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.IToolElement#renderToString() <em>Render To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render To String</em>' operation.
	 * @see easyflow.tool.IToolElement#renderToString()
	 * @generated
	 */
	EOperation getIToolElement__RenderToString();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.DefaultToolElement <em>Default Tool Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Tool Element</em>'.
	 * @see easyflow.tool.DefaultToolElement
	 * @generated
	 */
	EClass getDefaultToolElement();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.DefaultToolElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.tool.DefaultToolElement#getName()
	 * @see #getDefaultToolElement()
	 * @generated
	 */
	EAttribute getDefaultToolElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.DefaultToolElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see easyflow.tool.DefaultToolElement#getDescription()
	 * @see #getDefaultToolElement()
	 * @generated
	 */
	EAttribute getDefaultToolElement_Description();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see easyflow.tool.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Tool#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.tool.Tool#getLogger()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Tool#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see easyflow.tool.Tool#getId()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Id();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Tool#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see easyflow.tool.Tool#getVersion()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Version();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.Tool#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see easyflow.tool.Tool#getPackage()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Package();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.tool.Tool#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see easyflow.tool.Tool#getRequirements()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Requirements();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.Tool#getExecutables <em>Executables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Executables</em>'.
	 * @see easyflow.tool.Tool#getExecutables()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Executables();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.Tool#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Data</em>'.
	 * @see easyflow.tool.Tool#getData()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Data();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Tool#getFilenamePrefix <em>Filename Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename Prefix</em>'.
	 * @see easyflow.tool.Tool#getFilenamePrefix()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_FilenamePrefix();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Tool#getAnalysisType <em>Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Type</em>'.
	 * @see easyflow.tool.Tool#getAnalysisType()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_AnalysisType();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.Tool#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see easyflow.tool.Tool#getCommand()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Command();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.Tool#getResolvedParams <em>Resolved Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Resolved Params</em>'.
	 * @see easyflow.tool.Tool#getResolvedParams()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_ResolvedParams();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Tool#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see easyflow.tool.Tool#isRoot()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Root();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.Tool#getResolveUriMap <em>Resolve Uri Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Resolve Uri Map</em>'.
	 * @see easyflow.tool.Tool#getResolveUriMap()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_ResolveUriMap();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.Tool#getLogMessage <em>Log Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Log Message</em>'.
	 * @see easyflow.tool.Tool#getLogMessage()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_LogMessage();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#writeModelToXML() <em>Write Model To XML</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Model To XML</em>' operation.
	 * @see easyflow.tool.Tool#writeModelToXML()
	 * @generated
	 */
	EOperation getTool__WriteModelToXML();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#canFilterInstancesFor(easyflow.data.DataPort) <em>Can Filter Instances For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Filter Instances For</em>' operation.
	 * @see easyflow.tool.Tool#canFilterInstancesFor(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTool__CanFilterInstancesFor__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#requiresGrouping(java.lang.String, easyflow.data.DataPort) <em>Requires Grouping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Grouping</em>' operation.
	 * @see easyflow.tool.Tool#requiresGrouping(java.lang.String, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTool__RequiresGrouping__String_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#providesGrouping(java.lang.String, easyflow.data.DataPort) <em>Provides Grouping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Grouping</em>' operation.
	 * @see easyflow.tool.Tool#providesGrouping(java.lang.String, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTool__ProvidesGrouping__String_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getGroupingsForInputPort(easyflow.data.DataPort, boolean) <em>Get Groupings For Input Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Groupings For Input Port</em>' operation.
	 * @see easyflow.tool.Tool#getGroupingsForInputPort(easyflow.data.DataPort, boolean)
	 * @generated
	 */
	EOperation getTool__GetGroupingsForInputPort__DataPort_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getGroupingsForOutputPort(easyflow.data.DataPort, boolean) <em>Get Groupings For Output Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Groupings For Output Port</em>' operation.
	 * @see easyflow.tool.Tool#getGroupingsForOutputPort(easyflow.data.DataPort, boolean)
	 * @generated
	 */
	EOperation getTool__GetGroupingsForOutputPort__DataPort_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getAnalysisTypeOfPackage(org.eclipse.emf.common.util.EList) <em>Get Analysis Type Of Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Analysis Type Of Package</em>' operation.
	 * @see easyflow.tool.Tool#getAnalysisTypeOfPackage(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTool__GetAnalysisTypeOfPackage__EList();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getTemplateParameter(easyflow.tool.Parameter) <em>Get Template Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Template Parameter</em>' operation.
	 * @see easyflow.tool.Tool#getTemplateParameter(easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getTool__GetTemplateParameter__Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getTemplateParameter() <em>Get Template Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Template Parameter</em>' operation.
	 * @see easyflow.tool.Tool#getTemplateParameter()
	 * @generated
	 */
	EOperation getTool__GetTemplateParameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getMatchingParameter(org.eclipse.emf.common.util.EList, easyflow.tool.Parameter) <em>Get Matching Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Matching Parameter</em>' operation.
	 * @see easyflow.tool.Tool#getMatchingParameter(org.eclipse.emf.common.util.EList, easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getTool__GetMatchingParameter__EList_Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getMatchingParameterByName(org.eclipse.emf.common.util.EList, easyflow.tool.Parameter) <em>Get Matching Parameter By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Matching Parameter By Name</em>' operation.
	 * @see easyflow.tool.Tool#getMatchingParameterByName(org.eclipse.emf.common.util.EList, easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getTool__GetMatchingParameterByName__EList_Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#assumeDataParamPositional() <em>Assume Data Param Positional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assume Data Param Positional</em>' operation.
	 * @see easyflow.tool.Tool#assumeDataParamPositional()
	 * @generated
	 */
	EOperation getTool__AssumeDataParamPositional();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#omitPrefixIfNoArgKey() <em>Omit Prefix If No Arg Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Omit Prefix If No Arg Key</em>' operation.
	 * @see easyflow.tool.Tool#omitPrefixIfNoArgKey()
	 * @generated
	 */
	EOperation getTool__OmitPrefixIfNoArgKey();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getCmdPartDelimiter() <em>Get Cmd Part Delimiter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cmd Part Delimiter</em>' operation.
	 * @see easyflow.tool.Tool#getCmdPartDelimiter()
	 * @generated
	 */
	EOperation getTool__GetCmdPartDelimiter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getInterpreterParams() <em>Get Interpreter Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Interpreter Params</em>' operation.
	 * @see easyflow.tool.Tool#getInterpreterParams()
	 * @generated
	 */
	EOperation getTool__GetInterpreterParams();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getExe() <em>Get Exe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Exe</em>' operation.
	 * @see easyflow.tool.Tool#getExe()
	 * @generated
	 */
	EOperation getTool__GetExe();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getModuleParams() <em>Get Module Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Module Params</em>' operation.
	 * @see easyflow.tool.Tool#getModuleParams()
	 * @generated
	 */
	EOperation getTool__GetModuleParams();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#getInterpreter() <em>Get Interpreter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Interpreter</em>' operation.
	 * @see easyflow.tool.Tool#getInterpreter()
	 * @generated
	 */
	EOperation getTool__GetInterpreter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#canProvideMultipleInputsFor(easyflow.data.DataPort) <em>Can Provide Multiple Inputs For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Provide Multiple Inputs For</em>' operation.
	 * @see easyflow.tool.Tool#canProvideMultipleInputsFor(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTool__CanProvideMultipleInputsFor__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#canProvideMultipleInstancesFor(easyflow.data.DataPort) <em>Can Provide Multiple Instances For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Provide Multiple Instances For</em>' operation.
	 * @see easyflow.tool.Tool#canProvideMultipleInstancesFor(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTool__CanProvideMultipleInstancesFor__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#canProvideMultipleInstancesPerDataportFor(easyflow.data.DataPort) <em>Can Provide Multiple Instances Per Dataport For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Provide Multiple Instances Per Dataport For</em>' operation.
	 * @see easyflow.tool.Tool#canProvideMultipleInstancesPerDataportFor(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTool__CanProvideMultipleInstancesPerDataportFor__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#canProcessMultipleInputsFor(easyflow.data.DataPort) <em>Can Process Multiple Inputs For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Process Multiple Inputs For</em>' operation.
	 * @see easyflow.tool.Tool#canProcessMultipleInputsFor(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTool__CanProcessMultipleInputsFor__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#canProcessMultipleInstancesPerDataportFor(easyflow.data.DataPort) <em>Can Process Multiple Instances Per Dataport For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Process Multiple Instances Per Dataport For</em>' operation.
	 * @see easyflow.tool.Tool#canProcessMultipleInstancesPerDataportFor(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTool__CanProcessMultipleInstancesPerDataportFor__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#canProcessMultipleInstancesFor(easyflow.data.DataPort) <em>Can Process Multiple Instances For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Process Multiple Instances For</em>' operation.
	 * @see easyflow.tool.Tool#canProcessMultipleInstancesFor(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTool__CanProcessMultipleInstancesFor__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#resolvePath() <em>Resolve Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Path</em>' operation.
	 * @see easyflow.tool.Tool#resolvePath()
	 * @generated
	 */
	EOperation getTool__ResolvePath();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#assumeParamPositional() <em>Assume Param Positional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assume Param Positional</em>' operation.
	 * @see easyflow.tool.Tool#assumeParamPositional()
	 * @generated
	 */
	EOperation getTool__AssumeParamPositional();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#createData(easyflow.tool.InOutParameter, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap) <em>Create Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Data</em>' operation.
	 * @see easyflow.tool.Tool#createData(easyflow.tool.InOutParameter, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getTool__CreateData__InOutParameter_EMap_EMap();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#createData(easyflow.tool.ResolvedParam, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap) <em>Create Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Data</em>' operation.
	 * @see easyflow.tool.Tool#createData(easyflow.tool.ResolvedParam, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getTool__CreateData__ResolvedParam_EMap_EMap();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#initLogMessage() <em>Init Log Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Log Message</em>' operation.
	 * @see easyflow.tool.Tool#initLogMessage()
	 * @generated
	 */
	EOperation getTool__InitLogMessage();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Tool#isAllowedConversion(easyflow.data.DataPort, java.lang.String, java.lang.String) <em>Is Allowed Conversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Allowed Conversion</em>' operation.
	 * @see easyflow.tool.Tool#isAllowedConversion(easyflow.data.DataPort, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getTool__IsAllowedConversion__DataPort_String_String();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see easyflow.tool.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Command#isExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executable</em>'.
	 * @see easyflow.tool.Command#isExecutable()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Executable();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Command#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.tool.Command#getLogger()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Logger();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.Command#getResolvedParams <em>Resolved Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Resolved Params</em>'.
	 * @see easyflow.tool.Command#getResolvedParams()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_ResolvedParams();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Command#getPositionalParameterNames() <em>Get Positional Parameter Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Positional Parameter Names</em>' operation.
	 * @see easyflow.tool.Command#getPositionalParameterNames()
	 * @generated
	 */
	EOperation getCommand__GetPositionalParameterNames();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Command#getOptionalParameterNames() <em>Get Optional Parameter Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Optional Parameter Names</em>' operation.
	 * @see easyflow.tool.Command#getOptionalParameterNames()
	 * @generated
	 */
	EOperation getCommand__GetOptionalParameterNames();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Command#getInterperter() <em>Get Interperter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Interperter</em>' operation.
	 * @see easyflow.tool.Command#getInterperter()
	 * @generated
	 */
	EOperation getCommand__GetInterperter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Command#getExe() <em>Get Exe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Exe</em>' operation.
	 * @see easyflow.tool.Command#getExe()
	 * @generated
	 */
	EOperation getCommand__GetExe();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Command#resolveParameter(java.lang.String, org.eclipse.emf.common.util.EList) <em>Resolve Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Parameter</em>' operation.
	 * @see easyflow.tool.Command#resolveParameter(java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCommand__ResolveParameter__String_EList();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Command#getDataParamForDataPort(easyflow.data.DataPort, boolean) <em>Get Data Param For Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Param For Data Port</em>' operation.
	 * @see easyflow.tool.Command#getDataParamForDataPort(easyflow.data.DataPort, boolean)
	 * @generated
	 */
	EOperation getCommand__GetDataParamForDataPort__DataPort_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Command#getDataParamForDataPort(easyflow.data.DataPort, boolean, int) <em>Get Data Param For Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Param For Data Port</em>' operation.
	 * @see easyflow.tool.Command#getDataParamForDataPort(easyflow.data.DataPort, boolean, int)
	 * @generated
	 */
	EOperation getCommand__GetDataParamForDataPort__DataPort_boolean_int();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see easyflow.tool.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Rule#getCmdLine <em>Cmd Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cmd Line</em>'.
	 * @see easyflow.tool.Rule#getCmdLine()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_CmdLine();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Rule#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dependencies</em>'.
	 * @see easyflow.tool.Rule#getDependencies()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Dependencies();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Rule#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Targets</em>'.
	 * @see easyflow.tool.Rule#getTargets()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Targets();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Rule#isReadFromPipe <em>Read From Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read From Pipe</em>'.
	 * @see easyflow.tool.Rule#isReadFromPipe()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ReadFromPipe();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Rule#isWriteToPipe <em>Write To Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write To Pipe</em>'.
	 * @see easyflow.tool.Rule#isWriteToPipe()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_WriteToPipe();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Rule#getInputParams <em>Input Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input Params</em>'.
	 * @see easyflow.tool.Rule#getInputParams()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_InputParams();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Rule#getOutputParams <em>Output Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Params</em>'.
	 * @see easyflow.tool.Rule#getOutputParams()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_OutputParams();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Rule#getOptParams <em>Opt Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Opt Params</em>'.
	 * @see easyflow.tool.Rule#getOptParams()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_OptParams();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Rule#getPosParams <em>Pos Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pos Params</em>'.
	 * @see easyflow.tool.Rule#getPosParams()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_PosParams();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Rule#getExe <em>Exe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exe</em>'.
	 * @see easyflow.tool.Rule#getExe()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Exe();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Rule#getExeParams <em>Exe Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exe Params</em>'.
	 * @see easyflow.tool.Rule#getExeParams()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ExeParams();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Rule#getInterpreter <em>Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpreter</em>'.
	 * @see easyflow.tool.Rule#getInterpreter()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Interpreter();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Rule#getInterpreterParams <em>Interpreter Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interpreter Params</em>'.
	 * @see easyflow.tool.Rule#getInterpreterParams()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_InterpreterParams();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Rule#resolveCommandLineParts() <em>Resolve Command Line Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Command Line Parts</em>' operation.
	 * @see easyflow.tool.Rule#resolveCommandLineParts()
	 * @generated
	 */
	EOperation getRule__ResolveCommandLineParts();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Rule#createCommandLine() <em>Create Command Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Command Line</em>' operation.
	 * @see easyflow.tool.Rule#createCommandLine()
	 * @generated
	 */
	EOperation getRule__CreateCommandLine();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.Rule#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see easyflow.tool.Rule#getTask()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Task();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see easyflow.tool.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see easyflow.tool.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Expression();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.tool.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.ResolvedParam <em>Resolved Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolved Param</em>'.
	 * @see easyflow.tool.ResolvedParam
	 * @generated
	 */
	EClass getResolvedParam();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.ResolvedParam#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see easyflow.tool.ResolvedParam#getParameter()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EReference getResolvedParam_Parameter();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.ResolvedParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see easyflow.tool.ResolvedParam#getValue()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EAttribute getResolvedParam_Value();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.ResolvedParam#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see easyflow.tool.ResolvedParam#getHandle()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EAttribute getResolvedParam_Handle();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.ResolvedParam#getDataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Format</em>'.
	 * @see easyflow.tool.ResolvedParam#getDataFormat()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EReference getResolvedParam_DataFormat();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.ResolvedParam#getConditionalParam <em>Conditional Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditional Param</em>'.
	 * @see easyflow.tool.ResolvedParam#getConditionalParam()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EAttribute getResolvedParam_ConditionalParam();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.ResolvedParam#getChildParams <em>Child Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Child Params</em>'.
	 * @see easyflow.tool.ResolvedParam#getChildParams()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EReference getResolvedParam_ChildParams();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.ResolvedParam#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Conditions</em>'.
	 * @see easyflow.tool.ResolvedParam#getConditions()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EReference getResolvedParam_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.ResolvedParam#isPipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pipe</em>'.
	 * @see easyflow.tool.ResolvedParam#isPipe()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EAttribute getResolvedParam_Pipe();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.ResolvedParam#isConditionResolving <em>Condition Resolving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Resolving</em>'.
	 * @see easyflow.tool.ResolvedParam#isConditionResolving()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EAttribute getResolvedParam_ConditionResolving();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#generateCommandString(org.eclipse.emf.common.util.EMap, easyflow.tool.Parameter) <em>Generate Command String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Command String</em>' operation.
	 * @see easyflow.tool.ResolvedParam#generateCommandString(org.eclipse.emf.common.util.EMap, easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getResolvedParam__GenerateCommandString__EMap_Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#getArgValue() <em>Get Arg Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg Value</em>' operation.
	 * @see easyflow.tool.ResolvedParam#getArgValue()
	 * @generated
	 */
	EOperation getResolvedParam__GetArgValue();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#resolveName() <em>Resolve Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Name</em>' operation.
	 * @see easyflow.tool.ResolvedParam#resolveName()
	 * @generated
	 */
	EOperation getResolvedParam__ResolveName();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#getEffectiveParameters(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EMap) <em>Get Effective Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Parameters</em>' operation.
	 * @see easyflow.tool.ResolvedParam#getEffectiveParameters(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getResolvedParam__GetEffectiveParameters__EList_EMap();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#getSupportedHandles() <em>Get Supported Handles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Supported Handles</em>' operation.
	 * @see easyflow.tool.ResolvedParam#getSupportedHandles()
	 * @generated
	 */
	EOperation getResolvedParam__GetSupportedHandles();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#deepCopy() <em>Deep Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deep Copy</em>' operation.
	 * @see easyflow.tool.ResolvedParam#deepCopy()
	 * @generated
	 */
	EOperation getResolvedParam__DeepCopy();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#resolvePipe(java.lang.String) <em>Resolve Pipe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Pipe</em>' operation.
	 * @see easyflow.tool.ResolvedParam#resolvePipe(java.lang.String)
	 * @generated
	 */
	EOperation getResolvedParam__ResolvePipe__String();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#resolveCondititionalParam(java.lang.String, java.lang.String) <em>Resolve Condititional Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Condititional Param</em>' operation.
	 * @see easyflow.tool.ResolvedParam#resolveCondititionalParam(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getResolvedParam__ResolveCondititionalParam__String_String();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#getChildParam(java.lang.String, java.lang.String) <em>Get Child Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Child Param</em>' operation.
	 * @see easyflow.tool.ResolvedParam#getChildParam(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getResolvedParam__GetChildParam__String_String();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.ResolvedParam#getConditionResolvingChildParam(java.lang.String, boolean) <em>Get Condition Resolving Child Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition Resolving Child Param</em>' operation.
	 * @see easyflow.tool.ResolvedParam#getConditionResolvingChildParam(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getResolvedParam__GetConditionResolvingChildParam__String_boolean();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.ResolvedParam#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see easyflow.tool.ResolvedParam#isResolved()
	 * @see #getResolvedParam()
	 * @generated
	 */
	EAttribute getResolvedParam_Resolved();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see easyflow.tool.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.tool.Parameter#getLogger()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see easyflow.tool.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see easyflow.tool.Parameter#getOptional()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Optional();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see easyflow.tool.Parameter#getMultiple()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getMultipleValue <em>Multiple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Value</em>'.
	 * @see easyflow.tool.Parameter#getMultipleValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_MultipleValue();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see easyflow.tool.Parameter#getValueType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see easyflow.tool.Parameter#getDefaultValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see easyflow.tool.Parameter#getPrefix()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getOptionKey <em>Option Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Key</em>'.
	 * @see easyflow.tool.Parameter#getOptionKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_OptionKey();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter</em>'.
	 * @see easyflow.tool.Parameter#getDelimiter()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Delimiter();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getValueDelimiter <em>Value Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Delimiter</em>'.
	 * @see easyflow.tool.Parameter#getValueDelimiter()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ValueDelimiter();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.tool.Parameter#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keys</em>'.
	 * @see easyflow.tool.Parameter#getKeys()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Keys();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getNamed <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Named</em>'.
	 * @see easyflow.tool.Parameter#getNamed()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Named();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see easyflow.tool.Parameter#getLabel()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Label();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see easyflow.tool.Parameter#getHelp()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Help();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getMinOcc <em>Min Occ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occ</em>'.
	 * @see easyflow.tool.Parameter#getMinOcc()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_MinOcc();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getMaxOcc <em>Max Occ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occ</em>'.
	 * @see easyflow.tool.Parameter#getMaxOcc()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_MaxOcc();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isAdvanced <em>Advanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advanced</em>'.
	 * @see easyflow.tool.Parameter#isAdvanced()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Advanced();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.tool.Parameter#getOptionValues <em>Option Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Option Values</em>'.
	 * @see easyflow.tool.Parameter#getOptionValues()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_OptionValues();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getPositional <em>Positional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positional</em>'.
	 * @see easyflow.tool.Parameter#getPositional()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Positional();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Parameter#getGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Grouping</em>'.
	 * @see easyflow.tool.Parameter#getGrouping()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Grouping();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.tool.Parameter#getDataDeprecated <em>Data Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Deprecated</em>'.
	 * @see easyflow.tool.Parameter#getDataDeprecated()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_DataDeprecated();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getFixedArgValue <em>Fixed Arg Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Arg Value</em>'.
	 * @see easyflow.tool.Parameter#getFixedArgValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_FixedArgValue();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.Parameter#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see easyflow.tool.Parameter#getParent()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Parent();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Parameter#getHandles <em>Handles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Handles</em>'.
	 * @see easyflow.tool.Parameter#getHandles()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Handles();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Parameter#getGeneralValue <em>General Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>General Value</em>'.
	 * @see easyflow.tool.Parameter#getGeneralValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_GeneralValue();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isDataParam <em>Data Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Param</em>'.
	 * @see easyflow.tool.Parameter#isDataParam()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DataParam();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getCmdPart <em>Cmd Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd Part</em>'.
	 * @see easyflow.tool.Parameter#getCmdPart()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_CmdPart();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getMultipleInstances <em>Multiple Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Instances</em>'.
	 * @see easyflow.tool.Parameter#getMultipleInstances()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_MultipleInstances();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getMultipleInstancesPerDataport <em>Multiple Instances Per Dataport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Instances Per Dataport</em>'.
	 * @see easyflow.tool.Parameter#getMultipleInstancesPerDataport()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_MultipleInstancesPerDataport();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getOutputArgValueForBooleanParam <em>Output Arg Value For Boolean Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Arg Value For Boolean Param</em>'.
	 * @see easyflow.tool.Parameter#getOutputArgValueForBooleanParam()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_OutputArgValueForBooleanParam();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see easyflow.tool.Parameter#isHidden()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getOutputDefaultParam <em>Output Default Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Default Param</em>'.
	 * @see easyflow.tool.Parameter#getOutputDefaultParam()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_OutputDefaultParam();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Type</em>'.
	 * @see easyflow.tool.Parameter#getConditionType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ConditionType();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Parameter#getOverrideAttributes <em>Override Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Override Attributes</em>'.
	 * @see easyflow.tool.Parameter#getOverrideAttributes()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_OverrideAttributes();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see easyflow.tool.Parameter#isAbstract()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Abstract();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Parameter#getToolRefs <em>Tool Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tool Refs</em>'.
	 * @see easyflow.tool.Parameter#getToolRefs()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ToolRefs();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getPreferPkgParam <em>Prefer Pkg Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefer Pkg Param</em>'.
	 * @see easyflow.tool.Parameter#getPreferPkgParam()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_PreferPkgParam();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#getArgKey(java.lang.String, easyflow.tool.Key) <em>Get Arg Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg Key</em>' operation.
	 * @see easyflow.tool.Parameter#getArgKey(java.lang.String, easyflow.tool.Key)
	 * @generated
	 */
	EOperation getParameter__GetArgKey__String_Key();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#getArgDelimiter(java.lang.String) <em>Get Arg Delimiter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg Delimiter</em>' operation.
	 * @see easyflow.tool.Parameter#getArgDelimiter(java.lang.String)
	 * @generated
	 */
	EOperation getParameter__GetArgDelimiter__String();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#getArgValueDelimiter(java.lang.String) <em>Get Arg Value Delimiter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg Value Delimiter</em>' operation.
	 * @see easyflow.tool.Parameter#getArgValueDelimiter(java.lang.String)
	 * @generated
	 */
	EOperation getParameter__GetArgValueDelimiter__String();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#getPrefix(java.lang.String) <em>Get Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Prefix</em>' operation.
	 * @see easyflow.tool.Parameter#getPrefix(java.lang.String)
	 * @generated
	 */
	EOperation getParameter__GetPrefix__String();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#getParameterForAnalysisType(org.eclipse.emf.common.util.EList) <em>Get Parameter For Analysis Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter For Analysis Type</em>' operation.
	 * @see easyflow.tool.Parameter#getParameterForAnalysisType(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getParameter__GetParameterForAnalysisType__EList();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isAnalysisType() <em>Is Analysis Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Analysis Type</em>' operation.
	 * @see easyflow.tool.Parameter#isAnalysisType()
	 * @generated
	 */
	EOperation getParameter__IsAnalysisType();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#getSupportedHandles(boolean) <em>Get Supported Handles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Supported Handles</em>' operation.
	 * @see easyflow.tool.Parameter#getSupportedHandles(boolean)
	 * @generated
	 */
	EOperation getParameter__GetSupportedHandles__boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#getEffectiveParentParameter(boolean) <em>Get Effective Parent Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Parent Parameter</em>' operation.
	 * @see easyflow.tool.Parameter#getEffectiveParentParameter(boolean)
	 * @generated
	 */
	EOperation getParameter__GetEffectiveParentParameter__boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#getMergedParameter(easyflow.tool.Parameter, boolean) <em>Get Merged Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Merged Parameter</em>' operation.
	 * @see easyflow.tool.Parameter#getMergedParameter(easyflow.tool.Parameter, boolean)
	 * @generated
	 */
	EOperation getParameter__GetMergedParameter__Parameter_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#matches(easyflow.tool.Parameter) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches</em>' operation.
	 * @see easyflow.tool.Parameter#matches(easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getParameter__Matches__Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#matches(easyflow.tool.InOutParameter) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches</em>' operation.
	 * @see easyflow.tool.Parameter#matches(easyflow.tool.InOutParameter)
	 * @generated
	 */
	EOperation getParameter__Matches__InOutParameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#generateCommandStringURI(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, easyflow.tool.Parameter) <em>Generate Command String URI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Command String URI</em>' operation.
	 * @see easyflow.tool.Parameter#generateCommandStringURI(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getParameter__GenerateCommandStringURI__EMap_EList_Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#generateCommandString(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, easyflow.tool.Parameter) <em>Generate Command String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Command String</em>' operation.
	 * @see easyflow.tool.Parameter#generateCommandString(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getParameter__GenerateCommandString__EMap_EList_Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#generateCommandString(org.eclipse.emf.common.util.EMap, java.lang.Object, easyflow.tool.Parameter) <em>Generate Command String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Command String</em>' operation.
	 * @see easyflow.tool.Parameter#generateCommandString(org.eclipse.emf.common.util.EMap, java.lang.Object, easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getParameter__GenerateCommandString__EMap_Object_Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#generateCommandString(org.eclipse.emf.common.util.EMap, easyflow.tool.OptionValue, easyflow.tool.Parameter) <em>Generate Command String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Command String</em>' operation.
	 * @see easyflow.tool.Parameter#generateCommandString(org.eclipse.emf.common.util.EMap, easyflow.tool.OptionValue, easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getParameter__GenerateCommandString__EMap_OptionValue_Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#generateCommandString(org.eclipse.emf.common.util.EMap, java.net.URI, easyflow.tool.Parameter) <em>Generate Command String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Command String</em>' operation.
	 * @see easyflow.tool.Parameter#generateCommandString(org.eclipse.emf.common.util.EMap, java.net.URI, easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getParameter__GenerateCommandString__EMap_URI_Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isOptional(java.lang.Boolean) <em>Is Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Optional</em>' operation.
	 * @see easyflow.tool.Parameter#isOptional(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__IsOptional__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isMultiple(java.lang.Boolean) <em>Is Multiple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Multiple</em>' operation.
	 * @see easyflow.tool.Parameter#isMultiple(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__IsMultiple__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isMultipleInstances(java.lang.Boolean) <em>Is Multiple Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Multiple Instances</em>' operation.
	 * @see easyflow.tool.Parameter#isMultipleInstances(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__IsMultipleInstances__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isMultipleInstancesPerDataport(java.lang.Boolean) <em>Is Multiple Instances Per Dataport</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Multiple Instances Per Dataport</em>' operation.
	 * @see easyflow.tool.Parameter#isMultipleInstancesPerDataport(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__IsMultipleInstancesPerDataport__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isNamed(java.lang.Boolean) <em>Is Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Named</em>' operation.
	 * @see easyflow.tool.Parameter#isNamed(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__IsNamed__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isPositional(java.lang.Boolean) <em>Is Positional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Positional</em>' operation.
	 * @see easyflow.tool.Parameter#isPositional(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__IsPositional__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isFixedArgValue(java.lang.Boolean) <em>Is Fixed Arg Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Fixed Arg Value</em>' operation.
	 * @see easyflow.tool.Parameter#isFixedArgValue(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__IsFixedArgValue__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isMultipleValue(java.lang.Boolean) <em>Is Multiple Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Multiple Value</em>' operation.
	 * @see easyflow.tool.Parameter#isMultipleValue(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__IsMultipleValue__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#shouldOutputArgValue(java.lang.Boolean) <em>Should Output Arg Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Should Output Arg Value</em>' operation.
	 * @see easyflow.tool.Parameter#shouldOutputArgValue(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__ShouldOutputArgValue__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#merge(easyflow.tool.Parameter) <em>Merge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge</em>' operation.
	 * @see easyflow.tool.Parameter#merge(easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getParameter__Merge__Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#getUniqueString() <em>Get Unique String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique String</em>' operation.
	 * @see easyflow.tool.Parameter#getUniqueString()
	 * @generated
	 */
	EOperation getParameter__GetUniqueString();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#resolveName() <em>Resolve Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Name</em>' operation.
	 * @see easyflow.tool.Parameter#resolveName()
	 * @generated
	 */
	EOperation getParameter__ResolveName();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#shouldOutputDefaultParam(java.lang.Boolean) <em>Should Output Default Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Should Output Default Param</em>' operation.
	 * @see easyflow.tool.Parameter#shouldOutputDefaultParam(java.lang.Boolean)
	 * @generated
	 */
	EOperation getParameter__ShouldOutputDefaultParam__Boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isMetaDataParam() <em>Is Meta Data Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Meta Data Param</em>' operation.
	 * @see easyflow.tool.Parameter#isMetaDataParam()
	 * @generated
	 */
	EOperation getParameter__IsMetaDataParam();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isDataSpecifyingParam() <em>Is Data Specifying Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Data Specifying Param</em>' operation.
	 * @see easyflow.tool.Parameter#isDataSpecifyingParam()
	 * @generated
	 */
	EOperation getParameter__IsDataSpecifyingParam();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isBoolean() <em>Is Boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Boolean</em>' operation.
	 * @see easyflow.tool.Parameter#isBoolean()
	 * @generated
	 */
	EOperation getParameter__IsBoolean();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Parameter#isPreferred() <em>Is Preferred</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Preferred</em>' operation.
	 * @see easyflow.tool.Parameter#isPreferred()
	 * @generated
	 */
	EOperation getParameter__IsPreferred();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.InOutParameter <em>In Out Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Out Parameter</em>'.
	 * @see easyflow.tool.InOutParameter
	 * @generated
	 */
	EClass getInOutParameter();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.InOutParameter#isOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see easyflow.tool.InOutParameter#isOutput()
	 * @see #getInOutParameter()
	 * @generated
	 */
	EAttribute getInOutParameter_Output();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.InOutParameter#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see easyflow.tool.InOutParameter#getExtension()
	 * @see #getInOutParameter()
	 * @generated
	 */
	EAttribute getInOutParameter_Extension();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.InOutParameter#getFilenameCreation <em>Filename Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename Creation</em>'.
	 * @see easyflow.tool.InOutParameter#getFilenameCreation()
	 * @see #getInOutParameter()
	 * @generated
	 */
	EAttribute getInOutParameter_FilenameCreation();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.InOutParameter#getFormats <em>Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formats</em>'.
	 * @see easyflow.tool.InOutParameter#getFormats()
	 * @see #getInOutParameter()
	 * @generated
	 */
	EAttribute getInOutParameter_Formats();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.InOutParameter#getDataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Port</em>'.
	 * @see easyflow.tool.InOutParameter#getDataPort()
	 * @see #getInOutParameter()
	 * @generated
	 */
	EAttribute getInOutParameter_DataPort();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.InOutParameter#getConvertGrouping <em>Convert Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Grouping</em>'.
	 * @see easyflow.tool.InOutParameter#getConvertGrouping()
	 * @see #getInOutParameter()
	 * @generated
	 */
	EAttribute getInOutParameter_ConvertGrouping();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.InOutParameter#matches(easyflow.tool.InOutParameter) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches</em>' operation.
	 * @see easyflow.tool.InOutParameter#matches(easyflow.tool.InOutParameter)
	 * @generated
	 */
	EOperation getInOutParameter__Matches__InOutParameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.InOutParameter#matches(easyflow.tool.Parameter) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches</em>' operation.
	 * @see easyflow.tool.InOutParameter#matches(easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getInOutParameter__Matches__Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.InOutParameter#merge(easyflow.tool.Parameter) <em>Merge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge</em>' operation.
	 * @see easyflow.tool.InOutParameter#merge(easyflow.tool.Parameter)
	 * @generated
	 */
	EOperation getInOutParameter__Merge__Parameter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.InOutParameter#omitExtension() <em>Omit Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Omit Extension</em>' operation.
	 * @see easyflow.tool.InOutParameter#omitExtension()
	 * @generated
	 */
	EOperation getInOutParameter__OmitExtension();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.InOutParameter#isAllowedConversion(java.lang.String, java.lang.String) <em>Is Allowed Conversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Allowed Conversion</em>' operation.
	 * @see easyflow.tool.InOutParameter#isAllowedConversion(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getInOutParameter__IsAllowedConversion__String_String();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.InOutParameter#getConvertGrouping(java.lang.String) <em>Get Convert Grouping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Convert Grouping</em>' operation.
	 * @see easyflow.tool.InOutParameter#getConvertGrouping(java.lang.String)
	 * @generated
	 */
	EOperation getInOutParameter__GetConvertGrouping__String();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see easyflow.tool.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.tool.Package#getResolvedParams <em>Resolved Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved Params</em>'.
	 * @see easyflow.tool.Package#getResolvedParams()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ResolvedParams();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Package#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see easyflow.tool.Package#getId()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Id();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see easyflow.tool.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.Package#getResolveUriMap <em>Resolve Uri Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Resolve Uri Map</em>'.
	 * @see easyflow.tool.Package#getResolveUriMap()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ResolveUriMap();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Package#getInterpreter() <em>Get Interpreter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Interpreter</em>' operation.
	 * @see easyflow.tool.Package#getInterpreter()
	 * @generated
	 */
	EOperation getPackage__GetInterpreter();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Package#getExe() <em>Get Exe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Exe</em>' operation.
	 * @see easyflow.tool.Package#getExe()
	 * @generated
	 */
	EOperation getPackage__GetExe();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Package#getInterpreterParams() <em>Get Interpreter Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Interpreter Params</em>' operation.
	 * @see easyflow.tool.Package#getInterpreterParams()
	 * @generated
	 */
	EOperation getPackage__GetInterpreterParams();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see easyflow.tool.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Key#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see easyflow.tool.Key#getValue()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Value();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Key#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter</em>'.
	 * @see easyflow.tool.Key#getDelimiter()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Delimiter();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Key#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see easyflow.tool.Key#getPrefix()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Key#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see easyflow.tool.Key#getType()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Type();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Key#resolveArgKey(java.lang.String) <em>Resolve Arg Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Arg Key</em>' operation.
	 * @see easyflow.tool.Key#resolveArgKey(java.lang.String)
	 * @generated
	 */
	EOperation getKey__ResolveArgKey__String();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.Key#resolveName() <em>Resolve Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Name</em>' operation.
	 * @see easyflow.tool.Key#resolveName()
	 * @generated
	 */
	EOperation getKey__ResolveName();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see easyflow.tool.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see easyflow.tool.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Type();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Requirement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see easyflow.tool.Requirement#getVersion()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Version();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Requirement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see easyflow.tool.Requirement#getValue()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Value();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.DocumentProperties <em>Document Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Properties</em>'.
	 * @see easyflow.tool.DocumentProperties
	 * @generated
	 */
	EClass getDocumentProperties();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.DocumentProperties#getSourceURI <em>Source URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source URI</em>'.
	 * @see easyflow.tool.DocumentProperties#getSourceURI()
	 * @see #getDocumentProperties()
	 * @generated
	 */
	EAttribute getDocumentProperties_SourceURI();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.DocumentProperties#isFromJar <em>From Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Jar</em>'.
	 * @see easyflow.tool.DocumentProperties#isFromJar()
	 * @see #getDocumentProperties()
	 * @generated
	 */
	EAttribute getDocumentProperties_FromJar();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.OptionValue <em>Option Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Value</em>'.
	 * @see easyflow.tool.OptionValue
	 * @generated
	 */
	EClass getOptionValue();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.OptionValue#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see easyflow.tool.OptionValue#getCondition()
	 * @see #getOptionValue()
	 * @generated
	 */
	EAttribute getOptionValue_Condition();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.OptionValue#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see easyflow.tool.OptionValue#getHelp()
	 * @see #getOptionValue()
	 * @generated
	 */
	EAttribute getOptionValue_Help();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.OptionValue#getExe <em>Exe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exe</em>'.
	 * @see easyflow.tool.OptionValue#getExe()
	 * @see #getOptionValue()
	 * @generated
	 */
	EAttribute getOptionValue_Exe();

	/**
	 * Returns the meta object for the '{@link easyflow.tool.OptionValue#resolveValue() <em>Resolve Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Value</em>' operation.
	 * @see easyflow.tool.OptionValue#resolveValue()
	 * @generated
	 */
	EOperation getOptionValue__ResolveValue();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.BaseCommand <em>Base Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Command</em>'.
	 * @see easyflow.tool.BaseCommand
	 * @generated
	 */
	EClass getBaseCommand();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.BaseCommand#getCommandPattern <em>Command Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Pattern</em>'.
	 * @see easyflow.tool.BaseCommand#getCommandPattern()
	 * @see #getBaseCommand()
	 * @generated
	 */
	EAttribute getBaseCommand_CommandPattern();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.tool.BaseCommand#getTemplateParams <em>Template Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Template Params</em>'.
	 * @see easyflow.tool.BaseCommand#getTemplateParams()
	 * @see #getBaseCommand()
	 * @generated
	 */
	EReference getBaseCommand_TemplateParams();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.BaseCommand#getAssumeDataParamPositional <em>Assume Data Param Positional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assume Data Param Positional</em>'.
	 * @see easyflow.tool.BaseCommand#getAssumeDataParamPositional()
	 * @see #getBaseCommand()
	 * @generated
	 */
	EAttribute getBaseCommand_AssumeDataParamPositional();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.BaseCommand#getAssumeParamPositional <em>Assume Param Positional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assume Param Positional</em>'.
	 * @see easyflow.tool.BaseCommand#getAssumeParamPositional()
	 * @see #getBaseCommand()
	 * @generated
	 */
	EAttribute getBaseCommand_AssumeParamPositional();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.BaseCommand#getCmdPartDelimiter <em>Cmd Part Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd Part Delimiter</em>'.
	 * @see easyflow.tool.BaseCommand#getCmdPartDelimiter()
	 * @see #getBaseCommand()
	 * @generated
	 */
	EAttribute getBaseCommand_CmdPartDelimiter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToolFactory getToolFactory();

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
		 * The meta object literal for the '{@link easyflow.tool.IRule <em>IRule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.IRule
		 * @see easyflow.tool.impl.ToolPackageImpl#getIRule()
		 * @generated
		 */
		EClass IRULE = eINSTANCE.getIRule();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRULE___CLEAR = eINSTANCE.getIRule__Clear();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.ToolSchemataImpl <em>Schemata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.ToolSchemataImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getToolSchemata()
		 * @generated
		 */
		EClass TOOL_SCHEMATA = eINSTANCE.getToolSchemata();

		/**
		 * The meta object literal for the '<em><b>Schemata</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_SCHEMATA__SCHEMATA = eINSTANCE.getToolSchemata_Schemata();

		/**
		 * The meta object literal for the '<em><b>Schemata URI</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_SCHEMATA__SCHEMATA_URI = eINSTANCE.getToolSchemata_SchemataURI();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_SCHEMATA__LOGGER = eINSTANCE.getToolSchemata_Logger();

		/**
		 * The meta object literal for the '<em><b>Read Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_SCHEMATA___READ_SCHEMA__URI_BOOLEAN = eINSTANCE.getToolSchemata__ReadSchema__URI_boolean();

		/**
		 * The meta object literal for the '<em><b>Read Schemata</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_SCHEMATA___READ_SCHEMATA__ELIST_BOOLEAN = eINSTANCE.getToolSchemata__ReadSchemata__EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Default Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_SCHEMATA___GET_DEFAULT_SCHEMA = eINSTANCE.getToolSchemata__GetDefaultSchema();

		/**
		 * The meta object literal for the '<em><b>Get Schema For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_SCHEMATA___GET_SCHEMA_FOR__DOCUMENT = eINSTANCE.getToolSchemata__GetSchemaFor__Document();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.ToolDefinitionsImpl <em>Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.ToolDefinitionsImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getToolDefinitions()
		 * @generated
		 */
		EClass TOOL_DEFINITIONS = eINSTANCE.getToolDefinitions();

		/**
		 * The meta object literal for the '<em><b>Tool Definitions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_DEFINITIONS__TOOL_DEFINITIONS = eINSTANCE.getToolDefinitions_ToolDefinitions();

		/**
		 * The meta object literal for the '<em><b>Tool Schemata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_DEFINITIONS__TOOL_SCHEMATA = eINSTANCE.getToolDefinitions_ToolSchemata();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_DEFINITIONS__LOGGER = eINSTANCE.getToolDefinitions_Logger();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_DEFINITIONS__PROPERTIES = eINSTANCE.getToolDefinitions_Properties();

		/**
		 * The meta object literal for the '<em><b>Log Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_DEFINITIONS__LOG_MESSAGE = eINSTANCE.getToolDefinitions_LogMessage();

		/**
		 * The meta object literal for the '<em><b>Validate Tool Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_DEFINITIONS___VALIDATE_TOOL_DEFINITION__URI_BOOLEAN = eINSTANCE.getToolDefinitions__ValidateToolDefinition__URI_boolean();

		/**
		 * The meta object literal for the '<em><b>Init Log Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_DEFINITIONS___INIT_LOG_MESSAGE = eINSTANCE.getToolDefinitions__InitLogMessage();

		/**
		 * The meta object literal for the '{@link easyflow.tool.IToolElement <em>ITool Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.IToolElement
		 * @see easyflow.tool.impl.ToolPackageImpl#getIToolElement()
		 * @generated
		 */
		EClass ITOOL_ELEMENT = eINSTANCE.getIToolElement();

		/**
		 * The meta object literal for the '<em><b>Render To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITOOL_ELEMENT___RENDER_TO_STRING = eINSTANCE.getIToolElement__RenderToString();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.DefaultToolElementImpl <em>Default Tool Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.DefaultToolElementImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getDefaultToolElement()
		 * @generated
		 */
		EClass DEFAULT_TOOL_ELEMENT = eINSTANCE.getDefaultToolElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_TOOL_ELEMENT__NAME = eINSTANCE.getDefaultToolElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_TOOL_ELEMENT__DESCRIPTION = eINSTANCE.getDefaultToolElement_Description();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.ToolImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__LOGGER = eINSTANCE.getTool_Logger();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__ID = eINSTANCE.getTool_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__VERSION = eINSTANCE.getTool_Version();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__PACKAGE = eINSTANCE.getTool_Package();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__REQUIREMENTS = eINSTANCE.getTool_Requirements();

		/**
		 * The meta object literal for the '<em><b>Executables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__EXECUTABLES = eINSTANCE.getTool_Executables();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__DATA = eINSTANCE.getTool_Data();

		/**
		 * The meta object literal for the '<em><b>Filename Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__FILENAME_PREFIX = eINSTANCE.getTool_FilenamePrefix();

		/**
		 * The meta object literal for the '<em><b>Analysis Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__ANALYSIS_TYPE = eINSTANCE.getTool_AnalysisType();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__COMMAND = eINSTANCE.getTool_Command();

		/**
		 * The meta object literal for the '<em><b>Resolved Params</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__RESOLVED_PARAMS = eINSTANCE.getTool_ResolvedParams();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__ROOT = eINSTANCE.getTool_Root();

		/**
		 * The meta object literal for the '<em><b>Resolve Uri Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__RESOLVE_URI_MAP = eINSTANCE.getTool_ResolveUriMap();

		/**
		 * The meta object literal for the '<em><b>Log Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__LOG_MESSAGE = eINSTANCE.getTool_LogMessage();

		/**
		 * The meta object literal for the '<em><b>Write Model To XML</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___WRITE_MODEL_TO_XML = eINSTANCE.getTool__WriteModelToXML();

		/**
		 * The meta object literal for the '<em><b>Can Filter Instances For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___CAN_FILTER_INSTANCES_FOR__DATAPORT = eINSTANCE.getTool__CanFilterInstancesFor__DataPort();

		/**
		 * The meta object literal for the '<em><b>Requires Grouping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___REQUIRES_GROUPING__STRING_DATAPORT = eINSTANCE.getTool__RequiresGrouping__String_DataPort();

		/**
		 * The meta object literal for the '<em><b>Provides Grouping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___PROVIDES_GROUPING__STRING_DATAPORT = eINSTANCE.getTool__ProvidesGrouping__String_DataPort();

		/**
		 * The meta object literal for the '<em><b>Get Groupings For Input Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_GROUPINGS_FOR_INPUT_PORT__DATAPORT_BOOLEAN = eINSTANCE.getTool__GetGroupingsForInputPort__DataPort_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Groupings For Output Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_GROUPINGS_FOR_OUTPUT_PORT__DATAPORT_BOOLEAN = eINSTANCE.getTool__GetGroupingsForOutputPort__DataPort_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Analysis Type Of Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_ANALYSIS_TYPE_OF_PACKAGE__ELIST = eINSTANCE.getTool__GetAnalysisTypeOfPackage__EList();

		/**
		 * The meta object literal for the '<em><b>Get Template Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_TEMPLATE_PARAMETER__PARAMETER = eINSTANCE.getTool__GetTemplateParameter__Parameter();

		/**
		 * The meta object literal for the '<em><b>Get Template Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_TEMPLATE_PARAMETER = eINSTANCE.getTool__GetTemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Get Matching Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_MATCHING_PARAMETER__ELIST_PARAMETER = eINSTANCE.getTool__GetMatchingParameter__EList_Parameter();

		/**
		 * The meta object literal for the '<em><b>Get Matching Parameter By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_MATCHING_PARAMETER_BY_NAME__ELIST_PARAMETER = eINSTANCE.getTool__GetMatchingParameterByName__EList_Parameter();

		/**
		 * The meta object literal for the '<em><b>Assume Data Param Positional</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___ASSUME_DATA_PARAM_POSITIONAL = eINSTANCE.getTool__AssumeDataParamPositional();

		/**
		 * The meta object literal for the '<em><b>Omit Prefix If No Arg Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___OMIT_PREFIX_IF_NO_ARG_KEY = eINSTANCE.getTool__OmitPrefixIfNoArgKey();

		/**
		 * The meta object literal for the '<em><b>Get Cmd Part Delimiter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_CMD_PART_DELIMITER = eINSTANCE.getTool__GetCmdPartDelimiter();

		/**
		 * The meta object literal for the '<em><b>Get Interpreter Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_INTERPRETER_PARAMS = eINSTANCE.getTool__GetInterpreterParams();

		/**
		 * The meta object literal for the '<em><b>Get Exe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_EXE = eINSTANCE.getTool__GetExe();

		/**
		 * The meta object literal for the '<em><b>Get Module Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_MODULE_PARAMS = eINSTANCE.getTool__GetModuleParams();

		/**
		 * The meta object literal for the '<em><b>Get Interpreter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___GET_INTERPRETER = eINSTANCE.getTool__GetInterpreter();

		/**
		 * The meta object literal for the '<em><b>Can Provide Multiple Inputs For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___CAN_PROVIDE_MULTIPLE_INPUTS_FOR__DATAPORT = eINSTANCE.getTool__CanProvideMultipleInputsFor__DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Provide Multiple Instances For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___CAN_PROVIDE_MULTIPLE_INSTANCES_FOR__DATAPORT = eINSTANCE.getTool__CanProvideMultipleInstancesFor__DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Provide Multiple Instances Per Dataport For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___CAN_PROVIDE_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__DATAPORT = eINSTANCE.getTool__CanProvideMultipleInstancesPerDataportFor__DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Process Multiple Inputs For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___CAN_PROCESS_MULTIPLE_INPUTS_FOR__DATAPORT = eINSTANCE.getTool__CanProcessMultipleInputsFor__DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Process Multiple Instances Per Dataport For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___CAN_PROCESS_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__DATAPORT = eINSTANCE.getTool__CanProcessMultipleInstancesPerDataportFor__DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Process Multiple Instances For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___CAN_PROCESS_MULTIPLE_INSTANCES_FOR__DATAPORT = eINSTANCE.getTool__CanProcessMultipleInstancesFor__DataPort();

		/**
		 * The meta object literal for the '<em><b>Resolve Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___RESOLVE_PATH = eINSTANCE.getTool__ResolvePath();

		/**
		 * The meta object literal for the '<em><b>Assume Param Positional</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___ASSUME_PARAM_POSITIONAL = eINSTANCE.getTool__AssumeParamPositional();

		/**
		 * The meta object literal for the '<em><b>Create Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___CREATE_DATA__INOUTPARAMETER_EMAP_EMAP = eINSTANCE.getTool__CreateData__InOutParameter_EMap_EMap();

		/**
		 * The meta object literal for the '<em><b>Create Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___CREATE_DATA__RESOLVEDPARAM_EMAP_EMAP = eINSTANCE.getTool__CreateData__ResolvedParam_EMap_EMap();

		/**
		 * The meta object literal for the '<em><b>Init Log Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___INIT_LOG_MESSAGE = eINSTANCE.getTool__InitLogMessage();

		/**
		 * The meta object literal for the '<em><b>Is Allowed Conversion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL___IS_ALLOWED_CONVERSION__DATAPORT_STRING_STRING = eINSTANCE.getTool__IsAllowedConversion__DataPort_String_String();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.CommandImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Executable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__EXECUTABLE = eINSTANCE.getCommand_Executable();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__LOGGER = eINSTANCE.getCommand_Logger();

		/**
		 * The meta object literal for the '<em><b>Resolved Params</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__RESOLVED_PARAMS = eINSTANCE.getCommand_ResolvedParams();

		/**
		 * The meta object literal for the '<em><b>Get Positional Parameter Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___GET_POSITIONAL_PARAMETER_NAMES = eINSTANCE.getCommand__GetPositionalParameterNames();

		/**
		 * The meta object literal for the '<em><b>Get Optional Parameter Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___GET_OPTIONAL_PARAMETER_NAMES = eINSTANCE.getCommand__GetOptionalParameterNames();

		/**
		 * The meta object literal for the '<em><b>Get Interperter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___GET_INTERPERTER = eINSTANCE.getCommand__GetInterperter();

		/**
		 * The meta object literal for the '<em><b>Get Exe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___GET_EXE = eINSTANCE.getCommand__GetExe();

		/**
		 * The meta object literal for the '<em><b>Resolve Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___RESOLVE_PARAMETER__STRING_ELIST = eINSTANCE.getCommand__ResolveParameter__String_EList();

		/**
		 * The meta object literal for the '<em><b>Get Data Param For Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___GET_DATA_PARAM_FOR_DATA_PORT__DATAPORT_BOOLEAN = eINSTANCE.getCommand__GetDataParamForDataPort__DataPort_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Data Param For Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___GET_DATA_PARAM_FOR_DATA_PORT__DATAPORT_BOOLEAN_INT = eINSTANCE.getCommand__GetDataParamForDataPort__DataPort_boolean_int();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.RuleImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Cmd Line</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CMD_LINE = eINSTANCE.getRule_CmdLine();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__DEPENDENCIES = eINSTANCE.getRule_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TARGETS = eINSTANCE.getRule_Targets();

		/**
		 * The meta object literal for the '<em><b>Read From Pipe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__READ_FROM_PIPE = eINSTANCE.getRule_ReadFromPipe();

		/**
		 * The meta object literal for the '<em><b>Write To Pipe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__WRITE_TO_PIPE = eINSTANCE.getRule_WriteToPipe();

		/**
		 * The meta object literal for the '<em><b>Input Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__INPUT_PARAMS = eINSTANCE.getRule_InputParams();

		/**
		 * The meta object literal for the '<em><b>Output Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__OUTPUT_PARAMS = eINSTANCE.getRule_OutputParams();

		/**
		 * The meta object literal for the '<em><b>Opt Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__OPT_PARAMS = eINSTANCE.getRule_OptParams();

		/**
		 * The meta object literal for the '<em><b>Pos Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__POS_PARAMS = eINSTANCE.getRule_PosParams();

		/**
		 * The meta object literal for the '<em><b>Exe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__EXE = eINSTANCE.getRule_Exe();

		/**
		 * The meta object literal for the '<em><b>Exe Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__EXE_PARAMS = eINSTANCE.getRule_ExeParams();

		/**
		 * The meta object literal for the '<em><b>Interpreter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__INTERPRETER = eINSTANCE.getRule_Interpreter();

		/**
		 * The meta object literal for the '<em><b>Interpreter Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__INTERPRETER_PARAMS = eINSTANCE.getRule_InterpreterParams();

		/**
		 * The meta object literal for the '<em><b>Resolve Command Line Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE___RESOLVE_COMMAND_LINE_PARTS = eINSTANCE.getRule__ResolveCommandLineParts();

		/**
		 * The meta object literal for the '<em><b>Create Command Line</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE___CREATE_COMMAND_LINE = eINSTANCE.getRule__CreateCommandLine();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TASK = eINSTANCE.getRule_Task();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.ConditionImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.ResolvedParamImpl <em>Resolved Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.ResolvedParamImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getResolvedParam()
		 * @generated
		 */
		EClass RESOLVED_PARAM = eINSTANCE.getResolvedParam();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_PARAM__PARAMETER = eINSTANCE.getResolvedParam_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVED_PARAM__VALUE = eINSTANCE.getResolvedParam_Value();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVED_PARAM__HANDLE = eINSTANCE.getResolvedParam_Handle();

		/**
		 * The meta object literal for the '<em><b>Data Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_PARAM__DATA_FORMAT = eINSTANCE.getResolvedParam_DataFormat();

		/**
		 * The meta object literal for the '<em><b>Conditional Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVED_PARAM__CONDITIONAL_PARAM = eINSTANCE.getResolvedParam_ConditionalParam();

		/**
		 * The meta object literal for the '<em><b>Child Params</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_PARAM__CHILD_PARAMS = eINSTANCE.getResolvedParam_ChildParams();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_PARAM__CONDITIONS = eINSTANCE.getResolvedParam_Conditions();

		/**
		 * The meta object literal for the '<em><b>Pipe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVED_PARAM__PIPE = eINSTANCE.getResolvedParam_Pipe();

		/**
		 * The meta object literal for the '<em><b>Condition Resolving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVED_PARAM__CONDITION_RESOLVING = eINSTANCE.getResolvedParam_ConditionResolving();

		/**
		 * The meta object literal for the '<em><b>Generate Command String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___GENERATE_COMMAND_STRING__EMAP_PARAMETER = eINSTANCE.getResolvedParam__GenerateCommandString__EMap_Parameter();

		/**
		 * The meta object literal for the '<em><b>Get Arg Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___GET_ARG_VALUE = eINSTANCE.getResolvedParam__GetArgValue();

		/**
		 * The meta object literal for the '<em><b>Resolve Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___RESOLVE_NAME = eINSTANCE.getResolvedParam__ResolveName();

		/**
		 * The meta object literal for the '<em><b>Get Effective Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___GET_EFFECTIVE_PARAMETERS__ELIST_EMAP = eINSTANCE.getResolvedParam__GetEffectiveParameters__EList_EMap();

		/**
		 * The meta object literal for the '<em><b>Get Supported Handles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___GET_SUPPORTED_HANDLES = eINSTANCE.getResolvedParam__GetSupportedHandles();

		/**
		 * The meta object literal for the '<em><b>Deep Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___DEEP_COPY = eINSTANCE.getResolvedParam__DeepCopy();

		/**
		 * The meta object literal for the '<em><b>Resolve Pipe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___RESOLVE_PIPE__STRING = eINSTANCE.getResolvedParam__ResolvePipe__String();

		/**
		 * The meta object literal for the '<em><b>Resolve Condititional Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___RESOLVE_CONDITITIONAL_PARAM__STRING_STRING = eINSTANCE.getResolvedParam__ResolveCondititionalParam__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Child Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___GET_CHILD_PARAM__STRING_STRING = eINSTANCE.getResolvedParam__GetChildParam__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Condition Resolving Child Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLVED_PARAM___GET_CONDITION_RESOLVING_CHILD_PARAM__STRING_BOOLEAN = eINSTANCE.getResolvedParam__GetConditionResolvingChildParam__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVED_PARAM__RESOLVED = eINSTANCE.getResolvedParam_Resolved();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.ParameterImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LOGGER = eINSTANCE.getParameter_Logger();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPTIONAL = eINSTANCE.getParameter_Optional();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MULTIPLE = eINSTANCE.getParameter_Multiple();

		/**
		 * The meta object literal for the '<em><b>Multiple Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MULTIPLE_VALUE = eINSTANCE.getParameter_MultipleValue();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE_TYPE = eINSTANCE.getParameter_ValueType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PREFIX = eINSTANCE.getParameter_Prefix();

		/**
		 * The meta object literal for the '<em><b>Option Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPTION_KEY = eINSTANCE.getParameter_OptionKey();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DELIMITER = eINSTANCE.getParameter_Delimiter();

		/**
		 * The meta object literal for the '<em><b>Value Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE_DELIMITER = eINSTANCE.getParameter_ValueDelimiter();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__KEYS = eINSTANCE.getParameter_Keys();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAMED = eINSTANCE.getParameter_Named();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LABEL = eINSTANCE.getParameter_Label();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__HELP = eINSTANCE.getParameter_Help();

		/**
		 * The meta object literal for the '<em><b>Min Occ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MIN_OCC = eINSTANCE.getParameter_MinOcc();

		/**
		 * The meta object literal for the '<em><b>Max Occ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MAX_OCC = eINSTANCE.getParameter_MaxOcc();

		/**
		 * The meta object literal for the '<em><b>Advanced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ADVANCED = eINSTANCE.getParameter_Advanced();

		/**
		 * The meta object literal for the '<em><b>Option Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OPTION_VALUES = eINSTANCE.getParameter_OptionValues();

		/**
		 * The meta object literal for the '<em><b>Positional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__POSITIONAL = eINSTANCE.getParameter_Positional();

		/**
		 * The meta object literal for the '<em><b>Grouping</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__GROUPING = eINSTANCE.getParameter_Grouping();

		/**
		 * The meta object literal for the '<em><b>Data Deprecated</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DATA_DEPRECATED = eINSTANCE.getParameter_DataDeprecated();

		/**
		 * The meta object literal for the '<em><b>Fixed Arg Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__FIXED_ARG_VALUE = eINSTANCE.getParameter_FixedArgValue();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARENT = eINSTANCE.getParameter_Parent();

		/**
		 * The meta object literal for the '<em><b>Handles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__HANDLES = eINSTANCE.getParameter_Handles();

		/**
		 * The meta object literal for the '<em><b>General Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__GENERAL_VALUE = eINSTANCE.getParameter_GeneralValue();

		/**
		 * The meta object literal for the '<em><b>Data Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DATA_PARAM = eINSTANCE.getParameter_DataParam();

		/**
		 * The meta object literal for the '<em><b>Cmd Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CMD_PART = eINSTANCE.getParameter_CmdPart();

		/**
		 * The meta object literal for the '<em><b>Multiple Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MULTIPLE_INSTANCES = eINSTANCE.getParameter_MultipleInstances();

		/**
		 * The meta object literal for the '<em><b>Multiple Instances Per Dataport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MULTIPLE_INSTANCES_PER_DATAPORT = eINSTANCE.getParameter_MultipleInstancesPerDataport();

		/**
		 * The meta object literal for the '<em><b>Output Arg Value For Boolean Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OUTPUT_ARG_VALUE_FOR_BOOLEAN_PARAM = eINSTANCE.getParameter_OutputArgValueForBooleanParam();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__HIDDEN = eINSTANCE.getParameter_Hidden();

		/**
		 * The meta object literal for the '<em><b>Output Default Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OUTPUT_DEFAULT_PARAM = eINSTANCE.getParameter_OutputDefaultParam();

		/**
		 * The meta object literal for the '<em><b>Condition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CONDITION_TYPE = eINSTANCE.getParameter_ConditionType();

		/**
		 * The meta object literal for the '<em><b>Override Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OVERRIDE_ATTRIBUTES = eINSTANCE.getParameter_OverrideAttributes();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ABSTRACT = eINSTANCE.getParameter_Abstract();

		/**
		 * The meta object literal for the '<em><b>Tool Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TOOL_REFS = eINSTANCE.getParameter_ToolRefs();

		/**
		 * The meta object literal for the '<em><b>Prefer Pkg Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PREFER_PKG_PARAM = eINSTANCE.getParameter_PreferPkgParam();

		/**
		 * The meta object literal for the '<em><b>Get Arg Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_ARG_KEY__STRING_KEY = eINSTANCE.getParameter__GetArgKey__String_Key();

		/**
		 * The meta object literal for the '<em><b>Get Arg Delimiter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_ARG_DELIMITER__STRING = eINSTANCE.getParameter__GetArgDelimiter__String();

		/**
		 * The meta object literal for the '<em><b>Get Arg Value Delimiter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_ARG_VALUE_DELIMITER__STRING = eINSTANCE.getParameter__GetArgValueDelimiter__String();

		/**
		 * The meta object literal for the '<em><b>Get Prefix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_PREFIX__STRING = eINSTANCE.getParameter__GetPrefix__String();

		/**
		 * The meta object literal for the '<em><b>Get Parameter For Analysis Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_PARAMETER_FOR_ANALYSIS_TYPE__ELIST = eINSTANCE.getParameter__GetParameterForAnalysisType__EList();

		/**
		 * The meta object literal for the '<em><b>Is Analysis Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_ANALYSIS_TYPE = eINSTANCE.getParameter__IsAnalysisType();

		/**
		 * The meta object literal for the '<em><b>Get Supported Handles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_SUPPORTED_HANDLES__BOOLEAN = eINSTANCE.getParameter__GetSupportedHandles__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effective Parent Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_EFFECTIVE_PARENT_PARAMETER__BOOLEAN = eINSTANCE.getParameter__GetEffectiveParentParameter__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Merged Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_MERGED_PARAMETER__PARAMETER_BOOLEAN = eINSTANCE.getParameter__GetMergedParameter__Parameter_boolean();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___MATCHES__PARAMETER = eINSTANCE.getParameter__Matches__Parameter();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___MATCHES__INOUTPARAMETER = eINSTANCE.getParameter__Matches__InOutParameter();

		/**
		 * The meta object literal for the '<em><b>Generate Command String URI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GENERATE_COMMAND_STRING_URI__EMAP_ELIST_PARAMETER = eINSTANCE.getParameter__GenerateCommandStringURI__EMap_EList_Parameter();

		/**
		 * The meta object literal for the '<em><b>Generate Command String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GENERATE_COMMAND_STRING__EMAP_ELIST_PARAMETER = eINSTANCE.getParameter__GenerateCommandString__EMap_EList_Parameter();

		/**
		 * The meta object literal for the '<em><b>Generate Command String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GENERATE_COMMAND_STRING__EMAP_OBJECT_PARAMETER = eINSTANCE.getParameter__GenerateCommandString__EMap_Object_Parameter();

		/**
		 * The meta object literal for the '<em><b>Generate Command String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GENERATE_COMMAND_STRING__EMAP_OPTIONVALUE_PARAMETER = eINSTANCE.getParameter__GenerateCommandString__EMap_OptionValue_Parameter();

		/**
		 * The meta object literal for the '<em><b>Generate Command String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GENERATE_COMMAND_STRING__EMAP_URI_PARAMETER = eINSTANCE.getParameter__GenerateCommandString__EMap_URI_Parameter();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_OPTIONAL__BOOLEAN = eINSTANCE.getParameter__IsOptional__Boolean();

		/**
		 * The meta object literal for the '<em><b>Is Multiple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_MULTIPLE__BOOLEAN = eINSTANCE.getParameter__IsMultiple__Boolean();

		/**
		 * The meta object literal for the '<em><b>Is Multiple Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_MULTIPLE_INSTANCES__BOOLEAN = eINSTANCE.getParameter__IsMultipleInstances__Boolean();

		/**
		 * The meta object literal for the '<em><b>Is Multiple Instances Per Dataport</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_MULTIPLE_INSTANCES_PER_DATAPORT__BOOLEAN = eINSTANCE.getParameter__IsMultipleInstancesPerDataport__Boolean();

		/**
		 * The meta object literal for the '<em><b>Is Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_NAMED__BOOLEAN = eINSTANCE.getParameter__IsNamed__Boolean();

		/**
		 * The meta object literal for the '<em><b>Is Positional</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_POSITIONAL__BOOLEAN = eINSTANCE.getParameter__IsPositional__Boolean();

		/**
		 * The meta object literal for the '<em><b>Is Fixed Arg Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_FIXED_ARG_VALUE__BOOLEAN = eINSTANCE.getParameter__IsFixedArgValue__Boolean();

		/**
		 * The meta object literal for the '<em><b>Is Multiple Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_MULTIPLE_VALUE__BOOLEAN = eINSTANCE.getParameter__IsMultipleValue__Boolean();

		/**
		 * The meta object literal for the '<em><b>Should Output Arg Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___SHOULD_OUTPUT_ARG_VALUE__BOOLEAN = eINSTANCE.getParameter__ShouldOutputArgValue__Boolean();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___MERGE__PARAMETER = eINSTANCE.getParameter__Merge__Parameter();

		/**
		 * The meta object literal for the '<em><b>Get Unique String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_UNIQUE_STRING = eINSTANCE.getParameter__GetUniqueString();

		/**
		 * The meta object literal for the '<em><b>Resolve Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___RESOLVE_NAME = eINSTANCE.getParameter__ResolveName();

		/**
		 * The meta object literal for the '<em><b>Should Output Default Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___SHOULD_OUTPUT_DEFAULT_PARAM__BOOLEAN = eINSTANCE.getParameter__ShouldOutputDefaultParam__Boolean();

		/**
		 * The meta object literal for the '<em><b>Is Meta Data Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_META_DATA_PARAM = eINSTANCE.getParameter__IsMetaDataParam();

		/**
		 * The meta object literal for the '<em><b>Is Data Specifying Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_DATA_SPECIFYING_PARAM = eINSTANCE.getParameter__IsDataSpecifyingParam();

		/**
		 * The meta object literal for the '<em><b>Is Boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_BOOLEAN = eINSTANCE.getParameter__IsBoolean();

		/**
		 * The meta object literal for the '<em><b>Is Preferred</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_PREFERRED = eINSTANCE.getParameter__IsPreferred();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.InOutParameterImpl <em>In Out Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.InOutParameterImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getInOutParameter()
		 * @generated
		 */
		EClass IN_OUT_PARAMETER = eINSTANCE.getInOutParameter();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_OUT_PARAMETER__OUTPUT = eINSTANCE.getInOutParameter_Output();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_OUT_PARAMETER__EXTENSION = eINSTANCE.getInOutParameter_Extension();

		/**
		 * The meta object literal for the '<em><b>Filename Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_OUT_PARAMETER__FILENAME_CREATION = eINSTANCE.getInOutParameter_FilenameCreation();

		/**
		 * The meta object literal for the '<em><b>Formats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_OUT_PARAMETER__FORMATS = eINSTANCE.getInOutParameter_Formats();

		/**
		 * The meta object literal for the '<em><b>Data Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_OUT_PARAMETER__DATA_PORT = eINSTANCE.getInOutParameter_DataPort();

		/**
		 * The meta object literal for the '<em><b>Convert Grouping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_OUT_PARAMETER__CONVERT_GROUPING = eINSTANCE.getInOutParameter_ConvertGrouping();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IN_OUT_PARAMETER___MATCHES__INOUTPARAMETER = eINSTANCE.getInOutParameter__Matches__InOutParameter();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IN_OUT_PARAMETER___MATCHES__PARAMETER = eINSTANCE.getInOutParameter__Matches__Parameter();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IN_OUT_PARAMETER___MERGE__PARAMETER = eINSTANCE.getInOutParameter__Merge__Parameter();

		/**
		 * The meta object literal for the '<em><b>Omit Extension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IN_OUT_PARAMETER___OMIT_EXTENSION = eINSTANCE.getInOutParameter__OmitExtension();

		/**
		 * The meta object literal for the '<em><b>Is Allowed Conversion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IN_OUT_PARAMETER___IS_ALLOWED_CONVERSION__STRING_STRING = eINSTANCE.getInOutParameter__IsAllowedConversion__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Convert Grouping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IN_OUT_PARAMETER___GET_CONVERT_GROUPING__STRING = eINSTANCE.getInOutParameter__GetConvertGrouping__String();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.PackageImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Resolved Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__RESOLVED_PARAMS = eINSTANCE.getPackage_ResolvedParams();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__ID = eINSTANCE.getPackage_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

		/**
		 * The meta object literal for the '<em><b>Resolve Uri Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__RESOLVE_URI_MAP = eINSTANCE.getPackage_ResolveUriMap();

		/**
		 * The meta object literal for the '<em><b>Get Interpreter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___GET_INTERPRETER = eINSTANCE.getPackage__GetInterpreter();

		/**
		 * The meta object literal for the '<em><b>Get Exe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___GET_EXE = eINSTANCE.getPackage__GetExe();

		/**
		 * The meta object literal for the '<em><b>Get Interpreter Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___GET_INTERPRETER_PARAMS = eINSTANCE.getPackage__GetInterpreterParams();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.KeyImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__VALUE = eINSTANCE.getKey_Value();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__DELIMITER = eINSTANCE.getKey_Delimiter();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__PREFIX = eINSTANCE.getKey_Prefix();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__TYPE = eINSTANCE.getKey_Type();

		/**
		 * The meta object literal for the '<em><b>Resolve Arg Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY___RESOLVE_ARG_KEY__STRING = eINSTANCE.getKey__ResolveArgKey__String();

		/**
		 * The meta object literal for the '<em><b>Resolve Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY___RESOLVE_NAME = eINSTANCE.getKey__ResolveName();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.RequirementImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VERSION = eINSTANCE.getRequirement_Version();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VALUE = eINSTANCE.getRequirement_Value();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.DocumentPropertiesImpl <em>Document Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.DocumentPropertiesImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getDocumentProperties()
		 * @generated
		 */
		EClass DOCUMENT_PROPERTIES = eINSTANCE.getDocumentProperties();

		/**
		 * The meta object literal for the '<em><b>Source URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_PROPERTIES__SOURCE_URI = eINSTANCE.getDocumentProperties_SourceURI();

		/**
		 * The meta object literal for the '<em><b>From Jar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_PROPERTIES__FROM_JAR = eINSTANCE.getDocumentProperties_FromJar();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.OptionValueImpl <em>Option Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.OptionValueImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getOptionValue()
		 * @generated
		 */
		EClass OPTION_VALUE = eINSTANCE.getOptionValue();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_VALUE__CONDITION = eINSTANCE.getOptionValue_Condition();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_VALUE__HELP = eINSTANCE.getOptionValue_Help();

		/**
		 * The meta object literal for the '<em><b>Exe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_VALUE__EXE = eINSTANCE.getOptionValue_Exe();

		/**
		 * The meta object literal for the '<em><b>Resolve Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_VALUE___RESOLVE_VALUE = eINSTANCE.getOptionValue__ResolveValue();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.BaseCommandImpl <em>Base Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.BaseCommandImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getBaseCommand()
		 * @generated
		 */
		EClass BASE_COMMAND = eINSTANCE.getBaseCommand();

		/**
		 * The meta object literal for the '<em><b>Command Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_COMMAND__COMMAND_PATTERN = eINSTANCE.getBaseCommand_CommandPattern();

		/**
		 * The meta object literal for the '<em><b>Template Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_COMMAND__TEMPLATE_PARAMS = eINSTANCE.getBaseCommand_TemplateParams();

		/**
		 * The meta object literal for the '<em><b>Assume Data Param Positional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL = eINSTANCE.getBaseCommand_AssumeDataParamPositional();

		/**
		 * The meta object literal for the '<em><b>Assume Param Positional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_COMMAND__ASSUME_PARAM_POSITIONAL = eINSTANCE.getBaseCommand_AssumeParamPositional();

		/**
		 * The meta object literal for the '<em><b>Cmd Part Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_COMMAND__CMD_PART_DELIMITER = eINSTANCE.getBaseCommand_CmdPartDelimiter();

	}

} //ToolPackage
