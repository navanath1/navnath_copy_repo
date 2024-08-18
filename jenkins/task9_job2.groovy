opipeline {
    agent any

    stages {
        stage('Server Details') {
            steps {
                script {
                  sh 'echo "this is job9b using varable job9a ${env.v1}"'
                }
            }
        }
    }
}
