#0		1		2				3			4			5					6					7			8
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
##combinations of several formats currently not working
#Sort	STATIC:sort	sort	F1||F2||F3	F1||F2||F3
#Index	STATIC:index	index	F1||F2	idx		Read:sort:Coordinate	
#Merge	STATIC:merge	merge	F1||F2||F3	F1||F2||F3	
#Print	STATIC:filter	split	F1||F2||F3	F1||F2||F3
SortF1	STATIC:sort	sort	F1	F1
IndexF1	STATIC:index	index	F1	F1.idx		Read:sort:Coordinate	
MergeF1	STATIC:merge	merge	F1	F1	
PrintF1	STATIC:filter	split	F1	F1
SortF2	STATIC:sort	sort	F2	F2
IndexF2	STATIC:index	index	F2	F2.idx
MergeF2	STATIC:merge	merge	F2	F2	
PrintF2	STATIC:filter	split	F2	F2