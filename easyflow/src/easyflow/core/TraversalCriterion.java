/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traversal Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.TraversalCriterion#getOperation <em>Operation</em>}</li>
 *   <li>{@link easyflow.core.TraversalCriterion#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.core.TraversalCriterion#getChunkSource <em>Chunk Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getTraversalCriterion()
 * @model
 * @generated
 */
public interface TraversalCriterion extends GroupingCriterion {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(TraversalOperation)
	 * @see easyflow.core.CorePackage#getTraversalCriterion_Operation()
	 * @model
	 * @generated
	 */
	TraversalOperation getOperation();

	/**
	 * Sets the value of the '{@link easyflow.core.TraversalCriterion#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TraversalOperation value);

	/**
	 * Returns the value of the '<em><b>Chunks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.TraversalChunk},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunks</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunks</em>' map.
	 * @see easyflow.core.CorePackage#getTraversalCriterion_Chunks()
	 * @model mapType="easyflow.core.StringToChunkMap<org.eclipse.emf.ecore.EString, easyflow.core.TraversalChunk>"
	 * @generated
	 */
	EMap<String, TraversalChunk> getChunks();

	/**
	 * Returns the value of the '<em><b>Chunk Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk Source</em>' attribute.
	 * @see #setChunkSource(String)
	 * @see easyflow.core.CorePackage#getTraversalCriterion_ChunkSource()
	 * @model
	 * @generated
	 */
	String getChunkSource();

	/**
	 * Sets the value of the '{@link easyflow.core.TraversalCriterion#getChunkSource <em>Chunk Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunk Source</em>' attribute.
	 * @see #getChunkSource()
	 * @generated
	 */
	void setChunkSource(String value);

} // TraversalCriterion
