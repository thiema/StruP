/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing;

import easyflow.ui.DefaultProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resequencing Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.sequencing.ResequencingProject#getRefBasedProjectMetaData <em>Ref Based Project Meta Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.sequencing.SequencingPackage#getResequencingProject()
 * @model
 * @generated
 */
public interface ResequencingProject extends DefaultProject {
	/**
	 * Returns the value of the '<em><b>Ref Based Project Meta Data</b></em>' reference list.
	 * The list contents are of type {@link easyflow.sequencing.RefBasedProjectMetaData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Based Project Meta Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Based Project Meta Data</em>' reference list.
	 * @see easyflow.sequencing.SequencingPackage#getResequencingProject_RefBasedProjectMetaData()
	 * @model
	 * @generated
	 */
	EList<RefBasedProjectMetaData> getRefBasedProjectMetaData();

} // ResequencingProject
