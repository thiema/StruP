/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.makeflow.impl;

import easyflow.execution.makeflow.*;

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
public class MakeflowFactoryImpl extends EFactoryImpl implements MakeflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MakeflowFactory init() {
		try {
			MakeflowFactory theMakeflowFactory = (MakeflowFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/execution/makeflow/1.0.0"); 
			if (theMakeflowFactory != null) {
				return theMakeflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MakeflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeflowFactoryImpl() {
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
			case MakeflowPackage.MAKEFLOW: return createMakeflow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Makeflow createMakeflow() {
		MakeflowImpl makeflow = new MakeflowImpl();
		return makeflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeflowPackage getMakeflowPackage() {
		return (MakeflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MakeflowPackage getPackage() {
		return MakeflowPackage.eINSTANCE;
	}

} //MakeflowFactoryImpl
