/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.pegasus;

import easyflow.execution.ExecutionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see easyflow.execution.pegasus.PegasusFactory
 * @model kind="package"
 * @generated
 */
public interface PegasusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pegasus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/execution/pegasus/1.0.0";

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
	PegasusPackage eINSTANCE = easyflow.execution.pegasus.impl.PegasusPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.execution.pegasus.impl.PegasusImpl <em>Pegasus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.execution.pegasus.impl.PegasusImpl
	 * @see easyflow.execution.pegasus.impl.PegasusPackageImpl#getPegasus()
	 * @generated
	 */
	int PEGASUS = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__PROJECT = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__LOGGER = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__WRITER = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Site Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__SITE_CATALOG = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Replica Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__REPLICA_CATALOG = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transformation Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__TRANSFORMATION_CATALOG = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Pegasus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS_FEATURE_COUNT = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link easyflow.execution.pegasus.Pegasus <em>Pegasus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pegasus</em>'.
	 * @see easyflow.execution.pegasus.Pegasus
	 * @generated
	 */
	EClass getPegasus();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.execution.pegasus.Pegasus#getSiteCatalog <em>Site Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Catalog</em>'.
	 * @see easyflow.execution.pegasus.Pegasus#getSiteCatalog()
	 * @see #getPegasus()
	 * @generated
	 */
	EAttribute getPegasus_SiteCatalog();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.execution.pegasus.Pegasus#getReplicaCatalog <em>Replica Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replica Catalog</em>'.
	 * @see easyflow.execution.pegasus.Pegasus#getReplicaCatalog()
	 * @see #getPegasus()
	 * @generated
	 */
	EAttribute getPegasus_ReplicaCatalog();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.execution.pegasus.Pegasus#getTransformationCatalog <em>Transformation Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Catalog</em>'.
	 * @see easyflow.execution.pegasus.Pegasus#getTransformationCatalog()
	 * @see #getPegasus()
	 * @generated
	 */
	EAttribute getPegasus_TransformationCatalog();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PegasusFactory getPegasusFactory();

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
		 * The meta object literal for the '{@link easyflow.execution.pegasus.impl.PegasusImpl <em>Pegasus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.execution.pegasus.impl.PegasusImpl
		 * @see easyflow.execution.pegasus.impl.PegasusPackageImpl#getPegasus()
		 * @generated
		 */
		EClass PEGASUS = eINSTANCE.getPegasus();

		/**
		 * The meta object literal for the '<em><b>Site Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEGASUS__SITE_CATALOG = eINSTANCE.getPegasus_SiteCatalog();

		/**
		 * The meta object literal for the '<em><b>Replica Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEGASUS__REPLICA_CATALOG = eINSTANCE.getPegasus_ReplicaCatalog();

		/**
		 * The meta object literal for the '<em><b>Transformation Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEGASUS__TRANSFORMATION_CATALOG = eINSTANCE.getPegasus_TransformationCatalog();

	}

} //PegasusPackage
