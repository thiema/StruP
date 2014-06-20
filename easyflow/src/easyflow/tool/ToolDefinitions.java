/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import java.io.FileNotFoundException;
import java.net.URI;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.ToolDefinitions#getToolDefinitions <em>Tool Definitions</em>}</li>
 *   <li>{@link easyflow.tool.ToolDefinitions#getToolSchemata <em>Tool Schemata</em>}</li>
 *   <li>{@link easyflow.tool.ToolDefinitions#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.ToolDefinitions#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getToolDefinitions()
 * @model
 * @generated
 */
public interface ToolDefinitions extends EObject {
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
	 * @see easyflow.tool.ToolPackage#getToolDefinitions_ToolDefinitions()
	 * @model dataType="easyflow.Document"
	 * @generated
	 */
	EList<Document> getToolDefinitions();

	/**
	 * Returns the value of the '<em><b>Tool Schemata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Schemata</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Schemata</em>' reference.
	 * @see #setToolSchemata(ToolSchemata)
	 * @see easyflow.tool.ToolPackage#getToolDefinitions_ToolSchemata()
	 * @model
	 * @generated
	 */
	ToolSchemata getToolSchemata();

	/**
	 * Sets the value of the '{@link easyflow.tool.ToolDefinitions#getToolSchemata <em>Tool Schemata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Schemata</em>' reference.
	 * @see #getToolSchemata()
	 * @generated
	 */
	void setToolSchemata(ToolSchemata value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.tool.ToolPackage#getToolDefinitions_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.DocumentProperties},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see easyflow.tool.ToolPackage#getToolDefinitions_Properties()
	 * @model mapType="easyflow.util.maps.StringToDocumentPropertiesMap<org.eclipse.emf.ecore.EString, easyflow.tool.DocumentProperties>"
	 * @generated
	 */
	EMap<String, DocumentProperties> getProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.FileNotFoundException" xmlSourceDataType="easyflow.URI"
	 * @generated
	 */
	boolean validateToolDefinition(URI xmlSource, boolean isFromJar) throws FileNotFoundException;

} // ToolDefinitions
