#0	1	2	3	4	5	6	7	8	9	10	11	12	13
#task	parent	implementation	#threads	mem	formatIn	formatOut	groupingCrit	traversalCrit	cardIn	cardOut	multiInstance	Split	Merge	JEXL:shallProcess?	JEXL:
Root						FASTQ	None	ReadEnd
#SortAlignment		samtools	single	size(Reads)	BAM	BAM	None	Read	1	1	N	ByRead
#IndexAlignment	SortAlignment	samtools	single	low	BAM	BAI	None	None	1	1	N	None
#MergeSam		samtools	single	low	BAM,SAM	BAM,SAM	Readgroup	None	n	1	N	None	
#SplitSam		samtools	single	low	BAM,SAM	BAM,SAM	Readgroup	Locus	1	1	Y	None
#PrintReads		samtools	single	low	BAM	BAM	None	ReadFlagStatus,Contig,IntervalList	1	1	Y	ByContig,ByIntervalList,ByReadFlagStatus	None
IndexFasta	Root	samtools	single	medium	FASTA	FAI	None	None	1	1	N	None
BwtFasta	Root	bwa	single	medium	FASTA	BWT	None	None	1	1	N	None
DictFasta	Root	picard	single	medium	FASTA	DICT	None	None	1	1	N	None
BwtAlignShort	Root,BwtFasta	bwa	multi	low	FASTQ,FASTA	SAI	None	None	1	1	N	ByReadEnd	None	Platform=~["Illumina", "Solid", "Iontorrent"]
BwtAlignLong	Root,BwtFasta	bwa	multi	low	FASTQ,FASTA	SAM	None	None	1	1	N	ByRead	None	Platform=~["454","PacBio"]
Samse	BwtAlignShort,BwtFasta	bwa	single	low	FASTQ,FASTA,SAI	SAM	None	None	1	1	N	ByRead	None	size(InputFiles)==1
Sampe	BwtAlignShort,BwtFasta	bwa	single	low	FASTQ,FASTA,SAI	SAM	None	None	2	1	N	None	ByReadEnd	size(InputFiles)==2
AddReadgroup		picard	single	low	SAM	BAM	Readgroup	Read	1	n	N	ByRead
CreateRealignTargets	IndexAlignment,DictFasta	gatk	single	low	BAM	IntervalList	Sample	Locus	n	1	Y	ByLocus
LocalRealign		gatk	single	low	BAM,IntervalList	BAM	Sample	Locus	n	1	Y	ByLocus
RemoveDuplicates		picard	single	low	BAM	BAM	None	Library	1	1	Y	ByLibrary	None	size(InputFiles)==2
CountCovariate		gatk	multi	low	BAM	None	Readgroup	Locus	n	1	Y	ByReadgroup
RecalibrateBaseQualityScore	CountCovariate	gatk	single	low	BAM	BAM	Sample	Locus	n	1	Y	ByLocus,ByReadgroup,BySample
#CountCovariate	RecalibrateBaseQualityScore	gatk	multi	low	BAM	None	Readgroup	Locus	n	1	Y	ByReadgroup
DetectVariants		gatk	multi	low	BAM	VCF	Sample	Locus	n	1	Y	ByLocus
AnnotateVariants		gatk	single	low	BAM,VCF	VCF	Sample	Locus	n	1	Y	ByLocus
FilterVariants		gatk	single	low	VCF	VCF	Sample	Locus	n	1	Y	ByLocus
GenomicAnnotateVariants		gatk	single	low	VCF	VCF	Sample	Locus	n	1	Y	ByLocus
##examples
##BwtAlignShort
##
##
##SortAlignment multiInstance:N -> cannot sort by datacriterion Readgroup while maintaining readgroups (i.e. preserve order within each readgroup)
##DetectVariants: multiInstance:Y -> computes variants samplewise			traversalCrit: Locus->IntervalList and/or Contig can be used to restrict the processing 
##CountCovariate:		Y -> computes recalibration table readgroupwise		traversalCrit: locus is not applicable in a meaningful way, maybe Read criterion should be set
##LocalRealignment		Y -> realigns multiple samples (just preserve readgroup info/header)	traversalCrit: Contig
##RemoveDuplicates: 		Y -> maintains many libraries at the same time		traversalCrit: the only meaningful criterion can be library, however this is not realy effective in practice
##Split: split the input data in to smaller parts, grouping reads together by the specified
##criterion, in order to allow parallel processing (farming) 
##the criterion should be save with meaning to be able to combine the individual outputs at a later stage 
##Split: ByRead -> it is save to split the input data in to chunks of arbitrary reads
##Split: BySample -> it is save to split the data in to samples
##Split: ByLocus -> split data by applying either contig or intervalList
##traversal criterion seems to be the same as sort order
##
##need to define global inputs: reference fasta+index files
##				intervalFile(s)
##
