@Library('share') _

pipeline {
    agent any
    stages {
        stage('Server Details') {
            steps {
                script {
                    def job1 =share.task9_job1.value()
                  sh 'echo "this is job9b using varable job9a ${job1}" '
                }
            }
        }
    }
}
