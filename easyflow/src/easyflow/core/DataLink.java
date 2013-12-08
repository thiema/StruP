/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import easyflow.traversal.TraversalChunk;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.DataLink#getDataPort <em>Data Port</em>}</li>
 *   <li>{@link easyflow.core.DataLink#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.core.DataLink#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.core.DataLink#getTraversalName <em>Traversal Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getDataLink()
 * @model
 * @generated
 */
public interface DataLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Port</em>' reference.
	 * @see #setDataPort(DataPort)
	 * @see easyflow.core.CorePackage#getDataLink_DataPort()
	 * @model
	 * @generated
	 */
	DataPort getDataPort();

	/**
	 * Sets the value of the '{@link easyflow.core.DataLink#getDataPort <em>Data Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Port</em>' reference.
	 * @see #getDataPort()
	 * @generated
	 */
	void setDataPort(DataPort value);

	/**
	 * Returns the value of the '<em><b>Chunks</b></em>' reference list.
	 * The list contents are of type {@link easyflow.traversal.TraversalChunk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunks</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunks</em>' reference list.
	 * @see easyflow.core.CorePackage#getDataLink_Chunks()
	 * @model
	 * @generated
	 */
	EList<TraversalChunk> getChunks();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see easyflow.core.CorePackage#getDataLink_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link easyflow.core.DataLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Traversal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversal Name</em>' attribute.
	 * @see #setTraversalName(String)
	 * @see easyflow.core.CorePackage#getDataLink_TraversalName()
	 * @model
	 * @generated
	 */
	String getTraversalName();

	/**
	 * Sets the value of the '{@link easyflow.core.DataLink#getTraversalName <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traversal Name</em>' attribute.
	 * @see #getTraversalName()
	 * @generated
	 */
	void setTraversalName(String value);

} // DataLink
