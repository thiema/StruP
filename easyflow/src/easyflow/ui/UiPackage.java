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
	 * The feature id for the '<em><b>Graph Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__GRAPH_UTIL = IPROJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Default Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT_FEATURE_COUNT = IPROJECT_FEATURE_COUNT + 6;

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
	 * Returns the meta object for the reference '{@link easyflow.ui.DefaultProject#getGraphUtil <em>Graph Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph Util</em>'.
	 * @see easyflow.ui.DefaultProject#getGraphUtil()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_GraphUtil();

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
		 * The meta object literal for the '<em><b>Graph Util</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__GRAPH_UTIL = eINSTANCE.getDefaultProject_GraphUtil();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__BASE_PATH = eINSTANCE.getDefaultProject_BasePath();

	}

} //UiPackage
