pipeline {
    agent none

    stages {
        stage('Server Details of main ') {
            agent{label 'master'}
            steps {
                script {
                    echo ">>>>>>>>> Details of Hostname, Memory, CPU, Disk <<<<<<<<<<<"

                    sh '''
                        name=$(uname -n)
                        mem=$(free -h --total | awk '/^Total/ {print $1, $2}')
                        cpu=$(mpstat -T | awk 'NR==4 {print "CPU: " $3}')
                        dis=$(df -a -h --total | awk '/^total/ {print $1 ":" $2}')
                        
                        echo ">>>>>>>>>>>>>>> HOST NAME <<<<<<<<<<<<<<<<"
                        echo "$name"
                        
                        echo ">>>>>>>>>>>> MEMORY DETAILS <<<<<<<<<<<<<<"
                        echo "$mem"
                        
                        echo ">>>>>>>>>>>> CPU DETAILS <<<<<<<<<<<<<<<<<"
                        echo "$cpu"
                        
                        echo ">>>>>>>>>>>> DISK DETAILS <<<<<<<<<<<<<<<<<"
                        echo "$dis"
                    '''
                }
            }
        }

   stage('Server Details of salve') {
            agent{label 'slave1'}
            steps {
                script {
                    echo ">>>>>>>>> Details of Hostname, Memory, CPU, Disk <<<<<<<<<<<"

                    sh '''
                        name=$(uname -n)
                        mem=$(free -h --total | awk '/^Total/ {print $1, $2}')
                        cpu=$(mpstat -T | awk 'NR==4 {print "CPU: " $3}')
                        dis=$(df -a -h --total | awk '/^total/ {print $1 ":" $2}')
                        
                        echo ">>>>>>>>>>>>>>> HOST NAME <<<<<<<<<<<<<<<<"
                        echo "$name"
                        
                        echo ">>>>>>>>>>>> MEMORY DETAILS <<<<<<<<<<<<<<"
                        echo "$mem"
                        
                        echo ">>>>>>>>>>>> CPU DETAILS <<<<<<<<<<<<<<<<<"
                        echo "$cpu"
                        
                        echo ">>>>>>>>>>>> DISK DETAILS <<<<<<<<<<<<<<<<<"
                        echo "$dis"
                    '''
                }
            }
        }
        
    }
}
