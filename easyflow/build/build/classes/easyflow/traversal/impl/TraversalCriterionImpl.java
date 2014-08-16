/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal.impl;

import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalOperation;
import easyflow.traversal.TraversalPackage;

import easyflow.util.maps.MapsPackage;

import easyflow.util.maps.impl.StringToChunkMapImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.traversal.impl.TraversalCriterionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link easyflow.traversal.impl.TraversalCriterionImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.traversal.impl.TraversalCriterionImpl#getChunkSource <em>Chunk Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraversalCriterionImpl extends GroupingCriterionImpl implements TraversalCriterion {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected TraversalOperation operation;

	/**
	 * The cached value of the '{@link #getChunks() <em>Chunks</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, TraversalChunk> chunks;

	/**
	 * The default value of the '{@link #getChunkSource() <em>Chunk Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkSource()
	 * @generated
	 * @ordered
	 */
	protected static final String CHUNK_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChunkSource() <em>Chunk Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkSource()
	 * @generated
	 * @ordered
	 */
	protected String chunkSource = CHUNK_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraversalCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraversalPackage.Literals.TRAVERSAL_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalOperation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (TraversalOperation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraversalPackage.TRAVERSAL_CRITERION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalOperation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(TraversalOperation newOperation) {
		TraversalOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.TRAVERSAL_CRITERION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, TraversalChunk> getChunks() {
		if (chunks == null) {
			chunks = new EcoreEMap<String,TraversalChunk>(MapsPackage.Literals.STRING_TO_CHUNK_MAP, StringToChunkMapImpl.class, this, TraversalPackage.TRAVERSAL_CRITERION__CHUNKS);
		}
		return chunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChunkSource() {
		return chunkSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChunkSource(String newChunkSource) {
		String oldChunkSource = chunkSource;
		chunkSource = newChunkSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.TRAVERSAL_CRITERION__CHUNK_SOURCE, oldChunkSource, chunkSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraversalPackage.TRAVERSAL_CRITERION__CHUNKS:
				return ((InternalEList<?>)getChunks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraversalPackage.TRAVERSAL_CRITERION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case TraversalPackage.TRAVERSAL_CRITERION__CHUNKS:
				if (coreType) return getChunks();
				else return getChunks().map();
			case TraversalPackage.TRAVERSAL_CRITERION__CHUNK_SOURCE:
				return getChunkSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraversalPackage.TRAVERSAL_CRITERION__OPERATION:
				setOperation((TraversalOperation)newValue);
				return;
			case TraversalPackage.TRAVERSAL_CRITERION__CHUNKS:
				((EStructuralFeature.Setting)getChunks()).set(newValue);
				return;
			case TraversalPackage.TRAVERSAL_CRITERION__CHUNK_SOURCE:
				setChunkSource((String)newValue);
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
			case TraversalPackage.TRAVERSAL_CRITERION__OPERATION:
				setOperation((TraversalOperation)null);
				return;
			case TraversalPackage.TRAVERSAL_CRITERION__CHUNKS:
				getChunks().clear();
				return;
			case TraversalPackage.TRAVERSAL_CRITERION__CHUNK_SOURCE:
				setChunkSource(CHUNK_SOURCE_EDEFAULT);
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
			case TraversalPackage.TRAVERSAL_CRITERION__OPERATION:
				return operation != null;
			case TraversalPackage.TRAVERSAL_CRITERION__CHUNKS:
				return chunks != null && !chunks.isEmpty();
			case TraversalPackage.TRAVERSAL_CRITERION__CHUNK_SOURCE:
				return CHUNK_SOURCE_EDEFAULT == null ? chunkSource != null : !CHUNK_SOURCE_EDEFAULT.equals(chunkSource);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (chunkSource: ");
		result.append(chunkSource);
		result.append(')');
		return result.toString();
	}

} //TraversalCriterionImpl
