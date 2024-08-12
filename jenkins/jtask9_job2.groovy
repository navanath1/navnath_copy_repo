opipeline {
    agent any

    stages {
        stage('Server Details') {
            steps {
                script {
                  sh 'echo $n'
                }
            }
        }
    }
}
