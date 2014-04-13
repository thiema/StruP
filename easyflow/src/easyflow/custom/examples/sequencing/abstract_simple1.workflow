#0		1		2				3			4			5					6					7			8
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
_root_				FASTQ
A			FASTQ	F2		ReadEnd:input:metadata=InputFiles
#;ParamID1:ParamNameA:values=[1,2];ParamID2:Locus:split
B			FASTQ;F2	F3		ReadEnd:input:merge
#B			F2	F3	Sample,Record		Cond=="C1"
#B			F2	F3	Sample		Cond=="C1"
#B			F2	F3	Group,Sample
#B			F2	F3	Sample:joint
#B			F2	F3
#C			F2	F4		ParamID2:Locus:merge
#C			F2	F4
C			F3	F4
Sort	STATIC:sort	samtools:sort	F1||F2||F3	F1||F2||F3
#Index	STATIC:index	samtools:index	BAM	BAI		Read:sort:Coordinate	
Merge	STATIC:merge	samtools:merge	F1||F2||F3	F1||F2||F3	
Print	STATIC:filter	samtools:view	F1||F2||F3	F1||F2||F3