pipeline {
    agent any

    stages {
        stage('DEBUG') {
            steps {
                script {
                  sh 'eho "this fails " || echo "this is runs using ||"'
                }
            }
        }
    }
}
