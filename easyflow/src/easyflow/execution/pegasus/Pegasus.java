/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.pegasus;

import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.IExecutionSystem;

import java.net.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pegasus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.execution.pegasus.Pegasus#getSiteCatalog <em>Site Catalog</em>}</li>
 *   <li>{@link easyflow.execution.pegasus.Pegasus#getReplicaCatalog <em>Replica Catalog</em>}</li>
 *   <li>{@link easyflow.execution.pegasus.Pegasus#getTransformationCatalog <em>Transformation Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.execution.pegasus.PegasusPackage#getPegasus()
 * @model
 * @generated
 */
public interface Pegasus extends IExecutionSystem, DefaultExecutionSystem {
	/**
	 * Returns the value of the '<em><b>Site Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Catalog</em>' attribute.
	 * @see #setSiteCatalog(URI)
	 * @see easyflow.execution.pegasus.PegasusPackage#getPegasus_SiteCatalog()
	 * @model dataType="easyflow.URI"
	 * @generated
	 */
	URI getSiteCatalog();

	/**
	 * Sets the value of the '{@link easyflow.execution.pegasus.Pegasus#getSiteCatalog <em>Site Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Catalog</em>' attribute.
	 * @see #getSiteCatalog()
	 * @generated
	 */
	void setSiteCatalog(URI value);

	/**
	 * Returns the value of the '<em><b>Replica Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replica Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replica Catalog</em>' attribute.
	 * @see #setReplicaCatalog(URI)
	 * @see easyflow.execution.pegasus.PegasusPackage#getPegasus_ReplicaCatalog()
	 * @model dataType="easyflow.URI"
	 * @generated
	 */
	URI getReplicaCatalog();

	/**
	 * Sets the value of the '{@link easyflow.execution.pegasus.Pegasus#getReplicaCatalog <em>Replica Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replica Catalog</em>' attribute.
	 * @see #getReplicaCatalog()
	 * @generated
	 */
	void setReplicaCatalog(URI value);

	/**
	 * Returns the value of the '<em><b>Transformation Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Catalog</em>' attribute.
	 * @see #setTransformationCatalog(URI)
	 * @see easyflow.execution.pegasus.PegasusPackage#getPegasus_TransformationCatalog()
	 * @model dataType="easyflow.URI"
	 * @generated
	 */
	URI getTransformationCatalog();

	/**
	 * Sets the value of the '{@link easyflow.execution.pegasus.Pegasus#getTransformationCatalog <em>Transformation Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Catalog</em>' attribute.
	 * @see #getTransformationCatalog()
	 * @generated
	 */
	void setTransformationCatalog(URI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void planWorkflow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateSiteCatalog();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateReplicaCatalog();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateTransformationCatalog();

} // Pegasus
