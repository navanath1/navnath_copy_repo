#!/bin/bash



IP4=$(ip addr show | grep "inet " | awk 'NR==2 {print $2}' | cut -d/ -f1)
IP6=$(ip addr show | grep "inet6 " | awk 'NR==2 {print $2}' | cut -d/ -f1)


  echo "Server IPV6 address: $IP6"

