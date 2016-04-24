#!/bin/sh

## example call from within easyflow base director: scripts/transform_galaxy_definitions.sh ~/tools/galaxy-toolshed/tool_def/pavgi_picard/
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


BASEDIR=~/git/easyflow/easyflow/src/easyflow/custom;
if [ -z "$TARGETDIR" ]; then
	TARGETDIR=$BASEDIR/examples/reseq/tool_definitions/
	echo "using default target directory: $TARGETDIR" >&2
fi


if [ $CREATE_SEPARATE_DIR -eq 1 ]; then
	TARGETDIR=$TARGETDIR/$(basename $SOURCEDIR)
	mkdir -p $TARGETDIR
fi

#picard
options="source=history infer_option_from_help_attribute=false"
#gatk
options="source=history infer_option_from_help_attribute=true set_pkg_name=gatk"

for filename in $(ls $SOURCEDIR/*.xml); do
	echo "processing $filename..."
scripts/./transform_galaxy_definition.sh $filename \
		$TARGETDIR/$(basename $filename) \
		"$options"
		
done
