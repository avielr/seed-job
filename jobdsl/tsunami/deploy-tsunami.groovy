pipelineJob('2.Deploy-glt-tsunami') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/avielr/tsunami-glt.git')
            }
          }
        }
        scriptPath("Jenkinsfile-deploy")
    }
  }
}