/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxCell;
import easyflow.sequencing.MetaData;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traversal Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.TraversalEvent#getMergeTask <em>Merge Task</em>}</li>
 *   <li>{@link easyflow.core.TraversalEvent#getSplitTask <em>Split Task</em>}</li>
 *   <li>{@link easyflow.core.TraversalEvent#getParentTask <em>Parent Task</em>}</li>
 *   <li>{@link easyflow.core.TraversalEvent#getTraversalCriterion <em>Traversal Criterion</em>}</li>
 *   <li>{@link easyflow.core.TraversalEvent#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.TraversalEvent#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.core.TraversalEvent#isProcessed <em>Processed</em>}</li>
 *   <li>{@link easyflow.core.TraversalEvent#isQueued <em>Queued</em>}</li>
 *   <li>{@link easyflow.core.TraversalEvent#isFoundMergeTask <em>Found Merge Task</em>}</li>
 *   <li>{@link easyflow.core.TraversalEvent#getParentCells <em>Parent Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getTraversalEvent()
 * @model
 * @generated
 */
public interface TraversalEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Merge Task</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Task</em>' reference list.
	 * @see easyflow.core.CorePackage#getTraversalEvent_MergeTask()
	 * @model
	 * @generated
	 */
	EList<Task> getMergeTask();

	/**
	 * Returns the value of the '<em><b>Split Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Task</em>' reference.
	 * @see #setSplitTask(Task)
	 * @see easyflow.core.CorePackage#getTraversalEvent_SplitTask()
	 * @model
	 * @generated
	 */
	Task getSplitTask();

	/**
	 * Sets the value of the '{@link easyflow.core.TraversalEvent#getSplitTask <em>Split Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Task</em>' reference.
	 * @see #getSplitTask()
	 * @generated
	 */
	void setSplitTask(Task value);

	/**
	 * Returns the value of the '<em><b>Parent Task</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Task</em>' reference list.
	 * @see easyflow.core.CorePackage#getTraversalEvent_ParentTask()
	 * @model
	 * @generated
	 */
	EList<Task> getParentTask();

	/**
	 * Returns the value of the '<em><b>Traversal Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversal Criterion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversal Criterion</em>' reference.
	 * @see #setTraversalCriterion(TraversalCriterion)
	 * @see easyflow.core.CorePackage#getTraversalEvent_TraversalCriterion()
	 * @model
	 * @generated
	 */
	TraversalCriterion getTraversalCriterion();

	/**
	 * Sets the value of the '{@link easyflow.core.TraversalEvent#getTraversalCriterion <em>Traversal Criterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traversal Criterion</em>' reference.
	 * @see #getTraversalCriterion()
	 * @generated
	 */
	void setTraversalCriterion(TraversalCriterion value);

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
	 * @see easyflow.core.CorePackage#getTraversalEvent_Logger()
	 * @model dataType="easyflow.Logger" transient="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link easyflow.core.TraversalEvent#getLogger <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' attribute.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' attribute.
	 * @see #setMetaData(EObject)
	 * @see easyflow.core.CorePackage#getTraversalEvent_MetaData()
	 * @model dataType="easyflow.EObject" transient="true"
	 * @generated
	 */
	EObject getMetaData();

	/**
	 * Sets the value of the '{@link easyflow.core.TraversalEvent#getMetaData <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' attribute.
	 * @see #getMetaData()
	 * @generated
	 */
	void setMetaData(EObject value);

	/**
	 * Returns the value of the '<em><b>Processed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed</em>' attribute.
	 * @see #setProcessed(boolean)
	 * @see easyflow.core.CorePackage#getTraversalEvent_Processed()
	 * @model default="false"
	 * @generated
	 */
	boolean isProcessed();

	/**
	 * Sets the value of the '{@link easyflow.core.TraversalEvent#isProcessed <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processed</em>' attribute.
	 * @see #isProcessed()
	 * @generated
	 */
	void setProcessed(boolean value);

	/**
	 * Returns the value of the '<em><b>Queued</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queued</em>' attribute.
	 * @see #setQueued(boolean)
	 * @see easyflow.core.CorePackage#getTraversalEvent_Queued()
	 * @model default="false"
	 * @generated
	 */
	boolean isQueued();

	/**
	 * Sets the value of the '{@link easyflow.core.TraversalEvent#isQueued <em>Queued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queued</em>' attribute.
	 * @see #isQueued()
	 * @generated
	 */
	void setQueued(boolean value);

	/**
	 * Returns the value of the '<em><b>Found Merge Task</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Found Merge Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Found Merge Task</em>' attribute.
	 * @see #setFoundMergeTask(boolean)
	 * @see easyflow.core.CorePackage#getTraversalEvent_FoundMergeTask()
	 * @model default="false"
	 * @generated
	 */
	boolean isFoundMergeTask();

	/**
	 * Sets the value of the '{@link easyflow.core.TraversalEvent#isFoundMergeTask <em>Found Merge Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Found Merge Task</em>' attribute.
	 * @see #isFoundMergeTask()
	 * @generated
	 */
	void setFoundMergeTask(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Cells</b></em>' attribute list.
	 * The list contents are of type {@link com.mxgraph.model.mxICell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Cells</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Cells</em>' attribute list.
	 * @see easyflow.core.CorePackage#getTraversalEvent_ParentCells()
	 * @model dataType="easyflow.mxICell" transient="true"
	 * @generated
	 */
	EList<mxICell> getParentCells();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean applyMetadata();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void readChunks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isGrouping();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isParent(Task parentTask, String traversalChunkName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getType();

} // TraversalEvent
