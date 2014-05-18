package easyflow.custom.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import easyflow.metadata.GroupingInstance;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;

public class Util {
	
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
