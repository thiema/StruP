/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui;

import easyflow.sequencing.RefBasedProjectMetaData;

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
 *   <li>{@link easyflow.ui.ResequencingProject#getRefBasedProjectMetaData <em>Ref Based Project Meta Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.ui.UiPackage#getResequencingProject()
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
	 * @see easyflow.ui.UiPackage#getResequencingProject_RefBasedProjectMetaData()
	 * @model
	 * @generated
	 */
	EList<RefBasedProjectMetaData> getRefBasedProjectMetaData();

} // ResequencingProject
