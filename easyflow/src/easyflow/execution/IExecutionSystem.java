/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;

import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.core.Task;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.tool.Tool;
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
	 * @model kind="operation" dataType="easyflow.mxICellVisitor"
	 * @generated
	 */
	mxICellVisitor getJgraphxVisitor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	String createCommandLine(String commandPattern, Task task) throws ParameterNotFoundException, NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	String createCommandLine(String commandPattern, Tool tool) throws ParameterNotFoundException, NoValidInOutDataException;

} // IExecutionSystem
