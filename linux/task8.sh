#!/bin/bash
read -p "Enter the username: " username
read -sp "Enter the password: " password
echo
if [[ $password =~ [A-Z] && $password =~ [a-z] && $password =~ [0-9] ]]; then
  echo "Valid"
else
  echo "Invalid"
fi

