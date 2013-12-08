/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal.util;

import easyflow.traversal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.traversal.TraversalPackage
 * @generated
 */
public class TraversalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TraversalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TraversalPackage.eINSTANCE;
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
	protected TraversalSwitch<Adapter> modelSwitch =
		new TraversalSwitch<Adapter>() {
			@Override
			public Adapter caseTraversalEvent(TraversalEvent object) {
				return createTraversalEventAdapter();
			}
			@Override
			public Adapter caseGroupingCriterion(GroupingCriterion object) {
				return createGroupingCriterionAdapter();
			}
			@Override
			public Adapter caseTraversalCriterion(TraversalCriterion object) {
				return createTraversalCriterionAdapter();
			}
			@Override
			public Adapter caseTraversalOperation(TraversalOperation object) {
				return createTraversalOperationAdapter();
			}
			@Override
			public Adapter caseTraversalChunk(TraversalChunk object) {
				return createTraversalChunkAdapter();
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
	 * Creates a new adapter for an object of class '{@link easyflow.traversal.GroupingCriterion <em>Grouping Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.traversal.GroupingCriterion
	 * @generated
	 */
	public Adapter createGroupingCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.traversal.TraversalCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.traversal.TraversalCriterion
	 * @generated
	 */
	public Adapter createTraversalCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.traversal.TraversalEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.traversal.TraversalEvent
	 * @generated
	 */
	public Adapter createTraversalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.traversal.TraversalOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.traversal.TraversalOperation
	 * @generated
	 */
	public Adapter createTraversalOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.traversal.TraversalChunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.traversal.TraversalChunk
	 * @generated
	 */
	public Adapter createTraversalChunkAdapter() {
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

} //TraversalAdapterFactory
