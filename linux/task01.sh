#!/bin/bash

echo "Server Details:"
echo "Name: $(hostname)"
echo "Memory: $(free -h | awk 'NR==2 {print $2,$3,$4}')"
echo "CPU: $(uname -p)"
echo "Disk: $(df -h / | awk 'NR==2 {print $4}')"

# CPU utilization

ps -eo tid,pid,pcpu | sort -k 8 -r | head -10


