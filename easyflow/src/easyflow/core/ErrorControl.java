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
 * A representation of the model object '<em><b>Error Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.ErrorControl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.core.ErrorControl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.core.ErrorControl#getCategory <em>Category</em>}</li>
 *   <li>{@link easyflow.core.ErrorControl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link easyflow.core.ErrorControl#getValNum <em>Val Num</em>}</li>
 *   <li>{@link easyflow.core.ErrorControl#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getErrorControl()
 * @model
 * @generated
 */
public interface ErrorControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see easyflow.core.CorePackage#getErrorControl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.core.ErrorControl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see easyflow.core.CorePackage#getErrorControl_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link easyflow.core.ErrorControl#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link easyflow.core.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see easyflow.core.Category
	 * @see #setCategory(Category)
	 * @see easyflow.core.CorePackage#getErrorControl_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link easyflow.core.ErrorControl#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see easyflow.core.Category
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link easyflow.core.Severity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see easyflow.core.Severity
	 * @see #setSeverity(Severity)
	 * @see easyflow.core.CorePackage#getErrorControl_Severity()
	 * @model
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link easyflow.core.ErrorControl#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see easyflow.core.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

	/**
	 * Returns the value of the '<em><b>Val Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val Num</em>' attribute.
	 * @see #setValNum(int)
	 * @see easyflow.core.CorePackage#getErrorControl_ValNum()
	 * @model
	 * @generated
	 */
	int getValNum();

	/**
	 * Sets the value of the '{@link easyflow.core.ErrorControl#getValNum <em>Val Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Num</em>' attribute.
	 * @see #getValNum()
	 * @generated
	 */
	void setValNum(int value);

	/**
	 * Returns the value of the '<em><b>Vals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vals</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vals</em>' attribute list.
	 * @see easyflow.core.CorePackage#getErrorControl_Vals()
	 * @model
	 * @generated
	 */
	EList<String> getVals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateDescription();

} // ErrorControl
