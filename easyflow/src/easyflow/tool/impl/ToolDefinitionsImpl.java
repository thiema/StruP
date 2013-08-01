/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.custom.util.URIUtil;
import easyflow.custom.util.XMLUtil;
import easyflow.tool.ToolDefinitions;
import easyflow.tool.ToolPackage;
import easyflow.tool.ToolSchemata;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.net.URI;

import java.util.Collection;

import org.apache.log4j.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

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
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolDefinitionsImpl extends EObjectImpl implements ToolDefinitions {
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
	 * @generated not
	 */
	public Document readToolDefinition(URI xmlSource, boolean isFromJar) throws FileNotFoundException {
		
		Document doc = XMLUtil.readXML(xmlSource, isFromJar);
		
		Schema schema = getToolSchemata().getSchemaFor(doc);
		if (schema != null)
			try {
				XMLUtil.validateXML(xmlSource, schema, isFromJar);
				logger.debug("xml source: "+xmlSource.toString()+" validated successfully !");
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		// TODO: handle schema not found/unvalidated xml source
		return doc;
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
		result.append(" (toolDefinitions: ");
		result.append(toolDefinitions);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //ToolDefinitionsImpl
