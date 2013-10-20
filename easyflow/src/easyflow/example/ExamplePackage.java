/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.example;

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
 * @see easyflow.example.ExampleFactory
 * @model kind="package"
 * @generated
 */
public interface ExamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "example";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/example/1.0.0";

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
	ExamplePackage eINSTANCE = easyflow.example.impl.ExamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.example.impl.ExamplesImpl <em>Examples</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.example.impl.ExamplesImpl
	 * @see easyflow.example.impl.ExamplePackageImpl#getExamples()
	 * @generated
	 */
	int EXAMPLES = 0;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES__LOCATOR = 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES__LOGGER = 1;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES__EXAMPLES = 2;

	/**
	 * The feature id for the '<em><b>From Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES__FROM_JAR = 3;

	/**
	 * The number of structural features of the '<em>Examples</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link easyflow.example.Examples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples</em>'.
	 * @see easyflow.example.Examples
	 * @generated
	 */
	EClass getExamples();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.example.Examples#getLocator <em>Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locator</em>'.
	 * @see easyflow.example.Examples#getLocator()
	 * @see #getExamples()
	 * @generated
	 */
	EAttribute getExamples_Locator();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.example.Examples#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.example.Examples#getLogger()
	 * @see #getExamples()
	 * @generated
	 */
	EAttribute getExamples_Logger();

	/**
	 * Returns the meta object for the map '{@link easyflow.example.Examples#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Examples</em>'.
	 * @see easyflow.example.Examples#getExamples()
	 * @see #getExamples()
	 * @generated
	 */
	EReference getExamples_Examples();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.example.Examples#isFromJar <em>From Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Jar</em>'.
	 * @see easyflow.example.Examples#isFromJar()
	 * @see #getExamples()
	 * @generated
	 */
	EAttribute getExamples_FromJar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExampleFactory getExampleFactory();

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
		 * The meta object literal for the '{@link easyflow.example.impl.ExamplesImpl <em>Examples</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.example.impl.ExamplesImpl
		 * @see easyflow.example.impl.ExamplePackageImpl#getExamples()
		 * @generated
		 */
		EClass EXAMPLES = eINSTANCE.getExamples();

		/**
		 * The meta object literal for the '<em><b>Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES__LOCATOR = eINSTANCE.getExamples_Locator();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES__LOGGER = eINSTANCE.getExamples_Logger();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLES__EXAMPLES = eINSTANCE.getExamples_Examples();

		/**
		 * The meta object literal for the '<em><b>From Jar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES__FROM_JAR = eINSTANCE.getExamples_FromJar();

	}

} //ExamplePackage
