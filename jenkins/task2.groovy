pipeline {
    agent any

    environment {
        JENKINS_HOME = '/var/lib/jenkins'
        BACKUP_DIR = '/var/backups/jenkins'
        BACKUP_FILE = 'jenkins_backup.tar.gz'
    }
   stages {
        stage('Backup Jenkins Server') {
            steps {
                script {
                    // Backup Jenkins home directory
                    sh "tar -czf ${BACKUP_DIR}/${BACKUP_FILE} ${JENKINS_HOME}"
                }
            }
        }
    }

