/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal.impl;

import easyflow.core.DataPort;
import easyflow.traversal.GroupingCriterion;
import easyflow.traversal.TraversalPackage;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grouping Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.traversal.impl.GroupingCriterionImpl#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.traversal.impl.GroupingCriterionImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.traversal.impl.GroupingCriterionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.traversal.impl.GroupingCriterionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link easyflow.traversal.impl.GroupingCriterionImpl#isMultipleInstances <em>Multiple Instances</em>}</li>
 *   <li>{@link easyflow.traversal.impl.GroupingCriterionImpl#isSeperateInputPorts <em>Seperate Input Ports</em>}</li>
 *   <li>{@link easyflow.traversal.impl.GroupingCriterionImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.traversal.impl.GroupingCriterionImpl#getDataPort <em>Data Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupingCriterionImpl extends EObjectImpl implements GroupingCriterion {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultipleInstances() <em>Multiple Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleInstances()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_INSTANCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleInstances() <em>Multiple Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleInstances()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleInstances = MULTIPLE_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #isSeperateInputPorts() <em>Seperate Input Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeperateInputPorts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEPERATE_INPUT_PORTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeperateInputPorts() <em>Seperate Input Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeperateInputPorts()
	 * @generated
	 * @ordered
	 */
	protected boolean seperateInputPorts = SEPERATE_INPUT_PORTS_EDEFAULT;

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
	 * The cached value of the '{@link #getDataPort() <em>Data Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPort()
	 * @generated
	 * @ordered
	 */
	protected DataPort dataPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupingCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraversalPackage.Literals.GROUPING_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.GROUPING_CRITERION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.GROUPING_CRITERION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.GROUPING_CRITERION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.GROUPING_CRITERION__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleInstances() {
		return multipleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleInstances(boolean newMultipleInstances) {
		boolean oldMultipleInstances = multipleInstances;
		multipleInstances = newMultipleInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.GROUPING_CRITERION__MULTIPLE_INSTANCES, oldMultipleInstances, multipleInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSeperateInputPorts() {
		return seperateInputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeperateInputPorts(boolean newSeperateInputPorts) {
		boolean oldSeperateInputPorts = seperateInputPorts;
		seperateInputPorts = newSeperateInputPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS, oldSeperateInputPorts, seperateInputPorts));
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
	public DataPort getDataPort() {
		if (dataPort != null && dataPort.eIsProxy()) {
			InternalEObject oldDataPort = (InternalEObject)dataPort;
			dataPort = (DataPort)eResolveProxy(oldDataPort);
			if (dataPort != oldDataPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraversalPackage.GROUPING_CRITERION__DATA_PORT, oldDataPort, dataPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.GROUPING_CRITERION__DATA_PORT, oldDataPort, dataPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraversalPackage.GROUPING_CRITERION__ID:
				return getId();
			case TraversalPackage.GROUPING_CRITERION__NAME:
				return getName();
			case TraversalPackage.GROUPING_CRITERION__DESCRIPTION:
				return getDescription();
			case TraversalPackage.GROUPING_CRITERION__MODE:
				return getMode();
			case TraversalPackage.GROUPING_CRITERION__MULTIPLE_INSTANCES:
				return isMultipleInstances();
			case TraversalPackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS:
				return isSeperateInputPorts();
			case TraversalPackage.GROUPING_CRITERION__LOGGER:
				return getLogger();
			case TraversalPackage.GROUPING_CRITERION__DATA_PORT:
				if (resolve) return getDataPort();
				return basicGetDataPort();
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
			case TraversalPackage.GROUPING_CRITERION__ID:
				setId((String)newValue);
				return;
			case TraversalPackage.GROUPING_CRITERION__NAME:
				setName((String)newValue);
				return;
			case TraversalPackage.GROUPING_CRITERION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TraversalPackage.GROUPING_CRITERION__MODE:
				setMode((String)newValue);
				return;
			case TraversalPackage.GROUPING_CRITERION__MULTIPLE_INSTANCES:
				setMultipleInstances((Boolean)newValue);
				return;
			case TraversalPackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS:
				setSeperateInputPorts((Boolean)newValue);
				return;
			case TraversalPackage.GROUPING_CRITERION__DATA_PORT:
				setDataPort((DataPort)newValue);
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
			case TraversalPackage.GROUPING_CRITERION__ID:
				setId(ID_EDEFAULT);
				return;
			case TraversalPackage.GROUPING_CRITERION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TraversalPackage.GROUPING_CRITERION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TraversalPackage.GROUPING_CRITERION__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case TraversalPackage.GROUPING_CRITERION__MULTIPLE_INSTANCES:
				setMultipleInstances(MULTIPLE_INSTANCES_EDEFAULT);
				return;
			case TraversalPackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS:
				setSeperateInputPorts(SEPERATE_INPUT_PORTS_EDEFAULT);
				return;
			case TraversalPackage.GROUPING_CRITERION__DATA_PORT:
				setDataPort((DataPort)null);
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
			case TraversalPackage.GROUPING_CRITERION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TraversalPackage.GROUPING_CRITERION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TraversalPackage.GROUPING_CRITERION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TraversalPackage.GROUPING_CRITERION__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case TraversalPackage.GROUPING_CRITERION__MULTIPLE_INSTANCES:
				return multipleInstances != MULTIPLE_INSTANCES_EDEFAULT;
			case TraversalPackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS:
				return seperateInputPorts != SEPERATE_INPUT_PORTS_EDEFAULT;
			case TraversalPackage.GROUPING_CRITERION__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case TraversalPackage.GROUPING_CRITERION__DATA_PORT:
				return dataPort != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", mode: ");
		result.append(mode);
		result.append(", multipleInstances: ");
		result.append(multipleInstances);
		result.append(", seperateInputPorts: ");
		result.append(seperateInputPorts);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //GroupingCriterionImpl
