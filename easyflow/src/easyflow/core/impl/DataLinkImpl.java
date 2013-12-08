/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.core.CorePackage;
import easyflow.core.DataLink;
import easyflow.core.DataPort;

import easyflow.traversal.TraversalChunk;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.DataLinkImpl#getDataPort <em>Data Port</em>}</li>
 *   <li>{@link easyflow.core.impl.DataLinkImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.core.impl.DataLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.core.impl.DataLinkImpl#getTraversalName <em>Traversal Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataLinkImpl extends EObjectImpl implements DataLink {
	/**
	 * The cached value of the '{@link #getDataPort() <em>Data Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPort()
	 * @generated
	 * @ordered
	 */
	protected DataPort dataPort;

	/**
	 * The cached value of the '{@link #getChunks() <em>Chunks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunks()
	 * @generated
	 * @ordered
	 */
	protected EList<TraversalChunk> chunks;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraversalName() <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAVERSAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraversalName() <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalName()
	 * @generated
	 * @ordered
	 */
	protected String traversalName = TRAVERSAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DATA_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort getDataPort() {
		if (dataPort != null && dataPort.eIsProxy()) {
			InternalEObject oldDataPort = (InternalEObject)dataPort;
			dataPort = (DataPort)eResolveProxy(oldDataPort);
			if (dataPort != oldDataPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DATA_LINK__DATA_PORT, oldDataPort, dataPort));
			}
		}
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort basicGetDataPort() {
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPort(DataPort newDataPort) {
		DataPort oldDataPort = dataPort;
		dataPort = newDataPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DATA_LINK__DATA_PORT, oldDataPort, dataPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraversalChunk> getChunks() {
		if (chunks == null) {
			chunks = new EObjectResolvingEList<TraversalChunk>(TraversalChunk.class, this, CorePackage.DATA_LINK__CHUNKS);
		}
		return chunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DATA_LINK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraversalName() {
		return traversalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraversalName(String newTraversalName) {
		String oldTraversalName = traversalName;
		traversalName = newTraversalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DATA_LINK__TRAVERSAL_NAME, oldTraversalName, traversalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DATA_LINK__DATA_PORT:
				if (resolve) return getDataPort();
				return basicGetDataPort();
			case CorePackage.DATA_LINK__CHUNKS:
				return getChunks();
			case CorePackage.DATA_LINK__ID:
				return getId();
			case CorePackage.DATA_LINK__TRAVERSAL_NAME:
				return getTraversalName();
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
			case CorePackage.DATA_LINK__DATA_PORT:
				setDataPort((DataPort)newValue);
				return;
			case CorePackage.DATA_LINK__CHUNKS:
				getChunks().clear();
				getChunks().addAll((Collection<? extends TraversalChunk>)newValue);
				return;
			case CorePackage.DATA_LINK__ID:
				setId((Integer)newValue);
				return;
			case CorePackage.DATA_LINK__TRAVERSAL_NAME:
				setTraversalName((String)newValue);
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
			case CorePackage.DATA_LINK__DATA_PORT:
				setDataPort((DataPort)null);
				return;
			case CorePackage.DATA_LINK__CHUNKS:
				getChunks().clear();
				return;
			case CorePackage.DATA_LINK__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.DATA_LINK__TRAVERSAL_NAME:
				setTraversalName(TRAVERSAL_NAME_EDEFAULT);
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
			case CorePackage.DATA_LINK__DATA_PORT:
				return dataPort != null;
			case CorePackage.DATA_LINK__CHUNKS:
				return chunks != null && !chunks.isEmpty();
			case CorePackage.DATA_LINK__ID:
				return id != ID_EDEFAULT;
			case CorePackage.DATA_LINK__TRAVERSAL_NAME:
				return TRAVERSAL_NAME_EDEFAULT == null ? traversalName != null : !TRAVERSAL_NAME_EDEFAULT.equals(traversalName);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", traversalName: ");
		result.append(traversalName);
		result.append(')');
		return result.toString();
	}

} //DataLinkImpl
