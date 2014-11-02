/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.metadata;

import easyflow.traversal.TraversalChunk;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouping Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concrete instance of a group. E.g. sampleA is an instance of the sample
 * grouping.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.metadata.GroupingInstance#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.metadata.GroupingInstance#getFeatures <em>Features</em>}</li>
 *   <li>{@link easyflow.metadata.GroupingInstance#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link easyflow.metadata.GroupingInstance#getGroupingStr <em>Grouping Str</em>}</li>
 *   <li>{@link easyflow.metadata.GroupingInstance#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.metadata.GroupingInstance#getTraversalChunk <em>Traversal Chunk</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.metadata.MetadataPackage#getGroupingInstance()
 * @model
 * @generated
 */
public interface GroupingInstance extends EObject {
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
	 * @see easyflow.metadata.MetadataPackage#getGroupingInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.metadata.GroupingInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.metadata.GroupingFeature},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' map.
	 * @see easyflow.metadata.MetadataPackage#getGroupingInstance_Features()
	 * @model mapType="easyflow.util.maps.StringToGroupingFeatureMap<org.eclipse.emf.ecore.EString, easyflow.metadata.GroupingFeature>"
	 * @generated
	 */
	EMap<String, GroupingFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' reference.
	 * @see #setGrouping(Grouping)
	 * @see easyflow.metadata.MetadataPackage#getGroupingInstance_Grouping()
	 * @model
	 * @generated
	 */
	Grouping getGrouping();

	/**
	 * Sets the value of the '{@link easyflow.metadata.GroupingInstance#getGrouping <em>Grouping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping</em>' reference.
	 * @see #getGrouping()
	 * @generated
	 */
	void setGrouping(Grouping value);

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
	 * @see easyflow.metadata.MetadataPackage#getGroupingInstance_GroupingStr()
	 * @model
	 * @generated
	 */
	String getGroupingStr();

	/**
	 * Sets the value of the '{@link easyflow.metadata.GroupingInstance#getGroupingStr <em>Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Str</em>' attribute.
	 * @see #getGroupingStr()
	 * @generated
	 */
	void setGroupingStr(String value);

	/**
	 * Returns the value of the '<em><b>Records</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' attribute list.
	 * @see easyflow.metadata.MetadataPackage#getGroupingInstance_Records()
	 * @model
	 * @generated
	 */
	EList<String> getRecords();

	/**
	 * Returns the value of the '<em><b>Traversal Chunk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversal Chunk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversal Chunk</em>' reference.
	 * @see #setTraversalChunk(TraversalChunk)
	 * @see easyflow.metadata.MetadataPackage#getGroupingInstance_TraversalChunk()
	 * @model
	 * @generated
	 */
	TraversalChunk getTraversalChunk();

	/**
	 * Sets the value of the '{@link easyflow.metadata.GroupingInstance#getTraversalChunk <em>Traversal Chunk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traversal Chunk</em>' reference.
	 * @see #getTraversalChunk()
	 * @generated
	 */
	void setTraversalChunk(TraversalChunk value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model recordsMany="true"
	 * @generated
	 */
	EList<String> getOverlappingRecords(EList<String> records);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TraversalChunk asTraversalChunk();

} // GroupingInstance
