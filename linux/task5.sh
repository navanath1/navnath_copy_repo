#1/bin/bash

if rpm -q tomcat &> dev/null;
     then
	    echo "tomcat is already installed"

     else 
	   yum install tomcat
	  echo"tomcat is installed sucefully"
fi 
