#0__	1____	2_____________	3_______	4_______	5________________	6__________________	7_________	8_________________
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
_root_				F1	InputFiles:joint
#A		A	F1	F1;F2		Part:input:metadata=InputFiles
#A		A	F1	F1;F2	Sample	Param1:seed:values=[1,2]
#A		A	F1	F1;F2	Record	Param1:seed:values=[1,2]
#	Param1:seed:values=[1,2]
#B		B	F1	F1	Group			Cond=="C1"
#B		B	F1	F1	Sample			Cond=="C1"
#B		B	F1	F1				Cond=="C1"
#B		B	F1	F1	Sample	Param1:seed:merge
#C		C	F1	F1		Part:input:merge
##
## simple inputs->record pattern
##
#A		A	F1	F2
##
## multiple inputs complex inputs->record pattern
##
#A		A	F1	F2	InputFiles
#B		B	F2;F1	F3
#C		C	F3	F3
#D		C	F3	F3
##
## multiple inputs (joint)
##
#A		A	F1	F2	InputFiles:joint
#B		B	F2;F1	F3
#C		C	F3	F3
##
##simple multiple inputs for record -example
##
#A		A	F1	F1	InputFiles
#B		B	F1	F1
#C		C	F1	F1
##
##example of two outputs/inputs with param criterion
##
A		A	F1	F1;F2	Group	Param1:seed:values=[1,2]
B		B	F1	F1	Sample
C		C	F1;F2	F1	Group	Param1:seed:merge
##
SortF1	STATIC:sort	sort	F1	F1
IndexF1	STATIC:index	index	F1	F1.idx		Read:sort:Coordinate	
MergeF1	STATIC:merge	merge	F1	F1	
PrintF1	STATIC:filter	split	F1	F1
SortF2	STATIC:sort	sort	F2	F2
IndexF2	STATIC:index	index	F2	F2.idx
MergeF2	STATIC:merge	merge	F2	F2	
PrintF2	STATIC:filter	split	F2	F2
