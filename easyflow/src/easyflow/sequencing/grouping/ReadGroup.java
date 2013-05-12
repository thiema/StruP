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
 * A representation of the model object '<em><b>Read Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.ReadGroup#getPlatform <em>Platform</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.ReadGroup#getPlatformUnit <em>Platform Unit</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.ReadGroup#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.ReadGroup#getSamples <em>Samples</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.ReadGroup#getGroups <em>Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.ReadGroup#getLibraries <em>Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.sequencing.grouping.GroupingPackage#getReadGroup()
 * @model
 * @generated
 */
public interface ReadGroup extends GroupingCriterion, IGroupingCriterion {

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getReadGroup_Platform()
	 * @model
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.ReadGroup#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Platform Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Unit</em>' attribute.
	 * @see #setPlatformUnit(String)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getReadGroup_PlatformUnit()
	 * @model
	 * @generated
	 */
	String getPlatformUnit();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.ReadGroup#getPlatformUnit <em>Platform Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Unit</em>' attribute.
	 * @see #getPlatformUnit()
	 * @generated
	 */
	void setPlatformUnit(String value);

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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getReadGroup_Records()
	 * @model
	 * @generated
	 */
	EList<Record> getRecords();

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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getReadGroup_Samples()
	 * @model
	 * @generated
	 */
	EList<Sample> getSamples();

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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getReadGroup_Groups()
	 * @model
	 * @generated
	 */
	EList<Group> getGroups();

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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getReadGroup_Libraries()
	 * @model
	 * @generated
	 */
	EList<Library> getLibraries();
} // ReadGroup
