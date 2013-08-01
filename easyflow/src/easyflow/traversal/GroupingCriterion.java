/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal;

import org.apache.log4j.Logger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouping Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The GroupingCriterion represents a Criterion used to group Data. That means 
 * to decompose the Data in logical groups. E.g. by sample, by group of 
 * samples, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.traversal.GroupingCriterion#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.traversal.GroupingCriterion#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.traversal.GroupingCriterion#getMode <em>Mode</em>}</li>
 *   <li>{@link easyflow.traversal.GroupingCriterion#isMultipleInstances <em>Multiple Instances</em>}</li>
 *   <li>{@link easyflow.traversal.GroupingCriterion#isSeperateInputPorts <em>Seperate Input Ports</em>}</li>
 *   <li>{@link easyflow.traversal.GroupingCriterion#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.traversal.TraversalPackage#getGroupingCriterion()
 * @model
 * @generated
 */
public interface GroupingCriterion extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see easyflow.traversal.TraversalPackage#getGroupingCriterion_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link easyflow.traversal.GroupingCriterion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see easyflow.traversal.TraversalPackage#getGroupingCriterion_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link easyflow.traversal.GroupingCriterion#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see easyflow.traversal.TraversalPackage#getGroupingCriterion_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link easyflow.traversal.GroupingCriterion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flags whether multiple Instances of the GroupingCriterion can be presented to the data processing task. (E.g. multiple samples can be processed by the task)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Instances</em>' attribute.
	 * @see #setMultipleInstances(boolean)
	 * @see easyflow.traversal.TraversalPackage#getGroupingCriterion_MultipleInstances()
	 * @model
	 * @generated
	 */
	boolean isMultipleInstances();

	/**
	 * Sets the value of the '{@link easyflow.traversal.GroupingCriterion#isMultipleInstances <em>Multiple Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Instances</em>' attribute.
	 * @see #isMultipleInstances()
	 * @generated
	 */
	void setMultipleInstances(boolean value);

	/**
	 * Returns the value of the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * flags whether multiple instances have to be presented as seperate inputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seperate Input Ports</em>' attribute.
	 * @see #setSeperateInputPorts(boolean)
	 * @see easyflow.traversal.TraversalPackage#getGroupingCriterion_SeperateInputPorts()
	 * @model
	 * @generated
	 */
	boolean isSeperateInputPorts();

	/**
	 * Sets the value of the '{@link easyflow.traversal.GroupingCriterion#isSeperateInputPorts <em>Seperate Input Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seperate Input Ports</em>' attribute.
	 * @see #isSeperateInputPorts()
	 * @generated
	 */
	void setSeperateInputPorts(boolean value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.traversal.TraversalPackage#getGroupingCriterion_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

} // GroupingCriterion
