pipeline {
    agent {label "master"|| label"slave1"}

    stages {
        stage('DEBUG') {
            steps {
                script {
                  sh 'echo "this fails " || echo "this is runs using ||"'
                }
            }
        }
    }
}
