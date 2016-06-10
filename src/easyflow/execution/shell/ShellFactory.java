/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.shell;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.execution.shell.ShellPackage
 * @generated
 */
public interface ShellFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShellFactory eINSTANCE = easyflow.execution.shell.impl.ShellFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shell</em>'.
	 * @generated
	 */
	Shell createShell();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ShellPackage getShellPackage();

} //ShellFactory
