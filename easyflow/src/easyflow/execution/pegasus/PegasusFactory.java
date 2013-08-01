/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.pegasus;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.execution.pegasus.PegasusPackage
 * @generated
 */
public interface PegasusFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PegasusFactory eINSTANCE = easyflow.execution.pegasus.impl.PegasusFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pegasus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pegasus</em>'.
	 * @generated
	 */
	Pegasus createPegasus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PegasusPackage getPegasusPackage();

} //PegasusFactory
