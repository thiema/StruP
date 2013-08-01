/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.shell;

import easyflow.core.Task;
import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.IExecutionSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see easyflow.execution.shell.ShellPackage#getShell()
 * @model
 * @generated
 */
public interface Shell extends IExecutionSystem, DefaultExecutionSystem {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateCommandLine(Task task);
} // Shell
