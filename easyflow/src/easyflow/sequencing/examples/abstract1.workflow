#0	1	2	3	4	5	6	7
#task	parent	implementation	formatIn	formatOut	groupingCriterion traversalExpression	JEXL:process_task?
Root				Format_R	Sample:joint,Library:joint
A		anyTool	Format_R	Format_A	Record	
B		anyTool	Format_R,Format_A	Format_B	Group
C		anyTool	Format_B	Format_C	Library
