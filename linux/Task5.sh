#!/bin/bash

package="tomcat"

if dnf list installed "$package"; then
    echo "$package is already installed."
else
   
    echo "$package is installing"

     
    sudo yum install -y $package
fi
