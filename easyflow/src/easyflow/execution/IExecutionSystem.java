/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;

import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.core.Task;
import easyflow.tool.Tool;
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
	 * @model kind="operation" dataType="easyflow.mxICellVisitor"
	 * @generated
	 */
	mxICellVisitor getJgraphxVisitor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model commandLinePartsMapType="easyflow.util.maps.StringToStringListMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	String createCommandLine(String commandPattern, EMap<String, EList<String>> commandLineParts);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String createCommandLine(String commandPattern, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String createCommandLine(String commandPattern, Tool tool);

} // IExecutionSystem
