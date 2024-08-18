pipeline {
    agent any

    parameters {
        string(name: 'USERNAME', defaultValue: '', description: 'Enter your username')
        choice(name: 'ENVIRONMENT', choices: ['devops', 'github', 'jenkins'], description: 'Select environment')
    }

    stages {
        stage('Validate Input') {
            steps {
                script {
                    if (params.USERNAME.isEmpty()) {
                        error 'Username is required'
                    }
                    if (params.ENVIRONMENT != 'devops' || params.ENVIRONMENT != 'github' || params.ENVIRONMENT != 'jenkins') {
                        error 'Invalid environment selected'
                    }
                }
            }
        }
        stage('Next Stage') {
            steps {
                echo "Username: ${params.USERNAME}"
                echo "Environment: ${params.ENVIRONMENT}"
            }
        }
    }
}
