/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.data;

import easyflow.tool.Tool;

import easyflow.traversal.TraversalCriterion;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
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
 *   <li>{@link easyflow.data.DataPort#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.data.DataPort#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link easyflow.data.DataPort#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link easyflow.data.DataPort#isOptional <em>Optional</em>}</li>
 *   <li>{@link easyflow.data.DataPort#getBitPos <em>Bit Pos</em>}</li>
 *   <li>{@link easyflow.data.DataPort#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.data.DataPort#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.data.DataPort#isStatic <em>Static</em>}</li>
 *   <li>{@link easyflow.data.DataPort#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.data.DataPackage#getDataPort()
 * @model
 * @generated
 */
public interface DataPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Grouping Criteria</b></em>' reference list.
	 * The list contents are of type {@link easyflow.traversal.TraversalCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Criteria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Criteria</em>' reference list.
	 * @see easyflow.data.DataPackage#getDataPort_GroupingCriteria()
	 * @model
	 * @generated
	 */
	EList<TraversalCriterion> getGroupingCriteria();

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
	 * @see easyflow.data.DataPackage#getDataPort_Cardinality()
	 * @model
	 * @generated
	 */
	short getCardinality();

	/**
	 * Sets the value of the '{@link easyflow.data.DataPort#getCardinality <em>Cardinality</em>}' attribute.
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
	 * and the value is of type {@link easyflow.data.DataFormat},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Formats</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Formats</em>' map.
	 * @see easyflow.data.DataPackage#getDataPort_DataFormats()
	 * @model mapType="easyflow.util.maps.StringToDataFormatMap<org.eclipse.emf.ecore.EString, easyflow.data.DataFormat>"
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
	 * @see easyflow.data.DataPackage#getDataPort_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link easyflow.data.DataPort#isOptional <em>Optional</em>}' attribute.
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
	 * @see easyflow.data.DataPackage#getDataPort_BitPos()
	 * @model default="-1"
	 * @generated
	 */
	short getBitPos();

	/**
	 * Sets the value of the '{@link easyflow.data.DataPort#getBitPos <em>Bit Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Pos</em>' attribute.
	 * @see #getBitPos()
	 * @generated
	 */
	void setBitPos(short value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see easyflow.data.DataPackage#getDataPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.data.DataPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.Tool},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' map.
	 * @see easyflow.data.DataPackage#getDataPort_Tools()
	 * @model mapType="easyflow.util.maps.StringToToolMap<org.eclipse.emf.ecore.EString, easyflow.tool.Tool>"
	 * @generated
	 */
	EMap<String, Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see easyflow.data.DataPackage#getDataPort_Static()
	 * @model default="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link easyflow.data.DataPort#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see easyflow.data.DataPackage#getDataPort_ParameterName()
	 * @model
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link easyflow.data.DataPort#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatible(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataPortMany="true"
	 * @generated
	 */
	boolean removeDataPortFrom(EList<DataPort> dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DataFormat getFormat();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean matches(DataFormat dataFormat);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model formatsMany="true"
	 * @generated
	 */
	boolean isCompatibleStr(EList<String> formats, boolean requireAll);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model formatsMany="true"
	 * @generated
	 */
	boolean isCompatibleStr(EList<String> formats);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model formatsMany="true"
	 * @generated
	 */
	boolean isCompatible(EList<DataFormat> formats, boolean requireAll);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model formatsMany="true"
	 * @generated
	 */
	boolean isCompatible(EList<DataFormat> formats);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatible(String format);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatible(DataFormat format);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setFormat(String format);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model formatsMany="true"
	 * @generated
	 */
	void setFormats(EList<String> formats);

} // DataPort
