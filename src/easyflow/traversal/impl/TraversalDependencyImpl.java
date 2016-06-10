/**
 */
package easyflow.traversal.impl;

import com.mxgraph.model.mxICell;
import easyflow.traversal.TraversalDependency;
import easyflow.traversal.TraversalPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.traversal.impl.TraversalDependencyImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link easyflow.traversal.impl.TraversalDependencyImpl#getProcessedCells <em>Processed Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraversalDependencyImpl extends MinimalEObjectImpl.Container implements TraversalDependency {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessedCells() <em>Processed Cells</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessedCells()
	 * @generated
	 * @ordered
	 */
	protected EList<mxICell> processedCells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraversalDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraversalPackage.Literals.TRAVERSAL_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.TRAVERSAL_DEPENDENCY__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<mxICell> getProcessedCells() {
		if (processedCells == null) {
			processedCells = new EDataTypeUniqueEList<mxICell>(mxICell.class, this, TraversalPackage.TRAVERSAL_DEPENDENCY__PROCESSED_CELLS);
		}
		return processedCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraversalPackage.TRAVERSAL_DEPENDENCY__NUMBER:
				return getNumber();
			case TraversalPackage.TRAVERSAL_DEPENDENCY__PROCESSED_CELLS:
				return getProcessedCells();
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
			case TraversalPackage.TRAVERSAL_DEPENDENCY__NUMBER:
				setNumber((Integer)newValue);
				return;
			case TraversalPackage.TRAVERSAL_DEPENDENCY__PROCESSED_CELLS:
				getProcessedCells().clear();
				getProcessedCells().addAll((Collection<? extends mxICell>)newValue);
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
			case TraversalPackage.TRAVERSAL_DEPENDENCY__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TraversalPackage.TRAVERSAL_DEPENDENCY__PROCESSED_CELLS:
				getProcessedCells().clear();
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
			case TraversalPackage.TRAVERSAL_DEPENDENCY__NUMBER:
				return number != NUMBER_EDEFAULT;
			case TraversalPackage.TRAVERSAL_DEPENDENCY__PROCESSED_CELLS:
				return processedCells != null && !processedCells.isEmpty();
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
		result.append(" (number: ");
		result.append(number);
		result.append(", processedCells: ");
		result.append(processedCells);
		result.append(')');
		return result.toString();
	}

} //TraversalDependencyImpl
