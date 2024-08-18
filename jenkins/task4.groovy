pipeline {
    agent any

    stages {
        stage('Server Details') {
            steps {
                script {
                  sh '''if [&string -ee "nitin" ] then echo "correct" else echo "wrong" fi'''
                }
            }
        }
    }
}
