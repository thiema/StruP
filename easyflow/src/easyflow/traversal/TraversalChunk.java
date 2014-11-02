/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal;

import easyflow.metadata.GroupingInstance;
import org.apache.log4j.Logger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.traversal.TraversalChunk#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.traversal.TraversalChunk#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.traversal.TraversalChunk#isDerived1by1 <em>Derived1by1</em>}</li>
 *   <li>{@link easyflow.traversal.TraversalChunk#getGroupingInstance <em>Grouping Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.traversal.TraversalPackage#getTraversalChunk()
 * @model
 * @generated
 */
public interface TraversalChunk extends EObject {
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
	 * @see easyflow.traversal.TraversalPackage#getTraversalChunk_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.traversal.TraversalChunk#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see #setLogger(Logger)
	 * @see easyflow.traversal.TraversalPackage#getTraversalChunk_Logger()
	 * @model dataType="easyflow.Logger" transient="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link easyflow.traversal.TraversalChunk#getLogger <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' attribute.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

	/**
	 * Returns the value of the '<em><b>Derived1by1</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived1by1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived1by1</em>' attribute.
	 * @see #setDerived1by1(boolean)
	 * @see easyflow.traversal.TraversalPackage#getTraversalChunk_Derived1by1()
	 * @model default="false"
	 * @generated
	 */
	boolean isDerived1by1();

	/**
	 * Sets the value of the '{@link easyflow.traversal.TraversalChunk#isDerived1by1 <em>Derived1by1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived1by1</em>' attribute.
	 * @see #isDerived1by1()
	 * @generated
	 */
	void setDerived1by1(boolean value);

	/**
	 * Returns the value of the '<em><b>Grouping Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Instance</em>' reference.
	 * @see #setGroupingInstance(GroupingInstance)
	 * @see easyflow.traversal.TraversalPackage#getTraversalChunk_GroupingInstance()
	 * @model
	 * @generated
	 */
	GroupingInstance getGroupingInstance();

	/**
	 * Sets the value of the '{@link easyflow.traversal.TraversalChunk#getGroupingInstance <em>Grouping Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Instance</em>' reference.
	 * @see #getGroupingInstance()
	 * @generated
	 */
	void setGroupingInstance(GroupingInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GroupingInstance asGroupingInstance();

} // TraversalChunk
