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
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.Library#getOuterDistance <em>Outer Distance</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Library#isPairedEnd <em>Paired End</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Library#getReadLength <em>Read Length</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Library#getReadType <em>Read Type</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Library#getSamples <em>Samples</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Library#getGroups <em>Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Library#getReadGroups <em>Read Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Library#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.sequencing.grouping.GroupingPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends GroupingCriterion, IGroupingCriterion {

	/**
	 * Returns the value of the '<em><b>Outer Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Distance</em>' attribute.
	 * @see #setOuterDistance(String)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getLibrary_OuterDistance()
	 * @model
	 * @generated
	 */
	String getOuterDistance();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.Library#getOuterDistance <em>Outer Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Distance</em>' attribute.
	 * @see #getOuterDistance()
	 * @generated
	 */
	void setOuterDistance(String value);

	/**
	 * Returns the value of the '<em><b>Paired End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paired End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paired End</em>' attribute.
	 * @see #setPairedEnd(boolean)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getLibrary_PairedEnd()
	 * @model
	 * @generated
	 */
	boolean isPairedEnd();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.Library#isPairedEnd <em>Paired End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paired End</em>' attribute.
	 * @see #isPairedEnd()
	 * @generated
	 */
	void setPairedEnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Read Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Length</em>' attribute.
	 * @see #setReadLength(int)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getLibrary_ReadLength()
	 * @model
	 * @generated
	 */
	int getReadLength();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.Library#getReadLength <em>Read Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Length</em>' attribute.
	 * @see #getReadLength()
	 * @generated
	 */
	void setReadLength(int value);

	/**
	 * Returns the value of the '<em><b>Read Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Type</em>' attribute.
	 * @see #setReadType(String)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getLibrary_ReadType()
	 * @model
	 * @generated
	 */
	String getReadType();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.Library#getReadType <em>Read Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Type</em>' attribute.
	 * @see #getReadType()
	 * @generated
	 */
	void setReadType(String value);

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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getLibrary_Samples()
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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getLibrary_Groups()
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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getLibrary_ReadGroups()
	 * @model
	 * @generated
	 */
	EList<ReadGroup> getReadGroups();

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
	 * @see easyflow.sequencing.grouping.GroupingPackage#getLibrary_Records()
	 * @model
	 * @generated
	 */
	EList<Record> getRecords();
} // Library
