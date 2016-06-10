/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Execution System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.execution.DefaultExecutionSystem#isUnix <em>Unix</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.execution.ExecutionPackage#getDefaultExecutionSystem()
 * @model
 * @generated
 */
public interface DefaultExecutionSystem extends IExecutionSystem {

	/**
	 * Returns the value of the '<em><b>Unix</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unix</em>' attribute.
	 * @see #setUnix(boolean)
	 * @see easyflow.execution.ExecutionPackage#getDefaultExecutionSystem_Unix()
	 * @model default="true"
	 * @generated
	 */
	boolean isUnix();

	/**
	 * Sets the value of the '{@link easyflow.execution.DefaultExecutionSystem#isUnix <em>Unix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unix</em>' attribute.
	 * @see #isUnix()
	 * @generated
	 */
	void setUnix(boolean value);
} // DefaultExecutionSystem
