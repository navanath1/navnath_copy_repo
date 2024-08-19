pipeline {
    agent any

    stages {
        stage('Call Script') {
            steps {
                sh '''
                  source  /root/devops/git/7AM_Devops/jenkins/file.sh

                    echo "VARIABLE1: $variable1"

                    echo "VARIABLE2: $variable2"
                '''
            }
        
    }

