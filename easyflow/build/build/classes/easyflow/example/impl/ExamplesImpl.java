/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.example.impl;

import easyflow.custom.util.URIUtil;
import easyflow.example.ExamplePackage;
import easyflow.example.Examples;
import easyflow.ui.DefaultProject;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToProjectMapImpl;
import easyflow.ui.UiFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.CodeSource;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Examples</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.example.impl.ExamplesImpl#getLocator <em>Locator</em>}</li>
 *   <li>{@link easyflow.example.impl.ExamplesImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.example.impl.ExamplesImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link easyflow.example.impl.ExamplesImpl#isFromJar <em>From Jar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExamplesImpl extends EObjectImpl implements Examples {
	/**
	 * The default value of the '{@link #getLocator() <em>Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocator()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATOR_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getLocator() <em>Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocator()
	 * @generated
	 * @ordered
	 */
	protected String locator = LOCATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Examples.class);

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
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, DefaultProject> examples;

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
	protected ExamplesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.EXAMPLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocator() {
		return locator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocator(String newLocator) {
		String oldLocator = locator;
		locator = newLocator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.EXAMPLES__LOCATOR, oldLocator, locator));
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
	public EMap<String, DefaultProject> getExamples() {
		if (examples == null) {
			examples = new EcoreEMap<String,DefaultProject>(MapsPackage.Literals.STRING_TO_PROJECT_MAP, StringToProjectMapImpl.class, this, ExamplePackage.EXAMPLES__EXAMPLES);
		}
		return examples;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.EXAMPLES__FROM_JAR, oldFromJar, fromJar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readRepository()
	{
		URI uri;
		getExamples().clear();
		try {
			uri                           = URIUtil.createURI(getLocator(), "examples.tsv");
			InputStreamReader isReader    = URIUtil.getInputStreamReader(uri, isFromJar());
			BufferedReader bufferedReader = new BufferedReader(isReader);
			String strLine;
			while ((strLine = bufferedReader.readLine()) != null)   {
				if (!strLine.startsWith("#")) {
					String[] lina=strLine.split("\t");
					DefaultProject defaultProject = UiFactory.eINSTANCE.createDefaultProject();
					URI baseURI = lina.length > 2 ? URIUtil.createURI(getLocator(), lina[2]) : URIUtil.createURI(getLocator(), lina[0]);
					defaultProject.setBaseURI(baseURI);
					
					if (lina.length > 1)
						defaultProject.setConfigSource(
								URIUtil.addToURI(baseURI, lina[1]));
					else
						defaultProject.setConfigSource(
								URIUtil.addToURI(baseURI, "main.json"));
					
					getExamples().put(lina[0], defaultProject);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
	public EList<String> readExamples() {
		
		
		EList<String> examples = new BasicEList<String>();
		if (getLocator() == null)
			return examples;
		CodeSource src = getClass().getProtectionDomain().getCodeSource();
		try {
			
			URI uri = src.getLocation().toURI();
			// assume jar file, and assume the examples to be in ../classes
			File file = new File(uri);
			File[] peers;
			if (file.isFile())
			{
				File file1 = new File(file.getParentFile().getParentFile().getPath()+"/classes"+getLocator());
				logger.debug(file1);
				peers = file1.listFiles();
			}
			// assume directory
			else
			{
				logger.debug(uri);
				uri = new URI(uri.getScheme(),
						uri.getHost(),
						uri.getPath()+getLocator(),
						uri.getFragment());
				peers = new File(uri).listFiles();
			}
			logger.debug(peers);
			if (peers != null)
			for (File file1 : peers)
			{
				examples.add(file1.getName());
				DefaultProject defaultProject = UiFactory.eINSTANCE.createDefaultProject();
				defaultProject.setConfigSource(file1.toURI());
				getExamples().put(file1.getName(), defaultProject);
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		if (src != null) {
		  
		} 
		else {
		  // Fail
		}*/	
		return examples;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public URI getConfigByName(String name) {
		if (getExamples().containsKey(name))
			return getExamples().get(name).getConfigSource();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExamplePackage.EXAMPLES__EXAMPLES:
				return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
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
			case ExamplePackage.EXAMPLES__LOCATOR:
				return getLocator();
			case ExamplePackage.EXAMPLES__LOGGER:
				return getLogger();
			case ExamplePackage.EXAMPLES__EXAMPLES:
				if (coreType) return getExamples();
				else return getExamples().map();
			case ExamplePackage.EXAMPLES__FROM_JAR:
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
			case ExamplePackage.EXAMPLES__LOCATOR:
				setLocator((String)newValue);
				return;
			case ExamplePackage.EXAMPLES__EXAMPLES:
				((EStructuralFeature.Setting)getExamples()).set(newValue);
				return;
			case ExamplePackage.EXAMPLES__FROM_JAR:
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
			case ExamplePackage.EXAMPLES__LOCATOR:
				setLocator(LOCATOR_EDEFAULT);
				return;
			case ExamplePackage.EXAMPLES__EXAMPLES:
				getExamples().clear();
				return;
			case ExamplePackage.EXAMPLES__FROM_JAR:
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
			case ExamplePackage.EXAMPLES__LOCATOR:
				return LOCATOR_EDEFAULT == null ? locator != null : !LOCATOR_EDEFAULT.equals(locator);
			case ExamplePackage.EXAMPLES__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case ExamplePackage.EXAMPLES__EXAMPLES:
				return examples != null && !examples.isEmpty();
			case ExamplePackage.EXAMPLES__FROM_JAR:
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
		result.append(" (locator: ");
		result.append(locator);
		result.append(", logger: ");
		result.append(logger);
		result.append(", fromJar: ");
		result.append(fromJar);
		result.append(')');
		return result.toString();
	}

} //ExamplesImpl
