pipeline {
    agent any
@task9_job1
    stages {
        stage('Server Details') {
            steps {
                script {
                  sh 'echo "this is job9b using varable job9a ${job1}"'
                }
            }
        }
    }
}
