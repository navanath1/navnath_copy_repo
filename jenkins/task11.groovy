// pipeline {
//     agent none

//     stages {
//         try{
//             stage('1') {

//                 agent {label "slave1"}

//                 steps {
//                     script {
                        
//                             sh 'eco "this fails " || echo "this is runs using ||"'
//                     } 
//                 }
//             }
//         }

//         catch (e){ 
//                 sh 'echo "$(e)"'
//                 stage('2') {
//                     agent{label "master"}
//                     steps {
//                         script {
//                                 sh 'echo "this is master becasuse slave fails" '
//                             }
//                         }
//                     }
                        
//                 }
       
//     }
// }
// this will not work beacuse try catch in direct declartive
// three options
// 1
pipeline {
    agent none

    stages {
        stage('1') {
            agent { label "slave1" }
            steps {
                script {
                    // Intentionally causing a failure to test the catch
                    sh 'echo "this fails " || echo "this runs due to ||"'
                }
            }
        }
    }
    post {
        failure {
            // Handles failures in the previous stages
            stage('2') {
                agent { label "master" }
                steps {
                    script {
                        sh 'echo "This is running on the master because slave1 failed"'
                    }
                }
            }
        }
    }
}
// 2
