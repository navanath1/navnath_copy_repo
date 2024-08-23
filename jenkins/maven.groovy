pipeline {
    agent any

    stages {
        stage('Install Maven') {
            steps {
                script {
                    if (!isMavenInstalled()) {
                        sh 'sudo yum install -y maven'
                        echo 'Maven installed successfully'
                    } else {
                        echo 'Maven already installed'
                    }
                }
            }
        }
    }
}

