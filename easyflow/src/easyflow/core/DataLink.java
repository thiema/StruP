/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import easyflow.traversal.TraversalChunk;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.DataLink#getDataPort <em>Data Port</em>}</li>
 *   <li>{@link easyflow.core.DataLink#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.core.DataLink#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.core.DataLink#getTraversalName <em>Traversal Name</em>}</li>
 *   <li>{@link easyflow.core.DataLink#getGroupingStr <em>Grouping Str</em>}</li>
 *   <li>{@link easyflow.core.DataLink#getParentGroupingStr <em>Parent Grouping Str</em>}</li>
 *   <li>{@link easyflow.core.DataLink#isIdenticalGrouping <em>Identical Grouping</em>}</li>
 *   <li>{@link easyflow.core.DataLink#getNotPermittedConditions <em>Not Permitted Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getDataLink()
 * @model
 * @generated
 */
public interface DataLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Port</em>' reference.
	 * @see #setDataPort(DataPort)
	 * @see easyflow.core.CorePackage#getDataLink_DataPort()
	 * @model
	 * @generated
	 */
	DataPort getDataPort();

	/**
	 * Sets the value of the '{@link easyflow.core.DataLink#getDataPort <em>Data Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Port</em>' reference.
	 * @see #getDataPort()
	 * @generated
	 */
	void setDataPort(DataPort value);

	/**
	 * Returns the value of the '<em><b>Chunks</b></em>' reference list.
	 * The list contents are of type {@link easyflow.traversal.TraversalChunk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunks</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunks</em>' reference list.
	 * @see easyflow.core.CorePackage#getDataLink_Chunks()
	 * @model
	 * @generated
	 */
	EList<TraversalChunk> getChunks();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see easyflow.core.CorePackage#getDataLink_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link easyflow.core.DataLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Traversal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversal Name</em>' attribute.
	 * @see #setTraversalName(String)
	 * @see easyflow.core.CorePackage#getDataLink_TraversalName()
	 * @model
	 * @generated
	 */
	String getTraversalName();

	/**
	 * Sets the value of the '{@link easyflow.core.DataLink#getTraversalName <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traversal Name</em>' attribute.
	 * @see #getTraversalName()
	 * @generated
	 */
	void setTraversalName(String value);

	/**
	 * Returns the value of the '<em><b>Grouping Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Str</em>' attribute.
	 * @see #setGroupingStr(String)
	 * @see easyflow.core.CorePackage#getDataLink_GroupingStr()
	 * @model
	 * @generated
	 */
	String getGroupingStr();

	/**
	 * Sets the value of the '{@link easyflow.core.DataLink#getGroupingStr <em>Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Str</em>' attribute.
	 * @see #getGroupingStr()
	 * @generated
	 */
	void setGroupingStr(String value);

	/**
	 * Returns the value of the '<em><b>Parent Grouping Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Grouping Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Grouping Str</em>' attribute.
	 * @see #setParentGroupingStr(String)
	 * @see easyflow.core.CorePackage#getDataLink_ParentGroupingStr()
	 * @model
	 * @generated
	 */
	String getParentGroupingStr();

	/**
	 * Sets the value of the '{@link easyflow.core.DataLink#getParentGroupingStr <em>Parent Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Grouping Str</em>' attribute.
	 * @see #getParentGroupingStr()
	 * @generated
	 */
	void setParentGroupingStr(String value);

	/**
	 * Returns the value of the '<em><b>Identical Grouping</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identical Grouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identical Grouping</em>' attribute.
	 * @see #setIdenticalGrouping(boolean)
	 * @see easyflow.core.CorePackage#getDataLink_IdenticalGrouping()
	 * @model default="false"
	 * @generated
	 */
	boolean isIdenticalGrouping();

	/**
	 * Sets the value of the '{@link easyflow.core.DataLink#isIdenticalGrouping <em>Identical Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identical Grouping</em>' attribute.
	 * @see #isIdenticalGrouping()
	 * @generated
	 */
	void setIdenticalGrouping(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Permitted Conditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Permitted Conditions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Permitted Conditions</em>' attribute list.
	 * @see easyflow.core.CorePackage#getDataLink_NotPermittedConditions()
	 * @model
	 * @generated
	 */
	EList<String> getNotPermittedConditions();

} // DataLink
