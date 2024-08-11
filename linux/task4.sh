#!/bin/bash

java_files=$(find . -type f -name "*.java")

count=$(echo "$java_files" | wc -l)

for ((i=1; i<=$count; i++));
     do

         file_path=$(echo "$java_files" | sed -n "$i p")

     if [ $(find "$file_path" -mtime -10 -print -quit) ];
     then
    echo "File modified in last 10 days: $file_path"
     fi
done


