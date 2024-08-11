#!/bin/bash


echo "enter the user name "
read name


 if  [[ "$name" =~ ^[A-Z0-9_]+$ ]]
       then

               if  [[ "$name" =~ ^[a-zA-Z0-9_]+$ ]]
                  then
                       echo "valid UPPERCASE string: $name"
                 else
                       echo "not a valid username must be uppercase"
               fi
  elif [[ "$name" =~ ^[a-zA-Z0-9_]+$ ]]
  then
          echo "echo valid username string : $name"
  elif [[ "$name" != *'  '* ]]
  then 
	  echo "used doent not contain spaces"

	else

        echo "user contain spaces found"
 fi

