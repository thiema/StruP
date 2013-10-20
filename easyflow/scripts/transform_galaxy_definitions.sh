#!/bin/sh

CREATE_SEPARATE_DIR=1
SOURCEDIR=$1
TARGETDIR=$2
if [ -z "$SOURCEDIR" ]; then
	echo "Please provide directory of galaxy tool definition files !"
	exit 1
elif [ ! -d "$SOURCEDIR" ]; then
	echo "$SOURCEDIR is not a valid directory !"
	exit 1
fi


SAXON_JAR=build/lib/saxon-8.7.jar
BASEDIR=~/git/easyflow/easyflow/src/easyflow/custom/;
if [ -z "$TARGETDIR" ]; then
	TARGETDIR=$BASEDIR/examples/sequencing/tool_definitions/
	echo "using default target directory: $TARGETDIR" >&2
fi


if [ $CREATE_SEPARATE_DIR -eq 1 ]; then
	TARGETDIR=$TARGETDIR/$(basename $SOURCEDIR)
	mkdir -p $TARGETDIR
	
fi
for filename in $(ls $SOURCEDIR/*.xml); do
	echo "processing $filename..."
	java -cp "$SAXON_JAR" net.sf.saxon.Transform \
		$filename \
		$BASEDIR/tool/schema/external/Galaxy.xsl \
		source=history infer_option_from_help_attribute=true \
		> $TARGETDIR/$(basename $filename)
		
done