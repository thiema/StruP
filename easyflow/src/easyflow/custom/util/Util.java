package easyflow.custom.util;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JButton;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlException;
import org.apache.commons.jexl2.MapContext;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import sun.security.action.GetLongAction;
import easyflow.util.ErrorInfo;
import easyflow.util.LogMessage;
import easyflow.util.Severity;
import easyflow.util.UtilFactory;
import easyflow.core.Task;
import easyflow.data.DataPort;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.GroupingInstance;
import easyflow.tool.Tool;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalEvent;

public class Util {
	
	
	
	private static Logger logger = Logger.getLogger(Util.class);
	private static LogMessage logMessage = UtilFactory.eINSTANCE.createLogMessage();
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public static Object evaluateJexl(EMap<String, Object> metaDataMap, String jexl) {

		// evaluate the tasks jexl expression against metaDataMap
		//if (jexl == null || jexl.equals(""))
			//jexl = getJexlString();
		logger.trace("evaluateJexl(): jexl=" + jexl + " map="+ metaDataMap);
		if (jexl == null || jexl.equals(""))
			return true;
		if (metaDataMap.isEmpty())
			return true;
		
		try
		{
		Expression e = GlobalVar.getJexlengine().createExpression(jexl);
		JexlContext context = new MapContext(metaDataMap.map());
		logger.trace("evaluateJexl(): "+e);
		Object eval = e.evaluate(context);
		if (eval instanceof Boolean && !(Boolean) eval)
			logger.debug("evaluateJexl(): Skip due to jexl condition: " + jexl + " and context: "
					+ mapToString(metaDataMap));
		return e.evaluate(context);
		}
		catch (JexlException e)
		{
			logMessage.generateLogMsg(GlobalConstants.LOG_MSG_UTIL_FAILED_TO_PARSE_CONDITION_DEFINITION_1, 
					Severity.ERROR,
					jexl);
			return null;
		}
	}
	
	private static String mapToString(EMap<String, Object> map) {
		String res = "";
		for (Entry<String, Object> e : map.entrySet()) {
			if (e.getValue() instanceof String[]) {
				res += e.getKey() + "->[";
				for (String v : (String[]) e.getValue())
					res += v + ", ";
				res += "]; ";
			} else
				res += e.getKey() + "->" + e.getValue() + "; ";
		}
		return res;
	}
	
	
	/**
	 * <!-- begin-user-doc --> we need to create a map of the kind: Platform ->
	 * "Illumina" InputFiles -> ["a","b","c"] Group -> "g1" ReadGroup ->
	 * ["rg1"," rg2"] Records -> ["rec1", "rec2, "rec3"]
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public static EList<EMap<String, Object>> createMetaDataMapForJexl(
			EList<GroupingInstance> groupingInstances, String forGrouping) {

		EList<EMap<String, Object>> list = new BasicEList<EMap<String, Object>>();
		

		DefaultMetaData metaData = GlobalVar.getMetaData();
		for (GroupingInstance groupingInstance : groupingInstances) {
			EList<GroupingInstance> recordInstances = metaData.getInstances(
					groupingInstance, 
					GlobalConstants.TRAVERSAL_CRITERION_RECORD
					);
			for (GroupingInstance recordInstance : recordInstances)
			{
				EMap<String, Object> metaDataMap = createMetaDataMapForJexlForRecordInstance(recordInstance);
				if (!metaDataMap.isEmpty())
					list.add(metaDataMap);
			}
		}
		// for (Entry<String, Grouping>
		// entry:metaData.getGroupings().entrySet())
		// { metaData.g }
		return list;
	}
	
	public static EMap<String, Object> createMetaDataMapForJexlForRecordInstance(GroupingInstance recordInstance)
	{
		DefaultMetaData metaData = GlobalVar.getMetaData();
		EMap<String, Object> metaDataMap = new BasicEMap<String, Object>();
		//logger.debug("createMetaDataMapForJexl(): found "+recordInstances.size()+" records for grouping instance="+groupingInstance.getName()+" "+groupingInstance.getGroupingStr());
		
			for (Entry<String, Object> entry : metaData.getRecord(
					recordInstance).entrySet()) {
				Object value = entry.getValue();
				logger.trace("createMetaDataMapForJexl(): set key="+entry.getKey()+" value="+value);
				if (metaDataMap.containsKey(entry.getKey())) {
					mergeValue(metaDataMap.get(entry.getKey()), value);
				}
				
				metaDataMap.put(entry.getKey(), value);
			}
		return metaDataMap;

	}
	
	public static EMap<String, Object> createMetaDataMapForJexlForTraversalChunk(TraversalChunk record)
	{
		EMap<String, Object> metaDataMap = new BasicEMap<String, Object>();
		DefaultMetaData metaData = GlobalVar.getMetaData();
		
		for (Entry<String, Object> entry : metaData.getRecord(record).entrySet()) 
		{
			Object value = entry.getValue();
			if (metaDataMap.containsKey(entry.getKey())) 
			{
				mergeValue(metaDataMap.get(entry.getKey()), value);
			}
			metaDataMap.put(entry.getKey(), value);
		}
		return metaDataMap;
	}
	
	public static EList<EMap<String, Object>> createMetaDataMapForJexl(EList<TraversalChunk> records) {

		EList<EMap<String, Object>> list = new BasicEList<EMap<String, Object>>();
		
		// logger.debug(forGrouping);
		// for (GroupingInstance groupingInstance:groupingInstances)
		// logger.debug(groupingInstance.getName());

		
		for (TraversalChunk record : records) {
			EMap<String, Object> metaDataMap = createMetaDataMapForJexlForTraversalChunk(record);
			if (!metaDataMap.isEmpty())
					list.add(metaDataMap);
		}
		// for (Entry<String, Grouping>
		// entry:metaData.getGroupings().entrySet())
		// { metaData.g }
		return list;
	}
	
	private static Object mergeValue(Object o1, Object o2) {
		Object ret = null;
		if (o1 instanceof List) {
			if (o2 instanceof List)
				((List) o1).addAll((List) o2);
			else
				((List) o1).add(o2);
			ret = o1;
		} else {
			if (o2 instanceof List) {
				((List) o2).add(o2);
				ret = o2;
			} else {
				Object[] o = { o1, o2 };
				ret = o;
			}
		}
		return ret;
	}
	
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(
			Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(
				map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
	
	public static String traversalEvent2String(TraversalEvent te)
	{
		if (te != null)
			return " type=" + te.getType()
				+ " split="
				+ (te.getSplitTask() != null ? te.getSplitTask()
						.getUniqueString() : null)
				+ " merge="
				+ (te.getMergeTask() != null ? StringUtils.join(
						tasksToStringList(te.getMergeTask()), ",") : null)
				+ " crit name=" + te.getTraversalCriterion().getName()
				+ " crit mode=" + te.getTraversalCriterion().getMode()
				;
		else
			return "";
	}
	
	public static String traversalEvents2String(EMap<String, TraversalEvent> traversalEvents)
	{
		String out = "";
		for (String key : traversalEvents.keySet()) {
			TraversalEvent te = traversalEvents.get(key);
			out +="key="+ key;
			out +=traversalEvent2String(te);
			out += "; ";
		}
		return out;
	}
	
	public static String traversalChunks2String(EMap<String, EList<TraversalChunk>> chunks, boolean isUri)
	{
		String uniq="";
		final String sep1="-", sep2= ":", sep3= "_";
		
		Iterator<Entry<String, EList<TraversalChunk>>> it = chunks
				.iterator();
		// for (String key:getChunks().keySet())
		while (it.hasNext()) {
			String key = it.next().getKey();
			// logger.debug();

			if (isUri)
				uniq += sep3+ key + sep3;
			else
				uniq += sep2 + key + sep3;
			String[] tmp = new String[chunks.get(key).size()];
			// logger.debug("getUniqueString(): "+key+" "+tmp.length+" "+getChunks().get(key));
			for (int i = 0; i < tmp.length; i++) {
				tmp[i] = chunks.get(key).get(i).getName();
				// logger.debug(tmp[i]);
			}
			uniq += StringUtils.join(tmp, sep1);
		}
		return uniq;
	}
	
	public static EList<String> tasksToStringList(EList<Task> tasks) {
		EList<String> list = new BasicEList<String>();
		for (Task t : tasks)
			list.add(t.getUniqueString());
		return list;

	}


	
	public static String list2String(Object list, String sep)
	{
		
		if (list instanceof EList)
		{
			if (sep==null)
				sep=", ";
			//logger.trace("list2String(): elist found");
			EList chunks = (EList)list;
			EList<String> cs = new BasicEList<String>();
			
			for (Object chunk:chunks)
			{
				cs.add(obejct2String(chunk));
			}
			return StringUtils.join(cs, sep);
		}
		else if (list instanceof Collection)
		{
			if (sep==null)
				sep=", ";
			//logger.trace("list2String(): elist found");
			Collection chunks = (Collection)list;
			Collection<String> cs = new ArrayList<String>();
			
			for (Object chunk:chunks)
			{
				cs.add(obejct2String(chunk));
			}
			return StringUtils.join(cs, sep);
		}
		else if (list instanceof Set)
		{
			if (sep==null)
				sep=", ";
			//logger.trace("list2String(): elist found");
			Set chunks = (Set)list;
			Collection<String> cs = new ArrayList<String>();
			
			for (Object chunk:chunks)
			{
				cs.add(obejct2String(chunk));
			}
			return StringUtils.join(cs, sep);
		}
		return null;		
	}
	
	public static String separatorsToSystem(String path) {
		
	    if (path==null) return null;
	    if (File.separatorChar=='\\') {
	        // From Windows to Linux/Mac
	        return path.replace('/', File.separatorChar);
	    } else {
	        // From Linux/Mac to Windows
	        return path.replace('\\', File.separatorChar);
	    }
	}
	
	public static EList<String> list2StringList(Object list)
	{
		EList<String> stringList = new BasicEList<String>();
		if (list instanceof EList)
			for (Object o : (EList)list)
				stringList.add(obejct2String(o));
		return stringList;
	}
	
	public static String obejct2String(Object o) 
	{
		String s=null;
			//logger.trace(""+chunk);
			if (o instanceof TraversalChunk)
				s = ((TraversalChunk)o).getName();
			else if (o instanceof TraversalCriterion)
				s = (((TraversalCriterion)o).getId());
			else if (o instanceof GroupingInstance)
				s = (((GroupingInstance)o).getName());
			else if (o instanceof DataPort)
				s = ((DataPort)o).getFormat().getName();
			else
				s = o.toString();
		return s;
			
	}
	
	//static String debugTool = "view";
	static String debugTool = "picard_ARRG";
	//static String debugTool = "gatk2_realigner_target_creator";
	

	public static boolean debugTool(Tool tool)
	{
		if (tool == null)
			return false;
		
		if (debugTool.equals(tool.getName()) || debugTool.equals(tool.getId()))
		{
			return true;
		}
		return false;

	}
	
	private static EList<String> errorStringList = new BasicEList<String>();
	public static EList<String> generateStringList(String s1)
	{
		errorStringList.clear();
		errorStringList.add(s1);
		return errorStringList;
	}

	public static EList<String> generateStringList(String s1, String s2)
	{
		errorStringList.clear();
		errorStringList.add(s1);
		errorStringList.add(s2);
		return errorStringList;
	}

	public static EList<String> generateStringList(String s1, String s2, String s3)
	{
		errorStringList.clear();
		errorStringList.add(s1);
		errorStringList.add(s2);
		errorStringList.add(s3);
		return errorStringList;
	}

	public static EList<String> generateStringList(String s1, String s2, String s3, String s4)
	{
		errorStringList.clear();
		errorStringList.add(s1);
		errorStringList.add(s2);
		errorStringList.add(s3);
		errorStringList.add(s4);
		return errorStringList;
	}
	public static EList<String> generateStringList(String s1, String s2, String s3, String s4, String s5)
	{
		errorStringList.clear();
		errorStringList.add(s1);
		errorStringList.add(s2);
		errorStringList.add(s3);
		errorStringList.add(s4);
		errorStringList.add(s5);
		return errorStringList;
	}

	public static void printLastErrorInfo(Exception e, JButton jButton)
	{
		ErrorInfo errorInfo = GlobalVar.getLastErrorInfo(); 
		if (errorInfo != null)
		{
			errorInfo.print();
			if (GlobalVar.isDevloperMode())
			{
				e.printStackTrace();
			}
			if (GlobalVar.outputToGUI() && jButton != null)
			{
				jButton.setEnabled(false);
			}
		}
		else
		{
			
		}
	}

	public static String separatorsToSystem(String path, String string) {
	    if (path==null) return null;
	    if (string.equals(GlobalConstants.WINDOWS_NAME)) {
	        // From Windows to Linux/Mac
	        return path.replace('/', File.separatorChar);
	    } else {
	        // From Linux/Mac to Windows
	        return path.replace('\\', File.separatorChar);
	    }		
	}
}
