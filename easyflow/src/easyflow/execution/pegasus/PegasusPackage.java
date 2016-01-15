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
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__LOGGER = ExecutionPackage.IEXECUTION_SYSTEM__LOGGER;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__WRITER = ExecutionPackage.IEXECUTION_SYSTEM__WRITER;

	/**
	 * The feature id for the '<em><b>Site Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__SITE_CATALOG = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replica Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__REPLICA_CATALOG = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformation Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS__TRANSFORMATION_CATALOG = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pegasus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS_FEATURE_COUNT = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 3;


	/**
	 * The operation id for the '<em>Get Jgraphx Visitor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS___GET_JGRAPHX_VISITOR = ExecutionPackage.IEXECUTION_SYSTEM___GET_JGRAPHX_VISITOR;

	/**
	 * The operation id for the '<em>Generate Execution String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS___GENERATE_EXECUTION_STRING__RULE = ExecutionPackage.IEXECUTION_SYSTEM___GENERATE_EXECUTION_STRING__RULE;

	/**
	 * The operation id for the '<em>Plan Workflow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS___PLAN_WORKFLOW = ExecutionPackage.IEXECUTION_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Site Catalog</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS___GENERATE_SITE_CATALOG = ExecutionPackage.IEXECUTION_SYSTEM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Replica Catalog</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS___GENERATE_REPLICA_CATALOG = ExecutionPackage.IEXECUTION_SYSTEM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Transformation Catalog</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS___GENERATE_TRANSFORMATION_CATALOG = ExecutionPackage.IEXECUTION_SYSTEM_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pegasus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGASUS_OPERATION_COUNT = ExecutionPackage.IEXECUTION_SYSTEM_OPERATION_COUNT + 4;


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
	 * Returns the meta object for the '{@link easyflow.execution.pegasus.Pegasus#planWorkflow() <em>Plan Workflow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan Workflow</em>' operation.
	 * @see easyflow.execution.pegasus.Pegasus#planWorkflow()
	 * @generated
	 */
	EOperation getPegasus__PlanWorkflow();

	/**
	 * Returns the meta object for the '{@link easyflow.execution.pegasus.Pegasus#generateSiteCatalog() <em>Generate Site Catalog</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Site Catalog</em>' operation.
	 * @see easyflow.execution.pegasus.Pegasus#generateSiteCatalog()
	 * @generated
	 */
	EOperation getPegasus__GenerateSiteCatalog();

	/**
	 * Returns the meta object for the '{@link easyflow.execution.pegasus.Pegasus#generateReplicaCatalog() <em>Generate Replica Catalog</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Replica Catalog</em>' operation.
	 * @see easyflow.execution.pegasus.Pegasus#generateReplicaCatalog()
	 * @generated
	 */
	EOperation getPegasus__GenerateReplicaCatalog();

	/**
	 * Returns the meta object for the '{@link easyflow.execution.pegasus.Pegasus#generateTransformationCatalog() <em>Generate Transformation Catalog</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Transformation Catalog</em>' operation.
	 * @see easyflow.execution.pegasus.Pegasus#generateTransformationCatalog()
	 * @generated
	 */
	EOperation getPegasus__GenerateTransformationCatalog();

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

		/**
		 * The meta object literal for the '<em><b>Plan Workflow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PEGASUS___PLAN_WORKFLOW = eINSTANCE.getPegasus__PlanWorkflow();

		/**
		 * The meta object literal for the '<em><b>Generate Site Catalog</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PEGASUS___GENERATE_SITE_CATALOG = eINSTANCE.getPegasus__GenerateSiteCatalog();

		/**
		 * The meta object literal for the '<em><b>Generate Replica Catalog</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PEGASUS___GENERATE_REPLICA_CATALOG = eINSTANCE.getPegasus__GenerateReplicaCatalog();

		/**
		 * The meta object literal for the '<em><b>Generate Transformation Catalog</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PEGASUS___GENERATE_TRANSFORMATION_CATALOG = eINSTANCE.getPegasus__GenerateTransformationCatalog();

	}

} //PegasusPackage
