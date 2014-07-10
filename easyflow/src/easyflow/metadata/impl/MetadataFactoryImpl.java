/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.metadata.impl;

import easyflow.metadata.*;

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
public class MetadataFactoryImpl extends EFactoryImpl implements MetadataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetadataFactory init() {
		try {
			MetadataFactory theMetadataFactory = (MetadataFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/metadata/1.0.0"); 
			if (theMetadataFactory != null) {
				return theMetadataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetadataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataFactoryImpl() {
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
			case MetadataPackage.DEFAULT_META_DATA: return createDefaultMetaData();
			case MetadataPackage.GROUPING: return createGrouping();
			case MetadataPackage.GROUPING_INSTANCE: return createGroupingInstance();
			case MetadataPackage.GROUPING_FEATURE: return createGroupingFeature();
			case MetadataPackage.GROUPING_INSTANCE_LIST: return createGroupingInstanceList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultMetaData createDefaultMetaData() {
		DefaultMetaDataImpl defaultMetaData = new DefaultMetaDataImpl();
		return defaultMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grouping createGrouping() {
		GroupingImpl grouping = new GroupingImpl();
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingInstance createGroupingInstance() {
		GroupingInstanceImpl groupingInstance = new GroupingInstanceImpl();
		return groupingInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingFeature createGroupingFeature() {
		GroupingFeatureImpl groupingFeature = new GroupingFeatureImpl();
		return groupingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingInstanceList createGroupingInstanceList() {
		GroupingInstanceListImpl groupingInstanceList = new GroupingInstanceListImpl();
		return groupingInstanceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataPackage getMetadataPackage() {
		return (MetadataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetadataPackage getPackage() {
		return MetadataPackage.eINSTANCE;
	}

} //MetadataFactoryImpl
