def call(Map file) {
 
 sh "sudo cp ${ file.war } /usr/share/tomcat/webapps"
 sh "sudo cp ${ file.sample } /usr/share/tomcat/webapps"
  }
