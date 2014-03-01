/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent Task Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.ParentTaskResult#getParentTask <em>Parent Task</em>}</li>
 *   <li>{@link easyflow.core.ParentTaskResult#getCoveredPorts <em>Covered Ports</em>}</li>
 *   <li>{@link easyflow.core.ParentTaskResult#getCondition <em>Condition</em>}</li>
 *   <li>{@link easyflow.core.ParentTaskResult#isGeneric <em>Generic</em>}</li>
 *   <li>{@link easyflow.core.ParentTaskResult#getRank <em>Rank</em>}</li>
 *   <li>{@link easyflow.core.ParentTaskResult#getPotentialCircumventingTasks <em>Potential Circumventing Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getParentTaskResult()
 * @model
 * @generated
 */
public interface ParentTaskResult extends EObject {
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
	 * @see easyflow.core.CorePackage#getParentTaskResult_ParentTask()
	 * @model
	 * @generated
	 */
	Task getParentTask();

	/**
	 * Sets the value of the '{@link easyflow.core.ParentTaskResult#getParentTask <em>Parent Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Task</em>' reference.
	 * @see #getParentTask()
	 * @generated
	 */
	void setParentTask(Task value);

	/**
	 * Returns the value of the '<em><b>Covered Ports</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered Ports</em>' reference list.
	 * @see easyflow.core.CorePackage#getParentTaskResult_CoveredPorts()
	 * @model
	 * @generated
	 */
	EList<DataPort> getCoveredPorts();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see easyflow.core.CorePackage#getParentTaskResult_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link easyflow.core.ParentTaskResult#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Generic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic</em>' attribute.
	 * @see #setGeneric(boolean)
	 * @see easyflow.core.CorePackage#getParentTaskResult_Generic()
	 * @model default="false"
	 * @generated
	 */
	boolean isGeneric();

	/**
	 * Sets the value of the '{@link easyflow.core.ParentTaskResult#isGeneric <em>Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic</em>' attribute.
	 * @see #isGeneric()
	 * @generated
	 */
	void setGeneric(boolean value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see easyflow.core.CorePackage#getParentTaskResult_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link easyflow.core.ParentTaskResult#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Potential Circumventing Tasks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potential Circumventing Tasks</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potential Circumventing Tasks</em>' attribute list.
	 * @see easyflow.core.CorePackage#getParentTaskResult_PotentialCircumventingTasks()
	 * @model
	 * @generated
	 */
	EList<String> getPotentialCircumventingTasks();

} // ParentTaskResult
