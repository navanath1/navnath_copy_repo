pipeline {
    agent any

    stages {
        stage('Stage 1') {
            steps {
                script {
                    try {
                        echo 'Executing Stage 1'
                        
                        sh 'exit 1'  
                    } catch (Exception e) {
                        echo "Caught an error in Stage 1: ${e.getMessage()}"
                    }
                }
            }
        }

        stage('Stage 2') {
            steps {
                echo 'Executing Stage 2'
                                sh 'echo Stage 2 completed successfully!'
            }
        }
    }
}
