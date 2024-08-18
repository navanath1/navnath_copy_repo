pipeline {
    agent any
   
 
    stages {
        stage('String Matching Parameter') {
            steps {
                script {
                    // Access the Jenkins parameter
                    stringParam = env.string

                    // Use correct shell syntax for string comparison
                    sh """
                        if [ "${stringParam}" = "nitin" ]; then
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
