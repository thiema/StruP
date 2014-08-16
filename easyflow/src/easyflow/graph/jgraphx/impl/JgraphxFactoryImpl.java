/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import easyflow.graph.jgraphx.*;

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
public class JgraphxFactoryImpl extends EFactoryImpl implements JgraphxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JgraphxFactory init() {
		try {
			JgraphxFactory theJgraphxFactory = (JgraphxFactory)EPackage.Registry.INSTANCE.getEFactory(JgraphxPackage.eNS_URI);
			if (theJgraphxFactory != null) {
				return theJgraphxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JgraphxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JgraphxFactoryImpl() {
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
			case JgraphxPackage.UTIL: return createUtil();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util createUtil() {
		UtilImpl util = new UtilImpl();
		return util;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JgraphxPackage getJgraphxPackage() {
		return (JgraphxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JgraphxPackage getPackage() {
		return JgraphxPackage.eINSTANCE;
	}

} //JgraphxFactoryImpl
