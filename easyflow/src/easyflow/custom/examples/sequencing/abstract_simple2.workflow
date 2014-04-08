#0	1	2	3	4	5	6	7
#task	parent	implementation	formatIn	formatOut	groupingCriterion traversalExpression	JEXL:process_task?
_root_				F1
A			F1	F1	Sample
B			F1	F1	Group:joint		Cond=="C1"
#B			F1	F1	Sample
#C			F1	F1
Sort	STATIC:sort	samtools:sort	F1	F1
#Index	STATIC:index	samtools:index	BAM	BAI		Read:sort:Coordinate	
Merge	STATIC:merge	samtools:merge	F1	F1	
Print	STATIC:filter	samtools:view	F1	F1