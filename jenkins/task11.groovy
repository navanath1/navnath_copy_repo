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
// warning here other place like decartive try  error will not work every in side stages,in script we can try catch and inside that we can use stages 
// but for offline we need to use timeout beacuse there is not way to check node is offline or not above code is the best way
// to find node offline 
