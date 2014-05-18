/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import easyflow.data.DataPort;
import easyflow.tool.Tool;

import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Collect what is missing (or vice versa what is matching) from the tools point of
 *  view.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.ToolMatch#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getTask <em>Task</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getTool <em>Tool</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getScore <em>Score</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getExpectedScore <em>Expected Score</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getExpectedToolScore <em>Expected Tool Score</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getMissingInDataPorts <em>Missing In Data Ports</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getMissingOutDataPorts <em>Missing Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getMissingGroupingCriteria <em>Missing Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getReverseMissingInDataPorts <em>Reverse Missing In Data Ports</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getReverseMissingOutDataPorts <em>Reverse Missing Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#getReverseMissingGroupingCriteria <em>Reverse Missing Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.ToolMatch#isValid <em>Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getToolMatch()
 * @model
 * @generated
 */
public interface ToolMatch extends EObject {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see #setLogger(Logger)
	 * @see easyflow.core.CorePackage#getToolMatch_Logger()
	 * @model dataType="easyflow.Logger" transient="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link easyflow.core.ToolMatch#getLogger <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' attribute.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see easyflow.core.CorePackage#getToolMatch_Task()
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link easyflow.core.ToolMatch#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' reference.
	 * @see #setTool(Tool)
	 * @see easyflow.core.CorePackage#getToolMatch_Tool()
	 * @model
	 * @generated
	 */
	Tool getTool();

	/**
	 * Sets the value of the '{@link easyflow.core.ToolMatch#getTool <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' reference.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(Tool value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(long)
	 * @see easyflow.core.CorePackage#getToolMatch_Score()
	 * @model default="0"
	 * @generated
	 */
	long getScore();

	/**
	 * Sets the value of the '{@link easyflow.core.ToolMatch#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(long value);

	/**
	 * Returns the value of the '<em><b>Expected Score</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Score</em>' attribute.
	 * @see #setExpectedScore(long)
	 * @see easyflow.core.CorePackage#getToolMatch_ExpectedScore()
	 * @model default="0"
	 * @generated
	 */
	long getExpectedScore();

	/**
	 * Sets the value of the '{@link easyflow.core.ToolMatch#getExpectedScore <em>Expected Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Score</em>' attribute.
	 * @see #getExpectedScore()
	 * @generated
	 */
	void setExpectedScore(long value);

	/**
	 * Returns the value of the '<em><b>Expected Tool Score</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Tool Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Tool Score</em>' attribute.
	 * @see #setExpectedToolScore(long)
	 * @see easyflow.core.CorePackage#getToolMatch_ExpectedToolScore()
	 * @model default="0"
	 * @generated
	 */
	long getExpectedToolScore();

	/**
	 * Sets the value of the '{@link easyflow.core.ToolMatch#getExpectedToolScore <em>Expected Tool Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Tool Score</em>' attribute.
	 * @see #getExpectedToolScore()
	 * @generated
	 */
	void setExpectedToolScore(long value);

	/**
	 * Returns the value of the '<em><b>Missing In Data Ports</b></em>' containment reference list.
	 * The list contents are of type {@link easyflow.data.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing In Data Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing In Data Ports</em>' containment reference list.
	 * @see easyflow.core.CorePackage#getToolMatch_MissingInDataPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPort> getMissingInDataPorts();

	/**
	 * Returns the value of the '<em><b>Missing Out Data Ports</b></em>' containment reference list.
	 * The list contents are of type {@link easyflow.data.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing Out Data Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Out Data Ports</em>' containment reference list.
	 * @see easyflow.core.CorePackage#getToolMatch_MissingOutDataPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPort> getMissingOutDataPorts();

	/**
	 * Returns the value of the '<em><b>Missing Grouping Criteria</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing Grouping Criteria</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Grouping Criteria</em>' map.
	 * @see easyflow.core.CorePackage#getToolMatch_MissingGroupingCriteria()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getMissingGroupingCriteria();

	/**
	 * Returns the value of the '<em><b>Reverse Missing In Data Ports</b></em>' containment reference list.
	 * The list contents are of type {@link easyflow.data.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Missing In Data Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Missing In Data Ports</em>' containment reference list.
	 * @see easyflow.core.CorePackage#getToolMatch_ReverseMissingInDataPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPort> getReverseMissingInDataPorts();

	/**
	 * Returns the value of the '<em><b>Reverse Missing Out Data Ports</b></em>' containment reference list.
	 * The list contents are of type {@link easyflow.data.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Missing Out Data Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Missing Out Data Ports</em>' containment reference list.
	 * @see easyflow.core.CorePackage#getToolMatch_ReverseMissingOutDataPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPort> getReverseMissingOutDataPorts();

	/**
	 * Returns the value of the '<em><b>Reverse Missing Grouping Criteria</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Missing Grouping Criteria</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Missing Grouping Criteria</em>' map.
	 * @see easyflow.core.CorePackage#getToolMatch_ReverseMissingGroupingCriteria()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getReverseMissingGroupingCriteria();

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see easyflow.core.CorePackage#getToolMatch_Valid()
	 * @model default="false"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link easyflow.core.ToolMatch#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	long computeScore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	long computeExpectedScore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataPortMany="true" patternDataType="easyflow.Pattern" patternMany="true"
	 * @generated
	 */
	boolean validateDataPorts(EList<DataPort> dataPort, EList<Pattern> pattern);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.TaskToDataPortsMap<easyflow.core.Task, easyflow.data.DataPort>" tasksMany="true"
	 * @generated
	 */
	EMap<Task, EList<DataPort>> resolveReverseMissingInDataPorts(EList<Task> tasks);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.TaskToDataPortsMap<easyflow.core.Task, easyflow.data.DataPort>" tasksMany="true"
	 * @generated
	 */
	EMap<Task, EList<DataPort>> resolveReverseMissingOutDataPorts(EList<Task> tasks);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.TaskToDataPortsMap<easyflow.core.Task, easyflow.data.DataPort>" tasksMany="true" dataPortsMany="true"
	 * @generated
	 */
	EMap<Task, EList<DataPort>> getDataPortProvidingTasks(EList<Task> tasks, EList<DataPort> dataPorts);

} // ToolMatch
