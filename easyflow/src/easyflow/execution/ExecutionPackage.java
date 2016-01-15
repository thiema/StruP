/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;

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
	 * The meta object id for the '{@link easyflow.execution.impl.IExecutionSystemImpl <em>IExecution System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.execution.impl.IExecutionSystemImpl
	 * @see easyflow.execution.impl.ExecutionPackageImpl#getIExecutionSystem()
	 * @generated
	 */
	int IEXECUTION_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXECUTION_SYSTEM__LOGGER = 0;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXECUTION_SYSTEM__WRITER = 1;

	/**
	 * The number of structural features of the '<em>IExecution System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXECUTION_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Jgraphx Visitor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXECUTION_SYSTEM___GET_JGRAPHX_VISITOR = 0;

	/**
	 * The operation id for the '<em>Generate Execution String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXECUTION_SYSTEM___GENERATE_EXECUTION_STRING__RULE = 1;

	/**
	 * The number of operations of the '<em>IExecution System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXECUTION_SYSTEM_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM__LOGGER = IEXECUTION_SYSTEM__LOGGER;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM__WRITER = IEXECUTION_SYSTEM__WRITER;

	/**
	 * The number of structural features of the '<em>Default Execution System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM_FEATURE_COUNT = IEXECUTION_SYSTEM_FEATURE_COUNT + 0;


	/**
	 * The operation id for the '<em>Get Jgraphx Visitor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM___GET_JGRAPHX_VISITOR = IEXECUTION_SYSTEM___GET_JGRAPHX_VISITOR;

	/**
	 * The operation id for the '<em>Generate Execution String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM___GENERATE_EXECUTION_STRING__RULE = IEXECUTION_SYSTEM___GENERATE_EXECUTION_STRING__RULE;

	/**
	 * The number of operations of the '<em>Default Execution System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXECUTION_SYSTEM_OPERATION_COUNT = IEXECUTION_SYSTEM_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link easyflow.execution.IExecutionSystem <em>IExecution System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IExecution System</em>'.
	 * @see easyflow.execution.IExecutionSystem
	 * @generated
	 */
	EClass getIExecutionSystem();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.execution.IExecutionSystem#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.execution.IExecutionSystem#getLogger()
	 * @see #getIExecutionSystem()
	 * @generated
	 */
	EAttribute getIExecutionSystem_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.execution.IExecutionSystem#getWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writer</em>'.
	 * @see easyflow.execution.IExecutionSystem#getWriter()
	 * @see #getIExecutionSystem()
	 * @generated
	 */
	EAttribute getIExecutionSystem_Writer();

	/**
	 * Returns the meta object for the '{@link easyflow.execution.IExecutionSystem#getJgraphxVisitor() <em>Get Jgraphx Visitor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Jgraphx Visitor</em>' operation.
	 * @see easyflow.execution.IExecutionSystem#getJgraphxVisitor()
	 * @generated
	 */
	EOperation getIExecutionSystem__GetJgraphxVisitor();

	/**
	 * Returns the meta object for the '{@link easyflow.execution.IExecutionSystem#generateExecutionString(easyflow.tool.Rule) <em>Generate Execution String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Execution String</em>' operation.
	 * @see easyflow.execution.IExecutionSystem#generateExecutionString(easyflow.tool.Rule)
	 * @generated
	 */
	EOperation getIExecutionSystem__GenerateExecutionString__Rule();

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
		 * The meta object literal for the '{@link easyflow.execution.impl.IExecutionSystemImpl <em>IExecution System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.execution.impl.IExecutionSystemImpl
		 * @see easyflow.execution.impl.ExecutionPackageImpl#getIExecutionSystem()
		 * @generated
		 */
		EClass IEXECUTION_SYSTEM = eINSTANCE.getIExecutionSystem();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEXECUTION_SYSTEM__LOGGER = eINSTANCE.getIExecutionSystem_Logger();

		/**
		 * The meta object literal for the '<em><b>Writer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEXECUTION_SYSTEM__WRITER = eINSTANCE.getIExecutionSystem_Writer();

		/**
		 * The meta object literal for the '<em><b>Get Jgraphx Visitor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEXECUTION_SYSTEM___GET_JGRAPHX_VISITOR = eINSTANCE.getIExecutionSystem__GetJgraphxVisitor();

		/**
		 * The meta object literal for the '<em><b>Generate Execution String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEXECUTION_SYSTEM___GENERATE_EXECUTION_STRING__RULE = eINSTANCE.getIExecutionSystem__GenerateExecutionString__Rule();

	}

} //ExecutionPackage
