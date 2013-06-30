/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.impl;

import easyflow.sequencing.*;

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
public class SequencingFactoryImpl extends EFactoryImpl implements SequencingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SequencingFactory init() {
		try {
			SequencingFactory theSequencingFactory = (SequencingFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/sequencing/easyflow.core/1.0.0"); 
			if (theSequencingFactory != null) {
				return theSequencingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SequencingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencingFactoryImpl() {
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
			case SequencingPackage.REF_BASED_PROJECT_META_DATA: return createRefBasedProjectMetaData();
			case SequencingPackage.META_DATA: return createMetaData();
			case SequencingPackage.RESEQUENCING_PROJECT: return createResequencingProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefBasedProjectMetaData createRefBasedProjectMetaData() {
		RefBasedProjectMetaDataImpl refBasedProjectMetaData = new RefBasedProjectMetaDataImpl();
		return refBasedProjectMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData createMetaData() {
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResequencingProject createResequencingProject() {
		ResequencingProjectImpl resequencingProject = new ResequencingProjectImpl();
		return resequencingProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencingPackage getSequencingPackage() {
		return (SequencingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SequencingPackage getPackage() {
		return SequencingPackage.eINSTANCE;
	}

} //SequencingFactoryImpl
