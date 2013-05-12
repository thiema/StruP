#0	1	2	3	4	5	6	7
#task	parent	implementation	formatIn	formatOut	groupingCriterion traversalExpression	JEXL:process_task?
Root				Format_R1,Format_R2	Record:joint	
A1_Index		anyTool1	Format_R1	Format_A_Index	Record,Sample		size(InputFiles)==1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
#A2_Index		anyTool2	Format_R1	Format_A_Index	Record	Trav_A:split:InputFiles	size(InputFiles)==2&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
#A		anyTool	Format_R1,Format_A_Index	Format_A	Record,Sample		size(InputFiles)==1
A		anyTool	Format_R1,Format_A_Index	Format_A	Record		size(InputFiles)==1
#A		anyTool	Format_R1	Format_A	Sample	
#A		anyTool	Format_A_Index	Format_A	Sample
#B		tool_A	Format_A	Format_B	Sample		size(InputFiles)>1
B		tool_A	Format_A	Format_B	Record
#B1	SO	anyTool	Format_B	Format_B1		SO:coordinate
##C		tool_C	Format_B	Format_C	Record
#D		anyTool	Format_A	Format_D
#E		anyTool	Format_D,Format_A_index	Format_E	
#AB		anyTool	Format_C1	Format_E1		Trav_B:merge
#F		anyTool	Format_E1,Format_B1	Format_F	Group
#SO	STATIC	samtools	Format_B	Format_B
#grouping crit: <group>:[joint|batch]
#travesal crit: <trav>:(split|merge):[<Expression>]
#travesal crit_2: <parent>:(coordinate|queryname|...any crit the parent task understands (e.g. sort order)):[<Expression>]
#examples: Trav_A:split:InputFiles,SO:coordinate,Trav_A:merge