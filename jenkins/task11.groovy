pipeline {
    agent none

    stages {
        stage('1') {

            agent {label "slave1"}

            steps {
                script {
                    try{
                        sh 'eco "this fails " || echo "this is runs using ||"'}
                    catch (e){ 
                        sh 'echo "$(e)"'
                        stage('2') {
                            agent{label "master"}
                            steps {
                                script {
                                sh 'echo "this is master becasuse slave fails" '
                                }
                            }
                        }
                        
                    }
                  
                }
            }
        }
         
    }
}
