#!/bin/bash



echo "enter the username: "
read   name

echo "enter the username password: "
read  password


 if  [[ "$password" =~ ^[a-zA-Z0-9_]+$ ]]
        then
                       echo "valid alphanumeric username password"
   elif [[ "$password" =~ ^[a-zA-Z]+$ ]]
                  then
                       echo "valid upper+lowercase  password"
                   else
                   echo "password must be alphanumeric or upper+lowercase"
 fi

