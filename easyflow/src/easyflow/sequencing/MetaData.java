/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing;

import easyflow.core.DefaultMetaData;
import easyflow.core.IMetaData;

import easyflow.sequencing.grouping.Group;
import easyflow.sequencing.grouping.Library;
import easyflow.sequencing.grouping.ReadGroup;
import easyflow.sequencing.grouping.Record;
import easyflow.sequencing.grouping.Sample;

import org.eclipse.emf.common.util.EMap;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.sequencing.MetaData#getSamples <em>Samples</em>}</li>
 *   <li>{@link easyflow.sequencing.MetaData#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.sequencing.MetaData#getReadGroups <em>Read Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.MetaData#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link easyflow.sequencing.MetaData#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.sequencing.SequencingPackage#getMetaData()
 * @model
 * @generated
 */
public interface MetaData extends IMetaData, DefaultMetaData {
	/**
	 * Returns the value of the '<em><b>Samples</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.sequencing.grouping.Sample},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples</em>' map.
	 * @see easyflow.sequencing.SequencingPackage#getMetaData_Samples()
	 * @model mapType="easyflow.sequencing.grouping.StringToSampleMap<org.eclipse.emf.ecore.EString, easyflow.sequencing.grouping.Sample>"
	 * @generated
	 */
	EMap<String, Sample> getSamples();

	/**
	 * Returns the value of the '<em><b>Records</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.sequencing.grouping.Record},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' map.
	 * @see easyflow.sequencing.SequencingPackage#getMetaData_Records()
	 * @model mapType="easyflow.sequencing.grouping.StringToRecordMap<org.eclipse.emf.ecore.EString, easyflow.sequencing.grouping.Record>"
	 * @generated
	 */
	EMap<String, Record> getRecords();

	/**
	 * Returns the value of the '<em><b>Read Groups</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.sequencing.grouping.ReadGroup},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Groups</em>' map.
	 * @see easyflow.sequencing.SequencingPackage#getMetaData_ReadGroups()
	 * @model mapType="easyflow.sequencing.grouping.StringToReadGroupMap<org.eclipse.emf.ecore.EString, easyflow.sequencing.grouping.ReadGroup>"
	 * @generated
	 */
	EMap<String, ReadGroup> getReadGroups();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.sequencing.grouping.Library},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' map.
	 * @see easyflow.sequencing.SequencingPackage#getMetaData_Libraries()
	 * @model mapType="easyflow.sequencing.grouping.StringToLibraryMap<org.eclipse.emf.ecore.EString, easyflow.sequencing.grouping.Library>"
	 * @generated
	 */
	EMap<String, Library> getLibraries();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.sequencing.grouping.Group},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' map.
	 * @see easyflow.sequencing.SequencingPackage#getMetaData_Groups()
	 * @model mapType="easyflow.sequencing.grouping.StringToGroupMap<org.eclipse.emf.ecore.EString, easyflow.sequencing.grouping.Group>"
	 * @generated
	 */
	EMap<String, Group> getGroups();

} // MetaData
