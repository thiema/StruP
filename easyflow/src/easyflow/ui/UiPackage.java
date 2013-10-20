/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui;

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
 * @see easyflow.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/ui/easyflow.core/1.0.0";

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
	UiPackage eINSTANCE = easyflow.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.ui.IProject <em>IProject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.ui.IProject
	 * @see easyflow.ui.impl.UiPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 0;

	/**
	 * The number of structural features of the '<em>IProject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.ui.impl.DefaultProjectImpl <em>Default Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.ui.impl.DefaultProjectImpl
	 * @see easyflow.ui.impl.UiPackageImpl#getDefaultProject()
	 * @generated
	 */
	int DEFAULT_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__WORKFLOWS = IPROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__META_DATA = IPROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__CONFIG_SOURCE = IPROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__BASE_URI = IPROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__LOGGER = IPROJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Graph Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__GRAPH_UTIL = IPROJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__FROM_JAR = IPROJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Json Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__JSON_OBJECT = IPROJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__TOOLS = IPROJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Default Config Source String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__DEFAULT_CONFIG_SOURCE_STRING = IPROJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tool Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__TOOL_DEFINITIONS = IPROJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__PACKAGES = IPROJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Default Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT_FEATURE_COUNT = IPROJECT_FEATURE_COUNT + 12;


	/**
	 * Returns the meta object for class '{@link easyflow.ui.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProject</em>'.
	 * @see easyflow.ui.IProject
	 * @generated
	 */
	EClass getIProject();

	/**
	 * Returns the meta object for class '{@link easyflow.ui.DefaultProject <em>Default Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Project</em>'.
	 * @see easyflow.ui.DefaultProject
	 * @generated
	 */
	EClass getDefaultProject();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.ui.DefaultProject#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflows</em>'.
	 * @see easyflow.ui.DefaultProject#getWorkflows()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_Workflows();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.ui.DefaultProject#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Data</em>'.
	 * @see easyflow.ui.DefaultProject#getMetaData()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getConfigSource <em>Config Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Source</em>'.
	 * @see easyflow.ui.DefaultProject#getConfigSource()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_ConfigSource();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getBaseURI <em>Base URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URI</em>'.
	 * @see easyflow.ui.DefaultProject#getBaseURI()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_BaseURI();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.ui.DefaultProject#getLogger()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_Logger();

	/**
	 * Returns the meta object for the reference '{@link easyflow.ui.DefaultProject#getGraphUtil <em>Graph Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph Util</em>'.
	 * @see easyflow.ui.DefaultProject#getGraphUtil()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_GraphUtil();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#isFromJar <em>From Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Jar</em>'.
	 * @see easyflow.ui.DefaultProject#isFromJar()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_FromJar();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getJsonObject <em>Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Object</em>'.
	 * @see easyflow.ui.DefaultProject#getJsonObject()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_JsonObject();

	/**
	 * Returns the meta object for the map '{@link easyflow.ui.DefaultProject#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Tools</em>'.
	 * @see easyflow.ui.DefaultProject#getTools()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_Tools();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getDefaultConfigSourceString <em>Default Config Source String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Config Source String</em>'.
	 * @see easyflow.ui.DefaultProject#getDefaultConfigSourceString()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_DefaultConfigSourceString();

	/**
	 * Returns the meta object for the reference '{@link easyflow.ui.DefaultProject#getToolDefinitions <em>Tool Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool Definitions</em>'.
	 * @see easyflow.ui.DefaultProject#getToolDefinitions()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_ToolDefinitions();

	/**
	 * Returns the meta object for the map '{@link easyflow.ui.DefaultProject#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Packages</em>'.
	 * @see easyflow.ui.DefaultProject#getPackages()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_Packages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link easyflow.ui.IProject <em>IProject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.ui.IProject
		 * @see easyflow.ui.impl.UiPackageImpl#getIProject()
		 * @generated
		 */
		EClass IPROJECT = eINSTANCE.getIProject();

		/**
		 * The meta object literal for the '{@link easyflow.ui.impl.DefaultProjectImpl <em>Default Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.ui.impl.DefaultProjectImpl
		 * @see easyflow.ui.impl.UiPackageImpl#getDefaultProject()
		 * @generated
		 */
		EClass DEFAULT_PROJECT = eINSTANCE.getDefaultProject();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__WORKFLOWS = eINSTANCE.getDefaultProject_Workflows();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__META_DATA = eINSTANCE.getDefaultProject_MetaData();

		/**
		 * The meta object literal for the '<em><b>Config Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__CONFIG_SOURCE = eINSTANCE.getDefaultProject_ConfigSource();

		/**
		 * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__BASE_URI = eINSTANCE.getDefaultProject_BaseURI();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__LOGGER = eINSTANCE.getDefaultProject_Logger();

		/**
		 * The meta object literal for the '<em><b>Graph Util</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__GRAPH_UTIL = eINSTANCE.getDefaultProject_GraphUtil();

		/**
		 * The meta object literal for the '<em><b>From Jar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__FROM_JAR = eINSTANCE.getDefaultProject_FromJar();

		/**
		 * The meta object literal for the '<em><b>Json Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__JSON_OBJECT = eINSTANCE.getDefaultProject_JsonObject();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__TOOLS = eINSTANCE.getDefaultProject_Tools();

		/**
		 * The meta object literal for the '<em><b>Default Config Source String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__DEFAULT_CONFIG_SOURCE_STRING = eINSTANCE.getDefaultProject_DefaultConfigSourceString();

		/**
		 * The meta object literal for the '<em><b>Tool Definitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__TOOL_DEFINITIONS = eINSTANCE.getDefaultProject_ToolDefinitions();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__PACKAGES = eINSTANCE.getDefaultProject_Packages();

	}

} //UiPackage
