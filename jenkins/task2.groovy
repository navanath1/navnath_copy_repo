pipeline {
    agent any

    environment {
        BACKUP_DIR = 'jenkins_backup'
          }

    stages {
        stage('Backup') {
            steps {
                echo "The backup dir is $BACKUP_DIR and ${BACKUP_DIR}"
                sh '''
                sudo -S mkdir -p /$BACKUP_DIR
                tar -czf /${BACKUP_DIR}/jenkins_home_$(date +'%Y-%m-%d').tar.gz ${JENKINS_HOME}
                '''
            }
        }
    }
}
