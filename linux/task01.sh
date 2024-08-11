#!/bin/bash

echo "Server Details:"
echo "Name: $(hostname)"
echo "Memory: $(free -h | awk 'NR==2 {print $2,$3,$4}')"
echo "CPU: $(uname -p)"
echo "Disk: $(df -h / | awk 'NR==2 {print $4}')"

