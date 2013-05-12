/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.dataformat;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see easyflow.sequencing.dataformat.DataformatFactory
 * @model kind="package"
 * @generated
 */
public interface DataformatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataformat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/sequencing/dataformat/easyflow.core/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "easyflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataformatPackage eINSTANCE = easyflow.sequencing.dataformat.impl.DataformatPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.sequencing.dataformat.DataFormat <em>Data Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.dataformat.DataFormat
	 * @see easyflow.sequencing.dataformat.impl.DataformatPackageImpl#getDataFormat()
	 * @generated
	 */
	int DATA_FORMAT = 0;


	/**
	 * Returns the meta object for enum '{@link easyflow.sequencing.dataformat.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Format</em>'.
	 * @see easyflow.sequencing.dataformat.DataFormat
	 * @generated
	 */
	EEnum getDataFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataformatFactory getDataformatFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link easyflow.sequencing.dataformat.DataFormat <em>Data Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.dataformat.DataFormat
		 * @see easyflow.sequencing.dataformat.impl.DataformatPackageImpl#getDataFormat()
		 * @generated
		 */
		EEnum DATA_FORMAT = eINSTANCE.getDataFormat();

	}

} //DataformatPackage
