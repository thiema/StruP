git add -u
git commit
git push -u origin --all


#building
ant -f build/build.xml jar

#after doing the build, one can run the app as follows:
#output some info on loading/configureing the logger
#add curdir (point) to cp because of log4j.prop 
java -Dlog4j.debug -cp ".:build/jar/*"
easyflow.sequencing.examples.Easyflow
#the gui
java -cp ".:build/jar/*" easyflow.custom.jgraphx.editor.SchemaEditor
