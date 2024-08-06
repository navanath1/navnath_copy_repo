pipeline {
    agent any
    stages {
        stage('Retrieve Server Details') {
            steps {
                script {
                    echo "Retrieving CPU and Memory Information:"
                    def cpuInfo = sh(script: 'lscpu', returnStdout: true).trim()
                    def memoryInfo = sh(script: 'free -h', returnStdout: true).trim()
                    def systemInfo = sh(script: 'uname -a', returnStdout: true).trim()
                    echo "CPU Information:"
                    echo cpuInfo

                    echo "Memory Information:"
                    echo memoryInfo

                    echo "System Information:"
                    echo systemInfo
                }
            }
        }
    }
