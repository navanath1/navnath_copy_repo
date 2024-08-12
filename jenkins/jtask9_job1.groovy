pipeline {
    agent any

    stages {
        stage('Server Details') {
            steps {
                script {
                  sh 'SET n="job1"'
                }
            }
        }
    }
}
