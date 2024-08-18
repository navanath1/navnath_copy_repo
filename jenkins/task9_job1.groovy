pipeline {
    agent any

    stages {
        stage('Server Details') {
            steps {
                script {
                  sh 'env.v1="this is v1 from job91"'
                }
            }
        }
    }
}
