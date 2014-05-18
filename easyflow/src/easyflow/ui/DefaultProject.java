/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui;

import easyflow.core.Workflow;

import easyflow.execution.IExecutionSystem;
import easyflow.graph.jgraphx.Util;

import easyflow.metadata.IMetaData;

import easyflow.tool.Tool;
import easyflow.tool.ToolDefinitions;

import java.net.URI;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * basePath: the path to the project files. If JSON config file (configSource) is not set, 
 * it is assumed to be basePath+defaultConfigSource.
 * configSource: the URI of the JSON config file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.ui.DefaultProject#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getConfigSource <em>Config Source</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getGraphUtil <em>Graph Util</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#isFromJar <em>From Jar</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getJsonObject <em>Json Object</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getDefaultConfigSourceString <em>Default Config Source String</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getToolDefinitions <em>Tool Definitions</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.ui.UiPackage#getDefaultProject()
 * @model
 * @generated
 */
public interface DefaultProject extends IProject {
	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.Workflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflows</em>' reference list.
	 * @see easyflow.ui.UiPackage#getDefaultProject_Workflows()
	 * @model
	 * @generated
	 */
	EList<Workflow> getWorkflows();

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' reference list.
	 * The list contents are of type {@link easyflow.metadata.IMetaData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' reference list.
	 * @see easyflow.ui.UiPackage#getDefaultProject_MetaData()
	 * @model
	 * @generated
	 */
	EList<IMetaData> getMetaData();

	/**
	 * Returns the value of the '<em><b>Config Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Source</em>' attribute.
	 * @see #setConfigSource(URI)
	 * @see easyflow.ui.UiPackage#getDefaultProject_ConfigSource()
	 * @model dataType="easyflow.URI"
	 * @generated
	 */
	URI getConfigSource();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getConfigSource <em>Config Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Source</em>' attribute.
	 * @see #getConfigSource()
	 * @generated
	 */
	void setConfigSource(URI value);

	/**
	 * Returns the value of the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URI</em>' attribute.
	 * @see #setBaseURI(URI)
	 * @see easyflow.ui.UiPackage#getDefaultProject_BaseURI()
	 * @model dataType="easyflow.URI"
	 * @generated
	 */
	URI getBaseURI();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getBaseURI <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URI</em>' attribute.
	 * @see #getBaseURI()
	 * @generated
	 */
	void setBaseURI(URI value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.ui.UiPackage#getDefaultProject_Logger()
	 * @model default="" dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Graph Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Util</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Util</em>' reference.
	 * @see #setGraphUtil(Util)
	 * @see easyflow.ui.UiPackage#getDefaultProject_GraphUtil()
	 * @model
	 * @generated
	 */
	Util getGraphUtil();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getGraphUtil <em>Graph Util</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Util</em>' reference.
	 * @see #getGraphUtil()
	 * @generated
	 */
	void setGraphUtil(Util value);

	/**
	 * Returns the value of the '<em><b>From Jar</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Jar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Jar</em>' attribute.
	 * @see #setFromJar(boolean)
	 * @see easyflow.ui.UiPackage#getDefaultProject_FromJar()
	 * @model default="true"
	 * @generated
	 */
	boolean isFromJar();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#isFromJar <em>From Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Jar</em>' attribute.
	 * @see #isFromJar()
	 * @generated
	 */
	void setFromJar(boolean value);

	/**
	 * Returns the value of the '<em><b>Json Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Object</em>' attribute.
	 * @see #setJsonObject(JSONObject)
	 * @see easyflow.ui.UiPackage#getDefaultProject_JsonObject()
	 * @model dataType="easyflow.JSONObject"
	 * @generated
	 */
	JSONObject getJsonObject();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getJsonObject <em>Json Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Object</em>' attribute.
	 * @see #getJsonObject()
	 * @generated
	 */
	void setJsonObject(JSONObject value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.Tool},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' map.
	 * @see easyflow.ui.UiPackage#getDefaultProject_Tools()
	 * @model mapType="easyflow.util.maps.StringToToolMap<org.eclipse.emf.ecore.EString, easyflow.tool.Tool>"
	 * @generated
	 */
	EMap<String, Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Default Config Source String</b></em>' attribute.
	 * The default value is <code>"main.json"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Config Source String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Config Source String</em>' attribute.
	 * @see easyflow.ui.UiPackage#getDefaultProject_DefaultConfigSourceString()
	 * @model default="main.json" changeable="false"
	 * @generated
	 */
	String getDefaultConfigSourceString();

	/**
	 * Returns the value of the '<em><b>Tool Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Definitions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Definitions</em>' reference.
	 * @see #setToolDefinitions(ToolDefinitions)
	 * @see easyflow.ui.UiPackage#getDefaultProject_ToolDefinitions()
	 * @model
	 * @generated
	 */
	ToolDefinitions getToolDefinitions();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getToolDefinitions <em>Tool Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Definitions</em>' reference.
	 * @see #getToolDefinitions()
	 * @generated
	 */
	void setToolDefinitions(ToolDefinitions value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.Package},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' map.
	 * @see easyflow.ui.UiPackage#getDefaultProject_Packages()
	 * @model mapType="easyflow.util.maps.StringToPackageMap<org.eclipse.emf.ecore.EString, easyflow.tool.Package>"
	 * @generated
	 */
	EMap<String, easyflow.tool.Package> getPackages();

} // DefaultProject
