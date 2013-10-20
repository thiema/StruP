#0		1		2				3			4			5					6					7
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	JEXL:process_task?
#Root				FASTQ	Record:joint
BwtAlignShort		bwa_aln	FASTQ	SAI		ReadEnd:split	Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
BwtAlignLong		bwasw	FASTQ	SAM			Platform=~["ROCHE", "454", "PACBIO", "CAPILLARY"]
Samse	BwtAlignShort	bwa_xampe	FASTQ,SAI	SAM			size(InputFiles)==1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
Sampe	BwtAlignShort	bwa_xampe	FASTQ,SAI	SAM		ReadEnd:merge	size(InputFiles)>1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
AddReadgroup		picard_ARRG	SAM	BAM	ReadGroup	Locus:split,ReadMappingFlag:split,Read:sort:Queryname
RealignIndels		gatk2_indel_realigner	BAM	BAM	Group
RemoveDuplicates		samtools:rmdup	BAM	BAM	Library	Locus:merge	size(InputFiles)>1
DetectVariants		gatk2_unified_genotyper	BAM	VCF	Group	Locus:merge,Read:sort:Coordinate
######
##Helper Functions/Tasks which helps to (pre)process/prepare (e.g. indexing, sorting, splitting, ...) data 
## which are then processed further by the actual >>main<< task
######
##SortSam	STATIC	samtools	BAM	BAM
##IndexSam	STATIC	samtools	BAM	BAI		Read:sort:Coordinate	
#MergeSam	STATIC	samtools	BAM,SAM	BAM,SAM	ReadGroup	None	
#SplitSam	STATIC	samtools	BAM,SAM	BAM,SAM	ReadGroup	Locus	
##PrintSam	STATIC	samtools	SAM || BAM	SAM || BAM
#ReadMappingFlag,Contig,IntervalList	
#IndexFasta	STATIC	samtools	FASTA	FAI	None	Read:Coordinate	
#BwtFasta	STATIC	bwa	FASTA	BWT	None	None	
#DictFasta	STATIC	picard	FASTA	DICT	None	None	