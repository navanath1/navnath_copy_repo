// node {
//     agent any
    
//     stages {
//         try{
//             stage('try@stage1') {
//                 steps {
//                     script {
//                       sh 'eco "nitin"'
//                     }
//                 }
//             }
//         }
//         catch (Exception e) {
//             stage('catch@STAGE2') {
//                 steps {
//                     script {
//                       sh 'echo "this show error above stage ${e.message}"'
//                     }
//                 }
//             }
//              }
//     }
// }
// tried in shell not understanding trying in python

pipeline {
    agent {label 'master'}
    
    stages {
        try{
            stage('try@stage1') {
                steps {
                    script {
                      sh'sudo yum install python3 -y'
                      py'print("nitin")'
                    }
                }
            }
        }
        catch (Exception e) {
            stage('catch@STAGE2') {
                steps {
                    script {
                      py 'print(e)'
                }
            }
             }
    }
}
