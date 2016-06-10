/**
 */
package easyflow.traversal;

import com.mxgraph.model.mxICell;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.traversal.TraversalDependency#getNumber <em>Number</em>}</li>
 *   <li>{@link easyflow.traversal.TraversalDependency#getProcessedCells <em>Processed Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.traversal.TraversalPackage#getTraversalDependency()
 * @model
 * @generated
 */
public interface TraversalDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see easyflow.traversal.TraversalPackage#getTraversalDependency_Number()
	 * @model default="0"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link easyflow.traversal.TraversalDependency#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Processed Cells</b></em>' attribute list.
	 * The list contents are of type {@link com.mxgraph.model.mxICell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed Cells</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed Cells</em>' attribute list.
	 * @see easyflow.traversal.TraversalPackage#getTraversalDependency_ProcessedCells()
	 * @model dataType="easyflow.mxICell"
	 * @generated
	 */
	EList<mxICell> getProcessedCells();

} // TraversalDependency
