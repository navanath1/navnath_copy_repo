pipeline {
    agent { label 'master' }

    stages {
        stage('Stage1') {
            steps {
                script {
                    try {
                       sh'ech ""fail'
                    } catch (Exception e) {
                       sh "echo 'Stage failed with exception: ${e.message}'"// why " and ' doubt here && there is an blame option in above ?? && why my sh' echo "Stage failed with exception: ${e}"' did not work
                    }
                }
            }
        }
    }
}
