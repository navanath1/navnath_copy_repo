pipeline {
    agent any

    stages {
        stage1('BACKUP') {
            steps {
                script {
                  sh 'aws s3 cp  /var/lib/jenkins/  s3://billx-server-bucket --recursive'

                  
                }
            }
        }
    }
}

