def call(Map file) {
 echo "its working working working working"
 echo "${file.war}"
 sh "sudo cp ${ file.war } /usr/share/tomcat/webapps"

  }
