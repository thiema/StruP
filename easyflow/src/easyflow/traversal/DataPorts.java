/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal;

import easyflow.core.Task;

import easyflow.tool.DataPort;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.traversal.DataPorts#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.traversal.DataPorts#getDataPorts <em>Data Ports</em>}</li>
 *   <li>{@link easyflow.traversal.DataPorts#getLastTasks <em>Last Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.traversal.TraversalPackage#getDataPorts()
 * @model
 * @generated
 */
public interface DataPorts extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see easyflow.traversal.TraversalPackage#getDataPorts_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.traversal.DataPorts#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Ports</b></em>' reference list.
	 * The list contents are of type {@link easyflow.tool.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Ports</em>' reference list.
	 * @see easyflow.traversal.TraversalPackage#getDataPorts_DataPorts()
	 * @model
	 * @generated
	 */
	EList<DataPort> getDataPorts();

	/**
	 * Returns the value of the '<em><b>Last Tasks</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Tasks</em>' reference list.
	 * @see easyflow.traversal.TraversalPackage#getDataPorts_LastTasks()
	 * @model
	 * @generated
	 */
	EList<Task> getLastTasks();

} // DataPorts
