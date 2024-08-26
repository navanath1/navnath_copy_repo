pipeline {
    agent any

    stages {
        stage('Create artifacts') {
            steps {
                script {
                   
                    sh 'echo "Hello World" > artifact.txt'
                    sh 'echo "This is another artifact" > artifact2.txt'

                   
                    archiveArtifacts artifacts: 'artifact.txt, artifact2.txt'
                }
            }
        }
    }
}
