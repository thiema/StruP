/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.Condition#getForbidden <em>Forbidden</em>}</li>
 *   <li>{@link easyflow.core.Condition#getCircumventingParents <em>Circumventing Parents</em>}</li>
 *   <li>{@link easyflow.core.Condition#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Forbidden</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forbidden</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forbidden</em>' attribute list.
	 * @see easyflow.core.CorePackage#getCondition_Forbidden()
	 * @model
	 * @generated
	 */
	EList<String> getForbidden();

	/**
	 * Returns the value of the '<em><b>Circumventing Parents</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circumventing Parents</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circumventing Parents</em>' attribute list.
	 * @see easyflow.core.CorePackage#getCondition_CircumventingParents()
	 * @model
	 * @generated
	 */
	EList<String> getCircumventingParents();

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.core.CorePackage#getCondition_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isUnconditional();

} // Condition
