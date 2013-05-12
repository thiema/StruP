/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.dataformat;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.sequencing.dataformat.DataformatPackage
 * @generated
 */
public interface DataformatFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataformatFactory eINSTANCE = easyflow.sequencing.dataformat.impl.DataformatFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataformatPackage getDataformatPackage();

} //DataformatFactory
