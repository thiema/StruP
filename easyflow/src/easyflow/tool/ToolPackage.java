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
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS_FEATURE_COUNT = 4;

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
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 15;

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
	 * The feature id for the '<em><b>Multiple Instances Per Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MULTIPLE_INSTANCES_PER_INPUT = ITOOL_ELEMENT_FEATURE_COUNT + 31;

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
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 39;

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
	 * The feature id for the '<em><b>Multiple Instances Per Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__MULTIPLE_INSTANCES_PER_INPUT = PARAMETER__MULTIPLE_INSTANCES_PER_INPUT;

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
	 * The number of structural features of the '<em>In Out Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Pipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM__PIPE = ITOOL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Resolved Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_PARAM_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 10;

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
	 * Returns the meta object for class '{@link easyflow.tool.IRule <em>IRule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRule</em>'.
	 * @see easyflow.tool.IRule
	 * @generated
	 */
	EClass getIRule();

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
	 * Returns the meta object for class '{@link easyflow.tool.IToolElement <em>ITool Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITool Element</em>'.
	 * @see easyflow.tool.IToolElement
	 * @generated
	 */
	EClass getIToolElement();

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
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getMultipleInstancesPerInput <em>Multiple Instances Per Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Instances Per Input</em>'.
	 * @see easyflow.tool.Parameter#getMultipleInstancesPerInput()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_MultipleInstancesPerInput();

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
		 * The meta object literal for the '{@link easyflow.tool.IToolElement <em>ITool Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.IToolElement
		 * @see easyflow.tool.impl.ToolPackageImpl#getIToolElement()
		 * @generated
		 */
		EClass ITOOL_ELEMENT = eINSTANCE.getIToolElement();

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
		 * The meta object literal for the '<em><b>Multiple Instances Per Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MULTIPLE_INSTANCES_PER_INPUT = eINSTANCE.getParameter_MultipleInstancesPerInput();

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
