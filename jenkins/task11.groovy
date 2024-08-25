pipeline {
    agent none

    stages {
        stage('Run on NODE1') {
            agent { label 'NODE1' }
            steps {
                script {
                    echo "Running on NODE1"
                    sh 'exit 1' // Simulate failure on NODE1
                }
            }
            post {
                failure {
                    echo "NODE1 failed, running on NODE2"
                    currentBuild.result = 'UNSTABLE'
                }
            }
        }
        stage('Run on NODE2') {
            agent { label 'NODE2' }
            steps {
                script {
                    echo "Running on NODE2"
                }
            }
        }
    }
}
