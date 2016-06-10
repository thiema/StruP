/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.core.CorePackage;
import easyflow.core.DefaultWorkflowTemplate;
import easyflow.core.Task;
import easyflow.util.LogMessage;
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
 *   <li>{@link easyflow.core.impl.DefaultWorkflowTemplateImpl#getLogMessage <em>Log Message</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultWorkflowTemplateImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultWorkflowTemplateImpl#getUtilTaskFileName <em>Util Task File Name</em>}</li>
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
	 * The cached value of the '{@link #getLogMessage() <em>Log Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessage()
	 * @generated
	 * @ordered
	 */
	protected LogMessage logMessage;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilTaskFileName() <em>Util Task File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilTaskFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String UTIL_TASK_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtilTaskFileName() <em>Util Task File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilTaskFileName()
	 * @generated
	 * @ordered
	 */
	protected String utilTaskFileName = UTIL_TASK_FILE_NAME_EDEFAULT;

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
	public LogMessage getLogMessage() {
		if (logMessage != null && logMessage.eIsProxy()) {
			InternalEObject oldLogMessage = (InternalEObject)logMessage;
			logMessage = (LogMessage)eResolveProxy(oldLogMessage);
			if (logMessage != oldLogMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOG_MESSAGE, oldLogMessage, logMessage));
			}
		}
		return logMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessage basicGetLogMessage() {
		return logMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogMessage(LogMessage newLogMessage) {
		LogMessage oldLogMessage = logMessage;
		logMessage = newLogMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOG_MESSAGE, oldLogMessage, logMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUtilTaskFileName() {
		return utilTaskFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilTaskFileName(String newUtilTaskFileName) {
		String oldUtilTaskFileName = utilTaskFileName;
		utilTaskFileName = newUtilTaskFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_FILE_NAME, oldUtilTaskFileName, utilTaskFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initLogMessage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOG_MESSAGE:
				if (resolve) return getLogMessage();
				return basicGetLogMessage();
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__FILE_NAME:
				return getFileName();
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_FILE_NAME:
				return getUtilTaskFileName();
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
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOG_MESSAGE:
				setLogMessage((LogMessage)newValue);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_FILE_NAME:
				setUtilTaskFileName((String)newValue);
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
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOG_MESSAGE:
				setLogMessage((LogMessage)null);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_FILE_NAME:
				setUtilTaskFileName(UTIL_TASK_FILE_NAME_EDEFAULT);
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
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOG_MESSAGE:
				return logMessage != null;
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_FILE_NAME:
				return UTIL_TASK_FILE_NAME_EDEFAULT == null ? utilTaskFileName != null : !UTIL_TASK_FILE_NAME_EDEFAULT.equals(utilTaskFileName);
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
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE___INIT_LOG_MESSAGE:
				initLogMessage();
				return null;
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
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", utilTaskFileName: ");
		result.append(utilTaskFileName);
		result.append(')');
		return result.toString();
	}

} //DefaultWorkflowTemplateImpl
