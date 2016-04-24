/**
 */
package easyflow.graph.jgraphx.impl;

import com.mxgraph.model.mxICell;
import easyflow.core.Task;
import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.UntranslatedLink;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToCellListMapImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Untranslated Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.impl.UntranslatedLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UntranslatedLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.UntranslatedLinkImpl#getUntranslatedLinks <em>Untranslated Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UntranslatedLinkImpl extends MinimalEObjectImpl.Container implements UntranslatedLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Task source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Task target;

	/**
	 * The cached value of the '{@link #getUntranslatedLinks() <em>Untranslated Links</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntranslatedLinks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<mxICell>> untranslatedLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UntranslatedLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JgraphxPackage.Literals.UNTRANSLATED_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Task)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.UNTRANSLATED_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Task newSource) {
		Task oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.UNTRANSLATED_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Task)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.UNTRANSLATED_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Task newTarget) {
		Task oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.UNTRANSLATED_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<mxICell>> getUntranslatedLinks() {
		if (untranslatedLinks == null) {
			untranslatedLinks = new EcoreEMap<String,EList<mxICell>>(MapsPackage.Literals.STRING_TO_CELL_LIST_MAP, StringToCellListMapImpl.class, this, JgraphxPackage.UNTRANSLATED_LINK__UNTRANSLATED_LINKS);
		}
		return untranslatedLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JgraphxPackage.UNTRANSLATED_LINK__UNTRANSLATED_LINKS:
				return ((InternalEList<?>)getUntranslatedLinks()).basicRemove(otherEnd, msgs);
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
			case JgraphxPackage.UNTRANSLATED_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case JgraphxPackage.UNTRANSLATED_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case JgraphxPackage.UNTRANSLATED_LINK__UNTRANSLATED_LINKS:
				if (coreType) return getUntranslatedLinks();
				else return getUntranslatedLinks().map();
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
			case JgraphxPackage.UNTRANSLATED_LINK__SOURCE:
				setSource((Task)newValue);
				return;
			case JgraphxPackage.UNTRANSLATED_LINK__TARGET:
				setTarget((Task)newValue);
				return;
			case JgraphxPackage.UNTRANSLATED_LINK__UNTRANSLATED_LINKS:
				((EStructuralFeature.Setting)getUntranslatedLinks()).set(newValue);
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
			case JgraphxPackage.UNTRANSLATED_LINK__SOURCE:
				setSource((Task)null);
				return;
			case JgraphxPackage.UNTRANSLATED_LINK__TARGET:
				setTarget((Task)null);
				return;
			case JgraphxPackage.UNTRANSLATED_LINK__UNTRANSLATED_LINKS:
				getUntranslatedLinks().clear();
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
			case JgraphxPackage.UNTRANSLATED_LINK__SOURCE:
				return source != null;
			case JgraphxPackage.UNTRANSLATED_LINK__TARGET:
				return target != null;
			case JgraphxPackage.UNTRANSLATED_LINK__UNTRANSLATED_LINKS:
				return untranslatedLinks != null && !untranslatedLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UntranslatedLinkImpl
