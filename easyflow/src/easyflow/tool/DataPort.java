/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import easyflow.traversal.GroupingCriterion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DataPort represents the Data that can be transformed by a Task. DataPorts
 * have a Cardinality and a DataFormat and a List of GroupingCriteria that can 
 * be used to group the data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.DataPort#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.tool.DataPort#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link easyflow.tool.DataPort#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link easyflow.tool.DataPort#isOptional <em>Optional</em>}</li>
 *   <li>{@link easyflow.tool.DataPort#getBitPos <em>Bit Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getDataPort()
 * @model
 * @generated
 */
public interface DataPort extends DefaultToolElement {
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
	 * Returns the value of the '<em><b>Data Formats</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.DataFormat},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Formats</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Formats</em>' map.
	 * @see easyflow.tool.ToolPackage#getDataPort_DataFormats()
	 * @model mapType="easyflow.util.maps.StringToDataFormatMap<org.eclipse.emf.ecore.EString, easyflow.tool.DataFormat>"
	 * @generated
	 */
	EMap<String, DataFormat> getDataFormats();

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see easyflow.tool.ToolPackage#getDataPort_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link easyflow.tool.DataPort#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Bit Pos</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Pos</em>' attribute.
	 * @see #setBitPos(short)
	 * @see easyflow.tool.ToolPackage#getDataPort_BitPos()
	 * @model default="-1"
	 * @generated
	 */
	short getBitPos();

	/**
	 * Sets the value of the '{@link easyflow.tool.DataPort#getBitPos <em>Bit Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Pos</em>' attribute.
	 * @see #getBitPos()
	 * @generated
	 */
	void setBitPos(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatible(DataPort dataPort);

} // DataPort
