pipeline {
    agent any

    stages {
        stage('BACKUP') {
            steps {
                script {
                  sh 'aws s3 sync  /var/lib/jenkins/  s3://billx-server-bucket/Jenkins/ ' 

                  
                }
            }
        }
    }
}

