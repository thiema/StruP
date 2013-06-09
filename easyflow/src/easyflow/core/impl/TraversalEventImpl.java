/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxCell;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultRecord;
import easyflow.core.GroupingCriterion;
import easyflow.core.Task;
import easyflow.core.TraversalChunk;
import easyflow.core.TraversalCriterion;
import easyflow.core.TraversalEvent;
import easyflow.core.Workflow;

import easyflow.sequencing.MetaData;
import easyflow.sequencing.grouping.Record;

import java.util.Collection;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.InternalEObject;


import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traversal Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.TraversalEventImpl#getMergeTask <em>Merge Task</em>}</li>
 *   <li>{@link easyflow.core.impl.TraversalEventImpl#getSplitTask <em>Split Task</em>}</li>
 *   <li>{@link easyflow.core.impl.TraversalEventImpl#getParentTask <em>Parent Task</em>}</li>
 *   <li>{@link easyflow.core.impl.TraversalEventImpl#getParentCells <em>Parent Cells</em>}</li>
 *   <li>{@link easyflow.core.impl.TraversalEventImpl#getTraversalCriterion <em>Traversal Criterion</em>}</li>
 *   <li>{@link easyflow.core.impl.TraversalEventImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.impl.TraversalEventImpl#getMetaData <em>Meta Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraversalEventImpl extends EObjectImpl implements TraversalEvent {
	/**
	 * The cached value of the '{@link #getMergeTask() <em>Merge Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> mergeTask;

	/**
	 * The cached value of the '{@link #getSplitTask() <em>Split Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitTask()
	 * @generated
	 * @ordered
	 */
	protected Task splitTask;

	/**
	 * The cached value of the '{@link #getParentTask() <em>Parent Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> parentTask;

	/**
	 * The cached value of the '{@link #getParentCells() <em>Parent Cells</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCells()
	 * @generated
	 * @ordered
	 */
	protected EList<mxICell> parentCells;

	/**
	 * The cached value of the '{@link #getTraversalCriterion() <em>Traversal Criterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalCriterion()
	 * @generated
	 * @ordered
	 */
	protected TraversalCriterion traversalCriterion;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Workflow.class);

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger = LOGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaData() <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected static final EObject META_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected EObject metaData = META_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraversalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TRAVERSAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getMergeTask() {
		if (mergeTask == null) {
			mergeTask = new EObjectResolvingEList<Task>(Task.class, this, CorePackage.TRAVERSAL_EVENT__MERGE_TASK);
		}
		return mergeTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getSplitTask() {
		if (splitTask != null && splitTask.eIsProxy()) {
			InternalEObject oldSplitTask = (InternalEObject)splitTask;
			splitTask = (Task)eResolveProxy(oldSplitTask);
			if (splitTask != oldSplitTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TRAVERSAL_EVENT__SPLIT_TASK, oldSplitTask, splitTask));
			}
		}
		return splitTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetSplitTask() {
		return splitTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitTask(Task newSplitTask) {
		Task oldSplitTask = splitTask;
		splitTask = newSplitTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRAVERSAL_EVENT__SPLIT_TASK, oldSplitTask, splitTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getParentTask() {
		if (parentTask == null) {
			parentTask = new EObjectResolvingEList<Task>(Task.class, this, CorePackage.TRAVERSAL_EVENT__PARENT_TASK);
		}
		return parentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalCriterion getTraversalCriterion() {
		if (traversalCriterion != null && traversalCriterion.eIsProxy()) {
			InternalEObject oldTraversalCriterion = (InternalEObject)traversalCriterion;
			traversalCriterion = (TraversalCriterion)eResolveProxy(oldTraversalCriterion);
			if (traversalCriterion != oldTraversalCriterion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TRAVERSAL_EVENT__TRAVERSAL_CRITERION, oldTraversalCriterion, traversalCriterion));
			}
		}
		return traversalCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalCriterion basicGetTraversalCriterion() {
		return traversalCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraversalCriterion(TraversalCriterion newTraversalCriterion) {
		TraversalCriterion oldTraversalCriterion = traversalCriterion;
		traversalCriterion = newTraversalCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRAVERSAL_EVENT__TRAVERSAL_CRITERION, oldTraversalCriterion, traversalCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogger(Logger newLogger) {
		Logger oldLogger = logger;
		logger = newLogger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRAVERSAL_EVENT__LOGGER, oldLogger, logger));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(EObject newMetaData) {
		EObject oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRAVERSAL_EVENT__META_DATA, oldMetaData, metaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<mxICell> getParentCells() {
		if (parentCells == null) {
			parentCells = new EDataTypeUniqueEList<mxICell>(mxICell.class, this, CorePackage.TRAVERSAL_EVENT__PARENT_CELLS);
		}
		return parentCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * handle the grouping criterion
	 * <!-- end-user-doc -->
	 * @generated
	 
	public void readChunks(EReference eReference) {

		//EMap<String, Object> map=(EMap<String, Object>) 
				//getMetaData
				
		//logger.debug(map.keySet()+" "+eReference.getName()+" "+getSplitTask().getUniqueString());
		for (String key:map.keySet()) {
			TraversalChunk traversalChunk=CoreFactory.eINSTANCE.createTraversalChunk();
			traversalChunk.setName(key);
			getTraversalCriterion().getChunks().put(key, traversalChunk);
		}
		logger.debug("init chunks:"+getTraversalCriterion().getChunks().keySet()+" "+getSplitTask().getUniqueString());
	}
	*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readChunks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * set the chunks for all instances of the grouping criterion
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean applyMetadata() {
		
		boolean found = false;
		if (isGrouping()) 
		{
			//if (!found) logger.warn("no traversal criterion found for grouping.");
		}
		else 
		{
		}
		return found;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isGrouping() {
		return (getType().equals("grouping"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isParent(Task parentTask, String traversalChunkName) {

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getType() {
		return getTraversalCriterion().getOperation().getType();
	}

	



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TRAVERSAL_EVENT__MERGE_TASK:
				return getMergeTask();
			case CorePackage.TRAVERSAL_EVENT__SPLIT_TASK:
				if (resolve) return getSplitTask();
				return basicGetSplitTask();
			case CorePackage.TRAVERSAL_EVENT__PARENT_TASK:
				return getParentTask();
			case CorePackage.TRAVERSAL_EVENT__PARENT_CELLS:
				return getParentCells();
			case CorePackage.TRAVERSAL_EVENT__TRAVERSAL_CRITERION:
				if (resolve) return getTraversalCriterion();
				return basicGetTraversalCriterion();
			case CorePackage.TRAVERSAL_EVENT__LOGGER:
				return getLogger();
			case CorePackage.TRAVERSAL_EVENT__META_DATA:
				return getMetaData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.TRAVERSAL_EVENT__MERGE_TASK:
				getMergeTask().clear();
				getMergeTask().addAll((Collection<? extends Task>)newValue);
				return;
			case CorePackage.TRAVERSAL_EVENT__SPLIT_TASK:
				setSplitTask((Task)newValue);
				return;
			case CorePackage.TRAVERSAL_EVENT__PARENT_TASK:
				getParentTask().clear();
				getParentTask().addAll((Collection<? extends Task>)newValue);
				return;
			case CorePackage.TRAVERSAL_EVENT__PARENT_CELLS:
				getParentCells().clear();
				getParentCells().addAll((Collection<? extends mxICell>)newValue);
				return;
			case CorePackage.TRAVERSAL_EVENT__TRAVERSAL_CRITERION:
				setTraversalCriterion((TraversalCriterion)newValue);
				return;
			case CorePackage.TRAVERSAL_EVENT__LOGGER:
				setLogger((Logger)newValue);
				return;
			case CorePackage.TRAVERSAL_EVENT__META_DATA:
				setMetaData((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.TRAVERSAL_EVENT__MERGE_TASK:
				getMergeTask().clear();
				return;
			case CorePackage.TRAVERSAL_EVENT__SPLIT_TASK:
				setSplitTask((Task)null);
				return;
			case CorePackage.TRAVERSAL_EVENT__PARENT_TASK:
				getParentTask().clear();
				return;
			case CorePackage.TRAVERSAL_EVENT__PARENT_CELLS:
				getParentCells().clear();
				return;
			case CorePackage.TRAVERSAL_EVENT__TRAVERSAL_CRITERION:
				setTraversalCriterion((TraversalCriterion)null);
				return;
			case CorePackage.TRAVERSAL_EVENT__LOGGER:
				setLogger(LOGGER_EDEFAULT);
				return;
			case CorePackage.TRAVERSAL_EVENT__META_DATA:
				setMetaData(META_DATA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.TRAVERSAL_EVENT__MERGE_TASK:
				return mergeTask != null && !mergeTask.isEmpty();
			case CorePackage.TRAVERSAL_EVENT__SPLIT_TASK:
				return splitTask != null;
			case CorePackage.TRAVERSAL_EVENT__PARENT_TASK:
				return parentTask != null && !parentTask.isEmpty();
			case CorePackage.TRAVERSAL_EVENT__PARENT_CELLS:
				return parentCells != null && !parentCells.isEmpty();
			case CorePackage.TRAVERSAL_EVENT__TRAVERSAL_CRITERION:
				return traversalCriterion != null;
			case CorePackage.TRAVERSAL_EVENT__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case CorePackage.TRAVERSAL_EVENT__META_DATA:
				return META_DATA_EDEFAULT == null ? metaData != null : !META_DATA_EDEFAULT.equals(metaData);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (parentCells: ");
		result.append(parentCells);
		result.append(", logger: ");
		result.append(logger);
		result.append(", metaData: ");
		result.append(metaData);
		result.append(')');
		return result.toString();
	}

} //TraversalEventImpl
