/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.impl;

import easyflow.core.CorePackage;
import easyflow.core.DefaultMetaData;
import easyflow.core.Grouping;
import easyflow.core.GroupingCriterion;
import easyflow.core.GroupingInstanceList;
import easyflow.core.impl.StringToGroupingInstanceListMapImpl;
import easyflow.core.impl.StringToGroupingMapImpl;
import easyflow.core.GroupingInstance;
import easyflow.core.Workflow;

import easyflow.sequencing.MetaData;
import easyflow.sequencing.SequencingPackage;

import easyflow.sequencing.grouping.Group;
import easyflow.sequencing.grouping.GroupingFactory;
import easyflow.sequencing.grouping.GroupingPackage;
import easyflow.sequencing.grouping.Library;
import easyflow.sequencing.grouping.ReadGroup;
import easyflow.sequencing.grouping.Record;
import easyflow.sequencing.grouping.Sample;

import easyflow.sequencing.grouping.impl.StringToGroupMapImpl;
import easyflow.sequencing.grouping.impl.StringToLibraryMapImpl;
import easyflow.sequencing.grouping.impl.StringToReadGroupMapImpl;
import easyflow.sequencing.grouping.impl.StringToRecordMapImpl;
import easyflow.sequencing.grouping.impl.StringToSampleMapImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import java.util.Map.Entry;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getGroupingInstances <em>Grouping Instances</em>}</li>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getGroupingInstancesByGroup <em>Grouping Instances By Group</em>}</li>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getGroupings <em>Groupings</em>}</li>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getReadGroups <em>Read Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link easyflow.sequencing.impl.MetaDataImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaDataImpl extends EObjectImpl implements MetaData {
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
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(MetaData.class);

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
	 * The cached value of the '{@link #getGroupings() <em>Groupings</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupings()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Grouping> groupings;

	/**
	 * The cached value of the '{@link #getSamples() <em>Samples</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamples()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Sample> samples;

	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Record> records;

	/**
	 * The cached value of the '{@link #getReadGroups() <em>Read Groups</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadGroups()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ReadGroup> readGroups;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Library> libraries;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Group> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencingPackage.Literals.META_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SequencingPackage.META_DATA__FILE_NAME, oldFileName, fileName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SequencingPackage.META_DATA__LOGGER, oldLogger, logger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, GroupingInstanceList> getGroupingInstances() {
		if (groupingInstances == null) {
			groupingInstances = new EcoreEMap<String,GroupingInstanceList>(CorePackage.Literals.STRING_TO_GROUPING_INSTANCE_LIST_MAP, StringToGroupingInstanceListMapImpl.class, this, SequencingPackage.META_DATA__GROUPING_INSTANCES);
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
			groupingInstancesByGroup = new EcoreEMap<String,GroupingInstanceList>(CorePackage.Literals.STRING_TO_GROUPING_INSTANCE_LIST_MAP, StringToGroupingInstanceListMapImpl.class, this, SequencingPackage.META_DATA__GROUPING_INSTANCES_BY_GROUP);
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
			groupings = new EcoreEMap<String,Grouping>(CorePackage.Literals.STRING_TO_GROUPING_MAP, StringToGroupingMapImpl.class, this, SequencingPackage.META_DATA__GROUPINGS);
		}
		return groupings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Sample> getSamples() {
		if (samples == null) {
			samples = new EcoreEMap<String,Sample>(GroupingPackage.Literals.STRING_TO_SAMPLE_MAP, StringToSampleMapImpl.class, this, SequencingPackage.META_DATA__SAMPLES);
		}
		return samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Record> getRecords() {
		if (records == null) {
			records = new EcoreEMap<String,Record>(GroupingPackage.Literals.STRING_TO_RECORD_MAP, StringToRecordMapImpl.class, this, SequencingPackage.META_DATA__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, ReadGroup> getReadGroups() {
		if (readGroups == null) {
			readGroups = new EcoreEMap<String,ReadGroup>(GroupingPackage.Literals.STRING_TO_READ_GROUP_MAP, StringToReadGroupMapImpl.class, this, SequencingPackage.META_DATA__READ_GROUPS);
		}
		return readGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Library> getLibraries() {
		if (libraries == null) {
			libraries = new EcoreEMap<String,Library>(GroupingPackage.Literals.STRING_TO_LIBRARY_MAP, StringToLibraryMapImpl.class, this, SequencingPackage.META_DATA__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Group> getGroups() {
		if (groups == null) {
			groups = new EcoreEMap<String,Group>(GroupingPackage.Literals.STRING_TO_GROUP_MAP, StringToGroupMapImpl.class, this, SequencingPackage.META_DATA__GROUPS);
		}
		return groups;
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

		/*
		 * set rel base path for testing
		 */
		final String basePath="src/easyflow/sequencing/examples/input/";
		
		logger.debug(this+" "+"trying to read: "+getFileName());
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
					logger.debug("Sample: "+lina[colNames.get("Sample")]);
					logger.debug("Record: "+lina[colNames.get("ID")]);
					logger.debug("ReadGroup: "+lina[colNames.get("ReadGroup")]);
					logger.debug("Library: "+lina[colNames.get("Library")]);
					logger.debug("Group: "+lina[colNames.get("Group")]);
					
					
            		Record curRecord=GroupingFactory.eINSTANCE.createRecord();
            		curRecord.setId(lina[colNames.get("ID")]);
            		curRecord.setUriList(new BasicEList<URI>());
            		if (colNames.containsKey("InputFiles")) {
	            		String[] uris=lina[colNames.get("InputFiles")].split(",");
	            		for (int j=0; j<uris.length; j++) {
	            			//logger.debug(uris[j]+" "+new File(basePath+uris[j]).getAbsolutePath()+" "+URI.createURI(new File(basePath+uris[j]).getAbsolutePath()));
	            			//logger.debug(curRecord.getUriList());
	            			curRecord.getUriList().add(URI.createURI(new File(basePath+uris[j]).getAbsolutePath()));
	            		}
            		}
            		Group curGroup=GroupingFactory.eINSTANCE.createGroup();
            		curGroup.setId(lina[colNames.get("Group")]);
            		Sample curSample=GroupingFactory.eINSTANCE.createSample();
            		curSample.setId(lina[colNames.get("Sample")]);
            		ReadGroup curReadGroup=GroupingFactory.eINSTANCE.createReadGroup();
            		curReadGroup.setId(lina[colNames.get("ReadGroup")]);
            		Library curLibrary=GroupingFactory.eINSTANCE.createLibrary();
            		curLibrary.setId(lina[colNames.get("Library")]);
            		
            		if (!getGroups().containsKey(lina[colNames.get("Group")])) getGroups().put(lina[colNames.get("Group")], curGroup);
            		else curGroup=getGroups().get(lina[colNames.get("Group")]);
            		if (!getSamples().containsKey(lina[colNames.get("Sample")])) getSamples().put(lina[colNames.get("Sample")], curSample);
            		else curSample=getSamples().get(lina[colNames.get("Sample")]);
            		if (!getReadGroups().containsKey(lina[colNames.get("ReadGroup")])) getReadGroups().put(lina[colNames.get("ReadGroup")], curReadGroup);
            		else getReadGroups().get(lina[colNames.get("ReadGroup")]);
            		if (!getLibraries().containsKey(lina[colNames.get("Library")])) getLibraries().put(lina[colNames.get("Library")], curLibrary);
            		else getLibraries().get(lina[colNames.get("Library")]);
            		if (!getRecords().containsKey(lina[colNames.get("ID")])) getRecords().put(lina[colNames.get("ID")], curRecord);
            		else logger.warn("Group "+lina[colNames.get("ID")]+" already exists. Skipping.");

            		curGroup.getRecords().add(curRecord);
            		curSample.getRecords().add(curRecord);
            		curLibrary.getRecords().add(curRecord);
            		curReadGroup.getRecords().add(curRecord);
            		
            		//if (curGroup.getSamples().contains(curSample)) 
            		curGroup.getSamples().add(curSample);
            		curReadGroup.getSamples().add(curSample);
            		curLibrary.getSamples().add(curSample);
            		
            		curGroup.getLibraries().add(curLibrary);
            		curSample.getLibraries().add(curLibrary);
            		curReadGroup.getLibraries().add(curLibrary);
            		
            		curGroup.getReadGroups().add(curReadGroup);
            		curSample.getReadGroups().add(curReadGroup);
            		curLibrary.getReadGroups().add(curReadGroup);
            		
            		curSample.getGroups().add(curGroup);
            		curReadGroup.getGroups().add(curGroup);
            		curLibrary.getGroups().add(curGroup);
            		
            		curRecord.setSample(curSample);
            		curRecord.setLibrary(curLibrary);
            		curRecord.setGroup(curGroup);
            		curRecord.setReadGroup(curReadGroup);
            		//logger.debug(curRecord.getId()+" "+curSample.getId()+" "+curSample);
            		/**
            		 * parse all other 'generic' attributes/columns
            		 */
            		for (int i=0;i<lina.length;i++) {
            			String[] tmp=lina[i].split(",");
            			if (tmp.length>1) curRecord.getGenericAttributes().put(colnames[i], tmp);
            			else curRecord.getGenericAttributes().put(colnames[i], lina[i]);
            			//logger.debug(colnames[i]+" "+lina[i]);
            		}
				}
			}
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public EList<GroupingCriterion> getInstances(String field, String instance) {
		EList<GroupingCriterion> retList=new BasicEList<GroupingCriterion>();
		String featureName=field.substring(0, 1).toLowerCase()+field.substring(1,field.length()-1);
		String tmp=field.substring(field.length()-1);
		featureName+=tmp.equals("y")?"ies":tmp+"s";
		//get structural feature to access the desired map according to the grouping criterion field
		EStructuralFeature esf=eClass().getEStructuralFeature(featureName);
		//logger.debug(esf);
		EMap<String, Object> map=(EMap<String, Object>) eGet(esf);
		EObject test=(EObject) map.get(instance);
		
		logger.debug(map);
		return retList;
	}
	/**
	 * <!-- begin-user-doc -->
	 * get all instances that corresponds to given instance (regarding the defined grouping)
	 * no instance found: return empty list
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<GroupingCriterion> getInstances(String field, String parentField, String instance) {
		//logger.debug(field+" "+parentField+" "+instance);
		EList<GroupingCriterion> retList=new BasicEList<GroupingCriterion>();
		if (field.equals(parentField)) return retList;
		String featureName=field.substring(0, 1).toLowerCase()+field.substring(1,field.length()-1);
		String tmp=field.substring(field.length()-1);
		featureName+=tmp.equals("y")?"ies":tmp+"s";
		
		
		String parentFeatureName=parentField.substring(0, 1).toLowerCase()+parentField.substring(1);
		String parentFeatureNameMany=parentField.substring(0, 1).toLowerCase()+parentField.substring(1,parentField.length()-1);
		tmp=parentField.substring(parentField.length()-1);
		parentFeatureNameMany+=tmp.equals("y")?"ies":tmp+"s";
		//logger.debug(parentFeatureNameMany);
		
		//get structural feature to access the desired map according to the grouping criterion field
		EStructuralFeature esf=eClass().getEStructuralFeature(featureName);
		//logger.debug(esf);
		EMap<String, Object> map=(EMap<String, Object>) eGet(esf);
		EObject test=(EObject) map.get(instance);
		//logger.debug(map.get(instance));
		//get grouping object hold in the map for grouping criterion instance, this is a EReference
		EStructuralFeature o=((EObject) map.get(instance)).eClass().getEStructuralFeature(parentFeatureName);
		boolean isMany=false;
		if (o==null) {
			o=((EObject) map.get(instance)).eClass().getEStructuralFeature(parentFeatureNameMany);
			isMany=true;
		}
		//logger.debug("found:"+o+" "+parentFeatureName);
		
		//get object for this reference

		
		//logger.debug(test.eGet(o));
		//get all instances 
		//if (test.getClass().getSimpleName().equals("RecordImpl")) {
		if (isMany) {
			//EObject[] os=(EObject[]) test.eGet(o);
			//for (Object g:os) retList.add((GroupingCriterion) g);
			retList=(EList<GroupingCriterion>) test.eGet(o);
		} else {
			//logger.debug("yep");
			//Record r=(Record) test;
			retList.add((GroupingCriterion) test.eGet(o));
			//logger.debug(r.getSample().getId());

		}
		
		return retList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequencingPackage.META_DATA__GROUPING_INSTANCES:
				return ((InternalEList<?>)getGroupingInstances()).basicRemove(otherEnd, msgs);
			case SequencingPackage.META_DATA__GROUPING_INSTANCES_BY_GROUP:
				return ((InternalEList<?>)getGroupingInstancesByGroup()).basicRemove(otherEnd, msgs);
			case SequencingPackage.META_DATA__GROUPINGS:
				return ((InternalEList<?>)getGroupings()).basicRemove(otherEnd, msgs);
			case SequencingPackage.META_DATA__SAMPLES:
				return ((InternalEList<?>)getSamples()).basicRemove(otherEnd, msgs);
			case SequencingPackage.META_DATA__RECORDS:
				return ((InternalEList<?>)getRecords()).basicRemove(otherEnd, msgs);
			case SequencingPackage.META_DATA__READ_GROUPS:
				return ((InternalEList<?>)getReadGroups()).basicRemove(otherEnd, msgs);
			case SequencingPackage.META_DATA__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case SequencingPackage.META_DATA__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case SequencingPackage.META_DATA__FILE_NAME:
				return getFileName();
			case SequencingPackage.META_DATA__LOGGER:
				return getLogger();
			case SequencingPackage.META_DATA__GROUPING_INSTANCES:
				if (coreType) return getGroupingInstances();
				else return getGroupingInstances().map();
			case SequencingPackage.META_DATA__GROUPING_INSTANCES_BY_GROUP:
				if (coreType) return getGroupingInstancesByGroup();
				else return getGroupingInstancesByGroup().map();
			case SequencingPackage.META_DATA__GROUPINGS:
				if (coreType) return getGroupings();
				else return getGroupings().map();
			case SequencingPackage.META_DATA__SAMPLES:
				if (coreType) return getSamples();
				else return getSamples().map();
			case SequencingPackage.META_DATA__RECORDS:
				if (coreType) return getRecords();
				else return getRecords().map();
			case SequencingPackage.META_DATA__READ_GROUPS:
				if (coreType) return getReadGroups();
				else return getReadGroups().map();
			case SequencingPackage.META_DATA__LIBRARIES:
				if (coreType) return getLibraries();
				else return getLibraries().map();
			case SequencingPackage.META_DATA__GROUPS:
				if (coreType) return getGroups();
				else return getGroups().map();
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
			case SequencingPackage.META_DATA__FILE_NAME:
				setFileName((String)newValue);
				return;
			case SequencingPackage.META_DATA__LOGGER:
				setLogger((Logger)newValue);
				return;
			case SequencingPackage.META_DATA__GROUPING_INSTANCES:
				((EStructuralFeature.Setting)getGroupingInstances()).set(newValue);
				return;
			case SequencingPackage.META_DATA__GROUPING_INSTANCES_BY_GROUP:
				((EStructuralFeature.Setting)getGroupingInstancesByGroup()).set(newValue);
				return;
			case SequencingPackage.META_DATA__GROUPINGS:
				((EStructuralFeature.Setting)getGroupings()).set(newValue);
				return;
			case SequencingPackage.META_DATA__SAMPLES:
				((EStructuralFeature.Setting)getSamples()).set(newValue);
				return;
			case SequencingPackage.META_DATA__RECORDS:
				((EStructuralFeature.Setting)getRecords()).set(newValue);
				return;
			case SequencingPackage.META_DATA__READ_GROUPS:
				((EStructuralFeature.Setting)getReadGroups()).set(newValue);
				return;
			case SequencingPackage.META_DATA__LIBRARIES:
				((EStructuralFeature.Setting)getLibraries()).set(newValue);
				return;
			case SequencingPackage.META_DATA__GROUPS:
				((EStructuralFeature.Setting)getGroups()).set(newValue);
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
			case SequencingPackage.META_DATA__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case SequencingPackage.META_DATA__LOGGER:
				setLogger(LOGGER_EDEFAULT);
				return;
			case SequencingPackage.META_DATA__GROUPING_INSTANCES:
				getGroupingInstances().clear();
				return;
			case SequencingPackage.META_DATA__GROUPING_INSTANCES_BY_GROUP:
				getGroupingInstancesByGroup().clear();
				return;
			case SequencingPackage.META_DATA__GROUPINGS:
				getGroupings().clear();
				return;
			case SequencingPackage.META_DATA__SAMPLES:
				getSamples().clear();
				return;
			case SequencingPackage.META_DATA__RECORDS:
				getRecords().clear();
				return;
			case SequencingPackage.META_DATA__READ_GROUPS:
				getReadGroups().clear();
				return;
			case SequencingPackage.META_DATA__LIBRARIES:
				getLibraries().clear();
				return;
			case SequencingPackage.META_DATA__GROUPS:
				getGroups().clear();
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
			case SequencingPackage.META_DATA__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case SequencingPackage.META_DATA__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case SequencingPackage.META_DATA__GROUPING_INSTANCES:
				return groupingInstances != null && !groupingInstances.isEmpty();
			case SequencingPackage.META_DATA__GROUPING_INSTANCES_BY_GROUP:
				return groupingInstancesByGroup != null && !groupingInstancesByGroup.isEmpty();
			case SequencingPackage.META_DATA__GROUPINGS:
				return groupings != null && !groupings.isEmpty();
			case SequencingPackage.META_DATA__SAMPLES:
				return samples != null && !samples.isEmpty();
			case SequencingPackage.META_DATA__RECORDS:
				return records != null && !records.isEmpty();
			case SequencingPackage.META_DATA__READ_GROUPS:
				return readGroups != null && !readGroups.isEmpty();
			case SequencingPackage.META_DATA__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case SequencingPackage.META_DATA__GROUPS:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultMetaData.class) {
			switch (derivedFeatureID) {
				case SequencingPackage.META_DATA__FILE_NAME: return CorePackage.DEFAULT_META_DATA__FILE_NAME;
				case SequencingPackage.META_DATA__LOGGER: return CorePackage.DEFAULT_META_DATA__LOGGER;
				case SequencingPackage.META_DATA__GROUPING_INSTANCES: return CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES;
				case SequencingPackage.META_DATA__GROUPING_INSTANCES_BY_GROUP: return CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP;
				case SequencingPackage.META_DATA__GROUPINGS: return CorePackage.DEFAULT_META_DATA__GROUPINGS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultMetaData.class) {
			switch (baseFeatureID) {
				case CorePackage.DEFAULT_META_DATA__FILE_NAME: return SequencingPackage.META_DATA__FILE_NAME;
				case CorePackage.DEFAULT_META_DATA__LOGGER: return SequencingPackage.META_DATA__LOGGER;
				case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES: return SequencingPackage.META_DATA__GROUPING_INSTANCES;
				case CorePackage.DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP: return SequencingPackage.META_DATA__GROUPING_INSTANCES_BY_GROUP;
				case CorePackage.DEFAULT_META_DATA__GROUPINGS: return SequencingPackage.META_DATA__GROUPINGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //MetaDataImpl
