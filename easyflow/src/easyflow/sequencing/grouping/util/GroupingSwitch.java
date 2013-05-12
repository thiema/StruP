/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.grouping.util;

import easyflow.core.DefaultRecord;
import easyflow.core.GroupingCriterion;
import easyflow.sequencing.grouping.*;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see easyflow.sequencing.grouping.GroupingPackage
 * @generated
 */
public class GroupingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GroupingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingSwitch() {
		if (modelPackage == null) {
			modelPackage = GroupingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GroupingPackage.SAMPLE: {
				Sample sample = (Sample)theEObject;
				T result = caseSample(sample);
				if (result == null) result = caseGroupingCriterion(sample);
				if (result == null) result = caseIGroupingCriterion(sample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.READ_GROUP: {
				ReadGroup readGroup = (ReadGroup)theEObject;
				T result = caseReadGroup(readGroup);
				if (result == null) result = caseGroupingCriterion(readGroup);
				if (result == null) result = caseIGroupingCriterion(readGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseGroupingCriterion(library);
				if (result == null) result = caseIGroupingCriterion(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseGroupingCriterion(group);
				if (result == null) result = caseIGroupingCriterion(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.RECORD: {
				Record record = (Record)theEObject;
				T result = caseRecord(record);
				if (result == null) result = caseGroupingCriterion(record);
				if (result == null) result = caseIGroupingCriterion(record);
				if (result == null) result = caseDefaultRecord(record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.IGROUPING_CRITERION: {
				IGroupingCriterion iGroupingCriterion = (IGroupingCriterion)theEObject;
				T result = caseIGroupingCriterion(iGroupingCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.STRING_TO_SAMPLE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Sample> stringToSampleMap = (Map.Entry<String, Sample>)theEObject;
				T result = caseStringToSampleMap(stringToSampleMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.STRING_TO_READ_GROUP_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, ReadGroup> stringToReadGroupMap = (Map.Entry<String, ReadGroup>)theEObject;
				T result = caseStringToReadGroupMap(stringToReadGroupMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.STRING_TO_LIBRARY_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Library> stringToLibraryMap = (Map.Entry<String, Library>)theEObject;
				T result = caseStringToLibraryMap(stringToLibraryMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.STRING_TO_GROUP_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Group> stringToGroupMap = (Map.Entry<String, Group>)theEObject;
				T result = caseStringToGroupMap(stringToGroupMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroupingPackage.STRING_TO_RECORD_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Record> stringToRecordMap = (Map.Entry<String, Record>)theEObject;
				T result = caseStringToRecordMap(stringToRecordMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSample(Sample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadGroup(ReadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecord(Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGrouping Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGrouping Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGroupingCriterion(IGroupingCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Sample Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Sample Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToSampleMap(Map.Entry<String, Sample> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Read Group Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Read Group Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToReadGroupMap(Map.Entry<String, ReadGroup> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Library Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Library Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToLibraryMap(Map.Entry<String, Library> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Group Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Group Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToGroupMap(Map.Entry<String, Group> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Record Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Record Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToRecordMap(Map.Entry<String, Record> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grouping Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouping Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupingCriterion(GroupingCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultRecord(DefaultRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GroupingSwitch
