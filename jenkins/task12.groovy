pipeline {
    agent any

    stages {
     stage('All_tests'){
        parallel{              
            stage('m1') {
            agent{label 'master'}
            steps {
                script {
                  sh '''echo "1 from master" 
                        uname'''
                }
            }
        }
          stage('m2') {
            agent{label 'master'}
            steps {
                script {
                  sh '''echo "2 from master" 
                        uname'''
                }
            }
        }
          
          stage('m3') {
            agent{label 'master'}
            steps {
                script {
                  sh '''echo "3 from master" 
                        uname'''
                }
            }
        }
          stage('m4') {
            agent{label 'master'}
            steps {
                script {
                  sh '''echo "4 from master" 
                        uname'''
                }
            }
        }
          stage('m5') {
            agent{label 'master'}
            steps {
                script {
                  sh '''echo "5 from master" 
                        uname'''
                }
            }
        }
          stage('s1') {
            agent{label 'slave1'}
            steps {
                script {
                  sh '''echo "1 from slave" 
                        uname'''
                }
            }
        }
          stage('s2') {
            agent{label 'slave1'}
            steps {
                script {
                  sh '''echo "2 from slave" 
                        uname'''
                }
            }
        }
          stage('s3') {
            agent{label 'slave1'}
            steps {
                script {
                  sh '''echo "3 from salve " 
                        uname'''
                }
            }
        }
          stage('s4') {
            agent{label 'slave1'}
            steps {
                script {
                  sh '''echo "4 from salve " 
                        uname'''
                }
            }
        }
          stage('s5') {
            agent{label 'slave1'}
            steps {
                script {
                  sh '''echo "5 from salve " 
                        uname'''
                }
            }
        }
        }
     }  
        
    }
}
