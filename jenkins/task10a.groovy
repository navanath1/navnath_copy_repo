pipeline {
    agent any

    stages {
        stage('Use Artifacts') {
            steps {
                
            
copyArtifacts( filter: 
      'artifact.txt, artifact2.txt', fingerprintArtifacts: true, projectName: 'task10.groovy', selector: lastSuccessful()

              )
                sh 'cat artifact.txt'
                sh 'cat artifact2.txt'
            }
        }
    }
}
