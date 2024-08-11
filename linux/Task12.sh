#!/bin/bash

files=(*)
file_count=${#files[@]}

echo "Number of files in the current directory: $file_count"

for file in "${files[@]}"; do
	if [ -f "$file" ]; then
        echo "Processing file: $file"
	fi
done

