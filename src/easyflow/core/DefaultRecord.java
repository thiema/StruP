/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.DefaultRecord#getGenericAttributes <em>Generic Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getDefaultRecord()
 * @model
 * @generated
 */
public interface DefaultRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Generic Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Object},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Attributes</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Attributes</em>' map.
	 * @see easyflow.core.CorePackage#getDefaultRecord_GenericAttributes()
	 * @model mapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>"
	 * @generated
	 */
	EMap<String, Object> getGenericAttributes();

} // DefaultRecord
