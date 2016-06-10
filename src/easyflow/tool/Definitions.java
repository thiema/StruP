/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import java.io.FileNotFoundException;

import java.net.URI;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link easyflow.tool.Definitions#getToolDefinitions <em>Tool Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends EObject {
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
	 * @see easyflow.tool.ToolPackage#getDefinitions_ToolDefinitions()
	 * @model dataType="easyflow.Document"
	 * @generated
	 */
	EList<Document> getToolDefinitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.Document" exceptions="easyflow.FileNotFoundException" xmlSourceDataType="easyflow.URI"
	 * @generated
	 */
	Document readToolDefinition(URI xmlSource) throws FileNotFoundException;

} // Definitions
