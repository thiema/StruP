git add -u
git commit
git push -u origin --all

#push master branch -> head

#building
ant -f build/build.xml jar

#after doing the build, one can run the app as follows:
#output some info on loading/configureing the logger
#add curdir (point) to cp because of log4j.prop 
java -Dlog4j.debug -cp ".:build/jar/*"
easyflow.sequencing.examples.Easyflow
#the gui
java -cp ".:build/jar/*" easyflow.custom.jgraphx.editor.SchemaEditor

# apply xsl
java -cp "lib/saxon-8.7.jar" net.sf.saxon.Transform src/easyflow/custom/examples/sequencing/tool_definitions/depth_of_coverage.xml src/easyflow/custom/tool/schema/external/Galaxy.xsl
