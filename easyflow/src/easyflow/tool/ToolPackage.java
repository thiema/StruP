/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

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
	 * The meta object id for the '{@link easyflow.tool.impl.ToolSchemataImpl <em>Schemata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.ToolSchemataImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getToolSchemata()
	 * @generated
	 */
	int TOOL_SCHEMATA = 0;

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
	int TOOL_DEFINITIONS = 1;

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
	int ITOOL_ELEMENT = 2;

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
	int DEFAULT_TOOL_ELEMENT = 3;

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
	int TOOL = 4;

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
	 * The feature id for the '<em><b>Interpreter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__INTERPRETER = ITOOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__COMMAND = ITOOL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PACKAGE = ITOOL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__REQUIREMENTS = ITOOL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Executables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__EXECUTABLES = ITOOL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Data</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DATA = ITOOL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.InterpreterImpl <em>Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.InterpreterImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getInterpreter()
	 * @generated
	 */
	int INTERPRETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETER__NAME = ITOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETER__DESCRIPTION = ITOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETER__EXE = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETER__LOGGER = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETER_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.CommandImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 6;

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
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__EXECUTABLE = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__LOGGER = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PARAMETERS = ITOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.ParameterImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = ITOOL_ELEMENT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUES = ITOOL_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__POSITIONAL = ITOOL_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GROUPING = ITOOL_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA = ITOOL_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Fixed Arg Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FIXED_ARG_VALUE = ITOOL_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.InOutParameterImpl <em>In Out Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.InOutParameterImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getInOutParameter()
	 * @generated
	 */
	int IN_OUT_PARAMETER = 8;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__VALUE = PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__TYPE = PARAMETER__TYPE;

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
	 * The feature id for the '<em><b>Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__VALUES = PARAMETER__VALUES;

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
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__DATA = PARAMETER__DATA;

	/**
	 * The feature id for the '<em><b>Fixed Arg Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__FIXED_ARG_VALUE = PARAMETER__FIXED_ARG_VALUE;

	/**
	 * The feature id for the '<em><b>Handles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__HANDLES = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER__FORMATS = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Out Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.PackageImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 9;

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
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARAMETERS = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = ITOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.DataImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getData()
	 * @generated
	 */
	int DATA = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = DEFAULT_TOOL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = DEFAULT_TOOL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LABEL = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PORT = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OUTPUT = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__FORMAT = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.DataFormatImpl <em>Data Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.DataFormatImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getDataFormat()
	 * @generated
	 */
	int DATA_FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__NAME = DEFAULT_TOOL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__DESCRIPTION = DEFAULT_TOOL_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT_FEATURE_COUNT = DEFAULT_TOOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.KeyImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 12;

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
	 * The meta object id for the '{@link easyflow.tool.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.RequirementImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 13;

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
	 * The meta object id for the '{@link easyflow.tool.impl.DocumentPropertiesImpl <em>Document Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.DocumentPropertiesImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getDocumentProperties()
	 * @generated
	 */
	int DOCUMENT_PROPERTIES = 14;

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
	 * Returns the meta object for the reference '{@link easyflow.tool.Tool#getInterpreter <em>Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interpreter</em>'.
	 * @see easyflow.tool.Tool#getInterpreter()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Interpreter();

	/**
	 * Returns the meta object for the containment reference '{@link easyflow.tool.Tool#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see easyflow.tool.Tool#getCommand()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Command();

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
	 * Returns the meta object for class '{@link easyflow.tool.Interpreter <em>Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpreter</em>'.
	 * @see easyflow.tool.Interpreter
	 * @generated
	 */
	EClass getInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Interpreter#getExe <em>Exe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exe</em>'.
	 * @see easyflow.tool.Interpreter#getExe()
	 * @see #getInterpreter()
	 * @generated
	 */
	EAttribute getInterpreter_Exe();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Interpreter#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.tool.Interpreter#getLogger()
	 * @see #getInterpreter()
	 * @generated
	 */
	EAttribute getInterpreter_Logger();

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
	 * Returns the meta object for the map '{@link easyflow.tool.Command#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see easyflow.tool.Command#getParameters()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Parameters();

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
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see easyflow.tool.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

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
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see easyflow.tool.Parameter#isOptional()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Optional();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see easyflow.tool.Parameter#isMultiple()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isMultipleValue <em>Multiple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Value</em>'.
	 * @see easyflow.tool.Parameter#isMultipleValue()
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
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isNamed <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Named</em>'.
	 * @see easyflow.tool.Parameter#isNamed()
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
	 * Returns the meta object for the map '{@link easyflow.tool.Parameter#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Values</em>'.
	 * @see easyflow.tool.Parameter#getValues()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Values();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isPositional <em>Positional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positional</em>'.
	 * @see easyflow.tool.Parameter#isPositional()
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
	 * Returns the meta object for the reference list '{@link easyflow.tool.Parameter#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see easyflow.tool.Parameter#getData()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Data();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isFixedArgValue <em>Fixed Arg Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Arg Value</em>'.
	 * @see easyflow.tool.Parameter#isFixedArgValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_FixedArgValue();

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
	 * Returns the meta object for the attribute list '{@link easyflow.tool.InOutParameter#getHandles <em>Handles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Handles</em>'.
	 * @see easyflow.tool.InOutParameter#getHandles()
	 * @see #getInOutParameter()
	 * @generated
	 */
	EAttribute getInOutParameter_Handles();

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
	 * Returns the meta object for class '{@link easyflow.tool.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see easyflow.tool.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the map '{@link easyflow.tool.Package#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see easyflow.tool.Package#getParameters()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Parameters();

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
	 * Returns the meta object for class '{@link easyflow.tool.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see easyflow.tool.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Data#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see easyflow.tool.Data#getLabel()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Label();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.Data#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see easyflow.tool.Data#getPort()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Port();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Data#isOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see easyflow.tool.Data#isOutput()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Output();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Data#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see easyflow.tool.Data#getFormat()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Format();

	/**
	 * Returns the meta object for class '{@link easyflow.tool.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Format</em>'.
	 * @see easyflow.tool.DataFormat
	 * @generated
	 */
	EClass getDataFormat();

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
		 * The meta object literal for the '<em><b>Interpreter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__INTERPRETER = eINSTANCE.getTool_Interpreter();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__COMMAND = eINSTANCE.getTool_Command();

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
		 * The meta object literal for the '{@link easyflow.tool.impl.InterpreterImpl <em>Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.InterpreterImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getInterpreter()
		 * @generated
		 */
		EClass INTERPRETER = eINSTANCE.getInterpreter();

		/**
		 * The meta object literal for the '<em><b>Exe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPRETER__EXE = eINSTANCE.getInterpreter_Exe();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPRETER__LOGGER = eINSTANCE.getInterpreter_Logger();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__PARAMETERS = eINSTANCE.getCommand_Parameters();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

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
		 * The meta object literal for the '<em><b>Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUES = eINSTANCE.getParameter_Values();

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
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DATA = eINSTANCE.getParameter_Data();

		/**
		 * The meta object literal for the '<em><b>Fixed Arg Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__FIXED_ARG_VALUE = eINSTANCE.getParameter_FixedArgValue();

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
		 * The meta object literal for the '<em><b>Handles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_OUT_PARAMETER__HANDLES = eINSTANCE.getInOutParameter_Handles();

		/**
		 * The meta object literal for the '<em><b>Formats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_OUT_PARAMETER__FORMATS = eINSTANCE.getInOutParameter_Formats();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PARAMETERS = eINSTANCE.getPackage_Parameters();

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
		 * The meta object literal for the '{@link easyflow.tool.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.DataImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getData()
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
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__FORMAT = eINSTANCE.getData_Format();

		/**
		 * The meta object literal for the '{@link easyflow.tool.impl.DataFormatImpl <em>Data Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.DataFormatImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getDataFormat()
		 * @generated
		 */
		EClass DATA_FORMAT = eINSTANCE.getDataFormat();

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

	}

} //ToolPackage
