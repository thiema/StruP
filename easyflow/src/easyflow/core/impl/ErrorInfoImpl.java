/**
 */
package easyflow.core.impl;

import easyflow.core.Category;
import easyflow.core.CorePackage;
import easyflow.core.ErrorInfo;
import easyflow.core.Task;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.data.DataLink;

import java.lang.reflect.InvocationTargetException;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.ErrorInfoImpl#getTask <em>Task</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorInfoImpl#getDataLink <em>Data Link</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorInfoImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorInfoImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorInfoImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link easyflow.core.impl.ErrorInfoImpl#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorInfoImpl extends MinimalEObjectImpl.Container implements ErrorInfo {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getDataLink() <em>Data Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLink()
	 * @generated
	 * @ordered
	 */
	protected DataLink dataLink;

	/**
	 * The default value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected String info = INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Category CATEGORY_EDEFAULT = Category.PROJECT_CONFIGURATION;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ERROR_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ERROR_INFO__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_INFO__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLink getDataLink() {
		if (dataLink != null && dataLink.eIsProxy()) {
			InternalEObject oldDataLink = (InternalEObject)dataLink;
			dataLink = (DataLink)eResolveProxy(oldDataLink);
			if (dataLink != oldDataLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ERROR_INFO__DATA_LINK, oldDataLink, dataLink));
			}
		}
		return dataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLink basicGetDataLink() {
		return dataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLink(DataLink newDataLink) {
		DataLink oldDataLink = dataLink;
		dataLink = newDataLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_INFO__DATA_LINK, oldDataLink, dataLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(String newInfo) {
		String oldInfo = info;
		info = newInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_INFO__INFO, oldInfo, info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_INFO__FINAL, oldFinal, final_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ERROR_INFO__CATEGORY, oldCategory, category));
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
	 * @generated not
	 */
	public void clear() {
		setTask(null);
		setDataLink(null);
		setInfo(null);
		setCategory(null);
		setFinal(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void print() {
		
		final JTextPane textArea = GlobalVar.getTextAreaForLogMsg();
		if (textArea != null)
		{
			StyledDocument doc = textArea.getStyledDocument();
	        // jtextpane uses custom styles, have to be registered beforehand
			try 
			{
				doc.insertString(doc.getLength(), category.getLiteral()+" ", doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_CATEGORY));
				doc.insertString(doc.getLength(), GlobalConstants.LOG_MSG_WORKFLOW_FAILED_0, 
						doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_SEVERITY_HIGH));
				
				doc.insertString(doc.getLength(), " Reason: ", doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_TEXT));
				if (getInfo() != null)
					doc.insertString(doc.getLength(), getInfo()+System.getProperty("line.separator"), doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_TEXT));
				else
					doc.insertString(doc.getLength(), "No Error available."+System.getProperty("line.separator"), doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_TEXT));
				if (getTask() != null)
				{
					doc.insertString(doc.getLength(), "Task Info: ", doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_CATEGORY));
					doc.insertString(doc.getLength(), getTask().getDetailedString()+System.getProperty("line.separator"),
							doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_TEXT));
				}
				if (getDataLink() != null)
				{
					doc.insertString(doc.getLength(), "Link Info: ", doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_CATEGORY));
					doc.insertString(doc.getLength(), getDataLink().getUniqueString(true) + System.getProperty("line.separator"),
							doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_TEXT));					
				}
				
			} 
			catch (BadLocationException e) 
			{
				if (GlobalVar.outputToConsole())
				{
					logger.error("print(): Couldn't insert text into text pane.");
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ERROR_INFO__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case CorePackage.ERROR_INFO__DATA_LINK:
				if (resolve) return getDataLink();
				return basicGetDataLink();
			case CorePackage.ERROR_INFO__INFO:
				return getInfo();
			case CorePackage.ERROR_INFO__FINAL:
				return isFinal();
			case CorePackage.ERROR_INFO__CATEGORY:
				return getCategory();
			case CorePackage.ERROR_INFO__LOGGER:
				return getLogger();
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
			case CorePackage.ERROR_INFO__TASK:
				setTask((Task)newValue);
				return;
			case CorePackage.ERROR_INFO__DATA_LINK:
				setDataLink((DataLink)newValue);
				return;
			case CorePackage.ERROR_INFO__INFO:
				setInfo((String)newValue);
				return;
			case CorePackage.ERROR_INFO__FINAL:
				setFinal((Boolean)newValue);
				return;
			case CorePackage.ERROR_INFO__CATEGORY:
				setCategory((Category)newValue);
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
			case CorePackage.ERROR_INFO__TASK:
				setTask((Task)null);
				return;
			case CorePackage.ERROR_INFO__DATA_LINK:
				setDataLink((DataLink)null);
				return;
			case CorePackage.ERROR_INFO__INFO:
				setInfo(INFO_EDEFAULT);
				return;
			case CorePackage.ERROR_INFO__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case CorePackage.ERROR_INFO__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
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
			case CorePackage.ERROR_INFO__TASK:
				return task != null;
			case CorePackage.ERROR_INFO__DATA_LINK:
				return dataLink != null;
			case CorePackage.ERROR_INFO__INFO:
				return INFO_EDEFAULT == null ? info != null : !INFO_EDEFAULT.equals(info);
			case CorePackage.ERROR_INFO__FINAL:
				return final_ != FINAL_EDEFAULT;
			case CorePackage.ERROR_INFO__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case CorePackage.ERROR_INFO__LOGGER:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.ERROR_INFO___CLEAR:
				clear();
				return null;
			case CorePackage.ERROR_INFO___PRINT:
				print();
				return null;
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
		result.append(" (info: ");
		result.append(info);
		result.append(", final: ");
		result.append(final_);
		result.append(", category: ");
		result.append(category);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //ErrorInfoImpl
