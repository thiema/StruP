package easyflow.custom.util;

public class GlobalVar {

	private static easyflow.graph.jgraphx.Util graphUtil = null;
	
	public static easyflow.graph.jgraphx.Util getGraphUtil()
	{
		return graphUtil;
	}
	public static void setGraphUtil (
			easyflow.graph.jgraphx.Util newGraphUtil)
	{
		graphUtil=newGraphUtil;
	}
}
