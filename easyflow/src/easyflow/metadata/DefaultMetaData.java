/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.metadata;

import easyflow.core.LogMessage;
import java.io.BufferedReader;
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
 *   <li>{@link easyflow.metadata.DefaultMetaData#getReader <em>Reader</em>}</li>
 *   <li>{@link easyflow.metadata.DefaultMetaData#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.metadata.DefaultMetaData#getGroupings <em>Groupings</em>}</li>
 *   <li>{@link easyflow.metadata.DefaultMetaData#getGroupingInstances <em>Grouping Instances</em>}</li>
 *   <li>{@link easyflow.metadata.DefaultMetaData#getAliases <em>Aliases</em>}</li>
 *   <li>{@link easyflow.metadata.DefaultMetaData#getGroupingProps <em>Grouping Props</em>}</li>
 *   <li>{@link easyflow.metadata.DefaultMetaData#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.metadata.MetadataPackage#getDefaultMetaData()
 * @model
 * @generated
 */
public interface DefaultMetaData extends IMetaData {
	/**
	 * Returns the value of the '<em><b>Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader</em>' attribute.
	 * @see #setReader(BufferedReader)
	 * @see easyflow.metadata.MetadataPackage#getDefaultMetaData_Reader()
	 * @model dataType="easyflow.BufferedReader"
	 * @generated
	 */
	BufferedReader getReader();

	/**
	 * Sets the value of the '{@link easyflow.metadata.DefaultMetaData#getReader <em>Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader</em>' attribute.
	 * @see #getReader()
	 * @generated
	 */
	void setReader(BufferedReader value);

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
	 * @see easyflow.metadata.MetadataPackage#getDefaultMetaData_Logger()
	 * @model dataType="easyflow.Logger" transient="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link easyflow.metadata.DefaultMetaData#getLogger <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' attribute.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

	/**
	 * Returns the value of the '<em><b>Groupings</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.metadata.Grouping},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupings</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupings</em>' map.
	 * @see easyflow.metadata.MetadataPackage#getDefaultMetaData_Groupings()
	 * @model mapType="easyflow.util.maps.StringToGroupingMap<org.eclipse.emf.ecore.EString, easyflow.metadata.Grouping>"
	 * @generated
	 */
	EMap<String, Grouping> getGroupings();

	/**
	 * Returns the value of the '<em><b>Grouping Instances</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.metadata.GroupingInstanceList},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Instances</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Instances</em>' map.
	 * @see easyflow.metadata.MetadataPackage#getDefaultMetaData_GroupingInstances()
	 * @model mapType="easyflow.util.maps.StringToGroupingInstanceListMap<org.eclipse.emf.ecore.EString, easyflow.metadata.GroupingInstanceList>"
	 * @generated
	 */
	EMap<String, GroupingInstanceList> getGroupingInstances();

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' map.
	 * @see easyflow.metadata.MetadataPackage#getDefaultMetaData_Aliases()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getAliases();

	/**
	 * Returns the value of the '<em><b>Grouping Props</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Props</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Props</em>' map.
	 * @see easyflow.metadata.MetadataPackage#getDefaultMetaData_GroupingProps()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getGroupingProps();

	/**
	 * Returns the value of the '<em><b>Log Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Message</em>' reference.
	 * @see #setLogMessage(LogMessage)
	 * @see easyflow.metadata.MetadataPackage#getDefaultMetaData_LogMessage()
	 * @model
	 * @generated
	 */
	LogMessage getLogMessage();

	/**
	 * Sets the value of the '{@link easyflow.metadata.DefaultMetaData#getLogMessage <em>Log Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Message</em>' reference.
	 * @see #getLogMessage()
	 * @generated
	 */
	void setLogMessage(LogMessage value);

} // DefaultMetaData
