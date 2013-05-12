/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import java.util.Map;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.DefaultMetaData#getFileName <em>File Name</em>}</li>
 *   <li>{@link easyflow.core.DefaultMetaData#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.DefaultMetaData#getGroupingInstances <em>Grouping Instances</em>}</li>
 *   <li>{@link easyflow.core.DefaultMetaData#getGroupingInstancesByGroup <em>Grouping Instances By Group</em>}</li>
 *   <li>{@link easyflow.core.DefaultMetaData#getGroupings <em>Groupings</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getDefaultMetaData()
 * @model
 * @generated
 */
public interface DefaultMetaData extends IMetaData {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see easyflow.core.CorePackage#getDefaultMetaData_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link easyflow.core.DefaultMetaData#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

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
	 * @see easyflow.core.CorePackage#getDefaultMetaData_Logger()
	 * @model dataType="easyflow.Logger" transient="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link easyflow.core.DefaultMetaData#getLogger <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' attribute.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

	/**
	 * Returns the value of the '<em><b>Grouping Instances</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.GroupingInstanceList},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Instances</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Instances</em>' map.
	 * @see easyflow.core.CorePackage#getDefaultMetaData_GroupingInstances()
	 * @model mapType="easyflow.core.StringToGroupingInstanceListMap<org.eclipse.emf.ecore.EString, easyflow.core.GroupingInstanceList>"
	 * @generated
	 */
	EMap<String, GroupingInstanceList> getGroupingInstances();

	/**
	 * Returns the value of the '<em><b>Grouping Instances By Group</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.GroupingInstanceList},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Instances By Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Instances By Group</em>' map.
	 * @see easyflow.core.CorePackage#getDefaultMetaData_GroupingInstancesByGroup()
	 * @model mapType="easyflow.core.StringToGroupingInstanceListMap<org.eclipse.emf.ecore.EString, easyflow.core.GroupingInstanceList>"
	 * @generated
	 */
	EMap<String, GroupingInstanceList> getGroupingInstancesByGroup();

	/**
	 * Returns the value of the '<em><b>Groupings</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.Grouping},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupings</em>' map.
	 * @see easyflow.core.CorePackage#getDefaultMetaData_Groupings()
	 * @model mapType="easyflow.core.StringToGroupingMap<org.eclipse.emf.ecore.EString, easyflow.core.Grouping>"
	 * @generated
	 */
	EMap<String, Grouping> getGroupings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Map<String, Object> getDefaultRecords();

} // DefaultMetaData
