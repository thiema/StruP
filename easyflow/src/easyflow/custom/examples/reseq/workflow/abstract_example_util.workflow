#0__	1______________	2_____________	3_______	4_______	5________________	6__________________	7_________	8_________________
#task	___parent______	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
SortF1	STATIC:sort	sort	F1	F1
#IndexF1	STATIC:index	index	F1	F1.idx		Read:sort:Coordinate
IndexF1	STATIC:index	index	F1	F1.idx	
MergeF1	STATIC:merge	merge	F1	F1	
PrintF1	STATIC:filter	split	F1	F1
SortF2	STATIC:sort	sort	F2	F2
IndexF2	STATIC:index	index	F2	F2.idx
MergeF2	STATIC:merge	merge	F2	F2	
PrintF2	STATIC:filter	split	F2	F2