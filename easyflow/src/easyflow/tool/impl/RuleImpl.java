/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.tool.Rule;
import easyflow.tool.ToolPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getCmdLine <em>Cmd Line</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#isReadFromPipe <em>Read From Pipe</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#isWriteToPipe <em>Write To Pipe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The cached value of the '{@link #getCmdLine() <em>Cmd Line</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdLine()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cmdLine;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dependencies;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targets;

	/**
	 * The default value of the '{@link #isReadFromPipe() <em>Read From Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadFromPipe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_FROM_PIPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadFromPipe() <em>Read From Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadFromPipe()
	 * @generated
	 * @ordered
	 */
	protected boolean readFromPipe = READ_FROM_PIPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWriteToPipe() <em>Write To Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteToPipe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_TO_PIPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteToPipe() <em>Write To Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteToPipe()
	 * @generated
	 * @ordered
	 */
	protected boolean writeToPipe = WRITE_TO_PIPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCmdLine() {
		if (cmdLine == null) {
			cmdLine = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__CMD_LINE);
		}
		return cmdLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDependencies() {
		if (dependencies == null) {
			dependencies = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTargets() {
		if (targets == null) {
			targets = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadFromPipe() {
		return readFromPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadFromPipe(boolean newReadFromPipe) {
		boolean oldReadFromPipe = readFromPipe;
		readFromPipe = newReadFromPipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RULE__READ_FROM_PIPE, oldReadFromPipe, readFromPipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteToPipe() {
		return writeToPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteToPipe(boolean newWriteToPipe) {
		boolean oldWriteToPipe = writeToPipe;
		writeToPipe = newWriteToPipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RULE__WRITE_TO_PIPE, oldWriteToPipe, writeToPipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void clear() {
		getTargets().clear();
		getDependencies().clear();
		getCmdLine().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.RULE__CMD_LINE:
				return getCmdLine();
			case ToolPackage.RULE__DEPENDENCIES:
				return getDependencies();
			case ToolPackage.RULE__TARGETS:
				return getTargets();
			case ToolPackage.RULE__READ_FROM_PIPE:
				return isReadFromPipe();
			case ToolPackage.RULE__WRITE_TO_PIPE:
				return isWriteToPipe();
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
			case ToolPackage.RULE__CMD_LINE:
				getCmdLine().clear();
				getCmdLine().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__READ_FROM_PIPE:
				setReadFromPipe((Boolean)newValue);
				return;
			case ToolPackage.RULE__WRITE_TO_PIPE:
				setWriteToPipe((Boolean)newValue);
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
			case ToolPackage.RULE__CMD_LINE:
				getCmdLine().clear();
				return;
			case ToolPackage.RULE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ToolPackage.RULE__TARGETS:
				getTargets().clear();
				return;
			case ToolPackage.RULE__READ_FROM_PIPE:
				setReadFromPipe(READ_FROM_PIPE_EDEFAULT);
				return;
			case ToolPackage.RULE__WRITE_TO_PIPE:
				setWriteToPipe(WRITE_TO_PIPE_EDEFAULT);
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
			case ToolPackage.RULE__CMD_LINE:
				return cmdLine != null && !cmdLine.isEmpty();
			case ToolPackage.RULE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case ToolPackage.RULE__TARGETS:
				return targets != null && !targets.isEmpty();
			case ToolPackage.RULE__READ_FROM_PIPE:
				return readFromPipe != READ_FROM_PIPE_EDEFAULT;
			case ToolPackage.RULE__WRITE_TO_PIPE:
				return writeToPipe != WRITE_TO_PIPE_EDEFAULT;
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
		result.append(" (cmdLine: ");
		result.append(cmdLine);
		result.append(", dependencies: ");
		result.append(dependencies);
		result.append(", targets: ");
		result.append(targets);
		result.append(", readFromPipe: ");
		result.append(readFromPipe);
		result.append(", writeToPipe: ");
		result.append(writeToPipe);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
