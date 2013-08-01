/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import easyflow.traversal.GroupingCriterion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DataPort represents the Data that can be transformed by a Task. DataPorts have a Cardinality and a DataFormat and a List of GroupingCriteria that can be used to group the data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.DataPort#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.tool.DataPort#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link easyflow.tool.DataPort#getDataFormat <em>Data Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getDataPort()
 * @model
 * @generated
 */
public interface DataPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Grouping Criteria</b></em>' reference list.
	 * The list contents are of type {@link easyflow.traversal.GroupingCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Criteria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Criteria</em>' reference list.
	 * @see easyflow.tool.ToolPackage#getDataPort_GroupingCriteria()
	 * @model
	 * @generated
	 */
	EList<GroupingCriterion> getGroupingCriteria();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(short)
	 * @see easyflow.tool.ToolPackage#getDataPort_Cardinality()
	 * @model
	 * @generated
	 */
	short getCardinality();

	/**
	 * Sets the value of the '{@link easyflow.tool.DataPort#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(short value);

	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Format</em>' reference.
	 * @see #setDataFormat(DataFormat)
	 * @see easyflow.tool.ToolPackage#getDataPort_DataFormat()
	 * @model
	 * @generated
	 */
	DataFormat getDataFormat();

	/**
	 * Sets the value of the '{@link easyflow.tool.DataPort#getDataFormat <em>Data Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format</em>' reference.
	 * @see #getDataFormat()
	 * @generated
	 */
	void setDataFormat(DataFormat value);

} // DataPort
