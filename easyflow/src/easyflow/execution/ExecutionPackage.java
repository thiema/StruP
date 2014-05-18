/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see easyflow.execution.ExecutionFactory
 * @model kind="package"
 * @generated
 */
public interface ExecutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "execution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/execution/1.0.0";

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
	ExecutionPackage eINSTANCE = easyflow.execution.impl.ExecutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.execution.impl.DefaultExecutionSystemImpl <em>Default Execution System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.execution.impl.DefaultExecutionSystemImpl
	 * @see easyflow.execution.impl.ExecutionPackageImpl#getDefaultExecutionSystem()
	 * @generated
	 */
	int DEFAULT_EXECUTION_SYSTEM = 0;

	/**
	 * The meta object id for the '{@link easyflow.execution.IExecutionSystem <em>IExecution System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.execution.IExecutionSystem
	 * @see easyflow.execution.impl.ExecutionPackageImpl#getIExecutionSystem()
	 * @generated
	 */
	int IEXECUTION_SYSTEM = 1;

	/**
	 * The number of structural features of the '<em>IExecution System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXECUTION_SYSTEM_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM__PROJECT = IEXECUTION_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM__LOGGER = IEXECUTION_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM__WRITER = IEXECUTION_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Default Execution System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM_FEATURE_COUNT = IEXECUTION_SYSTEM_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link easyflow.execution.DefaultExecutionSystem <em>Default Execution System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Execution System</em>'.
	 * @see easyflow.execution.DefaultExecutionSystem
	 * @generated
	 */
	EClass getDefaultExecutionSystem();

	/**
	 * Returns the meta object for the reference '{@link easyflow.execution.DefaultExecutionSystem#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see easyflow.execution.DefaultExecutionSystem#getProject()
	 * @see #getDefaultExecutionSystem()
	 * @generated
	 */
	EReference getDefaultExecutionSystem_Project();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.execution.DefaultExecutionSystem#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.execution.DefaultExecutionSystem#getLogger()
	 * @see #getDefaultExecutionSystem()
	 * @generated
	 */
	EAttribute getDefaultExecutionSystem_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.execution.DefaultExecutionSystem#getWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writer</em>'.
	 * @see easyflow.execution.DefaultExecutionSystem#getWriter()
	 * @see #getDefaultExecutionSystem()
	 * @generated
	 */
	EAttribute getDefaultExecutionSystem_Writer();

	/**
	 * Returns the meta object for class '{@link easyflow.execution.IExecutionSystem <em>IExecution System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IExecution System</em>'.
	 * @see easyflow.execution.IExecutionSystem
	 * @generated
	 */
	EClass getIExecutionSystem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutionFactory getExecutionFactory();

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
		 * The meta object literal for the '{@link easyflow.execution.impl.DefaultExecutionSystemImpl <em>Default Execution System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.execution.impl.DefaultExecutionSystemImpl
		 * @see easyflow.execution.impl.ExecutionPackageImpl#getDefaultExecutionSystem()
		 * @generated
		 */
		EClass DEFAULT_EXECUTION_SYSTEM = eINSTANCE.getDefaultExecutionSystem();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_EXECUTION_SYSTEM__PROJECT = eINSTANCE.getDefaultExecutionSystem_Project();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_EXECUTION_SYSTEM__LOGGER = eINSTANCE.getDefaultExecutionSystem_Logger();

		/**
		 * The meta object literal for the '<em><b>Writer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_EXECUTION_SYSTEM__WRITER = eINSTANCE.getDefaultExecutionSystem_Writer();

		/**
		 * The meta object literal for the '{@link easyflow.execution.IExecutionSystem <em>IExecution System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.execution.IExecutionSystem
		 * @see easyflow.execution.impl.ExecutionPackageImpl#getIExecutionSystem()
		 * @generated
		 */
		EClass IEXECUTION_SYSTEM = eINSTANCE.getIExecutionSystem();

	}

} //ExecutionPackage
