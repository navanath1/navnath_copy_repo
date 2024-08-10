#!/bin/bash

echo "Enter the file name: "
read FILE_NAME

if [ -f "$FILE_NAME" ];
      then
	      echo "Number of lines : $(wc -l < "$FILE_NAME" ) "

	      echo "Number of words: $(wc -w < "$FILE_NAME" ) "

	      echo "Number of charc: $(wc -c < "$FILE_NAME" ) "

      else 
              echo "file is not found "

fi	      
	     
