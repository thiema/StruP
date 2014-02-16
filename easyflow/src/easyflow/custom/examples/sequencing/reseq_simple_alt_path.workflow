#0		1		2				3			4			5					6					7
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	JEXL:process_task?
BwtAlign		bwa_aln	Reads:FASTQ;Reference:FASTA	SAM		ReadEnd:split;seed:[1,2]	Platform=~["P1", "P2"]
ProcessA		t1	SAM	SAM			size(InputFiles)>1
ProcessB		t2	SAM	SAM			size(InputFiles)>2
ProcessC		t3	SAM	SAM
######
##Helper Functions/Tasks which helps to (pre)process/prepare (e.g. indexing, sorting, splitting, ...) data 
## which are then processed further by the actual >>main<< task
######
#SortSam	STATIC	samtools:sort	BAM	BAM
#IndexSam	STATIC	samtools:index	BAM	BAI		Read:sort:Coordinate	
MergeSam	STATIC:merge	samtools:merge	BAM,SAM	BAM,SAM	ReadGroup	
#SplitSam	STATIC	samtools:split	BAM,SAM	BAM,SAM	ReadGroup	
PrintSam	STATIC:filter	samtools:view	(SAM | BAM)	SAM || BAM
#ReadMappingFlag,Contig,IntervalList	
#IndexFasta	STATIC	samtools:indexFasta	FASTA	FAI		Read:Coordinate	
#BwtFasta	STATIC	bwa:index	FASTA	SAI		
#DictFasta	STATIC	picard:index	FASTA	DICT	