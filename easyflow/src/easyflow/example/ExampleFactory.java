/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.example;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.example.ExamplePackage
 * @generated
 */
public interface ExampleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExampleFactory eINSTANCE = easyflow.example.impl.ExampleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Examples</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examples</em>'.
	 * @generated
	 */
	Examples createExamples();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExamplePackage getExamplePackage();

} //ExampleFactory
