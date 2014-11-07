/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.shell.impl;

import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.core.Task;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.ExecutionPackage;
import easyflow.execution.impl.IExecutionSystemImpl;
import easyflow.execution.shell.Shell;
import easyflow.execution.shell.ShellPackage;
import easyflow.tool.Rule;
import easyflow.tool.Tool;
import easyflow.ui.DefaultProject;
import java.io.BufferedWriter;
import java.lang.reflect.InvocationTargetException;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ShellImpl extends IExecutionSystemImpl implements Shell {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShellPackage.Literals.SHELL;
	}

} //ShellImpl
