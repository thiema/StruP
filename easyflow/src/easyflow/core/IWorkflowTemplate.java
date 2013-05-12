/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.eclipse.emf.common.util.EList;
import java.io.FileNotFoundException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IWorkflow Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The IWorkflowTemplate provides an Interface to read a description of the workflow.
 * <!-- end-model-doc -->
 *
 *
 * @see easyflow.core.CorePackage#getIWorkflowTemplate()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IWorkflowTemplate extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model defaultGroupingCriteriaMany="true"
	 * @generated
	 */
	void readTemplate(String mode, EList<String> defaultGroupingCriteria);

} // IWorkflowTemplate
