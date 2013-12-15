package easyflow.custom.util;

import java.util.HashMap;
import java.util.Map;

import sun.security.action.GetLongAction;

public class GlobalVar {

	private static easyflow.graph.jgraphx.Util graphUtil = null;
	private static String metaDataTable[][];
	private static Map<String, Integer> colHeaderMap = new HashMap<String, Integer>();
	private static Map<String, Integer> rowHeaderMap = new HashMap<String, Integer>();
	
	public static easyflow.graph.jgraphx.Util getGraphUtil()
	{
		return graphUtil;
	}
	public static void setGraphUtil (
			easyflow.graph.jgraphx.Util newGraphUtil)
	{
		graphUtil=newGraphUtil;
	}
	
	public static void createNewMetaDataColHeader(String[] header)
	{
		colHeaderMap.clear();
		for (int i=0;i<header.length;i++)
			colHeaderMap.put(header[i],i);
		//System.out.println(colHeaderMap);
	}
	
	public static void createNewMetaDataRowHeader(String[] header)
	{
		rowHeaderMap.clear();
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
	
	public static void createNewMetaDataTable()
	{
		metaDataTable = new String[rowHeaderMap.size()][colHeaderMap.size()];
	}
	
	public static void setMetaDataTableRow(int row, String[] lina)
	{
		for (int i=0;i<lina.length;i++)
			metaDataTable[row][i]=lina[i];
	}
	
	public static void setMetaDataTableRow(String[] lina)
	{
		int row=rowHeaderMap.get(lina[0]);
		for (int i=1;i<lina.length;i++)
			metaDataTable[row][i-1]=lina[i];
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
}
