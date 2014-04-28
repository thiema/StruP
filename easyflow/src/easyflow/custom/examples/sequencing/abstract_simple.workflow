#0__	1____	2_____________	3_______	4_______	5________________	6__________________	7_________	8_________________
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
_root_				F1
#A			F1	F1	Sample
A			F1	F1
#B			F1	F1	Group			Cond=="C1"
B			F1	F1	Sample			Cond=="C1"
#B			F1	F1				Cond=="C1"
C			F1	F1
#C			F1	F1	Sample
Sort	STATIC:sort	samtools:sort	F1	F1
#Index	STATIC:index	samtools:index	BAM	BAI		Read:sort:Coordinate	
Merge	STATIC:merge	samtools:merge	F1	F1	
Print	STATIC:filter	samtools:view	F1	F1