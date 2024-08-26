pipeline {
    agent any

    stages {
        stage('Create artifacts') {
            steps {
                script {
                     def offset = "-"

                    // Get the current date and time in the desired format
                    def dateTime = new Date().format("yyyy-MM-dd HH:mm:ss")

                    // Check the current build result
                    if (currentBuild.result == null || currentBuild.result == 'SUCCESS' ) {
                        // Set the display name for a successful build
                        currentBuild.displayName =  (currentBuild.number + offset) + "pass" + " - " + dateTime
                    } else {
                        // Set the display name for a failed build
                        currentBuild.displayName =  (currentBuild.number + offset) + "fail" + " - " + dateTime
                   
                    sh 'echo "Hello World" > artifact.txt'
                    sh 'echo "This is another artifact" > artifact2.txt'

                   
                    archiveArtifacts artifacts: 'artifact.txt, artifact2.txt'
                }
            }
        }
    }
}
