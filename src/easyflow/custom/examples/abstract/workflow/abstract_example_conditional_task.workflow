#0__	1____	2_____________	3_______	4_______	5________________	6__________________	7_________	8_________________
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
##
A		A	F1	F2	InputFiles
#A		A	F1	F2
B		B	F2;F2.idx	F2			;index	Cond=="C1"
#B		B	F2	F2				Cond=="C1"
#B		B	F2	F2
C		C	F2	F2				Cond=="C2"
#C		C	F2	F2				Cond=="C1"
D		D	F2	F3	Group
##conditional task B not handled as conditional, because
##nobody provides input F3 other than B for task C
#A		A	F1	F2	InputFiles
#B		B	F2	F3				Cond=="C1"
#C		C	F2;F3	F4