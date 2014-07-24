#0__	1____	2_____________	3_______	4_______	5________________	6__________________	7_________	8_________________
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
#_root_				F1
#A		A	F1	F1;F2		Part:input:metadata=InputFiles
#A		A	F1	F1;F2	Sample	Param1:seed:values=[1,2]
#A		A	F1	F1;F2	Record	Param1:seed:values=[1,2]
#	Param1:seed:values=[1,2]
#B		B	F1	F1	Group			Cond=="C1"
#B		B	F1	F1	Sample			Cond=="C1"
#B		B	F1	F1				Cond=="C1"
#B		B	F1	F1	Sample	Param1:seed:merge
#C		C	F1	F1		Part:input:merge
##param criterion not correctly merged, when input comes from 2 different ports.
#C		C	F1;F2	F1		Part:input:merge
#C		C	F1;F2	F1	Group
##
##simple multiple inputs for record example
##
A		A	F1	F1	InputFiles
B		B	F1	F1
#C		C	F1	F1
##
##example of two outputs/inputs with param criterion
##
#A		A	F1	F1;F2	Group	Param1:seed:values=[1,2]
#B		B	F1	F1	Sample
#C		C	F1;F2	F1	Group	Param1:seed:merge
##
##
##doesnt work, node removed before te Sample_B is applied
##
#A		A	F1	F1;F2	Group
#B		B	F1	F1	Sample
#C		C	F1;F2	F1	Group
##
Sort	STATIC:sort	sort	F1	F1
Index	STATIC:index	index	F1	idx		Read:sort:Coordinate	
Merge	STATIC:merge	merge	F1	F1	
Print	STATIC:filter	split	F1	F1