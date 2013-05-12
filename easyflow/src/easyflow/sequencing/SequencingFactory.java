/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.sequencing.SequencingPackage
 * @generated
 */
public interface SequencingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequencingFactory eINSTANCE = easyflow.sequencing.impl.SequencingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ref Based Project Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Based Project Meta Data</em>'.
	 * @generated
	 */
	RefBasedProjectMetaData createRefBasedProjectMetaData();

	/**
	 * Returns a new object of class '<em>Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Data</em>'.
	 * @generated
	 */
	MetaData createMetaData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SequencingPackage getSequencingPackage();

} //SequencingFactory
