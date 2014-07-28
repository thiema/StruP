#0		1		2				3			4			5					6					7			8
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
#_root_				FASTQ
_root_				F2;F3
#;;ParamID2:Locus:split
A		A	F2	F2		ParamID1:ParamNameA:values=[1,2]
Ax		Ax	F3	F3
#Cond=="C1"
#B		B	F2	F2				Cond=="C1"
#B		B	F2	F2	Sample,Record			Cond=="C1"
#B		B	F2	F2	Sample			Cond=="C1"
#B		B	F2	F2	Group,Sample
#B		B	F2	F2	Sample:joint
B		B	F2	F2	Sample
#C		C	F2	F4		ParamID2:Locus:merge
C		C	F2;F3	F4		ParamID1:ParamNameA:merge
#C		C	F2	F2	Sample
Sort	STATIC:sort	sort	F1||F2||F3	F1||F2||F3
#Index	STATIC:index	index	F1||F2	idx		Read:sort:Coordinate	
Merge	STATIC:merge	merge	F1||F2||F3	F1||F2||F3	
Print	STATIC:filter	split	F1||F2||F3	F1||F2||F3