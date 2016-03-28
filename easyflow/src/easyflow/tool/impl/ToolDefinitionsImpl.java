/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.util.Category;
import easyflow.util.UtilFactory;
import easyflow.core.CoreFactory;
import easyflow.util.Severity;
import easyflow.tool.DocumentProperties;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.Util;
import easyflow.custom.util.XMLUtil;
import easyflow.tool.ToolDefinitions;
import easyflow.tool.ToolPackage;
import easyflow.tool.ToolSchemata;
import easyflow.util.LogMessage;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToDocumentPropertiesMapImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Collection;

import org.apache.log4j.Logger;

import javax.xml.validation.Schema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.ToolDefinitionsImpl#getToolDefinitions <em>Tool Definitions</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolDefinitionsImpl#getToolSchemata <em>Tool Schemata</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolDefinitionsImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolDefinitionsImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolDefinitionsImpl#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolDefinitionsImpl extends MinimalEObjectImpl.Container implements ToolDefinitions {
	/**
	 * The cached value of the '{@link #getToolDefinitions() <em>Tool Definitions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> toolDefinitions;

	/**
	 * The cached value of the '{@link #getToolSchemata() <em>Tool Schemata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolSchemata()
	 * @generated
	 * @ordered
	 */
	protected ToolSchemata toolSchemata;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(ToolDefinitions.class);

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, DocumentProperties> properties;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.TOOL_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getToolDefinitions() {
		if (toolDefinitions == null) {
			toolDefinitions = new EDataTypeUniqueEList<Document>(Document.class, this, ToolPackage.TOOL_DEFINITIONS__TOOL_DEFINITIONS);
		}
		return toolDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolSchemata getToolSchemata() {
		if (toolSchemata != null && toolSchemata.eIsProxy()) {
			InternalEObject oldToolSchemata = (InternalEObject)toolSchemata;
			toolSchemata = (ToolSchemata)eResolveProxy(oldToolSchemata);
			if (toolSchemata != oldToolSchemata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.TOOL_DEFINITIONS__TOOL_SCHEMATA, oldToolSchemata, toolSchemata));
			}
		}
		return toolSchemata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolSchemata basicGetToolSchemata() {
		return toolSchemata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolSchemata(ToolSchemata newToolSchemata) {
		ToolSchemata oldToolSchemata = toolSchemata;
		toolSchemata = newToolSchemata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL_DEFINITIONS__TOOL_SCHEMATA, oldToolSchemata, toolSchemata));
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
	public EMap<String, DocumentProperties> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,DocumentProperties>(MapsPackage.Literals.STRING_TO_DOCUMENT_PROPERTIES_MAP, StringToDocumentPropertiesMapImpl.class, this, ToolPackage.TOOL_DEFINITIONS__PROPERTIES);
		}
		return properties;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.TOOL_DEFINITIONS__LOG_MESSAGE, oldLogMessage, logMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL_DEFINITIONS__LOG_MESSAGE, oldLogMessage, logMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateToolDefinition(URI xmlSource, boolean isFromJar) throws FileNotFoundException {
		
		Document doc = XMLUtil.readXML(xmlSource, isFromJar);
		
		Schema schema = getToolSchemata().getSchemaFor(doc);
		if (schema != null)
			try {
				XMLUtil.validateXML(xmlSource, schema, isFromJar);
				logger.debug("xml source: "+xmlSource.toString()+" validated successfully !");
				
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_TOOL_DEFINITION_FAILED_TO_PARSE_2,
						Severity.ERROR, Util.generateStringList(xmlSource.toString(), e.getMessage()));
				return false;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_TOOL_DEFINITION_FAILED_TO_READ_2,
						Severity.ERROR, Util.generateStringList(xmlSource.toString(), e.getMessage()));
				e.printStackTrace();
				return false;
			}
			
		// TODO: handle schema not found/unvalidated xml source
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void initLogMessage() {
		if (getLogMessage() == null)
		{
			setLogMessage(UtilFactory.eINSTANCE.createLogMessage());
			getLogMessage().setCategory(Category.TOOL_DEFINITION);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolPackage.TOOL_DEFINITIONS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.TOOL_DEFINITIONS__TOOL_DEFINITIONS:
				return getToolDefinitions();
			case ToolPackage.TOOL_DEFINITIONS__TOOL_SCHEMATA:
				if (resolve) return getToolSchemata();
				return basicGetToolSchemata();
			case ToolPackage.TOOL_DEFINITIONS__LOGGER:
				return getLogger();
			case ToolPackage.TOOL_DEFINITIONS__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case ToolPackage.TOOL_DEFINITIONS__LOG_MESSAGE:
				if (resolve) return getLogMessage();
				return basicGetLogMessage();
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
			case ToolPackage.TOOL_DEFINITIONS__TOOL_DEFINITIONS:
				getToolDefinitions().clear();
				getToolDefinitions().addAll((Collection<? extends Document>)newValue);
				return;
			case ToolPackage.TOOL_DEFINITIONS__TOOL_SCHEMATA:
				setToolSchemata((ToolSchemata)newValue);
				return;
			case ToolPackage.TOOL_DEFINITIONS__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case ToolPackage.TOOL_DEFINITIONS__LOG_MESSAGE:
				setLogMessage((LogMessage)newValue);
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
			case ToolPackage.TOOL_DEFINITIONS__TOOL_DEFINITIONS:
				getToolDefinitions().clear();
				return;
			case ToolPackage.TOOL_DEFINITIONS__TOOL_SCHEMATA:
				setToolSchemata((ToolSchemata)null);
				return;
			case ToolPackage.TOOL_DEFINITIONS__PROPERTIES:
				getProperties().clear();
				return;
			case ToolPackage.TOOL_DEFINITIONS__LOG_MESSAGE:
				setLogMessage((LogMessage)null);
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
			case ToolPackage.TOOL_DEFINITIONS__TOOL_DEFINITIONS:
				return toolDefinitions != null && !toolDefinitions.isEmpty();
			case ToolPackage.TOOL_DEFINITIONS__TOOL_SCHEMATA:
				return toolSchemata != null;
			case ToolPackage.TOOL_DEFINITIONS__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case ToolPackage.TOOL_DEFINITIONS__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ToolPackage.TOOL_DEFINITIONS__LOG_MESSAGE:
				return logMessage != null;
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
			case ToolPackage.TOOL_DEFINITIONS___VALIDATE_TOOL_DEFINITION__URI_BOOLEAN:
				try {
					return validateToolDefinition((URI)arguments.get(0), (Boolean)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL_DEFINITIONS___INIT_LOG_MESSAGE:
				initLogMessage();
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
		result.append(" (toolDefinitions: ");
		result.append(toolDefinitions);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //ToolDefinitionsImpl
