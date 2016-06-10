/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui;

import easyflow.core.Workflow;
import easyflow.metadata.IMetaData;
import easyflow.tool.ToolDefinitions;
import easyflow.util.LogMessage;
import java.net.URI;
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
 *   <li>{@link easyflow.ui.DefaultProject#isFromJar <em>From Jar</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getDefaultConfigSourceString <em>Default Config Source String</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getToolDefinitions <em>Tool Definitions</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getPackages <em>Packages</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getConfigWorkflowDefFile <em>Config Workflow Def File</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getConfigUtilityDefFile <em>Config Utility Def File</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getConfigMetadataFile <em>Config Metadata File</em>}</li>
 *   <li>{@link easyflow.ui.DefaultProject#getLogMessage <em>Log Message</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Config Workflow Def File</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Workflow Def File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Workflow Def File</em>' attribute.
	 * @see #setConfigWorkflowDefFile(String)
	 * @see easyflow.ui.UiPackage#getDefaultProject_ConfigWorkflowDefFile()
	 * @model default=""
	 * @generated
	 */
	String getConfigWorkflowDefFile();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getConfigWorkflowDefFile <em>Config Workflow Def File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Workflow Def File</em>' attribute.
	 * @see #getConfigWorkflowDefFile()
	 * @generated
	 */
	void setConfigWorkflowDefFile(String value);

	/**
	 * Returns the value of the '<em><b>Config Utility Def File</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Utility Def File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Utility Def File</em>' attribute.
	 * @see #setConfigUtilityDefFile(String)
	 * @see easyflow.ui.UiPackage#getDefaultProject_ConfigUtilityDefFile()
	 * @model default=""
	 * @generated
	 */
	String getConfigUtilityDefFile();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getConfigUtilityDefFile <em>Config Utility Def File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Utility Def File</em>' attribute.
	 * @see #getConfigUtilityDefFile()
	 * @generated
	 */
	void setConfigUtilityDefFile(String value);

	/**
	 * Returns the value of the '<em><b>Config Metadata File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Metadata File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Metadata File</em>' attribute.
	 * @see #setConfigMetadataFile(String)
	 * @see easyflow.ui.UiPackage#getDefaultProject_ConfigMetadataFile()
	 * @model
	 * @generated
	 */
	String getConfigMetadataFile();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getConfigMetadataFile <em>Config Metadata File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Metadata File</em>' attribute.
	 * @see #getConfigMetadataFile()
	 * @generated
	 */
	void setConfigMetadataFile(String value);

	/**
	 * Returns the value of the '<em><b>Log Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Message</em>' reference.
	 * @see #setLogMessage(LogMessage)
	 * @see easyflow.ui.UiPackage#getDefaultProject_LogMessage()
	 * @model
	 * @generated
	 */
	LogMessage getLogMessage();

	/**
	 * Sets the value of the '{@link easyflow.ui.DefaultProject#getLogMessage <em>Log Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Message</em>' reference.
	 * @see #getLogMessage()
	 * @generated
	 */
	void setLogMessage(LogMessage value);

} // DefaultProject
