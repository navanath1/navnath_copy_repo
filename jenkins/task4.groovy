pipeline {
    agent any
   
    stages {
        stage('String Matching Parameter') {
            steps {
                script {
                    // // Access the Jenkins parameter
                    // def stringParam = env.STRING_PARAM

                    // Use correct shell syntax for string comparison
                    sh """
                        if [ env.string = "nitin" ]; then
                            echo "correct"
                        else
                            echo "wrong"
                        fi
                    """
                }
            }
        }
    }
}
