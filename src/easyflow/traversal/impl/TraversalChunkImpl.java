/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal.impl;

import easyflow.metadata.GroupingInstance;
import easyflow.metadata.MetadataFactory;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalPackage;
import java.lang.reflect.InvocationTargetException;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traversal Chunk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.traversal.impl.TraversalChunkImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.traversal.impl.TraversalChunkImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.traversal.impl.TraversalChunkImpl#isDerived1by1 <em>Derived1by1</em>}</li>
 *   <li>{@link easyflow.traversal.impl.TraversalChunkImpl#getGroupingInstance <em>Grouping Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraversalChunkImpl extends MinimalEObjectImpl.Container implements TraversalChunk {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger = LOGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #isDerived1by1() <em>Derived1by1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived1by1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED1BY1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived1by1() <em>Derived1by1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived1by1()
	 * @generated
	 * @ordered
	 */
	protected boolean derived1by1 = DERIVED1BY1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroupingInstance() <em>Grouping Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingInstance()
	 * @generated
	 * @ordered
	 */
	protected GroupingInstance groupingInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraversalChunkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraversalPackage.Literals.TRAVERSAL_CHUNK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.TRAVERSAL_CHUNK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogger(Logger newLogger) {
		Logger oldLogger = logger;
		logger = newLogger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.TRAVERSAL_CHUNK__LOGGER, oldLogger, logger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived1by1() {
		return derived1by1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived1by1(boolean newDerived1by1) {
		boolean oldDerived1by1 = derived1by1;
		derived1by1 = newDerived1by1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.TRAVERSAL_CHUNK__DERIVED1BY1, oldDerived1by1, derived1by1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingInstance getGroupingInstance() {
		if (groupingInstance != null && groupingInstance.eIsProxy()) {
			InternalEObject oldGroupingInstance = (InternalEObject)groupingInstance;
			groupingInstance = (GroupingInstance)eResolveProxy(oldGroupingInstance);
			if (groupingInstance != oldGroupingInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraversalPackage.TRAVERSAL_CHUNK__GROUPING_INSTANCE, oldGroupingInstance, groupingInstance));
			}
		}
		return groupingInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingInstance basicGetGroupingInstance() {
		return groupingInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingInstance(GroupingInstance newGroupingInstance) {
		GroupingInstance oldGroupingInstance = groupingInstance;
		groupingInstance = newGroupingInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.TRAVERSAL_CHUNK__GROUPING_INSTANCE, oldGroupingInstance, groupingInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public GroupingInstance asGroupingInstance() {

		if (getGroupingInstance() == null)
			setGroupingInstance(MetadataFactory.eINSTANCE.createGroupingInstance());
		getGroupingInstance().setName(getName());
		return getGroupingInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraversalPackage.TRAVERSAL_CHUNK__NAME:
				return getName();
			case TraversalPackage.TRAVERSAL_CHUNK__LOGGER:
				return getLogger();
			case TraversalPackage.TRAVERSAL_CHUNK__DERIVED1BY1:
				return isDerived1by1();
			case TraversalPackage.TRAVERSAL_CHUNK__GROUPING_INSTANCE:
				if (resolve) return getGroupingInstance();
				return basicGetGroupingInstance();
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
			case TraversalPackage.TRAVERSAL_CHUNK__NAME:
				setName((String)newValue);
				return;
			case TraversalPackage.TRAVERSAL_CHUNK__LOGGER:
				setLogger((Logger)newValue);
				return;
			case TraversalPackage.TRAVERSAL_CHUNK__DERIVED1BY1:
				setDerived1by1((Boolean)newValue);
				return;
			case TraversalPackage.TRAVERSAL_CHUNK__GROUPING_INSTANCE:
				setGroupingInstance((GroupingInstance)newValue);
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
			case TraversalPackage.TRAVERSAL_CHUNK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TraversalPackage.TRAVERSAL_CHUNK__LOGGER:
				setLogger(LOGGER_EDEFAULT);
				return;
			case TraversalPackage.TRAVERSAL_CHUNK__DERIVED1BY1:
				setDerived1by1(DERIVED1BY1_EDEFAULT);
				return;
			case TraversalPackage.TRAVERSAL_CHUNK__GROUPING_INSTANCE:
				setGroupingInstance((GroupingInstance)null);
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
			case TraversalPackage.TRAVERSAL_CHUNK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TraversalPackage.TRAVERSAL_CHUNK__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case TraversalPackage.TRAVERSAL_CHUNK__DERIVED1BY1:
				return derived1by1 != DERIVED1BY1_EDEFAULT;
			case TraversalPackage.TRAVERSAL_CHUNK__GROUPING_INSTANCE:
				return groupingInstance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TraversalPackage.TRAVERSAL_CHUNK___AS_GROUPING_INSTANCE:
				return asGroupingInstance();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", logger: ");
		result.append(logger);
		result.append(", derived1by1: ");
		result.append(derived1by1);
		result.append(')');
		return result.toString();
	}

} //TraversalChunkImpl
