/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;

import easyflow.ui.DefaultProject;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Execution System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.execution.DefaultExecutionSystem#getProject <em>Project</em>}</li>
 *   <li>{@link easyflow.execution.DefaultExecutionSystem#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.execution.ExecutionPackage#getDefaultExecutionSystem()
 * @model
 * @generated
 */
public interface DefaultExecutionSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(DefaultProject)
	 * @see easyflow.execution.ExecutionPackage#getDefaultExecutionSystem_Project()
	 * @model
	 * @generated
	 */
	DefaultProject getProject();

	/**
	 * Sets the value of the '{@link easyflow.execution.DefaultExecutionSystem#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(DefaultProject value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.execution.ExecutionPackage#getDefaultExecutionSystem_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

} // DefaultExecutionSystem
