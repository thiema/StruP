/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IExecution System</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see easyflow.execution.ExecutionPackage#getIExecutionSystem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IExecutionSystem extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createWorkflow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void executeWorkflow();

} // IExecutionSystem
