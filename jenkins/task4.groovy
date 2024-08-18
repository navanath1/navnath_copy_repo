pipeline {
    agent any
    stages {
        stage('String matching parameter') {
            steps {
                script {
                  sh '''if ["&string" -eq "nitin" ] then echo "correct" else echo "wrong" fi'''
                }
            }
        }
    }
}
