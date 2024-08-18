pipeline {
    agent { label 'master' }

    stages {
        stage('Stage1') {
            steps {
                script {
                    try {
                        sh 'sudo yum install python3 -y'
                        sh 'python3 -c "print(\'nitin\')"'
                    } catch (Exception e) {
                        currentBuild.result = 'FAILURE'
                        error "Stage failed with exception: ${e}"
                    }
                }
            }
        }
    }
}
