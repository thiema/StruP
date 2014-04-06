#0		1		2				3			4			5					6					7			8
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
_root_				F1
A			F1	F2		ReadEnd:input:metadata=InputFiles;ParamID1:ParamNameA:values=[1,2];ParamID2:Locus:split
B			F2	F3	Sample,Record		Cond=="C1"
#B			F2	F3	Sample		Cond=="C1"
#B			F2	F3	Group,Sample
#B			F2	F3	Sample:joint
#B			F2	F3
C			F2	F4		ParamID2:Locus:merge
#C			F2	F4
SortSam	STATIC:sort	samtools:sort	BAM	BAM
IndexSam	STATIC:index	samtools:index	BAM	BAI		Read:sort:Coordinate	
MergeSam	STATIC:merge	samtools:merge	BAM,SAM	BAM,SAM	ReadGroup	
PrintSam	STATIC:filter	samtools:view	(SAM | BAM)	SAM || BAM