/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.impl;

import easyflow.sequencing.RefBasedProjectMetaData;
import easyflow.sequencing.ResequencingProject;
import easyflow.sequencing.SequencingPackage;

import easyflow.ui.impl.DefaultProjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resequencing Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.sequencing.impl.ResequencingProjectImpl#getRefBasedProjectMetaData <em>Ref Based Project Meta Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResequencingProjectImpl extends DefaultProjectImpl implements ResequencingProject {
	/**
	 * The cached value of the '{@link #getRefBasedProjectMetaData() <em>Ref Based Project Meta Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBasedProjectMetaData()
	 * @generated
	 * @ordered
	 */
	protected EList<RefBasedProjectMetaData> refBasedProjectMetaData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResequencingProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencingPackage.Literals.RESEQUENCING_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefBasedProjectMetaData> getRefBasedProjectMetaData() {
		if (refBasedProjectMetaData == null) {
			refBasedProjectMetaData = new EObjectResolvingEList<RefBasedProjectMetaData>(RefBasedProjectMetaData.class, this, SequencingPackage.RESEQUENCING_PROJECT__REF_BASED_PROJECT_META_DATA);
		}
		return refBasedProjectMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequencingPackage.RESEQUENCING_PROJECT__REF_BASED_PROJECT_META_DATA:
				return getRefBasedProjectMetaData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SequencingPackage.RESEQUENCING_PROJECT__REF_BASED_PROJECT_META_DATA:
				getRefBasedProjectMetaData().clear();
				getRefBasedProjectMetaData().addAll((Collection<? extends RefBasedProjectMetaData>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SequencingPackage.RESEQUENCING_PROJECT__REF_BASED_PROJECT_META_DATA:
				getRefBasedProjectMetaData().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SequencingPackage.RESEQUENCING_PROJECT__REF_BASED_PROJECT_META_DATA:
				return refBasedProjectMetaData != null && !refBasedProjectMetaData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResequencingProjectImpl
