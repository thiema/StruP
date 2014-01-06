#0		1		2				3			4			5					6					7
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	JEXL:process_task?
#Root				FASTQ	Record:joint
BwtAlignShort		bwa_aln	Reads:FASTQ;Reference:FASTA	SAI		ReadEnd:split;seed:[1,2]	Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
BwtAlignLong		bwasw	FASTQ	SAM			Platform=~["ROCHE", "454", "PACBIO", "CAPILLARY"]
Samse	BwtAlignShort	bwa_xampe	FASTQ;SAI	SAM			size(InputFiles)==1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
Sampe	BwtAlignShort	bwa_xampe	FASTQ;SAI	SAM		ReadEnd:merge	size(InputFiles)>1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
AddReadgroup		picard_ARRG	SAM	BAM	ReadGroup	Locus:split:chr1,chr2;ReadMappingFlag:split;Read:sort:Queryname
RealignIndels		gatk2_indel_realigner	BAM	BAM	Group
RemoveDuplicates		samtools:rmdup	Alignment:BAM	BAM	Library	Locus:merge	size(InputFiles)>1
#demonstrate situation with possibley multiple alternative paths due to JEXL (task requires certain metadata instances)
#DemonstrateJEXL1		any	BAM	BAM	
DetectVariants		gatk2_unified_genotyper	BAM	VCF	Group	Locus:merge;Read:sort:Coordinate
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