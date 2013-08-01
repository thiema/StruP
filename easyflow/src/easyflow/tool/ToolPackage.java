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
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITIONS_FEATURE_COUNT = 3;


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
	 * The meta object id for the '{@link easyflow.tool.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.ToolImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 2;

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
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 8;

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
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTIONAL = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REPEATABLE = ITOOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Repeatable Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REPEATABLE_VALUES = ITOOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUES = ITOOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE_TYPE = ITOOL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = ITOOL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SEPARATOR = ITOOL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.PackageImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 8;

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
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ITOOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.DataPortImpl <em>Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.DataPortImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 9;

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
	 * The feature id for the '<em><b>Data Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__DATA_FORMAT = 2;

	/**
	 * The number of structural features of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link easyflow.tool.impl.DataFormatImpl <em>Data Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.tool.impl.DataFormatImpl
	 * @see easyflow.tool.impl.ToolPackageImpl#getDataFormat()
	 * @generated
	 */
	int DATA_FORMAT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT_FEATURE_COUNT = 1;


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
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isRepeatable <em>Repeatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeatable</em>'.
	 * @see easyflow.tool.Parameter#isRepeatable()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Repeatable();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#isRepeatableValues <em>Repeatable Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeatable Values</em>'.
	 * @see easyflow.tool.Parameter#isRepeatableValues()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_RepeatableValues();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.tool.Parameter#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see easyflow.tool.Parameter#getValues()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Values();

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
	 * Returns the meta object for the attribute '{@link easyflow.tool.Parameter#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see easyflow.tool.Parameter#getSeparator()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Separator();

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
	 * Returns the meta object for class '{@link easyflow.tool.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port</em>'.
	 * @see easyflow.tool.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.tool.DataPort#getGroupingCriteria <em>Grouping Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouping Criteria</em>'.
	 * @see easyflow.tool.DataPort#getGroupingCriteria()
	 * @see #getDataPort()
	 * @generated
	 */
	EReference getDataPort_GroupingCriteria();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.tool.DataPort#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see easyflow.tool.DataPort#getCardinality()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link easyflow.tool.DataPort#getDataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Format</em>'.
	 * @see easyflow.tool.DataPort#getDataFormat()
	 * @see #getDataPort()
	 * @generated
	 */
	EReference getDataPort_DataFormat();

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
	 * Returns the meta object for the attribute '{@link easyflow.tool.DataFormat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.tool.DataFormat#getName()
	 * @see #getDataFormat()
	 * @generated
	 */
	EAttribute getDataFormat_Name();

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
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPTIONAL = eINSTANCE.getParameter_Optional();

		/**
		 * The meta object literal for the '<em><b>Repeatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REPEATABLE = eINSTANCE.getParameter_Repeatable();

		/**
		 * The meta object literal for the '<em><b>Repeatable Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REPEATABLE_VALUES = eINSTANCE.getParameter_RepeatableValues();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUES = eINSTANCE.getParameter_Values();

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
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__SEPARATOR = eINSTANCE.getParameter_Separator();

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
		 * The meta object literal for the '{@link easyflow.tool.impl.DataPortImpl <em>Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.tool.impl.DataPortImpl
		 * @see easyflow.tool.impl.ToolPackageImpl#getDataPort()
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
		 * The meta object literal for the '<em><b>Data Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PORT__DATA_FORMAT = eINSTANCE.getDataPort_DataFormat();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORMAT__NAME = eINSTANCE.getDataFormat_Name();

	}

} //ToolPackage
