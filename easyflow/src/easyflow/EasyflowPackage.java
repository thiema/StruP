/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see easyflow.EasyflowFactory
 * @model kind="package"
 * @generated
 */
public interface EasyflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "easyflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/easyflow.core/1.0.0";

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
	EasyflowPackage eINSTANCE = easyflow.impl.EasyflowPackageImpl.init();

	/**
	 * The meta object id for the '<em>mx Graph</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mxgraph.view.mxGraph
	 * @see easyflow.impl.EasyflowPackageImpl#getmxGraph()
	 * @generated
	 */
	int MX_GRAPH = 0;

	/**
	 * The meta object id for the '<em>mx ICell</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mxgraph.model.mxICell
	 * @see easyflow.impl.EasyflowPackageImpl#getmxICell()
	 * @generated
	 */
	int MX_ICELL = 1;

	/**
	 * The meta object id for the '<em>Logger</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.log4j.Logger
	 * @see easyflow.impl.EasyflowPackageImpl#getLogger()
	 * @generated
	 */
	int LOGGER = 2;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see easyflow.impl.EasyflowPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 3;

	/**
	 * The meta object id for the '<em>Jexl Engine</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.commons.jexl2.JexlEngine
	 * @see easyflow.impl.EasyflowPackageImpl#getJexlEngine()
	 * @generated
	 */
	int JEXL_ENGINE = 4;

	/**
	 * The meta object id for the '<em>Stack</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Stack
	 * @see easyflow.impl.EasyflowPackageImpl#getStack()
	 * @generated
	 */
	int STACK = 5;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see easyflow.impl.EasyflowPackageImpl#getURI()
	 * @generated
	 */
	int URI = 6;

	/**
	 * The meta object id for the '<em>Easy Flow Graph</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.custom.jgraphx.editor.EasyFlowGraph
	 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowGraph()
	 * @generated
	 */
	int EASY_FLOW_GRAPH = 7;

	/**
	 * The meta object id for the '<em>EObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EObject
	 * @see easyflow.impl.EasyflowPackageImpl#getEObject()
	 * @generated
	 */
	int EOBJECT = 8;

	/**
	 * The meta object id for the '<em>Document</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Document
	 * @see easyflow.impl.EasyflowPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 9;

	/**
	 * The meta object id for the '<em>Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Element
	 * @see easyflow.impl.EasyflowPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 10;


	/**
	 * The meta object id for the '<em>Schema</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.validation.Schema
	 * @see easyflow.impl.EasyflowPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 11;


	/**
	 * The meta object id for the '<em>JSON Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.json.JSONObject
	 * @see easyflow.impl.EasyflowPackageImpl#getJSONObject()
	 * @generated
	 */
	int JSON_OBJECT = 12;


	/**
	 * The meta object id for the '<em>Buffered Reader</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.BufferedReader
	 * @see easyflow.impl.EasyflowPackageImpl#getBufferedReader()
	 * @generated
	 */
	int BUFFERED_READER = 13;


	/**
	 * The meta object id for the '<em>File Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.FileNotFoundException
	 * @see easyflow.impl.EasyflowPackageImpl#getFileNotFoundException()
	 * @generated
	 */
	int FILE_NOT_FOUND_EXCEPTION = 14;


	/**
	 * The meta object id for the '<em>Grouping Instance Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.custom.exception.GroupingInstanceNotFoundException
	 * @see easyflow.impl.EasyflowPackageImpl#getGroupingInstanceNotFoundException()
	 * @generated
	 */
	int GROUPING_INSTANCE_NOT_FOUND_EXCEPTION = 15;

	/**
	 * The meta object id for the '<em>Task To Cell Map Key Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.custom.exception.TaskToCellMapKeyNotFoundException
	 * @see easyflow.impl.EasyflowPackageImpl#getTaskToCellMapKeyNotFoundException()
	 * @generated
	 */
	int TASK_TO_CELL_MAP_KEY_NOT_FOUND_EXCEPTION = 16;

	/**
	 * The meta object id for the '<em>mx ICell Visitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mxgraph.view.mxGraph.mxICellVisitor
	 * @see easyflow.impl.EasyflowPackageImpl#getmxICellVisitor()
	 * @generated
	 */
	int MX_ICELL_VISITOR = 17;

	/**
	 * The meta object id for the '<em>Pattern</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.regex.Pattern
	 * @see easyflow.impl.EasyflowPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 18;

	/**
	 * The meta object id for the '<em>Cell Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.custom.exception.CellNotFoundException
	 * @see easyflow.impl.EasyflowPackageImpl#getCellNotFoundException()
	 * @generated
	 */
	int CELL_NOT_FOUND_EXCEPTION = 19;

	/**
	 * The meta object id for the '<em>Task Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.custom.exception.TaskNotFoundException
	 * @see easyflow.impl.EasyflowPackageImpl#getTaskNotFoundException()
	 * @generated
	 */
	int TASK_NOT_FOUND_EXCEPTION = 20;

	/**
	 * The meta object id for the '<em>Data Port Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.custom.exception.DataPortNotFoundException
	 * @see easyflow.impl.EasyflowPackageImpl#getDataPortNotFoundException()
	 * @generated
	 */
	int DATA_PORT_NOT_FOUND_EXCEPTION = 21;

	/**
	 * The meta object id for the '<em>Data Link Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.custom.exception.DataLinkNotFoundException
	 * @see easyflow.impl.EasyflowPackageImpl#getDataLinkNotFoundException()
	 * @generated
	 */
	int DATA_LINK_NOT_FOUND_EXCEPTION = 22;

	/**
	 * Returns the meta object for data type '{@link com.mxgraph.view.mxGraph <em>mx Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>mx Graph</em>'.
	 * @see com.mxgraph.view.mxGraph
	 * @model instanceClass="com.mxgraph.view.mxGraph"
	 * @generated
	 */
	EDataType getmxGraph();

	/**
	 * Returns the meta object for data type '{@link com.mxgraph.model.mxICell <em>mx ICell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>mx ICell</em>'.
	 * @see com.mxgraph.model.mxICell
	 * @model instanceClass="com.mxgraph.model.mxICell"
	 * @generated
	 */
	EDataType getmxICell();

	/**
	 * Returns the meta object for data type '{@link org.apache.log4j.Logger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Logger</em>'.
	 * @see org.apache.log4j.Logger
	 * @model instanceClass="org.apache.log4j.Logger" serializeable="false"
	 * @generated
	 */
	EDataType getLogger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '{@link org.apache.commons.jexl2.JexlEngine <em>Jexl Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Jexl Engine</em>'.
	 * @see org.apache.commons.jexl2.JexlEngine
	 * @model instanceClass="org.apache.commons.jexl2.JexlEngine"
	 * @generated
	 */
	EDataType getJexlEngine();

	/**
	 * Returns the meta object for data type '{@link java.util.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stack</em>'.
	 * @see java.util.Stack
	 * @model instanceClass="java.util.Stack"
	 * @generated
	 */
	EDataType getStack();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link easyflow.custom.jgraphx.editor.EasyFlowGraph <em>Easy Flow Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Easy Flow Graph</em>'.
	 * @see easyflow.custom.jgraphx.editor.EasyFlowGraph
	 * @model instanceClass="easyflow.custom.jgraphx.editor.EasyFlowGraph"
	 * @generated
	 */
	EDataType getEasyFlowGraph();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EObject</em>'.
	 * @see org.eclipse.emf.ecore.EObject
	 * @model instanceClass="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EDataType getEObject();

	/**
	 * Returns the meta object for data type '{@link org.w3c.dom.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Document</em>'.
	 * @see org.w3c.dom.Document
	 * @model instanceClass="org.w3c.dom.Document"
	 * @generated
	 */
	EDataType getDocument();

	/**
	 * Returns the meta object for data type '{@link org.w3c.dom.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Element</em>'.
	 * @see org.w3c.dom.Element
	 * @model instanceClass="org.w3c.dom.Element"
	 * @generated
	 */
	EDataType getElement();

	/**
	 * Returns the meta object for data type '{@link javax.xml.validation.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Schema</em>'.
	 * @see javax.xml.validation.Schema
	 * @model instanceClass="javax.xml.validation.Schema"
	 * @generated
	 */
	EDataType getSchema();

	/**
	 * Returns the meta object for data type '{@link net.sf.json.JSONObject <em>JSON Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JSON Object</em>'.
	 * @see net.sf.json.JSONObject
	 * @model instanceClass="net.sf.json.JSONObject"
	 * @generated
	 */
	EDataType getJSONObject();

	/**
	 * Returns the meta object for data type '{@link java.io.BufferedReader <em>Buffered Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Buffered Reader</em>'.
	 * @see java.io.BufferedReader
	 * @model instanceClass="java.io.BufferedReader"
	 * @generated
	 */
	EDataType getBufferedReader();

	/**
	 * Returns the meta object for data type '{@link java.io.FileNotFoundException <em>File Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File Not Found Exception</em>'.
	 * @see java.io.FileNotFoundException
	 * @model instanceClass="java.io.FileNotFoundException"
	 * @generated
	 */
	EDataType getFileNotFoundException();

	/**
	 * Returns the meta object for data type '{@link easyflow.custom.exception.GroupingInstanceNotFoundException <em>Grouping Instance Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Grouping Instance Not Found Exception</em>'.
	 * @see easyflow.custom.exception.GroupingInstanceNotFoundException
	 * @model instanceClass="easyflow.custom.exception.GroupingInstanceNotFoundException"
	 * @generated
	 */
	EDataType getGroupingInstanceNotFoundException();

	/**
	 * Returns the meta object for data type '{@link easyflow.custom.exception.TaskToCellMapKeyNotFoundException <em>Task To Cell Map Key Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task To Cell Map Key Not Found Exception</em>'.
	 * @see easyflow.custom.exception.TaskToCellMapKeyNotFoundException
	 * @model instanceClass="easyflow.custom.exception.TaskToCellMapKeyNotFoundException"
	 * @generated
	 */
	EDataType getTaskToCellMapKeyNotFoundException();

	/**
	 * Returns the meta object for data type '{@link com.mxgraph.view.mxGraph.mxICellVisitor <em>mx ICell Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>mx ICell Visitor</em>'.
	 * @see com.mxgraph.view.mxGraph.mxICellVisitor
	 * @model instanceClass="com.mxgraph.view.mxGraph.mxICellVisitor"
	 * @generated
	 */
	EDataType getmxICellVisitor();

	/**
	 * Returns the meta object for data type '{@link java.util.regex.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pattern</em>'.
	 * @see java.util.regex.Pattern
	 * @model instanceClass="java.util.regex.Pattern"
	 * @generated
	 */
	EDataType getPattern();

	/**
	 * Returns the meta object for data type '{@link easyflow.custom.exception.CellNotFoundException <em>Cell Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell Not Found Exception</em>'.
	 * @see easyflow.custom.exception.CellNotFoundException
	 * @model instanceClass="easyflow.custom.exception.CellNotFoundException"
	 * @generated
	 */
	EDataType getCellNotFoundException();

	/**
	 * Returns the meta object for data type '{@link easyflow.custom.exception.TaskNotFoundException <em>Task Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Not Found Exception</em>'.
	 * @see easyflow.custom.exception.TaskNotFoundException
	 * @model instanceClass="easyflow.custom.exception.TaskNotFoundException"
	 * @generated
	 */
	EDataType getTaskNotFoundException();

	/**
	 * Returns the meta object for data type '{@link easyflow.custom.exception.DataPortNotFoundException <em>Data Port Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Port Not Found Exception</em>'.
	 * @see easyflow.custom.exception.DataPortNotFoundException
	 * @model instanceClass="easyflow.custom.exception.DataPortNotFoundException"
	 * @generated
	 */
	EDataType getDataPortNotFoundException();

	/**
	 * Returns the meta object for data type '{@link easyflow.custom.exception.DataLinkNotFoundException <em>Data Link Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Link Not Found Exception</em>'.
	 * @see easyflow.custom.exception.DataLinkNotFoundException
	 * @model instanceClass="easyflow.custom.exception.DataLinkNotFoundException"
	 * @generated
	 */
	EDataType getDataLinkNotFoundException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EasyflowFactory getEasyflowFactory();

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
		 * The meta object literal for the '<em>mx Graph</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mxgraph.view.mxGraph
		 * @see easyflow.impl.EasyflowPackageImpl#getmxGraph()
		 * @generated
		 */
		EDataType MX_GRAPH = eINSTANCE.getmxGraph();

		/**
		 * The meta object literal for the '<em>mx ICell</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mxgraph.model.mxICell
		 * @see easyflow.impl.EasyflowPackageImpl#getmxICell()
		 * @generated
		 */
		EDataType MX_ICELL = eINSTANCE.getmxICell();

		/**
		 * The meta object literal for the '<em>Logger</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.log4j.Logger
		 * @see easyflow.impl.EasyflowPackageImpl#getLogger()
		 * @generated
		 */
		EDataType LOGGER = eINSTANCE.getLogger();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see easyflow.impl.EasyflowPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Jexl Engine</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.commons.jexl2.JexlEngine
		 * @see easyflow.impl.EasyflowPackageImpl#getJexlEngine()
		 * @generated
		 */
		EDataType JEXL_ENGINE = eINSTANCE.getJexlEngine();

		/**
		 * The meta object literal for the '<em>Stack</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Stack
		 * @see easyflow.impl.EasyflowPackageImpl#getStack()
		 * @generated
		 */
		EDataType STACK = eINSTANCE.getStack();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see easyflow.impl.EasyflowPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Easy Flow Graph</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.custom.jgraphx.editor.EasyFlowGraph
		 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowGraph()
		 * @generated
		 */
		EDataType EASY_FLOW_GRAPH = eINSTANCE.getEasyFlowGraph();

		/**
		 * The meta object literal for the '<em>EObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EObject
		 * @see easyflow.impl.EasyflowPackageImpl#getEObject()
		 * @generated
		 */
		EDataType EOBJECT = eINSTANCE.getEObject();

		/**
		 * The meta object literal for the '<em>Document</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Document
		 * @see easyflow.impl.EasyflowPackageImpl#getDocument()
		 * @generated
		 */
		EDataType DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em>Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Element
		 * @see easyflow.impl.EasyflowPackageImpl#getElement()
		 * @generated
		 */
		EDataType ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em>Schema</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.validation.Schema
		 * @see easyflow.impl.EasyflowPackageImpl#getSchema()
		 * @generated
		 */
		EDataType SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em>JSON Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.json.JSONObject
		 * @see easyflow.impl.EasyflowPackageImpl#getJSONObject()
		 * @generated
		 */
		EDataType JSON_OBJECT = eINSTANCE.getJSONObject();

		/**
		 * The meta object literal for the '<em>Buffered Reader</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.BufferedReader
		 * @see easyflow.impl.EasyflowPackageImpl#getBufferedReader()
		 * @generated
		 */
		EDataType BUFFERED_READER = eINSTANCE.getBufferedReader();

		/**
		 * The meta object literal for the '<em>File Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.FileNotFoundException
		 * @see easyflow.impl.EasyflowPackageImpl#getFileNotFoundException()
		 * @generated
		 */
		EDataType FILE_NOT_FOUND_EXCEPTION = eINSTANCE.getFileNotFoundException();

		/**
		 * The meta object literal for the '<em>Grouping Instance Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.custom.exception.GroupingInstanceNotFoundException
		 * @see easyflow.impl.EasyflowPackageImpl#getGroupingInstanceNotFoundException()
		 * @generated
		 */
		EDataType GROUPING_INSTANCE_NOT_FOUND_EXCEPTION = eINSTANCE.getGroupingInstanceNotFoundException();

		/**
		 * The meta object literal for the '<em>Task To Cell Map Key Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.custom.exception.TaskToCellMapKeyNotFoundException
		 * @see easyflow.impl.EasyflowPackageImpl#getTaskToCellMapKeyNotFoundException()
		 * @generated
		 */
		EDataType TASK_TO_CELL_MAP_KEY_NOT_FOUND_EXCEPTION = eINSTANCE.getTaskToCellMapKeyNotFoundException();

		/**
		 * The meta object literal for the '<em>mx ICell Visitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mxgraph.view.mxGraph.mxICellVisitor
		 * @see easyflow.impl.EasyflowPackageImpl#getmxICellVisitor()
		 * @generated
		 */
		EDataType MX_ICELL_VISITOR = eINSTANCE.getmxICellVisitor();

		/**
		 * The meta object literal for the '<em>Pattern</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.regex.Pattern
		 * @see easyflow.impl.EasyflowPackageImpl#getPattern()
		 * @generated
		 */
		EDataType PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em>Cell Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.custom.exception.CellNotFoundException
		 * @see easyflow.impl.EasyflowPackageImpl#getCellNotFoundException()
		 * @generated
		 */
		EDataType CELL_NOT_FOUND_EXCEPTION = eINSTANCE.getCellNotFoundException();

		/**
		 * The meta object literal for the '<em>Task Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.custom.exception.TaskNotFoundException
		 * @see easyflow.impl.EasyflowPackageImpl#getTaskNotFoundException()
		 * @generated
		 */
		EDataType TASK_NOT_FOUND_EXCEPTION = eINSTANCE.getTaskNotFoundException();

		/**
		 * The meta object literal for the '<em>Data Port Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.custom.exception.DataPortNotFoundException
		 * @see easyflow.impl.EasyflowPackageImpl#getDataPortNotFoundException()
		 * @generated
		 */
		EDataType DATA_PORT_NOT_FOUND_EXCEPTION = eINSTANCE.getDataPortNotFoundException();

		/**
		 * The meta object literal for the '<em>Data Link Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.custom.exception.DataLinkNotFoundException
		 * @see easyflow.impl.EasyflowPackageImpl#getDataLinkNotFoundException()
		 * @generated
		 */
		EDataType DATA_LINK_NOT_FOUND_EXCEPTION = eINSTANCE.getDataLinkNotFoundException();

	}

} //EasyflowPackage
