pipeline {
    agent {label "master"||"slave1"}

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
