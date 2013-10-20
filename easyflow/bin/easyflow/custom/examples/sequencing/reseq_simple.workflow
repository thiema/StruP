#0	1	2	3	4	5	6	7
#task	parent	implementation	formatIn	formatOut	groupingCriterion traversalExpression	JEXL:process_task?
Root				FASTQ
BwtAlignShort		bwa	FASTQ	SAI		ReadEnd:split	Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
BwtAlignLong		bwa	FASTQ	SAM			Platform=~["ROCHE", "454", "PACBIO", "CAPILLARY"]
Samse	BwtAlignShort	bwa	FASTQ,SAI	SAM			size(InputFiles)==1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
Sampe	BwtAlignShort	bwa	FASTQ,SAI	SAM		ReadEnd:merge	size(InputFiles)>1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
AddReadgroup		picard	SAM	BAM	Readgroup	Locus:split,ReadMappingFlag:split,Read:sort:Queryname
#RemoveDuplicates		picard	BAM	BAM	Library	Locus:merge	size(InputFiles)>1
DetectVariants		gatk	BAM	VCF	Group	Locus:merge,Read:sort:Coordinate	
######
##Helper Functions/Tasks which helps main tasks to be preprocessed(e.g. indexing, sorting, splitting, ...)
######
##SortSam	STATIC	samtools	BAM	BAM
##IndexSam	STATIC	samtools	BAM	BAI		Read:sort:Coordinate	
#MergeSam	STATIC	samtools	BAM,SAM	BAM,SAM	Readgroup	None	
#SplitSam	STATIC	samtools	BAM,SAM	BAM,SAM	Readgroup	Locus	
##PrintSam	STATIC	samtools	SAM || BAM	SAM || BAM
#ReadMappingFlag,Contig,IntervalList	
#IndexFasta	STATIC	samtools	FASTA	FAI	None	Read:Coordinate	
#BwtFasta	STATIC	bwa	FASTA	BWT	None	None	
#DictFasta	STATIC	picard	FASTA	DICT	None	None	