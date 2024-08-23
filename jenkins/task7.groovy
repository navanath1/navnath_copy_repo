pipeline {
    agent any

    stages {
        stage('build') {
            steps {
               
               script {
                    catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                       
                        echo 'Executing Stage 1'
                        error('Stage 1 failed ')
                    }
               }
            }
        }
        
      stage('test') {
            steps {
                echo 'testing is succefful'
            }
        }    
    }
} 
