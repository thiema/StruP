/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;

import easyflow.ui.DefaultProject;
import java.io.BufferedWriter;
import org.apache.log4j.Logger;

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
 *   <li>{@link easyflow.execution.DefaultExecutionSystem#getWriter <em>Writer</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.execution.ExecutionPackage#getDefaultExecutionSystem()
 * @model
 * @generated
 */
public interface DefaultExecutionSystem extends IExecutionSystem {
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

	/**
	 * Returns the value of the '<em><b>Writer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer</em>' attribute.
	 * @see #setWriter(BufferedWriter)
	 * @see easyflow.execution.ExecutionPackage#getDefaultExecutionSystem_Writer()
	 * @model dataType="easyflow.BufferedWriter"
	 * @generated
	 */
	BufferedWriter getWriter();

	/**
	 * Sets the value of the '{@link easyflow.execution.DefaultExecutionSystem#getWriter <em>Writer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer</em>' attribute.
	 * @see #getWriter()
	 * @generated
	 */
	void setWriter(BufferedWriter value);

} // DefaultExecutionSystem
