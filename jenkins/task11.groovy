pipeline {
    agent none

    stages {
        stage('Build on slave1 or fallback to master') {
            steps {
                script {
                    try {
                        timeout(time: 10, unit: 'SECONDS') {
                            node('slave1') {
                                echo "Running on slave1"
                                sh 'echo "This is running on slave1"'
                            }
                        }
                    } catch (Exception e) {
                        echo "slave1 is unavailable, falling back to master"
                        node('master') {
                            echo "Running on master"
                            sh 'echo "This is running on master as a fallback"'
                        }
                    }
                }
            }
        }
    }
}
