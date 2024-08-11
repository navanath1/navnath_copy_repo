pipeline {
    agent any

    stages {
        stage('Server Details') {
            steps {
                script {
                  sh 'aws s3 cp  /var/lib/jenkins  s3://billx-server-bucket --recusrsive'

                  
                }
            }
        }
    }
}

