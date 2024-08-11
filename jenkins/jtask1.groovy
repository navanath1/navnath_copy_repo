pipeline {
    agent any

    stages {
        stage('Server Details') {
            steps {
                script {
                    echo ">>>>>>>>> Details of hostname, memory, CPU, disk <<<<<<<<<<<"

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
