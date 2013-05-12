/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see easyflow.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/ui/easyflow.core/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "easyflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = easyflow.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.ui.IProject <em>IProject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.ui.IProject
	 * @see easyflow.ui.impl.UiPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 0;

	/**
	 * The number of structural features of the '<em>IProject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.ui.impl.DefaultProjectImpl <em>Default Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.ui.impl.DefaultProjectImpl
	 * @see easyflow.ui.impl.UiPackageImpl#getDefaultProject()
	 * @generated
	 */
	int DEFAULT_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__WORKFLOWS = IPROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__META_DATA = IPROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__FILE_NAME = IPROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__BASE_PATH = IPROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__LOGGER = IPROJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Default Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT_FEATURE_COUNT = IPROJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link easyflow.ui.impl.ResequencingProjectImpl <em>Resequencing Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.ui.impl.ResequencingProjectImpl
	 * @see easyflow.ui.impl.UiPackageImpl#getResequencingProject()
	 * @generated
	 */
	int RESEQUENCING_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEQUENCING_PROJECT__WORKFLOWS = DEFAULT_PROJECT__WORKFLOWS;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEQUENCING_PROJECT__META_DATA = DEFAULT_PROJECT__META_DATA;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEQUENCING_PROJECT__FILE_NAME = DEFAULT_PROJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEQUENCING_PROJECT__BASE_PATH = DEFAULT_PROJECT__BASE_PATH;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEQUENCING_PROJECT__LOGGER = DEFAULT_PROJECT__LOGGER;

	/**
	 * The feature id for the '<em><b>Ref Based Project Meta Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEQUENCING_PROJECT__REF_BASED_PROJECT_META_DATA = DEFAULT_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resequencing Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEQUENCING_PROJECT_FEATURE_COUNT = DEFAULT_PROJECT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link easyflow.ui.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProject</em>'.
	 * @see easyflow.ui.IProject
	 * @generated
	 */
	EClass getIProject();

	/**
	 * Returns the meta object for class '{@link easyflow.ui.DefaultProject <em>Default Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Project</em>'.
	 * @see easyflow.ui.DefaultProject
	 * @generated
	 */
	EClass getDefaultProject();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.ui.DefaultProject#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflows</em>'.
	 * @see easyflow.ui.DefaultProject#getWorkflows()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_Workflows();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.ui.DefaultProject#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Data</em>'.
	 * @see easyflow.ui.DefaultProject#getMetaData()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see easyflow.ui.DefaultProject#getFileName()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_FileName();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.ui.DefaultProject#getLogger()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see easyflow.ui.DefaultProject#getBasePath()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_BasePath();

	/**
	 * Returns the meta object for class '{@link easyflow.ui.ResequencingProject <em>Resequencing Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resequencing Project</em>'.
	 * @see easyflow.ui.ResequencingProject
	 * @generated
	 */
	EClass getResequencingProject();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.ui.ResequencingProject#getRefBasedProjectMetaData <em>Ref Based Project Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Based Project Meta Data</em>'.
	 * @see easyflow.ui.ResequencingProject#getRefBasedProjectMetaData()
	 * @see #getResequencingProject()
	 * @generated
	 */
	EReference getResequencingProject_RefBasedProjectMetaData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link easyflow.ui.IProject <em>IProject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.ui.IProject
		 * @see easyflow.ui.impl.UiPackageImpl#getIProject()
		 * @generated
		 */
		EClass IPROJECT = eINSTANCE.getIProject();

		/**
		 * The meta object literal for the '{@link easyflow.ui.impl.DefaultProjectImpl <em>Default Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.ui.impl.DefaultProjectImpl
		 * @see easyflow.ui.impl.UiPackageImpl#getDefaultProject()
		 * @generated
		 */
		EClass DEFAULT_PROJECT = eINSTANCE.getDefaultProject();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__WORKFLOWS = eINSTANCE.getDefaultProject_Workflows();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__META_DATA = eINSTANCE.getDefaultProject_MetaData();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__FILE_NAME = eINSTANCE.getDefaultProject_FileName();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__LOGGER = eINSTANCE.getDefaultProject_Logger();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__BASE_PATH = eINSTANCE.getDefaultProject_BasePath();

		/**
		 * The meta object literal for the '{@link easyflow.ui.impl.ResequencingProjectImpl <em>Resequencing Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.ui.impl.ResequencingProjectImpl
		 * @see easyflow.ui.impl.UiPackageImpl#getResequencingProject()
		 * @generated
		 */
		EClass RESEQUENCING_PROJECT = eINSTANCE.getResequencingProject();

		/**
		 * The meta object literal for the '<em><b>Ref Based Project Meta Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEQUENCING_PROJECT__REF_BASED_PROJECT_META_DATA = eINSTANCE.getResequencingProject_RefBasedProjectMetaData();

	}

} //UiPackage
