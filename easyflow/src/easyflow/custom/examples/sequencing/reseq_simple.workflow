#0		1		2				3			4			5					6					7			8
#task	parent	implementation	formatIn	formatOut	groupingCriterion	traversalExpression	preprocess	JEXL:process_task?
#Root				FASTQ	Record:joint
#BwtAlignShort		bwa_aln	Reads:FASTQ;Reference:FASTA	SAI		ReadEnd:input:metadata=InputFiles;Param1:seed:values=[1,2]		Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
BwtAlignShort		bwa_aln	Reads:FASTQ;Reference:FASTA	SAI		ReadEnd:input:metadata=InputFiles		Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
BwtAlignLong		bwasw	FASTQ	SAM				Platform=~["ROCHE", "454", "PACBIO", "CAPILLARY"]
Samse	BwtAlignShort	bwa_xampe	FASTQ;SAI	SAM		ReadEnd:input:merge		size(InputFiles)==1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
Sampe	BwtAlignShort	bwa_xampe	FASTQ;SAI	SAM		ReadEnd:input:merge		size(InputFiles)>1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
AddReadgroup		picard_ARRG	SAM	BAM	ReadGroup	
#Param2:Locus:values=[chr1,chr2];ReadMappingFlag:flag:split	sort:Queryname
RealignIndels		gatk2_indel_realigner	BAM	BAM	Group:joint		sort:Coordinate,index
RmDup		samtools:rmdup	Alignment:BAM	BAM	Lib,Sample	
#Param2:Locus:merge	sort:Coordinate,index
#	size(InputFiles)>1
#demonstrate situation with possibly multiple alternative paths due to JEXL (task requires certain metadata instances)
#DemonstrateJEXL1		any	BAM	BAM	
DetectVariants		gatk2_unified_genotyper	BAM	VCF	Group	
#Param2:Locus:merge	sort:Coordinate
######
##Helper Functions/Tasks which helps to (pre)process/prepare (e.g. indexing, sorting, splitting, ...) data 
## which are then processed further by the actual >>main<< task
######
SortSam	STATIC:sort	samtools:sort_sam	BAM	BAM
IndexSam	STATIC:index	samtools:index_sam	BAM	BAI		Read:sort:Coordinate	
MergeSam	STATIC:merge	samtools:merge_sam	BAM,SAM	BAM,SAM	ReadGroup
#SplitSam	STATIC	samtools:split	BAM,SAM	BAM,SAM	ReadGroup	
PrintSam	STATIC:filter	samtools:view	(SAM | BAM)	SAM || BAM
#ReadMappingFlag,Contig,IntervalList	
#IndexFasta	STATIC	samtools:index_fasta	FASTA	FAI		Read:Coordinate	
#BwtFasta	STATIC	bwa:index	FASTA	SAI		
#DictFasta	STATIC	picard:index	FASTA	DICT	