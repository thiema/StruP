/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.tool.DocumentProperties;
import easyflow.tool.ToolPackage;
import java.net.URI;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.DocumentPropertiesImpl#getSourceURI <em>Source URI</em>}</li>
 *   <li>{@link easyflow.tool.impl.DocumentPropertiesImpl#isFromJar <em>From Jar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentPropertiesImpl extends EObjectImpl implements DocumentProperties {
	/**
	 * The default value of the '{@link #getSourceURI() <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceURI()
	 * @generated
	 * @ordered
	 */
	protected static final URI SOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceURI() <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceURI()
	 * @generated
	 * @ordered
	 */
	protected URI sourceURI = SOURCE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #isFromJar() <em>From Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromJar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FROM_JAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFromJar() <em>From Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromJar()
	 * @generated
	 * @ordered
	 */
	protected boolean fromJar = FROM_JAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.DOCUMENT_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getSourceURI() {
		return sourceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceURI(URI newSourceURI) {
		URI oldSourceURI = sourceURI;
		sourceURI = newSourceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.DOCUMENT_PROPERTIES__SOURCE_URI, oldSourceURI, sourceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFromJar() {
		return fromJar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromJar(boolean newFromJar) {
		boolean oldFromJar = fromJar;
		fromJar = newFromJar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.DOCUMENT_PROPERTIES__FROM_JAR, oldFromJar, fromJar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.DOCUMENT_PROPERTIES__SOURCE_URI:
				return getSourceURI();
			case ToolPackage.DOCUMENT_PROPERTIES__FROM_JAR:
				return isFromJar();
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
			case ToolPackage.DOCUMENT_PROPERTIES__SOURCE_URI:
				setSourceURI((URI)newValue);
				return;
			case ToolPackage.DOCUMENT_PROPERTIES__FROM_JAR:
				setFromJar((Boolean)newValue);
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
			case ToolPackage.DOCUMENT_PROPERTIES__SOURCE_URI:
				setSourceURI(SOURCE_URI_EDEFAULT);
				return;
			case ToolPackage.DOCUMENT_PROPERTIES__FROM_JAR:
				setFromJar(FROM_JAR_EDEFAULT);
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
			case ToolPackage.DOCUMENT_PROPERTIES__SOURCE_URI:
				return SOURCE_URI_EDEFAULT == null ? sourceURI != null : !SOURCE_URI_EDEFAULT.equals(sourceURI);
			case ToolPackage.DOCUMENT_PROPERTIES__FROM_JAR:
				return fromJar != FROM_JAR_EDEFAULT;
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
		result.append(" (sourceURI: ");
		result.append(sourceURI);
		result.append(", fromJar: ");
		result.append(fromJar);
		result.append(')');
		return result.toString();
	}

} //DocumentPropertiesImpl
