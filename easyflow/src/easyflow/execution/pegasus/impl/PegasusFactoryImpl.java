/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.pegasus.impl;

import easyflow.execution.pegasus.*;

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
public class PegasusFactoryImpl extends EFactoryImpl implements PegasusFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PegasusFactory init() {
		try {
			PegasusFactory thePegasusFactory = (PegasusFactory)EPackage.Registry.INSTANCE.getEFactory(PegasusPackage.eNS_URI);
			if (thePegasusFactory != null) {
				return thePegasusFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PegasusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PegasusFactoryImpl() {
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
			case PegasusPackage.PEGASUS: return createPegasus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pegasus createPegasus() {
		PegasusImpl pegasus = new PegasusImpl();
		return pegasus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PegasusPackage getPegasusPackage() {
		return (PegasusPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PegasusPackage getPackage() {
		return PegasusPackage.eINSTANCE;
	}

} //PegasusFactoryImpl
