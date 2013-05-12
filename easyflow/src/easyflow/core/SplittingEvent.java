/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Splitting Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.SplittingEvent#getMergeTask <em>Merge Task</em>}</li>
 *   <li>{@link easyflow.core.SplittingEvent#getSplitTask <em>Split Task</em>}</li>
 *   <li>{@link easyflow.core.SplittingEvent#getParentTask <em>Parent Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getSplittingEvent()
 * @model
 * @generated
 */
public interface SplittingEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Merge Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Task</em>' reference.
	 * @see #setMergeTask(Task)
	 * @see easyflow.core.CorePackage#getSplittingEvent_MergeTask()
	 * @model
	 * @generated
	 */
	Task getMergeTask();

	/**
	 * Sets the value of the '{@link easyflow.core.SplittingEvent#getMergeTask <em>Merge Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Task</em>' reference.
	 * @see #getMergeTask()
	 * @generated
	 */
	void setMergeTask(Task value);

	/**
	 * Returns the value of the '<em><b>Split Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Task</em>' reference.
	 * @see #setSplitTask(Task)
	 * @see easyflow.core.CorePackage#getSplittingEvent_SplitTask()
	 * @model
	 * @generated
	 */
	Task getSplitTask();

	/**
	 * Sets the value of the '{@link easyflow.core.SplittingEvent#getSplitTask <em>Split Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Task</em>' reference.
	 * @see #getSplitTask()
	 * @generated
	 */
	void setSplitTask(Task value);

	/**
	 * Returns the value of the '<em><b>Parent Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Task</em>' reference.
	 * @see #setParentTask(Task)
	 * @see easyflow.core.CorePackage#getSplittingEvent_ParentTask()
	 * @model
	 * @generated
	 */
	Task getParentTask();

	/**
	 * Sets the value of the '{@link easyflow.core.SplittingEvent#getParentTask <em>Parent Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Task</em>' reference.
	 * @see #getParentTask()
	 * @generated
	 */
	void setParentTask(Task value);

} // SplittingEvent
