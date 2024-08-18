pipeline {
    agent none

    stages {
        stage('stage1') {
            agent {
                label 'NODE1'
                  }
            steps {
                sh 'touch file1.txt'
                }
            }
 stage('stage2') {
            agent {
                label 'NODE1'
                  }
            steps {
                sh 'touch file2.txt'
                }
            } 
stage('stage3') {
            agent {
                label 'NODE1'
                  }
            steps {
                sh 'touch file3.txt'
                }
            } 
stage('stage4') {
            agent {
                label 'NODE1'
                  }
            steps {
                sh 'ls'
                }
            } 
stage('stage5') {
            agent {
                label 'NODE1'
                  }
            steps {
                deleteDir()
                }
            } 
   stage('stage6') {
            agent {
                label 'NODE2'
                  }
            steps {
                sh 'touch file4.txt'
                }
            }
 stage('stage7') {
            agent {
                label 'NODE2'
                  }
            steps {
                sh 'touch file5.txt'
                }
            } 
stage('stage8') {
            agent {
                label 'NODE2'
                  }
            steps {
                sh 'touch file6.txt'
                }
            } 
stage('stage9') {
            agent {
                label 'NODE2'
                  }
            steps {
                sh 'ls'
                }
            } 
stage('stage10') {
            agent {
                label 'NODE2'
                  }
            steps {
                deleteDir()
                }
            }      
    }
}
