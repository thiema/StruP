package easyflow.custom.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import easyflow.core.Task;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.GroupingInstance;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;

public class Util {
	
	
	private static Logger logger = Logger.getLogger(Util.class);

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
		
		Expression e = GlobalVar.getJexlengine().createExpression(jexl);
		JexlContext context = new MapContext(metaDataMap.map());
		logger.trace("evaluateJexl(): "+e);
		Object eval = e.evaluate(context);
		if (eval instanceof Boolean && !(Boolean) eval)
			logger.debug("evaluateJexl(): Skip due to jexl condition: " + jexl + " and context: "
					+ mapToString(metaDataMap));
		return e.evaluate(context);
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
	public static EMap<String, Object> createMetaDataMapForJexl(
			EList<GroupingInstance> groupingInstances, String forGrouping) {

		EMap<String, Object> metaDataMap = new BasicEMap<String, Object>();
		// logger.debug(forGrouping);
		// for (GroupingInstance groupingInstance:groupingInstances)
		// logger.debug(groupingInstance.getName());

		DefaultMetaData metaData = GlobalVar.getGraphUtil().getMetaData();
		for (GroupingInstance groupingInstance : groupingInstances) {
			EList<GroupingInstance> recordInstances = metaData.getInstances(
					groupingInstance, GlobalConstants.TRAVERSAL_CRITERION_RECORD);
			for (GroupingInstance recordInstance : recordInstances)
				for (Entry<String, Object> entry : metaData.getRecord(
						recordInstance).entrySet()) {
					Object value = entry.getValue();
					if (metaDataMap.containsKey(entry.getKey())) {
						mergeValue(metaDataMap.get(entry.getKey()), value);
					}
					metaDataMap.put(entry.getKey(), value);
				}
		}
		// for (Entry<String, Grouping>
		// entry:metaData.getGroupings().entrySet())
		// { metaData.g }
		return metaDataMap;
	}
	
	
	public static EMap<String, Object> createMetaDataMapForJexl(
			EList<TraversalChunk> records) {

		EMap<String, Object> metaDataMap = new BasicEMap<String, Object>();
		// logger.debug(forGrouping);
		// for (GroupingInstance groupingInstance:groupingInstances)
		// logger.debug(groupingInstance.getName());

		DefaultMetaData metaData = GlobalVar.getGraphUtil().getMetaData();
		for (TraversalChunk record : records) {
			for (Entry<String, Object> entry : metaData.getRecord(
						record).entrySet()) {
				Object value = entry.getValue();
				if (metaDataMap.containsKey(entry.getKey())) {
					mergeValue(metaDataMap.get(entry.getKey()), value);
				}
				metaDataMap.put(entry.getKey(), value);
			}
		}
		// for (Entry<String, Grouping>
		// entry:metaData.getGroupings().entrySet())
		// { metaData.g }
		return metaDataMap;
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
		return null;		
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
			else
				s = o.toString();
		return s;
			
	}
}