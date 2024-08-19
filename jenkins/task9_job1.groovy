pipeline {
    agent any

    stages {
        stage('Server Details') {
            job1="this is job1 variable"
            steps {
                script {
                  sh ' echo "${job1}" '
                }
            }
        }
    }
}
