/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.grouping;

import easyflow.core.DefaultRecord;
import easyflow.core.GroupingCriterion;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.Record#getUriList <em>Uri List</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Record#getGroup <em>Group</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Record#getSample <em>Sample</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Record#getLibrary <em>Library</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.Record#getReadGroup <em>Read Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.sequencing.grouping.GroupingPackage#getRecord()
 * @model
 * @generated
 */
public interface Record extends GroupingCriterion, IGroupingCriterion, DefaultRecord {

	/**
	 * Returns the value of the '<em><b>Uri List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri List</em>' attribute.
	 * @see #setUriList(EList)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getRecord_UriList()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<URI> getUriList();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.Record#getUriList <em>Uri List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri List</em>' attribute.
	 * @see #getUriList()
	 * @generated
	 */
	void setUriList(EList<URI> value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getRecord_Group()
	 * @model
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.Record#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Sample</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample</em>' reference.
	 * @see #setSample(Sample)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getRecord_Sample()
	 * @model
	 * @generated
	 */
	Sample getSample();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.Record#getSample <em>Sample</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample</em>' reference.
	 * @see #getSample()
	 * @generated
	 */
	void setSample(Sample value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' reference.
	 * @see #setLibrary(Library)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getRecord_Library()
	 * @model
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.Record#getLibrary <em>Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Read Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Group</em>' reference.
	 * @see #setReadGroup(ReadGroup)
	 * @see easyflow.sequencing.grouping.GroupingPackage#getRecord_ReadGroup()
	 * @model
	 * @generated
	 */
	ReadGroup getReadGroup();

	/**
	 * Sets the value of the '{@link easyflow.sequencing.grouping.Record#getReadGroup <em>Read Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Group</em>' reference.
	 * @see #getReadGroup()
	 * @generated
	 */
	void setReadGroup(ReadGroup value);
} // Record
