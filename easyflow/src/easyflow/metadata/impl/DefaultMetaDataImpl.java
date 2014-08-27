/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.metadata.impl;

import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.Grouping;
import easyflow.metadata.GroupingInstance;
import easyflow.metadata.GroupingInstanceList;
import easyflow.metadata.MetadataFactory;
import easyflow.metadata.MetadataPackage;
import easyflow.traversal.TraversalChunk;
import easyflow.util.maps.MapsPackage;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVarMetaData;
import easyflow.util.maps.impl.StringToGroupingInstanceListMapImpl;
import easyflow.util.maps.impl.StringToGroupingMapImpl;
import easyflow.util.maps.impl.StringToStringMapImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.metadata.impl.DefaultMetaDataImpl#getReader <em>Reader</em>}</li>
 *   <li>{@link easyflow.metadata.impl.DefaultMetaDataImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.metadata.impl.DefaultMetaDataImpl#getGroupings <em>Groupings</em>}</li>
 *   <li>{@link easyflow.metadata.impl.DefaultMetaDataImpl#getGroupingInstances <em>Grouping Instances</em>}</li>
 *   <li>{@link easyflow.metadata.impl.DefaultMetaDataImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link easyflow.metadata.impl.DefaultMetaDataImpl#getGroupingProps <em>Grouping Props</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultMetaDataImpl extends EObjectImpl implements DefaultMetaData {
	/**
	 * The default value of the '{@link #getReader() <em>Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected static final BufferedReader READER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReader() <em>Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected BufferedReader reader = READER_EDEFAULT;

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
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> aliases;

	/**
	 * The cached value of the '{@link #getGroupingProps() <em>Grouping Props</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingProps()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> groupingProps;

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
		return MetadataPackage.Literals.DEFAULT_META_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedReader getReader() {
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReader(BufferedReader newReader) {
		BufferedReader oldReader = reader;
		reader = newReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.DEFAULT_META_DATA__READER, oldReader, reader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.DEFAULT_META_DATA__LOGGER, oldLogger, logger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, GroupingInstanceList> getGroupingInstances() {
		if (groupingInstances == null) {
			groupingInstances = new EcoreEMap<String,GroupingInstanceList>(MapsPackage.Literals.STRING_TO_GROUPING_INSTANCE_LIST_MAP, StringToGroupingInstanceListMapImpl.class, this, MetadataPackage.DEFAULT_META_DATA__GROUPING_INSTANCES);
		}
		return groupingInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getAliases() {
		if (aliases == null) {
			aliases = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, MetadataPackage.DEFAULT_META_DATA__ALIASES);
		}
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getGroupingProps() {
		if (groupingProps == null) {
			groupingProps = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, MetadataPackage.DEFAULT_META_DATA__GROUPING_PROPS);
		}
		return groupingProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Grouping> getGroupings() {
		if (groupings == null) {
			groupings = new EcoreEMap<String,Grouping>(MapsPackage.Literals.STRING_TO_GROUPING_MAP, StringToGroupingMapImpl.class, this, MetadataPackage.DEFAULT_META_DATA__GROUPINGS);
		}
		return groupings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void initMetaData() {
		BufferedReader bufferedReader = getReader();
		String sep="\t";
        String strLine;
        Map<String, Integer> colNames=new HashMap<String, Integer>();
		int rows=0;
    	
    	List<String> rowHeader=new ArrayList<String>();
    	boolean firstLine=true;
    	try {
			while ((strLine = bufferedReader.readLine()) != null)   {
				if ( strLine.trim().length() == 0 )
				    continue;  // Skip blank lines
				// expect first line to row colheader
				String lina[]=strLine.split(sep);
				if (!strLine.startsWith("#") && !strLine.equals("")) {
					
					if (firstLine)
					{
						//bufferedReader.mark(0);
						GlobalVarMetaData.createNewMetaDataColHeader(Arrays.copyOfRange(lina, 1, lina.length));
						firstLine=false;
					}
					else
					{
						rows++;
						rowHeader.add(lina[0]);
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String rowHead[]=new String[rowHeader.size()];
    	GlobalVarMetaData.createNewMetaDataRowHeader(rowHeader.toArray(rowHead));
    	GlobalVarMetaData.createNewMetaDataTable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readMetaData() {

		//Map<String, String> aliases = new HashMap<String, String>();
		getAliases().put("ID", "Record");
		
        //Reader reader = new InputStreamReader(getClass().getResourceAsStream(getFileName()));
        BufferedReader bufferedReader = getReader();
        String sep="\t";
        Map<String, Integer> colNames=new HashMap<String, Integer>();
        String[] colnames={};
        
        //doesnt work due to index shift (starts without first element)
        //colnames = GlobalVarMetaData.getColHeader();
        //colNames = GlobalVarMetaData.getMetaDataColHeader();
        //logger.debug(colNames);
        //logger.debug(colnames);
        try {
        	String strLine = bufferedReader.readLine();
        	//expecting first line to be header and to be read already...
        	
        	
        	
        	colnames=strLine.split(sep);
			for (int i=0; i<colnames.length; i++) {
				String colName = colnames[i]; 
        		String tmp[]=colName.split(":");
        		if (tmp.length>1)
        		{
        			getGroupingProps().put(tmp[0], tmp[1]);
        			colName=tmp[0];
        		}

				colNames.put(colName, i);
			}

			//read the remainder
			int row=0;
			while ((strLine = bufferedReader.readLine()) != null)   {
				if ( strLine.trim().length() == 0 )
				    continue;  // Skip blank lines
				else
				if (!strLine.startsWith("#")) {
					String[] lina=strLine.split(sep);
					//logger.debug("Sample: "+lina[colNames.get("Sample")]);
					//logger.debug("Record: "+lina[colNames.get("ID")]);
					//logger.debug("ReadGroup: "+lina[colNames.get("ReadGroup")]);
					//logger.debug("Library: "+lina[colNames.get("Library")]);
					//logger.debug("Group: "+lina[colNames.get("Group")]);
					boolean metadataRowInserted = false;
			        for (String colName1:colNames.keySet())
			        {
			        	if (lina.length>colNames.get(colName1))
			        	{
			        	String alias1 = getAliases().containsKey(colName1) ? getAliases().get(colName1) : colName1;
			        	// fill groupingInsances map
			        	GroupingInstanceList groupingInstanceList = null;
			        	if (getGroupingInstances().containsKey(alias1))
			        	{
			        		logger.debug("readMetaData(): found in groupinginstance list entry with key="+alias1);
			        		groupingInstanceList = getGroupingInstances().get(alias1);
			        	}
			        	else
			        	{
			        		groupingInstanceList = MetadataFactory.eINSTANCE.createGroupingInstanceList();
			        		logger.debug("readMetaData(): create new list entry in groupinginstance with key="+alias1);
			        		getGroupingInstances().put(alias1, groupingInstanceList);
			        	}
			        	logger.debug("readMetaData(): process Group="+alias1+" Instance="+lina[colNames.get(colName1)]);
			        	GroupingInstance groupingInstance = null;
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
			        		String names[] = lina[colNames.get(colName1)].split(",");
			        		for (String name:names)
			        		{
			        			groupingInstance = MetadataFactory.eINSTANCE.createGroupingInstance();
			        			groupingInstance.setName(name);
			        			groupingInstance.setGroupingStr(alias1);
			        			groupingInstance.getRecords().add(lina[0]);
			        			groupingInstanceList.getInstances().add(groupingInstance);
			        		}
			        	}
			        	else
			        	{
			        		//make some validation
			        		//if ()
			        		if (!groupingInstance.getRecords().contains(lina[0]))
			        			groupingInstance.getRecords().add(lina[0]);
			        	}
			        	
			        	if (!metadataRowInserted)
			        	{
			        		GlobalVarMetaData.setMetaDataTableRow(lina);
			        		metadataRowInserted = true;
			        	}
			        }
			        }

				}
			}
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        for (String groupingInstanceStr : getGroupingInstances().keySet())
        {

        	GroupingInstanceList groupingInstanceList = getGroupingInstances().get(groupingInstanceStr);
        	String instances="";
        	for (GroupingInstance groupingInstance : groupingInstanceList.getInstances())
        		instances+=groupingInstance.getName()+" ("+groupingInstance.getRecords()+"), ";
        	logger.debug(groupingInstanceStr+": "+ instances);
        	
        }
        logger.debug("");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<GroupingInstance> getInstances(GroupingInstance groupingInstance, String resolvedAs) {
		return getInstances(groupingInstance.getGroupingStr(), resolvedAs, groupingInstance.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<GroupingInstance> getInstances(String groupingStr1, String groupingStr2, String instanceStr) {

		logger.debug("getInstances(groupingStr1="+groupingStr1+", groupingStr1="+groupingStr2+", instanceStr="+instanceStr+")");
		EList<String> records=getRecordsBy(groupingStr1, instanceStr);
		logger.debug("getInstances(): found "+records.size()+" recs.");
		EList<GroupingInstance> groupingInstances = getInstancesForRecords(groupingStr2, records);
		return groupingInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<GroupingInstance> getInstancesForRecords(String group, EList<String> records)
	{
		EList<GroupingInstance> groupingInstances = new BasicEList<GroupingInstance>();
		if (containsColumn(group))
		for (GroupingInstance groupingInstance:getGroupingInstances().get(group).getInstances())
		{
			EList<String> recs=groupingInstance.getOverlappingRecords(records);
			if (!recs.isEmpty())
				if (!groupingInstances.contains(groupingInstance))
					groupingInstances.add(groupingInstance);

		}
		return groupingInstances;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void getValueForGroupingInstance(GroupingInstance groupingInstance, String field) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getRecordsBy(String groupingStr, String instanceStr) {
		EList<String> records = new BasicEList<String>();
		if (groupingStr == null)
		{
			logger.error("getRecordsBy(): no groupingStr defined. return no records.");
			//return records;
		}
		if (GlobalConstants.TRAVERSAL_CRITERION_RECORD.equals(groupingStr))
		{
			if(!GlobalVarMetaData.getMetaDataTableRow(instanceStr).isEmpty())
				records.add(instanceStr);
		}
		else if (GlobalConstants.METADATA_INPUT.equals(groupingStr))
		{
			String res = GlobalVarMetaData.getRecordForMultiFieldValue(groupingStr, instanceStr);
			if (res != null)
				records.add(res);
				
		}
			
		if (records.isEmpty() && !GlobalConstants.TRAVERSAL_CRITERION_RECORD.equals(groupingStr))
		{
			for (String rowHead:GlobalVarMetaData.getMetaDataRowHeader().keySet())
			{
				Map<String, String> map=GlobalVarMetaData.getMetaDataTableRow(rowHead);
				if (map.get(groupingStr).equals(instanceStr))
					records.add(rowHead);
			}
		}
		return records;
	}

	public EMap<String, String> getRow(String key)
	{
		return new BasicEMap<String, String>(GlobalVarMetaData.getMetaDataTableRow(key));
	}
	
	public EMap<String, String> getColumn(String key)
	{
		return new BasicEMap<String, String>(GlobalVarMetaData.getMetaDataTableColumn(key));
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean containsColumn(String column) {
		//logger.trace(getAliases()+" "+column+" "+getAliases().containsValue(column)+" "+GlobalVarMetaData.getMetaDataColHeader().keySet());
		// special case for record
		if (column.equals(GlobalConstants.TRAVERSAL_CRITERION_RECORD))
			return true;
		
		// check the aliases
		if (getAliases().containsValue(column))
			for (String alias : getAliases().keySet())
			{
				//logger.trace(getAliases().get(alias)+" vs "+column);
				if (getAliases().get(alias).equals(column))
					return GlobalVarMetaData.getMetaDataColHeader().containsKey(alias);
			}
		// otherwise check the "pure" column header
		return GlobalVarMetaData.getMetaDataColHeader().containsKey(column);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean containsRow(String row) {
		return GlobalVarMetaData.getMetaDataRowHeader().containsKey(row);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<String, Object> getRecord(GroupingInstance recordInstance) {
		Map<String, String> map=GlobalVarMetaData.getMetaDataTableRow(recordInstance.getName());
		EMap<String, Object> emap=new BasicEMap<String, Object>();
		//logger.debug(map.values());
		for (Entry<String, String> e:map.entrySet())
		{
			if (e.getValue()!=null)
				emap.put(e.getKey(), parseString(e.getKey(), e.getValue()));
		}
		emap.put("Record", recordInstance.getName());
		return emap;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<String, Object> getRecord(TraversalChunk record) {
		Map<String, String> map=GlobalVarMetaData.getMetaDataTableRow(record.getName());
		EMap<String, Object> emap=new BasicEMap<String, Object>();
		//logger.debug(map.values());
		for (Entry<String, String> e:map.entrySet())
		{
			if (e.getValue()!=null)
				emap.put(e.getKey(), parseString(e.getKey(), e.getValue()));
		}
		emap.put("Record", record.getName());
		return emap;
	}
	

	private Object parseString(String field, String value)
	{
		Object o=value;
		
		String[] a = StringUtils.split(value, ",");
		boolean isArray=false;
		if (GlobalVarMetaData.getMetaDataColType().containsKey(field))
		{
			if(value.startsWith("[") && value.endsWith("]"))
			{
				a[0]=a[0].subSequence(1, a[0].length()-1).toString();
				a[a.length-1]=a[a.length-1].subSequence(0, a[0].length()-2).toString();
				isArray=true;
			}
			else if (GlobalVarMetaData.getMetaDataColType().get(field).equals("List")
				|| GlobalVarMetaData.getMetaDataColType().get(field).equals("Array"))
			{
				isArray=true;
			}
		}
		//convert into list object
		if (a.length>1 || isArray)
			o=a;
		return o;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.DEFAULT_META_DATA__GROUPINGS:
				return ((InternalEList<?>)getGroupings()).basicRemove(otherEnd, msgs);
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				return ((InternalEList<?>)getGroupingInstances()).basicRemove(otherEnd, msgs);
			case MetadataPackage.DEFAULT_META_DATA__ALIASES:
				return ((InternalEList<?>)getAliases()).basicRemove(otherEnd, msgs);
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_PROPS:
				return ((InternalEList<?>)getGroupingProps()).basicRemove(otherEnd, msgs);
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
			case MetadataPackage.DEFAULT_META_DATA__READER:
				return getReader();
			case MetadataPackage.DEFAULT_META_DATA__LOGGER:
				return getLogger();
			case MetadataPackage.DEFAULT_META_DATA__GROUPINGS:
				if (coreType) return getGroupings();
				else return getGroupings().map();
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				if (coreType) return getGroupingInstances();
				else return getGroupingInstances().map();
			case MetadataPackage.DEFAULT_META_DATA__ALIASES:
				if (coreType) return getAliases();
				else return getAliases().map();
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_PROPS:
				if (coreType) return getGroupingProps();
				else return getGroupingProps().map();
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
			case MetadataPackage.DEFAULT_META_DATA__READER:
				setReader((BufferedReader)newValue);
				return;
			case MetadataPackage.DEFAULT_META_DATA__LOGGER:
				setLogger((Logger)newValue);
				return;
			case MetadataPackage.DEFAULT_META_DATA__GROUPINGS:
				((EStructuralFeature.Setting)getGroupings()).set(newValue);
				return;
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				((EStructuralFeature.Setting)getGroupingInstances()).set(newValue);
				return;
			case MetadataPackage.DEFAULT_META_DATA__ALIASES:
				((EStructuralFeature.Setting)getAliases()).set(newValue);
				return;
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_PROPS:
				((EStructuralFeature.Setting)getGroupingProps()).set(newValue);
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
			case MetadataPackage.DEFAULT_META_DATA__READER:
				setReader(READER_EDEFAULT);
				return;
			case MetadataPackage.DEFAULT_META_DATA__LOGGER:
				setLogger(LOGGER_EDEFAULT);
				return;
			case MetadataPackage.DEFAULT_META_DATA__GROUPINGS:
				getGroupings().clear();
				return;
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				getGroupingInstances().clear();
				return;
			case MetadataPackage.DEFAULT_META_DATA__ALIASES:
				getAliases().clear();
				return;
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_PROPS:
				getGroupingProps().clear();
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
			case MetadataPackage.DEFAULT_META_DATA__READER:
				return READER_EDEFAULT == null ? reader != null : !READER_EDEFAULT.equals(reader);
			case MetadataPackage.DEFAULT_META_DATA__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case MetadataPackage.DEFAULT_META_DATA__GROUPINGS:
				return groupings != null && !groupings.isEmpty();
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_INSTANCES:
				return groupingInstances != null && !groupingInstances.isEmpty();
			case MetadataPackage.DEFAULT_META_DATA__ALIASES:
				return aliases != null && !aliases.isEmpty();
			case MetadataPackage.DEFAULT_META_DATA__GROUPING_PROPS:
				return groupingProps != null && !groupingProps.isEmpty();
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
		result.append(" (reader: ");
		result.append(reader);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //DefaultMetaDataImpl
