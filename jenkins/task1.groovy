pipeline {
    agent none

    stages {
        stage('SERVER DETAILS OF MASTER') {
            agent {
              label 'master'
            }
            steps {
                script {
                    echo "Memory usage details of master"

                    sh '''
                    Name=$(uname -a)
                    Memory_usage=$(free -h | awk 'NR==2 {print $2" memory total|"$3" memory used | "$3" memorty free "}')
                    Cpu_usage=$(mpstat)
                     Disk_usage=$(df -h | awk 'NR==5 {print $1" filename | "$2" filesize | "$3" fileconsumedsize |"$4" filesize avilable "}')


                  echo "server name : $Name"

                  echo "Memory usage details : $Memory_usage"

                    echo "cpu usage details: $Cpu_usage"

                    echo "Disk usage detaisl :$Disk_usage"

                    '''

                    }
                }
             } 
      stage('SERVER DETAILS OF NODES') {
            agent {
              label 'NODE1'
            }
            steps {
                script {
                    echo "Memory usage details of NODE1"

                    sh '''
                    Name=$(uname -a)
                    Memory_usage=$(free -h | awk 'NR==2 {print $2" memory total|"$3" memory used | "$3" memorty free "}')
                    Cpu_usage=$(mpstat)
                     Disk_usage=$(df -h | awk 'NR==5 {print $1" filename | "$2" filesize | "$3" fileconsumedsize |"$4" filesize avilable "}')


                    echo "server name : $Name"

                    echo "Memory usage details : $Memory_usage"

                    echo "cpu usage details: $Cpu_usage"

                    echo "Disk usage detaisl :$Disk_usage"
                    '''
                 }
              }
         }
     }
 }
             
             
