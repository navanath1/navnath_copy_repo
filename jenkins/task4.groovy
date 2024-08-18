pipeline {
    agent any

    stages {
        stage('String matching parameter') {
            steps {
                script {
                  sh '''if [&string -ee "nitin" ] then echo "correct" else echo "wrong" fi'''
                }
            }
        }
    }
}
