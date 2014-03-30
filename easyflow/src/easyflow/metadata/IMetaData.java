/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.metadata;

import easyflow.traversal.GroupingCriterion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMeta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The IMetaData provides an Interface to read MetaData associated to an Easyflow project.
 * <!-- end-model-doc -->
 *
 *
 * @see easyflow.metadata.MetadataPackage#getIMetaData()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IMetaData extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void readMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<GroupingInstance> getInstances(GroupingInstance groupingInstance, String resolvedAs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getValueForGroupingInstance(GroupingInstance groupingInstance, String field);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> getRecordsBy(String groupingStr, String instanceStr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>"
	 * @generated
	 */
	EMap<String, Object> getRecord(GroupingInstance recordInstance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getRow(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getColumn(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<GroupingInstance> getInstances(String groupingStr1, String groupingStr2, String instanceStr);

} // IMetaData
