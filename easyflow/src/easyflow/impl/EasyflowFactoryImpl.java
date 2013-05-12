/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import com.mxgraph.model.mxICell;

import com.mxgraph.view.mxGraph;

import easyflow.*;

import easyflow.custom.jgraphx.editor.EasyFlowGraph;

import java.util.Stack;

import org.apache.commons.jexl2.JexlEngine;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EasyflowFactoryImpl extends EFactoryImpl implements EasyflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EasyflowFactory init() {
		try {
			EasyflowFactory theEasyflowFactory = (EasyflowFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/easyflow.core/1.0.0"); 
			if (theEasyflowFactory != null) {
				return theEasyflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EasyflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EasyflowPackage.MX_GRAPH:
				return createmxGraphFromString(eDataType, initialValue);
			case EasyflowPackage.MX_ICELL:
				return createmxICellFromString(eDataType, initialValue);
			case EasyflowPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case EasyflowPackage.JEXL_ENGINE:
				return createJexlEngineFromString(eDataType, initialValue);
			case EasyflowPackage.STACK:
				return createStackFromString(eDataType, initialValue);
			case EasyflowPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case EasyflowPackage.EASY_FLOW_GRAPH:
				return createEasyFlowGraphFromString(eDataType, initialValue);
			case EasyflowPackage.EOBJECT:
				return createEObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EasyflowPackage.MX_GRAPH:
				return convertmxGraphToString(eDataType, instanceValue);
			case EasyflowPackage.MX_ICELL:
				return convertmxICellToString(eDataType, instanceValue);
			case EasyflowPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case EasyflowPackage.JEXL_ENGINE:
				return convertJexlEngineToString(eDataType, instanceValue);
			case EasyflowPackage.STACK:
				return convertStackToString(eDataType, instanceValue);
			case EasyflowPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case EasyflowPackage.EASY_FLOW_GRAPH:
				return convertEasyFlowGraphToString(eDataType, instanceValue);
			case EasyflowPackage.EOBJECT:
				return convertEObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mxGraph createmxGraphFromString(EDataType eDataType, String initialValue) {
		return (mxGraph)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmxGraphToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mxICell createmxICellFromString(EDataType eDataType, String initialValue) {
		return (mxICell)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmxICellToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexlEngine createJexlEngineFromString(EDataType eDataType, String initialValue) {
		return (JexlEngine)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJexlEngineToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack createStackFromString(EDataType eDataType, String initialValue) {
		return (Stack)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStackToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowGraph createEasyFlowGraphFromString(EDataType eDataType, String initialValue) {
		return (EasyFlowGraph)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEasyFlowGraphToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject createEObjectFromString(EDataType eDataType, String initialValue) {
		return (EObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowPackage getEasyflowPackage() {
		return (EasyflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EasyflowPackage getPackage() {
		return EasyflowPackage.eINSTANCE;
	}

} //EasyflowFactoryImpl
