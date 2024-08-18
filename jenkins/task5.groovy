pipeline {
    agent any

    stages {
        stage('DEBUG') {
            steps {
                script {
                  sh 'eho "nitin" || echo "this is nitin"'
                }
            }
        }
    }
}
