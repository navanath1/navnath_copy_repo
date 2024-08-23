pipeline {
    agent any

    stages {
        stage('Install Maven') {
            steps {
                script {
                                        sh 'sudo yum install -y maven'
                   
                      }
                }
            }
        }
}
