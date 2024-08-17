pipeline {
    agent any
    stages {
        stage('Backup jenkins server') {
            steps {
                tar -czvf jenkins-backup.tar.gz ${JENKINS_HOME}
                aws s3 cp jenkins-backup.tar.gz s3://jenkinsfilesbackup
            }
        }
    }
}

