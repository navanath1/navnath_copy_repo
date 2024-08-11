#!/bin/bash


num_files=$(ls -1 | wc -l)


for ((i=1; i<=num_files; i++)); do
  
  echo  "File $i: $(ls | head -n $i | tail -n 1 )"
done


