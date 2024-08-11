#!/bin/bash

rex='^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$'

ips=$(hostname -I)

for ip in $ips; do
    if [[ $ip =~ $rex ]]; then
        echo "Valid IPv4: $ip"
    fi
done

