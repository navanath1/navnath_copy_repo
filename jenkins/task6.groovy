pipeline {
    agent any
    
    stages {
        try{
            stage('try@stage1') {
                steps {
                    script {
                      sh 'eco "nitin"'
                    }
                }
            }
        }
        catch (Exception e) {
            stage('catch@STAGE2') {
                steps {
                    script {
                      sh 'echo "this show error above stage ${e.message}"'
                    }
                }
            }
             }
    }
}
