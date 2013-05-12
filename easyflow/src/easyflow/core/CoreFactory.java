/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = easyflow.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Port</em>'.
	 * @generated
	 */
	DataPort createDataPort();

	/**
	 * Returns a new object of class '<em>Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Format</em>'.
	 * @generated
	 */
	DataFormat createDataFormat();

	/**
	 * Returns a new object of class '<em>Default Workflow Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Workflow Template</em>'.
	 * @generated
	 */
	DefaultWorkflowTemplate createDefaultWorkflowTemplate();

	/**
	 * Returns a new object of class '<em>Easyflow Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Easyflow Template</em>'.
	 * @generated
	 */
	EasyflowTemplate createEasyflowTemplate();

	/**
	 * Returns a new object of class '<em>Easyflow Task Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Easyflow Task Reader</em>'.
	 * @generated
	 */
	EasyflowTaskReader createEasyflowTaskReader();

	/**
	 * Returns a new object of class '<em>Galaxy Task Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Galaxy Task Reader</em>'.
	 * @generated
	 */
	GalaxyTaskReader createGalaxyTaskReader();

	/**
	 * Returns a new object of class '<em>Default Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Meta Data</em>'.
	 * @generated
	 */
	DefaultMetaData createDefaultMetaData();

	/**
	 * Returns a new object of class '<em>Grouping Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouping Criterion</em>'.
	 * @generated
	 */
	GroupingCriterion createGroupingCriterion();

	/**
	 * Returns a new object of class '<em>Traversal Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traversal Criterion</em>'.
	 * @generated
	 */
	TraversalCriterion createTraversalCriterion();

	/**
	 * Returns a new object of class '<em>Traversal Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traversal Event</em>'.
	 * @generated
	 */
	TraversalEvent createTraversalEvent();

	/**
	 * Returns a new object of class '<em>Traversal Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traversal Operation</em>'.
	 * @generated
	 */
	TraversalOperation createTraversalOperation();

	/**
	 * Returns a new object of class '<em>Traversal Chunk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traversal Chunk</em>'.
	 * @generated
	 */
	TraversalChunk createTraversalChunk();

	/**
	 * Returns a new object of class '<em>Default Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Record</em>'.
	 * @generated
	 */
	DefaultRecord createDefaultRecord();

	/**
	 * Returns a new object of class '<em>Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouping</em>'.
	 * @generated
	 */
	Grouping createGrouping();

	/**
	 * Returns a new object of class '<em>Grouping Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouping Instance</em>'.
	 * @generated
	 */
	GroupingInstance createGroupingInstance();

	/**
	 * Returns a new object of class '<em>Grouping Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouping Feature</em>'.
	 * @generated
	 */
	GroupingFeature createGroupingFeature();

	/**
	 * Returns a new object of class '<em>Grouping Instance List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouping Instance List</em>'.
	 * @generated
	 */
	GroupingInstanceList createGroupingInstanceList();

	/**
	 * Returns a new object of class '<em>Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpreter</em>'.
	 * @generated
	 */
	Interpreter createInterpreter();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
