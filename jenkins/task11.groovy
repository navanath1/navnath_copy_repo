pipeline {
    agent any

    stages {
        stage('1') {
            steps {
                script {
                    
                  //   try{
                  // sh 'eco "this fails " || echo "this is runs using ||"'}
                  //   catch (e){ 
                  //       sh 'echo "$(e)"'
                        
                  //   }
                    sh 'ec'
                }
            }
        }
          stage('2') {
            steps {
                script {
                  sh 'echo "this fails" '
                }
            }
        }
    }
}
