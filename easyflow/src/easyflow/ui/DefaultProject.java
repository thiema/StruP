/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui;

import easyflow.core.IMetaData;
import easyflow.core.Workflow;

import easyflow.example.Examples;
import easyflow.graph.jgraphx.Util;

import java.util.Map;
import javax.xml.validation.Schema;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.w3c.dom.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.ui.DefaultProject#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getConfigFileName <em>Config File Name</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getGraphUtil <em>Graph Util</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#isFromJar <em>From Jar</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getExamples <em>Examples</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getToolDefinitions <em>Tool Definitions</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getSchemata <em>Schemata</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getJsonObject <em>Json Object</em>}</li>
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
	 * The list contents are of type {@link easyflow.core.IMetaData}.
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
	 * Returns the value of the '<em><b>Config File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config File Name</em>' attribute.
	 * @see #setConfigFileName(String)
	 * @see easyflow.ui.UiPackage#getDefaultProject_ConfigFileName()
	 * @model
	 * @generated
	 */
	String getConfigFileName();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getConfigFileName <em>Config File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config File Name</em>' attribute.
	 * @see #getConfigFileName()
	 * @generated
	 */
	void setConfigFileName(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see easyflow.ui.UiPackage#getDefaultProject_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Jar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Jar</em>' attribute.
	 * @see #setFromJar(boolean)
	 * @see easyflow.ui.UiPackage#getDefaultProject_FromJar()
	 * @model
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
	 * Returns the value of the '<em><b>Examples</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' reference.
	 * @see #setExamples(Examples)
	 * @see easyflow.ui.UiPackage#getDefaultProject_Examples()
	 * @model
	 * @generated
	 */
	Examples getExamples();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getExamples <em>Examples</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examples</em>' reference.
	 * @see #getExamples()
	 * @generated
	 */
	void setExamples(Examples value);

	/**
	 * Returns the value of the '<em><b>Tool Definitions</b></em>' attribute list.
	 * The list contents are of type {@link org.w3c.dom.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Definitions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Definitions</em>' attribute list.
	 * @see easyflow.ui.UiPackage#getDefaultProject_ToolDefinitions()
	 * @model dataType="easyflow.Document"
	 * @generated
	 */
	EList<Document> getToolDefinitions();

	/**
	 * Returns the value of the '<em><b>Schemata</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link javax.xml.validation.Schema},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemata</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemata</em>' map.
	 * @see easyflow.ui.UiPackage#getDefaultProject_Schemata()
	 * @model mapType="easyflow.core.StringToSchemaMap<org.eclipse.emf.ecore.EString, easyflow.Schema>"
	 * @generated
	 */
	EMap<String, Schema> getSchemata();

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

} // DefaultProject
