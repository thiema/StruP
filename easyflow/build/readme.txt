# clone repository, e.g. using https
git clone https://thiema@bitbucket.org/thiema/easyflow.git git/
# using eclipse
import->from git with "as new java project wizard"
# resolve deps using ivy
# 
# fix build path (configure src dir, add external jars)
# 

git add -u
git commit
git push -u origin --all

#push: source ref: head -> dest ref: refs/heads/master

#building
ant -f build/build.xml jar

#after doing the build, one can run the app from with folder
#easyflow/build/ as follows:
#output some info on loading/configureing the logger
#add curdir (point) to cp because of log4j.prop 
java -Dlog4j.debug -cp ".:build/jar/*" easyflow.custom.ui.Easyflow
#the gui
java -cp ".:build/jar/*" easyflow.custom.jgraphx.editor.EasyFlowGraphEditor


# apply xsl
java -cp "lib/saxon-8.7.jar" net.sf.saxon.Transform src/easyflow/custom/examples/sequencing/tool_definitions/depth_of_coverage.xml src/easyflow/custom/tool/schema/external/Galaxy.xsl

java -cp ".:/home/heinz/Downloads/xalan-j_2_7_1/*" org.apache.xalan.xslt.Process -in ~/tools/galaxy-toolshed/tool_def/gatk2/unified_genotyper.xml -xsl src/easyflow/custom/tool/schema/external/Galaxy_xalan.xsl -out test.ug.xml -PARAM source history -PARAM infer_option_from_help_attribute true

#test regexps to define valid input/output data sets
echo -e "A,B\nB\nA,B\nB,A\nA,A,A\n" |perl -pe 's/(A,[AB,]+)/ $1 "found"/g'
echo -e "SAM,BAM\nBAM\nSAM,BAM\nBAM,SAM\nSAM,SAM,SAM\n" |perl -pe 's/(SAM,[(SAM)(BAM),]+)/ $1 "found"/g'
