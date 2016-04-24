#!/bin/sh

in=$1
out=$2
#xsl=$3
options="$3"


xsl=src/easyflow/custom/tool/schema/external/Galaxy.xsl
SAXON_JAR=build/lib/saxon-8.7.jar
echo "java -cp \"$SAXON_JAR\" net.sf.saxon.Transform $in $xsl $options > $out"
java -cp "$SAXON_JAR" net.sf.saxon.Transform $in $xsl $options > $out
