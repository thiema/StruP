/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.data;

import easyflow.core.Condition;
import easyflow.core.PreprocessingTask;

import easyflow.traversal.TraversalChunk;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.data.DataLink#getDataPort <em>Data Port</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getInDataPort <em>In Data Port</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getGroupingStr <em>Grouping Str</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getParentGroupingStr <em>Parent Grouping Str</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getParamStr <em>Param Str</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getParamNameStr <em>Param Name Str</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getParamChunks <em>Param Chunks</em>}</li>
 *   <li>{@link easyflow.data.DataLink#isIdenticalGrouping <em>Identical Grouping</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getCondition <em>Condition</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getIntermediateTasks <em>Intermediate Tasks</em>}</li>
 *   <li>{@link easyflow.data.DataLink#getData <em>Data</em>}</li>
 *   <li>{@link easyflow.data.DataLink#isTerminal <em>Terminal</em>}</li>
 *   <li>{@link easyflow.data.DataLink#isProcessed <em>Processed</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.data.DataPackage#getDataLink()
 * @model
 * @generated
 */
public interface DataLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Port</em>' reference.
	 * @see #setDataPort(DataPort)
	 * @see easyflow.data.DataPackage#getDataLink_DataPort()
	 * @model
	 * @generated
	 */
	DataPort getDataPort();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#getDataPort <em>Data Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Port</em>' reference.
	 * @see #getDataPort()
	 * @generated
	 */
	void setDataPort(DataPort value);

	/**
	 * Returns the value of the '<em><b>In Data Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Data Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Data Port</em>' reference.
	 * @see #setInDataPort(DataPort)
	 * @see easyflow.data.DataPackage#getDataLink_InDataPort()
	 * @model
	 * @generated
	 */
	DataPort getInDataPort();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#getInDataPort <em>In Data Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Data Port</em>' reference.
	 * @see #getInDataPort()
	 * @generated
	 */
	void setInDataPort(DataPort value);

	/**
	 * Returns the value of the '<em><b>Chunks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link easyflow.traversal.TraversalChunk},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunks</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunks</em>' map.
	 * @see easyflow.data.DataPackage#getDataLink_Chunks()
	 * @model mapType="easyflow.util.maps.StringToChunksMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalChunk>"
	 * @generated
	 */
	EMap<String, EList<TraversalChunk>> getChunks();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see easyflow.data.DataPackage#getDataLink_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Grouping Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Str</em>' attribute.
	 * @see #setGroupingStr(String)
	 * @see easyflow.data.DataPackage#getDataLink_GroupingStr()
	 * @model
	 * @generated
	 */
	String getGroupingStr();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#getGroupingStr <em>Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Str</em>' attribute.
	 * @see #getGroupingStr()
	 * @generated
	 */
	void setGroupingStr(String value);

	/**
	 * Returns the value of the '<em><b>Parent Grouping Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Grouping Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Grouping Str</em>' attribute.
	 * @see #setParentGroupingStr(String)
	 * @see easyflow.data.DataPackage#getDataLink_ParentGroupingStr()
	 * @model
	 * @generated
	 */
	String getParentGroupingStr();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#getParentGroupingStr <em>Parent Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Grouping Str</em>' attribute.
	 * @see #getParentGroupingStr()
	 * @generated
	 */
	void setParentGroupingStr(String value);

	/**
	 * Returns the value of the '<em><b>Identical Grouping</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identical Grouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identical Grouping</em>' attribute.
	 * @see #setIdenticalGrouping(boolean)
	 * @see easyflow.data.DataPackage#getDataLink_IdenticalGrouping()
	 * @model default="false"
	 * @generated
	 */
	boolean isIdenticalGrouping();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#isIdenticalGrouping <em>Identical Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identical Grouping</em>' attribute.
	 * @see #isIdenticalGrouping()
	 * @generated
	 */
	void setIdenticalGrouping(boolean value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see easyflow.data.DataPackage#getDataLink_Condition()
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Intermediate Tasks</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.PreprocessingTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Tasks</em>' reference list.
	 * @see easyflow.data.DataPackage#getDataLink_IntermediateTasks()
	 * @model
	 * @generated
	 */
	EList<PreprocessingTask> getIntermediateTasks();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see easyflow.data.DataPackage#getDataLink_Data()
	 * @model
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' attribute.
	 * @see #setTerminal(boolean)
	 * @see easyflow.data.DataPackage#getDataLink_Terminal()
	 * @model default="false"
	 * @generated
	 */
	boolean isTerminal();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#isTerminal <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' attribute.
	 * @see #isTerminal()
	 * @generated
	 */
	void setTerminal(boolean value);

	/**
	 * Returns the value of the '<em><b>Processed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed</em>' attribute.
	 * @see #setProcessed(boolean)
	 * @see easyflow.data.DataPackage#getDataLink_Processed()
	 * @model default="false"
	 * @generated
	 */
	boolean isProcessed();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#isProcessed <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processed</em>' attribute.
	 * @see #isProcessed()
	 * @generated
	 */
	void setProcessed(boolean value);

	/**
	 * Returns the value of the '<em><b>Param Str</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Str</em>' attribute.
	 * @see #setParamStr(String)
	 * @see easyflow.data.DataPackage#getDataLink_ParamStr()
	 * @model default=""
	 * @generated
	 */
	String getParamStr();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#getParamStr <em>Param Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Str</em>' attribute.
	 * @see #getParamStr()
	 * @generated
	 */
	void setParamStr(String value);

	/**
	 * Returns the value of the '<em><b>Param Name Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Name Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Name Str</em>' attribute.
	 * @see #setParamNameStr(String)
	 * @see easyflow.data.DataPackage#getDataLink_ParamNameStr()
	 * @model
	 * @generated
	 */
	String getParamNameStr();

	/**
	 * Sets the value of the '{@link easyflow.data.DataLink#getParamNameStr <em>Param Name Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Name Str</em>' attribute.
	 * @see #getParamNameStr()
	 * @generated
	 */
	void setParamNameStr(String value);

	/**
	 * Returns the value of the '<em><b>Param Chunks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link easyflow.traversal.TraversalChunk},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Chunks</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Chunks</em>' map.
	 * @see easyflow.data.DataPackage#getDataLink_ParamChunks()
	 * @model mapType="easyflow.util.maps.StringToChunksMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalChunk>"
	 * @generated
	 */
	EMap<String, EList<TraversalChunk>> getParamChunks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isUnconditional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	String getUniqueString(String prefix, String suffix, String sep);

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
	 * @model
	 * @generated
	 */
	String getUniqueString(boolean isVerbose);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DataFormat getFormat();

} // DataLink
