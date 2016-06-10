/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.metadata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProject Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The IProjectInterface provides an Interface for reading project specific metadata. In case of resequencing project it might hold information on the reference sequence and its annotation.
 * <!-- end-model-doc -->
 *
 *
 * @see easyflow.metadata.MetadataPackage#getIProjectMetaData()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IProjectMetaData extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void readMetaData();

} // IProjectMetaData
