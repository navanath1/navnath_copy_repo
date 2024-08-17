pipeline {
    agent any
    stages {
        stage('Backup jenkins server') {
            steps {
                sh "tar -czvf jenkins-backup.tar.gz ${JENKINS_HOME}"
                sh "aws s3 cp jenkins-backup.tar.gz s3://jenkinsfilesbackup"
            }
        }
    }
}
