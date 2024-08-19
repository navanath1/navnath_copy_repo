pipeline {
    agent any

    stages {
        stage('Server Details') {
           
            steps {
                script {
                    job1="this is job1 variable"
                  sh ' echo "${job1}" '
                }
            }
        }
    }
}
