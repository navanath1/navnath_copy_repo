pipeline {
    agent any

    stages {
        stage('try catch sample') {
            steps {
                script {
                    try {
                        // Intentional typo in echo
                        sh 'eho "This is not working"' 
                    } catch (Exception e) {
                      
                        echo "Catch block shows the problem: ${e.message}"
                    }
                }
            }
        }
    }
}
