pipeline {
    agent any

    stages {
        stage('try catch sample') {
            steps {
                script {
                    try {
                                sh 'eho "This is not waorking"' //wantedlly error in echo
                            }
                        
                    } catch (Exception e) {
                        echo "catch shows what is problem ${e.message}"

                    }
            }
                }
            }
        }
}
