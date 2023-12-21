def gitDownload(repo)
{
      git "https://github.com/vamshikrisha/${repo}.git"
}
def mavenBuild()
{
    sh 'mvn package'
}
