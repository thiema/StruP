/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.metadata.GroupingInstance;
import easyflow.tool.DataFormat;
import easyflow.tool.Tool;

import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalEvent;

import java.net.URI;

import java.util.Map;

import java.util.regex.Pattern;

import org.apache.commons.jexl2.JexlEngine;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Task respresents a basic data processing unit. It transforms a number of Inputs into Outputs. The Task itself is independent of a concrete Tool that implements the Task and the processing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.Task#getInDataPorts <em>In Data Ports</em>}</li>
 *   <li>{@link easyflow.core.Task#getOutDataPorts <em>Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.Task#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.core.Task#getJexlString <em>Jexl String</em>}</li>
 *   <li>{@link easyflow.core.Task#isUtil <em>Util</em>}</li>
 *   <li>{@link easyflow.core.Task#getJexlEngine <em>Jexl Engine</em>}</li>
 *   <li>{@link easyflow.core.Task#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.Task#getTraversalEvents <em>Traversal Events</em>}</li>
 *   <li>{@link easyflow.core.Task#getParents <em>Parents</em>}</li>
 *   <li>{@link easyflow.core.Task#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.core.Task#getToolNames <em>Tool Names</em>}</li>
 *   <li>{@link easyflow.core.Task#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.core.Task#getToolMatches <em>Tool Matches</em>}</li>
 *   <li>{@link easyflow.core.Task#getPreviousTaskStr <em>Previous Task Str</em>}</li>
 *   <li>{@link easyflow.core.Task#isRoot <em>Root</em>}</li>
 *   <li>{@link easyflow.core.Task#getFlags <em>Flags</em>}</li>
 *   <li>{@link easyflow.core.Task#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.Task#getInputs <em>Inputs</em>}</li>
 *   <li>{@link easyflow.core.Task#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link easyflow.core.Task#getInputDataPortValidator <em>Input Data Port Validator</em>}</li>
 *   <li>{@link easyflow.core.Task#getOutputDataPortValidator <em>Output Data Port Validator</em>}</li>
 *   <li>{@link easyflow.core.Task#getAnalysisTypes <em>Analysis Types</em>}</li>
 *   <li>{@link easyflow.core.Task#getCircumventingParents <em>Circumventing Parents</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>In Data Ports</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Data Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Data Ports</em>' reference list.
	 * @see easyflow.core.CorePackage#getTask_InDataPorts()
	 * @model
	 * @generated
	 */
	EList<DataPort> getInDataPorts();

	/**
	 * Returns the value of the '<em><b>Out Data Ports</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Data Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Data Ports</em>' reference list.
	 * @see easyflow.core.CorePackage#getTask_OutDataPorts()
	 * @model
	 * @generated
	 */
	EList<DataPort> getOutDataPorts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see easyflow.core.CorePackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Jexl String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jexl String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jexl String</em>' attribute.
	 * @see #setJexlString(String)
	 * @see easyflow.core.CorePackage#getTask_JexlString()
	 * @model
	 * @generated
	 */
	String getJexlString();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getJexlString <em>Jexl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jexl String</em>' attribute.
	 * @see #getJexlString()
	 * @generated
	 */
	void setJexlString(String value);

	/**
	 * Returns the value of the '<em><b>Util</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Util</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Util</em>' attribute.
	 * @see #setUtil(boolean)
	 * @see easyflow.core.CorePackage#getTask_Util()
	 * @model default="false"
	 * @generated
	 */
	boolean isUtil();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#isUtil <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Util</em>' attribute.
	 * @see #isUtil()
	 * @generated
	 */
	void setUtil(boolean value);

	/**
	 * Returns the value of the '<em><b>Jexl Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jexl Engine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jexl Engine</em>' attribute.
	 * @see easyflow.core.CorePackage#getTask_JexlEngine()
	 * @model dataType="easyflow.JexlEngine" transient="true" changeable="false"
	 * @generated
	 */
	JexlEngine getJexlEngine();

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see #setLogger(Logger)
	 * @see easyflow.core.CorePackage#getTask_Logger()
	 * @model dataType="easyflow.Logger" transient="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getLogger <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' attribute.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

	/**
	 * Returns the value of the '<em><b>Traversal Events</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.traversal.TraversalEvent},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversal Events</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversal Events</em>' map.
	 * @see easyflow.core.CorePackage#getTask_TraversalEvents()
	 * @model mapType="easyflow.util.maps.StringToTraversalEventMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalEvent>"
	 * @generated
	 */
	EMap<String, TraversalEvent> getTraversalEvents();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.Task},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Parents()
	 * @model mapType="easyflow.util.maps.StringToTaskMap<org.eclipse.emf.ecore.EString, easyflow.core.Task>"
	 * @generated
	 */
	EMap<String, Task> getParents();

	/**
	 * Returns the value of the '<em><b>Chunks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link easyflow.traversal.TraversalChunk},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the tasks chunk (value) which corresponds to its traversal criterion (key). 
	 * Only set after traversal event has been applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chunks</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Chunks()
	 * @model mapType="easyflow.util.maps.StringToChunksMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalChunk>"
	 * @generated
	 */
	EMap<String, EList<TraversalChunk>> getChunks();

	/**
	 * Returns the value of the '<em><b>Tool Names</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Names</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Names</em>' map.
	 * @see easyflow.core.CorePackage#getTask_ToolNames()
	 * @model mapType="easyflow.util.maps.StringToStringListMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, EList<String>> getToolNames();

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.Tool},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection of processing tools.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tools</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Tools()
	 * @model mapType="easyflow.util.maps.StringToToolMap<org.eclipse.emf.ecore.EString, easyflow.tool.Tool>"
	 * @generated
	 */
	EMap<String, Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Tool Matches</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.ToolMatch},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Matches</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Matches</em>' map.
	 * @see easyflow.core.CorePackage#getTask_ToolMatches()
	 * @model mapType="easyflow.util.maps.StringToToolMatchMap<org.eclipse.emf.ecore.EString, easyflow.core.ToolMatch>"
	 * @generated
	 */
	EMap<String, ToolMatch> getToolMatches();

	/**
	 * Returns the value of the '<em><b>Previous Task Str</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Task Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Task Str</em>' attribute.
	 * @see #setPreviousTaskStr(String)
	 * @see easyflow.core.CorePackage#getTask_PreviousTaskStr()
	 * @model default=""
	 * @generated
	 */
	String getPreviousTaskStr();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getPreviousTaskStr <em>Previous Task Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Task Str</em>' attribute.
	 * @see #getPreviousTaskStr()
	 * @generated
	 */
	void setPreviousTaskStr(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(boolean)
	 * @see easyflow.core.CorePackage#getTask_Root()
	 * @model
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(int)
	 * @see easyflow.core.CorePackage#getTask_Flags()
	 * @model default="0"
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

	/**
	 * Returns the value of the '<em><b>Grouping Criteria</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Criteria</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Criteria</em>' map.
	 * @see easyflow.core.CorePackage#getTask_GroupingCriteria()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getGroupingCriteria();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.net.URI},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Inputs()
	 * @model mapType="easyflow.util.maps.StringToURIMap<org.eclipse.emf.ecore.EString, easyflow.URI>"
	 * @generated
	 */
	EMap<String, URI> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.net.URI},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Outputs()
	 * @model mapType="easyflow.util.maps.StringToURIMap<org.eclipse.emf.ecore.EString, easyflow.URI>"
	 * @generated
	 */
	EMap<String, URI> getOutputs();

	/**
	 * Returns the value of the '<em><b>Input Data Port Validator</b></em>' attribute list.
	 * The list contents are of type {@link java.util.regex.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data Port Validator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data Port Validator</em>' attribute list.
	 * @see easyflow.core.CorePackage#getTask_InputDataPortValidator()
	 * @model dataType="easyflow.Pattern"
	 * @generated
	 */
	EList<Pattern> getInputDataPortValidator();

	/**
	 * Returns the value of the '<em><b>Output Data Port Validator</b></em>' attribute list.
	 * The list contents are of type {@link java.util.regex.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data Port Validator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data Port Validator</em>' attribute list.
	 * @see easyflow.core.CorePackage#getTask_OutputDataPortValidator()
	 * @model dataType="easyflow.Pattern"
	 * @generated
	 */
	EList<Pattern> getOutputDataPortValidator();

	/**
	 * Returns the value of the '<em><b>Analysis Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Types</em>' attribute list.
	 * @see easyflow.core.CorePackage#getTask_AnalysisTypes()
	 * @model
	 * @generated
	 */
	EList<String> getAnalysisTypes();

	/**
	 * Returns the value of the '<em><b>Circumventing Parents</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circumventing Parents</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circumventing Parents</em>' attribute list.
	 * @see easyflow.core.CorePackage#getTask_CircumventingParents()
	 * @model
	 * @generated
	 */
	EList<String> getCircumventingParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model defaultGroupingCriteriaMany="true"
	 * @generated
	 */
	void readTask(String taskString, String defaultMode, EList<String> defaultGroupingCriteria);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model groupingInstancesMany="true"
	 * @generated
	 */
	boolean shallProcess(EList<GroupingInstance> groupingInstances, String forGrouping);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model groupingInstancesMany="true" jexlStringsMany="true"
	 * @generated
	 */
	boolean shallProcess(EList<GroupingInstance> groupingInstances, String forGrouping, EList<String> jexlStrings, boolean isInverse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.Object" metaDataMapMapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>"
	 * @generated
	 */
	Object evaluateJexl(EMap<String, Object> metaDataMap, String jexlString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>" groupingInstancesMany="true"
	 * @generated
	 */
	EMap<String, Object> createMetaDataMapForJexl(EList<GroupingInstance> groupingInstances, String forGrouping);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model many="false" patternDataType="easyflow.Pattern" patternMany="true"
	 * @generated
	 */
	EList<DataFormat> parseDataFormatField(String dataFormatString, EList<Pattern> pattern);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getUniqueString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatibleWithOutDataPortFor(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatibleWithInDataPortFor(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Task getParentTaskByOutDataPort(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.StringToChunksMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalChunk>"
	 * @generated
	 */
	EMap<String, EList<TraversalChunk>> getNonOveralppingTraversalChunksFor(Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model toolsMany="true"
	 * @generated
	 */
	void readTools(EList<Tool> tools);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Tool getPreferredTool();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataPorts1Many="true" dataPorts2Many="true"
	 * @generated
	 */
	EList<DataPort> getOverlappingDataPorts(EList<DataPort> dataPorts1, EList<DataPort> dataPorts2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fill inputs and outputs with its concrete sources/targets (e.g. file names).
	 * Resolve the executables (i.e. interpreter and/or executable (script) name).
	 * Depending on configuration the whole path is used or only the 'dirname'. In 
	 * the latter case resolving of path is done by execution system. (Which could 
	 * also mean, that the name can be resolved e.g. using PATH environment variable)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean resolveToolDependencies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> createCommandLineMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTool(Tool tool);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTools();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataPort getDataPortByDataPort(DataPort testDataPort, boolean isOutDataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataPort getDataPortByNameOfFormat(String name, boolean isOutDataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataPort getDataPortByName(String dataPortName, boolean isOutDataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.TaskToDataPortsMap<easyflow.core.Task, easyflow.core.DataPort>" tasksMany="true"
	 * @generated
	 */
	EMap<Task, EList<DataPort>> resolveMissingDataPortsByTool(EList<Task> tasks);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<TraversalChunk> getOverlappingChunksFor(Task parentTask, String groupingStr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ToolNotFoundException"
	 * @generated
	 */
	EList<String> getRequiredGroupingsFor(Tool tool, DataPort dataPort, boolean required) throws ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ToolNotFoundException"
	 * @generated
	 */
	EList<String> getProvidedGroupingsFor(Tool tool, DataPort dataPort, boolean required) throws ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canFilterInstancesFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasMultipleInputsFor(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasMultipleInstancesFor(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasMultipleGroupingsFor(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canProcessMultipleInputsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canProcessMultipleInstancesFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canProcessMultipleGroupingsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

} // Task
