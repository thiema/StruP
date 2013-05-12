/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouping Instance List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All instances that belong to a grouping.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.GroupingInstanceList#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getGroupingInstanceList()
 * @model
 * @generated
 */
public interface GroupingInstanceList extends EObject {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.GroupingInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see easyflow.core.CorePackage#getGroupingInstanceList_Instances()
	 * @model
	 * @generated
	 */
	EList<GroupingInstance> getInstances();

} // GroupingInstanceList
