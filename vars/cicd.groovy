def gitDownload(repo)
{
      git "https://github.com/vamshikrisha/${repo}.git"
}
def mavenBuild()
{
    sh 'mvn package'
}
def deployTomcat(jobname,ip,context)
{
     sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@172.31.19.239:/var/lib/tomcat9/webapps/${context}.war"
}
runSelinium(jobname)
{
      sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
