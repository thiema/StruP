/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultMetaData;
import easyflow.core.Grouping;
import easyflow.core.GroupingCriterion;
import easyflow.core.GroupingInstance;
import easyflow.core.GroupingInstanceList;
import java.util.Collection;
import easyflow.ui.DefaultProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import java.util.Map.Entry;
import org.apache.log4j.Logger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.DefaultMetaDataImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultMetaDataImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultMetaDataImpl#getGroupings <em>Groupings</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultMetaDataImpl#getGroupingInstances <em>Grouping Instances</em>}</li>
 *   <li>{@link easyflow.core.impl.DefaultMetaDataImpl#getGroupingInstancesByGroup <em>Grouping Instances By Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultMetaDataImpl extends EObjectImpl implements DefaultMetaData {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(DefaultMetaData.class);

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
	 * The cached value of the '{@link #getGroupings() <em>Groupings</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupings()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Grouping> groupings;

	/**
	 * The cached value of the '{@link #getGroupingInstances() <em>Grouping Instances</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingInstances()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, GroupingInstanceList> groupingInstances;

	/**
	 * The cached value of the '{@link #getGroupingInstancesByGroup() <em>Grouping Instances By Group</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingInstancesByGroup()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, GroupingInstanceList> groupingInstancesByGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultMetaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DEFAULT_META_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_META_DATA__FILE_NAME, oldFileName, fileName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_META_DATA__LOGGER, oldLogger, logger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, GroupingInstanceList> getGroupingInstances() {
		if (groupingInstances == null) {
			groupingInstances = new EcoreEMap<String,GroupingInstanceList>(CorePackage.Literals.STRING_TO_GROUPING_INSTANCE_LIST_MAP, StringToGroupingInstanceListMapImpl.class, this, CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES);
		}
		return groupingInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, GroupingInstanceList> getGroupingInstancesByGroup() {
		if (groupingInstancesByGroup == null) {
			groupingInstancesByGroup = new EcoreEMap<String,GroupingInstanceList>(CorePackage.Literals.STRING_TO_GROUPING_INSTANCE_LIST_MAP, StringToGroupingInstanceListMapImpl.class, this, CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP);
		}
		return groupingInstancesByGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Grouping> getGroupings() {
		if (groupings == null) {
			groupings = new EcoreEMap<String,Grouping>(CorePackage.Literals.STRING_TO_GROUPING_MAP, StringToGroupingMapImpl.class, this, CorePackage.DEFAULT_META_DATA__GROUPINGS);
		}
		return groupings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, Object> getDefaultRecords() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readMetaData() {

		Map<String, String> aliases = new HashMap<String, String>();
		aliases.put("ID", "Record");
		/*
		 * set rel base path for testing
		 */
		final String basePath="src/easyflow/sequencing/examples/input/";
		
		logger.debug("readMetaData(): "+"trying to read: "+getFileName());
        BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(getFileName()));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sep="\t";
        String strLine;
        Map<String, Integer> colNames=new HashMap<String, Integer>();
        String[] colnames={};
        //expecting first line to be header
        try {
			strLine = bufferedReader.readLine();
			colnames=strLine.split(sep);
			for (int i=0; i<colnames.length; i++) {
				colNames.put(colnames[i], i);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			while ((strLine = bufferedReader.readLine()) != null)   {
				
				if (!strLine.startsWith("#")) {
					String[] lina=strLine.split(sep);
					//logger.debug("Sample: "+lina[colNames.get("Sample")]);
					//logger.debug("Record: "+lina[colNames.get("ID")]);
					//logger.debug("ReadGroup: "+lina[colNames.get("ReadGroup")]);
					//logger.debug("Library: "+lina[colNames.get("Library")]);
					//logger.debug("Group: "+lina[colNames.get("Group")]);

					
			        for (String colName1:colNames.keySet())
			        {
			        	String alias1 = aliases.containsKey(colName1) ? aliases.get(colName1) : colName1;
			        	// fill groupingInsances map
			        	GroupingInstanceList groupingInstanceList = null;
			        	if (getGroupingInstances().containsKey(alias1))
			        	{
			        		logger.debug("readMetaData(): found in groupinginstance list entry with key="+alias1);
			        		groupingInstanceList = getGroupingInstances().get(alias1);
			        	}
			        	else
			        	{
			        		groupingInstanceList = CoreFactory.eINSTANCE.createGroupingInstanceList();
			        		logger.debug("readMetaData(): create new list entry in groupinginstance with key="+alias1);
			        		getGroupingInstances().put(alias1, groupingInstanceList);
			        	}
			        	logger.debug("readMetaData(): process Group="+alias1+" Instance="+lina[colNames.get(colName1)]);
			        	GroupingInstance groupingInstance;
			        	boolean known = false;
			        	for (GroupingInstance groupingInstanceTmp : groupingInstanceList.getInstances())
			        	{
			        		if (groupingInstanceTmp.getName().equals(lina[colNames.get(colName1)]))
			        		{
			        			groupingInstance = groupingInstanceTmp;
			        			known = true;
			        			break;
			        		}
			        			
			        	}
			        	if (!known)
			        	{
			        		groupingInstance = CoreFactory.eINSTANCE.createGroupingInstance();
			        		groupingInstance.setName(lina[colNames.get(colName1)]);
			        		groupingInstanceList.getInstances().add(groupingInstance);
			        	}
			        	
			        	
			        	
			        	// fill groupingInstancesByGroup map
			        	for (String colName2:colNames.keySet())
			        	{
			        		String alias2 = aliases.containsKey(colName2) ? aliases.get(colName2) : colName2;
			        		if (!alias1.equals(alias2))
			        		{
			        			String key = alias1+"_"+alias2+"_"+lina[colNames.get(colName1)];
			        			String value = lina[colNames.get(colName2)];
			        			GroupingInstanceList groupingInstanceListByGroup = null;
			        			if (getGroupingInstancesByGroup().containsKey(key))
			        			{
			        				groupingInstanceListByGroup = getGroupingInstancesByGroup().get(key);
			        				logger.trace(key+" known");
			        			}
			        			else
			        			{
			        				groupingInstanceListByGroup = CoreFactory.eINSTANCE.createGroupingInstanceList();
			        				getGroupingInstancesByGroup().put(key, groupingInstanceListByGroup);
			        				logger.trace("readMetaData(): add key="+key+" grouingInstanceList size="+groupingInstanceListByGroup.getInstances().size());
			        			}
			        			boolean groupingInstanceKnown = false;
			        			for (GroupingInstance processedGI : groupingInstanceListByGroup.getInstances())
			        			{
			        				logger.trace("readMetaData(): check "+processedGI.getName()+" "+value);
			        				if (processedGI.getName().equals(value))
			        				{
			        					groupingInstanceKnown = true;
			        					break;
			        				}
			        			}
			        			if (!groupingInstanceKnown)
			        			{
			        				groupingInstance = CoreFactory.eINSTANCE.createGroupingInstance();
			        				groupingInstance.setName(value);
			        				groupingInstanceListByGroup.getInstances().add(groupingInstance);
			        				logger.trace("readMetaData(): added "+value+" to "+key);
			        				//logger.debug("added: "+colName1+"_"+colName2+"_"+lina[colNames.get(colName1)]+":"+lina[colNames.get(colName2)]);
			        			}
			        			else
			        				logger.trace("readMetaData(): "+value+"already in the list.");			        				

			        		}
			        	}
			        }
					//getGroupingInstancesByGroup().put("s1", groupingInstanceList);
				}
			}
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        EMap<String, GroupingInstanceList> tmp = getGroupingInstancesByGroup();
        for (String groupingInstanceStr : getGroupingInstances().keySet())
        {

        	GroupingInstanceList groupingInstanceList = getGroupingInstances().get(groupingInstanceStr);
        	String instances="";
        	for (GroupingInstance groupingInstance : groupingInstanceList.getInstances())
        		instances+=groupingInstance.getName()+", ";
        	logger.debug(groupingInstanceStr+": "+ instances);
        	
        }
        logger.debug("");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupingCriterion> getInstances(String field, String parentField, String instance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DEFAULT_META_DATA__GROUPINGS:
				return ((InternalEList<?>)getGroupings()).basicRemove(otherEnd, msgs);
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				return ((InternalEList<?>)getGroupingInstances()).basicRemove(otherEnd, msgs);
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP:
				return ((InternalEList<?>)getGroupingInstancesByGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DEFAULT_META_DATA__FILE_NAME:
				return getFileName();
			case CorePackage.DEFAULT_META_DATA__LOGGER:
				return getLogger();
			case CorePackage.DEFAULT_META_DATA__GROUPINGS:
				if (coreType) return getGroupings();
				else return getGroupings().map();
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				if (coreType) return getGroupingInstances();
				else return getGroupingInstances().map();
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP:
				if (coreType) return getGroupingInstancesByGroup();
				else return getGroupingInstancesByGroup().map();
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
			case CorePackage.DEFAULT_META_DATA__FILE_NAME:
				setFileName((String)newValue);
				return;
			case CorePackage.DEFAULT_META_DATA__LOGGER:
				setLogger((Logger)newValue);
				return;
			case CorePackage.DEFAULT_META_DATA__GROUPINGS:
				((EStructuralFeature.Setting)getGroupings()).set(newValue);
				return;
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				((EStructuralFeature.Setting)getGroupingInstances()).set(newValue);
				return;
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP:
				((EStructuralFeature.Setting)getGroupingInstancesByGroup()).set(newValue);
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
			case CorePackage.DEFAULT_META_DATA__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case CorePackage.DEFAULT_META_DATA__LOGGER:
				setLogger(LOGGER_EDEFAULT);
				return;
			case CorePackage.DEFAULT_META_DATA__GROUPINGS:
				getGroupings().clear();
				return;
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				getGroupingInstances().clear();
				return;
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP:
				getGroupingInstancesByGroup().clear();
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
			case CorePackage.DEFAULT_META_DATA__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case CorePackage.DEFAULT_META_DATA__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case CorePackage.DEFAULT_META_DATA__GROUPINGS:
				return groupings != null && !groupings.isEmpty();
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				return groupingInstances != null && !groupingInstances.isEmpty();
			case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP:
				return groupingInstancesByGroup != null && !groupingInstancesByGroup.isEmpty();
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //DefaultMetaDataImpl
