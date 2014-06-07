/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.makeflow;

import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.IExecutionSystem;
import easyflow.tool.Tool;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Makeflow</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see easyflow.execution.makeflow.MakeflowPackage#getMakeflow()
 * @model
 * @generated
 */
public interface Makeflow extends IExecutionSystem, DefaultExecutionSystem {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> getDependencies(Tool tool);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> getTargets(Tool tool);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	String createRule() throws ParameterNotFoundException, NoValidInOutDataException;
} // Makeflow
