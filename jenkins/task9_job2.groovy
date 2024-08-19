@Library(task9_job1)

pipeline {
    agent any
    stages {
        stage('Server Details') {
            steps {
                script {
                  sh 'echo "this is job9b using varable job9a ${job1}"'
                }
            }
        }
    }
}
