/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultWorkflowTemplate;
import easyflow.core.EasyflowTemplate;
import easyflow.core.IWorkflowTemplate;
import easyflow.core.Task;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;

import java.util.Collection;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Easyflow Template</b></em>'.
 * @implements IWorkflowTemplate
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.EasyflowTemplateImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link easyflow.core.impl.EasyflowTemplateImpl#getReader <em>Reader</em>}</li>
 *   <li>{@link easyflow.core.impl.EasyflowTemplateImpl#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EasyflowTemplateImpl extends EObjectImpl implements EasyflowTemplate, IWorkflowTemplate {
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
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(EasyflowTemplateImpl.class);;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EasyflowTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EASYFLOW_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, CorePackage.EASYFLOW_TEMPLATE__TASKS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EASYFLOW_TEMPLATE__READER, oldReader, reader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EASYFLOW_TEMPLATE__LOGGER, oldLogger, logger));
	}

	/**
	 * fixes the list of parent tasks. reading the workflow template line by line to get
	 * taskName and names of parents. if parent is missing in the corresponding task object
	 * the parent is added
	 * @param tmpMap
	 */
	private void checkParents(Map<String,Task> tmpMap) {
		
        BufferedReader bufferedReader = new BufferedReader(getReader());

        String strLine;
        try {
        	
			while ((strLine = bufferedReader.readLine()) != null)   {
				if (!strLine.startsWith("#")) {
					String[] parentTaskNames=strLine.split("\t")[1].split(",");
					if (!parentTaskNames[0].equals("")) {
						String taskName=strLine.split("\t")[0];
						if (!tmpMap.containsKey(taskName)) 
							logger.error("task not found: "+taskName);
						Task task=tmpMap.get(taskName);
						logger.debug("curTask: "+task.getName()+" "+taskName);
						for (String parentTaskName:parentTaskNames) {
							boolean found=false;
							if (task.getParents().containsKey(parentTaskName))
								found=true;
							logger.debug(found+" "+parentTaskName);
							if (!found)
								if (tmpMap.containsKey(parentTaskName)) {
									task.getParents().put(parentTaskName, tmpMap.get(parentTaskName));
								} else logger.warn("parent task not found: "+parentTaskName);
						}
					}
				}
			}
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean readTemplate(String mode, EList<String> defaultGroupingCriteria) {

		Map<String,Task> tmpMap=new HashMap<String,Task>();
        // Reader reader = new InputStreamReader(getClass().getResourceAsStream(getFileName()));
        BufferedReader bufferedReader = new BufferedReader(getReader());
        String strLine;
        try {
			while ((strLine = bufferedReader.readLine()) != null)   {
				if (!strLine.startsWith("#")) {
					
					Task task = null;
					if (strLine.startsWith(GlobalConstants.ROOT_TASK_NAME) && GlobalVar.getRootTask() != null)
						task = GlobalVar.getRootTask();
					else
						task = CoreFactory.eINSTANCE.createTask();
					
					task.readTask(strLine, mode, defaultGroupingCriteria);
					tmpMap.put(task.getName(), task);
					String[] rawParentTaskNames=strLine.split("\t")[1].split(",");
					
					for (String rawParentTaskName : rawParentTaskNames) {
						if (rawParentTaskName.equals(""))
							continue;
						String[] tmp=rawParentTaskName.split(":");
						String parentTaskName=tmp[0];
						logger.debug("readTemplate(): process parent="+parentTaskName);
						if (tmpMap.containsKey(parentTaskName))
						{
							task.getParents().put(parentTaskName, tmpMap.get(parentTaskName));
						}
						else if (task.isUtil())
						{
							task.getParents().put("Root", tmpMap.get("Root"));
						}
					}
					if (GlobalVar.getRootTask() == null && GlobalConstants.ROOT_TASK_NAME.equals(task.getName()))
					{
						GlobalVar.setRootTask(task);
						task.setRoot(true);
					}
					getTasks().add(task);
					
					//if (!task.getParents().isEmpty())
						//System.out.println(task.getParents()+"("+task.getParents().size()+")");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        checkParents(tmpMap);
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
			case CorePackage.EASYFLOW_TEMPLATE__TASKS:
				return getTasks();
			case CorePackage.EASYFLOW_TEMPLATE__READER:
				return getReader();
			case CorePackage.EASYFLOW_TEMPLATE__LOGGER:
				return getLogger();
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
			case CorePackage.EASYFLOW_TEMPLATE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case CorePackage.EASYFLOW_TEMPLATE__READER:
				setReader((BufferedReader)newValue);
				return;
			case CorePackage.EASYFLOW_TEMPLATE__LOGGER:
				setLogger((Logger)newValue);
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
			case CorePackage.EASYFLOW_TEMPLATE__TASKS:
				getTasks().clear();
				return;
			case CorePackage.EASYFLOW_TEMPLATE__READER:
				setReader(READER_EDEFAULT);
				return;
			case CorePackage.EASYFLOW_TEMPLATE__LOGGER:
				setLogger(LOGGER_EDEFAULT);
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
			case CorePackage.EASYFLOW_TEMPLATE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case CorePackage.EASYFLOW_TEMPLATE__READER:
				return READER_EDEFAULT == null ? reader != null : !READER_EDEFAULT.equals(reader);
			case CorePackage.EASYFLOW_TEMPLATE__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultWorkflowTemplate.class) {
			switch (derivedFeatureID) {
				case CorePackage.EASYFLOW_TEMPLATE__TASKS: return CorePackage.DEFAULT_WORKFLOW_TEMPLATE__TASKS;
				case CorePackage.EASYFLOW_TEMPLATE__READER: return CorePackage.DEFAULT_WORKFLOW_TEMPLATE__READER;
				case CorePackage.EASYFLOW_TEMPLATE__LOGGER: return CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOGGER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultWorkflowTemplate.class) {
			switch (baseFeatureID) {
				case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__TASKS: return CorePackage.EASYFLOW_TEMPLATE__TASKS;
				case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__READER: return CorePackage.EASYFLOW_TEMPLATE__READER;
				case CorePackage.DEFAULT_WORKFLOW_TEMPLATE__LOGGER: return CorePackage.EASYFLOW_TEMPLATE__LOGGER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}


} //EasyflowTemplateImpl
