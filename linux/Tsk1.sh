#!/bin/bash
echo" print details of server"
nameinfo=$(uname -a)
memoryinfo=$(free -h)
diskinfo=$(df -h)
cpuInfo=$(lscpu)
echo "1  Server name : $nameinfo"
echo "2 memory information : $memoryinfo "
echo "3 diskinfo : $diskinfo "
echo "4 cpu Information : $cpuInfo "
