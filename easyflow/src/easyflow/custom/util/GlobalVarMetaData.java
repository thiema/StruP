package easyflow.custom.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class GlobalVarMetaData {
	
	private static String metaDataTable[][];
	private static Map<String, Integer> colHeaderMap = new HashMap<String, Integer>();
	private static Map<String, Integer> rowHeaderMap = new HashMap<String, Integer>();
	private static String               colHeader[];
	private static String               rowHeader[];
	private static Map<String, String>  colTypeMap   = new HashMap<String, String>();
	
	//when a field has multiples value, store id, field name e.g. InputFiles and the mutiple values as string list
	private static Map<String, Map<String, List<String>>> multiFieldMap = new HashMap<String, Map<String, List<String>>>();
	
	public static String[] getColHeader()
	{
		return colHeader;
	}
	
	public static String[] getRowHeader()
	{
		return rowHeader;
	}
	
	public static void createNewMetaDataColHeader(String[] header)
	{
		colHeaderMap.clear();
		colTypeMap.clear();
		colHeader = new String[header.length];
		for (int i=0;i<header.length;i++)
		{
			String[] a=StringUtils.split(header[i], ":");
			colHeaderMap.put(a[0],i);
			if (a.length>1)
				colTypeMap.put(a[0], a[1]);
			else
				colTypeMap.put(a[0], "String");
			colHeader[i]=a[0];
			
		}
		//System.out.println(colHeaderMap);
	}
	
	public static void createNewMetaDataRowHeader(String[] header)
	{
		rowHeaderMap.clear();
		rowHeader = header;
		for (int i=0;i<header.length;i++)
			rowHeaderMap.put(header[i],i);
	}
	
	public static Map<String, Integer> getMetaDataRowHeader()
	{
		return rowHeaderMap;
	}
	public static Map<String, Integer> getMetaDataColHeader()
	{
		return colHeaderMap;
	}
	public static Map<String, String> getMetaDataColType()
	{
		return colTypeMap;
	}
	
	public static void createNewMetaDataTable()
	{
		metaDataTable = new String[rowHeaderMap.size()][colHeaderMap.size()];
	}
	
	private static void setField(int row, int col, String value)
	{
		String rowStr = rowHeader[row];
		String colStr = colHeader[col];
		String values[] = value.split(",");
		if (values.length>1)
			for (String tmp : values)
			{
				if (!multiFieldMap.containsKey(rowStr))
				{
					Map<String, List<String>> newMap = new HashMap<String, List<String>>();
					multiFieldMap.put(rowStr, newMap);
				}
				if (!multiFieldMap.get(rowStr).containsKey(colStr))
				{
					List<String> newList = new ArrayList<String>();
					multiFieldMap.get(rowStr).put(colStr, newList);
				}
				
				multiFieldMap.get(rowStr).get(colStr).add(tmp);
			}
		metaDataTable[row][col]=value;
	}
	
	public static void setMetaDataTableRow(int row, String[] lina)
	{
		for (int i=0;i<lina.length;i++)
			
			//metaDataTable[row][i]=lina[i];
			setField(row, i, lina[i]);
	}
	
	public static void setMetaDataTableRow(String[] lina)
	{
		int row=rowHeaderMap.get(lina[0]);
		for (int i=1;i<lina.length;i++)
			//metaDataTable[row][i-1]=lina[i];
			setField(row, i-1, lina[i]);
	}
	
	public static String getMetaDataTableEntry(String row, String col)
	{
		return metaDataTable[rowHeaderMap.get(row)][colHeaderMap.get(col)];
	}
	public static String getMetaDataTableEntry(int row, int col)
	{
		return metaDataTable[row][col];
	}
	
	public static Map<String, String> getMetaDataTableRow(String rowStr)
	{
		Map<String, String> tableRow = new HashMap<String, String>();
		int row=rowHeaderMap.get(rowStr);
		for (String col:colHeaderMap.keySet())
		{
			tableRow.put(col, metaDataTable[row][colHeaderMap.get(col)]);
		}
		return tableRow;
	}

	public static Map<String, String> getMetaDataTableColumn(String columnStr)
	{
		Map<String, String> tableCol = new HashMap<String, String>();
		int col=colHeaderMap.get(columnStr);
		for (String row:rowHeaderMap.keySet())
		{
			tableCol.put(row, metaDataTable[rowHeaderMap.get(row)][col]);
		}
		return tableCol;
	}
	
	public static List<String> getMultiFieldValues(String id, String field)
	{
		if (multiFieldMap.containsKey(id))
			if (multiFieldMap.get(id).containsKey(field))
			{
				List<String> l = new ArrayList<String>();
				for (String val : multiFieldMap.get(id).get(field))
					l.add(val);
				return l;
			}
		return new ArrayList<String>();
	}

	public static String getRecordForMultiFieldValue(String multiFieldName, String mutiFieldValue) {
		
		for (String row:getMetaDataRowHeader().keySet())
			for (String multiFieldValueTest:getMultiFieldValues(row, multiFieldName))
				if (multiFieldValueTest.equals(mutiFieldValue))
					return row;
		return null;
	}
}
