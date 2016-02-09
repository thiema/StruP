/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.core.CorePackage;
import easyflow.core.DefaultWorkflowTemplate;
import easyflow.core.ErrorControl;
import easyflow.core.Task;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Workflow Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.DefaultWorkflowTemplateImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultWorkflowTemplateImpl#getReader <em>Reader</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultWorkflowTemplateImpl#getUtilTaskReader <em>Util Task Reader</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultWorkflowTemplateImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultWorkflowTemplateImpl#getErrorControl <em>Error Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultWorkflowTemplateImpl extends MinimalEObjectImpl.Container implements DefaultWorkflowTemplate {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The default value of the '{@link #getReader() <em>Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected static final BufferedReader READER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReader() <em>Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected BufferedReader reader = READER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilTaskReader() <em>Util Task Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilTaskReader()
	 * @generated
	 * @ordered
	 */
	protected static final BufferedReader UTIL_TASK_READER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtilTaskReader() <em>Util Task Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilTaskReader()
	 * @generated
	 * @ordered
	 */
	protected BufferedReader utilTaskReader = UTIL_TASK_READER_EDEFAULT;

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
	 * The cached value of the '{@link #getErrorControl() <em>Error Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControl()
	 * @generated
	 * @ordered
	 */
	protected ErrorControl errorControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultWorkflowTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DEFAULT_WORKFLOW_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedReader getReader() {
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReader(BufferedReader newReader) {
		BufferedReader oldReader = reader;
		reader = newReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__READER, oldReader, reader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedReader getUtilTaskReader() {
		return utilTaskReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilTaskReader(BufferedReader newUtilTaskReader) {
		BufferedReader oldUtilTaskReader = utilTaskReader;
		utilTaskReader = newUtilTaskReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_READER, oldUtilTaskReader, utilTaskReader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOGGER, oldLogger, logger));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorControl getErrorControl() {
		if (errorControl != null && errorControl.eIsProxy()) {
			InternalEObject oldErrorControl = (InternalEObject)errorControl;
			errorControl = (ErrorControl)eResolveProxy(oldErrorControl);
			if (errorControl != oldErrorControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__ERROR_CONTROL, oldErrorControl, errorControl));
			}
		}
		return errorControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorControl basicGetErrorControl() {
		return errorControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorControl(ErrorControl newErrorControl) {
		ErrorControl oldErrorControl = errorControl;
		errorControl = newErrorControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__ERROR_CONTROL, oldErrorControl, errorControl));
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
	public boolean readTemplate(String mode, EList<String> defaultGroupingCriteria) {
        BufferedReader bufferedReader = getReader();
        String strLine;        
        try {
        	while ((strLine = bufferedReader.readLine()) != null)   {
				if (!strLine.startsWith("#")) {
					Task task = CoreFactoryImpl.eINSTANCE.createTask();
					logger.debug("readTemplate(): parse line="+strLine+" to task.");
					task.readTask(strLine, mode, defaultGroupingCriteria);
					getTasks().add(task);
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return true;
       }
	

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__TASKS:
				return getTasks();
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__READER:
				return getReader();
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_READER:
				return getUtilTaskReader();
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOGGER:
				return getLogger();
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__ERROR_CONTROL:
				if (resolve) return getErrorControl();
				return basicGetErrorControl();
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
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__READER:
				setReader((BufferedReader)newValue);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_READER:
				setUtilTaskReader((BufferedReader)newValue);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOGGER:
				setLogger((Logger)newValue);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__ERROR_CONTROL:
				setErrorControl((ErrorControl)newValue);
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
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__TASKS:
				getTasks().clear();
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__READER:
				setReader(READER_EDEFAULT);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_READER:
				setUtilTaskReader(UTIL_TASK_READER_EDEFAULT);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOGGER:
				setLogger(LOGGER_EDEFAULT);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__ERROR_CONTROL:
				setErrorControl((ErrorControl)null);
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
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__READER:
				return READER_EDEFAULT == null ? reader != null : !READER_EDEFAULT.equals(reader);
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_READER:
				return UTIL_TASK_READER_EDEFAULT == null ? utilTaskReader != null : !UTIL_TASK_READER_EDEFAULT.equals(utilTaskReader);
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__ERROR_CONTROL:
				return errorControl != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE___READ_TEMPLATE__STRING_ELIST:
				return readTemplate((String)arguments.get(0), (EList<String>)arguments.get(1));
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
		result.append(" (reader: ");
		result.append(reader);
		result.append(", utilTaskReader: ");
		result.append(utilTaskReader);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //DefaultWorkflowTemplateImpl
