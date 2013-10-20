/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;

import com.mxgraph.view.mxGraph.mxICellVisitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IExecution System</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see easyflow.execution.ExecutionPackage#getIExecutionSystem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IExecutionSystem extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createWorkflow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void executeWorkflow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="easyflow.mxICellVisitor"
	 * @generated
	 */
	mxICellVisitor getJgraphxVisitor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model commandLinePartsMapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	String createCommandLine(String commandPattern, EMap<String, String> commandLineParts);

} // IExecutionSystem
