/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal.impl;

import easyflow.traversal.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraversalFactoryImpl extends EFactoryImpl implements TraversalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraversalFactory init() {
		try {
			TraversalFactory theTraversalFactory = (TraversalFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/traversal/1.0.0"); 
			if (theTraversalFactory != null) {
				return theTraversalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraversalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TraversalPackage.TRAVERSAL_EVENT: return createTraversalEvent();
			case TraversalPackage.GROUPING_CRITERION: return createGroupingCriterion();
			case TraversalPackage.TRAVERSAL_CRITERION: return createTraversalCriterion();
			case TraversalPackage.TRAVERSAL_OPERATION: return createTraversalOperation();
			case TraversalPackage.TRAVERSAL_CHUNK: return createTraversalChunk();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalEvent createTraversalEvent() {
		TraversalEventImpl traversalEvent = new TraversalEventImpl();
		return traversalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingCriterion createGroupingCriterion() {
		GroupingCriterionImpl groupingCriterion = new GroupingCriterionImpl();
		return groupingCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalCriterion createTraversalCriterion() {
		TraversalCriterionImpl traversalCriterion = new TraversalCriterionImpl();
		return traversalCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalOperation createTraversalOperation() {
		TraversalOperationImpl traversalOperation = new TraversalOperationImpl();
		return traversalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalChunk createTraversalChunk() {
		TraversalChunkImpl traversalChunk = new TraversalChunkImpl();
		return traversalChunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalPackage getTraversalPackage() {
		return (TraversalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TraversalPackage getPackage() {
		return TraversalPackage.eINSTANCE;
	}

} //TraversalFactoryImpl
