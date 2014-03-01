/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.util;

import easyflow.core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseToolMatch(ToolMatch object) {
				return createToolMatchAdapter();
			}
			@Override
			public Adapter caseIWorkflowTemplate(IWorkflowTemplate object) {
				return createIWorkflowTemplateAdapter();
			}
			@Override
			public Adapter caseDefaultWorkflowTemplate(DefaultWorkflowTemplate object) {
				return createDefaultWorkflowTemplateAdapter();
			}
			@Override
			public Adapter caseEasyflowTemplate(EasyflowTemplate object) {
				return createEasyflowTemplateAdapter();
			}
			@Override
			public Adapter caseITaskReader(ITaskReader object) {
				return createITaskReaderAdapter();
			}
			@Override
			public Adapter caseGalaxyTaskReader(GalaxyTaskReader object) {
				return createGalaxyTaskReaderAdapter();
			}
			@Override
			public Adapter caseDefaultRecord(DefaultRecord object) {
				return createDefaultRecordAdapter();
			}
			@Override
			public Adapter caseCatalog(Catalog object) {
				return createCatalogAdapter();
			}
			@Override
			public Adapter caseDataPort(DataPort object) {
				return createDataPortAdapter();
			}
			@Override
			public Adapter caseDataLink(DataLink object) {
				return createDataLinkAdapter();
			}
			@Override
			public Adapter caseParentTaskResult(ParentTaskResult object) {
				return createParentTaskResultAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.IWorkflowTemplate <em>IWorkflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.IWorkflowTemplate
	 * @generated
	 */
	public Adapter createIWorkflowTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DefaultWorkflowTemplate <em>Default Workflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DefaultWorkflowTemplate
	 * @generated
	 */
	public Adapter createDefaultWorkflowTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.EasyflowTemplate <em>Easyflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.EasyflowTemplate
	 * @generated
	 */
	public Adapter createEasyflowTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.ITaskReader <em>ITask Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.ITaskReader
	 * @generated
	 */
	public Adapter createITaskReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.GalaxyTaskReader <em>Galaxy Task Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.GalaxyTaskReader
	 * @generated
	 */
	public Adapter createGalaxyTaskReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DefaultRecord <em>Default Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DefaultRecord
	 * @generated
	 */
	public Adapter createDefaultRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DataPort
	 * @generated
	 */
	public Adapter createDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DataLink
	 * @generated
	 */
	public Adapter createDataLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.ParentTaskResult <em>Parent Task Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.ParentTaskResult
	 * @generated
	 */
	public Adapter createParentTaskResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.ToolMatch <em>Tool Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.ToolMatch
	 * @generated
	 */
	public Adapter createToolMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
