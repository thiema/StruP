/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.core.Category;
import easyflow.core.CorePackage;
import easyflow.core.ErrorControl;
import easyflow.core.Severity;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.ErrorControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorControlImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorControlImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorControlImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorControlImpl#getValNum <em>Val Num</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorControlImpl#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorControlImpl extends EObjectImpl implements ErrorControl {
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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Category CATEGORY_EDEFAULT = Category.METADATA_DEFINITON;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity.FATAL;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValNum() <em>Val Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValNum()
	 * @generated
	 * @ordered
	 */
	protected static final int VAL_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValNum() <em>Val Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValNum()
	 * @generated
	 * @ordered
	 */
	protected int valNum = VAL_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVals() <em>Vals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVals()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ERROR_CONTROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_CONTROL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_CONTROL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_CONTROL__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Severity newSeverity) {
		Severity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_CONTROL__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValNum() {
		return valNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValNum(int newValNum) {
		int oldValNum = valNum;
		valNum = newValNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_CONTROL__VAL_NUM, oldValNum, valNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVals() {
		if (vals == null) {
			vals = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.ERROR_CONTROL__VALS);
		}
		return vals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String generateDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ERROR_CONTROL__NAME:
				return getName();
			case CorePackage.ERROR_CONTROL__DESCRIPTION:
				return getDescription();
			case CorePackage.ERROR_CONTROL__CATEGORY:
				return getCategory();
			case CorePackage.ERROR_CONTROL__SEVERITY:
				return getSeverity();
			case CorePackage.ERROR_CONTROL__VAL_NUM:
				return getValNum();
			case CorePackage.ERROR_CONTROL__VALS:
				return getVals();
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
			case CorePackage.ERROR_CONTROL__NAME:
				setName((String)newValue);
				return;
			case CorePackage.ERROR_CONTROL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.ERROR_CONTROL__CATEGORY:
				setCategory((Category)newValue);
				return;
			case CorePackage.ERROR_CONTROL__SEVERITY:
				setSeverity((Severity)newValue);
				return;
			case CorePackage.ERROR_CONTROL__VAL_NUM:
				setValNum((Integer)newValue);
				return;
			case CorePackage.ERROR_CONTROL__VALS:
				getVals().clear();
				getVals().addAll((Collection<? extends String>)newValue);
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
			case CorePackage.ERROR_CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.ERROR_CONTROL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.ERROR_CONTROL__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CorePackage.ERROR_CONTROL__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case CorePackage.ERROR_CONTROL__VAL_NUM:
				setValNum(VAL_NUM_EDEFAULT);
				return;
			case CorePackage.ERROR_CONTROL__VALS:
				getVals().clear();
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
			case CorePackage.ERROR_CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.ERROR_CONTROL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.ERROR_CONTROL__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case CorePackage.ERROR_CONTROL__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case CorePackage.ERROR_CONTROL__VAL_NUM:
				return valNum != VAL_NUM_EDEFAULT;
			case CorePackage.ERROR_CONTROL__VALS:
				return vals != null && !vals.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", category: ");
		result.append(category);
		result.append(", severity: ");
		result.append(severity);
		result.append(", valNum: ");
		result.append(valNum);
		result.append(", vals: ");
		result.append(vals);
		result.append(')');
		return result.toString();
	}

} //ErrorControlImpl
