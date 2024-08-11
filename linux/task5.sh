#!/bin/bash

if rpm -q tomcat &> /dev/null; then
  echo "Tomcat is already installed."
else
  echo "Installing Tomcat..."
  sudo yum install tomcat -y &> /dev/null
  echo "Tomcat installed successfully."
fi
