#Root				FRO	Record
Root				FRO	Record:joint
A		TA	FRO	FAO	Record,Sample
B		TA	FAO	FBO	Group
B1		TA	FBO	FB1O	Sample
B2		TA	FB1O	FB2O	Sample
#C		TA	FBO	FCO	Record
#C		TA	FAO	FCO	Record
C		TA	FAO	FCO	Record,Sample
D		TA	FBO,FCO	FDO	Sample,Group
E		TA	FCO,FDO	FEO	Sample
#E		TA	FDO	FEO	Sample	TrA:split:InputFiles
#F		TA	FEO,FDO	FFO	Record	TrA:merge
F		TA	FEO	FFO	Record
G		TA	FFO	FGO	Group
