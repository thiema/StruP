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
 * A representation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.Sample#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Sample#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Sample#getGroups <em>Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Sample#getReadGroups <em>Read Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.sequencing.grouping.GroupingPackage#getSample()
 * @model
 * @generated
 */
public interface Sample extends GroupingCriterion, IGroupingCriterion {

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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getSample_Records()
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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getSample_Libraries()
	 * @model
	 * @generated
	 */
	EList<Library> getLibraries();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link easyflow.sequencing.grouping.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see easyflow.sequencing.grouping.GroupingPackage#getSample_Groups()
	 * @model
	 * @generated
	 */
	EList<Group> getGroups();

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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getSample_ReadGroups()
	 * @model
	 * @generated
	 */
	EList<ReadGroup> getReadGroups();
} // Sample
