#0		1		2				3			4			5					6					7			8					9						10							11
#task	parent	implementation	formatIn	formatOut	groupingCriterion	parameterCriterion	preprocess	JEXL:process_task?	parameter definition	static params(opt)	static params(pos)
_root_				FASTQ	InputFiles:joint
BwtAlignShort		bwa_aln	Reads:FASTQ;Reference:FASTA	SAI	InputFiles	Param1:seed_length:values=[1,2]		Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]	max_queue_entries:10
BwtAlignLong		bwasw	FASTQ	SAM	InputFiles			Platform=~["ROCHE", "454", "PACBIO", "CAPILLARY"]
Samse	BwtAlignShort	bwa_xampe	FASTQ;SAI	SAM				size(InputFiles)==1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
Sampe	BwtAlignShort	bwa_xampe	FASTQ;SAI	SAM				size(InputFiles)>1&&Platform=~["ILLUMINA", "SOLID", "IONTORRENT"]
AddReadgroup		picard_ARRG	SAM	BAM	ReadGroup	
RealignerTargetCreator		gatk2_realigner_target_creator	BAM;BAI	gatk_interval	Group:joint		sort:Coordinate;index
RealignIndels		gatk2_indel_realigner	BAM;BAI;gatk_interval	BAM	Group:joint		sort:Coordinate;index
RmDup		samtools:rmdup	Alignment:BAM;BAI	BAM	Lib,Sample		sort;index
DetectVariants		gatk2_unified_genotyper	BAM;BAI	VCF	Group		;index	
######
##Helper Functions/Tasks which helps to (pre)process/prepare (e.g. indexing, sorting, splitting, ...) data 
## which are then processed further by the actual >>main<< task
######
SortSam	STATIC:sort	samtools:sort_sam	BAM	BAM
OrderSam	STATIC:order	samtools:sort_sam	BAM	BAM
IndexSam	STATIC:index	samtools:index_sam	BAM	BAI		Read:sort:Coordinate	
MergeSam	STATIC:merge	samtools:merge_sam	BAM,SAM	BAM,SAM	ReadGroup
PrintSam	STATIC:filter	samtools:view	BAM	BAM	ReadGroup