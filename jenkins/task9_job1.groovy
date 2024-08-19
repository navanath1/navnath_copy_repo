pipeline {
    agent any

    stages {
        stage('Server Details') {
           
            steps {
                script {
                    def value(){
                        return "hi"
                    }
                   
                }
            }
        }
    }
}
