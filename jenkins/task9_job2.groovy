@Library('share') _

pipeline {
    agent any
    stages {
        stage('Server Details') {
            steps {
                script {
                    def job1 =share.task9.job1.getJob1Value()
                  sh 'echo "this is job9b using varable job9a ${job1}" '
                }
            }
        }
    }
}
