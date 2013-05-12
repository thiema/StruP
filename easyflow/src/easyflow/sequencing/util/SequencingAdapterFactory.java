/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.util;

import easyflow.core.DefaultMetaData;
import easyflow.core.IMetaData;
import easyflow.core.IProjectMetaData;

import easyflow.sequencing.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.sequencing.SequencingPackage
 * @generated
 */
public class SequencingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SequencingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SequencingPackage.eINSTANCE;
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
	protected SequencingSwitch<Adapter> modelSwitch =
		new SequencingSwitch<Adapter>() {
			@Override
			public Adapter caseRefBasedProjectMetaData(RefBasedProjectMetaData object) {
				return createRefBasedProjectMetaDataAdapter();
			}
			@Override
			public Adapter caseMetaData(MetaData object) {
				return createMetaDataAdapter();
			}
			@Override
			public Adapter caseIProjectMetaData(IProjectMetaData object) {
				return createIProjectMetaDataAdapter();
			}
			@Override
			public Adapter caseIMetaData(IMetaData object) {
				return createIMetaDataAdapter();
			}
			@Override
			public Adapter caseDefaultMetaData(DefaultMetaData object) {
				return createDefaultMetaDataAdapter();
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
	 * Creates a new adapter for an object of class '{@link easyflow.sequencing.RefBasedProjectMetaData <em>Ref Based Project Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.sequencing.RefBasedProjectMetaData
	 * @generated
	 */
	public Adapter createRefBasedProjectMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.sequencing.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.sequencing.MetaData
	 * @generated
	 */
	public Adapter createMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.IProjectMetaData <em>IProject Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.IProjectMetaData
	 * @generated
	 */
	public Adapter createIProjectMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.IMetaData <em>IMeta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.IMetaData
	 * @generated
	 */
	public Adapter createIMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DefaultMetaData <em>Default Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DefaultMetaData
	 * @generated
	 */
	public Adapter createDefaultMetaDataAdapter() {
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

} //SequencingAdapterFactory
