pipeline {
    agent any

    stages {
     stage('All_tests'){
        parallel{              
            stage('stage1') {
            agent{
                label 'slave1'
                }
            steps {
                script {
                    sh 'touch file1.sh'
                       }
                 }
        }
        stage('stage2') {
            agent{
                label 'slave2'
                }
            steps {
                script {
                    sh 'touch file2.sh'
                       }
                 }
            }
         }
       }
    }
 }
        
