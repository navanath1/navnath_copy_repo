// // pipeline {
// //     agent none

// //     stages {
// //         try{
// //             stage('1') {

// //                 agent {label "slave1"}

// //                 steps {
// //                     script {
                        
// //                             sh 'eco "this fails " || echo "this is runs using ||"'
// //                     } 
// //                 }
// //             }
// //         }

// //         catch (e){ 
// //                 sh 'echo "$(e)"'
// //                 stage('2') {
// //                     agent{label "master"}
// //                     steps {
// //                         script {
// //                                 sh 'echo "this is master becasuse slave fails" '
// //                             }
// //                         }
// //                     }
                        
// //                 }
       
// //     }
// // }
// // this will not work beacuse try catch in direct declartive
// // three options
// // 1
// pipeline {
//     agent none

//     stages {
//         stage('1') {
//             agent { label "slave1" }
//             steps {
//                 script {
//                     // Intentionally causing a failure to test the catch
//                     sh 'echo "this fails " || echo "this runs due to ||"'
//                 }
//             }
//         }
//     }
    
//     post {
//         failure {
//             agent { label "master" }
//             steps {
//                 sh 'echo "This is running on the master because slave1 failed"'
//             }
//         }
//     }
// }

// // 2



pipeline {
    agent none

    stages {
        stage('Build on slave1 or fallback to master') {
            steps {
                script {
                    try {
                        node('slave1') {
                            echo "Running on slave1"
                            sh 'echo "This is running on slave1"'
                        }
                    } catch (Exception e) {
                        echo "slave1 is unavailable, falling back to master"
                        node('master') {
                            echo "Running on master"
                            sh 'echo "This is running on master as a fallback"'
                        }
                    }
                }
            }
        }
    }
}





























