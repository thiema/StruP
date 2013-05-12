/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.grouping;

import easyflow.core.GroupingCriterion;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.Group#getSamples <em>Samples</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Group#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Group#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Group#getReadGroups <em>Read Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.sequencing.grouping.GroupingPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends GroupingCriterion, IGroupingCriterion {

	/**
	 * Returns the value of the '<em><b>Samples</b></em>' reference list.
	 * The list contents are of type {@link easyflow.sequencing.grouping.Sample}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples</em>' reference list.
	 * @see easyflow.sequencing.grouping.GroupingPackage#getGroup_Samples()
	 * @model
	 * @generated
	 */
	EList<Sample> getSamples();

	/**
	 * Returns the value of the '<em><b>Records</b></em>' reference list.
	 * The list contents are of type {@link easyflow.sequencing.grouping.Record}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' reference list.
	 * @see easyflow.sequencing.grouping.GroupingPackage#getGroup_Records()
	 * @model
	 * @generated
	 */
	EList<Record> getRecords();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' reference list.
	 * The list contents are of type {@link easyflow.sequencing.grouping.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' reference list.
	 * @see easyflow.sequencing.grouping.GroupingPackage#getGroup_Libraries()
	 * @model
	 * @generated
	 */
	EList<Library> getLibraries();

	/**
	 * Returns the value of the '<em><b>Read Groups</b></em>' reference list.
	 * The list contents are of type {@link easyflow.sequencing.grouping.ReadGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Groups</em>' reference list.
	 * @see easyflow.sequencing.grouping.GroupingPackage#getGroup_ReadGroups()
	 * @model
	 * @generated
	 */
	EList<ReadGroup> getReadGroups();
} // Group
