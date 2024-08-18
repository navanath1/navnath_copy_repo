pipeline {
     agent none
      stages{
        stage('Build on NODE1 OR NODE2') {
          agent {
            label 'NODE1 || NODE2'
          }
          steps{
                    sh '''
                    echo "Building on $(NODE_NAME}"
                     '''
          }
        }
        stage('Test on NODE3 || NODE4') {
          agent {
            lable 'NODE3 || NODE4'
          }
          steps{
            sh '''
            echo "Testing on $(NODE_NAME)"
            '''
          }
       }
  }
}  
        
