pipeline {
  ageny any 
       stages{
        stage('run on slave1') {
        agent {
          lable 'slave1'
             }
        steps{
          script{
            echo "running on node1 at `hostname` "
               }
            }
      retry(2){
        label 'slave2'
      }
    }
  }
}
