#!/bin/bash

echo "enter the file path :"
read path

echo "enter the filename:"
read filename

if [ -f "$path/$filename" ]
     then 
	     echo "echo file found :"$path/$filename""
     else
	     echo "echo file is not in $path "
fi
