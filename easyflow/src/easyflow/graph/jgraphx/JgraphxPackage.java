/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

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
 * @see easyflow.graph.jgraphx.JgraphxFactory
 * @model kind="package"
 * @generated
 */
public interface JgraphxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jgraphx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/graph/jgraphx/easyflow.core/1.0.0";

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
	JgraphxPackage eINSTANCE = easyflow.graph.jgraphx.impl.JgraphxPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.graph.jgraphx.impl.UtilImpl <em>Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.graph.jgraphx.impl.UtilImpl
	 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getUtil()
	 * @generated
	 */
	int UTIL = 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__LOGGER = 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__TASKS = 2;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__CELLS = 3;

	/**
	 * The feature id for the '<em><b>Depricated Tasks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__DEPRICATED_TASKS = 4;

	/**
	 * The feature id for the '<em><b>Most Processed Tasks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__MOST_PROCESSED_TASKS = 5;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__META_DATA = 6;

	/**
	 * The feature id for the '<em><b>Default Root Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__DEFAULT_ROOT_CELL = 7;

	/**
	 * The number of structural features of the '<em>Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link easyflow.graph.jgraphx.Util <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Util</em>'.
	 * @see easyflow.graph.jgraphx.Util
	 * @generated
	 */
	EClass getUtil();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.graph.jgraphx.Util#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.graph.jgraphx.Util#getLogger()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.graph.jgraphx.Util#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph</em>'.
	 * @see easyflow.graph.jgraphx.Util#getGraph()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_Graph();

	/**
	 * Returns the meta object for the map '{@link easyflow.graph.jgraphx.Util#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Tasks</em>'.
	 * @see easyflow.graph.jgraphx.Util#getTasks()
	 * @see #getUtil()
	 * @generated
	 */
	EReference getUtil_Tasks();

	/**
	 * Returns the meta object for the map '{@link easyflow.graph.jgraphx.Util#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Cells</em>'.
	 * @see easyflow.graph.jgraphx.Util#getCells()
	 * @see #getUtil()
	 * @generated
	 */
	EReference getUtil_Cells();

	/**
	 * Returns the meta object for the map '{@link easyflow.graph.jgraphx.Util#getDepricatedTasks <em>Depricated Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Depricated Tasks</em>'.
	 * @see easyflow.graph.jgraphx.Util#getDepricatedTasks()
	 * @see #getUtil()
	 * @generated
	 */
	EReference getUtil_DepricatedTasks();

	/**
	 * Returns the meta object for the map '{@link easyflow.graph.jgraphx.Util#getMostProcessedTasks <em>Most Processed Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Most Processed Tasks</em>'.
	 * @see easyflow.graph.jgraphx.Util#getMostProcessedTasks()
	 * @see #getUtil()
	 * @generated
	 */
	EReference getUtil_MostProcessedTasks();

	/**
	 * Returns the meta object for the reference '{@link easyflow.graph.jgraphx.Util#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Data</em>'.
	 * @see easyflow.graph.jgraphx.Util#getMetaData()
	 * @see #getUtil()
	 * @generated
	 */
	EReference getUtil_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.graph.jgraphx.Util#getDefaultRootCell <em>Default Root Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Root Cell</em>'.
	 * @see easyflow.graph.jgraphx.Util#getDefaultRootCell()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_DefaultRootCell();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JgraphxFactory getJgraphxFactory();

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
		 * The meta object literal for the '{@link easyflow.graph.jgraphx.impl.UtilImpl <em>Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.graph.jgraphx.impl.UtilImpl
		 * @see easyflow.graph.jgraphx.impl.JgraphxPackageImpl#getUtil()
		 * @generated
		 */
		EClass UTIL = eINSTANCE.getUtil();
		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTIL__LOGGER = eINSTANCE.getUtil_Logger();
		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTIL__GRAPH = eINSTANCE.getUtil_Graph();
		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTIL__TASKS = eINSTANCE.getUtil_Tasks();
		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTIL__CELLS = eINSTANCE.getUtil_Cells();
		/**
		 * The meta object literal for the '<em><b>Depricated Tasks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTIL__DEPRICATED_TASKS = eINSTANCE.getUtil_DepricatedTasks();
		/**
		 * The meta object literal for the '<em><b>Most Processed Tasks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTIL__MOST_PROCESSED_TASKS = eINSTANCE.getUtil_MostProcessedTasks();
		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTIL__META_DATA = eINSTANCE.getUtil_MetaData();
		/**
		 * The meta object literal for the '<em><b>Default Root Cell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTIL__DEFAULT_ROOT_CELL = eINSTANCE.getUtil_DefaultRootCell();

	}

} //JgraphxPackage
