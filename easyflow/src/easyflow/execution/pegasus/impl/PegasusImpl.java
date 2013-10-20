/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.pegasus.impl;

import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.ExecutionPackage;

import easyflow.execution.pegasus.Pegasus;
import easyflow.execution.pegasus.PegasusPackage;

import easyflow.ui.DefaultProject;

import java.net.URI;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pegasus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.execution.pegasus.impl.PegasusImpl#getProject <em>Project</em>}</li>
 *   <li>{@link easyflow.execution.pegasus.impl.PegasusImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.execution.pegasus.impl.PegasusImpl#getSiteCatalog <em>Site Catalog</em>}</li>
 *   <li>{@link easyflow.execution.pegasus.impl.PegasusImpl#getReplicaCatalog <em>Replica Catalog</em>}</li>
 *   <li>{@link easyflow.execution.pegasus.impl.PegasusImpl#getTransformationCatalog <em>Transformation Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PegasusImpl extends EObjectImpl implements Pegasus {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected DefaultProject project;

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
	 * The default value of the '{@link #getSiteCatalog() <em>Site Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final URI SITE_CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteCatalog() <em>Site Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteCatalog()
	 * @generated
	 * @ordered
	 */
	protected URI siteCatalog = SITE_CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicaCatalog() <em>Replica Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicaCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final URI REPLICA_CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplicaCatalog() <em>Replica Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicaCatalog()
	 * @generated
	 * @ordered
	 */
	protected URI replicaCatalog = REPLICA_CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformationCatalog() <em>Transformation Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final URI TRANSFORMATION_CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationCatalog() <em>Transformation Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationCatalog()
	 * @generated
	 * @ordered
	 */
	protected URI transformationCatalog = TRANSFORMATION_CATALOG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PegasusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PegasusPackage.Literals.PEGASUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultProject getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (DefaultProject)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PegasusPackage.PEGASUS__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultProject basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(DefaultProject newProject) {
		DefaultProject oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PegasusPackage.PEGASUS__PROJECT, oldProject, project));
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
	public URI getSiteCatalog() {
		return siteCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteCatalog(URI newSiteCatalog) {
		URI oldSiteCatalog = siteCatalog;
		siteCatalog = newSiteCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PegasusPackage.PEGASUS__SITE_CATALOG, oldSiteCatalog, siteCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getReplicaCatalog() {
		return replicaCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicaCatalog(URI newReplicaCatalog) {
		URI oldReplicaCatalog = replicaCatalog;
		replicaCatalog = newReplicaCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PegasusPackage.PEGASUS__REPLICA_CATALOG, oldReplicaCatalog, replicaCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getTransformationCatalog() {
		return transformationCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationCatalog(URI newTransformationCatalog) {
		URI oldTransformationCatalog = transformationCatalog;
		transformationCatalog = newTransformationCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PegasusPackage.PEGASUS__TRANSFORMATION_CATALOG, oldTransformationCatalog, transformationCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void planWorkflow() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateSiteCatalog() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateReplicaCatalog() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateTransformationCatalog() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCommandLine(String commandPattern, EMap<String, String> commandLineParts) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createWorkflow() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void executeWorkflow() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mxICellVisitor getJgraphxVisitor() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PegasusPackage.PEGASUS__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case PegasusPackage.PEGASUS__LOGGER:
				return getLogger();
			case PegasusPackage.PEGASUS__SITE_CATALOG:
				return getSiteCatalog();
			case PegasusPackage.PEGASUS__REPLICA_CATALOG:
				return getReplicaCatalog();
			case PegasusPackage.PEGASUS__TRANSFORMATION_CATALOG:
				return getTransformationCatalog();
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
			case PegasusPackage.PEGASUS__PROJECT:
				setProject((DefaultProject)newValue);
				return;
			case PegasusPackage.PEGASUS__SITE_CATALOG:
				setSiteCatalog((URI)newValue);
				return;
			case PegasusPackage.PEGASUS__REPLICA_CATALOG:
				setReplicaCatalog((URI)newValue);
				return;
			case PegasusPackage.PEGASUS__TRANSFORMATION_CATALOG:
				setTransformationCatalog((URI)newValue);
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
			case PegasusPackage.PEGASUS__PROJECT:
				setProject((DefaultProject)null);
				return;
			case PegasusPackage.PEGASUS__SITE_CATALOG:
				setSiteCatalog(SITE_CATALOG_EDEFAULT);
				return;
			case PegasusPackage.PEGASUS__REPLICA_CATALOG:
				setReplicaCatalog(REPLICA_CATALOG_EDEFAULT);
				return;
			case PegasusPackage.PEGASUS__TRANSFORMATION_CATALOG:
				setTransformationCatalog(TRANSFORMATION_CATALOG_EDEFAULT);
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
			case PegasusPackage.PEGASUS__PROJECT:
				return project != null;
			case PegasusPackage.PEGASUS__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case PegasusPackage.PEGASUS__SITE_CATALOG:
				return SITE_CATALOG_EDEFAULT == null ? siteCatalog != null : !SITE_CATALOG_EDEFAULT.equals(siteCatalog);
			case PegasusPackage.PEGASUS__REPLICA_CATALOG:
				return REPLICA_CATALOG_EDEFAULT == null ? replicaCatalog != null : !REPLICA_CATALOG_EDEFAULT.equals(replicaCatalog);
			case PegasusPackage.PEGASUS__TRANSFORMATION_CATALOG:
				return TRANSFORMATION_CATALOG_EDEFAULT == null ? transformationCatalog != null : !TRANSFORMATION_CATALOG_EDEFAULT.equals(transformationCatalog);
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
		if (baseClass == DefaultExecutionSystem.class) {
			switch (derivedFeatureID) {
				case PegasusPackage.PEGASUS__PROJECT: return ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__PROJECT;
				case PegasusPackage.PEGASUS__LOGGER: return ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__LOGGER;
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
		if (baseClass == DefaultExecutionSystem.class) {
			switch (baseFeatureID) {
				case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__PROJECT: return PegasusPackage.PEGASUS__PROJECT;
				case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__LOGGER: return PegasusPackage.PEGASUS__LOGGER;
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
		result.append(" (logger: ");
		result.append(logger);
		result.append(", siteCatalog: ");
		result.append(siteCatalog);
		result.append(", replicaCatalog: ");
		result.append(replicaCatalog);
		result.append(", transformationCatalog: ");
		result.append(transformationCatalog);
		result.append(')');
		return result.toString();
	}

} //PegasusImpl
