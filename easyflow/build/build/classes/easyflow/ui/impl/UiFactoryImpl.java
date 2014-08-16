/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui.impl;

import easyflow.ui.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiFactoryImpl extends EFactoryImpl implements UiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiFactory init() {
		try {
			UiFactory theUiFactory = (UiFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/ui/easyflow.core/1.0.0"); 
			if (theUiFactory != null) {
				return theUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UiPackage.DEFAULT_PROJECT: return createDefaultProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultProject createDefaultProject() {
		DefaultProjectImpl defaultProject = new DefaultProjectImpl();
		return defaultProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPackage getUiPackage() {
		return (UiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiPackage getPackage() {
		return UiPackage.eINSTANCE;
	}

} //UiFactoryImpl
