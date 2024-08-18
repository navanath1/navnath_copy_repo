pipeline {
    agent any
    parameters {
        string(name: 'STRING_PARAM', defaultValue: 'default', description: 'String to match')
    }
    stages {
        stage('String Matching Parameter') {
            steps {
                script {
                    // Access the Jenkins parameter
                    def stringParam = env.STRING_PARAM

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
