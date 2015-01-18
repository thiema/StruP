/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.data;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.data.DataMatch#getParentData <em>Parent Data</em>}</li>
 *   <li>{@link easyflow.data.DataMatch#getChildData <em>Child Data</em>}</li>
 *   <li>{@link easyflow.data.DataMatch#getScore <em>Score</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.data.DataPackage#getDataMatch()
 * @model
 * @generated
 */
public interface DataMatch extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Data</em>' reference.
	 * @see #setParentData(Data)
	 * @see easyflow.data.DataPackage#getDataMatch_ParentData()
	 * @model
	 * @generated
	 */
	Data getParentData();

	/**
	 * Sets the value of the '{@link easyflow.data.DataMatch#getParentData <em>Parent Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Data</em>' reference.
	 * @see #getParentData()
	 * @generated
	 */
	void setParentData(Data value);

	/**
	 * Returns the value of the '<em><b>Child Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Data</em>' reference.
	 * @see #setChildData(Data)
	 * @see easyflow.data.DataPackage#getDataMatch_ChildData()
	 * @model
	 * @generated
	 */
	Data getChildData();

	/**
	 * Sets the value of the '{@link easyflow.data.DataMatch#getChildData <em>Child Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Data</em>' reference.
	 * @see #getChildData()
	 * @generated
	 */
	void setChildData(Data value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(long)
	 * @see easyflow.data.DataPackage#getDataMatch_Score()
	 * @model default="0"
	 * @generated
	 */
	long getScore();

	/**
	 * Sets the value of the '{@link easyflow.data.DataMatch#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model constraintsMapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	long computeScore(EMap<String, String> constraints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPipable();

} // DataMatch
