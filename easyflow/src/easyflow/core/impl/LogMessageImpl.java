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
import easyflow.core.LogMessage;
import easyflow.core.Severity;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.Util;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.LogMessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.core.impl.LogMessageImpl#getLogMsg <em>Log Msg</em>}</li>
 *   <li>{@link easyflow.core.impl.LogMessageImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link easyflow.core.impl.LogMessageImpl#getHelpMsg <em>Help Msg</em>}</li>
 *   <li>{@link easyflow.core.impl.LogMessageImpl#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogMessageImpl extends MinimalEObjectImpl.Container implements LogMessage {
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
	 * The default value of the '{@link #getLogMsg() <em>Log Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMsg()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_MSG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogMsg() <em>Log Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMsg()
	 * @generated
	 * @ordered
	 */
	protected String logMsg = LOG_MSG_EDEFAULT;

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
	 * The default value of the '{@link #getHelpMsg() <em>Help Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpMsg()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_MSG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelpMsg() <em>Help Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpMsg()
	 * @generated
	 * @ordered
	 */
	protected String helpMsg = HELP_MSG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(ErrorControl.class);

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
	protected LogMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.LOG_MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LOG_MESSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogMsg() {
		return logMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogMsg(String newLogMsg) {
		String oldLogMsg = logMsg;
		logMsg = newLogMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LOG_MESSAGE__LOG_MSG, oldLogMsg, logMsg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LOG_MESSAGE__CATEGORY, oldCategory, category));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHelpMsg() {
		return helpMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelpMsg(String newHelpMsg) {
		String oldHelpMsg = helpMsg;
		helpMsg = newHelpMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LOG_MESSAGE__HELP_MSG, oldHelpMsg, helpMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	private String fillSpaces(Category category)
	{
		String rc = category.getLiteral();
		final int maxLen = 25;
		
		int spaces = maxLen - category.getLiteral().length();
		if (spaces < 0)
			spaces = 1;
		String spaceStr = new String(new char[spaces]).replace('\0', ' ');
		return rc + spaceStr;
	}
	
	private void writeMsgToGUI(Category category, Severity severity, String msg) 
	{
		if (!GlobalVar.outputToGUI())
			return;
		if (!GlobalVar.isRequiredDebugLevelReached(severity))
			return;
		
		final JTextPane textArea = GlobalVar.getTextAreaForLogMsg();
		//final Font categoryFont  = new Font("Arial", Font.ITALIC + Font.BOLD, 10);
		//final Font severityFont  = new Font("Arial", Font.TRUETYPE_FONT + Font.BOLD, 10);
		//final Font msgFont       = new Font("Arial", Font.ITALIC, 8);
				
		if (textArea != null)
		{
			StyledDocument doc = textArea.getStyledDocument();
	        // jtextpane uses custom styles, have to be registered beforehand
			try {
				
				doc.insertString(doc.getLength(), fillSpaces(category)+" ", doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_CATEGORY));
				String style; 
				switch (severity)
				{
				case DEBUG:
				case TRACE:
					style = GlobalConstants.GUI_LOG_MSG_STYLE_SEVERITY_LOW;
					break;
				case ERROR:
				case FATAL:
					style = GlobalConstants.GUI_LOG_MSG_STYLE_SEVERITY_HIGH;
					break;
				default:
					style = GlobalConstants.GUI_LOG_MSG_STYLE_SEVERITY_MEDIUM;
				}
				doc.insertString(doc.getLength(), severity.getLiteral()+" ", doc.getStyle(style));
				doc.insertString(doc.getLength(), msg+System.getProperty("line.separator"), doc.getStyle(GlobalConstants.GUI_LOG_MSG_STYLE_TEXT));
				
				//doc.set
			} catch (BadLocationException e) {
				logger.error("writeMsgToGUI(): Couldn't insert text into text pane.");
				e.printStackTrace();
			}
			
			
			/*
			 * jtextarea
			textArea.setFont(categoryFont);
			textArea.setBackground(Color.BLUE);
			textArea.append(category.toString()+" ");
			textArea.setBackground(Color.RED);
			textArea.setFont(severityFont);
			textArea.append(severity.toString()+" ");
			textArea.setFont(msgFont);
			textArea.append(msg);
			textArea.setCaretPosition(textArea.getDocument().getLength());
			*/
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateLogMsg(String errorTpl, Category category, Severity severity, EList<String> errorVar) {
		//Util.generateStringList(s1);
		String logMsg = errorTpl;
		logger.debug("generateLogMsg("
				+ "errorTpl="+errorTpl
				+" category="+category.getLiteral()
				+" severity="+severity.getLiteral()
				+" errorVar="+Util.list2String(errorVar, ",")+")");
		for (int i=0; i < errorVar.size() //&& i < GlobalConstants.ERROR_STRING_VAR_PLACEHOLDERS.length
				; i++)
		{
			logMsg = StringUtils.replace(logMsg, GlobalConstants.ERROR_STRING_VAR_PLACEHOLDER, errorVar.get(i), 1);
		}
		
		writeMsgToGUI(category, severity, logMsg);
		logMsg=severity.getLiteral()+": "+logMsg;
		//GlobalVar.setLastErrorString(logMsg);
		//GlobalVar.setLastErrorReason();
		setLogMsg(logMsg);
		
		logger.debug("generateLogMsg(): return="+logMsg);
		return logMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateLogMsg(String errorTpl, Severity severity, EList<String> errorVar) {
		return generateLogMsg(errorTpl, category, severity, errorVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateLogMsg(String errorTpl, Category category, Severity severity, String helpMsg, EList<String> errorVar) {

		setHelpMsg(helpMsg);
		return generateLogMsg(errorTpl, category, severity, errorVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated  not
	 */
	public String generateLogMsg(String errorTpl, Severity severity, String helpMsg, EList<String> errorVar) {
		setHelpMsg(helpMsg);
		return generateLogMsg(errorTpl, category, severity, errorVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateLogMsg(String errorTpl, Category category, Severity severity, String errorVar) {
		String logMsg = errorTpl;
		logger.debug("generateLogMsg("
				+ "errorTpl="+errorTpl
				+" category="+category.getLiteral()
				+" severity="+severity.getLiteral()
				+" errorVar="+Util.list2String(errorVar, ",")+")");
		if (errorVar != null)
			logMsg = StringUtils.replace(logMsg, GlobalConstants.ERROR_STRING_VAR_PLACEHOLDER, errorVar, 1);

		writeMsgToGUI(category, severity, logMsg);
		logMsg=severity.getLiteral()+": "+logMsg;
		//GlobalVar.setLastErrorString(logMsg);
		//GlobalVar.setLastErrorReason();
		setLogMsg(logMsg);
		
		logger.debug("generateLogMsg(): return="+logMsg);
		return logMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateLogMsg(String errorTpl, Severity severity, String errorVar) {
		return generateLogMsg(errorTpl, category, severity, errorVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateLogMsg(String errorTpl, Category category, Severity severity, String helpMsg, String errorVar) {
		setHelpMsg(helpMsg);
		return generateLogMsg(errorTpl, category, severity, errorVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateLogMsg(String errorTpl, Severity severity, String helpMsg, String errorVar) {
		setHelpMsg(helpMsg);
		return generateLogMsg(errorTpl, category, severity, errorVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateLogMsg(String errorTpl, Severity severity) {
		return generateLogMsg(errorTpl, category, severity, (String)null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateLogMsg(String errorTpl, Category category, Severity severity, Exception exception, EList<String> errorVar) {
		if (GlobalVar.isDevloperMode())
			exception.printStackTrace();
		return generateLogMsg(errorTpl, category, severity, errorVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.LOG_MESSAGE__NAME:
				return getName();
			case CorePackage.LOG_MESSAGE__LOG_MSG:
				return getLogMsg();
			case CorePackage.LOG_MESSAGE__CATEGORY:
				return getCategory();
			case CorePackage.LOG_MESSAGE__HELP_MSG:
				return getHelpMsg();
			case CorePackage.LOG_MESSAGE__LOGGER:
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
			case CorePackage.LOG_MESSAGE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.LOG_MESSAGE__LOG_MSG:
				setLogMsg((String)newValue);
				return;
			case CorePackage.LOG_MESSAGE__CATEGORY:
				setCategory((Category)newValue);
				return;
			case CorePackage.LOG_MESSAGE__HELP_MSG:
				setHelpMsg((String)newValue);
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
			case CorePackage.LOG_MESSAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.LOG_MESSAGE__LOG_MSG:
				setLogMsg(LOG_MSG_EDEFAULT);
				return;
			case CorePackage.LOG_MESSAGE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CorePackage.LOG_MESSAGE__HELP_MSG:
				setHelpMsg(HELP_MSG_EDEFAULT);
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
			case CorePackage.LOG_MESSAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.LOG_MESSAGE__LOG_MSG:
				return LOG_MSG_EDEFAULT == null ? logMsg != null : !LOG_MSG_EDEFAULT.equals(logMsg);
			case CorePackage.LOG_MESSAGE__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case CorePackage.LOG_MESSAGE__HELP_MSG:
				return HELP_MSG_EDEFAULT == null ? helpMsg != null : !HELP_MSG_EDEFAULT.equals(helpMsg);
			case CorePackage.LOG_MESSAGE__LOGGER:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_ELIST:
				return generateLogMsg((String)arguments.get(0), (Category)arguments.get(1), (Severity)arguments.get(2), (EList<String>)arguments.get(3));
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY_ELIST:
				return generateLogMsg((String)arguments.get(0), (Severity)arguments.get(1), (EList<String>)arguments.get(2));
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_STRING_ELIST:
				return generateLogMsg((String)arguments.get(0), (Category)arguments.get(1), (Severity)arguments.get(2), (String)arguments.get(3), (EList<String>)arguments.get(4));
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY_STRING_ELIST:
				return generateLogMsg((String)arguments.get(0), (Severity)arguments.get(1), (String)arguments.get(2), (EList<String>)arguments.get(3));
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_STRING:
				return generateLogMsg((String)arguments.get(0), (Category)arguments.get(1), (Severity)arguments.get(2), (String)arguments.get(3));
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY_STRING:
				return generateLogMsg((String)arguments.get(0), (Severity)arguments.get(1), (String)arguments.get(2));
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_STRING_STRING:
				return generateLogMsg((String)arguments.get(0), (Category)arguments.get(1), (Severity)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY_STRING_STRING:
				return generateLogMsg((String)arguments.get(0), (Severity)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY:
				return generateLogMsg((String)arguments.get(0), (Severity)arguments.get(1));
			case CorePackage.LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_EXCEPTION_ELIST:
				return generateLogMsg((String)arguments.get(0), (Category)arguments.get(1), (Severity)arguments.get(2), (Exception)arguments.get(3), (EList<String>)arguments.get(4));
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
		result.append(", logMsg: ");
		result.append(logMsg);
		result.append(", category: ");
		result.append(category);
		result.append(", helpMsg: ");
		result.append(helpMsg);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //ErrorControlImpl
