/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.makeflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.execution.makeflow.MakeflowPackage
 * @generated
 */
public interface MakeflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MakeflowFactory eINSTANCE = easyflow.execution.makeflow.impl.MakeflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Makeflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Makeflow</em>'.
	 * @generated
	 */
	Makeflow createMakeflow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MakeflowPackage getMakeflowPackage();

} //MakeflowFactory
